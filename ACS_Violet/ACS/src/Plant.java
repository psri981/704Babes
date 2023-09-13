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
  private int S45642 = 1;
  private int S44848 = 1;
  private int S44329 = 1;
  private int S44328 = 1;
  private int S44261 = 1;
  private int S44264 = 1;
  private int S44267 = 1;
  private int S44270 = 1;
  private int S44454 = 1;
  private int S44453 = 1;
  private int S44332 = 1;
  private int S44335 = 1;
  private int S44338 = 1;
  private int S44341 = 1;
  private int S44344 = 1;
  private int S44347 = 1;
  private int S44350 = 1;
  private int S44949 = 1;
  private int S44856 = 1;
  private int S44850 = 1;
  private int S44864 = 1;
  private int S44872 = 1;
  private int S44880 = 1;
  private int S44888 = 1;
  private int S44899 = 1;
  private int S44907 = 1;
  private int S44915 = 1;
  private int S44923 = 1;
  private int S44931 = 1;
  private int S44939 = 1;
  private int S44947 = 1;
  
  private int[] ends = new int[29];
  private int[] tdone = new int[29];
  
  public void thread45721(int [] tdone, int [] ends){
        switch(S44947){
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

  public void thread45720(int [] tdone, int [] ends){
        switch(S44939){
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

  public void thread45719(int [] tdone, int [] ends){
        switch(S44931){
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

  public void thread45718(int [] tdone, int [] ends){
        switch(S44923){
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

  public void thread45717(int [] tdone, int [] ends){
        switch(S44915){
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

  public void thread45716(int [] tdone, int [] ends){
        switch(S44907){
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

  public void thread45715(int [] tdone, int [] ends){
        switch(S44899){
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

  public void thread45714(int [] tdone, int [] ends){
        switch(S44888){
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

  public void thread45713(int [] tdone, int [] ends){
        switch(S44880){
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

  public void thread45712(int [] tdone, int [] ends){
        switch(S44872){
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

  public void thread45711(int [] tdone, int [] ends){
        switch(S44864){
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

  public void thread45710(int [] tdone, int [] ends){
        switch(S44856){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        switch(S44850){
          case 0 : 
            S44850=0;
            if(unlock1_t.getprestatus()){//sysj\plant.sysj line: 111, column: 25
              unlock1GUI.setPresent();//sysj\plant.sysj line: 111, column: 37
              currsigs.addElement(unlock1GUI);
              S44850=1;
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            else {
              S44850=1;
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            break;
          
          case 1 : 
            S44850=1;
            S44850=0;
            if(unlock1_t.getprestatus()){//sysj\plant.sysj line: 111, column: 25
              unlock1GUI.setPresent();//sysj\plant.sysj line: 111, column: 37
              currsigs.addElement(unlock1GUI);
              S44850=1;
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            else {
              S44850=1;
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread45709(int [] tdone, int [] ends){
        switch(S44949){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        thread45710(tdone,ends);
        thread45711(tdone,ends);
        thread45712(tdone,ends);
        thread45713(tdone,ends);
        thread45714(tdone,ends);
        thread45715(tdone,ends);
        thread45716(tdone,ends);
        thread45717(tdone,ends);
        thread45718(tdone,ends);
        thread45719(tdone,ends);
        thread45720(tdone,ends);
        thread45721(tdone,ends);
        int biggest45722 = 0;
        if(ends[17]>=biggest45722){
          biggest45722=ends[17];
        }
        if(ends[18]>=biggest45722){
          biggest45722=ends[18];
        }
        if(ends[19]>=biggest45722){
          biggest45722=ends[19];
        }
        if(ends[20]>=biggest45722){
          biggest45722=ends[20];
        }
        if(ends[21]>=biggest45722){
          biggest45722=ends[21];
        }
        if(ends[22]>=biggest45722){
          biggest45722=ends[22];
        }
        if(ends[23]>=biggest45722){
          biggest45722=ends[23];
        }
        if(ends[24]>=biggest45722){
          biggest45722=ends[24];
        }
        if(ends[25]>=biggest45722){
          biggest45722=ends[25];
        }
        if(ends[26]>=biggest45722){
          biggest45722=ends[26];
        }
        if(ends[27]>=biggest45722){
          biggest45722=ends[27];
        }
        if(ends[28]>=biggest45722){
          biggest45722=ends[28];
        }
        if(biggest45722 == 1){
          active[16]=1;
          ends[16]=1;
          tdone[16]=1;
        }
        //FINXME code
        if(biggest45722 == 0){
          S44949=0;
          active[16]=0;
          ends[16]=0;
          tdone[16]=1;
        }
        break;
      
    }
  }

  public void thread45707(int [] tdone, int [] ends){
        S44454=1;
    S44453=0;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread45706(int [] tdone, int [] ends){
        S44329=1;
    S44328=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread45703(int [] tdone, int [] ends){
        S44350=1;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread45702(int [] tdone, int [] ends){
        S44347=1;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread45701(int [] tdone, int [] ends){
        S44344=1;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread45700(int [] tdone, int [] ends){
        S44341=1;
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread45699(int [] tdone, int [] ends){
        S44338=1;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread45698(int [] tdone, int [] ends){
        S44335=1;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread45697(int [] tdone, int [] ends){
        S44332=1;
    accessManu_t.setPresent();//sysj\plant.sysj line: 52, column: 8
    currsigs.addElement(accessManu_t);
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread45695(int [] tdone, int [] ends){
        switch(S44350){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(zoneOcc6.getprestatus()){//sysj\plant.sysj line: 82, column: 14
          zoneOcc6_t.setPresent();//sysj\plant.sysj line: 83, column: 8
          currsigs.addElement(zoneOcc6_t);
          S44350=0;
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

  public void thread45694(int [] tdone, int [] ends){
        switch(S44347){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(zoneOcc5.getprestatus()){//sysj\plant.sysj line: 77, column: 14
          zoneOcc5_t.setPresent();//sysj\plant.sysj line: 78, column: 8
          currsigs.addElement(zoneOcc5_t);
          S44347=0;
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

  public void thread45693(int [] tdone, int [] ends){
        switch(S44344){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(zoneOcc4.getprestatus()){//sysj\plant.sysj line: 72, column: 14
          zoneOcc4_t.setPresent();//sysj\plant.sysj line: 73, column: 8
          currsigs.addElement(zoneOcc4_t);
          S44344=0;
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

  public void thread45692(int [] tdone, int [] ends){
        switch(S44341){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(zoneOcc3.getprestatus()){//sysj\plant.sysj line: 67, column: 14
          zoneOcc3_t.setPresent();//sysj\plant.sysj line: 68, column: 8
          currsigs.addElement(zoneOcc3_t);
          S44341=0;
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

  public void thread45691(int [] tdone, int [] ends){
        switch(S44338){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(zoneOcc2.getprestatus()){//sysj\plant.sysj line: 62, column: 14
          zoneOcc2_t.setPresent();//sysj\plant.sysj line: 63, column: 8
          currsigs.addElement(zoneOcc2_t);
          S44338=0;
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

  public void thread45690(int [] tdone, int [] ends){
        switch(S44335){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(zoneOcc0.getprestatus()){//sysj\plant.sysj line: 57, column: 14
          zoneOcc0_t.setPresent();//sysj\plant.sysj line: 58, column: 8
          currsigs.addElement(zoneOcc0_t);
          S44335=0;
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

  public void thread45689(int [] tdone, int [] ends){
        switch(S44332){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        S44332=0;
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
    }
  }

  public void thread45687(int [] tdone, int [] ends){
        S44350=1;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread45686(int [] tdone, int [] ends){
        S44347=1;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread45685(int [] tdone, int [] ends){
        S44344=1;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread45684(int [] tdone, int [] ends){
        S44341=1;
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread45683(int [] tdone, int [] ends){
        S44338=1;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread45682(int [] tdone, int [] ends){
        S44335=1;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread45681(int [] tdone, int [] ends){
        S44332=1;
    accessManu_t.setPresent();//sysj\plant.sysj line: 52, column: 8
    currsigs.addElement(accessManu_t);
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread45680(int [] tdone, int [] ends){
        switch(S44454){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S44453){
          case 0 : 
            if(accessManu.getprestatus()){//sysj\plant.sysj line: 47, column: 11
              S44453=1;
              thread45681(tdone,ends);
              thread45682(tdone,ends);
              thread45683(tdone,ends);
              thread45684(tdone,ends);
              thread45685(tdone,ends);
              thread45686(tdone,ends);
              thread45687(tdone,ends);
              int biggest45688 = 0;
              if(ends[9]>=biggest45688){
                biggest45688=ends[9];
              }
              if(ends[10]>=biggest45688){
                biggest45688=ends[10];
              }
              if(ends[11]>=biggest45688){
                biggest45688=ends[11];
              }
              if(ends[12]>=biggest45688){
                biggest45688=ends[12];
              }
              if(ends[13]>=biggest45688){
                biggest45688=ends[13];
              }
              if(ends[14]>=biggest45688){
                biggest45688=ends[14];
              }
              if(ends[15]>=biggest45688){
                biggest45688=ends[15];
              }
              if(biggest45688 == 1){
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
              S44453=2;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              thread45689(tdone,ends);
              thread45690(tdone,ends);
              thread45691(tdone,ends);
              thread45692(tdone,ends);
              thread45693(tdone,ends);
              thread45694(tdone,ends);
              thread45695(tdone,ends);
              int biggest45696 = 0;
              if(ends[9]>=biggest45696){
                biggest45696=ends[9];
              }
              if(ends[10]>=biggest45696){
                biggest45696=ends[10];
              }
              if(ends[11]>=biggest45696){
                biggest45696=ends[11];
              }
              if(ends[12]>=biggest45696){
                biggest45696=ends[12];
              }
              if(ends[13]>=biggest45696){
                biggest45696=ends[13];
              }
              if(ends[14]>=biggest45696){
                biggest45696=ends[14];
              }
              if(ends[15]>=biggest45696){
                biggest45696=ends[15];
              }
              if(biggest45696 == 1){
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
              //FINXME code
              if(biggest45696 == 0){
                thread45697(tdone,ends);
                thread45698(tdone,ends);
                thread45699(tdone,ends);
                thread45700(tdone,ends);
                thread45701(tdone,ends);
                thread45702(tdone,ends);
                thread45703(tdone,ends);
                int biggest45704 = 0;
                if(ends[9]>=biggest45704){
                  biggest45704=ends[9];
                }
                if(ends[10]>=biggest45704){
                  biggest45704=ends[10];
                }
                if(ends[11]>=biggest45704){
                  biggest45704=ends[11];
                }
                if(ends[12]>=biggest45704){
                  biggest45704=ends[12];
                }
                if(ends[13]>=biggest45704){
                  biggest45704=ends[13];
                }
                if(ends[14]>=biggest45704){
                  biggest45704=ends[14];
                }
                if(ends[15]>=biggest45704){
                  biggest45704=ends[15];
                }
                if(biggest45704 == 1){
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
              }
            }
            break;
          
          case 2 : 
            S44453=2;
            S44454=0;
            active[8]=0;
            ends[8]=0;
            tdone[8]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread45678(int [] tdone, int [] ends){
        S44270=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread45677(int [] tdone, int [] ends){
        S44267=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread45676(int [] tdone, int [] ends){
        S44264=1;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread45675(int [] tdone, int [] ends){
        S44261=1;
    accessOffice_t.setPresent();//sysj\plant.sysj line: 23, column: 8
    currsigs.addElement(accessOffice_t);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread45673(int [] tdone, int [] ends){
        switch(S44270){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(zoneOcc7.getprestatus()){//sysj\plant.sysj line: 38, column: 14
          zoneOcc7_t.setPresent();//sysj\plant.sysj line: 39, column: 8
          currsigs.addElement(zoneOcc7_t);
          S44270=0;
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

  public void thread45672(int [] tdone, int [] ends){
        switch(S44267){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(zoneOcc1.getprestatus()){//sysj\plant.sysj line: 33, column: 14
          zoneOcc1_t.setPresent();//sysj\plant.sysj line: 34, column: 8
          currsigs.addElement(zoneOcc1_t);
          S44267=0;
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

  public void thread45671(int [] tdone, int [] ends){
        switch(S44264){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(zoneOcc0.getprestatus()){//sysj\plant.sysj line: 28, column: 14
          zoneOcc0_t.setPresent();//sysj\plant.sysj line: 29, column: 8
          currsigs.addElement(zoneOcc0_t);
          S44264=0;
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

  public void thread45670(int [] tdone, int [] ends){
        switch(S44261){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        S44261=0;
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
    }
  }

  public void thread45668(int [] tdone, int [] ends){
        S44270=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread45667(int [] tdone, int [] ends){
        S44267=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread45666(int [] tdone, int [] ends){
        S44264=1;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread45665(int [] tdone, int [] ends){
        S44261=1;
    accessOffice_t.setPresent();//sysj\plant.sysj line: 23, column: 8
    currsigs.addElement(accessOffice_t);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread45664(int [] tdone, int [] ends){
        switch(S44329){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S44328){
          case 0 : 
            if(accessOffice.getprestatus()){//sysj\plant.sysj line: 18, column: 11
              S44328=1;
              thread45665(tdone,ends);
              thread45666(tdone,ends);
              thread45667(tdone,ends);
              thread45668(tdone,ends);
              int biggest45669 = 0;
              if(ends[4]>=biggest45669){
                biggest45669=ends[4];
              }
              if(ends[5]>=biggest45669){
                biggest45669=ends[5];
              }
              if(ends[6]>=biggest45669){
                biggest45669=ends[6];
              }
              if(ends[7]>=biggest45669){
                biggest45669=ends[7];
              }
              if(biggest45669 == 1){
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
              S44328=2;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              thread45670(tdone,ends);
              thread45671(tdone,ends);
              thread45672(tdone,ends);
              thread45673(tdone,ends);
              int biggest45674 = 0;
              if(ends[4]>=biggest45674){
                biggest45674=ends[4];
              }
              if(ends[5]>=biggest45674){
                biggest45674=ends[5];
              }
              if(ends[6]>=biggest45674){
                biggest45674=ends[6];
              }
              if(ends[7]>=biggest45674){
                biggest45674=ends[7];
              }
              if(biggest45674 == 1){
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
              //FINXME code
              if(biggest45674 == 0){
                thread45675(tdone,ends);
                thread45676(tdone,ends);
                thread45677(tdone,ends);
                thread45678(tdone,ends);
                int biggest45679 = 0;
                if(ends[4]>=biggest45679){
                  biggest45679=ends[4];
                }
                if(ends[5]>=biggest45679){
                  biggest45679=ends[5];
                }
                if(ends[6]>=biggest45679){
                  biggest45679=ends[6];
                }
                if(ends[7]>=biggest45679){
                  biggest45679=ends[7];
                }
                if(biggest45679 == 1){
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
              }
            }
            break;
          
          case 2 : 
            S44328=2;
            S44329=0;
            active[3]=0;
            ends[3]=0;
            tdone[3]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread45663(int [] tdone, int [] ends){
        switch(S44848){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        thread45664(tdone,ends);
        thread45680(tdone,ends);
        int biggest45705 = 0;
        if(ends[3]>=biggest45705){
          biggest45705=ends[3];
        }
        if(ends[8]>=biggest45705){
          biggest45705=ends[8];
        }
        if(biggest45705 == 1){
          active[2]=1;
          ends[2]=1;
          tdone[2]=1;
        }
        //FINXME code
        if(biggest45705 == 0){
          thread45706(tdone,ends);
          thread45707(tdone,ends);
          int biggest45708 = 0;
          if(ends[3]>=biggest45708){
            biggest45708=ends[3];
          }
          if(ends[8]>=biggest45708){
            biggest45708=ends[8];
          }
          if(biggest45708 == 1){
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
          }
        }
        break;
      
    }
  }

  public void thread45660(int [] tdone, int [] ends){
        S44947=1;
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

  public void thread45659(int [] tdone, int [] ends){
        S44939=1;
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

  public void thread45658(int [] tdone, int [] ends){
        S44931=1;
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

  public void thread45657(int [] tdone, int [] ends){
        S44923=1;
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

  public void thread45656(int [] tdone, int [] ends){
        S44915=1;
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

  public void thread45655(int [] tdone, int [] ends){
        S44907=1;
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

  public void thread45654(int [] tdone, int [] ends){
        S44899=1;
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

  public void thread45653(int [] tdone, int [] ends){
        S44888=1;
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

  public void thread45652(int [] tdone, int [] ends){
        S44880=1;
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

  public void thread45651(int [] tdone, int [] ends){
        S44872=1;
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

  public void thread45650(int [] tdone, int [] ends){
        S44864=1;
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

  public void thread45649(int [] tdone, int [] ends){
        S44856=1;
    S44850=0;
    if(unlock1_t.getprestatus()){//sysj\plant.sysj line: 111, column: 25
      unlock1GUI.setPresent();//sysj\plant.sysj line: 111, column: 37
      currsigs.addElement(unlock1GUI);
      S44850=1;
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
    else {
      S44850=1;
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
  }

  public void thread45648(int [] tdone, int [] ends){
        S44949=1;
    thread45649(tdone,ends);
    thread45650(tdone,ends);
    thread45651(tdone,ends);
    thread45652(tdone,ends);
    thread45653(tdone,ends);
    thread45654(tdone,ends);
    thread45655(tdone,ends);
    thread45656(tdone,ends);
    thread45657(tdone,ends);
    thread45658(tdone,ends);
    thread45659(tdone,ends);
    thread45660(tdone,ends);
    int biggest45661 = 0;
    if(ends[17]>=biggest45661){
      biggest45661=ends[17];
    }
    if(ends[18]>=biggest45661){
      biggest45661=ends[18];
    }
    if(ends[19]>=biggest45661){
      biggest45661=ends[19];
    }
    if(ends[20]>=biggest45661){
      biggest45661=ends[20];
    }
    if(ends[21]>=biggest45661){
      biggest45661=ends[21];
    }
    if(ends[22]>=biggest45661){
      biggest45661=ends[22];
    }
    if(ends[23]>=biggest45661){
      biggest45661=ends[23];
    }
    if(ends[24]>=biggest45661){
      biggest45661=ends[24];
    }
    if(ends[25]>=biggest45661){
      biggest45661=ends[25];
    }
    if(ends[26]>=biggest45661){
      biggest45661=ends[26];
    }
    if(ends[27]>=biggest45661){
      biggest45661=ends[27];
    }
    if(ends[28]>=biggest45661){
      biggest45661=ends[28];
    }
    if(biggest45661 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread45646(int [] tdone, int [] ends){
        S44454=1;
    S44453=0;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread45645(int [] tdone, int [] ends){
        S44329=1;
    S44328=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread45644(int [] tdone, int [] ends){
        S44848=1;
    thread45645(tdone,ends);
    thread45646(tdone,ends);
    int biggest45647 = 0;
    if(ends[3]>=biggest45647){
      biggest45647=ends[3];
    }
    if(ends[8]>=biggest45647){
      biggest45647=ends[8];
    }
    if(biggest45647 == 1){
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
      switch(S45642){
        case 0 : 
          S45642=0;
          break RUN;
        
        case 1 : 
          S45642=2;
          S45642=2;
          new Thread(new GUI()).start();//sysj\plant.sysj line: 11, column: 2
          thread45644(tdone,ends);
          thread45648(tdone,ends);
          int biggest45662 = 0;
          if(ends[2]>=biggest45662){
            biggest45662=ends[2];
          }
          if(ends[16]>=biggest45662){
            biggest45662=ends[16];
          }
          if(biggest45662 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread45663(tdone,ends);
          thread45709(tdone,ends);
          int biggest45723 = 0;
          if(ends[2]>=biggest45723){
            biggest45723=ends[2];
          }
          if(ends[16]>=biggest45723){
            biggest45723=ends[16];
          }
          if(biggest45723 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest45723 == 0){
            S45642=0;
            active[1]=0;
            ends[1]=0;
            S45642=0;
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
