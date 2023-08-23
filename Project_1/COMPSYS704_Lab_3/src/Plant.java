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
  private int S794 = 1;
  private int S559 = 1;
  private int S421 = 1;
  private int S601 = 1;
  private int S567 = 1;
  private int S561 = 1;
  private int S575 = 1;
  private int S583 = 1;
  private int S591 = 1;
  private int S599 = 1;
  
  private int[] ends = new int[9];
  private int[] tdone = new int[9];
  
  public void thread811(int [] tdone, int [] ends){
        switch(S599){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(botPos5.getprestatus()){//sysj\plant.sysj line: 54, column: 24
          labelTriggerE.setPresent();//sysj\plant.sysj line: 54, column: 33
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

  public void thread810(int [] tdone, int [] ends){
        switch(S591){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(botPos4.getprestatus()){//sysj\plant.sysj line: 52, column: 24
          capScrewTriggerE.setPresent();//sysj\plant.sysj line: 52, column: 33
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

  public void thread809(int [] tdone, int [] ends){
        switch(S583){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(botPos3.getprestatus()){//sysj\plant.sysj line: 50, column: 24
          lidloaderTriggerE.setPresent();//sysj\plant.sysj line: 50, column: 33
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

  public void thread808(int [] tdone, int [] ends){
        switch(S575){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(botPos2.getprestatus()){//sysj\plant.sysj line: 48, column: 24
          fillerTriggerE.setPresent();//sysj\plant.sysj line: 48, column: 33
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

  public void thread807(int [] tdone, int [] ends){
        switch(S567){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S561){
          case 0 : 
            S561=0;
            if(botPos1.getprestatus()){//sysj\plant.sysj line: 46, column: 24
              conBeltTriggerE.setPresent();//sysj\plant.sysj line: 46, column: 33
              currsigs.addElement(conBeltTriggerE);
              S561=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S561=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            S561=1;
            S561=0;
            if(botPos1.getprestatus()){//sysj\plant.sysj line: 46, column: 24
              conBeltTriggerE.setPresent();//sysj\plant.sysj line: 46, column: 33
              currsigs.addElement(conBeltTriggerE);
              S561=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S561=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread806(int [] tdone, int [] ends){
        switch(S601){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        thread807(tdone,ends);
        thread808(tdone,ends);
        thread809(tdone,ends);
        thread810(tdone,ends);
        thread811(tdone,ends);
        int biggest812 = 0;
        if(ends[4]>=biggest812){
          biggest812=ends[4];
        }
        if(ends[5]>=biggest812){
          biggest812=ends[5];
        }
        if(ends[6]>=biggest812){
          biggest812=ends[6];
        }
        if(ends[7]>=biggest812){
          biggest812=ends[7];
        }
        if(ends[8]>=biggest812){
          biggest812=ends[8];
        }
        if(biggest812 == 1){
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        //FINXME code
        if(biggest812 == 0){
          S601=0;
          active[3]=0;
          ends[3]=0;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread805(int [] tdone, int [] ends){
        switch(S559){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S421){
          case 0 : 
            if(bottleAtPos1.getprestatus() && rotate.getprestatus()){//sysj\plant.sysj line: 16, column: 10
              S421=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              botPos2.setPresent();//sysj\plant.sysj line: 18, column: 5
              currsigs.addElement(botPos2);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            if(!rotate.getprestatus()){//sysj\plant.sysj line: 21, column: 10
              S421=2;
              botPos3.setPresent();//sysj\plant.sysj line: 24, column: 5
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
          
          case 2 : 
            if(bottleAtPos2.getprestatus() && rotate.getprestatus()){//sysj\plant.sysj line: 23, column: 10
              S421=3;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              botPos3.setPresent();//sysj\plant.sysj line: 24, column: 5
              currsigs.addElement(botPos3);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 3 : 
            if(!rotate.getprestatus()){//sysj\plant.sysj line: 26, column: 10
              S421=4;
              botPos4.setPresent();//sysj\plant.sysj line: 29, column: 5
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
          
          case 4 : 
            if(bottleAtPos3.getprestatus() && rotate.getprestatus()){//sysj\plant.sysj line: 28, column: 10
              S421=5;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              botPos4.setPresent();//sysj\plant.sysj line: 29, column: 5
              currsigs.addElement(botPos4);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 5 : 
            if(!rotate.getprestatus()){//sysj\plant.sysj line: 31, column: 10
              S421=6;
              botPos5.setPresent();//sysj\plant.sysj line: 34, column: 5
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
          
          case 6 : 
            if(bottleAtPos4.getprestatus() && rotate.getprestatus()){//sysj\plant.sysj line: 33, column: 10
              S421=7;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              botPos5.setPresent();//sysj\plant.sysj line: 34, column: 5
              currsigs.addElement(botPos5);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 7 : 
            if(!rotate.getprestatus()){//sysj\plant.sysj line: 36, column: 10
              S421=8;
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 39, column: 5
              currsigs.addElement(tableAlignedWithSensor);
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
            if(bottleAtPos4.getprestatus() && rotate.getprestatus()){//sysj\plant.sysj line: 38, column: 10
              S421=9;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              tableAlignedWithSensor.setPresent();//sysj\plant.sysj line: 39, column: 5
              currsigs.addElement(tableAlignedWithSensor);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 9 : 
            S421=9;
            S421=0;
            System.out.println("bottleAtPos1 aborted");//sysj\plant.sysj line: 17, column: 5
            botPos2.setPresent();//sysj\plant.sysj line: 18, column: 5
            currsigs.addElement(botPos2);
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread802(int [] tdone, int [] ends){
        S599=1;
    if(botPos5.getprestatus()){//sysj\plant.sysj line: 54, column: 24
      labelTriggerE.setPresent();//sysj\plant.sysj line: 54, column: 33
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

  public void thread801(int [] tdone, int [] ends){
        S591=1;
    if(botPos4.getprestatus()){//sysj\plant.sysj line: 52, column: 24
      capScrewTriggerE.setPresent();//sysj\plant.sysj line: 52, column: 33
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

  public void thread800(int [] tdone, int [] ends){
        S583=1;
    if(botPos3.getprestatus()){//sysj\plant.sysj line: 50, column: 24
      lidloaderTriggerE.setPresent();//sysj\plant.sysj line: 50, column: 33
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

  public void thread799(int [] tdone, int [] ends){
        S575=1;
    if(botPos2.getprestatus()){//sysj\plant.sysj line: 48, column: 24
      fillerTriggerE.setPresent();//sysj\plant.sysj line: 48, column: 33
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

  public void thread798(int [] tdone, int [] ends){
        S567=1;
    S561=0;
    if(botPos1.getprestatus()){//sysj\plant.sysj line: 46, column: 24
      conBeltTriggerE.setPresent();//sysj\plant.sysj line: 46, column: 33
      currsigs.addElement(conBeltTriggerE);
      S561=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      S561=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread797(int [] tdone, int [] ends){
        S601=1;
    thread798(tdone,ends);
    thread799(tdone,ends);
    thread800(tdone,ends);
    thread801(tdone,ends);
    thread802(tdone,ends);
    int biggest803 = 0;
    if(ends[4]>=biggest803){
      biggest803=ends[4];
    }
    if(ends[5]>=biggest803){
      biggest803=ends[5];
    }
    if(ends[6]>=biggest803){
      biggest803=ends[6];
    }
    if(ends[7]>=biggest803){
      biggest803=ends[7];
    }
    if(ends[8]>=biggest803){
      biggest803=ends[8];
    }
    if(biggest803 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread796(int [] tdone, int [] ends){
        S559=1;
    S421=0;
    System.out.println("bottleAtPos1 aborted");//sysj\plant.sysj line: 17, column: 5
    botPos2.setPresent();//sysj\plant.sysj line: 18, column: 5
    currsigs.addElement(botPos2);
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
      switch(S794){
        case 0 : 
          S794=0;
          break RUN;
        
        case 1 : 
          S794=2;
          S794=2;
          new Thread(new GUI()).start();//sysj\plant.sysj line: 11, column: 2
          thread796(tdone,ends);
          thread797(tdone,ends);
          int biggest804 = 0;
          if(ends[2]>=biggest804){
            biggest804=ends[2];
          }
          if(ends[3]>=biggest804){
            biggest804=ends[3];
          }
          if(biggest804 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread805(tdone,ends);
          thread806(tdone,ends);
          int biggest813 = 0;
          if(ends[2]>=biggest813){
            biggest813=ends[2];
          }
          if(ends[3]>=biggest813){
            biggest813=ends[3];
          }
          if(biggest813 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest813 == 0){
            S794=0;
            active[1]=0;
            ends[1]=0;
            S794=0;
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
