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
  public Signal accessManu = new Signal("accessManu", Signal.INPUT);
  public Signal accessOffice = new Signal("accessOffice", Signal.INPUT);
  public Signal enable = new Signal("enable", Signal.INPUT);
  public Signal absResume = new Signal("absResume", Signal.INPUT);
  public Signal absSuspend = new Signal("absSuspend", Signal.INPUT);
  public Signal proxLaser = new Signal("proxLaser", Signal.INPUT);
  public Signal unlock1 = new Signal("unlock1", Signal.INPUT);
  public Signal unlock2 = new Signal("unlock2", Signal.INPUT);
  public Signal unlock3 = new Signal("unlock3", Signal.INPUT);
  public Signal zoneOcc0 = new Signal("zoneOcc0", Signal.INPUT);
  public Signal zoneOcc1 = new Signal("zoneOcc1", Signal.INPUT);
  public Signal zoneOcc2 = new Signal("zoneOcc2", Signal.INPUT);
  public Signal zoneOcc3 = new Signal("zoneOcc3", Signal.INPUT);
  public Signal zoneOcc4 = new Signal("zoneOcc4", Signal.INPUT);
  public Signal zoneOcc5 = new Signal("zoneOcc5", Signal.INPUT);
  public Signal zoneOcc6 = new Signal("zoneOcc6", Signal.INPUT);
  public Signal zoneOcc7 = new Signal("zoneOcc7", Signal.INPUT);
  public Signal zoneOcc0GUI = new Signal("zoneOcc0GUI", Signal.OUTPUT);
  public Signal zoneOcc1GUI = new Signal("zoneOcc1GUI", Signal.OUTPUT);
  public Signal zoneOcc2GUI = new Signal("zoneOcc2GUI", Signal.OUTPUT);
  public Signal zoneOcc3GUI = new Signal("zoneOcc3GUI", Signal.OUTPUT);
  public Signal zoneOcc4GUI = new Signal("zoneOcc4GUI", Signal.OUTPUT);
  public Signal zoneOcc5GUI = new Signal("zoneOcc5GUI", Signal.OUTPUT);
  public Signal zoneOcc6GUI = new Signal("zoneOcc6GUI", Signal.OUTPUT);
  public Signal zoneOcc7GUI = new Signal("zoneOcc7GUI", Signal.OUTPUT);
  public Signal accessOfficeGUI = new Signal("accessOfficeGUI", Signal.OUTPUT);
  public Signal accessManuGUI = new Signal("accessManuGUI", Signal.OUTPUT);
  public Signal unlock1GUI = new Signal("unlock1GUI", Signal.OUTPUT);
  public Signal lock1GUI = new Signal("lock1GUI", Signal.OUTPUT);
  public Signal laserProximity = new Signal("laserProximity", Signal.OUTPUT);
  public Signal firePresent = new Signal("firePresent", Signal.OUTPUT);
  public Signal door1req = new Signal("door1req", Signal.OUTPUT);
  public Signal door2req = new Signal("door2req", Signal.OUTPUT);
  public Signal door3req = new Signal("door3req", Signal.OUTPUT);
  public Signal manuPerm = new Signal("manuPerm", Signal.OUTPUT);
  public Signal officePerm = new Signal("officePerm", Signal.OUTPUT);
  public Signal zoneOcc0_t = new Signal("zoneOcc0_t", Signal.OUTPUT);
  public Signal zoneOcc1_t = new Signal("zoneOcc1_t", Signal.OUTPUT);
  public Signal zoneOcc2_t = new Signal("zoneOcc2_t", Signal.OUTPUT);
  public Signal zoneOcc3_t = new Signal("zoneOcc3_t", Signal.OUTPUT);
  public Signal zoneOcc4_t = new Signal("zoneOcc4_t", Signal.OUTPUT);
  public Signal zoneOcc5_t = new Signal("zoneOcc5_t", Signal.OUTPUT);
  public Signal zoneOcc6_t = new Signal("zoneOcc6_t", Signal.OUTPUT);
  public Signal zoneOcc7_t = new Signal("zoneOcc7_t", Signal.OUTPUT);
  public Signal person1accessOffice = new Signal("person1accessOffice", Signal.OUTPUT);
  public Signal person1accessManu = new Signal("person1accessManu", Signal.OUTPUT);
  public Signal person1zone = new Signal("person1zone", Signal.OUTPUT);
  public Signal person1doorreq = new Signal("person1doorreq", Signal.OUTPUT);
  public Signal person2zone = new Signal("person2zone", Signal.OUTPUT);
  public Signal person2doorreq = new Signal("person2doorreq", Signal.OUTPUT);
  public Signal person3zone = new Signal("person3zone", Signal.OUTPUT);
  public Signal person3doorreq = new Signal("person3doorreq", Signal.OUTPUT);
  public Signal person4zone = new Signal("person4zone", Signal.OUTPUT);
  public Signal person4doorreq = new Signal("person4doorreq", Signal.OUTPUT);
  public Signal accessManu_t = new Signal("accessManu_t", Signal.OUTPUT);
  public Signal accessOffice_t = new Signal("accessOffice_t", Signal.OUTPUT);
  public Signal unlock1_t = new Signal("unlock1_t", Signal.OUTPUT);
  public Signal lock1_t = new Signal("lock1_t", Signal.OUTPUT);
  private int S31878 = 1;
  private int S31084 = 1;
  private int S30565 = 1;
  private int S30564 = 1;
  private int S30497 = 1;
  private int S30500 = 1;
  private int S30503 = 1;
  private int S30506 = 1;
  private int S30690 = 1;
  private int S30689 = 1;
  private int S30568 = 1;
  private int S30571 = 1;
  private int S30574 = 1;
  private int S30577 = 1;
  private int S30580 = 1;
  private int S30583 = 1;
  private int S30586 = 1;
  private int S31185 = 1;
  private int S31092 = 1;
  private int S31086 = 1;
  private int S31100 = 1;
  private int S31108 = 1;
  private int S31116 = 1;
  private int S31124 = 1;
  private int S31135 = 1;
  private int S31143 = 1;
  private int S31151 = 1;
  private int S31159 = 1;
  private int S31167 = 1;
  private int S31175 = 1;
  private int S31183 = 1;
  
  private int[] ends = new int[29];
  private int[] tdone = new int[29];
  
  public void thread31957(int [] tdone, int [] ends){
        switch(S31183){
      case 0 : 
        active[28]=0;
        ends[28]=0;
        tdone[28]=1;
        break;
      
      case 1 : 
        if(zoneOcc7_t.getprestatus()){//sysj\plant.sysj line: 133, column: 25
          zoneOcc7GUI.setPresent();//sysj\plant.sysj line: 133, column: 37
          currsigs.addElement(zoneOcc7GUI);
          active[28]=1;
          ends[28]=1;
          tdone[28]=1;
        }
        else {
          active[28]=1;
          ends[28]=1;
          tdone[28]=1;
        }
        break;
      
    }
  }

  public void thread31956(int [] tdone, int [] ends){
        switch(S31175){
      case 0 : 
        active[27]=0;
        ends[27]=0;
        tdone[27]=1;
        break;
      
      case 1 : 
        if(zoneOcc6_t.getprestatus()){//sysj\plant.sysj line: 131, column: 25
          zoneOcc6GUI.setPresent();//sysj\plant.sysj line: 131, column: 37
          currsigs.addElement(zoneOcc6GUI);
          active[27]=1;
          ends[27]=1;
          tdone[27]=1;
        }
        else {
          active[27]=1;
          ends[27]=1;
          tdone[27]=1;
        }
        break;
      
    }
  }

  public void thread31955(int [] tdone, int [] ends){
        switch(S31167){
      case 0 : 
        active[26]=0;
        ends[26]=0;
        tdone[26]=1;
        break;
      
      case 1 : 
        if(zoneOcc5_t.getprestatus()){//sysj\plant.sysj line: 129, column: 25
          zoneOcc5GUI.setPresent();//sysj\plant.sysj line: 129, column: 37
          currsigs.addElement(zoneOcc5GUI);
          active[26]=1;
          ends[26]=1;
          tdone[26]=1;
        }
        else {
          active[26]=1;
          ends[26]=1;
          tdone[26]=1;
        }
        break;
      
    }
  }

  public void thread31954(int [] tdone, int [] ends){
        switch(S31159){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        if(zoneOcc4_t.getprestatus()){//sysj\plant.sysj line: 127, column: 25
          zoneOcc4GUI.setPresent();//sysj\plant.sysj line: 127, column: 37
          currsigs.addElement(zoneOcc4GUI);
          active[25]=1;
          ends[25]=1;
          tdone[25]=1;
        }
        else {
          active[25]=1;
          ends[25]=1;
          tdone[25]=1;
        }
        break;
      
    }
  }

  public void thread31953(int [] tdone, int [] ends){
        switch(S31151){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        if(zoneOcc3_t.getprestatus()){//sysj\plant.sysj line: 125, column: 25
          zoneOcc3GUI.setPresent();//sysj\plant.sysj line: 125, column: 37
          currsigs.addElement(zoneOcc3GUI);
          active[24]=1;
          ends[24]=1;
          tdone[24]=1;
        }
        else {
          active[24]=1;
          ends[24]=1;
          tdone[24]=1;
        }
        break;
      
    }
  }

  public void thread31952(int [] tdone, int [] ends){
        switch(S31143){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        if(zoneOcc2_t.getprestatus()){//sysj\plant.sysj line: 123, column: 25
          zoneOcc2GUI.setPresent();//sysj\plant.sysj line: 123, column: 37
          currsigs.addElement(zoneOcc2GUI);
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
        else {
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
        break;
      
    }
  }

  public void thread31951(int [] tdone, int [] ends){
        switch(S31135){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        if(zoneOcc1_t.getprestatus()){//sysj\plant.sysj line: 121, column: 25
          System.out.println("b");//sysj\plant.sysj line: 121, column: 37
          zoneOcc1GUI.setPresent();//sysj\plant.sysj line: 121, column: 61
          currsigs.addElement(zoneOcc1GUI);
          active[22]=1;
          ends[22]=1;
          tdone[22]=1;
        }
        else {
          active[22]=1;
          ends[22]=1;
          tdone[22]=1;
        }
        break;
      
    }
  }

  public void thread31950(int [] tdone, int [] ends){
        switch(S31124){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        if(zoneOcc0_t.getprestatus()){//sysj\plant.sysj line: 119, column: 25
          zoneOcc0GUI.setPresent();//sysj\plant.sysj line: 119, column: 37
          currsigs.addElement(zoneOcc0GUI);
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
        else {
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
        break;
      
    }
  }

  public void thread31949(int [] tdone, int [] ends){
        switch(S31116){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        if(accessManu_t.getprestatus()){//sysj\plant.sysj line: 117, column: 25
          accessManuGUI.setPresent();//sysj\plant.sysj line: 117, column: 39
          currsigs.addElement(accessManuGUI);
          active[20]=1;
          ends[20]=1;
          tdone[20]=1;
        }
        else {
          active[20]=1;
          ends[20]=1;
          tdone[20]=1;
        }
        break;
      
    }
  }

  public void thread31948(int [] tdone, int [] ends){
        switch(S31108){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        if(accessOffice_t.getprestatus()){//sysj\plant.sysj line: 115, column: 25
          accessOfficeGUI.setPresent();//sysj\plant.sysj line: 115, column: 42
          currsigs.addElement(accessOfficeGUI);
          active[19]=1;
          ends[19]=1;
          tdone[19]=1;
        }
        else {
          active[19]=1;
          ends[19]=1;
          tdone[19]=1;
        }
        break;
      
    }
  }

  public void thread31947(int [] tdone, int [] ends){
        switch(S31100){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        if(lock1_t.getprestatus()){//sysj\plant.sysj line: 113, column: 25
          lock1GUI.setPresent();//sysj\plant.sysj line: 113, column: 34
          currsigs.addElement(lock1GUI);
          active[18]=1;
          ends[18]=1;
          tdone[18]=1;
        }
        else {
          active[18]=1;
          ends[18]=1;
          tdone[18]=1;
        }
        break;
      
    }
  }

  public void thread31946(int [] tdone, int [] ends){
        switch(S31092){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        switch(S31086){
          case 0 : 
            S31086=0;
            if(unlock1_t.getprestatus()){//sysj\plant.sysj line: 111, column: 25
              unlock1GUI.setPresent();//sysj\plant.sysj line: 111, column: 37
              currsigs.addElement(unlock1GUI);
              S31086=1;
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            else {
              S31086=1;
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            break;
          
          case 1 : 
            S31086=1;
            S31086=0;
            if(unlock1_t.getprestatus()){//sysj\plant.sysj line: 111, column: 25
              unlock1GUI.setPresent();//sysj\plant.sysj line: 111, column: 37
              currsigs.addElement(unlock1GUI);
              S31086=1;
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            else {
              S31086=1;
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread31945(int [] tdone, int [] ends){
        switch(S31185){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        thread31946(tdone,ends);
        thread31947(tdone,ends);
        thread31948(tdone,ends);
        thread31949(tdone,ends);
        thread31950(tdone,ends);
        thread31951(tdone,ends);
        thread31952(tdone,ends);
        thread31953(tdone,ends);
        thread31954(tdone,ends);
        thread31955(tdone,ends);
        thread31956(tdone,ends);
        thread31957(tdone,ends);
        int biggest31958 = 0;
        if(ends[17]>=biggest31958){
          biggest31958=ends[17];
        }
        if(ends[18]>=biggest31958){
          biggest31958=ends[18];
        }
        if(ends[19]>=biggest31958){
          biggest31958=ends[19];
        }
        if(ends[20]>=biggest31958){
          biggest31958=ends[20];
        }
        if(ends[21]>=biggest31958){
          biggest31958=ends[21];
        }
        if(ends[22]>=biggest31958){
          biggest31958=ends[22];
        }
        if(ends[23]>=biggest31958){
          biggest31958=ends[23];
        }
        if(ends[24]>=biggest31958){
          biggest31958=ends[24];
        }
        if(ends[25]>=biggest31958){
          biggest31958=ends[25];
        }
        if(ends[26]>=biggest31958){
          biggest31958=ends[26];
        }
        if(ends[27]>=biggest31958){
          biggest31958=ends[27];
        }
        if(ends[28]>=biggest31958){
          biggest31958=ends[28];
        }
        if(biggest31958 == 1){
          active[16]=1;
          ends[16]=1;
          tdone[16]=1;
        }
        //FINXME code
        if(biggest31958 == 0){
          S31185=0;
          active[16]=0;
          ends[16]=0;
          tdone[16]=1;
        }
        break;
      
    }
  }

  public void thread31943(int [] tdone, int [] ends){
        S30690=1;
    S30689=0;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread31942(int [] tdone, int [] ends){
        S30565=1;
    S30564=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread31939(int [] tdone, int [] ends){
        S30586=1;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread31938(int [] tdone, int [] ends){
        S30583=1;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread31937(int [] tdone, int [] ends){
        S30580=1;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread31936(int [] tdone, int [] ends){
        S30577=1;
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread31935(int [] tdone, int [] ends){
        S30574=1;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread31934(int [] tdone, int [] ends){
        S30571=1;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread31933(int [] tdone, int [] ends){
        S30568=1;
    accessManu_t.setPresent();//sysj\plant.sysj line: 52, column: 8
    currsigs.addElement(accessManu_t);
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread31931(int [] tdone, int [] ends){
        switch(S30586){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(zoneOcc6.getprestatus()){//sysj\plant.sysj line: 82, column: 14
          zoneOcc6_t.setPresent();//sysj\plant.sysj line: 83, column: 8
          currsigs.addElement(zoneOcc6_t);
          S30586=0;
          active[15]=0;
          ends[15]=0;
          tdone[15]=1;
        }
        else {
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
        break;
      
    }
  }

  public void thread31930(int [] tdone, int [] ends){
        switch(S30583){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(zoneOcc5.getprestatus()){//sysj\plant.sysj line: 77, column: 14
          zoneOcc5_t.setPresent();//sysj\plant.sysj line: 78, column: 8
          currsigs.addElement(zoneOcc5_t);
          S30583=0;
          active[14]=0;
          ends[14]=0;
          tdone[14]=1;
        }
        else {
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
        break;
      
    }
  }

  public void thread31929(int [] tdone, int [] ends){
        switch(S30580){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(zoneOcc4.getprestatus()){//sysj\plant.sysj line: 72, column: 14
          zoneOcc4_t.setPresent();//sysj\plant.sysj line: 73, column: 8
          currsigs.addElement(zoneOcc4_t);
          S30580=0;
          active[13]=0;
          ends[13]=0;
          tdone[13]=1;
        }
        else {
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
        break;
      
    }
  }

  public void thread31928(int [] tdone, int [] ends){
        switch(S30577){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(zoneOcc3.getprestatus()){//sysj\plant.sysj line: 67, column: 14
          zoneOcc3_t.setPresent();//sysj\plant.sysj line: 68, column: 8
          currsigs.addElement(zoneOcc3_t);
          S30577=0;
          active[12]=0;
          ends[12]=0;
          tdone[12]=1;
        }
        else {
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
        break;
      
    }
  }

  public void thread31927(int [] tdone, int [] ends){
        switch(S30574){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(zoneOcc2.getprestatus()){//sysj\plant.sysj line: 62, column: 14
          zoneOcc2_t.setPresent();//sysj\plant.sysj line: 63, column: 8
          currsigs.addElement(zoneOcc2_t);
          S30574=0;
          active[11]=0;
          ends[11]=0;
          tdone[11]=1;
        }
        else {
          active[11]=1;
          ends[11]=1;
          tdone[11]=1;
        }
        break;
      
    }
  }

  public void thread31926(int [] tdone, int [] ends){
        switch(S30571){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(zoneOcc0.getprestatus()){//sysj\plant.sysj line: 57, column: 14
          zoneOcc0_t.setPresent();//sysj\plant.sysj line: 58, column: 8
          currsigs.addElement(zoneOcc0_t);
          S30571=0;
          active[10]=0;
          ends[10]=0;
          tdone[10]=1;
        }
        else {
          active[10]=1;
          ends[10]=1;
          tdone[10]=1;
        }
        break;
      
    }
  }

  public void thread31925(int [] tdone, int [] ends){
        switch(S30568){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        S30568=0;
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
    }
  }

  public void thread31923(int [] tdone, int [] ends){
        S30586=1;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread31922(int [] tdone, int [] ends){
        S30583=1;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread31921(int [] tdone, int [] ends){
        S30580=1;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread31920(int [] tdone, int [] ends){
        S30577=1;
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread31919(int [] tdone, int [] ends){
        S30574=1;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread31918(int [] tdone, int [] ends){
        S30571=1;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread31917(int [] tdone, int [] ends){
        S30568=1;
    accessManu_t.setPresent();//sysj\plant.sysj line: 52, column: 8
    currsigs.addElement(accessManu_t);
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread31916(int [] tdone, int [] ends){
        switch(S30690){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S30689){
          case 0 : 
            if(accessManu.getprestatus()){//sysj\plant.sysj line: 47, column: 11
              S30689=1;
              thread31917(tdone,ends);
              thread31918(tdone,ends);
              thread31919(tdone,ends);
              thread31920(tdone,ends);
              thread31921(tdone,ends);
              thread31922(tdone,ends);
              thread31923(tdone,ends);
              int biggest31924 = 0;
              if(ends[9]>=biggest31924){
                biggest31924=ends[9];
              }
              if(ends[10]>=biggest31924){
                biggest31924=ends[10];
              }
              if(ends[11]>=biggest31924){
                biggest31924=ends[11];
              }
              if(ends[12]>=biggest31924){
                biggest31924=ends[12];
              }
              if(ends[13]>=biggest31924){
                biggest31924=ends[13];
              }
              if(ends[14]>=biggest31924){
                biggest31924=ends[14];
              }
              if(ends[15]>=biggest31924){
                biggest31924=ends[15];
              }
              if(biggest31924 == 1){
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
            }
            else {
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
          case 1 : 
            if(accessOffice.getprestatus()){//sysj\plant.sysj line: 48, column: 11
              S30689=2;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              thread31925(tdone,ends);
              thread31926(tdone,ends);
              thread31927(tdone,ends);
              thread31928(tdone,ends);
              thread31929(tdone,ends);
              thread31930(tdone,ends);
              thread31931(tdone,ends);
              int biggest31932 = 0;
              if(ends[9]>=biggest31932){
                biggest31932=ends[9];
              }
              if(ends[10]>=biggest31932){
                biggest31932=ends[10];
              }
              if(ends[11]>=biggest31932){
                biggest31932=ends[11];
              }
              if(ends[12]>=biggest31932){
                biggest31932=ends[12];
              }
              if(ends[13]>=biggest31932){
                biggest31932=ends[13];
              }
              if(ends[14]>=biggest31932){
                biggest31932=ends[14];
              }
              if(ends[15]>=biggest31932){
                biggest31932=ends[15];
              }
              if(biggest31932 == 1){
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
              //FINXME code
              if(biggest31932 == 0){
                thread31933(tdone,ends);
                thread31934(tdone,ends);
                thread31935(tdone,ends);
                thread31936(tdone,ends);
                thread31937(tdone,ends);
                thread31938(tdone,ends);
                thread31939(tdone,ends);
                int biggest31940 = 0;
                if(ends[9]>=biggest31940){
                  biggest31940=ends[9];
                }
                if(ends[10]>=biggest31940){
                  biggest31940=ends[10];
                }
                if(ends[11]>=biggest31940){
                  biggest31940=ends[11];
                }
                if(ends[12]>=biggest31940){
                  biggest31940=ends[12];
                }
                if(ends[13]>=biggest31940){
                  biggest31940=ends[13];
                }
                if(ends[14]>=biggest31940){
                  biggest31940=ends[14];
                }
                if(ends[15]>=biggest31940){
                  biggest31940=ends[15];
                }
                if(biggest31940 == 1){
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
              }
            }
            break;
          
          case 2 : 
            S30689=2;
            S30690=0;
            active[8]=0;
            ends[8]=0;
            tdone[8]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread31914(int [] tdone, int [] ends){
        S30506=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread31913(int [] tdone, int [] ends){
        S30503=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread31912(int [] tdone, int [] ends){
        S30500=1;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread31911(int [] tdone, int [] ends){
        S30497=1;
    accessOffice_t.setPresent();//sysj\plant.sysj line: 23, column: 8
    currsigs.addElement(accessOffice_t);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread31909(int [] tdone, int [] ends){
        switch(S30506){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(zoneOcc7.getprestatus()){//sysj\plant.sysj line: 38, column: 14
          zoneOcc7_t.setPresent();//sysj\plant.sysj line: 39, column: 8
          currsigs.addElement(zoneOcc7_t);
          S30506=0;
          active[7]=0;
          ends[7]=0;
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

  public void thread31908(int [] tdone, int [] ends){
        switch(S30503){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(zoneOcc1.getprestatus()){//sysj\plant.sysj line: 33, column: 14
          zoneOcc1_t.setPresent();//sysj\plant.sysj line: 34, column: 8
          currsigs.addElement(zoneOcc1_t);
          S30503=0;
          active[6]=0;
          ends[6]=0;
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

  public void thread31907(int [] tdone, int [] ends){
        switch(S30500){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(zoneOcc0.getprestatus()){//sysj\plant.sysj line: 28, column: 14
          zoneOcc0_t.setPresent();//sysj\plant.sysj line: 29, column: 8
          currsigs.addElement(zoneOcc0_t);
          S30500=0;
          active[5]=0;
          ends[5]=0;
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

  public void thread31906(int [] tdone, int [] ends){
        switch(S30497){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        S30497=0;
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
    }
  }

  public void thread31904(int [] tdone, int [] ends){
        S30506=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread31903(int [] tdone, int [] ends){
        S30503=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread31902(int [] tdone, int [] ends){
        S30500=1;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread31901(int [] tdone, int [] ends){
        S30497=1;
    accessOffice_t.setPresent();//sysj\plant.sysj line: 23, column: 8
    currsigs.addElement(accessOffice_t);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread31900(int [] tdone, int [] ends){
        switch(S30565){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S30564){
          case 0 : 
            if(accessOffice.getprestatus()){//sysj\plant.sysj line: 18, column: 11
              S30564=1;
              thread31901(tdone,ends);
              thread31902(tdone,ends);
              thread31903(tdone,ends);
              thread31904(tdone,ends);
              int biggest31905 = 0;
              if(ends[4]>=biggest31905){
                biggest31905=ends[4];
              }
              if(ends[5]>=biggest31905){
                biggest31905=ends[5];
              }
              if(ends[6]>=biggest31905){
                biggest31905=ends[6];
              }
              if(ends[7]>=biggest31905){
                biggest31905=ends[7];
              }
              if(biggest31905 == 1){
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
            }
            else {
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            if(accessManu.getprestatus()){//sysj\plant.sysj line: 19, column: 11
              S30564=2;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              thread31906(tdone,ends);
              thread31907(tdone,ends);
              thread31908(tdone,ends);
              thread31909(tdone,ends);
              int biggest31910 = 0;
              if(ends[4]>=biggest31910){
                biggest31910=ends[4];
              }
              if(ends[5]>=biggest31910){
                biggest31910=ends[5];
              }
              if(ends[6]>=biggest31910){
                biggest31910=ends[6];
              }
              if(ends[7]>=biggest31910){
                biggest31910=ends[7];
              }
              if(biggest31910 == 1){
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
              //FINXME code
              if(biggest31910 == 0){
                thread31911(tdone,ends);
                thread31912(tdone,ends);
                thread31913(tdone,ends);
                thread31914(tdone,ends);
                int biggest31915 = 0;
                if(ends[4]>=biggest31915){
                  biggest31915=ends[4];
                }
                if(ends[5]>=biggest31915){
                  biggest31915=ends[5];
                }
                if(ends[6]>=biggest31915){
                  biggest31915=ends[6];
                }
                if(ends[7]>=biggest31915){
                  biggest31915=ends[7];
                }
                if(biggest31915 == 1){
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
              }
            }
            break;
          
          case 2 : 
            S30564=2;
            S30565=0;
            active[3]=0;
            ends[3]=0;
            tdone[3]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread31899(int [] tdone, int [] ends){
        switch(S31084){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        thread31900(tdone,ends);
        thread31916(tdone,ends);
        int biggest31941 = 0;
        if(ends[3]>=biggest31941){
          biggest31941=ends[3];
        }
        if(ends[8]>=biggest31941){
          biggest31941=ends[8];
        }
        if(biggest31941 == 1){
          active[2]=1;
          ends[2]=1;
          tdone[2]=1;
        }
        //FINXME code
        if(biggest31941 == 0){
          thread31942(tdone,ends);
          thread31943(tdone,ends);
          int biggest31944 = 0;
          if(ends[3]>=biggest31944){
            biggest31944=ends[3];
          }
          if(ends[8]>=biggest31944){
            biggest31944=ends[8];
          }
          if(biggest31944 == 1){
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
          }
        }
        break;
      
    }
  }

  public void thread31896(int [] tdone, int [] ends){
        S31183=1;
    if(zoneOcc7_t.getprestatus()){//sysj\plant.sysj line: 133, column: 25
      zoneOcc7GUI.setPresent();//sysj\plant.sysj line: 133, column: 37
      currsigs.addElement(zoneOcc7GUI);
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
    else {
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
  }

  public void thread31895(int [] tdone, int [] ends){
        S31175=1;
    if(zoneOcc6_t.getprestatus()){//sysj\plant.sysj line: 131, column: 25
      zoneOcc6GUI.setPresent();//sysj\plant.sysj line: 131, column: 37
      currsigs.addElement(zoneOcc6GUI);
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
    else {
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread31894(int [] tdone, int [] ends){
        S31167=1;
    if(zoneOcc5_t.getprestatus()){//sysj\plant.sysj line: 129, column: 25
      zoneOcc5GUI.setPresent();//sysj\plant.sysj line: 129, column: 37
      currsigs.addElement(zoneOcc5GUI);
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
    else {
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
  }

  public void thread31893(int [] tdone, int [] ends){
        S31159=1;
    if(zoneOcc4_t.getprestatus()){//sysj\plant.sysj line: 127, column: 25
      zoneOcc4GUI.setPresent();//sysj\plant.sysj line: 127, column: 37
      currsigs.addElement(zoneOcc4GUI);
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    else {
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
  }

  public void thread31892(int [] tdone, int [] ends){
        S31151=1;
    if(zoneOcc3_t.getprestatus()){//sysj\plant.sysj line: 125, column: 25
      zoneOcc3GUI.setPresent();//sysj\plant.sysj line: 125, column: 37
      currsigs.addElement(zoneOcc3GUI);
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
    else {
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
  }

  public void thread31891(int [] tdone, int [] ends){
        S31143=1;
    if(zoneOcc2_t.getprestatus()){//sysj\plant.sysj line: 123, column: 25
      zoneOcc2GUI.setPresent();//sysj\plant.sysj line: 123, column: 37
      currsigs.addElement(zoneOcc2GUI);
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
    else {
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
  }

  public void thread31890(int [] tdone, int [] ends){
        S31135=1;
    if(zoneOcc1_t.getprestatus()){//sysj\plant.sysj line: 121, column: 25
      System.out.println("b");//sysj\plant.sysj line: 121, column: 37
      zoneOcc1GUI.setPresent();//sysj\plant.sysj line: 121, column: 61
      currsigs.addElement(zoneOcc1GUI);
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
    else {
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
  }

  public void thread31889(int [] tdone, int [] ends){
        S31124=1;
    if(zoneOcc0_t.getprestatus()){//sysj\plant.sysj line: 119, column: 25
      zoneOcc0GUI.setPresent();//sysj\plant.sysj line: 119, column: 37
      currsigs.addElement(zoneOcc0GUI);
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
    else {
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread31888(int [] tdone, int [] ends){
        S31116=1;
    if(accessManu_t.getprestatus()){//sysj\plant.sysj line: 117, column: 25
      accessManuGUI.setPresent();//sysj\plant.sysj line: 117, column: 39
      currsigs.addElement(accessManuGUI);
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
    else {
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
  }

  public void thread31887(int [] tdone, int [] ends){
        S31108=1;
    if(accessOffice_t.getprestatus()){//sysj\plant.sysj line: 115, column: 25
      accessOfficeGUI.setPresent();//sysj\plant.sysj line: 115, column: 42
      currsigs.addElement(accessOfficeGUI);
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
    else {
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
  }

  public void thread31886(int [] tdone, int [] ends){
        S31100=1;
    if(lock1_t.getprestatus()){//sysj\plant.sysj line: 113, column: 25
      lock1GUI.setPresent();//sysj\plant.sysj line: 113, column: 34
      currsigs.addElement(lock1GUI);
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
    else {
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
  }

  public void thread31885(int [] tdone, int [] ends){
        S31092=1;
    S31086=0;
    if(unlock1_t.getprestatus()){//sysj\plant.sysj line: 111, column: 25
      unlock1GUI.setPresent();//sysj\plant.sysj line: 111, column: 37
      currsigs.addElement(unlock1GUI);
      S31086=1;
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
    else {
      S31086=1;
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
  }

  public void thread31884(int [] tdone, int [] ends){
        S31185=1;
    thread31885(tdone,ends);
    thread31886(tdone,ends);
    thread31887(tdone,ends);
    thread31888(tdone,ends);
    thread31889(tdone,ends);
    thread31890(tdone,ends);
    thread31891(tdone,ends);
    thread31892(tdone,ends);
    thread31893(tdone,ends);
    thread31894(tdone,ends);
    thread31895(tdone,ends);
    thread31896(tdone,ends);
    int biggest31897 = 0;
    if(ends[17]>=biggest31897){
      biggest31897=ends[17];
    }
    if(ends[18]>=biggest31897){
      biggest31897=ends[18];
    }
    if(ends[19]>=biggest31897){
      biggest31897=ends[19];
    }
    if(ends[20]>=biggest31897){
      biggest31897=ends[20];
    }
    if(ends[21]>=biggest31897){
      biggest31897=ends[21];
    }
    if(ends[22]>=biggest31897){
      biggest31897=ends[22];
    }
    if(ends[23]>=biggest31897){
      biggest31897=ends[23];
    }
    if(ends[24]>=biggest31897){
      biggest31897=ends[24];
    }
    if(ends[25]>=biggest31897){
      biggest31897=ends[25];
    }
    if(ends[26]>=biggest31897){
      biggest31897=ends[26];
    }
    if(ends[27]>=biggest31897){
      biggest31897=ends[27];
    }
    if(ends[28]>=biggest31897){
      biggest31897=ends[28];
    }
    if(biggest31897 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread31882(int [] tdone, int [] ends){
        S30690=1;
    S30689=0;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread31881(int [] tdone, int [] ends){
        S30565=1;
    S30564=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread31880(int [] tdone, int [] ends){
        S31084=1;
    thread31881(tdone,ends);
    thread31882(tdone,ends);
    int biggest31883 = 0;
    if(ends[3]>=biggest31883){
      biggest31883=ends[3];
    }
    if(ends[8]>=biggest31883){
      biggest31883=ends[8];
    }
    if(biggest31883 == 1){
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
      switch(S31878){
        case 0 : 
          S31878=0;
          break RUN;
        
        case 1 : 
          S31878=2;
          S31878=2;
          new Thread(new GUI()).start();//sysj\plant.sysj line: 11, column: 2
          thread31880(tdone,ends);
          thread31884(tdone,ends);
          int biggest31898 = 0;
          if(ends[2]>=biggest31898){
            biggest31898=ends[2];
          }
          if(ends[16]>=biggest31898){
            biggest31898=ends[16];
          }
          if(biggest31898 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread31899(tdone,ends);
          thread31945(tdone,ends);
          int biggest31959 = 0;
          if(ends[2]>=biggest31959){
            biggest31959=ends[2];
          }
          if(ends[16]>=biggest31959){
            biggest31959=ends[16];
          }
          if(biggest31959 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest31959 == 0){
            S31878=0;
            active[1]=0;
            ends[1]=0;
            S31878=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
          accessManu.gethook();
          accessOffice.gethook();
          enable.gethook();
          absResume.gethook();
          absSuspend.gethook();
          proxLaser.gethook();
          unlock1.gethook();
          unlock2.gethook();
          unlock3.gethook();
          zoneOcc0.gethook();
          zoneOcc1.gethook();
          zoneOcc2.gethook();
          zoneOcc3.gethook();
          zoneOcc4.gethook();
          zoneOcc5.gethook();
          zoneOcc6.gethook();
          zoneOcc7.gethook();
          df = true;
        }
        runClockDomain();
      }
      accessManu.setpreclear();
      accessOffice.setpreclear();
      enable.setpreclear();
      absResume.setpreclear();
      absSuspend.setpreclear();
      proxLaser.setpreclear();
      unlock1.setpreclear();
      unlock2.setpreclear();
      unlock3.setpreclear();
      zoneOcc0.setpreclear();
      zoneOcc1.setpreclear();
      zoneOcc2.setpreclear();
      zoneOcc3.setpreclear();
      zoneOcc4.setpreclear();
      zoneOcc5.setpreclear();
      zoneOcc6.setpreclear();
      zoneOcc7.setpreclear();
      zoneOcc0GUI.setpreclear();
      zoneOcc1GUI.setpreclear();
      zoneOcc2GUI.setpreclear();
      zoneOcc3GUI.setpreclear();
      zoneOcc4GUI.setpreclear();
      zoneOcc5GUI.setpreclear();
      zoneOcc6GUI.setpreclear();
      zoneOcc7GUI.setpreclear();
      accessOfficeGUI.setpreclear();
      accessManuGUI.setpreclear();
      unlock1GUI.setpreclear();
      lock1GUI.setpreclear();
      laserProximity.setpreclear();
      firePresent.setpreclear();
      door1req.setpreclear();
      door2req.setpreclear();
      door3req.setpreclear();
      manuPerm.setpreclear();
      officePerm.setpreclear();
      zoneOcc0_t.setpreclear();
      zoneOcc1_t.setpreclear();
      zoneOcc2_t.setpreclear();
      zoneOcc3_t.setpreclear();
      zoneOcc4_t.setpreclear();
      zoneOcc5_t.setpreclear();
      zoneOcc6_t.setpreclear();
      zoneOcc7_t.setpreclear();
      person1accessOffice.setpreclear();
      person1accessManu.setpreclear();
      person1zone.setpreclear();
      person1doorreq.setpreclear();
      person2zone.setpreclear();
      person2doorreq.setpreclear();
      person3zone.setpreclear();
      person3doorreq.setpreclear();
      person4zone.setpreclear();
      person4doorreq.setpreclear();
      accessManu_t.setpreclear();
      accessOffice_t.setpreclear();
      unlock1_t.setpreclear();
      lock1_t.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = accessManu.getStatus() ? accessManu.setprepresent() : accessManu.setpreclear();
      accessManu.setpreval(accessManu.getValue());
      accessManu.setClear();
      dummyint = accessOffice.getStatus() ? accessOffice.setprepresent() : accessOffice.setpreclear();
      accessOffice.setpreval(accessOffice.getValue());
      accessOffice.setClear();
      dummyint = enable.getStatus() ? enable.setprepresent() : enable.setpreclear();
      enable.setpreval(enable.getValue());
      enable.setClear();
      dummyint = absResume.getStatus() ? absResume.setprepresent() : absResume.setpreclear();
      absResume.setpreval(absResume.getValue());
      absResume.setClear();
      dummyint = absSuspend.getStatus() ? absSuspend.setprepresent() : absSuspend.setpreclear();
      absSuspend.setpreval(absSuspend.getValue());
      absSuspend.setClear();
      dummyint = proxLaser.getStatus() ? proxLaser.setprepresent() : proxLaser.setpreclear();
      proxLaser.setpreval(proxLaser.getValue());
      proxLaser.setClear();
      dummyint = unlock1.getStatus() ? unlock1.setprepresent() : unlock1.setpreclear();
      unlock1.setpreval(unlock1.getValue());
      unlock1.setClear();
      dummyint = unlock2.getStatus() ? unlock2.setprepresent() : unlock2.setpreclear();
      unlock2.setpreval(unlock2.getValue());
      unlock2.setClear();
      dummyint = unlock3.getStatus() ? unlock3.setprepresent() : unlock3.setpreclear();
      unlock3.setpreval(unlock3.getValue());
      unlock3.setClear();
      dummyint = zoneOcc0.getStatus() ? zoneOcc0.setprepresent() : zoneOcc0.setpreclear();
      zoneOcc0.setpreval(zoneOcc0.getValue());
      zoneOcc0.setClear();
      dummyint = zoneOcc1.getStatus() ? zoneOcc1.setprepresent() : zoneOcc1.setpreclear();
      zoneOcc1.setpreval(zoneOcc1.getValue());
      zoneOcc1.setClear();
      dummyint = zoneOcc2.getStatus() ? zoneOcc2.setprepresent() : zoneOcc2.setpreclear();
      zoneOcc2.setpreval(zoneOcc2.getValue());
      zoneOcc2.setClear();
      dummyint = zoneOcc3.getStatus() ? zoneOcc3.setprepresent() : zoneOcc3.setpreclear();
      zoneOcc3.setpreval(zoneOcc3.getValue());
      zoneOcc3.setClear();
      dummyint = zoneOcc4.getStatus() ? zoneOcc4.setprepresent() : zoneOcc4.setpreclear();
      zoneOcc4.setpreval(zoneOcc4.getValue());
      zoneOcc4.setClear();
      dummyint = zoneOcc5.getStatus() ? zoneOcc5.setprepresent() : zoneOcc5.setpreclear();
      zoneOcc5.setpreval(zoneOcc5.getValue());
      zoneOcc5.setClear();
      dummyint = zoneOcc6.getStatus() ? zoneOcc6.setprepresent() : zoneOcc6.setpreclear();
      zoneOcc6.setpreval(zoneOcc6.getValue());
      zoneOcc6.setClear();
      dummyint = zoneOcc7.getStatus() ? zoneOcc7.setprepresent() : zoneOcc7.setpreclear();
      zoneOcc7.setpreval(zoneOcc7.getValue());
      zoneOcc7.setClear();
      zoneOcc0GUI.sethook();
      zoneOcc0GUI.setClear();
      zoneOcc1GUI.sethook();
      zoneOcc1GUI.setClear();
      zoneOcc2GUI.sethook();
      zoneOcc2GUI.setClear();
      zoneOcc3GUI.sethook();
      zoneOcc3GUI.setClear();
      zoneOcc4GUI.sethook();
      zoneOcc4GUI.setClear();
      zoneOcc5GUI.sethook();
      zoneOcc5GUI.setClear();
      zoneOcc6GUI.sethook();
      zoneOcc6GUI.setClear();
      zoneOcc7GUI.sethook();
      zoneOcc7GUI.setClear();
      accessOfficeGUI.sethook();
      accessOfficeGUI.setClear();
      accessManuGUI.sethook();
      accessManuGUI.setClear();
      unlock1GUI.sethook();
      unlock1GUI.setClear();
      lock1GUI.sethook();
      lock1GUI.setClear();
      laserProximity.sethook();
      laserProximity.setClear();
      firePresent.sethook();
      firePresent.setClear();
      door1req.sethook();
      door1req.setClear();
      door2req.sethook();
      door2req.setClear();
      door3req.sethook();
      door3req.setClear();
      manuPerm.sethook();
      manuPerm.setClear();
      officePerm.sethook();
      officePerm.setClear();
      zoneOcc0_t.sethook();
      zoneOcc0_t.setClear();
      zoneOcc1_t.sethook();
      zoneOcc1_t.setClear();
      zoneOcc2_t.sethook();
      zoneOcc2_t.setClear();
      zoneOcc3_t.sethook();
      zoneOcc3_t.setClear();
      zoneOcc4_t.sethook();
      zoneOcc4_t.setClear();
      zoneOcc5_t.sethook();
      zoneOcc5_t.setClear();
      zoneOcc6_t.sethook();
      zoneOcc6_t.setClear();
      zoneOcc7_t.sethook();
      zoneOcc7_t.setClear();
      person1accessOffice.sethook();
      person1accessOffice.setClear();
      person1accessManu.sethook();
      person1accessManu.setClear();
      person1zone.sethook();
      person1zone.setClear();
      person1doorreq.sethook();
      person1doorreq.setClear();
      person2zone.sethook();
      person2zone.setClear();
      person2doorreq.sethook();
      person2doorreq.setClear();
      person3zone.sethook();
      person3zone.setClear();
      person3doorreq.sethook();
      person3doorreq.setClear();
      person4zone.sethook();
      person4zone.setClear();
      person4doorreq.sethook();
      person4doorreq.setClear();
      accessManu_t.sethook();
      accessManu_t.setClear();
      accessOffice_t.sethook();
      accessOffice_t.setClear();
      unlock1_t.sethook();
      unlock1_t.setClear();
      lock1_t.sethook();
      lock1_t.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        accessManu.gethook();
        accessOffice.gethook();
        enable.gethook();
        absResume.gethook();
        absSuspend.gethook();
        proxLaser.gethook();
        unlock1.gethook();
        unlock2.gethook();
        unlock3.gethook();
        zoneOcc0.gethook();
        zoneOcc1.gethook();
        zoneOcc2.gethook();
        zoneOcc3.gethook();
        zoneOcc4.gethook();
        zoneOcc5.gethook();
        zoneOcc6.gethook();
        zoneOcc7.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
