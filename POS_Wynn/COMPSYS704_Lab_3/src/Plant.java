import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import run.GUI;//sysj\plant.sysj line: 1, column: 1

public class Plant extends ClockDomain{
  public Plant(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal orderStart = new Signal("orderStart", Signal.INPUT);
  public Signal orderDoneFlag = new Signal("orderDoneFlag", Signal.INPUT);
  public Signal liquidMix = new Signal("liquidMix", Signal.INPUT);
  public Signal bottleQuantity = new Signal("bottleQuantity", Signal.INPUT);
  public Signal orderDoneGUIFlag = new Signal("orderDoneGUIFlag", Signal.OUTPUT);
  public Signal liquidMixOutput = new Signal("liquidMixOutput", Signal.OUTPUT);
  public Signal bottleQuantityOutput = new Signal("bottleQuantityOutput", Signal.OUTPUT);
  private Integer y_thread_2;//sysj\plant.sysj line: 22, column: 5
  private String x_thread_2;//sysj\plant.sysj line: 23, column: 5
  private int S51 = 1;
  private int S22 = 1;
  private int S30 = 1;
  
  private int[] ends = new int[4];
  private int[] tdone = new int[4];
  
  public void thread57(int [] tdone, int [] ends){
        switch(S30){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        if(orderDoneFlag.getprestatus()){//sysj\plant.sysj line: 38, column: 24
          orderDoneGUIFlag.setPresent();//sysj\plant.sysj line: 38, column: 39
          currsigs.addElement(orderDoneGUIFlag);
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        else {
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread56(int [] tdone, int [] ends){
        switch(S22){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        if(orderStart.getprestatus()){//sysj\plant.sysj line: 21, column: 12
                              y_thread_2 = (bottleQuantity.getpreval() == null ? null : ((Integer)bottleQuantity.getpreval()));//sysj\plant.sysj line: 25, column: 5
          x_thread_2 = (liquidMix.getpreval() == null ? null : ((String)liquidMix.getpreval()));//sysj\plant.sysj line: 26, column: 5
          System.out.println("Bottle Quantity: " + y_thread_2);//sysj\plant.sysj line: 28, column: 5
          System.out.println("Liquid Mix: " + x_thread_2);//sysj\plant.sysj line: 29, column: 5
          liquidMixOutput.setPresent();//sysj\plant.sysj line: 30, column: 5
          currsigs.addElement(liquidMixOutput);
          bottleQuantityOutput.setPresent();//sysj\plant.sysj line: 31, column: 5
          currsigs.addElement(bottleQuantityOutput);
          active[2]=1;
          ends[2]=1;
          tdone[2]=1;
        }
        else {
          active[2]=1;
          ends[2]=1;
          tdone[2]=1;
        }
        break;
      
    }
  }

  public void thread54(int [] tdone, int [] ends){
        S30=1;
    if(orderDoneFlag.getprestatus()){//sysj\plant.sysj line: 38, column: 24
      orderDoneGUIFlag.setPresent();//sysj\plant.sysj line: 38, column: 39
      currsigs.addElement(orderDoneGUIFlag);
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread53(int [] tdone, int [] ends){
        S22=1;
    if(orderStart.getprestatus()){//sysj\plant.sysj line: 21, column: 12
                  y_thread_2 = (bottleQuantity.getpreval() == null ? null : ((Integer)bottleQuantity.getpreval()));//sysj\plant.sysj line: 25, column: 5
      x_thread_2 = (liquidMix.getpreval() == null ? null : ((String)liquidMix.getpreval()));//sysj\plant.sysj line: 26, column: 5
      System.out.println("Bottle Quantity: " + y_thread_2);//sysj\plant.sysj line: 28, column: 5
      System.out.println("Liquid Mix: " + x_thread_2);//sysj\plant.sysj line: 29, column: 5
      liquidMixOutput.setPresent();//sysj\plant.sysj line: 30, column: 5
      currsigs.addElement(liquidMixOutput);
      bottleQuantityOutput.setPresent();//sysj\plant.sysj line: 31, column: 5
      currsigs.addElement(bottleQuantityOutput);
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S51){
        case 0 : 
          S51=0;
          break RUN;
        
        case 1 : 
          S51=2;
          S51=2;
          new Thread(new GUI()).start();//sysj\plant.sysj line: 17, column: 2
          thread53(tdone,ends);
          thread54(tdone,ends);
          int biggest55 = 0;
          if(ends[2]>=biggest55){
            biggest55=ends[2];
          }
          if(ends[3]>=biggest55){
            biggest55=ends[3];
          }
          if(biggest55 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread56(tdone,ends);
          thread57(tdone,ends);
          int biggest58 = 0;
          if(ends[2]>=biggest58){
            biggest58=ends[2];
          }
          if(ends[3]>=biggest58){
            biggest58=ends[3];
          }
          if(biggest58 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest58 == 0){
            S51=0;
            active[1]=0;
            ends[1]=0;
            S51=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0};
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
          orderStart.gethook();
          orderDoneFlag.gethook();
          liquidMix.gethook();
          bottleQuantity.gethook();
          df = true;
        }
        runClockDomain();
      }
      orderStart.setpreclear();
      orderDoneFlag.setpreclear();
      liquidMix.setpreclear();
      bottleQuantity.setpreclear();
      orderDoneGUIFlag.setpreclear();
      liquidMixOutput.setpreclear();
      bottleQuantityOutput.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = orderStart.getStatus() ? orderStart.setprepresent() : orderStart.setpreclear();
      orderStart.setpreval(orderStart.getValue());
      orderStart.setClear();
      dummyint = orderDoneFlag.getStatus() ? orderDoneFlag.setprepresent() : orderDoneFlag.setpreclear();
      orderDoneFlag.setpreval(orderDoneFlag.getValue());
      orderDoneFlag.setClear();
      dummyint = liquidMix.getStatus() ? liquidMix.setprepresent() : liquidMix.setpreclear();
      liquidMix.setpreval(liquidMix.getValue());
      liquidMix.setClear();
      dummyint = bottleQuantity.getStatus() ? bottleQuantity.setprepresent() : bottleQuantity.setpreclear();
      bottleQuantity.setpreval(bottleQuantity.getValue());
      bottleQuantity.setClear();
      orderDoneGUIFlag.sethook();
      orderDoneGUIFlag.setClear();
      liquidMixOutput.sethook();
      liquidMixOutput.setClear();
      bottleQuantityOutput.sethook();
      bottleQuantityOutput.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        orderStart.gethook();
        orderDoneFlag.gethook();
        liquidMix.gethook();
        bottleQuantity.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
