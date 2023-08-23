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
  public Signal rotate = new Signal("rotate", Signal.INPUT);
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
  private int S476 = 1;
  private int S241 = 1;
  private int S99 = 1;
  private int S283 = 1;
  private int S249 = 1;
  private int S257 = 1;
  private int S265 = 1;
  private int S273 = 1;
  private int S281 = 1;
  
  private int[] ends = new int[9];
  private int[] tdone = new int[9];
  
  public void thread493(int [] tdone, int [] ends){
        switch(S281){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(botPos5.getprestatus()){//sysj\plant.sysj line: 74, column: 24
          labelTriggerE.setPresent();//sysj\plant.sysj line: 74, column: 33
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

  public void thread492(int [] tdone, int [] ends){
        switch(S273){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(botPos4.getprestatus()){//sysj\plant.sysj line: 72, column: 24
          capScrewTriggerE.setPresent();//sysj\plant.sysj line: 72, column: 33
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

  public void thread491(int [] tdone, int [] ends){
        switch(S265){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(botPos3.getprestatus()){//sysj\plant.sysj line: 70, column: 24
          lidloaderTriggerE.setPresent();//sysj\plant.sysj line: 70, column: 33
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

  public void thread490(int [] tdone, int [] ends){
        switch(S257){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(botPos2.getprestatus()){//sysj\plant.sysj line: 68, column: 24
          fillerTriggerE.setPresent();//sysj\plant.sysj line: 68, column: 33
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

  public void thread489(int [] tdone, int [] ends){
        switch(S249){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        if(botPos1.getprestatus()){//sysj\plant.sysj line: 66, column: 24
          conBeltTriggerE.setPresent();//sysj\plant.sysj line: 66, column: 33
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

  public void thread488(int [] tdone, int [] ends){
        switch(S283){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        thread489(tdone,ends);
        thread490(tdone,ends);
        thread491(tdone,ends);
        thread492(tdone,ends);
        thread493(tdone,ends);
        int biggest494 = 0;
        if(ends[4]>=biggest494){
          biggest494=ends[4];
        }
        if(ends[5]>=biggest494){
          biggest494=ends[5];
        }
        if(ends[6]>=biggest494){
          biggest494=ends[6];
        }
        if(ends[7]>=biggest494){
          biggest494=ends[7];
        }
        if(ends[8]>=biggest494){
          biggest494=ends[8];
        }
        if(biggest494 == 1){
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        //FINXME code
        if(biggest494 == 0){
          S283=0;
          active[3]=0;
          ends[3]=0;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread487(int [] tdone, int [] ends){
        switch(S241){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S99){
          case 0 : 
            if(rotate.getprestatus()){//sysj\plant.sysj line: 16, column: 10
              S99=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              tableAligned.setPresent();//sysj\plant.sysj line: 18, column: 6
              currsigs.addElement(tableAligned);
              botPos1.setPresent();//sysj\plant.sysj line: 19, column: 6
              currsigs.addElement(botPos1);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            if(!rotate.getprestatus()){//sysj\plant.sysj line: 23, column: 10
              S99=2;
              botPos2.setPresent();//sysj\plant.sysj line: 27, column: 6
              currsigs.addElement(botPos2);
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
          
          case 2 : 
            if(bottleAtPos1.getprestatus() && rotate.getprestatus()){//sysj\plant.sysj line: 24, column: 10
              S99=3;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              botPos2.setPresent();//sysj\plant.sysj line: 27, column: 6
              currsigs.addElement(botPos2);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 3 : 
            if(!rotate.getprestatus()){//sysj\plant.sysj line: 32, column: 10
              S99=4;
              botPos3.setPresent();//sysj\plant.sysj line: 36, column: 6
              currsigs.addElement(botPos3);
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
          
          case 4 : 
            if(bottleAtPos2.getprestatus() && rotate.getprestatus()){//sysj\plant.sysj line: 34, column: 10
              S99=5;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              botPos3.setPresent();//sysj\plant.sysj line: 36, column: 6
              currsigs.addElement(botPos3);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 5 : 
            if(!rotate.getprestatus()){//sysj\plant.sysj line: 40, column: 10
              S99=6;
              botPos4.setPresent();//sysj\plant.sysj line: 44, column: 6
              currsigs.addElement(botPos4);
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
          
          case 6 : 
            if(bottleAtPos3.getprestatus() && rotate.getprestatus()){//sysj\plant.sysj line: 42, column: 10
              S99=7;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              botPos4.setPresent();//sysj\plant.sysj line: 44, column: 6
              currsigs.addElement(botPos4);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 7 : 
            if(!rotate.getprestatus()){//sysj\plant.sysj line: 48, column: 10
              S99=8;
              botPos5.setPresent();//sysj\plant.sysj line: 52, column: 6
              currsigs.addElement(botPos5);
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
          
          case 8 : 
            if(bottleAtPos4.getprestatus() && rotate.getprestatus()){//sysj\plant.sysj line: 50, column: 10
              S99=9;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              botPos5.setPresent();//sysj\plant.sysj line: 52, column: 6
              currsigs.addElement(botPos5);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 9 : 
            if(!rotate.getprestatus()){//sysj\plant.sysj line: 56, column: 10
              tableAligned.setPresent();//sysj\plant.sysj line: 59, column: 5
              currsigs.addElement(tableAligned);
              S99=10;
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
          
          case 10 : 
            S99=10;
            S99=0;
            tableAligned.setPresent();//sysj\plant.sysj line: 18, column: 6
            currsigs.addElement(tableAligned);
            botPos1.setPresent();//sysj\plant.sysj line: 19, column: 6
            currsigs.addElement(botPos1);
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread484(int [] tdone, int [] ends){
        S281=1;
    if(botPos5.getprestatus()){//sysj\plant.sysj line: 74, column: 24
      labelTriggerE.setPresent();//sysj\plant.sysj line: 74, column: 33
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

  public void thread483(int [] tdone, int [] ends){
        S273=1;
    if(botPos4.getprestatus()){//sysj\plant.sysj line: 72, column: 24
      capScrewTriggerE.setPresent();//sysj\plant.sysj line: 72, column: 33
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

  public void thread482(int [] tdone, int [] ends){
        S265=1;
    if(botPos3.getprestatus()){//sysj\plant.sysj line: 70, column: 24
      lidloaderTriggerE.setPresent();//sysj\plant.sysj line: 70, column: 33
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

  public void thread481(int [] tdone, int [] ends){
        S257=1;
    if(botPos2.getprestatus()){//sysj\plant.sysj line: 68, column: 24
      fillerTriggerE.setPresent();//sysj\plant.sysj line: 68, column: 33
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

  public void thread480(int [] tdone, int [] ends){
        S249=1;
    if(botPos1.getprestatus()){//sysj\plant.sysj line: 66, column: 24
      conBeltTriggerE.setPresent();//sysj\plant.sysj line: 66, column: 33
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

  public void thread479(int [] tdone, int [] ends){
        S283=1;
    thread480(tdone,ends);
    thread481(tdone,ends);
    thread482(tdone,ends);
    thread483(tdone,ends);
    thread484(tdone,ends);
    int biggest485 = 0;
    if(ends[4]>=biggest485){
      biggest485=ends[4];
    }
    if(ends[5]>=biggest485){
      biggest485=ends[5];
    }
    if(ends[6]>=biggest485){
      biggest485=ends[6];
    }
    if(ends[7]>=biggest485){
      biggest485=ends[7];
    }
    if(ends[8]>=biggest485){
      biggest485=ends[8];
    }
    if(biggest485 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread478(int [] tdone, int [] ends){
        S241=1;
    S99=0;
    tableAligned.setPresent();//sysj\plant.sysj line: 18, column: 6
    currsigs.addElement(tableAligned);
    botPos1.setPresent();//sysj\plant.sysj line: 19, column: 6
    currsigs.addElement(botPos1);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S476){
        case 0 : 
          S476=0;
          break RUN;
        
        case 1 : 
          S476=2;
          S476=2;
          new Thread(new GUI()).start();//sysj\plant.sysj line: 11, column: 2
          thread478(tdone,ends);
          thread479(tdone,ends);
          int biggest486 = 0;
          if(ends[2]>=biggest486){
            biggest486=ends[2];
          }
          if(ends[3]>=biggest486){
            biggest486=ends[3];
          }
          if(biggest486 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread487(tdone,ends);
          thread488(tdone,ends);
          int biggest495 = 0;
          if(ends[2]>=biggest495){
            biggest495=ends[2];
          }
          if(ends[3]>=biggest495){
            biggest495=ends[3];
          }
          if(biggest495 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest495 == 0){
            S476=0;
            active[1]=0;
            ends[1]=0;
            S476=0;
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
          rotate.gethook();
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
      rotate.setpreclear();
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
      dummyint = rotate.getStatus() ? rotate.setprepresent() : rotate.setpreclear();
      rotate.setpreval(rotate.getValue());
      rotate.setClear();
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
        rotate.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
