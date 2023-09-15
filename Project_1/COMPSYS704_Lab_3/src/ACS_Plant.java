import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import run.GUI;//sysj\plant.sysj line: 1, column: 1
import run.POS_GUI;//sysj\plant.sysj line: 2, column: 1
import run.ECS_GUI;//sysj\plant.sysj line: 3, column: 1
import run.ACS_GUI;//sysj\plant.sysj line: 4, column: 1

public class ACS_Plant extends ClockDomain{
  public ACS_Plant(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal modeManual = new Signal("modeManual", Signal.INPUT);
  public Signal modeAutomatic = new Signal("modeAutomatic", Signal.INPUT);
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
  public Signal modeManual_t = new Signal("modeManual_t", Signal.OUTPUT);
  public Signal modeAutomatic_t = new Signal("modeAutomatic_t", Signal.OUTPUT);
  public Signal accessManu_t = new Signal("accessManu_t", Signal.OUTPUT);
  public Signal accessOffice_t = new Signal("accessOffice_t", Signal.OUTPUT);
  public Signal modeManualGUI = new Signal("modeManualGUI", Signal.OUTPUT);
  public Signal modeAutomaticGUI = new Signal("modeAutomaticGUI", Signal.OUTPUT);
  public Signal unlock1GUI = new Signal("unlock1GUI", Signal.OUTPUT);
  public Signal unlock2GUI = new Signal("unlock2GUI", Signal.OUTPUT);
  public Signal unlock3GUI = new Signal("unlock3GUI", Signal.OUTPUT);
  public Signal fire_t = new Signal("fire_t", Signal.OUTPUT);
  public Signal unlock1_t = new Signal("unlock1_t", Signal.OUTPUT);
  public Signal proxLaserGUI = new Signal("proxLaserGUI", Signal.OUTPUT);
  public Signal absStopGUI = new Signal("absStopGUI", Signal.OUTPUT);
  private int S69504 = 1;
  private int S68066 = 1;
  private int S66953 = 1;
  private int S66952 = 1;
  private int S66885 = 1;
  private int S66888 = 1;
  private int S66891 = 1;
  private int S66894 = 1;
  private int S67078 = 1;
  private int S67077 = 1;
  private int S66956 = 1;
  private int S66959 = 1;
  private int S66962 = 1;
  private int S66965 = 1;
  private int S66968 = 1;
  private int S66971 = 1;
  private int S66974 = 1;
  private int S68192 = 1;
  private int S68074 = 1;
  private int S68082 = 1;
  private int S68090 = 1;
  private int S68098 = 1;
  private int S68106 = 1;
  private int S68114 = 1;
  private int S68122 = 1;
  private int S68133 = 1;
  private int S68144 = 1;
  private int S68155 = 1;
  private int S68163 = 1;
  private int S68174 = 1;
  private int S68182 = 1;
  private int S68190 = 1;
  
  private int[] ends = new int[67];
  private int[] tdone = new int[67];
  
  public void thread69663(int [] tdone, int [] ends){
        switch(S68190){
      case 0 : 
        active[66]=0;
        ends[66]=0;
        tdone[66]=1;
        break;
      
      case 1 : 
        if(modeAutomatic_t.getprestatus()){//sysj\plant.sysj line: 545, column: 25
          modeAutomaticGUI.setPresent();//sysj\plant.sysj line: 545, column: 42
          currsigs.addElement(modeAutomaticGUI);
          active[66]=1;
          ends[66]=1;
          tdone[66]=1;
        }
        else {
          active[66]=1;
          ends[66]=1;
          tdone[66]=1;
        }
        break;
      
    }
  }

  public void thread69662(int [] tdone, int [] ends){
        switch(S68182){
      case 0 : 
        active[65]=0;
        ends[65]=0;
        tdone[65]=1;
        break;
      
      case 1 : 
        if(modeManual_t.getprestatus()){//sysj\plant.sysj line: 543, column: 25
          modeManualGUI.setPresent();//sysj\plant.sysj line: 543, column: 39
          currsigs.addElement(modeManualGUI);
          active[65]=1;
          ends[65]=1;
          tdone[65]=1;
        }
        else {
          active[65]=1;
          ends[65]=1;
          tdone[65]=1;
        }
        break;
      
    }
  }

  public void thread69661(int [] tdone, int [] ends){
        switch(S68174){
      case 0 : 
        active[64]=0;
        ends[64]=0;
        tdone[64]=1;
        break;
      
      case 1 : 
        if(fire.getprestatus()){//sysj\plant.sysj line: 541, column: 25
          unlock1GUI.setPresent();//sysj\plant.sysj line: 541, column: 31
          currsigs.addElement(unlock1GUI);
          unlock2GUI.setPresent();//sysj\plant.sysj line: 541, column: 48
          currsigs.addElement(unlock2GUI);
          unlock3GUI.setPresent();//sysj\plant.sysj line: 541, column: 65
          currsigs.addElement(unlock3GUI);
          active[64]=1;
          ends[64]=1;
          tdone[64]=1;
        }
        else {
          active[64]=1;
          ends[64]=1;
          tdone[64]=1;
        }
        break;
      
    }
  }

  public void thread69660(int [] tdone, int [] ends){
        switch(S68163){
      case 0 : 
        active[63]=0;
        ends[63]=0;
        tdone[63]=1;
        break;
      
      case 1 : 
        if(zoneOcc7_t.getprestatus()){//sysj\plant.sysj line: 539, column: 25
          zoneOcc7GUI.setPresent();//sysj\plant.sysj line: 539, column: 37
          currsigs.addElement(zoneOcc7GUI);
          active[63]=1;
          ends[63]=1;
          tdone[63]=1;
        }
        else {
          active[63]=1;
          ends[63]=1;
          tdone[63]=1;
        }
        break;
      
    }
  }

  public void thread69659(int [] tdone, int [] ends){
        switch(S68155){
      case 0 : 
        active[62]=0;
        ends[62]=0;
        tdone[62]=1;
        break;
      
      case 1 : 
        if(zoneOcc6_t.getprestatus()){//sysj\plant.sysj line: 537, column: 25
          zoneOcc6GUI.setPresent();//sysj\plant.sysj line: 537, column: 37
          currsigs.addElement(zoneOcc6GUI);
          proxLaserGUI.setPresent();//sysj\plant.sysj line: 537, column: 55
          currsigs.addElement(proxLaserGUI);
          absStopGUI.setPresent();//sysj\plant.sysj line: 537, column: 74
          currsigs.addElement(absStopGUI);
          active[62]=1;
          ends[62]=1;
          tdone[62]=1;
        }
        else {
          active[62]=1;
          ends[62]=1;
          tdone[62]=1;
        }
        break;
      
    }
  }

  public void thread69658(int [] tdone, int [] ends){
        switch(S68144){
      case 0 : 
        active[61]=0;
        ends[61]=0;
        tdone[61]=1;
        break;
      
      case 1 : 
        if(zoneOcc5_t.getprestatus()){//sysj\plant.sysj line: 535, column: 25
          zoneOcc5GUI.setPresent();//sysj\plant.sysj line: 535, column: 37
          currsigs.addElement(zoneOcc5GUI);
          proxLaserGUI.setPresent();//sysj\plant.sysj line: 535, column: 55
          currsigs.addElement(proxLaserGUI);
          absStopGUI.setPresent();//sysj\plant.sysj line: 535, column: 74
          currsigs.addElement(absStopGUI);
          active[61]=1;
          ends[61]=1;
          tdone[61]=1;
        }
        else {
          active[61]=1;
          ends[61]=1;
          tdone[61]=1;
        }
        break;
      
    }
  }

  public void thread69657(int [] tdone, int [] ends){
        switch(S68133){
      case 0 : 
        active[60]=0;
        ends[60]=0;
        tdone[60]=1;
        break;
      
      case 1 : 
        if(zoneOcc4_t.getprestatus()){//sysj\plant.sysj line: 533, column: 25
          zoneOcc4GUI.setPresent();//sysj\plant.sysj line: 533, column: 37
          currsigs.addElement(zoneOcc4GUI);
          proxLaserGUI.setPresent();//sysj\plant.sysj line: 533, column: 55
          currsigs.addElement(proxLaserGUI);
          absStopGUI.setPresent();//sysj\plant.sysj line: 533, column: 74
          currsigs.addElement(absStopGUI);
          active[60]=1;
          ends[60]=1;
          tdone[60]=1;
        }
        else {
          active[60]=1;
          ends[60]=1;
          tdone[60]=1;
        }
        break;
      
    }
  }

  public void thread69656(int [] tdone, int [] ends){
        switch(S68122){
      case 0 : 
        active[59]=0;
        ends[59]=0;
        tdone[59]=1;
        break;
      
      case 1 : 
        if(zoneOcc3_t.getprestatus()){//sysj\plant.sysj line: 531, column: 25
          zoneOcc3GUI.setPresent();//sysj\plant.sysj line: 531, column: 37
          currsigs.addElement(zoneOcc3GUI);
          active[59]=1;
          ends[59]=1;
          tdone[59]=1;
        }
        else {
          active[59]=1;
          ends[59]=1;
          tdone[59]=1;
        }
        break;
      
    }
  }

  public void thread69655(int [] tdone, int [] ends){
        switch(S68114){
      case 0 : 
        active[58]=0;
        ends[58]=0;
        tdone[58]=1;
        break;
      
      case 1 : 
        if(zoneOcc2_t.getprestatus()){//sysj\plant.sysj line: 529, column: 25
          zoneOcc2GUI.setPresent();//sysj\plant.sysj line: 529, column: 37
          currsigs.addElement(zoneOcc2GUI);
          active[58]=1;
          ends[58]=1;
          tdone[58]=1;
        }
        else {
          active[58]=1;
          ends[58]=1;
          tdone[58]=1;
        }
        break;
      
    }
  }

  public void thread69654(int [] tdone, int [] ends){
        switch(S68106){
      case 0 : 
        active[57]=0;
        ends[57]=0;
        tdone[57]=1;
        break;
      
      case 1 : 
        if(zoneOcc1_t.getprestatus()){//sysj\plant.sysj line: 527, column: 25
          zoneOcc1GUI.setPresent();//sysj\plant.sysj line: 527, column: 37
          currsigs.addElement(zoneOcc1GUI);
          active[57]=1;
          ends[57]=1;
          tdone[57]=1;
        }
        else {
          active[57]=1;
          ends[57]=1;
          tdone[57]=1;
        }
        break;
      
    }
  }

  public void thread69653(int [] tdone, int [] ends){
        switch(S68098){
      case 0 : 
        active[56]=0;
        ends[56]=0;
        tdone[56]=1;
        break;
      
      case 1 : 
        if(zoneOcc0_t.getprestatus()){//sysj\plant.sysj line: 525, column: 25
          zoneOcc0GUI.setPresent();//sysj\plant.sysj line: 525, column: 37
          currsigs.addElement(zoneOcc0GUI);
          active[56]=1;
          ends[56]=1;
          tdone[56]=1;
        }
        else {
          active[56]=1;
          ends[56]=1;
          tdone[56]=1;
        }
        break;
      
    }
  }

  public void thread69652(int [] tdone, int [] ends){
        switch(S68090){
      case 0 : 
        active[55]=0;
        ends[55]=0;
        tdone[55]=1;
        break;
      
      case 1 : 
        if(accessManu_t.getprestatus()){//sysj\plant.sysj line: 523, column: 25
          accessManuGUI.setPresent();//sysj\plant.sysj line: 523, column: 39
          currsigs.addElement(accessManuGUI);
          active[55]=1;
          ends[55]=1;
          tdone[55]=1;
        }
        else {
          active[55]=1;
          ends[55]=1;
          tdone[55]=1;
        }
        break;
      
    }
  }

  public void thread69651(int [] tdone, int [] ends){
        switch(S68082){
      case 0 : 
        active[54]=0;
        ends[54]=0;
        tdone[54]=1;
        break;
      
      case 1 : 
        if(accessOffice_t.getprestatus()){//sysj\plant.sysj line: 521, column: 25
          accessOfficeGUI.setPresent();//sysj\plant.sysj line: 521, column: 42
          currsigs.addElement(accessOfficeGUI);
          active[54]=1;
          ends[54]=1;
          tdone[54]=1;
        }
        else {
          active[54]=1;
          ends[54]=1;
          tdone[54]=1;
        }
        break;
      
    }
  }

  public void thread69650(int [] tdone, int [] ends){
        switch(S68074){
      case 0 : 
        active[53]=0;
        ends[53]=0;
        tdone[53]=1;
        break;
      
      case 1 : 
        if(unlock1_t.getprestatus()){//sysj\plant.sysj line: 519, column: 25
          unlock1GUI.setPresent();//sysj\plant.sysj line: 519, column: 37
          currsigs.addElement(unlock1GUI);
          active[53]=1;
          ends[53]=1;
          tdone[53]=1;
        }
        else {
          active[53]=1;
          ends[53]=1;
          tdone[53]=1;
        }
        break;
      
    }
  }

  public void thread69649(int [] tdone, int [] ends){
        switch(S68192){
      case 0 : 
        active[52]=0;
        ends[52]=0;
        tdone[52]=1;
        break;
      
      case 1 : 
        thread69650(tdone,ends);
        thread69651(tdone,ends);
        thread69652(tdone,ends);
        thread69653(tdone,ends);
        thread69654(tdone,ends);
        thread69655(tdone,ends);
        thread69656(tdone,ends);
        thread69657(tdone,ends);
        thread69658(tdone,ends);
        thread69659(tdone,ends);
        thread69660(tdone,ends);
        thread69661(tdone,ends);
        thread69662(tdone,ends);
        thread69663(tdone,ends);
        int biggest69664 = 0;
        if(ends[53]>=biggest69664){
          biggest69664=ends[53];
        }
        if(ends[54]>=biggest69664){
          biggest69664=ends[54];
        }
        if(ends[55]>=biggest69664){
          biggest69664=ends[55];
        }
        if(ends[56]>=biggest69664){
          biggest69664=ends[56];
        }
        if(ends[57]>=biggest69664){
          biggest69664=ends[57];
        }
        if(ends[58]>=biggest69664){
          biggest69664=ends[58];
        }
        if(ends[59]>=biggest69664){
          biggest69664=ends[59];
        }
        if(ends[60]>=biggest69664){
          biggest69664=ends[60];
        }
        if(ends[61]>=biggest69664){
          biggest69664=ends[61];
        }
        if(ends[62]>=biggest69664){
          biggest69664=ends[62];
        }
        if(ends[63]>=biggest69664){
          biggest69664=ends[63];
        }
        if(ends[64]>=biggest69664){
          biggest69664=ends[64];
        }
        if(ends[65]>=biggest69664){
          biggest69664=ends[65];
        }
        if(ends[66]>=biggest69664){
          biggest69664=ends[66];
        }
        if(biggest69664 == 1){
          active[52]=1;
          ends[52]=1;
          tdone[52]=1;
        }
        //FINXME code
        if(biggest69664 == 0){
          S68192=0;
          active[52]=0;
          ends[52]=0;
          tdone[52]=1;
        }
        break;
      
    }
  }

  public void thread69647(int [] tdone, int [] ends){
        S67078=1;
    S67077=0;
    active[44]=1;
    ends[44]=1;
    tdone[44]=1;
  }

  public void thread69646(int [] tdone, int [] ends){
        S66953=1;
    S66952=0;
    active[39]=1;
    ends[39]=1;
    tdone[39]=1;
  }

  public void thread69643(int [] tdone, int [] ends){
        S66974=1;
    active[51]=1;
    ends[51]=1;
    tdone[51]=1;
  }

  public void thread69642(int [] tdone, int [] ends){
        S66971=1;
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread69641(int [] tdone, int [] ends){
        S66968=1;
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread69640(int [] tdone, int [] ends){
        S66965=1;
    active[48]=1;
    ends[48]=1;
    tdone[48]=1;
  }

  public void thread69639(int [] tdone, int [] ends){
        S66962=1;
    active[47]=1;
    ends[47]=1;
    tdone[47]=1;
  }

  public void thread69638(int [] tdone, int [] ends){
        S66959=1;
    active[46]=1;
    ends[46]=1;
    tdone[46]=1;
  }

  public void thread69637(int [] tdone, int [] ends){
        S66956=1;
    accessManu_t.setPresent();//sysj\plant.sysj line: 473, column: 10
    currsigs.addElement(accessManu_t);
    active[45]=1;
    ends[45]=1;
    tdone[45]=1;
  }

  public void thread69635(int [] tdone, int [] ends){
        switch(S66974){
      case 0 : 
        active[51]=0;
        ends[51]=0;
        tdone[51]=1;
        break;
      
      case 1 : 
        if(zoneOcc6.getprestatus()){//sysj\plant.sysj line: 503, column: 16
          zoneOcc6_t.setPresent();//sysj\plant.sysj line: 504, column: 10
          currsigs.addElement(zoneOcc6_t);
          S66974=0;
          active[51]=0;
          ends[51]=0;
          tdone[51]=1;
        }
        else {
          active[51]=1;
          ends[51]=1;
          tdone[51]=1;
        }
        break;
      
    }
  }

  public void thread69634(int [] tdone, int [] ends){
        switch(S66971){
      case 0 : 
        active[50]=0;
        ends[50]=0;
        tdone[50]=1;
        break;
      
      case 1 : 
        if(zoneOcc5.getprestatus()){//sysj\plant.sysj line: 498, column: 16
          zoneOcc5_t.setPresent();//sysj\plant.sysj line: 499, column: 10
          currsigs.addElement(zoneOcc5_t);
          S66971=0;
          active[50]=0;
          ends[50]=0;
          tdone[50]=1;
        }
        else {
          active[50]=1;
          ends[50]=1;
          tdone[50]=1;
        }
        break;
      
    }
  }

  public void thread69633(int [] tdone, int [] ends){
        switch(S66968){
      case 0 : 
        active[49]=0;
        ends[49]=0;
        tdone[49]=1;
        break;
      
      case 1 : 
        if(zoneOcc4.getprestatus()){//sysj\plant.sysj line: 493, column: 16
          zoneOcc4_t.setPresent();//sysj\plant.sysj line: 494, column: 10
          currsigs.addElement(zoneOcc4_t);
          S66968=0;
          active[49]=0;
          ends[49]=0;
          tdone[49]=1;
        }
        else {
          active[49]=1;
          ends[49]=1;
          tdone[49]=1;
        }
        break;
      
    }
  }

  public void thread69632(int [] tdone, int [] ends){
        switch(S66965){
      case 0 : 
        active[48]=0;
        ends[48]=0;
        tdone[48]=1;
        break;
      
      case 1 : 
        if(zoneOcc3.getprestatus()){//sysj\plant.sysj line: 488, column: 16
          zoneOcc3_t.setPresent();//sysj\plant.sysj line: 489, column: 10
          currsigs.addElement(zoneOcc3_t);
          S66965=0;
          active[48]=0;
          ends[48]=0;
          tdone[48]=1;
        }
        else {
          active[48]=1;
          ends[48]=1;
          tdone[48]=1;
        }
        break;
      
    }
  }

  public void thread69631(int [] tdone, int [] ends){
        switch(S66962){
      case 0 : 
        active[47]=0;
        ends[47]=0;
        tdone[47]=1;
        break;
      
      case 1 : 
        if(zoneOcc2.getprestatus()){//sysj\plant.sysj line: 483, column: 16
          zoneOcc2_t.setPresent();//sysj\plant.sysj line: 484, column: 10
          currsigs.addElement(zoneOcc2_t);
          S66962=0;
          active[47]=0;
          ends[47]=0;
          tdone[47]=1;
        }
        else {
          active[47]=1;
          ends[47]=1;
          tdone[47]=1;
        }
        break;
      
    }
  }

  public void thread69630(int [] tdone, int [] ends){
        switch(S66959){
      case 0 : 
        active[46]=0;
        ends[46]=0;
        tdone[46]=1;
        break;
      
      case 1 : 
        if(zoneOcc0.getprestatus()){//sysj\plant.sysj line: 478, column: 16
          zoneOcc0_t.setPresent();//sysj\plant.sysj line: 479, column: 10
          currsigs.addElement(zoneOcc0_t);
          S66959=0;
          active[46]=0;
          ends[46]=0;
          tdone[46]=1;
        }
        else {
          active[46]=1;
          ends[46]=1;
          tdone[46]=1;
        }
        break;
      
    }
  }

  public void thread69629(int [] tdone, int [] ends){
        switch(S66956){
      case 0 : 
        active[45]=0;
        ends[45]=0;
        tdone[45]=1;
        break;
      
      case 1 : 
        S66956=0;
        active[45]=0;
        ends[45]=0;
        tdone[45]=1;
        break;
      
    }
  }

  public void thread69627(int [] tdone, int [] ends){
        S66974=1;
    active[51]=1;
    ends[51]=1;
    tdone[51]=1;
  }

  public void thread69626(int [] tdone, int [] ends){
        S66971=1;
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread69625(int [] tdone, int [] ends){
        S66968=1;
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread69624(int [] tdone, int [] ends){
        S66965=1;
    active[48]=1;
    ends[48]=1;
    tdone[48]=1;
  }

  public void thread69623(int [] tdone, int [] ends){
        S66962=1;
    active[47]=1;
    ends[47]=1;
    tdone[47]=1;
  }

  public void thread69622(int [] tdone, int [] ends){
        S66959=1;
    active[46]=1;
    ends[46]=1;
    tdone[46]=1;
  }

  public void thread69621(int [] tdone, int [] ends){
        S66956=1;
    accessManu_t.setPresent();//sysj\plant.sysj line: 473, column: 10
    currsigs.addElement(accessManu_t);
    active[45]=1;
    ends[45]=1;
    tdone[45]=1;
  }

  public void thread69620(int [] tdone, int [] ends){
        switch(S67078){
      case 0 : 
        active[44]=0;
        ends[44]=0;
        tdone[44]=1;
        break;
      
      case 1 : 
        switch(S67077){
          case 0 : 
            if(accessManu.getprestatus()){//sysj\plant.sysj line: 469, column: 13
              S67077=1;
              thread69621(tdone,ends);
              thread69622(tdone,ends);
              thread69623(tdone,ends);
              thread69624(tdone,ends);
              thread69625(tdone,ends);
              thread69626(tdone,ends);
              thread69627(tdone,ends);
              int biggest69628 = 0;
              if(ends[45]>=biggest69628){
                biggest69628=ends[45];
              }
              if(ends[46]>=biggest69628){
                biggest69628=ends[46];
              }
              if(ends[47]>=biggest69628){
                biggest69628=ends[47];
              }
              if(ends[48]>=biggest69628){
                biggest69628=ends[48];
              }
              if(ends[49]>=biggest69628){
                biggest69628=ends[49];
              }
              if(ends[50]>=biggest69628){
                biggest69628=ends[50];
              }
              if(ends[51]>=biggest69628){
                biggest69628=ends[51];
              }
              if(biggest69628 == 1){
                active[44]=1;
                ends[44]=1;
                tdone[44]=1;
              }
            }
            else {
              active[44]=1;
              ends[44]=1;
              tdone[44]=1;
            }
            break;
          
          case 1 : 
            if(accessOffice.getprestatus()){//sysj\plant.sysj line: 470, column: 13
              S67077=2;
              active[44]=1;
              ends[44]=1;
              tdone[44]=1;
            }
            else {
              thread69629(tdone,ends);
              thread69630(tdone,ends);
              thread69631(tdone,ends);
              thread69632(tdone,ends);
              thread69633(tdone,ends);
              thread69634(tdone,ends);
              thread69635(tdone,ends);
              int biggest69636 = 0;
              if(ends[45]>=biggest69636){
                biggest69636=ends[45];
              }
              if(ends[46]>=biggest69636){
                biggest69636=ends[46];
              }
              if(ends[47]>=biggest69636){
                biggest69636=ends[47];
              }
              if(ends[48]>=biggest69636){
                biggest69636=ends[48];
              }
              if(ends[49]>=biggest69636){
                biggest69636=ends[49];
              }
              if(ends[50]>=biggest69636){
                biggest69636=ends[50];
              }
              if(ends[51]>=biggest69636){
                biggest69636=ends[51];
              }
              if(biggest69636 == 1){
                active[44]=1;
                ends[44]=1;
                tdone[44]=1;
              }
              //FINXME code
              if(biggest69636 == 0){
                thread69637(tdone,ends);
                thread69638(tdone,ends);
                thread69639(tdone,ends);
                thread69640(tdone,ends);
                thread69641(tdone,ends);
                thread69642(tdone,ends);
                thread69643(tdone,ends);
                int biggest69644 = 0;
                if(ends[45]>=biggest69644){
                  biggest69644=ends[45];
                }
                if(ends[46]>=biggest69644){
                  biggest69644=ends[46];
                }
                if(ends[47]>=biggest69644){
                  biggest69644=ends[47];
                }
                if(ends[48]>=biggest69644){
                  biggest69644=ends[48];
                }
                if(ends[49]>=biggest69644){
                  biggest69644=ends[49];
                }
                if(ends[50]>=biggest69644){
                  biggest69644=ends[50];
                }
                if(ends[51]>=biggest69644){
                  biggest69644=ends[51];
                }
                if(biggest69644 == 1){
                  active[44]=1;
                  ends[44]=1;
                  tdone[44]=1;
                }
              }
            }
            break;
          
          case 2 : 
            S67077=2;
            S67078=0;
            active[44]=0;
            ends[44]=0;
            tdone[44]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread69618(int [] tdone, int [] ends){
        S66894=1;
    active[43]=1;
    ends[43]=1;
    tdone[43]=1;
  }

  public void thread69617(int [] tdone, int [] ends){
        S66891=1;
    active[42]=1;
    ends[42]=1;
    tdone[42]=1;
  }

  public void thread69616(int [] tdone, int [] ends){
        S66888=1;
    active[41]=1;
    ends[41]=1;
    tdone[41]=1;
  }

  public void thread69615(int [] tdone, int [] ends){
        S66885=1;
    accessOffice_t.setPresent();//sysj\plant.sysj line: 445, column: 10
    currsigs.addElement(accessOffice_t);
    active[40]=1;
    ends[40]=1;
    tdone[40]=1;
  }

  public void thread69613(int [] tdone, int [] ends){
        switch(S66894){
      case 0 : 
        active[43]=0;
        ends[43]=0;
        tdone[43]=1;
        break;
      
      case 1 : 
        if(zoneOcc7.getprestatus()){//sysj\plant.sysj line: 460, column: 16
          zoneOcc7_t.setPresent();//sysj\plant.sysj line: 461, column: 10
          currsigs.addElement(zoneOcc7_t);
          S66894=0;
          active[43]=0;
          ends[43]=0;
          tdone[43]=1;
        }
        else {
          active[43]=1;
          ends[43]=1;
          tdone[43]=1;
        }
        break;
      
    }
  }

  public void thread69612(int [] tdone, int [] ends){
        switch(S66891){
      case 0 : 
        active[42]=0;
        ends[42]=0;
        tdone[42]=1;
        break;
      
      case 1 : 
        if(zoneOcc1.getprestatus()){//sysj\plant.sysj line: 455, column: 16
          zoneOcc1_t.setPresent();//sysj\plant.sysj line: 456, column: 10
          currsigs.addElement(zoneOcc1_t);
          S66891=0;
          active[42]=0;
          ends[42]=0;
          tdone[42]=1;
        }
        else {
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
        break;
      
    }
  }

  public void thread69611(int [] tdone, int [] ends){
        switch(S66888){
      case 0 : 
        active[41]=0;
        ends[41]=0;
        tdone[41]=1;
        break;
      
      case 1 : 
        if(zoneOcc0.getprestatus()){//sysj\plant.sysj line: 450, column: 16
          zoneOcc0_t.setPresent();//sysj\plant.sysj line: 451, column: 10
          currsigs.addElement(zoneOcc0_t);
          S66888=0;
          active[41]=0;
          ends[41]=0;
          tdone[41]=1;
        }
        else {
          active[41]=1;
          ends[41]=1;
          tdone[41]=1;
        }
        break;
      
    }
  }

  public void thread69610(int [] tdone, int [] ends){
        switch(S66885){
      case 0 : 
        active[40]=0;
        ends[40]=0;
        tdone[40]=1;
        break;
      
      case 1 : 
        S66885=0;
        active[40]=0;
        ends[40]=0;
        tdone[40]=1;
        break;
      
    }
  }

  public void thread69608(int [] tdone, int [] ends){
        S66894=1;
    active[43]=1;
    ends[43]=1;
    tdone[43]=1;
  }

  public void thread69607(int [] tdone, int [] ends){
        S66891=1;
    active[42]=1;
    ends[42]=1;
    tdone[42]=1;
  }

  public void thread69606(int [] tdone, int [] ends){
        S66888=1;
    active[41]=1;
    ends[41]=1;
    tdone[41]=1;
  }

  public void thread69605(int [] tdone, int [] ends){
        S66885=1;
    accessOffice_t.setPresent();//sysj\plant.sysj line: 445, column: 10
    currsigs.addElement(accessOffice_t);
    active[40]=1;
    ends[40]=1;
    tdone[40]=1;
  }

  public void thread69604(int [] tdone, int [] ends){
        switch(S66953){
      case 0 : 
        active[39]=0;
        ends[39]=0;
        tdone[39]=1;
        break;
      
      case 1 : 
        switch(S66952){
          case 0 : 
            if(accessOffice.getprestatus()){//sysj\plant.sysj line: 441, column: 13
              S66952=1;
              thread69605(tdone,ends);
              thread69606(tdone,ends);
              thread69607(tdone,ends);
              thread69608(tdone,ends);
              int biggest69609 = 0;
              if(ends[40]>=biggest69609){
                biggest69609=ends[40];
              }
              if(ends[41]>=biggest69609){
                biggest69609=ends[41];
              }
              if(ends[42]>=biggest69609){
                biggest69609=ends[42];
              }
              if(ends[43]>=biggest69609){
                biggest69609=ends[43];
              }
              if(biggest69609 == 1){
                active[39]=1;
                ends[39]=1;
                tdone[39]=1;
              }
            }
            else {
              active[39]=1;
              ends[39]=1;
              tdone[39]=1;
            }
            break;
          
          case 1 : 
            if(accessManu.getprestatus()){//sysj\plant.sysj line: 442, column: 13
              S66952=2;
              active[39]=1;
              ends[39]=1;
              tdone[39]=1;
            }
            else {
              thread69610(tdone,ends);
              thread69611(tdone,ends);
              thread69612(tdone,ends);
              thread69613(tdone,ends);
              int biggest69614 = 0;
              if(ends[40]>=biggest69614){
                biggest69614=ends[40];
              }
              if(ends[41]>=biggest69614){
                biggest69614=ends[41];
              }
              if(ends[42]>=biggest69614){
                biggest69614=ends[42];
              }
              if(ends[43]>=biggest69614){
                biggest69614=ends[43];
              }
              if(biggest69614 == 1){
                active[39]=1;
                ends[39]=1;
                tdone[39]=1;
              }
              //FINXME code
              if(biggest69614 == 0){
                thread69615(tdone,ends);
                thread69616(tdone,ends);
                thread69617(tdone,ends);
                thread69618(tdone,ends);
                int biggest69619 = 0;
                if(ends[40]>=biggest69619){
                  biggest69619=ends[40];
                }
                if(ends[41]>=biggest69619){
                  biggest69619=ends[41];
                }
                if(ends[42]>=biggest69619){
                  biggest69619=ends[42];
                }
                if(ends[43]>=biggest69619){
                  biggest69619=ends[43];
                }
                if(biggest69619 == 1){
                  active[39]=1;
                  ends[39]=1;
                  tdone[39]=1;
                }
              }
            }
            break;
          
          case 2 : 
            S66952=2;
            S66953=0;
            active[39]=0;
            ends[39]=0;
            tdone[39]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread69603(int [] tdone, int [] ends){
        switch(S68066){
      case 0 : 
        active[38]=0;
        ends[38]=0;
        tdone[38]=1;
        break;
      
      case 1 : 
        if(modeAutomatic.getprestatus()){//sysj\plant.sysj line: 436, column: 9
          S68066=0;
          active[38]=0;
          ends[38]=0;
          tdone[38]=1;
        }
        else {
          if(fire.getprestatus()){//sysj\plant.sysj line: 438, column: 10
            modeAutomatic_t.setPresent();//sysj\plant.sysj line: 513, column: 3
            currsigs.addElement(modeAutomatic_t);
            S68066=0;
            active[38]=0;
            ends[38]=0;
            tdone[38]=1;
          }
          else {
            thread69604(tdone,ends);
            thread69620(tdone,ends);
            int biggest69645 = 0;
            if(ends[39]>=biggest69645){
              biggest69645=ends[39];
            }
            if(ends[44]>=biggest69645){
              biggest69645=ends[44];
            }
            if(biggest69645 == 1){
              active[38]=1;
              ends[38]=1;
              tdone[38]=1;
            }
            //FINXME code
            if(biggest69645 == 0){
              thread69646(tdone,ends);
              thread69647(tdone,ends);
              int biggest69648 = 0;
              if(ends[39]>=biggest69648){
                biggest69648=ends[39];
              }
              if(ends[44]>=biggest69648){
                biggest69648=ends[44];
              }
              if(biggest69648 == 1){
                active[38]=1;
                ends[38]=1;
                tdone[38]=1;
              }
            }
          }
        }
        break;
      
    }
  }

  public void thread69600(int [] tdone, int [] ends){
        S68190=1;
    if(modeAutomatic_t.getprestatus()){//sysj\plant.sysj line: 545, column: 25
      modeAutomaticGUI.setPresent();//sysj\plant.sysj line: 545, column: 42
      currsigs.addElement(modeAutomaticGUI);
      active[66]=1;
      ends[66]=1;
      tdone[66]=1;
    }
    else {
      active[66]=1;
      ends[66]=1;
      tdone[66]=1;
    }
  }

  public void thread69599(int [] tdone, int [] ends){
        S68182=1;
    if(modeManual_t.getprestatus()){//sysj\plant.sysj line: 543, column: 25
      modeManualGUI.setPresent();//sysj\plant.sysj line: 543, column: 39
      currsigs.addElement(modeManualGUI);
      active[65]=1;
      ends[65]=1;
      tdone[65]=1;
    }
    else {
      active[65]=1;
      ends[65]=1;
      tdone[65]=1;
    }
  }

  public void thread69598(int [] tdone, int [] ends){
        S68174=1;
    if(fire.getprestatus()){//sysj\plant.sysj line: 541, column: 25
      unlock1GUI.setPresent();//sysj\plant.sysj line: 541, column: 31
      currsigs.addElement(unlock1GUI);
      unlock2GUI.setPresent();//sysj\plant.sysj line: 541, column: 48
      currsigs.addElement(unlock2GUI);
      unlock3GUI.setPresent();//sysj\plant.sysj line: 541, column: 65
      currsigs.addElement(unlock3GUI);
      active[64]=1;
      ends[64]=1;
      tdone[64]=1;
    }
    else {
      active[64]=1;
      ends[64]=1;
      tdone[64]=1;
    }
  }

  public void thread69597(int [] tdone, int [] ends){
        S68163=1;
    if(zoneOcc7_t.getprestatus()){//sysj\plant.sysj line: 539, column: 25
      zoneOcc7GUI.setPresent();//sysj\plant.sysj line: 539, column: 37
      currsigs.addElement(zoneOcc7GUI);
      active[63]=1;
      ends[63]=1;
      tdone[63]=1;
    }
    else {
      active[63]=1;
      ends[63]=1;
      tdone[63]=1;
    }
  }

  public void thread69596(int [] tdone, int [] ends){
        S68155=1;
    if(zoneOcc6_t.getprestatus()){//sysj\plant.sysj line: 537, column: 25
      zoneOcc6GUI.setPresent();//sysj\plant.sysj line: 537, column: 37
      currsigs.addElement(zoneOcc6GUI);
      proxLaserGUI.setPresent();//sysj\plant.sysj line: 537, column: 55
      currsigs.addElement(proxLaserGUI);
      absStopGUI.setPresent();//sysj\plant.sysj line: 537, column: 74
      currsigs.addElement(absStopGUI);
      active[62]=1;
      ends[62]=1;
      tdone[62]=1;
    }
    else {
      active[62]=1;
      ends[62]=1;
      tdone[62]=1;
    }
  }

  public void thread69595(int [] tdone, int [] ends){
        S68144=1;
    if(zoneOcc5_t.getprestatus()){//sysj\plant.sysj line: 535, column: 25
      zoneOcc5GUI.setPresent();//sysj\plant.sysj line: 535, column: 37
      currsigs.addElement(zoneOcc5GUI);
      proxLaserGUI.setPresent();//sysj\plant.sysj line: 535, column: 55
      currsigs.addElement(proxLaserGUI);
      absStopGUI.setPresent();//sysj\plant.sysj line: 535, column: 74
      currsigs.addElement(absStopGUI);
      active[61]=1;
      ends[61]=1;
      tdone[61]=1;
    }
    else {
      active[61]=1;
      ends[61]=1;
      tdone[61]=1;
    }
  }

  public void thread69594(int [] tdone, int [] ends){
        S68133=1;
    if(zoneOcc4_t.getprestatus()){//sysj\plant.sysj line: 533, column: 25
      zoneOcc4GUI.setPresent();//sysj\plant.sysj line: 533, column: 37
      currsigs.addElement(zoneOcc4GUI);
      proxLaserGUI.setPresent();//sysj\plant.sysj line: 533, column: 55
      currsigs.addElement(proxLaserGUI);
      absStopGUI.setPresent();//sysj\plant.sysj line: 533, column: 74
      currsigs.addElement(absStopGUI);
      active[60]=1;
      ends[60]=1;
      tdone[60]=1;
    }
    else {
      active[60]=1;
      ends[60]=1;
      tdone[60]=1;
    }
  }

  public void thread69593(int [] tdone, int [] ends){
        S68122=1;
    if(zoneOcc3_t.getprestatus()){//sysj\plant.sysj line: 531, column: 25
      zoneOcc3GUI.setPresent();//sysj\plant.sysj line: 531, column: 37
      currsigs.addElement(zoneOcc3GUI);
      active[59]=1;
      ends[59]=1;
      tdone[59]=1;
    }
    else {
      active[59]=1;
      ends[59]=1;
      tdone[59]=1;
    }
  }

  public void thread69592(int [] tdone, int [] ends){
        S68114=1;
    if(zoneOcc2_t.getprestatus()){//sysj\plant.sysj line: 529, column: 25
      zoneOcc2GUI.setPresent();//sysj\plant.sysj line: 529, column: 37
      currsigs.addElement(zoneOcc2GUI);
      active[58]=1;
      ends[58]=1;
      tdone[58]=1;
    }
    else {
      active[58]=1;
      ends[58]=1;
      tdone[58]=1;
    }
  }

  public void thread69591(int [] tdone, int [] ends){
        S68106=1;
    if(zoneOcc1_t.getprestatus()){//sysj\plant.sysj line: 527, column: 25
      zoneOcc1GUI.setPresent();//sysj\plant.sysj line: 527, column: 37
      currsigs.addElement(zoneOcc1GUI);
      active[57]=1;
      ends[57]=1;
      tdone[57]=1;
    }
    else {
      active[57]=1;
      ends[57]=1;
      tdone[57]=1;
    }
  }

  public void thread69590(int [] tdone, int [] ends){
        S68098=1;
    if(zoneOcc0_t.getprestatus()){//sysj\plant.sysj line: 525, column: 25
      zoneOcc0GUI.setPresent();//sysj\plant.sysj line: 525, column: 37
      currsigs.addElement(zoneOcc0GUI);
      active[56]=1;
      ends[56]=1;
      tdone[56]=1;
    }
    else {
      active[56]=1;
      ends[56]=1;
      tdone[56]=1;
    }
  }

  public void thread69589(int [] tdone, int [] ends){
        S68090=1;
    if(accessManu_t.getprestatus()){//sysj\plant.sysj line: 523, column: 25
      accessManuGUI.setPresent();//sysj\plant.sysj line: 523, column: 39
      currsigs.addElement(accessManuGUI);
      active[55]=1;
      ends[55]=1;
      tdone[55]=1;
    }
    else {
      active[55]=1;
      ends[55]=1;
      tdone[55]=1;
    }
  }

  public void thread69588(int [] tdone, int [] ends){
        S68082=1;
    if(accessOffice_t.getprestatus()){//sysj\plant.sysj line: 521, column: 25
      accessOfficeGUI.setPresent();//sysj\plant.sysj line: 521, column: 42
      currsigs.addElement(accessOfficeGUI);
      active[54]=1;
      ends[54]=1;
      tdone[54]=1;
    }
    else {
      active[54]=1;
      ends[54]=1;
      tdone[54]=1;
    }
  }

  public void thread69587(int [] tdone, int [] ends){
        S68074=1;
    if(unlock1_t.getprestatus()){//sysj\plant.sysj line: 519, column: 25
      unlock1GUI.setPresent();//sysj\plant.sysj line: 519, column: 37
      currsigs.addElement(unlock1GUI);
      active[53]=1;
      ends[53]=1;
      tdone[53]=1;
    }
    else {
      active[53]=1;
      ends[53]=1;
      tdone[53]=1;
    }
  }

  public void thread69586(int [] tdone, int [] ends){
        S68192=1;
    thread69587(tdone,ends);
    thread69588(tdone,ends);
    thread69589(tdone,ends);
    thread69590(tdone,ends);
    thread69591(tdone,ends);
    thread69592(tdone,ends);
    thread69593(tdone,ends);
    thread69594(tdone,ends);
    thread69595(tdone,ends);
    thread69596(tdone,ends);
    thread69597(tdone,ends);
    thread69598(tdone,ends);
    thread69599(tdone,ends);
    thread69600(tdone,ends);
    int biggest69601 = 0;
    if(ends[53]>=biggest69601){
      biggest69601=ends[53];
    }
    if(ends[54]>=biggest69601){
      biggest69601=ends[54];
    }
    if(ends[55]>=biggest69601){
      biggest69601=ends[55];
    }
    if(ends[56]>=biggest69601){
      biggest69601=ends[56];
    }
    if(ends[57]>=biggest69601){
      biggest69601=ends[57];
    }
    if(ends[58]>=biggest69601){
      biggest69601=ends[58];
    }
    if(ends[59]>=biggest69601){
      biggest69601=ends[59];
    }
    if(ends[60]>=biggest69601){
      biggest69601=ends[60];
    }
    if(ends[61]>=biggest69601){
      biggest69601=ends[61];
    }
    if(ends[62]>=biggest69601){
      biggest69601=ends[62];
    }
    if(ends[63]>=biggest69601){
      biggest69601=ends[63];
    }
    if(ends[64]>=biggest69601){
      biggest69601=ends[64];
    }
    if(ends[65]>=biggest69601){
      biggest69601=ends[65];
    }
    if(ends[66]>=biggest69601){
      biggest69601=ends[66];
    }
    if(biggest69601 == 1){
      active[52]=1;
      ends[52]=1;
      tdone[52]=1;
    }
  }

  public void thread69584(int [] tdone, int [] ends){
        S67078=1;
    S67077=0;
    active[44]=1;
    ends[44]=1;
    tdone[44]=1;
  }

  public void thread69583(int [] tdone, int [] ends){
        S66953=1;
    S66952=0;
    active[39]=1;
    ends[39]=1;
    tdone[39]=1;
  }

  public void thread69582(int [] tdone, int [] ends){
        S68066=1;
    modeManual_t.setPresent();//sysj\plant.sysj line: 437, column: 4
    currsigs.addElement(modeManual_t);
    thread69583(tdone,ends);
    thread69584(tdone,ends);
    int biggest69585 = 0;
    if(ends[39]>=biggest69585){
      biggest69585=ends[39];
    }
    if(ends[44]>=biggest69585){
      biggest69585=ends[44];
    }
    if(biggest69585 == 1){
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S69504){
        case 0 : 
          S69504=0;
          break RUN;
        
        case 1 : 
          S69504=2;
          S69504=2;
          new Thread(new ACS_GUI()).start();//sysj\plant.sysj line: 432, column: 2
          thread69582(tdone,ends);
          thread69586(tdone,ends);
          int biggest69602 = 0;
          if(ends[38]>=biggest69602){
            biggest69602=ends[38];
          }
          if(ends[52]>=biggest69602){
            biggest69602=ends[52];
          }
          if(biggest69602 == 1){
            active[37]=1;
            ends[37]=1;
            break RUN;
          }
        
        case 2 : 
          thread69603(tdone,ends);
          thread69649(tdone,ends);
          int biggest69665 = 0;
          if(ends[38]>=biggest69665){
            biggest69665=ends[38];
          }
          if(ends[52]>=biggest69665){
            biggest69665=ends[52];
          }
          if(biggest69665 == 1){
            active[37]=1;
            ends[37]=1;
            break RUN;
          }
          //FINXME code
          if(biggest69665 == 0){
            S69504=0;
            active[37]=0;
            ends[37]=0;
            S69504=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[37] != 0){
      int index = 37;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[37]!=0 || suspended[37]!=0 || active[37]!=1);
      else{
        if(!df){
          modeManual.gethook();
          modeAutomatic.gethook();
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
      modeManual.setpreclear();
      modeAutomatic.setpreclear();
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
      modeManual_t.setpreclear();
      modeAutomatic_t.setpreclear();
      accessManu_t.setpreclear();
      accessOffice_t.setpreclear();
      modeManualGUI.setpreclear();
      modeAutomaticGUI.setpreclear();
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
      dummyint = modeManual.getStatus() ? modeManual.setprepresent() : modeManual.setpreclear();
      modeManual.setpreval(modeManual.getValue());
      modeManual.setClear();
      dummyint = modeAutomatic.getStatus() ? modeAutomatic.setprepresent() : modeAutomatic.setpreclear();
      modeAutomatic.setpreval(modeAutomatic.getValue());
      modeAutomatic.setClear();
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
      modeManual_t.sethook();
      modeManual_t.setClear();
      modeAutomatic_t.sethook();
      modeAutomatic_t.setClear();
      accessManu_t.sethook();
      accessManu_t.setClear();
      accessOffice_t.sethook();
      accessOffice_t.setClear();
      modeManualGUI.sethook();
      modeManualGUI.setClear();
      modeAutomaticGUI.sethook();
      modeAutomaticGUI.setClear();
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
      if(paused[37]!=0 || suspended[37]!=0 || active[37]!=1);
      else{
        modeManual.gethook();
        modeAutomatic.gethook();
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
      if(active[37] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
