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
  public Signal fire = new Signal("fire", Signal.INPUT);
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
  public Signal unlock1GUI = new Signal("unlock1GUI", Signal.OUTPUT);
  public Signal unlock2GUI = new Signal("unlock2GUI", Signal.OUTPUT);
  public Signal unlock3GUI = new Signal("unlock3GUI", Signal.OUTPUT);
  public Signal fire_t = new Signal("fire_t", Signal.OUTPUT);
  public Signal unlock1_t = new Signal("unlock1_t", Signal.OUTPUT);
  public Signal proxLaserGUI = new Signal("proxLaserGUI", Signal.OUTPUT);
  public Signal absStopGUI = new Signal("absStopGUI", Signal.OUTPUT);
  private int S59164 = 1;
  private int S58350 = 1;
  private int S57829 = 1;
  private int S57828 = 1;
  private int S57761 = 1;
  private int S57764 = 1;
  private int S57767 = 1;
  private int S57770 = 1;
  private int S57954 = 1;
  private int S57953 = 1;
  private int S57832 = 1;
  private int S57835 = 1;
  private int S57838 = 1;
  private int S57841 = 1;
  private int S57844 = 1;
  private int S57847 = 1;
  private int S57850 = 1;
  private int S58460 = 1;
  private int S58358 = 1;
  private int S58352 = 1;
  private int S58366 = 1;
  private int S58374 = 1;
  private int S58382 = 1;
  private int S58390 = 1;
  private int S58398 = 1;
  private int S58406 = 1;
  private int S58417 = 1;
  private int S58428 = 1;
  private int S58439 = 1;
  private int S58447 = 1;
  private int S58458 = 1;
  
  private int[] ends = new int[29];
  private int[] tdone = new int[29];
  
  public void thread59243(int [] tdone, int [] ends){
        switch(S58458){
      case 0 : 
        active[28]=0;
        ends[28]=0;
        tdone[28]=1;
        break;
      
      case 1 : 
        if(fire.getprestatus()){//sysj\plant.sysj line: 136, column: 25
          unlock1GUI.setPresent();//sysj\plant.sysj line: 136, column: 31
          currsigs.addElement(unlock1GUI);
          unlock2GUI.setPresent();//sysj\plant.sysj line: 136, column: 48
          currsigs.addElement(unlock2GUI);
          unlock3GUI.setPresent();//sysj\plant.sysj line: 136, column: 65
          currsigs.addElement(unlock3GUI);
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

  public void thread59242(int [] tdone, int [] ends){
        switch(S58447){
      case 0 : 
        active[27]=0;
        ends[27]=0;
        tdone[27]=1;
        break;
      
      case 1 : 
        if(zoneOcc7_t.getprestatus()){//sysj\plant.sysj line: 134, column: 25
          zoneOcc7GUI.setPresent();//sysj\plant.sysj line: 134, column: 37
          currsigs.addElement(zoneOcc7GUI);
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

  public void thread59241(int [] tdone, int [] ends){
        switch(S58439){
      case 0 : 
        active[26]=0;
        ends[26]=0;
        tdone[26]=1;
        break;
      
      case 1 : 
        if(zoneOcc6_t.getprestatus()){//sysj\plant.sysj line: 132, column: 25
          zoneOcc6GUI.setPresent();//sysj\plant.sysj line: 132, column: 37
          currsigs.addElement(zoneOcc6GUI);
          proxLaserGUI.setPresent();//sysj\plant.sysj line: 132, column: 55
          currsigs.addElement(proxLaserGUI);
          absStopGUI.setPresent();//sysj\plant.sysj line: 132, column: 74
          currsigs.addElement(absStopGUI);
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

  public void thread59240(int [] tdone, int [] ends){
        switch(S58428){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        if(zoneOcc5_t.getprestatus()){//sysj\plant.sysj line: 130, column: 25
          zoneOcc5GUI.setPresent();//sysj\plant.sysj line: 130, column: 37
          currsigs.addElement(zoneOcc5GUI);
          proxLaserGUI.setPresent();//sysj\plant.sysj line: 130, column: 55
          currsigs.addElement(proxLaserGUI);
          absStopGUI.setPresent();//sysj\plant.sysj line: 130, column: 74
          currsigs.addElement(absStopGUI);
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

  public void thread59239(int [] tdone, int [] ends){
        switch(S58417){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        if(zoneOcc4_t.getprestatus()){//sysj\plant.sysj line: 128, column: 25
          zoneOcc4GUI.setPresent();//sysj\plant.sysj line: 128, column: 37
          currsigs.addElement(zoneOcc4GUI);
          proxLaserGUI.setPresent();//sysj\plant.sysj line: 128, column: 55
          currsigs.addElement(proxLaserGUI);
          absStopGUI.setPresent();//sysj\plant.sysj line: 128, column: 74
          currsigs.addElement(absStopGUI);
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

  public void thread59238(int [] tdone, int [] ends){
        switch(S58406){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        if(zoneOcc3_t.getprestatus()){//sysj\plant.sysj line: 126, column: 25
          zoneOcc3GUI.setPresent();//sysj\plant.sysj line: 126, column: 37
          currsigs.addElement(zoneOcc3GUI);
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

  public void thread59237(int [] tdone, int [] ends){
        switch(S58398){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        if(zoneOcc2_t.getprestatus()){//sysj\plant.sysj line: 124, column: 25
          zoneOcc2GUI.setPresent();//sysj\plant.sysj line: 124, column: 37
          currsigs.addElement(zoneOcc2GUI);
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

  public void thread59236(int [] tdone, int [] ends){
        switch(S58390){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        if(zoneOcc1_t.getprestatus()){//sysj\plant.sysj line: 122, column: 25
          zoneOcc1GUI.setPresent();//sysj\plant.sysj line: 122, column: 37
          currsigs.addElement(zoneOcc1GUI);
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

  public void thread59235(int [] tdone, int [] ends){
        switch(S58382){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        if(zoneOcc0_t.getprestatus()){//sysj\plant.sysj line: 120, column: 25
          zoneOcc0GUI.setPresent();//sysj\plant.sysj line: 120, column: 37
          currsigs.addElement(zoneOcc0GUI);
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

  public void thread59234(int [] tdone, int [] ends){
        switch(S58374){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        if(accessManu_t.getprestatus()){//sysj\plant.sysj line: 118, column: 25
          accessManuGUI.setPresent();//sysj\plant.sysj line: 118, column: 39
          currsigs.addElement(accessManuGUI);
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

  public void thread59233(int [] tdone, int [] ends){
        switch(S58366){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        if(accessOffice_t.getprestatus()){//sysj\plant.sysj line: 116, column: 25
          accessOfficeGUI.setPresent();//sysj\plant.sysj line: 116, column: 42
          currsigs.addElement(accessOfficeGUI);
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

  public void thread59232(int [] tdone, int [] ends){
        switch(S58358){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        switch(S58352){
          case 0 : 
            S58352=0;
            if(unlock1_t.getprestatus()){//sysj\plant.sysj line: 114, column: 25
              unlock1GUI.setPresent();//sysj\plant.sysj line: 114, column: 37
              currsigs.addElement(unlock1GUI);
              S58352=1;
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            else {
              S58352=1;
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            break;
          
          case 1 : 
            S58352=1;
            S58352=0;
            if(unlock1_t.getprestatus()){//sysj\plant.sysj line: 114, column: 25
              unlock1GUI.setPresent();//sysj\plant.sysj line: 114, column: 37
              currsigs.addElement(unlock1GUI);
              S58352=1;
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            else {
              S58352=1;
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread59231(int [] tdone, int [] ends){
        switch(S58460){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        thread59232(tdone,ends);
        thread59233(tdone,ends);
        thread59234(tdone,ends);
        thread59235(tdone,ends);
        thread59236(tdone,ends);
        thread59237(tdone,ends);
        thread59238(tdone,ends);
        thread59239(tdone,ends);
        thread59240(tdone,ends);
        thread59241(tdone,ends);
        thread59242(tdone,ends);
        thread59243(tdone,ends);
        int biggest59244 = 0;
        if(ends[17]>=biggest59244){
          biggest59244=ends[17];
        }
        if(ends[18]>=biggest59244){
          biggest59244=ends[18];
        }
        if(ends[19]>=biggest59244){
          biggest59244=ends[19];
        }
        if(ends[20]>=biggest59244){
          biggest59244=ends[20];
        }
        if(ends[21]>=biggest59244){
          biggest59244=ends[21];
        }
        if(ends[22]>=biggest59244){
          biggest59244=ends[22];
        }
        if(ends[23]>=biggest59244){
          biggest59244=ends[23];
        }
        if(ends[24]>=biggest59244){
          biggest59244=ends[24];
        }
        if(ends[25]>=biggest59244){
          biggest59244=ends[25];
        }
        if(ends[26]>=biggest59244){
          biggest59244=ends[26];
        }
        if(ends[27]>=biggest59244){
          biggest59244=ends[27];
        }
        if(ends[28]>=biggest59244){
          biggest59244=ends[28];
        }
        if(biggest59244 == 1){
          active[16]=1;
          ends[16]=1;
          tdone[16]=1;
        }
        //FINXME code
        if(biggest59244 == 0){
          S58460=0;
          active[16]=0;
          ends[16]=0;
          tdone[16]=1;
        }
        break;
      
    }
  }

  public void thread59229(int [] tdone, int [] ends){
        S57954=1;
    S57953=0;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread59228(int [] tdone, int [] ends){
        S57829=1;
    S57828=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread59225(int [] tdone, int [] ends){
        S57850=1;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread59224(int [] tdone, int [] ends){
        S57847=1;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread59223(int [] tdone, int [] ends){
        S57844=1;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread59222(int [] tdone, int [] ends){
        S57841=1;
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread59221(int [] tdone, int [] ends){
        S57838=1;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread59220(int [] tdone, int [] ends){
        S57835=1;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread59219(int [] tdone, int [] ends){
        S57832=1;
    accessManu_t.setPresent();//sysj\plant.sysj line: 52, column: 9
    currsigs.addElement(accessManu_t);
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread59217(int [] tdone, int [] ends){
        switch(S57850){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(zoneOcc6.getprestatus()){//sysj\plant.sysj line: 82, column: 15
          zoneOcc6_t.setPresent();//sysj\plant.sysj line: 83, column: 9
          currsigs.addElement(zoneOcc6_t);
          S57850=0;
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

  public void thread59216(int [] tdone, int [] ends){
        switch(S57847){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(zoneOcc5.getprestatus()){//sysj\plant.sysj line: 77, column: 15
          zoneOcc5_t.setPresent();//sysj\plant.sysj line: 78, column: 9
          currsigs.addElement(zoneOcc5_t);
          S57847=0;
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

  public void thread59215(int [] tdone, int [] ends){
        switch(S57844){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(zoneOcc4.getprestatus()){//sysj\plant.sysj line: 72, column: 15
          zoneOcc4_t.setPresent();//sysj\plant.sysj line: 73, column: 9
          currsigs.addElement(zoneOcc4_t);
          S57844=0;
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

  public void thread59214(int [] tdone, int [] ends){
        switch(S57841){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(zoneOcc3.getprestatus()){//sysj\plant.sysj line: 67, column: 15
          zoneOcc3_t.setPresent();//sysj\plant.sysj line: 68, column: 9
          currsigs.addElement(zoneOcc3_t);
          S57841=0;
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

  public void thread59213(int [] tdone, int [] ends){
        switch(S57838){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(zoneOcc2.getprestatus()){//sysj\plant.sysj line: 62, column: 15
          zoneOcc2_t.setPresent();//sysj\plant.sysj line: 63, column: 9
          currsigs.addElement(zoneOcc2_t);
          S57838=0;
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

  public void thread59212(int [] tdone, int [] ends){
        switch(S57835){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(zoneOcc0.getprestatus()){//sysj\plant.sysj line: 57, column: 15
          zoneOcc0_t.setPresent();//sysj\plant.sysj line: 58, column: 9
          currsigs.addElement(zoneOcc0_t);
          S57835=0;
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

  public void thread59211(int [] tdone, int [] ends){
        switch(S57832){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        S57832=0;
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
    }
  }

  public void thread59209(int [] tdone, int [] ends){
        S57850=1;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread59208(int [] tdone, int [] ends){
        S57847=1;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread59207(int [] tdone, int [] ends){
        S57844=1;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread59206(int [] tdone, int [] ends){
        S57841=1;
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread59205(int [] tdone, int [] ends){
        S57838=1;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread59204(int [] tdone, int [] ends){
        S57835=1;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread59203(int [] tdone, int [] ends){
        S57832=1;
    accessManu_t.setPresent();//sysj\plant.sysj line: 52, column: 9
    currsigs.addElement(accessManu_t);
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread59202(int [] tdone, int [] ends){
        switch(S57954){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S57953){
          case 0 : 
            if(accessManu.getprestatus()){//sysj\plant.sysj line: 47, column: 12
              S57953=1;
              thread59203(tdone,ends);
              thread59204(tdone,ends);
              thread59205(tdone,ends);
              thread59206(tdone,ends);
              thread59207(tdone,ends);
              thread59208(tdone,ends);
              thread59209(tdone,ends);
              int biggest59210 = 0;
              if(ends[9]>=biggest59210){
                biggest59210=ends[9];
              }
              if(ends[10]>=biggest59210){
                biggest59210=ends[10];
              }
              if(ends[11]>=biggest59210){
                biggest59210=ends[11];
              }
              if(ends[12]>=biggest59210){
                biggest59210=ends[12];
              }
              if(ends[13]>=biggest59210){
                biggest59210=ends[13];
              }
              if(ends[14]>=biggest59210){
                biggest59210=ends[14];
              }
              if(ends[15]>=biggest59210){
                biggest59210=ends[15];
              }
              if(biggest59210 == 1){
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
            if(accessOffice.getprestatus()){//sysj\plant.sysj line: 48, column: 12
              S57953=2;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              thread59211(tdone,ends);
              thread59212(tdone,ends);
              thread59213(tdone,ends);
              thread59214(tdone,ends);
              thread59215(tdone,ends);
              thread59216(tdone,ends);
              thread59217(tdone,ends);
              int biggest59218 = 0;
              if(ends[9]>=biggest59218){
                biggest59218=ends[9];
              }
              if(ends[10]>=biggest59218){
                biggest59218=ends[10];
              }
              if(ends[11]>=biggest59218){
                biggest59218=ends[11];
              }
              if(ends[12]>=biggest59218){
                biggest59218=ends[12];
              }
              if(ends[13]>=biggest59218){
                biggest59218=ends[13];
              }
              if(ends[14]>=biggest59218){
                biggest59218=ends[14];
              }
              if(ends[15]>=biggest59218){
                biggest59218=ends[15];
              }
              if(biggest59218 == 1){
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
              //FINXME code
              if(biggest59218 == 0){
                thread59219(tdone,ends);
                thread59220(tdone,ends);
                thread59221(tdone,ends);
                thread59222(tdone,ends);
                thread59223(tdone,ends);
                thread59224(tdone,ends);
                thread59225(tdone,ends);
                int biggest59226 = 0;
                if(ends[9]>=biggest59226){
                  biggest59226=ends[9];
                }
                if(ends[10]>=biggest59226){
                  biggest59226=ends[10];
                }
                if(ends[11]>=biggest59226){
                  biggest59226=ends[11];
                }
                if(ends[12]>=biggest59226){
                  biggest59226=ends[12];
                }
                if(ends[13]>=biggest59226){
                  biggest59226=ends[13];
                }
                if(ends[14]>=biggest59226){
                  biggest59226=ends[14];
                }
                if(ends[15]>=biggest59226){
                  biggest59226=ends[15];
                }
                if(biggest59226 == 1){
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
              }
            }
            break;
          
          case 2 : 
            S57953=2;
            S57954=0;
            active[8]=0;
            ends[8]=0;
            tdone[8]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread59200(int [] tdone, int [] ends){
        S57770=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread59199(int [] tdone, int [] ends){
        S57767=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread59198(int [] tdone, int [] ends){
        S57764=1;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread59197(int [] tdone, int [] ends){
        S57761=1;
    accessOffice_t.setPresent();//sysj\plant.sysj line: 23, column: 9
    currsigs.addElement(accessOffice_t);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread59195(int [] tdone, int [] ends){
        switch(S57770){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(zoneOcc7.getprestatus()){//sysj\plant.sysj line: 38, column: 15
          zoneOcc7_t.setPresent();//sysj\plant.sysj line: 39, column: 9
          currsigs.addElement(zoneOcc7_t);
          S57770=0;
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

  public void thread59194(int [] tdone, int [] ends){
        switch(S57767){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(zoneOcc1.getprestatus()){//sysj\plant.sysj line: 33, column: 15
          zoneOcc1_t.setPresent();//sysj\plant.sysj line: 34, column: 9
          currsigs.addElement(zoneOcc1_t);
          S57767=0;
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

  public void thread59193(int [] tdone, int [] ends){
        switch(S57764){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(zoneOcc0.getprestatus()){//sysj\plant.sysj line: 28, column: 15
          zoneOcc0_t.setPresent();//sysj\plant.sysj line: 29, column: 9
          currsigs.addElement(zoneOcc0_t);
          S57764=0;
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

  public void thread59192(int [] tdone, int [] ends){
        switch(S57761){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        S57761=0;
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
    }
  }

  public void thread59190(int [] tdone, int [] ends){
        S57770=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread59189(int [] tdone, int [] ends){
        S57767=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread59188(int [] tdone, int [] ends){
        S57764=1;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread59187(int [] tdone, int [] ends){
        S57761=1;
    accessOffice_t.setPresent();//sysj\plant.sysj line: 23, column: 9
    currsigs.addElement(accessOffice_t);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread59186(int [] tdone, int [] ends){
        switch(S57829){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S57828){
          case 0 : 
            if(accessOffice.getprestatus()){//sysj\plant.sysj line: 18, column: 12
              S57828=1;
              thread59187(tdone,ends);
              thread59188(tdone,ends);
              thread59189(tdone,ends);
              thread59190(tdone,ends);
              int biggest59191 = 0;
              if(ends[4]>=biggest59191){
                biggest59191=ends[4];
              }
              if(ends[5]>=biggest59191){
                biggest59191=ends[5];
              }
              if(ends[6]>=biggest59191){
                biggest59191=ends[6];
              }
              if(ends[7]>=biggest59191){
                biggest59191=ends[7];
              }
              if(biggest59191 == 1){
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
            if(accessManu.getprestatus()){//sysj\plant.sysj line: 19, column: 12
              S57828=2;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              thread59192(tdone,ends);
              thread59193(tdone,ends);
              thread59194(tdone,ends);
              thread59195(tdone,ends);
              int biggest59196 = 0;
              if(ends[4]>=biggest59196){
                biggest59196=ends[4];
              }
              if(ends[5]>=biggest59196){
                biggest59196=ends[5];
              }
              if(ends[6]>=biggest59196){
                biggest59196=ends[6];
              }
              if(ends[7]>=biggest59196){
                biggest59196=ends[7];
              }
              if(biggest59196 == 1){
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
              //FINXME code
              if(biggest59196 == 0){
                thread59197(tdone,ends);
                thread59198(tdone,ends);
                thread59199(tdone,ends);
                thread59200(tdone,ends);
                int biggest59201 = 0;
                if(ends[4]>=biggest59201){
                  biggest59201=ends[4];
                }
                if(ends[5]>=biggest59201){
                  biggest59201=ends[5];
                }
                if(ends[6]>=biggest59201){
                  biggest59201=ends[6];
                }
                if(ends[7]>=biggest59201){
                  biggest59201=ends[7];
                }
                if(biggest59201 == 1){
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
              }
            }
            break;
          
          case 2 : 
            S57828=2;
            S57829=0;
            active[3]=0;
            ends[3]=0;
            tdone[3]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread59185(int [] tdone, int [] ends){
        switch(S58350){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        if(fire.getprestatus()){//sysj\plant.sysj line: 15, column: 9
          S58350=0;
          active[2]=0;
          ends[2]=0;
          tdone[2]=1;
        }
        else {
          thread59186(tdone,ends);
          thread59202(tdone,ends);
          int biggest59227 = 0;
          if(ends[3]>=biggest59227){
            biggest59227=ends[3];
          }
          if(ends[8]>=biggest59227){
            biggest59227=ends[8];
          }
          if(biggest59227 == 1){
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
          }
          //FINXME code
          if(biggest59227 == 0){
            thread59228(tdone,ends);
            thread59229(tdone,ends);
            int biggest59230 = 0;
            if(ends[3]>=biggest59230){
              biggest59230=ends[3];
            }
            if(ends[8]>=biggest59230){
              biggest59230=ends[8];
            }
            if(biggest59230 == 1){
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
          }
        }
        break;
      
    }
  }

  public void thread59182(int [] tdone, int [] ends){
        S58458=1;
    if(fire.getprestatus()){//sysj\plant.sysj line: 136, column: 25
      unlock1GUI.setPresent();//sysj\plant.sysj line: 136, column: 31
      currsigs.addElement(unlock1GUI);
      unlock2GUI.setPresent();//sysj\plant.sysj line: 136, column: 48
      currsigs.addElement(unlock2GUI);
      unlock3GUI.setPresent();//sysj\plant.sysj line: 136, column: 65
      currsigs.addElement(unlock3GUI);
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

  public void thread59181(int [] tdone, int [] ends){
        S58447=1;
    if(zoneOcc7_t.getprestatus()){//sysj\plant.sysj line: 134, column: 25
      zoneOcc7GUI.setPresent();//sysj\plant.sysj line: 134, column: 37
      currsigs.addElement(zoneOcc7GUI);
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

  public void thread59180(int [] tdone, int [] ends){
        S58439=1;
    if(zoneOcc6_t.getprestatus()){//sysj\plant.sysj line: 132, column: 25
      zoneOcc6GUI.setPresent();//sysj\plant.sysj line: 132, column: 37
      currsigs.addElement(zoneOcc6GUI);
      proxLaserGUI.setPresent();//sysj\plant.sysj line: 132, column: 55
      currsigs.addElement(proxLaserGUI);
      absStopGUI.setPresent();//sysj\plant.sysj line: 132, column: 74
      currsigs.addElement(absStopGUI);
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

  public void thread59179(int [] tdone, int [] ends){
        S58428=1;
    if(zoneOcc5_t.getprestatus()){//sysj\plant.sysj line: 130, column: 25
      zoneOcc5GUI.setPresent();//sysj\plant.sysj line: 130, column: 37
      currsigs.addElement(zoneOcc5GUI);
      proxLaserGUI.setPresent();//sysj\plant.sysj line: 130, column: 55
      currsigs.addElement(proxLaserGUI);
      absStopGUI.setPresent();//sysj\plant.sysj line: 130, column: 74
      currsigs.addElement(absStopGUI);
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

  public void thread59178(int [] tdone, int [] ends){
        S58417=1;
    if(zoneOcc4_t.getprestatus()){//sysj\plant.sysj line: 128, column: 25
      zoneOcc4GUI.setPresent();//sysj\plant.sysj line: 128, column: 37
      currsigs.addElement(zoneOcc4GUI);
      proxLaserGUI.setPresent();//sysj\plant.sysj line: 128, column: 55
      currsigs.addElement(proxLaserGUI);
      absStopGUI.setPresent();//sysj\plant.sysj line: 128, column: 74
      currsigs.addElement(absStopGUI);
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

  public void thread59177(int [] tdone, int [] ends){
        S58406=1;
    if(zoneOcc3_t.getprestatus()){//sysj\plant.sysj line: 126, column: 25
      zoneOcc3GUI.setPresent();//sysj\plant.sysj line: 126, column: 37
      currsigs.addElement(zoneOcc3GUI);
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

  public void thread59176(int [] tdone, int [] ends){
        S58398=1;
    if(zoneOcc2_t.getprestatus()){//sysj\plant.sysj line: 124, column: 25
      zoneOcc2GUI.setPresent();//sysj\plant.sysj line: 124, column: 37
      currsigs.addElement(zoneOcc2GUI);
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

  public void thread59175(int [] tdone, int [] ends){
        S58390=1;
    if(zoneOcc1_t.getprestatus()){//sysj\plant.sysj line: 122, column: 25
      zoneOcc1GUI.setPresent();//sysj\plant.sysj line: 122, column: 37
      currsigs.addElement(zoneOcc1GUI);
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

  public void thread59174(int [] tdone, int [] ends){
        S58382=1;
    if(zoneOcc0_t.getprestatus()){//sysj\plant.sysj line: 120, column: 25
      zoneOcc0GUI.setPresent();//sysj\plant.sysj line: 120, column: 37
      currsigs.addElement(zoneOcc0GUI);
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

  public void thread59173(int [] tdone, int [] ends){
        S58374=1;
    if(accessManu_t.getprestatus()){//sysj\plant.sysj line: 118, column: 25
      accessManuGUI.setPresent();//sysj\plant.sysj line: 118, column: 39
      currsigs.addElement(accessManuGUI);
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

  public void thread59172(int [] tdone, int [] ends){
        S58366=1;
    if(accessOffice_t.getprestatus()){//sysj\plant.sysj line: 116, column: 25
      accessOfficeGUI.setPresent();//sysj\plant.sysj line: 116, column: 42
      currsigs.addElement(accessOfficeGUI);
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

  public void thread59171(int [] tdone, int [] ends){
        S58358=1;
    S58352=0;
    if(unlock1_t.getprestatus()){//sysj\plant.sysj line: 114, column: 25
      unlock1GUI.setPresent();//sysj\plant.sysj line: 114, column: 37
      currsigs.addElement(unlock1GUI);
      S58352=1;
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
    else {
      S58352=1;
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
  }

  public void thread59170(int [] tdone, int [] ends){
        S58460=1;
    thread59171(tdone,ends);
    thread59172(tdone,ends);
    thread59173(tdone,ends);
    thread59174(tdone,ends);
    thread59175(tdone,ends);
    thread59176(tdone,ends);
    thread59177(tdone,ends);
    thread59178(tdone,ends);
    thread59179(tdone,ends);
    thread59180(tdone,ends);
    thread59181(tdone,ends);
    thread59182(tdone,ends);
    int biggest59183 = 0;
    if(ends[17]>=biggest59183){
      biggest59183=ends[17];
    }
    if(ends[18]>=biggest59183){
      biggest59183=ends[18];
    }
    if(ends[19]>=biggest59183){
      biggest59183=ends[19];
    }
    if(ends[20]>=biggest59183){
      biggest59183=ends[20];
    }
    if(ends[21]>=biggest59183){
      biggest59183=ends[21];
    }
    if(ends[22]>=biggest59183){
      biggest59183=ends[22];
    }
    if(ends[23]>=biggest59183){
      biggest59183=ends[23];
    }
    if(ends[24]>=biggest59183){
      biggest59183=ends[24];
    }
    if(ends[25]>=biggest59183){
      biggest59183=ends[25];
    }
    if(ends[26]>=biggest59183){
      biggest59183=ends[26];
    }
    if(ends[27]>=biggest59183){
      biggest59183=ends[27];
    }
    if(ends[28]>=biggest59183){
      biggest59183=ends[28];
    }
    if(biggest59183 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread59168(int [] tdone, int [] ends){
        S57954=1;
    S57953=0;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread59167(int [] tdone, int [] ends){
        S57829=1;
    S57828=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread59166(int [] tdone, int [] ends){
        S58350=1;
    thread59167(tdone,ends);
    thread59168(tdone,ends);
    int biggest59169 = 0;
    if(ends[3]>=biggest59169){
      biggest59169=ends[3];
    }
    if(ends[8]>=biggest59169){
      biggest59169=ends[8];
    }
    if(biggest59169 == 1){
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
      switch(S59164){
        case 0 : 
          S59164=0;
          break RUN;
        
        case 1 : 
          S59164=2;
          S59164=2;
          new Thread(new GUI()).start();//sysj\plant.sysj line: 11, column: 2
          thread59166(tdone,ends);
          thread59170(tdone,ends);
          int biggest59184 = 0;
          if(ends[2]>=biggest59184){
            biggest59184=ends[2];
          }
          if(ends[16]>=biggest59184){
            biggest59184=ends[16];
          }
          if(biggest59184 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread59185(tdone,ends);
          thread59231(tdone,ends);
          int biggest59245 = 0;
          if(ends[2]>=biggest59245){
            biggest59245=ends[2];
          }
          if(ends[16]>=biggest59245){
            biggest59245=ends[16];
          }
          if(biggest59245 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest59245 == 0){
            S59164=0;
            active[1]=0;
            ends[1]=0;
            S59164=0;
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
          fire.gethook();
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
      fire.setpreclear();
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
      unlock1GUI.setpreclear();
      unlock2GUI.setpreclear();
      unlock3GUI.setpreclear();
      fire_t.setpreclear();
      unlock1_t.setpreclear();
      proxLaserGUI.setpreclear();
      absStopGUI.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = fire.getStatus() ? fire.setprepresent() : fire.setpreclear();
      fire.setpreval(fire.getValue());
      fire.setClear();
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
      unlock1GUI.sethook();
      unlock1GUI.setClear();
      unlock2GUI.sethook();
      unlock2GUI.setClear();
      unlock3GUI.sethook();
      unlock3GUI.setClear();
      fire_t.sethook();
      fire_t.setClear();
      unlock1_t.sethook();
      unlock1_t.setClear();
      proxLaserGUI.sethook();
      proxLaserGUI.setClear();
      absStopGUI.sethook();
      absStopGUI.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        fire.gethook();
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
