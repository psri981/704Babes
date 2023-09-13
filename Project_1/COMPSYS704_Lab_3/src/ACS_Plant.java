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
  private int S68288 = 1;
  private int S67474 = 1;
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
  private int S67584 = 1;
  private int S67482 = 1;
  private int S67490 = 1;
  private int S67498 = 1;
  private int S67506 = 1;
  private int S67514 = 1;
  private int S67522 = 1;
  private int S67530 = 1;
  private int S67541 = 1;
  private int S67552 = 1;
  private int S67563 = 1;
  private int S67571 = 1;
  private int S67582 = 1;
  
  private int[] ends = new int[65];
  private int[] tdone = new int[65];
  
  public void thread68443(int [] tdone, int [] ends){
        switch(S67582){
      case 0 : 
        active[64]=0;
        ends[64]=0;
        tdone[64]=1;
        break;
      
      case 1 : 
        if(fire.getprestatus()){//sysj\plant.sysj line: 444, column: 25
          unlock1GUI.setPresent();//sysj\plant.sysj line: 444, column: 31
          currsigs.addElement(unlock1GUI);
          unlock2GUI.setPresent();//sysj\plant.sysj line: 444, column: 48
          currsigs.addElement(unlock2GUI);
          unlock3GUI.setPresent();//sysj\plant.sysj line: 444, column: 65
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

  public void thread68442(int [] tdone, int [] ends){
        switch(S67571){
      case 0 : 
        active[63]=0;
        ends[63]=0;
        tdone[63]=1;
        break;
      
      case 1 : 
        if(zoneOcc7_t.getprestatus()){//sysj\plant.sysj line: 442, column: 25
          zoneOcc7GUI.setPresent();//sysj\plant.sysj line: 442, column: 37
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

  public void thread68441(int [] tdone, int [] ends){
        switch(S67563){
      case 0 : 
        active[62]=0;
        ends[62]=0;
        tdone[62]=1;
        break;
      
      case 1 : 
        if(zoneOcc6_t.getprestatus()){//sysj\plant.sysj line: 440, column: 25
          zoneOcc6GUI.setPresent();//sysj\plant.sysj line: 440, column: 37
          currsigs.addElement(zoneOcc6GUI);
          proxLaserGUI.setPresent();//sysj\plant.sysj line: 440, column: 55
          currsigs.addElement(proxLaserGUI);
          absStopGUI.setPresent();//sysj\plant.sysj line: 440, column: 74
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

  public void thread68440(int [] tdone, int [] ends){
        switch(S67552){
      case 0 : 
        active[61]=0;
        ends[61]=0;
        tdone[61]=1;
        break;
      
      case 1 : 
        if(zoneOcc5_t.getprestatus()){//sysj\plant.sysj line: 438, column: 25
          zoneOcc5GUI.setPresent();//sysj\plant.sysj line: 438, column: 37
          currsigs.addElement(zoneOcc5GUI);
          proxLaserGUI.setPresent();//sysj\plant.sysj line: 438, column: 55
          currsigs.addElement(proxLaserGUI);
          absStopGUI.setPresent();//sysj\plant.sysj line: 438, column: 74
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

  public void thread68439(int [] tdone, int [] ends){
        switch(S67541){
      case 0 : 
        active[60]=0;
        ends[60]=0;
        tdone[60]=1;
        break;
      
      case 1 : 
        if(zoneOcc4_t.getprestatus()){//sysj\plant.sysj line: 436, column: 25
          zoneOcc4GUI.setPresent();//sysj\plant.sysj line: 436, column: 37
          currsigs.addElement(zoneOcc4GUI);
          proxLaserGUI.setPresent();//sysj\plant.sysj line: 436, column: 55
          currsigs.addElement(proxLaserGUI);
          absStopGUI.setPresent();//sysj\plant.sysj line: 436, column: 74
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

  public void thread68438(int [] tdone, int [] ends){
        switch(S67530){
      case 0 : 
        active[59]=0;
        ends[59]=0;
        tdone[59]=1;
        break;
      
      case 1 : 
        if(zoneOcc3_t.getprestatus()){//sysj\plant.sysj line: 434, column: 25
          zoneOcc3GUI.setPresent();//sysj\plant.sysj line: 434, column: 37
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

  public void thread68437(int [] tdone, int [] ends){
        switch(S67522){
      case 0 : 
        active[58]=0;
        ends[58]=0;
        tdone[58]=1;
        break;
      
      case 1 : 
        if(zoneOcc2_t.getprestatus()){//sysj\plant.sysj line: 432, column: 25
          zoneOcc2GUI.setPresent();//sysj\plant.sysj line: 432, column: 37
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

  public void thread68436(int [] tdone, int [] ends){
        switch(S67514){
      case 0 : 
        active[57]=0;
        ends[57]=0;
        tdone[57]=1;
        break;
      
      case 1 : 
        if(zoneOcc1_t.getprestatus()){//sysj\plant.sysj line: 430, column: 25
          zoneOcc1GUI.setPresent();//sysj\plant.sysj line: 430, column: 37
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

  public void thread68435(int [] tdone, int [] ends){
        switch(S67506){
      case 0 : 
        active[56]=0;
        ends[56]=0;
        tdone[56]=1;
        break;
      
      case 1 : 
        if(zoneOcc0_t.getprestatus()){//sysj\plant.sysj line: 428, column: 25
          zoneOcc0GUI.setPresent();//sysj\plant.sysj line: 428, column: 37
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

  public void thread68434(int [] tdone, int [] ends){
        switch(S67498){
      case 0 : 
        active[55]=0;
        ends[55]=0;
        tdone[55]=1;
        break;
      
      case 1 : 
        if(accessManu_t.getprestatus()){//sysj\plant.sysj line: 426, column: 25
          accessManuGUI.setPresent();//sysj\plant.sysj line: 426, column: 39
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

  public void thread68433(int [] tdone, int [] ends){
        switch(S67490){
      case 0 : 
        active[54]=0;
        ends[54]=0;
        tdone[54]=1;
        break;
      
      case 1 : 
        if(accessOffice_t.getprestatus()){//sysj\plant.sysj line: 424, column: 25
          accessOfficeGUI.setPresent();//sysj\plant.sysj line: 424, column: 42
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

  public void thread68432(int [] tdone, int [] ends){
        switch(S67482){
      case 0 : 
        active[53]=0;
        ends[53]=0;
        tdone[53]=1;
        break;
      
      case 1 : 
        if(unlock1_t.getprestatus()){//sysj\plant.sysj line: 422, column: 25
          unlock1GUI.setPresent();//sysj\plant.sysj line: 422, column: 37
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

  public void thread68431(int [] tdone, int [] ends){
        switch(S67584){
      case 0 : 
        active[52]=0;
        ends[52]=0;
        tdone[52]=1;
        break;
      
      case 1 : 
        thread68432(tdone,ends);
        thread68433(tdone,ends);
        thread68434(tdone,ends);
        thread68435(tdone,ends);
        thread68436(tdone,ends);
        thread68437(tdone,ends);
        thread68438(tdone,ends);
        thread68439(tdone,ends);
        thread68440(tdone,ends);
        thread68441(tdone,ends);
        thread68442(tdone,ends);
        thread68443(tdone,ends);
        int biggest68444 = 0;
        if(ends[53]>=biggest68444){
          biggest68444=ends[53];
        }
        if(ends[54]>=biggest68444){
          biggest68444=ends[54];
        }
        if(ends[55]>=biggest68444){
          biggest68444=ends[55];
        }
        if(ends[56]>=biggest68444){
          biggest68444=ends[56];
        }
        if(ends[57]>=biggest68444){
          biggest68444=ends[57];
        }
        if(ends[58]>=biggest68444){
          biggest68444=ends[58];
        }
        if(ends[59]>=biggest68444){
          biggest68444=ends[59];
        }
        if(ends[60]>=biggest68444){
          biggest68444=ends[60];
        }
        if(ends[61]>=biggest68444){
          biggest68444=ends[61];
        }
        if(ends[62]>=biggest68444){
          biggest68444=ends[62];
        }
        if(ends[63]>=biggest68444){
          biggest68444=ends[63];
        }
        if(ends[64]>=biggest68444){
          biggest68444=ends[64];
        }
        if(biggest68444 == 1){
          active[52]=1;
          ends[52]=1;
          tdone[52]=1;
        }
        //FINXME code
        if(biggest68444 == 0){
          S67584=0;
          active[52]=0;
          ends[52]=0;
          tdone[52]=1;
        }
        break;
      
    }
  }

  public void thread68429(int [] tdone, int [] ends){
        S67078=1;
    S67077=0;
    active[44]=1;
    ends[44]=1;
    tdone[44]=1;
  }

  public void thread68428(int [] tdone, int [] ends){
        S66953=1;
    S66952=0;
    active[39]=1;
    ends[39]=1;
    tdone[39]=1;
  }

  public void thread68425(int [] tdone, int [] ends){
        S66974=1;
    active[51]=1;
    ends[51]=1;
    tdone[51]=1;
  }

  public void thread68424(int [] tdone, int [] ends){
        S66971=1;
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread68423(int [] tdone, int [] ends){
        S66968=1;
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread68422(int [] tdone, int [] ends){
        S66965=1;
    active[48]=1;
    ends[48]=1;
    tdone[48]=1;
  }

  public void thread68421(int [] tdone, int [] ends){
        S66962=1;
    active[47]=1;
    ends[47]=1;
    tdone[47]=1;
  }

  public void thread68420(int [] tdone, int [] ends){
        S66959=1;
    active[46]=1;
    ends[46]=1;
    tdone[46]=1;
  }

  public void thread68419(int [] tdone, int [] ends){
        S66956=1;
    accessManu_t.setPresent();//sysj\plant.sysj line: 377, column: 9
    currsigs.addElement(accessManu_t);
    active[45]=1;
    ends[45]=1;
    tdone[45]=1;
  }

  public void thread68417(int [] tdone, int [] ends){
        switch(S66974){
      case 0 : 
        active[51]=0;
        ends[51]=0;
        tdone[51]=1;
        break;
      
      case 1 : 
        if(zoneOcc6.getprestatus()){//sysj\plant.sysj line: 407, column: 15
          zoneOcc6_t.setPresent();//sysj\plant.sysj line: 408, column: 9
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

  public void thread68416(int [] tdone, int [] ends){
        switch(S66971){
      case 0 : 
        active[50]=0;
        ends[50]=0;
        tdone[50]=1;
        break;
      
      case 1 : 
        if(zoneOcc5.getprestatus()){//sysj\plant.sysj line: 402, column: 15
          zoneOcc5_t.setPresent();//sysj\plant.sysj line: 403, column: 9
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

  public void thread68415(int [] tdone, int [] ends){
        switch(S66968){
      case 0 : 
        active[49]=0;
        ends[49]=0;
        tdone[49]=1;
        break;
      
      case 1 : 
        if(zoneOcc4.getprestatus()){//sysj\plant.sysj line: 397, column: 15
          zoneOcc4_t.setPresent();//sysj\plant.sysj line: 398, column: 9
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

  public void thread68414(int [] tdone, int [] ends){
        switch(S66965){
      case 0 : 
        active[48]=0;
        ends[48]=0;
        tdone[48]=1;
        break;
      
      case 1 : 
        if(zoneOcc3.getprestatus()){//sysj\plant.sysj line: 392, column: 15
          zoneOcc3_t.setPresent();//sysj\plant.sysj line: 393, column: 9
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

  public void thread68413(int [] tdone, int [] ends){
        switch(S66962){
      case 0 : 
        active[47]=0;
        ends[47]=0;
        tdone[47]=1;
        break;
      
      case 1 : 
        if(zoneOcc2.getprestatus()){//sysj\plant.sysj line: 387, column: 15
          zoneOcc2_t.setPresent();//sysj\plant.sysj line: 388, column: 9
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

  public void thread68412(int [] tdone, int [] ends){
        switch(S66959){
      case 0 : 
        active[46]=0;
        ends[46]=0;
        tdone[46]=1;
        break;
      
      case 1 : 
        if(zoneOcc0.getprestatus()){//sysj\plant.sysj line: 382, column: 15
          zoneOcc0_t.setPresent();//sysj\plant.sysj line: 383, column: 9
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

  public void thread68411(int [] tdone, int [] ends){
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

  public void thread68409(int [] tdone, int [] ends){
        S66974=1;
    active[51]=1;
    ends[51]=1;
    tdone[51]=1;
  }

  public void thread68408(int [] tdone, int [] ends){
        S66971=1;
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread68407(int [] tdone, int [] ends){
        S66968=1;
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread68406(int [] tdone, int [] ends){
        S66965=1;
    active[48]=1;
    ends[48]=1;
    tdone[48]=1;
  }

  public void thread68405(int [] tdone, int [] ends){
        S66962=1;
    active[47]=1;
    ends[47]=1;
    tdone[47]=1;
  }

  public void thread68404(int [] tdone, int [] ends){
        S66959=1;
    active[46]=1;
    ends[46]=1;
    tdone[46]=1;
  }

  public void thread68403(int [] tdone, int [] ends){
        S66956=1;
    accessManu_t.setPresent();//sysj\plant.sysj line: 377, column: 9
    currsigs.addElement(accessManu_t);
    active[45]=1;
    ends[45]=1;
    tdone[45]=1;
  }

  public void thread68402(int [] tdone, int [] ends){
        switch(S67078){
      case 0 : 
        active[44]=0;
        ends[44]=0;
        tdone[44]=1;
        break;
      
      case 1 : 
        switch(S67077){
          case 0 : 
            if(accessManu.getprestatus()){//sysj\plant.sysj line: 373, column: 12
              S67077=1;
              thread68403(tdone,ends);
              thread68404(tdone,ends);
              thread68405(tdone,ends);
              thread68406(tdone,ends);
              thread68407(tdone,ends);
              thread68408(tdone,ends);
              thread68409(tdone,ends);
              int biggest68410 = 0;
              if(ends[45]>=biggest68410){
                biggest68410=ends[45];
              }
              if(ends[46]>=biggest68410){
                biggest68410=ends[46];
              }
              if(ends[47]>=biggest68410){
                biggest68410=ends[47];
              }
              if(ends[48]>=biggest68410){
                biggest68410=ends[48];
              }
              if(ends[49]>=biggest68410){
                biggest68410=ends[49];
              }
              if(ends[50]>=biggest68410){
                biggest68410=ends[50];
              }
              if(ends[51]>=biggest68410){
                biggest68410=ends[51];
              }
              if(biggest68410 == 1){
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
            if(accessOffice.getprestatus()){//sysj\plant.sysj line: 374, column: 12
              S67077=2;
              active[44]=1;
              ends[44]=1;
              tdone[44]=1;
            }
            else {
              thread68411(tdone,ends);
              thread68412(tdone,ends);
              thread68413(tdone,ends);
              thread68414(tdone,ends);
              thread68415(tdone,ends);
              thread68416(tdone,ends);
              thread68417(tdone,ends);
              int biggest68418 = 0;
              if(ends[45]>=biggest68418){
                biggest68418=ends[45];
              }
              if(ends[46]>=biggest68418){
                biggest68418=ends[46];
              }
              if(ends[47]>=biggest68418){
                biggest68418=ends[47];
              }
              if(ends[48]>=biggest68418){
                biggest68418=ends[48];
              }
              if(ends[49]>=biggest68418){
                biggest68418=ends[49];
              }
              if(ends[50]>=biggest68418){
                biggest68418=ends[50];
              }
              if(ends[51]>=biggest68418){
                biggest68418=ends[51];
              }
              if(biggest68418 == 1){
                active[44]=1;
                ends[44]=1;
                tdone[44]=1;
              }
              //FINXME code
              if(biggest68418 == 0){
                thread68419(tdone,ends);
                thread68420(tdone,ends);
                thread68421(tdone,ends);
                thread68422(tdone,ends);
                thread68423(tdone,ends);
                thread68424(tdone,ends);
                thread68425(tdone,ends);
                int biggest68426 = 0;
                if(ends[45]>=biggest68426){
                  biggest68426=ends[45];
                }
                if(ends[46]>=biggest68426){
                  biggest68426=ends[46];
                }
                if(ends[47]>=biggest68426){
                  biggest68426=ends[47];
                }
                if(ends[48]>=biggest68426){
                  biggest68426=ends[48];
                }
                if(ends[49]>=biggest68426){
                  biggest68426=ends[49];
                }
                if(ends[50]>=biggest68426){
                  biggest68426=ends[50];
                }
                if(ends[51]>=biggest68426){
                  biggest68426=ends[51];
                }
                if(biggest68426 == 1){
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

  public void thread68400(int [] tdone, int [] ends){
        S66894=1;
    active[43]=1;
    ends[43]=1;
    tdone[43]=1;
  }

  public void thread68399(int [] tdone, int [] ends){
        S66891=1;
    active[42]=1;
    ends[42]=1;
    tdone[42]=1;
  }

  public void thread68398(int [] tdone, int [] ends){
        S66888=1;
    active[41]=1;
    ends[41]=1;
    tdone[41]=1;
  }

  public void thread68397(int [] tdone, int [] ends){
        S66885=1;
    accessOffice_t.setPresent();//sysj\plant.sysj line: 349, column: 9
    currsigs.addElement(accessOffice_t);
    active[40]=1;
    ends[40]=1;
    tdone[40]=1;
  }

  public void thread68395(int [] tdone, int [] ends){
        switch(S66894){
      case 0 : 
        active[43]=0;
        ends[43]=0;
        tdone[43]=1;
        break;
      
      case 1 : 
        if(zoneOcc7.getprestatus()){//sysj\plant.sysj line: 364, column: 15
          zoneOcc7_t.setPresent();//sysj\plant.sysj line: 365, column: 9
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

  public void thread68394(int [] tdone, int [] ends){
        switch(S66891){
      case 0 : 
        active[42]=0;
        ends[42]=0;
        tdone[42]=1;
        break;
      
      case 1 : 
        if(zoneOcc1.getprestatus()){//sysj\plant.sysj line: 359, column: 15
          zoneOcc1_t.setPresent();//sysj\plant.sysj line: 360, column: 9
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

  public void thread68393(int [] tdone, int [] ends){
        switch(S66888){
      case 0 : 
        active[41]=0;
        ends[41]=0;
        tdone[41]=1;
        break;
      
      case 1 : 
        if(zoneOcc0.getprestatus()){//sysj\plant.sysj line: 354, column: 15
          zoneOcc0_t.setPresent();//sysj\plant.sysj line: 355, column: 9
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

  public void thread68392(int [] tdone, int [] ends){
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

  public void thread68390(int [] tdone, int [] ends){
        S66894=1;
    active[43]=1;
    ends[43]=1;
    tdone[43]=1;
  }

  public void thread68389(int [] tdone, int [] ends){
        S66891=1;
    active[42]=1;
    ends[42]=1;
    tdone[42]=1;
  }

  public void thread68388(int [] tdone, int [] ends){
        S66888=1;
    active[41]=1;
    ends[41]=1;
    tdone[41]=1;
  }

  public void thread68387(int [] tdone, int [] ends){
        S66885=1;
    accessOffice_t.setPresent();//sysj\plant.sysj line: 349, column: 9
    currsigs.addElement(accessOffice_t);
    active[40]=1;
    ends[40]=1;
    tdone[40]=1;
  }

  public void thread68386(int [] tdone, int [] ends){
        switch(S66953){
      case 0 : 
        active[39]=0;
        ends[39]=0;
        tdone[39]=1;
        break;
      
      case 1 : 
        switch(S66952){
          case 0 : 
            if(accessOffice.getprestatus()){//sysj\plant.sysj line: 345, column: 12
              S66952=1;
              thread68387(tdone,ends);
              thread68388(tdone,ends);
              thread68389(tdone,ends);
              thread68390(tdone,ends);
              int biggest68391 = 0;
              if(ends[40]>=biggest68391){
                biggest68391=ends[40];
              }
              if(ends[41]>=biggest68391){
                biggest68391=ends[41];
              }
              if(ends[42]>=biggest68391){
                biggest68391=ends[42];
              }
              if(ends[43]>=biggest68391){
                biggest68391=ends[43];
              }
              if(biggest68391 == 1){
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
            if(accessManu.getprestatus()){//sysj\plant.sysj line: 346, column: 12
              S66952=2;
              active[39]=1;
              ends[39]=1;
              tdone[39]=1;
            }
            else {
              thread68392(tdone,ends);
              thread68393(tdone,ends);
              thread68394(tdone,ends);
              thread68395(tdone,ends);
              int biggest68396 = 0;
              if(ends[40]>=biggest68396){
                biggest68396=ends[40];
              }
              if(ends[41]>=biggest68396){
                biggest68396=ends[41];
              }
              if(ends[42]>=biggest68396){
                biggest68396=ends[42];
              }
              if(ends[43]>=biggest68396){
                biggest68396=ends[43];
              }
              if(biggest68396 == 1){
                active[39]=1;
                ends[39]=1;
                tdone[39]=1;
              }
              //FINXME code
              if(biggest68396 == 0){
                thread68397(tdone,ends);
                thread68398(tdone,ends);
                thread68399(tdone,ends);
                thread68400(tdone,ends);
                int biggest68401 = 0;
                if(ends[40]>=biggest68401){
                  biggest68401=ends[40];
                }
                if(ends[41]>=biggest68401){
                  biggest68401=ends[41];
                }
                if(ends[42]>=biggest68401){
                  biggest68401=ends[42];
                }
                if(ends[43]>=biggest68401){
                  biggest68401=ends[43];
                }
                if(biggest68401 == 1){
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

  public void thread68385(int [] tdone, int [] ends){
        switch(S67474){
      case 0 : 
        active[38]=0;
        ends[38]=0;
        tdone[38]=1;
        break;
      
      case 1 : 
        if(fire.getprestatus()){//sysj\plant.sysj line: 342, column: 9
          S67474=0;
          active[38]=0;
          ends[38]=0;
          tdone[38]=1;
        }
        else {
          thread68386(tdone,ends);
          thread68402(tdone,ends);
          int biggest68427 = 0;
          if(ends[39]>=biggest68427){
            biggest68427=ends[39];
          }
          if(ends[44]>=biggest68427){
            biggest68427=ends[44];
          }
          if(biggest68427 == 1){
            active[38]=1;
            ends[38]=1;
            tdone[38]=1;
          }
          //FINXME code
          if(biggest68427 == 0){
            thread68428(tdone,ends);
            thread68429(tdone,ends);
            int biggest68430 = 0;
            if(ends[39]>=biggest68430){
              biggest68430=ends[39];
            }
            if(ends[44]>=biggest68430){
              biggest68430=ends[44];
            }
            if(biggest68430 == 1){
              active[38]=1;
              ends[38]=1;
              tdone[38]=1;
            }
          }
        }
        break;
      
    }
  }

  public void thread68382(int [] tdone, int [] ends){
        S67582=1;
    if(fire.getprestatus()){//sysj\plant.sysj line: 444, column: 25
      unlock1GUI.setPresent();//sysj\plant.sysj line: 444, column: 31
      currsigs.addElement(unlock1GUI);
      unlock2GUI.setPresent();//sysj\plant.sysj line: 444, column: 48
      currsigs.addElement(unlock2GUI);
      unlock3GUI.setPresent();//sysj\plant.sysj line: 444, column: 65
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

  public void thread68381(int [] tdone, int [] ends){
        S67571=1;
    if(zoneOcc7_t.getprestatus()){//sysj\plant.sysj line: 442, column: 25
      zoneOcc7GUI.setPresent();//sysj\plant.sysj line: 442, column: 37
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

  public void thread68380(int [] tdone, int [] ends){
        S67563=1;
    if(zoneOcc6_t.getprestatus()){//sysj\plant.sysj line: 440, column: 25
      zoneOcc6GUI.setPresent();//sysj\plant.sysj line: 440, column: 37
      currsigs.addElement(zoneOcc6GUI);
      proxLaserGUI.setPresent();//sysj\plant.sysj line: 440, column: 55
      currsigs.addElement(proxLaserGUI);
      absStopGUI.setPresent();//sysj\plant.sysj line: 440, column: 74
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

  public void thread68379(int [] tdone, int [] ends){
        S67552=1;
    if(zoneOcc5_t.getprestatus()){//sysj\plant.sysj line: 438, column: 25
      zoneOcc5GUI.setPresent();//sysj\plant.sysj line: 438, column: 37
      currsigs.addElement(zoneOcc5GUI);
      proxLaserGUI.setPresent();//sysj\plant.sysj line: 438, column: 55
      currsigs.addElement(proxLaserGUI);
      absStopGUI.setPresent();//sysj\plant.sysj line: 438, column: 74
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

  public void thread68378(int [] tdone, int [] ends){
        S67541=1;
    if(zoneOcc4_t.getprestatus()){//sysj\plant.sysj line: 436, column: 25
      zoneOcc4GUI.setPresent();//sysj\plant.sysj line: 436, column: 37
      currsigs.addElement(zoneOcc4GUI);
      proxLaserGUI.setPresent();//sysj\plant.sysj line: 436, column: 55
      currsigs.addElement(proxLaserGUI);
      absStopGUI.setPresent();//sysj\plant.sysj line: 436, column: 74
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

  public void thread68377(int [] tdone, int [] ends){
        S67530=1;
    if(zoneOcc3_t.getprestatus()){//sysj\plant.sysj line: 434, column: 25
      zoneOcc3GUI.setPresent();//sysj\plant.sysj line: 434, column: 37
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

  public void thread68376(int [] tdone, int [] ends){
        S67522=1;
    if(zoneOcc2_t.getprestatus()){//sysj\plant.sysj line: 432, column: 25
      zoneOcc2GUI.setPresent();//sysj\plant.sysj line: 432, column: 37
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

  public void thread68375(int [] tdone, int [] ends){
        S67514=1;
    if(zoneOcc1_t.getprestatus()){//sysj\plant.sysj line: 430, column: 25
      zoneOcc1GUI.setPresent();//sysj\plant.sysj line: 430, column: 37
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

  public void thread68374(int [] tdone, int [] ends){
        S67506=1;
    if(zoneOcc0_t.getprestatus()){//sysj\plant.sysj line: 428, column: 25
      zoneOcc0GUI.setPresent();//sysj\plant.sysj line: 428, column: 37
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

  public void thread68373(int [] tdone, int [] ends){
        S67498=1;
    if(accessManu_t.getprestatus()){//sysj\plant.sysj line: 426, column: 25
      accessManuGUI.setPresent();//sysj\plant.sysj line: 426, column: 39
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

  public void thread68372(int [] tdone, int [] ends){
        S67490=1;
    if(accessOffice_t.getprestatus()){//sysj\plant.sysj line: 424, column: 25
      accessOfficeGUI.setPresent();//sysj\plant.sysj line: 424, column: 42
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

  public void thread68371(int [] tdone, int [] ends){
        S67482=1;
    if(unlock1_t.getprestatus()){//sysj\plant.sysj line: 422, column: 25
      unlock1GUI.setPresent();//sysj\plant.sysj line: 422, column: 37
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

  public void thread68370(int [] tdone, int [] ends){
        S67584=1;
    thread68371(tdone,ends);
    thread68372(tdone,ends);
    thread68373(tdone,ends);
    thread68374(tdone,ends);
    thread68375(tdone,ends);
    thread68376(tdone,ends);
    thread68377(tdone,ends);
    thread68378(tdone,ends);
    thread68379(tdone,ends);
    thread68380(tdone,ends);
    thread68381(tdone,ends);
    thread68382(tdone,ends);
    int biggest68383 = 0;
    if(ends[53]>=biggest68383){
      biggest68383=ends[53];
    }
    if(ends[54]>=biggest68383){
      biggest68383=ends[54];
    }
    if(ends[55]>=biggest68383){
      biggest68383=ends[55];
    }
    if(ends[56]>=biggest68383){
      biggest68383=ends[56];
    }
    if(ends[57]>=biggest68383){
      biggest68383=ends[57];
    }
    if(ends[58]>=biggest68383){
      biggest68383=ends[58];
    }
    if(ends[59]>=biggest68383){
      biggest68383=ends[59];
    }
    if(ends[60]>=biggest68383){
      biggest68383=ends[60];
    }
    if(ends[61]>=biggest68383){
      biggest68383=ends[61];
    }
    if(ends[62]>=biggest68383){
      biggest68383=ends[62];
    }
    if(ends[63]>=biggest68383){
      biggest68383=ends[63];
    }
    if(ends[64]>=biggest68383){
      biggest68383=ends[64];
    }
    if(biggest68383 == 1){
      active[52]=1;
      ends[52]=1;
      tdone[52]=1;
    }
  }

  public void thread68368(int [] tdone, int [] ends){
        S67078=1;
    S67077=0;
    active[44]=1;
    ends[44]=1;
    tdone[44]=1;
  }

  public void thread68367(int [] tdone, int [] ends){
        S66953=1;
    S66952=0;
    active[39]=1;
    ends[39]=1;
    tdone[39]=1;
  }

  public void thread68366(int [] tdone, int [] ends){
        S67474=1;
    thread68367(tdone,ends);
    thread68368(tdone,ends);
    int biggest68369 = 0;
    if(ends[39]>=biggest68369){
      biggest68369=ends[39];
    }
    if(ends[44]>=biggest68369){
      biggest68369=ends[44];
    }
    if(biggest68369 == 1){
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
      switch(S68288){
        case 0 : 
          S68288=0;
          break RUN;
        
        case 1 : 
          S68288=2;
          S68288=2;
          new Thread(new ACS_GUI()).start();//sysj\plant.sysj line: 338, column: 2
          thread68366(tdone,ends);
          thread68370(tdone,ends);
          int biggest68384 = 0;
          if(ends[38]>=biggest68384){
            biggest68384=ends[38];
          }
          if(ends[52]>=biggest68384){
            biggest68384=ends[52];
          }
          if(biggest68384 == 1){
            active[37]=1;
            ends[37]=1;
            break RUN;
          }
        
        case 2 : 
          thread68385(tdone,ends);
          thread68431(tdone,ends);
          int biggest68445 = 0;
          if(ends[38]>=biggest68445){
            biggest68445=ends[38];
          }
          if(ends[52]>=biggest68445){
            biggest68445=ends[52];
          }
          if(biggest68445 == 1){
            active[37]=1;
            ends[37]=1;
            break RUN;
          }
          //FINXME code
          if(biggest68445 == 0){
            S68288=0;
            active[37]=0;
            ends[37]=0;
            S68288=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
      if(paused[37]!=0 || suspended[37]!=0 || active[37]!=1);
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
      if(active[37] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
