import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class Controller extends ClockDomain{
  public Controller(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal capOnPos1 = new Signal("capOnPos1", Signal.INPUT);
  public Signal tableAligned = new Signal("tableAligned", Signal.INPUT);
  public Signal botPos1 = new Signal("botPos1", Signal.INPUT);
  public Signal botPos2 = new Signal("botPos2", Signal.INPUT);
  public Signal botPos3 = new Signal("botPos3", Signal.INPUT);
  public Signal botPos4 = new Signal("botPos4", Signal.INPUT);
  public Signal botPos5 = new Signal("botPos5", Signal.INPUT);
  public Signal bottleAtPos1 = new Signal("bottleAtPos1", Signal.OUTPUT);
  public Signal bottleAtPos2 = new Signal("bottleAtPos2", Signal.OUTPUT);
  public Signal bottleAtPos3 = new Signal("bottleAtPos3", Signal.OUTPUT);
  public Signal bottleAtPos4 = new Signal("bottleAtPos4", Signal.OUTPUT);
  public Signal bottleAtPos5 = new Signal("bottleAtPos5", Signal.OUTPUT);
  private int S91 = 1;
  
  private int[] ends = new int[3];
  private int[] tdone = new int[3];
  
  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S91){
        case 0 : 
          S91=0;
          break RUN;
        
        case 1 : 
          S91=2;
          S91=2;
          bottleAtPos1.setPresent();//sysj\controller.sysj line: 11, column: 4
          currsigs.addElement(bottleAtPos1);
          bottleAtPos2.setPresent();//sysj\controller.sysj line: 15, column: 4
          currsigs.addElement(bottleAtPos2);
          bottleAtPos3.setPresent();//sysj\controller.sysj line: 19, column: 4
          currsigs.addElement(bottleAtPos3);
          bottleAtPos4.setPresent();//sysj\controller.sysj line: 23, column: 4
          currsigs.addElement(bottleAtPos4);
          bottleAtPos5.setPresent();//sysj\controller.sysj line: 27, column: 4
          currsigs.addElement(bottleAtPos5);
          active[1]=1;
          ends[1]=1;
          break RUN;
        
        case 2 : 
          bottleAtPos1.setPresent();//sysj\controller.sysj line: 11, column: 4
          currsigs.addElement(bottleAtPos1);
          bottleAtPos2.setPresent();//sysj\controller.sysj line: 15, column: 4
          currsigs.addElement(bottleAtPos2);
          bottleAtPos3.setPresent();//sysj\controller.sysj line: 19, column: 4
          currsigs.addElement(bottleAtPos3);
          bottleAtPos4.setPresent();//sysj\controller.sysj line: 23, column: 4
          currsigs.addElement(bottleAtPos4);
          bottleAtPos5.setPresent();//sysj\controller.sysj line: 27, column: 4
          currsigs.addElement(bottleAtPos5);
          active[1]=1;
          ends[1]=1;
          break RUN;
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1};
    char [] paused1 = {0, 0, 0};
    char [] suspended1 = {0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[1] != 0){
      int index = 1;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        if(!df){
          capOnPos1.gethook();
          tableAligned.gethook();
          botPos1.gethook();
          botPos2.gethook();
          botPos3.gethook();
          botPos4.gethook();
          botPos5.gethook();
          df = true;
        }
        runClockDomain();
      }
      capOnPos1.setpreclear();
      tableAligned.setpreclear();
      botPos1.setpreclear();
      botPos2.setpreclear();
      botPos3.setpreclear();
      botPos4.setpreclear();
      botPos5.setpreclear();
      bottleAtPos1.setpreclear();
      bottleAtPos2.setpreclear();
      bottleAtPos3.setpreclear();
      bottleAtPos4.setpreclear();
      bottleAtPos5.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = capOnPos1.getStatus() ? capOnPos1.setprepresent() : capOnPos1.setpreclear();
      capOnPos1.setpreval(capOnPos1.getValue());
      capOnPos1.setClear();
      dummyint = tableAligned.getStatus() ? tableAligned.setprepresent() : tableAligned.setpreclear();
      tableAligned.setpreval(tableAligned.getValue());
      tableAligned.setClear();
      dummyint = botPos1.getStatus() ? botPos1.setprepresent() : botPos1.setpreclear();
      botPos1.setpreval(botPos1.getValue());
      botPos1.setClear();
      dummyint = botPos2.getStatus() ? botPos2.setprepresent() : botPos2.setpreclear();
      botPos2.setpreval(botPos2.getValue());
      botPos2.setClear();
      dummyint = botPos3.getStatus() ? botPos3.setprepresent() : botPos3.setpreclear();
      botPos3.setpreval(botPos3.getValue());
      botPos3.setClear();
      dummyint = botPos4.getStatus() ? botPos4.setprepresent() : botPos4.setpreclear();
      botPos4.setpreval(botPos4.getValue());
      botPos4.setClear();
      dummyint = botPos5.getStatus() ? botPos5.setprepresent() : botPos5.setpreclear();
      botPos5.setpreval(botPos5.getValue());
      botPos5.setClear();
      bottleAtPos1.sethook();
      bottleAtPos1.setClear();
      bottleAtPos2.sethook();
      bottleAtPos2.setClear();
      bottleAtPos3.sethook();
      bottleAtPos3.setClear();
      bottleAtPos4.sethook();
      bottleAtPos4.setClear();
      bottleAtPos5.sethook();
      bottleAtPos5.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        capOnPos1.gethook();
        tableAligned.gethook();
        botPos1.gethook();
        botPos2.gethook();
        botPos3.gethook();
        botPos4.gethook();
        botPos5.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
