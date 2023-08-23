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
  private int S497 = 1;
  private int S295 = 1;
  private int S189 = 1;
  private int S337 = 1;
  private int S303 = 1;
  private int S311 = 1;
  private int S319 = 1;
  private int S327 = 1;
  private int S335 = 1;
  
  private int[] ends = new int[9];
  private int[] tdone = new int[9];
  
  public void thread514(int [] tdone, int [] ends){
        switch(S335){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(botPos5.getprestatus()){//sysj\plant.sysj line: 59, column: 24
          labelTriggerE.setPresent();//sysj\plant.sysj line: 59, column: 33
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

  public void thread513(int [] tdone, int [] ends){
        switch(S327){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(botPos4.getprestatus()){//sysj\plant.sysj line: 57, column: 24
          capScrewTriggerE.setPresent();//sysj\plant.sysj line: 57, column: 33
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

  public void thread512(int [] tdone, int [] ends){
        switch(S319){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(botPos3.getprestatus()){//sysj\plant.sysj line: 55, column: 24
          lidloaderTriggerE.setPresent();//sysj\plant.sysj line: 55, column: 33
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

  public void thread511(int [] tdone, int [] ends){
        switch(S311){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(botPos2.getprestatus()){//sysj\plant.sysj line: 53, column: 24
          fillerTriggerE.setPresent();//sysj\plant.sysj line: 53, column: 33
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

  public void thread510(int [] tdone, int [] ends){
        switch(S303){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        if(botPos1.getprestatus()){//sysj\plant.sysj line: 51, column: 24
          conBeltTriggerE.setPresent();//sysj\plant.sysj line: 51, column: 33
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

  public void thread509(int [] tdone, int [] ends){
        switch(S337){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        thread510(tdone,ends);
        thread511(tdone,ends);
        thread512(tdone,ends);
        thread513(tdone,ends);
        thread514(tdone,ends);
        int biggest515 = 0;
        if(ends[4]>=biggest515){
          biggest515=ends[4];
        }
        if(ends[5]>=biggest515){
          biggest515=ends[5];
        }
        if(ends[6]>=biggest515){
          biggest515=ends[6];
        }
        if(ends[7]>=biggest515){
          biggest515=ends[7];
        }
        if(ends[8]>=biggest515){
          biggest515=ends[8];
        }
        if(biggest515 == 1){
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        //FINXME code
        if(biggest515 == 0){
          S337=0;
          active[3]=0;
          ends[3]=0;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread508(int [] tdone, int [] ends){
        switch(S295){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S189){
          case 0 : 
            if(!rotate.getprestatus()){//sysj\plant.sysj line: 25, column: 10
              System.out.println("bottleAtPos2 aborted");//sysj\plant.sysj line: 28, column: 5
              botPos3.setPresent();//sysj\plant.sysj line: 29, column: 5
              currsigs.addElement(botPos3);
              S189=1;
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
          
          case 1 : 
            if(!rotate.getprestatus()){//sysj\plant.sysj line: 31, column: 10
              botPos4.setPresent();//sysj\plant.sysj line: 34, column: 5
              currsigs.addElement(botPos4);
              S189=2;
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
            if(!rotate.getprestatus()){//sysj\plant.sysj line: 36, column: 10
              botPos5.setPresent();//sysj\plant.sysj line: 39, column: 5
              currsigs.addElement(botPos5);
              S189=3;
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
          
          case 3 : 
            if(!rotate.getprestatus()){//sysj\plant.sysj line: 41, column: 10
              tableAligned.setPresent();//sysj\plant.sysj line: 44, column: 5
              currsigs.addElement(tableAligned);
              S189=4;
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
            S189=4;
            tableAligned.setPresent();//sysj\plant.sysj line: 17, column: 5
            currsigs.addElement(tableAligned);
            System.out.println("bottleAtPos1 aborted");//sysj\plant.sysj line: 21, column: 5
            botPos2.setPresent();//sysj\plant.sysj line: 22, column: 5
            currsigs.addElement(botPos2);
            S189=0;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread505(int [] tdone, int [] ends){
        S335=1;
    if(botPos5.getprestatus()){//sysj\plant.sysj line: 59, column: 24
      labelTriggerE.setPresent();//sysj\plant.sysj line: 59, column: 33
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

  public void thread504(int [] tdone, int [] ends){
        S327=1;
    if(botPos4.getprestatus()){//sysj\plant.sysj line: 57, column: 24
      capScrewTriggerE.setPresent();//sysj\plant.sysj line: 57, column: 33
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

  public void thread503(int [] tdone, int [] ends){
        S319=1;
    if(botPos3.getprestatus()){//sysj\plant.sysj line: 55, column: 24
      lidloaderTriggerE.setPresent();//sysj\plant.sysj line: 55, column: 33
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

  public void thread502(int [] tdone, int [] ends){
        S311=1;
    if(botPos2.getprestatus()){//sysj\plant.sysj line: 53, column: 24
      fillerTriggerE.setPresent();//sysj\plant.sysj line: 53, column: 33
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

  public void thread501(int [] tdone, int [] ends){
        S303=1;
    if(botPos1.getprestatus()){//sysj\plant.sysj line: 51, column: 24
      conBeltTriggerE.setPresent();//sysj\plant.sysj line: 51, column: 33
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

  public void thread500(int [] tdone, int [] ends){
        S337=1;
    thread501(tdone,ends);
    thread502(tdone,ends);
    thread503(tdone,ends);
    thread504(tdone,ends);
    thread505(tdone,ends);
    int biggest506 = 0;
    if(ends[4]>=biggest506){
      biggest506=ends[4];
    }
    if(ends[5]>=biggest506){
      biggest506=ends[5];
    }
    if(ends[6]>=biggest506){
      biggest506=ends[6];
    }
    if(ends[7]>=biggest506){
      biggest506=ends[7];
    }
    if(ends[8]>=biggest506){
      biggest506=ends[8];
    }
    if(biggest506 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread499(int [] tdone, int [] ends){
        S295=1;
    tableAligned.setPresent();//sysj\plant.sysj line: 17, column: 5
    currsigs.addElement(tableAligned);
    System.out.println("bottleAtPos1 aborted");//sysj\plant.sysj line: 21, column: 5
    botPos2.setPresent();//sysj\plant.sysj line: 22, column: 5
    currsigs.addElement(botPos2);
    S189=0;
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
      switch(S497){
        case 0 : 
          S497=0;
          break RUN;
        
        case 1 : 
          S497=2;
          S497=2;
          new Thread(new GUI()).start();//sysj\plant.sysj line: 11, column: 2
          thread499(tdone,ends);
          thread500(tdone,ends);
          int biggest507 = 0;
          if(ends[2]>=biggest507){
            biggest507=ends[2];
          }
          if(ends[3]>=biggest507){
            biggest507=ends[3];
          }
          if(biggest507 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread508(tdone,ends);
          thread509(tdone,ends);
          int biggest516 = 0;
          if(ends[2]>=biggest516){
            biggest516=ends[2];
          }
          if(ends[3]>=biggest516){
            biggest516=ends[3];
          }
          if(biggest516 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest516 == 0){
            S497=0;
            active[1]=0;
            ends[1]=0;
            S497=0;
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
