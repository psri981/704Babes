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
  private int S1554 = 1;
  private int S1282 = 1;
  private int S1225 = 1;
  private int S1224 = 1;
  private int S1236 = 1;
  private int S1235 = 1;
  private int S1383 = 1;
  private int S1290 = 1;
  private int S1284 = 1;
  private int S1298 = 1;
  private int S1306 = 1;
  private int S1314 = 1;
  private int S1322 = 1;
  private int S1333 = 1;
  private int S1341 = 1;
  private int S1349 = 1;
  private int S1357 = 1;
  private int S1365 = 1;
  private int S1373 = 1;
  private int S1381 = 1;
  
  private int[] ends = new int[18];
  private int[] tdone = new int[18];
  
  public void thread1594(int [] tdone, int [] ends){
        switch(S1381){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        if(zoneOcc7_t.getprestatus()){//sysj\plant.sysj line: 84, column: 25
          zoneOcc7GUI.setPresent();//sysj\plant.sysj line: 84, column: 37
          currsigs.addElement(zoneOcc7GUI);
          active[17]=1;
          ends[17]=1;
          tdone[17]=1;
        }
        else {
          active[17]=1;
          ends[17]=1;
          tdone[17]=1;
        }
        break;
      
    }
  }

  public void thread1593(int [] tdone, int [] ends){
        switch(S1373){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        if(zoneOcc6_t.getprestatus()){//sysj\plant.sysj line: 82, column: 25
          zoneOcc6GUI.setPresent();//sysj\plant.sysj line: 82, column: 37
          currsigs.addElement(zoneOcc6GUI);
          active[16]=1;
          ends[16]=1;
          tdone[16]=1;
        }
        else {
          active[16]=1;
          ends[16]=1;
          tdone[16]=1;
        }
        break;
      
    }
  }

  public void thread1592(int [] tdone, int [] ends){
        switch(S1365){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(zoneOcc5_t.getprestatus()){//sysj\plant.sysj line: 80, column: 25
          zoneOcc5GUI.setPresent();//sysj\plant.sysj line: 80, column: 37
          currsigs.addElement(zoneOcc5GUI);
          active[15]=1;
          ends[15]=1;
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

  public void thread1591(int [] tdone, int [] ends){
        switch(S1357){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(zoneOcc4_t.getprestatus()){//sysj\plant.sysj line: 78, column: 25
          zoneOcc4GUI.setPresent();//sysj\plant.sysj line: 78, column: 37
          currsigs.addElement(zoneOcc4GUI);
          active[14]=1;
          ends[14]=1;
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

  public void thread1590(int [] tdone, int [] ends){
        switch(S1349){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(zoneOcc3_t.getprestatus()){//sysj\plant.sysj line: 76, column: 25
          zoneOcc3GUI.setPresent();//sysj\plant.sysj line: 76, column: 37
          currsigs.addElement(zoneOcc3GUI);
          active[13]=1;
          ends[13]=1;
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

  public void thread1589(int [] tdone, int [] ends){
        switch(S1341){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(zoneOcc2_t.getprestatus()){//sysj\plant.sysj line: 74, column: 25
          zoneOcc2GUI.setPresent();//sysj\plant.sysj line: 74, column: 37
          currsigs.addElement(zoneOcc2GUI);
          active[12]=1;
          ends[12]=1;
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

  public void thread1588(int [] tdone, int [] ends){
        switch(S1333){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(zoneOcc1_t.getprestatus()){//sysj\plant.sysj line: 72, column: 25
          System.out.println("b");//sysj\plant.sysj line: 72, column: 37
          zoneOcc1GUI.setPresent();//sysj\plant.sysj line: 72, column: 61
          currsigs.addElement(zoneOcc1GUI);
          active[11]=1;
          ends[11]=1;
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

  public void thread1587(int [] tdone, int [] ends){
        switch(S1322){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(zoneOcc0_t.getprestatus()){//sysj\plant.sysj line: 70, column: 25
          zoneOcc0GUI.setPresent();//sysj\plant.sysj line: 70, column: 37
          currsigs.addElement(zoneOcc0GUI);
          active[10]=1;
          ends[10]=1;
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

  public void thread1586(int [] tdone, int [] ends){
        switch(S1314){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(accessManu_t.getprestatus()){//sysj\plant.sysj line: 68, column: 25
          accessManuGUI.setPresent();//sysj\plant.sysj line: 68, column: 39
          currsigs.addElement(accessManuGUI);
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
        else {
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
        break;
      
    }
  }

  public void thread1585(int [] tdone, int [] ends){
        switch(S1306){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(accessOffice_t.getprestatus()){//sysj\plant.sysj line: 66, column: 25
          accessOfficeGUI.setPresent();//sysj\plant.sysj line: 66, column: 42
          currsigs.addElement(accessOfficeGUI);
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

  public void thread1584(int [] tdone, int [] ends){
        switch(S1298){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(lock1_t.getprestatus()){//sysj\plant.sysj line: 64, column: 25
          lock1GUI.setPresent();//sysj\plant.sysj line: 64, column: 34
          currsigs.addElement(lock1GUI);
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

  public void thread1583(int [] tdone, int [] ends){
        switch(S1290){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S1284){
          case 0 : 
            S1284=0;
            if(unlock1_t.getprestatus()){//sysj\plant.sysj line: 62, column: 25
              unlock1GUI.setPresent();//sysj\plant.sysj line: 62, column: 37
              currsigs.addElement(unlock1GUI);
              S1284=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              S1284=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
          case 1 : 
            S1284=1;
            S1284=0;
            if(unlock1_t.getprestatus()){//sysj\plant.sysj line: 62, column: 25
              unlock1GUI.setPresent();//sysj\plant.sysj line: 62, column: 37
              currsigs.addElement(unlock1GUI);
              S1284=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              S1284=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1582(int [] tdone, int [] ends){
        switch(S1383){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        thread1583(tdone,ends);
        thread1584(tdone,ends);
        thread1585(tdone,ends);
        thread1586(tdone,ends);
        thread1587(tdone,ends);
        thread1588(tdone,ends);
        thread1589(tdone,ends);
        thread1590(tdone,ends);
        thread1591(tdone,ends);
        thread1592(tdone,ends);
        thread1593(tdone,ends);
        thread1594(tdone,ends);
        int biggest1595 = 0;
        if(ends[6]>=biggest1595){
          biggest1595=ends[6];
        }
        if(ends[7]>=biggest1595){
          biggest1595=ends[7];
        }
        if(ends[8]>=biggest1595){
          biggest1595=ends[8];
        }
        if(ends[9]>=biggest1595){
          biggest1595=ends[9];
        }
        if(ends[10]>=biggest1595){
          biggest1595=ends[10];
        }
        if(ends[11]>=biggest1595){
          biggest1595=ends[11];
        }
        if(ends[12]>=biggest1595){
          biggest1595=ends[12];
        }
        if(ends[13]>=biggest1595){
          biggest1595=ends[13];
        }
        if(ends[14]>=biggest1595){
          biggest1595=ends[14];
        }
        if(ends[15]>=biggest1595){
          biggest1595=ends[15];
        }
        if(ends[16]>=biggest1595){
          biggest1595=ends[16];
        }
        if(ends[17]>=biggest1595){
          biggest1595=ends[17];
        }
        if(biggest1595 == 1){
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        //FINXME code
        if(biggest1595 == 0){
          S1383=0;
          active[5]=0;
          ends[5]=0;
          tdone[5]=1;
        }
        break;
      
    }
  }

  public void thread1580(int [] tdone, int [] ends){
        S1236=1;
    S1235=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread1579(int [] tdone, int [] ends){
        S1225=1;
    S1224=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread1577(int [] tdone, int [] ends){
        switch(S1236){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S1235){
          case 0 : 
            if(accessManu.getprestatus()){//sysj\plant.sysj line: 30, column: 11
              S1235=1;
              accessManu_t.setPresent();//sysj\plant.sysj line: 34, column: 7
              currsigs.addElement(accessManu_t);
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
          
          case 1 : 
            if(accessOffice.getprestatus()){//sysj\plant.sysj line: 31, column: 11
              S1235=2;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              accessManu_t.setPresent();//sysj\plant.sysj line: 34, column: 7
              currsigs.addElement(accessManu_t);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 2 : 
            S1235=2;
            S1236=0;
            active[4]=0;
            ends[4]=0;
            tdone[4]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread1576(int [] tdone, int [] ends){
        switch(S1225){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S1224){
          case 0 : 
            if(accessOffice.getprestatus()){//sysj\plant.sysj line: 18, column: 11
              S1224=1;
              accessOffice_t.setPresent();//sysj\plant.sysj line: 22, column: 7
              currsigs.addElement(accessOffice_t);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            if(accessManu.getprestatus()){//sysj\plant.sysj line: 19, column: 11
              S1224=2;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              accessOffice_t.setPresent();//sysj\plant.sysj line: 22, column: 7
              currsigs.addElement(accessOffice_t);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 2 : 
            S1224=2;
            S1225=0;
            active[3]=0;
            ends[3]=0;
            tdone[3]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread1575(int [] tdone, int [] ends){
        switch(S1282){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        thread1576(tdone,ends);
        thread1577(tdone,ends);
        int biggest1578 = 0;
        if(ends[3]>=biggest1578){
          biggest1578=ends[3];
        }
        if(ends[4]>=biggest1578){
          biggest1578=ends[4];
        }
        if(biggest1578 == 1){
          active[2]=1;
          ends[2]=1;
          tdone[2]=1;
        }
        //FINXME code
        if(biggest1578 == 0){
          thread1579(tdone,ends);
          thread1580(tdone,ends);
          int biggest1581 = 0;
          if(ends[3]>=biggest1581){
            biggest1581=ends[3];
          }
          if(ends[4]>=biggest1581){
            biggest1581=ends[4];
          }
          if(biggest1581 == 1){
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
          }
        }
        break;
      
    }
  }

  public void thread1572(int [] tdone, int [] ends){
        S1381=1;
    if(zoneOcc7_t.getprestatus()){//sysj\plant.sysj line: 84, column: 25
      zoneOcc7GUI.setPresent();//sysj\plant.sysj line: 84, column: 37
      currsigs.addElement(zoneOcc7GUI);
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
    else {
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
  }

  public void thread1571(int [] tdone, int [] ends){
        S1373=1;
    if(zoneOcc6_t.getprestatus()){//sysj\plant.sysj line: 82, column: 25
      zoneOcc6GUI.setPresent();//sysj\plant.sysj line: 82, column: 37
      currsigs.addElement(zoneOcc6GUI);
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
    else {
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread1570(int [] tdone, int [] ends){
        S1365=1;
    if(zoneOcc5_t.getprestatus()){//sysj\plant.sysj line: 80, column: 25
      zoneOcc5GUI.setPresent();//sysj\plant.sysj line: 80, column: 37
      currsigs.addElement(zoneOcc5GUI);
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
    else {
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread1569(int [] tdone, int [] ends){
        S1357=1;
    if(zoneOcc4_t.getprestatus()){//sysj\plant.sysj line: 78, column: 25
      zoneOcc4GUI.setPresent();//sysj\plant.sysj line: 78, column: 37
      currsigs.addElement(zoneOcc4GUI);
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
    else {
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
  }

  public void thread1568(int [] tdone, int [] ends){
        S1349=1;
    if(zoneOcc3_t.getprestatus()){//sysj\plant.sysj line: 76, column: 25
      zoneOcc3GUI.setPresent();//sysj\plant.sysj line: 76, column: 37
      currsigs.addElement(zoneOcc3GUI);
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
    else {
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
  }

  public void thread1567(int [] tdone, int [] ends){
        S1341=1;
    if(zoneOcc2_t.getprestatus()){//sysj\plant.sysj line: 74, column: 25
      zoneOcc2GUI.setPresent();//sysj\plant.sysj line: 74, column: 37
      currsigs.addElement(zoneOcc2GUI);
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
    else {
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
  }

  public void thread1566(int [] tdone, int [] ends){
        S1333=1;
    if(zoneOcc1_t.getprestatus()){//sysj\plant.sysj line: 72, column: 25
      System.out.println("b");//sysj\plant.sysj line: 72, column: 37
      zoneOcc1GUI.setPresent();//sysj\plant.sysj line: 72, column: 61
      currsigs.addElement(zoneOcc1GUI);
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
    else {
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread1565(int [] tdone, int [] ends){
        S1322=1;
    if(zoneOcc0_t.getprestatus()){//sysj\plant.sysj line: 70, column: 25
      zoneOcc0GUI.setPresent();//sysj\plant.sysj line: 70, column: 37
      currsigs.addElement(zoneOcc0GUI);
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    else {
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread1564(int [] tdone, int [] ends){
        S1314=1;
    if(accessManu_t.getprestatus()){//sysj\plant.sysj line: 68, column: 25
      accessManuGUI.setPresent();//sysj\plant.sysj line: 68, column: 39
      currsigs.addElement(accessManuGUI);
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    else {
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread1563(int [] tdone, int [] ends){
        S1306=1;
    if(accessOffice_t.getprestatus()){//sysj\plant.sysj line: 66, column: 25
      accessOfficeGUI.setPresent();//sysj\plant.sysj line: 66, column: 42
      currsigs.addElement(accessOfficeGUI);
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

  public void thread1562(int [] tdone, int [] ends){
        S1298=1;
    if(lock1_t.getprestatus()){//sysj\plant.sysj line: 64, column: 25
      lock1GUI.setPresent();//sysj\plant.sysj line: 64, column: 34
      currsigs.addElement(lock1GUI);
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

  public void thread1561(int [] tdone, int [] ends){
        S1290=1;
    S1284=0;
    if(unlock1_t.getprestatus()){//sysj\plant.sysj line: 62, column: 25
      unlock1GUI.setPresent();//sysj\plant.sysj line: 62, column: 37
      currsigs.addElement(unlock1GUI);
      S1284=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      S1284=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread1560(int [] tdone, int [] ends){
        S1383=1;
    thread1561(tdone,ends);
    thread1562(tdone,ends);
    thread1563(tdone,ends);
    thread1564(tdone,ends);
    thread1565(tdone,ends);
    thread1566(tdone,ends);
    thread1567(tdone,ends);
    thread1568(tdone,ends);
    thread1569(tdone,ends);
    thread1570(tdone,ends);
    thread1571(tdone,ends);
    thread1572(tdone,ends);
    int biggest1573 = 0;
    if(ends[6]>=biggest1573){
      biggest1573=ends[6];
    }
    if(ends[7]>=biggest1573){
      biggest1573=ends[7];
    }
    if(ends[8]>=biggest1573){
      biggest1573=ends[8];
    }
    if(ends[9]>=biggest1573){
      biggest1573=ends[9];
    }
    if(ends[10]>=biggest1573){
      biggest1573=ends[10];
    }
    if(ends[11]>=biggest1573){
      biggest1573=ends[11];
    }
    if(ends[12]>=biggest1573){
      biggest1573=ends[12];
    }
    if(ends[13]>=biggest1573){
      biggest1573=ends[13];
    }
    if(ends[14]>=biggest1573){
      biggest1573=ends[14];
    }
    if(ends[15]>=biggest1573){
      biggest1573=ends[15];
    }
    if(ends[16]>=biggest1573){
      biggest1573=ends[16];
    }
    if(ends[17]>=biggest1573){
      biggest1573=ends[17];
    }
    if(biggest1573 == 1){
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread1558(int [] tdone, int [] ends){
        S1236=1;
    S1235=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread1557(int [] tdone, int [] ends){
        S1225=1;
    S1224=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread1556(int [] tdone, int [] ends){
        S1282=1;
    thread1557(tdone,ends);
    thread1558(tdone,ends);
    int biggest1559 = 0;
    if(ends[3]>=biggest1559){
      biggest1559=ends[3];
    }
    if(ends[4]>=biggest1559){
      biggest1559=ends[4];
    }
    if(biggest1559 == 1){
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
      switch(S1554){
        case 0 : 
          S1554=0;
          break RUN;
        
        case 1 : 
          S1554=2;
          S1554=2;
          new Thread(new GUI()).start();//sysj\plant.sysj line: 11, column: 2
          thread1556(tdone,ends);
          thread1560(tdone,ends);
          int biggest1574 = 0;
          if(ends[2]>=biggest1574){
            biggest1574=ends[2];
          }
          if(ends[5]>=biggest1574){
            biggest1574=ends[5];
          }
          if(biggest1574 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread1575(tdone,ends);
          thread1582(tdone,ends);
          int biggest1596 = 0;
          if(ends[2]>=biggest1596){
            biggest1596=ends[2];
          }
          if(ends[5]>=biggest1596){
            biggest1596=ends[5];
          }
          if(biggest1596 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest1596 == 0){
            S1554=0;
            active[1]=0;
            ends[1]=0;
            S1554=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
