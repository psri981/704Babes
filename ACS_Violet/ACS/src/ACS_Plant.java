import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import run.ACS_GUI;//sysj\ACS_Plant.sysj line: 1, column: 1

public class ACS_Plant extends ClockDomain{
  public ACS_Plant(String name){super(name);}
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
  private int S59200 = 1;
  private int S58368 = 1;
  private int S57835 = 1;
  private int S57834 = 1;
  private int S57761 = 1;
  private int S57764 = 1;
  private int S57768 = 1;
  private int S57771 = 1;
  private int S57960 = 1;
  private int S57959 = 1;
  private int S57838 = 1;
  private int S57841 = 1;
  private int S57844 = 1;
  private int S57847 = 1;
  private int S57850 = 1;
  private int S57853 = 1;
  private int S57856 = 1;
  private int S58478 = 1;
  private int S58376 = 1;
  private int S58370 = 1;
  private int S58384 = 1;
  private int S58392 = 1;
  private int S58400 = 1;
  private int S58408 = 1;
  private int S58416 = 1;
  private int S58424 = 1;
  private int S58435 = 1;
  private int S58446 = 1;
  private int S58457 = 1;
  private int S58465 = 1;
  private int S58476 = 1;
  
  private int[] ends = new int[29];
  private int[] tdone = new int[29];
  
