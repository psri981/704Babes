import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class POS_Controller extends ClockDomain{
  public POS_Controller(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal orderDone = new Signal("orderDone", Signal.INPUT);
  public Signal liquidMixOutput = new Signal("liquidMixOutput", Signal.INPUT);
  public Signal bottleQuantityOutput = new Signal("bottleQuantityOutput", Signal.INPUT);
  public Signal orderDoneFlag = new Signal("orderDoneFlag", Signal.OUTPUT);
  private int S102 = 1;
  
  private int[] ends = new int[3];
  private int[] tdone = new int[3];
  
  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S102){
        case 0 : 
          S102=0;
          break RUN;
        
        case 1 : 
          S102=2;
          S102=2;
          if(orderDone.getprestatus()){//sysj\controller.sysj line: 44, column: 11
            orderDoneFlag.setPresent();//sysj\controller.sysj line: 45, column: 4
            currsigs.addElement(orderDoneFlag);
            System.out.println("Order is completed");//sysj\controller.sysj line: 46, column: 4
            active[2]=1;
            ends[2]=1;
            break RUN;
          }
          else {
            active[2]=1;
            ends[2]=1;
            break RUN;
          }
        
        case 2 : 
          if(orderDone.getprestatus()){//sysj\controller.sysj line: 44, column: 11
            orderDoneFlag.setPresent();//sysj\controller.sysj line: 45, column: 4
            currsigs.addElement(orderDoneFlag);
            System.out.println("Order is completed");//sysj\controller.sysj line: 46, column: 4
            active[2]=1;
            ends[2]=1;
            break RUN;
          }
          else {
            active[2]=1;
            ends[2]=1;
            break RUN;
          }
        
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
    while(active[2] != 0){
      int index = 2;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[2]!=0 || suspended[2]!=0 || active[2]!=1);
      else{
        if(!df){
          orderDone.gethook();
          liquidMixOutput.gethook();
          bottleQuantityOutput.gethook();
          df = true;
        }
        runClockDomain();
      }
      orderDone.setpreclear();
      liquidMixOutput.setpreclear();
      bottleQuantityOutput.setpreclear();
      orderDoneFlag.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = orderDone.getStatus() ? orderDone.setprepresent() : orderDone.setpreclear();
      orderDone.setpreval(orderDone.getValue());
      orderDone.setClear();
      dummyint = liquidMixOutput.getStatus() ? liquidMixOutput.setprepresent() : liquidMixOutput.setpreclear();
      liquidMixOutput.setpreval(liquidMixOutput.getValue());
      liquidMixOutput.setClear();
      dummyint = bottleQuantityOutput.getStatus() ? bottleQuantityOutput.setprepresent() : bottleQuantityOutput.setpreclear();
      bottleQuantityOutput.setpreval(bottleQuantityOutput.getValue());
      bottleQuantityOutput.setClear();
      orderDoneFlag.sethook();
      orderDoneFlag.setClear();
      if(paused[2]!=0 || suspended[2]!=0 || active[2]!=1);
      else{
        orderDone.gethook();
        liquidMixOutput.gethook();
        bottleQuantityOutput.gethook();
      }
      runFinisher();
      if(active[2] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
