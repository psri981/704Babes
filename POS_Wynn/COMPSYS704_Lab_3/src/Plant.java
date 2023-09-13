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
  public Signal capOnBottleAtPos1 = new Signal("capOnBottleAtPos1", Signal.INPUT);
  public Signal tableAlignedWithSensor = new Signal("tableAlignedWithSensor", Signal.INPUT);
  public Signal bottleAtPos1 = new Signal("bottleAtPos1", Signal.INPUT);
  public Signal bottleAtPos2 = new Signal("bottleAtPos2", Signal.INPUT);
  public Signal bottleAtPos3 = new Signal("bottleAtPos3", Signal.INPUT);
  public Signal bottleAtPos4 = new Signal("bottleAtPos4", Signal.INPUT);
  public Signal bottleAtPos5 = new Signal("bottleAtPos5", Signal.INPUT);
  public Signal orderStart = new Signal("orderStart", Signal.INPUT);
  public Signal liquidMix = new Signal("liquidMix", Signal.INPUT);
  public Signal bottleQuantity = new Signal("bottleQuantity", Signal.INPUT);
  public Signal capOnPos1 = new Signal("capOnPos1", Signal.OUTPUT);
  public Signal tableAligned = new Signal("tableAligned", Signal.OUTPUT);
  public Signal botPos1 = new Signal("botPos1", Signal.OUTPUT);
  public Signal botPos2 = new Signal("botPos2", Signal.OUTPUT);
  public Signal botPos3 = new Signal("botPos3", Signal.OUTPUT);
  public Signal botPos4 = new Signal("botPos4", Signal.OUTPUT);
  public Signal botPos5 = new Signal("botPos5", Signal.OUTPUT);
  public Signal conBeltTriggerE = new Signal("conBeltTriggerE", Signal.OUTPUT);
  public Signal fillerTriggerE = new Signal("fillerTriggerE", Signal.OUTPUT);
  public Signal lidloaderTriggerE = new Signal("lidloaderTriggerE", Signal.OUTPUT);
  public Signal capScrewTriggerE = new Signal("capScrewTriggerE", Signal.OUTPUT);
  public Signal labelTriggerE = new Signal("labelTriggerE", Signal.OUTPUT);
  private Integer y_thread_2;//sysj\plant.sysj line: 18, column: 5
  private String x_thread_2;//sysj\plant.sysj line: 19, column: 5
  private int S200 = 1;
  private int S103 = 1;
  private int S145 = 1;
  private int S111 = 1;
  private int S119 = 1;
  private int S127 = 1;
  private int S135 = 1;
  private int S143 = 1;
  
  private int[] ends = new int[9];
  private int[] tdone = new int[9];
  
  public void thread217(int [] tdone, int [] ends){
        switch(S143){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(botPos5.getprestatus()){//sysj\plant.sysj line: 40, column: 24
          labelTriggerE.setPresent();//sysj\plant.sysj line: 40, column: 33
          currsigs.addElement(labelTriggerE);
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        else {
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        break;
      
    }
  }

  public void thread216(int [] tdone, int [] ends){
        switch(S135){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(botPos4.getprestatus()){//sysj\plant.sysj line: 38, column: 24
          capScrewTriggerE.setPresent();//sysj\plant.sysj line: 38, column: 33
          currsigs.addElement(capScrewTriggerE);
          active[7]=1;
          ends[7]=1;
          tdone[7]=1;
        }
        else {
          active[7]=1;
          ends[7]=1;
          tdone[7]=1;
        }
        break;
      
    }
  }

  public void thread215(int [] tdone, int [] ends){
        switch(S127){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(botPos3.getprestatus()){//sysj\plant.sysj line: 36, column: 24
          lidloaderTriggerE.setPresent();//sysj\plant.sysj line: 36, column: 33
          currsigs.addElement(lidloaderTriggerE);
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        else {
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        break;
      
    }
  }

  public void thread214(int [] tdone, int [] ends){
        switch(S119){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(botPos2.getprestatus()){//sysj\plant.sysj line: 34, column: 24
          fillerTriggerE.setPresent();//sysj\plant.sysj line: 34, column: 33
          currsigs.addElement(fillerTriggerE);
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        else {
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        break;
      
    }
  }

  public void thread213(int [] tdone, int [] ends){
        switch(S111){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        if(botPos1.getprestatus()){//sysj\plant.sysj line: 32, column: 24
          conBeltTriggerE.setPresent();//sysj\plant.sysj line: 32, column: 33
          currsigs.addElement(conBeltTriggerE);
          active[4]=1;
          ends[4]=1;
          tdone[4]=1;
        }
        else {
          active[4]=1;
          ends[4]=1;
          tdone[4]=1;
        }
        break;
      
    }
  }

  public void thread212(int [] tdone, int [] ends){
        switch(S145){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        thread213(tdone,ends);
        thread214(tdone,ends);
        thread215(tdone,ends);
        thread216(tdone,ends);
        thread217(tdone,ends);
        int biggest218 = 0;
        if(ends[4]>=biggest218){
          biggest218=ends[4];
        }
        if(ends[5]>=biggest218){
          biggest218=ends[5];
        }
        if(ends[6]>=biggest218){
          biggest218=ends[6];
        }
        if(ends[7]>=biggest218){
          biggest218=ends[7];
        }
        if(ends[8]>=biggest218){
          biggest218=ends[8];
        }
        if(biggest218 == 1){
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        //FINXME code
        if(biggest218 == 0){
          S145=0;
          active[3]=0;
          ends[3]=0;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread211(int [] tdone, int [] ends){
        switch(S103){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        if(orderStart.getprestatus()){//sysj\plant.sysj line: 17, column: 12
                              y_thread_2 = (bottleQuantity.getpreval() == null ? null : ((Integer)bottleQuantity.getpreval()));//sysj\plant.sysj line: 21, column: 5
          x_thread_2 = (liquidMix.getpreval() == null ? null : ((String)liquidMix.getpreval()));//sysj\plant.sysj line: 22, column: 5
          System.out.println("Bottle Quantity: " + y_thread_2);//sysj\plant.sysj line: 24, column: 5
          System.out.println("Liquid Mix: " + x_thread_2);//sysj\plant.sysj line: 25, column: 5
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

  public void thread208(int [] tdone, int [] ends){
        S143=1;
    if(botPos5.getprestatus()){//sysj\plant.sysj line: 40, column: 24
      labelTriggerE.setPresent();//sysj\plant.sysj line: 40, column: 33
      currsigs.addElement(labelTriggerE);
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    else {
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread207(int [] tdone, int [] ends){
        S135=1;
    if(botPos4.getprestatus()){//sysj\plant.sysj line: 38, column: 24
      capScrewTriggerE.setPresent();//sysj\plant.sysj line: 38, column: 33
      currsigs.addElement(capScrewTriggerE);
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread206(int [] tdone, int [] ends){
        S127=1;
    if(botPos3.getprestatus()){//sysj\plant.sysj line: 36, column: 24
      lidloaderTriggerE.setPresent();//sysj\plant.sysj line: 36, column: 33
      currsigs.addElement(lidloaderTriggerE);
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread205(int [] tdone, int [] ends){
        S119=1;
    if(botPos2.getprestatus()){//sysj\plant.sysj line: 34, column: 24
      fillerTriggerE.setPresent();//sysj\plant.sysj line: 34, column: 33
      currsigs.addElement(fillerTriggerE);
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread204(int [] tdone, int [] ends){
        S111=1;
    if(botPos1.getprestatus()){//sysj\plant.sysj line: 32, column: 24
      conBeltTriggerE.setPresent();//sysj\plant.sysj line: 32, column: 33
      currsigs.addElement(conBeltTriggerE);
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread203(int [] tdone, int [] ends){
        S145=1;
    thread204(tdone,ends);
    thread205(tdone,ends);
    thread206(tdone,ends);
    thread207(tdone,ends);
    thread208(tdone,ends);
    int biggest209 = 0;
    if(ends[4]>=biggest209){
      biggest209=ends[4];
    }
    if(ends[5]>=biggest209){
      biggest209=ends[5];
    }
    if(ends[6]>=biggest209){
      biggest209=ends[6];
    }
    if(ends[7]>=biggest209){
      biggest209=ends[7];
    }
    if(ends[8]>=biggest209){
      biggest209=ends[8];
    }
    if(biggest209 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread202(int [] tdone, int [] ends){
        S103=1;
    if(orderStart.getprestatus()){//sysj\plant.sysj line: 17, column: 12
                  y_thread_2 = (bottleQuantity.getpreval() == null ? null : ((Integer)bottleQuantity.getpreval()));//sysj\plant.sysj line: 21, column: 5
      x_thread_2 = (liquidMix.getpreval() == null ? null : ((String)liquidMix.getpreval()));//sysj\plant.sysj line: 22, column: 5
      System.out.println("Bottle Quantity: " + y_thread_2);//sysj\plant.sysj line: 24, column: 5
      System.out.println("Liquid Mix: " + x_thread_2);//sysj\plant.sysj line: 25, column: 5
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
      switch(S200){
        case 0 : 
          S200=0;
          break RUN;
        
        case 1 : 
          S200=2;
          S200=2;
          new Thread(new GUI()).start();//sysj\plant.sysj line: 13, column: 2
          thread202(tdone,ends);
          thread203(tdone,ends);
          int biggest210 = 0;
          if(ends[2]>=biggest210){
            biggest210=ends[2];
          }
          if(ends[3]>=biggest210){
            biggest210=ends[3];
          }
          if(biggest210 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread211(tdone,ends);
          thread212(tdone,ends);
          int biggest219 = 0;
          if(ends[2]>=biggest219){
            biggest219=ends[2];
          }
          if(ends[3]>=biggest219){
            biggest219=ends[3];
          }
          if(biggest219 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest219 == 0){
            S200=0;
            active[1]=0;
            ends[1]=0;
            S200=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0};
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
          capOnBottleAtPos1.gethook();
          tableAlignedWithSensor.gethook();
          bottleAtPos1.gethook();
          bottleAtPos2.gethook();
          bottleAtPos3.gethook();
          bottleAtPos4.gethook();
          bottleAtPos5.gethook();
          orderStart.gethook();
          liquidMix.gethook();
          bottleQuantity.gethook();
          df = true;
        }
        runClockDomain();
      }
      capOnBottleAtPos1.setpreclear();
      tableAlignedWithSensor.setpreclear();
      bottleAtPos1.setpreclear();
      bottleAtPos2.setpreclear();
      bottleAtPos3.setpreclear();
      bottleAtPos4.setpreclear();
      bottleAtPos5.setpreclear();
      orderStart.setpreclear();
      liquidMix.setpreclear();
      bottleQuantity.setpreclear();
      capOnPos1.setpreclear();
      tableAligned.setpreclear();
      botPos1.setpreclear();
      botPos2.setpreclear();
      botPos3.setpreclear();
      botPos4.setpreclear();
      botPos5.setpreclear();
      conBeltTriggerE.setpreclear();
      fillerTriggerE.setpreclear();
      lidloaderTriggerE.setpreclear();
      capScrewTriggerE.setpreclear();
      labelTriggerE.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = capOnBottleAtPos1.getStatus() ? capOnBottleAtPos1.setprepresent() : capOnBottleAtPos1.setpreclear();
      capOnBottleAtPos1.setpreval(capOnBottleAtPos1.getValue());
      capOnBottleAtPos1.setClear();
      dummyint = tableAlignedWithSensor.getStatus() ? tableAlignedWithSensor.setprepresent() : tableAlignedWithSensor.setpreclear();
      tableAlignedWithSensor.setpreval(tableAlignedWithSensor.getValue());
      tableAlignedWithSensor.setClear();
      dummyint = bottleAtPos1.getStatus() ? bottleAtPos1.setprepresent() : bottleAtPos1.setpreclear();
      bottleAtPos1.setpreval(bottleAtPos1.getValue());
      bottleAtPos1.setClear();
      dummyint = bottleAtPos2.getStatus() ? bottleAtPos2.setprepresent() : bottleAtPos2.setpreclear();
      bottleAtPos2.setpreval(bottleAtPos2.getValue());
      bottleAtPos2.setClear();
      dummyint = bottleAtPos3.getStatus() ? bottleAtPos3.setprepresent() : bottleAtPos3.setpreclear();
      bottleAtPos3.setpreval(bottleAtPos3.getValue());
      bottleAtPos3.setClear();
      dummyint = bottleAtPos4.getStatus() ? bottleAtPos4.setprepresent() : bottleAtPos4.setpreclear();
      bottleAtPos4.setpreval(bottleAtPos4.getValue());
      bottleAtPos4.setClear();
      dummyint = bottleAtPos5.getStatus() ? bottleAtPos5.setprepresent() : bottleAtPos5.setpreclear();
      bottleAtPos5.setpreval(bottleAtPos5.getValue());
      bottleAtPos5.setClear();
      dummyint = orderStart.getStatus() ? orderStart.setprepresent() : orderStart.setpreclear();
      orderStart.setpreval(orderStart.getValue());
      orderStart.setClear();
      dummyint = liquidMix.getStatus() ? liquidMix.setprepresent() : liquidMix.setpreclear();
      liquidMix.setpreval(liquidMix.getValue());
      liquidMix.setClear();
      dummyint = bottleQuantity.getStatus() ? bottleQuantity.setprepresent() : bottleQuantity.setpreclear();
      bottleQuantity.setpreval(bottleQuantity.getValue());
      bottleQuantity.setClear();
      capOnPos1.sethook();
      capOnPos1.setClear();
      tableAligned.sethook();
      tableAligned.setClear();
      botPos1.sethook();
      botPos1.setClear();
      botPos2.sethook();
      botPos2.setClear();
      botPos3.sethook();
      botPos3.setClear();
      botPos4.sethook();
      botPos4.setClear();
      botPos5.sethook();
      botPos5.setClear();
      conBeltTriggerE.sethook();
      conBeltTriggerE.setClear();
      fillerTriggerE.sethook();
      fillerTriggerE.setClear();
      lidloaderTriggerE.sethook();
      lidloaderTriggerE.setClear();
      capScrewTriggerE.sethook();
      capScrewTriggerE.setClear();
      labelTriggerE.sethook();
      labelTriggerE.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        capOnBottleAtPos1.gethook();
        tableAlignedWithSensor.gethook();
        bottleAtPos1.gethook();
        bottleAtPos2.gethook();
        bottleAtPos3.gethook();
        bottleAtPos4.gethook();
        bottleAtPos5.gethook();
        orderStart.gethook();
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