  public void thread59279(int [] tdone, int [] ends){
        switch(S58476){
      case 0 : 
        active[28]=0;
        ends[28]=0;
        tdone[28]=1;
        break;
      
      case 1 : 
        if(fire.getprestatus()){//sysj\ACS_Plant.sysj line: 119, column: 25
          unlock1GUI.setPresent();//sysj\ACS_Plant.sysj line: 119, column: 31
          currsigs.addElement(unlock1GUI);
          unlock2GUI.setPresent();//sysj\ACS_Plant.sysj line: 119, column: 48
          currsigs.addElement(unlock2GUI);
          unlock3GUI.setPresent();//sysj\ACS_Plant.sysj line: 119, column: 65
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

  public void thread59278(int [] tdone, int [] ends){
        switch(S58465){
      case 0 : 
        active[27]=0;
        ends[27]=0;
        tdone[27]=1;
        break;
      
      case 1 : 
        if(zoneOcc7_t.getprestatus()){//sysj\ACS_Plant.sysj line: 117, column: 25
          zoneOcc7GUI.setPresent();//sysj\ACS_Plant.sysj line: 117, column: 37
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

  public void thread59277(int [] tdone, int [] ends){
        switch(S58457){
      case 0 : 
        active[26]=0;
        ends[26]=0;
        tdone[26]=1;
        break;
      
      case 1 : 
        if(zoneOcc6_t.getprestatus()){//sysj\ACS_Plant.sysj line: 115, column: 25
          zoneOcc6GUI.setPresent();//sysj\ACS_Plant.sysj line: 115, column: 37
          currsigs.addElement(zoneOcc6GUI);
          proxLaserGUI.setPresent();//sysj\ACS_Plant.sysj line: 115, column: 55
          currsigs.addElement(proxLaserGUI);
          absStopGUI.setPresent();//sysj\ACS_Plant.sysj line: 115, column: 74
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

  public void thread59276(int [] tdone, int [] ends){
        switch(S58446){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        if(zoneOcc5_t.getprestatus()){//sysj\ACS_Plant.sysj line: 113, column: 25
          zoneOcc5GUI.setPresent();//sysj\ACS_Plant.sysj line: 113, column: 37
          currsigs.addElement(zoneOcc5GUI);
          proxLaserGUI.setPresent();//sysj\ACS_Plant.sysj line: 113, column: 55
          currsigs.addElement(proxLaserGUI);
          absStopGUI.setPresent();//sysj\ACS_Plant.sysj line: 113, column: 74
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

  public void thread59275(int [] tdone, int [] ends){
        switch(S58435){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        if(zoneOcc4_t.getprestatus()){//sysj\ACS_Plant.sysj line: 111, column: 25
          zoneOcc4GUI.setPresent();//sysj\ACS_Plant.sysj line: 111, column: 37
          currsigs.addElement(zoneOcc4GUI);
          proxLaserGUI.setPresent();//sysj\ACS_Plant.sysj line: 111, column: 55
          currsigs.addElement(proxLaserGUI);
          absStopGUI.setPresent();//sysj\ACS_Plant.sysj line: 111, column: 74
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

  public void thread59274(int [] tdone, int [] ends){
        switch(S58424){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        if(zoneOcc3_t.getprestatus()){//sysj\ACS_Plant.sysj line: 109, column: 25
          zoneOcc3GUI.setPresent();//sysj\ACS_Plant.sysj line: 109, column: 37
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

  public void thread59273(int [] tdone, int [] ends){
        switch(S58416){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        if(zoneOcc2_t.getprestatus()){//sysj\ACS_Plant.sysj line: 107, column: 25
          zoneOcc2GUI.setPresent();//sysj\ACS_Plant.sysj line: 107, column: 37
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

  public void thread59272(int [] tdone, int [] ends){
        switch(S58408){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        if(zoneOcc1_t.getprestatus()){//sysj\ACS_Plant.sysj line: 105, column: 25
          zoneOcc1GUI.setPresent();//sysj\ACS_Plant.sysj line: 105, column: 37
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

  public void thread59271(int [] tdone, int [] ends){
        switch(S58400){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        if(zoneOcc0_t.getprestatus()){//sysj\ACS_Plant.sysj line: 103, column: 25
          zoneOcc0GUI.setPresent();//sysj\ACS_Plant.sysj line: 103, column: 37
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

  public void thread59270(int [] tdone, int [] ends){
        switch(S58392){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        if(accessManu_t.getprestatus()){//sysj\ACS_Plant.sysj line: 101, column: 25
          accessManuGUI.setPresent();//sysj\ACS_Plant.sysj line: 101, column: 39
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

  public void thread59269(int [] tdone, int [] ends){
        switch(S58384){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        if(accessOffice_t.getprestatus()){//sysj\ACS_Plant.sysj line: 99, column: 25
          accessOfficeGUI.setPresent();//sysj\ACS_Plant.sysj line: 99, column: 42
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

  public void thread59268(int [] tdone, int [] ends){
        switch(S58376){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        switch(S58370){
          case 0 : 
            S58370=0;
            if(unlock1_t.getprestatus()){//sysj\ACS_Plant.sysj line: 97, column: 25
              unlock1GUI.setPresent();//sysj\ACS_Plant.sysj line: 97, column: 37
              currsigs.addElement(unlock1GUI);
              S58370=1;
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            else {
              S58370=1;
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            break;
          
          case 1 : 
            S58370=1;
            S58370=0;
            if(unlock1_t.getprestatus()){//sysj\ACS_Plant.sysj line: 97, column: 25
              unlock1GUI.setPresent();//sysj\ACS_Plant.sysj line: 97, column: 37
              currsigs.addElement(unlock1GUI);
              S58370=1;
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            else {
              S58370=1;
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread59267(int [] tdone, int [] ends){
        switch(S58478){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        thread59268(tdone,ends);
        thread59269(tdone,ends);
        thread59270(tdone,ends);
        thread59271(tdone,ends);
        thread59272(tdone,ends);
        thread59273(tdone,ends);
        thread59274(tdone,ends);
        thread59275(tdone,ends);
        thread59276(tdone,ends);
        thread59277(tdone,ends);
        thread59278(tdone,ends);
        thread59279(tdone,ends);
        int biggest59280 = 0;
        if(ends[17]>=biggest59280){
          biggest59280=ends[17];
        }
        if(ends[18]>=biggest59280){
          biggest59280=ends[18];
        }
        if(ends[19]>=biggest59280){
          biggest59280=ends[19];
        }
        if(ends[20]>=biggest59280){
          biggest59280=ends[20];
        }
        if(ends[21]>=biggest59280){
          biggest59280=ends[21];
        }
        if(ends[22]>=biggest59280){
          biggest59280=ends[22];
        }
        if(ends[23]>=biggest59280){
          biggest59280=ends[23];
        }
        if(ends[24]>=biggest59280){
          biggest59280=ends[24];
        }
        if(ends[25]>=biggest59280){
          biggest59280=ends[25];
        }
        if(ends[26]>=biggest59280){
          biggest59280=ends[26];
        }
        if(ends[27]>=biggest59280){
          biggest59280=ends[27];
        }
        if(ends[28]>=biggest59280){
          biggest59280=ends[28];
        }
        if(biggest59280 == 1){
          active[16]=1;
          ends[16]=1;
          tdone[16]=1;
        }
        //FINXME code
        if(biggest59280 == 0){
          S58478=0;
          active[16]=0;
          ends[16]=0;
          tdone[16]=1;
        }
        break;
      
    }
  }

  public void thread59265(int [] tdone, int [] ends){
        S57960=1;
    S57959=0;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread59264(int [] tdone, int [] ends){
        S57835=1;
    S57834=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread59261(int [] tdone, int [] ends){
        S57856=1;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread59260(int [] tdone, int [] ends){
        S57853=1;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread59259(int [] tdone, int [] ends){
        S57850=1;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread59258(int [] tdone, int [] ends){
        S57847=1;
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread59257(int [] tdone, int [] ends){
        S57844=1;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread59256(int [] tdone, int [] ends){
        S57841=1;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread59255(int [] tdone, int [] ends){
        S57838=1;
    accessManu_t.setPresent();//sysj\ACS_Plant.sysj line: 52, column: 9
    currsigs.addElement(accessManu_t);
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread59253(int [] tdone, int [] ends){
        switch(S57856){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(zoneOcc6.getprestatus()){//sysj\ACS_Plant.sysj line: 82, column: 15
          zoneOcc6_t.setPresent();//sysj\ACS_Plant.sysj line: 83, column: 9
          currsigs.addElement(zoneOcc6_t);
          S57856=0;
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

  public void thread59252(int [] tdone, int [] ends){
        switch(S57853){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(zoneOcc5.getprestatus()){//sysj\ACS_Plant.sysj line: 77, column: 15
          zoneOcc5_t.setPresent();//sysj\ACS_Plant.sysj line: 78, column: 9
          currsigs.addElement(zoneOcc5_t);
          S57853=0;
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

  public void thread59251(int [] tdone, int [] ends){
        switch(S57850){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(zoneOcc4.getprestatus()){//sysj\ACS_Plant.sysj line: 72, column: 15
          zoneOcc4_t.setPresent();//sysj\ACS_Plant.sysj line: 73, column: 9
          currsigs.addElement(zoneOcc4_t);
          S57850=0;
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

  public void thread59250(int [] tdone, int [] ends){
        switch(S57847){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(zoneOcc3.getprestatus()){//sysj\ACS_Plant.sysj line: 67, column: 15
          zoneOcc3_t.setPresent();//sysj\ACS_Plant.sysj line: 68, column: 9
          currsigs.addElement(zoneOcc3_t);
          S57847=0;
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

  public void thread59249(int [] tdone, int [] ends){
        switch(S57844){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(zoneOcc2.getprestatus()){//sysj\ACS_Plant.sysj line: 62, column: 15
          zoneOcc2_t.setPresent();//sysj\ACS_Plant.sysj line: 63, column: 9
          currsigs.addElement(zoneOcc2_t);
          S57844=0;
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

  public void thread59248(int [] tdone, int [] ends){
        switch(S57841){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(zoneOcc0.getprestatus()){//sysj\ACS_Plant.sysj line: 57, column: 15
          zoneOcc0_t.setPresent();//sysj\ACS_Plant.sysj line: 58, column: 9
          currsigs.addElement(zoneOcc0_t);
          S57841=0;
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

  public void thread59247(int [] tdone, int [] ends){
        switch(S57838){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        S57838=0;
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
    }
  }

  public void thread59245(int [] tdone, int [] ends){
        S57856=1;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread59244(int [] tdone, int [] ends){
        S57853=1;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread59243(int [] tdone, int [] ends){
        S57850=1;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread59242(int [] tdone, int [] ends){
        S57847=1;
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread59241(int [] tdone, int [] ends){
        S57844=1;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread59240(int [] tdone, int [] ends){
        S57841=1;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread59239(int [] tdone, int [] ends){
        S57838=1;
    accessManu_t.setPresent();//sysj\ACS_Plant.sysj line: 52, column: 9
    currsigs.addElement(accessManu_t);
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread59238(int [] tdone, int [] ends){
        switch(S57960){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S57959){
          case 0 : 
            if(accessManu.getprestatus()){//sysj\ACS_Plant.sysj line: 47, column: 12
              S57959=1;
              thread59239(tdone,ends);
              thread59240(tdone,ends);
              thread59241(tdone,ends);
              thread59242(tdone,ends);
              thread59243(tdone,ends);
              thread59244(tdone,ends);
              thread59245(tdone,ends);
              int biggest59246 = 0;
              if(ends[9]>=biggest59246){
                biggest59246=ends[9];
              }
              if(ends[10]>=biggest59246){
                biggest59246=ends[10];
              }
              if(ends[11]>=biggest59246){
                biggest59246=ends[11];
              }
              if(ends[12]>=biggest59246){
                biggest59246=ends[12];
              }
              if(ends[13]>=biggest59246){
                biggest59246=ends[13];
              }
              if(ends[14]>=biggest59246){
                biggest59246=ends[14];
              }
              if(ends[15]>=biggest59246){
                biggest59246=ends[15];
              }
              if(biggest59246 == 1){
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
            if(accessOffice.getprestatus()){//sysj\ACS_Plant.sysj line: 48, column: 12
              S57959=2;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              thread59247(tdone,ends);
              thread59248(tdone,ends);
              thread59249(tdone,ends);
              thread59250(tdone,ends);
              thread59251(tdone,ends);
              thread59252(tdone,ends);
              thread59253(tdone,ends);
              int biggest59254 = 0;
              if(ends[9]>=biggest59254){
                biggest59254=ends[9];
              }
              if(ends[10]>=biggest59254){
                biggest59254=ends[10];
              }
              if(ends[11]>=biggest59254){
                biggest59254=ends[11];
              }
              if(ends[12]>=biggest59254){
                biggest59254=ends[12];
              }
              if(ends[13]>=biggest59254){
                biggest59254=ends[13];
              }
              if(ends[14]>=biggest59254){
                biggest59254=ends[14];
              }
              if(ends[15]>=biggest59254){
                biggest59254=ends[15];
              }
              if(biggest59254 == 1){
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
              //FINXME code
              if(biggest59254 == 0){
                thread59255(tdone,ends);
                thread59256(tdone,ends);
                thread59257(tdone,ends);
                thread59258(tdone,ends);
                thread59259(tdone,ends);
                thread59260(tdone,ends);
                thread59261(tdone,ends);
                int biggest59262 = 0;
                if(ends[9]>=biggest59262){
                  biggest59262=ends[9];
                }
                if(ends[10]>=biggest59262){
                  biggest59262=ends[10];
                }
                if(ends[11]>=biggest59262){
                  biggest59262=ends[11];
                }
                if(ends[12]>=biggest59262){
                  biggest59262=ends[12];
                }
                if(ends[13]>=biggest59262){
                  biggest59262=ends[13];
                }
                if(ends[14]>=biggest59262){
                  biggest59262=ends[14];
                }
                if(ends[15]>=biggest59262){
                  biggest59262=ends[15];
                }
                if(biggest59262 == 1){
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
              }
            }
            break;
          
          case 2 : 
            S57959=2;
            S57960=0;
            active[8]=0;
            ends[8]=0;
            tdone[8]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread59236(int [] tdone, int [] ends){
        S57771=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread59235(int [] tdone, int [] ends){
        S57768=1;
    System.out.println("what");//sysj\ACS_Plant.sysj line: 32, column: 9
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread59234(int [] tdone, int [] ends){
        S57764=1;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread59233(int [] tdone, int [] ends){
        S57761=1;
    accessOffice_t.setPresent();//sysj\ACS_Plant.sysj line: 22, column: 9
    currsigs.addElement(accessOffice_t);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread59231(int [] tdone, int [] ends){
        switch(S57771){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(zoneOcc7.getprestatus()){//sysj\ACS_Plant.sysj line: 38, column: 15
          zoneOcc7_t.setPresent();//sysj\ACS_Plant.sysj line: 39, column: 9
          currsigs.addElement(zoneOcc7_t);
          S57771=0;
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

  public void thread59230(int [] tdone, int [] ends){
        switch(S57768){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(zoneOcc1.getprestatus()){//sysj\ACS_Plant.sysj line: 33, column: 15
          zoneOcc1_t.setPresent();//sysj\ACS_Plant.sysj line: 34, column: 9
          currsigs.addElement(zoneOcc1_t);
          S57768=0;
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

  public void thread59229(int [] tdone, int [] ends){
        switch(S57764){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(zoneOcc0.getprestatus()){//sysj\ACS_Plant.sysj line: 27, column: 15
          zoneOcc0_t.setPresent();//sysj\ACS_Plant.sysj line: 28, column: 9
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

  public void thread59228(int [] tdone, int [] ends){
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

  public void thread59226(int [] tdone, int [] ends){
        S57771=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread59225(int [] tdone, int [] ends){
        S57768=1;
    System.out.println("what");//sysj\ACS_Plant.sysj line: 32, column: 9
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread59224(int [] tdone, int [] ends){
        S57764=1;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread59223(int [] tdone, int [] ends){
        S57761=1;
    accessOffice_t.setPresent();//sysj\ACS_Plant.sysj line: 22, column: 9
    currsigs.addElement(accessOffice_t);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread59222(int [] tdone, int [] ends){
        switch(S57835){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S57834){
          case 0 : 
            if(accessOffice.getprestatus()){//sysj\ACS_Plant.sysj line: 18, column: 12
              S57834=1;
              thread59223(tdone,ends);
              thread59224(tdone,ends);
              thread59225(tdone,ends);
              thread59226(tdone,ends);
              int biggest59227 = 0;
              if(ends[4]>=biggest59227){
                biggest59227=ends[4];
              }
              if(ends[5]>=biggest59227){
                biggest59227=ends[5];
              }
              if(ends[6]>=biggest59227){
                biggest59227=ends[6];
              }
              if(ends[7]>=biggest59227){
                biggest59227=ends[7];
              }
              if(biggest59227 == 1){
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
            if(accessManu.getprestatus()){//sysj\ACS_Plant.sysj line: 19, column: 12
              S57834=2;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              thread59228(tdone,ends);
              thread59229(tdone,ends);
              thread59230(tdone,ends);
              thread59231(tdone,ends);
              int biggest59232 = 0;
              if(ends[4]>=biggest59232){
                biggest59232=ends[4];
              }
              if(ends[5]>=biggest59232){
                biggest59232=ends[5];
              }
              if(ends[6]>=biggest59232){
                biggest59232=ends[6];
              }
              if(ends[7]>=biggest59232){
                biggest59232=ends[7];
              }
              if(biggest59232 == 1){
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
              //FINXME code
              if(biggest59232 == 0){
                thread59233(tdone,ends);
                thread59234(tdone,ends);
                thread59235(tdone,ends);
                thread59236(tdone,ends);
                int biggest59237 = 0;
                if(ends[4]>=biggest59237){
                  biggest59237=ends[4];
                }
                if(ends[5]>=biggest59237){
                  biggest59237=ends[5];
                }
                if(ends[6]>=biggest59237){
                  biggest59237=ends[6];
                }
                if(ends[7]>=biggest59237){
                  biggest59237=ends[7];
                }
                if(biggest59237 == 1){
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
              }
            }
            break;
          
          case 2 : 
            S57834=2;
            S57835=0;
            active[3]=0;
            ends[3]=0;
            tdone[3]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread59221(int [] tdone, int [] ends){
        switch(S58368){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        if(fire.getprestatus()){//sysj\ACS_Plant.sysj line: 15, column: 9
          S58368=0;
          active[2]=0;
          ends[2]=0;
          tdone[2]=1;
        }
        else {
          thread59222(tdone,ends);
          thread59238(tdone,ends);
          int biggest59263 = 0;
          if(ends[3]>=biggest59263){
            biggest59263=ends[3];
          }
          if(ends[8]>=biggest59263){
            biggest59263=ends[8];
          }
          if(biggest59263 == 1){
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
          }
          //FINXME code
          if(biggest59263 == 0){
            thread59264(tdone,ends);
            thread59265(tdone,ends);
            int biggest59266 = 0;
            if(ends[3]>=biggest59266){
              biggest59266=ends[3];
            }
            if(ends[8]>=biggest59266){
              biggest59266=ends[8];
            }
            if(biggest59266 == 1){
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
          }
        }
        break;
      
    }
  }

  public void thread59218(int [] tdone, int [] ends){
        S58476=1;
    if(fire.getprestatus()){//sysj\ACS_Plant.sysj line: 119, column: 25
      unlock1GUI.setPresent();//sysj\ACS_Plant.sysj line: 119, column: 31
      currsigs.addElement(unlock1GUI);
      unlock2GUI.setPresent();//sysj\ACS_Plant.sysj line: 119, column: 48
      currsigs.addElement(unlock2GUI);
      unlock3GUI.setPresent();//sysj\ACS_Plant.sysj line: 119, column: 65
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

  public void thread59217(int [] tdone, int [] ends){
        S58465=1;
    if(zoneOcc7_t.getprestatus()){//sysj\ACS_Plant.sysj line: 117, column: 25
      zoneOcc7GUI.setPresent();//sysj\ACS_Plant.sysj line: 117, column: 37
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

  public void thread59216(int [] tdone, int [] ends){
        S58457=1;
    if(zoneOcc6_t.getprestatus()){//sysj\ACS_Plant.sysj line: 115, column: 25
      zoneOcc6GUI.setPresent();//sysj\ACS_Plant.sysj line: 115, column: 37
      currsigs.addElement(zoneOcc6GUI);
      proxLaserGUI.setPresent();//sysj\ACS_Plant.sysj line: 115, column: 55
      currsigs.addElement(proxLaserGUI);
      absStopGUI.setPresent();//sysj\ACS_Plant.sysj line: 115, column: 74
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

  public void thread59215(int [] tdone, int [] ends){
        S58446=1;
    if(zoneOcc5_t.getprestatus()){//sysj\ACS_Plant.sysj line: 113, column: 25
      zoneOcc5GUI.setPresent();//sysj\ACS_Plant.sysj line: 113, column: 37
      currsigs.addElement(zoneOcc5GUI);
      proxLaserGUI.setPresent();//sysj\ACS_Plant.sysj line: 113, column: 55
      currsigs.addElement(proxLaserGUI);
      absStopGUI.setPresent();//sysj\ACS_Plant.sysj line: 113, column: 74
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

  public void thread59214(int [] tdone, int [] ends){
        S58435=1;
    if(zoneOcc4_t.getprestatus()){//sysj\ACS_Plant.sysj line: 111, column: 25
      zoneOcc4GUI.setPresent();//sysj\ACS_Plant.sysj line: 111, column: 37
      currsigs.addElement(zoneOcc4GUI);
      proxLaserGUI.setPresent();//sysj\ACS_Plant.sysj line: 111, column: 55
      currsigs.addElement(proxLaserGUI);
      absStopGUI.setPresent();//sysj\ACS_Plant.sysj line: 111, column: 74
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

  public void thread59213(int [] tdone, int [] ends){
        S58424=1;
    if(zoneOcc3_t.getprestatus()){//sysj\ACS_Plant.sysj line: 109, column: 25
      zoneOcc3GUI.setPresent();//sysj\ACS_Plant.sysj line: 109, column: 37
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

  public void thread59212(int [] tdone, int [] ends){
        S58416=1;
    if(zoneOcc2_t.getprestatus()){//sysj\ACS_Plant.sysj line: 107, column: 25
      zoneOcc2GUI.setPresent();//sysj\ACS_Plant.sysj line: 107, column: 37
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

  public void thread59211(int [] tdone, int [] ends){
        S58408=1;
    if(zoneOcc1_t.getprestatus()){//sysj\ACS_Plant.sysj line: 105, column: 25
      zoneOcc1GUI.setPresent();//sysj\ACS_Plant.sysj line: 105, column: 37
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

  public void thread59210(int [] tdone, int [] ends){
        S58400=1;
    if(zoneOcc0_t.getprestatus()){//sysj\ACS_Plant.sysj line: 103, column: 25
      zoneOcc0GUI.setPresent();//sysj\ACS_Plant.sysj line: 103, column: 37
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

  public void thread59209(int [] tdone, int [] ends){
        S58392=1;
    if(accessManu_t.getprestatus()){//sysj\ACS_Plant.sysj line: 101, column: 25
      accessManuGUI.setPresent();//sysj\ACS_Plant.sysj line: 101, column: 39
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

  public void thread59208(int [] tdone, int [] ends){
        S58384=1;
    if(accessOffice_t.getprestatus()){//sysj\ACS_Plant.sysj line: 99, column: 25
      accessOfficeGUI.setPresent();//sysj\ACS_Plant.sysj line: 99, column: 42
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

  public void thread59207(int [] tdone, int [] ends){
        S58376=1;
    S58370=0;
    if(unlock1_t.getprestatus()){//sysj\ACS_Plant.sysj line: 97, column: 25
      unlock1GUI.setPresent();//sysj\ACS_Plant.sysj line: 97, column: 37
      currsigs.addElement(unlock1GUI);
      S58370=1;
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
    else {
      S58370=1;
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
  }

  public void thread59206(int [] tdone, int [] ends){
        S58478=1;
    thread59207(tdone,ends);
    thread59208(tdone,ends);
    thread59209(tdone,ends);
    thread59210(tdone,ends);
    thread59211(tdone,ends);
    thread59212(tdone,ends);
    thread59213(tdone,ends);
    thread59214(tdone,ends);
    thread59215(tdone,ends);
    thread59216(tdone,ends);
    thread59217(tdone,ends);
    thread59218(tdone,ends);
    int biggest59219 = 0;
    if(ends[17]>=biggest59219){
      biggest59219=ends[17];
    }
    if(ends[18]>=biggest59219){
      biggest59219=ends[18];
    }
    if(ends[19]>=biggest59219){
      biggest59219=ends[19];
    }
    if(ends[20]>=biggest59219){
      biggest59219=ends[20];
    }
    if(ends[21]>=biggest59219){
      biggest59219=ends[21];
    }
    if(ends[22]>=biggest59219){
      biggest59219=ends[22];
    }
    if(ends[23]>=biggest59219){
      biggest59219=ends[23];
    }
    if(ends[24]>=biggest59219){
      biggest59219=ends[24];
    }
    if(ends[25]>=biggest59219){
      biggest59219=ends[25];
    }
    if(ends[26]>=biggest59219){
      biggest59219=ends[26];
    }
    if(ends[27]>=biggest59219){
      biggest59219=ends[27];
    }
    if(ends[28]>=biggest59219){
      biggest59219=ends[28];
    }
    if(biggest59219 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread59204(int [] tdone, int [] ends){
        S57960=1;
    S57959=0;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread59203(int [] tdone, int [] ends){
        S57835=1;
    S57834=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread59202(int [] tdone, int [] ends){
        S58368=1;
    thread59203(tdone,ends);
    thread59204(tdone,ends);
    int biggest59205 = 0;
    if(ends[3]>=biggest59205){
      biggest59205=ends[3];
    }
    if(ends[8]>=biggest59205){
      biggest59205=ends[8];
    }
    if(biggest59205 == 1){
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
      switch(S59200){
        case 0 : 
          S59200=0;
          break RUN;
        
        case 1 : 
          S59200=2;
          S59200=2;
          new Thread(new ACS_GUI()).start();//sysj\ACS_Plant.sysj line: 11, column: 2
          thread59202(tdone,ends);
          thread59206(tdone,ends);
          int biggest59220 = 0;
          if(ends[2]>=biggest59220){
            biggest59220=ends[2];
          }
          if(ends[16]>=biggest59220){
            biggest59220=ends[16];
          }
          if(biggest59220 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread59221(tdone,ends);
          thread59267(tdone,ends);
          int biggest59281 = 0;
          if(ends[2]>=biggest59281){
            biggest59281=ends[2];
          }
          if(ends[16]>=biggest59281){
            biggest59281=ends[16];
          }
          if(biggest59281 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest59281 == 0){
            S59200=0;
            active[1]=0;
            ends[1]=0;
            S59200=0;
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
