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
  private int S9148 = 1;
  private int S8701 = 1;
  private int S8347 = 1;
  private int S8346 = 1;
  private int S8358 = 1;
  private int S8357 = 1;
  private int S8369 = 1;
  private int S8368 = 1;
  private int S8380 = 1;
  private int S8379 = 1;
  private int S8391 = 1;
  private int S8390 = 1;
  private int S8402 = 1;
  private int S8401 = 1;
  private int S8413 = 1;
  private int S8412 = 1;
  private int S8424 = 1;
  private int S8423 = 1;
  private int S8435 = 1;
  private int S8434 = 1;
  private int S8446 = 1;
  private int S8445 = 1;
  private int S8457 = 1;
  private int S8456 = 1;
  private int S8741 = 1;
  private int S8712 = 1;
  private int S8720 = 1;
  private int S8731 = 1;
  private int S8739 = 1;
  
  private int[] ends = new int[19];
  private int[] tdone = new int[19];
  
  public void thread9199(int [] tdone, int [] ends){
        switch(S8739){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        if(accessManu_t.getprestatus()){//sysj\plant.sysj line: 176, column: 25
          accessManuGUI.setPresent();//sysj\plant.sysj line: 176, column: 39
          currsigs.addElement(accessManuGUI);
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

  public void thread9198(int [] tdone, int [] ends){
        switch(S8731){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        if(accessOffice_t.getprestatus()){//sysj\plant.sysj line: 174, column: 25
          System.out.println("b");//sysj\plant.sysj line: 174, column: 41
          accessOfficeGUI.setPresent();//sysj\plant.sysj line: 174, column: 66
          currsigs.addElement(accessOfficeGUI);
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

  public void thread9197(int [] tdone, int [] ends){
        switch(S8720){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        if(lock1_t.getprestatus()){//sysj\plant.sysj line: 172, column: 25
          lock1GUI.setPresent();//sysj\plant.sysj line: 172, column: 34
          currsigs.addElement(lock1GUI);
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

  public void thread9196(int [] tdone, int [] ends){
        switch(S8712){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(unlock1_t.getprestatus()){//sysj\plant.sysj line: 170, column: 25
          System.out.println("a");//sysj\plant.sysj line: 170, column: 36
          unlock1GUI.setPresent();//sysj\plant.sysj line: 170, column: 61
          currsigs.addElement(unlock1GUI);
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

  public void thread9195(int [] tdone, int [] ends){
        switch(S8741){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        thread9196(tdone,ends);
        thread9197(tdone,ends);
        thread9198(tdone,ends);
        thread9199(tdone,ends);
        int biggest9200 = 0;
        if(ends[15]>=biggest9200){
          biggest9200=ends[15];
        }
        if(ends[16]>=biggest9200){
          biggest9200=ends[16];
        }
        if(ends[17]>=biggest9200){
          biggest9200=ends[17];
        }
        if(ends[18]>=biggest9200){
          biggest9200=ends[18];
        }
        if(biggest9200 == 1){
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
        //FINXME code
        if(biggest9200 == 0){
          S8741=0;
          active[14]=0;
          ends[14]=0;
          tdone[14]=1;
        }
        break;
      
    }
  }

  public void thread9193(int [] tdone, int [] ends){
        S8457=1;
    S8456=0;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread9192(int [] tdone, int [] ends){
        S8446=1;
    S8445=0;
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread9191(int [] tdone, int [] ends){
        S8435=1;
    S8434=0;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread9190(int [] tdone, int [] ends){
        S8424=1;
    S8423=0;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread9189(int [] tdone, int [] ends){
        S8413=1;
    S8412=0;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread9188(int [] tdone, int [] ends){
        S8402=1;
    S8401=0;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread9187(int [] tdone, int [] ends){
        S8391=1;
    S8390=0;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread9186(int [] tdone, int [] ends){
        S8380=1;
    S8379=0;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread9185(int [] tdone, int [] ends){
        S8369=1;
    S8368=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread9184(int [] tdone, int [] ends){
        S8358=1;
    S8357=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread9183(int [] tdone, int [] ends){
        S8347=1;
    S8346=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread9181(int [] tdone, int [] ends){
        switch(S8457){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        switch(S8456){
          case 0 : 
            if(zoneOcc7.getprestatus()){//sysj\plant.sysj line: 138, column: 11
              S8456=1;
              zoneOcc7_t.setPresent();//sysj\plant.sysj line: 142, column: 7
              currsigs.addElement(zoneOcc7_t);
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
          
          case 1 : 
            if(!zoneOcc7.getprestatus()){//sysj\plant.sysj line: 139, column: 11
              S8456=2;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            else {
              zoneOcc7_t.setPresent();//sysj\plant.sysj line: 142, column: 7
              currsigs.addElement(zoneOcc7_t);
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            break;
          
          case 2 : 
            S8456=2;
            S8457=0;
            active[13]=0;
            ends[13]=0;
            tdone[13]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread9180(int [] tdone, int [] ends){
        switch(S8446){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        switch(S8445){
          case 0 : 
            if(zoneOcc6.getprestatus()){//sysj\plant.sysj line: 126, column: 11
              S8445=1;
              zoneOcc6_t.setPresent();//sysj\plant.sysj line: 130, column: 7
              currsigs.addElement(zoneOcc6_t);
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
          
          case 1 : 
            if(!zoneOcc6.getprestatus()){//sysj\plant.sysj line: 127, column: 11
              S8445=2;
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            else {
              zoneOcc6_t.setPresent();//sysj\plant.sysj line: 130, column: 7
              currsigs.addElement(zoneOcc6_t);
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            break;
          
          case 2 : 
            S8445=2;
            S8446=0;
            active[12]=0;
            ends[12]=0;
            tdone[12]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread9179(int [] tdone, int [] ends){
        switch(S8435){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        switch(S8434){
          case 0 : 
            if(zoneOcc5.getprestatus()){//sysj\plant.sysj line: 114, column: 11
              S8434=1;
              zoneOcc5_t.setPresent();//sysj\plant.sysj line: 118, column: 7
              currsigs.addElement(zoneOcc5_t);
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
          
          case 1 : 
            if(!zoneOcc5.getprestatus()){//sysj\plant.sysj line: 115, column: 11
              S8434=2;
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            else {
              zoneOcc5_t.setPresent();//sysj\plant.sysj line: 118, column: 7
              currsigs.addElement(zoneOcc5_t);
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            break;
          
          case 2 : 
            S8434=2;
            S8435=0;
            active[11]=0;
            ends[11]=0;
            tdone[11]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread9178(int [] tdone, int [] ends){
        switch(S8424){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S8423){
          case 0 : 
            if(zoneOcc4.getprestatus()){//sysj\plant.sysj line: 102, column: 11
              S8423=1;
              zoneOcc4_t.setPresent();//sysj\plant.sysj line: 106, column: 7
              currsigs.addElement(zoneOcc4_t);
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
          
          case 1 : 
            if(!zoneOcc4.getprestatus()){//sysj\plant.sysj line: 103, column: 11
              S8423=2;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              zoneOcc4_t.setPresent();//sysj\plant.sysj line: 106, column: 7
              currsigs.addElement(zoneOcc4_t);
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
          case 2 : 
            S8423=2;
            S8424=0;
            active[10]=0;
            ends[10]=0;
            tdone[10]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread9177(int [] tdone, int [] ends){
        switch(S8413){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S8412){
          case 0 : 
            if(zoneOcc3.getprestatus()){//sysj\plant.sysj line: 90, column: 11
              S8412=1;
              zoneOcc3_t.setPresent();//sysj\plant.sysj line: 94, column: 7
              currsigs.addElement(zoneOcc3_t);
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
          
          case 1 : 
            if(!zoneOcc3.getprestatus()){//sysj\plant.sysj line: 91, column: 11
              S8412=2;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            else {
              zoneOcc3_t.setPresent();//sysj\plant.sysj line: 94, column: 7
              currsigs.addElement(zoneOcc3_t);
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            break;
          
          case 2 : 
            S8412=2;
            S8413=0;
            active[9]=0;
            ends[9]=0;
            tdone[9]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread9176(int [] tdone, int [] ends){
        switch(S8402){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S8401){
          case 0 : 
            if(zoneOcc2.getprestatus()){//sysj\plant.sysj line: 78, column: 11
              S8401=1;
              zoneOcc2_t.setPresent();//sysj\plant.sysj line: 82, column: 7
              currsigs.addElement(zoneOcc2_t);
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
          
          case 1 : 
            if(!zoneOcc2.getprestatus()){//sysj\plant.sysj line: 79, column: 11
              S8401=2;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              zoneOcc2_t.setPresent();//sysj\plant.sysj line: 82, column: 7
              currsigs.addElement(zoneOcc2_t);
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
          case 2 : 
            S8401=2;
            S8402=0;
            active[8]=0;
            ends[8]=0;
            tdone[8]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread9175(int [] tdone, int [] ends){
        switch(S8391){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S8390){
          case 0 : 
            if(zoneOcc1.getprestatus()){//sysj\plant.sysj line: 66, column: 11
              S8390=1;
              zoneOcc1_t.setPresent();//sysj\plant.sysj line: 70, column: 7
              currsigs.addElement(zoneOcc1_t);
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
          
          case 1 : 
            if(!zoneOcc1.getprestatus()){//sysj\plant.sysj line: 67, column: 11
              S8390=2;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              zoneOcc1_t.setPresent();//sysj\plant.sysj line: 70, column: 7
              currsigs.addElement(zoneOcc1_t);
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 2 : 
            S8390=2;
            S8391=0;
            active[7]=0;
            ends[7]=0;
            tdone[7]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread9174(int [] tdone, int [] ends){
        switch(S8380){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S8379){
          case 0 : 
            if(zoneOcc1.getprestatus()){//sysj\plant.sysj line: 54, column: 11
              S8379=1;
              zoneOcc1_t.setPresent();//sysj\plant.sysj line: 58, column: 7
              currsigs.addElement(zoneOcc1_t);
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
          
          case 1 : 
            if(!zoneOcc1.getprestatus()){//sysj\plant.sysj line: 55, column: 11
              S8379=2;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              zoneOcc1_t.setPresent();//sysj\plant.sysj line: 58, column: 7
              currsigs.addElement(zoneOcc1_t);
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
          case 2 : 
            S8379=2;
            S8380=0;
            active[6]=0;
            ends[6]=0;
            tdone[6]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread9173(int [] tdone, int [] ends){
        switch(S8369){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S8368){
          case 0 : 
            if(zoneOcc0.getprestatus()){//sysj\plant.sysj line: 42, column: 11
              S8368=1;
              zoneOcc0_t.setPresent();//sysj\plant.sysj line: 46, column: 7
              currsigs.addElement(zoneOcc0_t);
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
          
          case 1 : 
            if(!zoneOcc0.getprestatus()){//sysj\plant.sysj line: 43, column: 11
              S8368=2;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              zoneOcc0_t.setPresent();//sysj\plant.sysj line: 46, column: 7
              currsigs.addElement(zoneOcc0_t);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 2 : 
            S8368=2;
            S8369=0;
            active[5]=0;
            ends[5]=0;
            tdone[5]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread9172(int [] tdone, int [] ends){
        switch(S8358){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S8357){
          case 0 : 
            if(accessManu.getprestatus()){//sysj\plant.sysj line: 30, column: 11
              S8357=1;
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
              S8357=2;
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
            S8357=2;
            S8358=0;
            active[4]=0;
            ends[4]=0;
            tdone[4]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread9171(int [] tdone, int [] ends){
        switch(S8347){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S8346){
          case 0 : 
            if(accessOffice.getprestatus()){//sysj\plant.sysj line: 18, column: 11
              S8346=1;
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
              S8346=2;
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
            S8346=2;
            S8347=0;
            active[3]=0;
            ends[3]=0;
            tdone[3]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread9170(int [] tdone, int [] ends){
        switch(S8701){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        thread9171(tdone,ends);
        thread9172(tdone,ends);
        thread9173(tdone,ends);
        thread9174(tdone,ends);
        thread9175(tdone,ends);
        thread9176(tdone,ends);
        thread9177(tdone,ends);
        thread9178(tdone,ends);
        thread9179(tdone,ends);
        thread9180(tdone,ends);
        thread9181(tdone,ends);
        int biggest9182 = 0;
        if(ends[3]>=biggest9182){
          biggest9182=ends[3];
        }
        if(ends[4]>=biggest9182){
          biggest9182=ends[4];
        }
        if(ends[5]>=biggest9182){
          biggest9182=ends[5];
        }
        if(ends[6]>=biggest9182){
          biggest9182=ends[6];
        }
        if(ends[7]>=biggest9182){
          biggest9182=ends[7];
        }
        if(ends[8]>=biggest9182){
          biggest9182=ends[8];
        }
        if(ends[9]>=biggest9182){
          biggest9182=ends[9];
        }
        if(ends[10]>=biggest9182){
          biggest9182=ends[10];
        }
        if(ends[11]>=biggest9182){
          biggest9182=ends[11];
        }
        if(ends[12]>=biggest9182){
          biggest9182=ends[12];
        }
        if(ends[13]>=biggest9182){
          biggest9182=ends[13];
        }
        if(biggest9182 == 1){
          active[2]=1;
          ends[2]=1;
          tdone[2]=1;
        }
        //FINXME code
        if(biggest9182 == 0){
          thread9183(tdone,ends);
          thread9184(tdone,ends);
          thread9185(tdone,ends);
          thread9186(tdone,ends);
          thread9187(tdone,ends);
          thread9188(tdone,ends);
          thread9189(tdone,ends);
          thread9190(tdone,ends);
          thread9191(tdone,ends);
          thread9192(tdone,ends);
          thread9193(tdone,ends);
          int biggest9194 = 0;
          if(ends[3]>=biggest9194){
            biggest9194=ends[3];
          }
          if(ends[4]>=biggest9194){
            biggest9194=ends[4];
          }
          if(ends[5]>=biggest9194){
            biggest9194=ends[5];
          }
          if(ends[6]>=biggest9194){
            biggest9194=ends[6];
          }
          if(ends[7]>=biggest9194){
            biggest9194=ends[7];
          }
          if(ends[8]>=biggest9194){
            biggest9194=ends[8];
          }
          if(ends[9]>=biggest9194){
            biggest9194=ends[9];
          }
          if(ends[10]>=biggest9194){
            biggest9194=ends[10];
          }
          if(ends[11]>=biggest9194){
            biggest9194=ends[11];
          }
          if(ends[12]>=biggest9194){
            biggest9194=ends[12];
          }
          if(ends[13]>=biggest9194){
            biggest9194=ends[13];
          }
          if(biggest9194 == 1){
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
          }
        }
        break;
      
    }
  }

  public void thread9167(int [] tdone, int [] ends){
        S8739=1;
    if(accessManu_t.getprestatus()){//sysj\plant.sysj line: 176, column: 25
      accessManuGUI.setPresent();//sysj\plant.sysj line: 176, column: 39
      currsigs.addElement(accessManuGUI);
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

  public void thread9166(int [] tdone, int [] ends){
        S8731=1;
    if(accessOffice_t.getprestatus()){//sysj\plant.sysj line: 174, column: 25
      System.out.println("b");//sysj\plant.sysj line: 174, column: 41
      accessOfficeGUI.setPresent();//sysj\plant.sysj line: 174, column: 66
      currsigs.addElement(accessOfficeGUI);
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

  public void thread9165(int [] tdone, int [] ends){
        S8720=1;
    if(lock1_t.getprestatus()){//sysj\plant.sysj line: 172, column: 25
      lock1GUI.setPresent();//sysj\plant.sysj line: 172, column: 34
      currsigs.addElement(lock1GUI);
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

  public void thread9164(int [] tdone, int [] ends){
        S8712=1;
    if(unlock1_t.getprestatus()){//sysj\plant.sysj line: 170, column: 25
      System.out.println("a");//sysj\plant.sysj line: 170, column: 36
      unlock1GUI.setPresent();//sysj\plant.sysj line: 170, column: 61
      currsigs.addElement(unlock1GUI);
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

  public void thread9163(int [] tdone, int [] ends){
        S8741=1;
    thread9164(tdone,ends);
    thread9165(tdone,ends);
    thread9166(tdone,ends);
    thread9167(tdone,ends);
    int biggest9168 = 0;
    if(ends[15]>=biggest9168){
      biggest9168=ends[15];
    }
    if(ends[16]>=biggest9168){
      biggest9168=ends[16];
    }
    if(ends[17]>=biggest9168){
      biggest9168=ends[17];
    }
    if(ends[18]>=biggest9168){
      biggest9168=ends[18];
    }
    if(biggest9168 == 1){
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
  }

  public void thread9161(int [] tdone, int [] ends){
        S8457=1;
    S8456=0;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread9160(int [] tdone, int [] ends){
        S8446=1;
    S8445=0;
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread9159(int [] tdone, int [] ends){
        S8435=1;
    S8434=0;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread9158(int [] tdone, int [] ends){
        S8424=1;
    S8423=0;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread9157(int [] tdone, int [] ends){
        S8413=1;
    S8412=0;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread9156(int [] tdone, int [] ends){
        S8402=1;
    S8401=0;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread9155(int [] tdone, int [] ends){
        S8391=1;
    S8390=0;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread9154(int [] tdone, int [] ends){
        S8380=1;
    S8379=0;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread9153(int [] tdone, int [] ends){
        S8369=1;
    S8368=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread9152(int [] tdone, int [] ends){
        S8358=1;
    S8357=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread9151(int [] tdone, int [] ends){
        S8347=1;
    S8346=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread9150(int [] tdone, int [] ends){
        S8701=1;
    thread9151(tdone,ends);
    thread9152(tdone,ends);
    thread9153(tdone,ends);
    thread9154(tdone,ends);
    thread9155(tdone,ends);
    thread9156(tdone,ends);
    thread9157(tdone,ends);
    thread9158(tdone,ends);
    thread9159(tdone,ends);
    thread9160(tdone,ends);
    thread9161(tdone,ends);
    int biggest9162 = 0;
    if(ends[3]>=biggest9162){
      biggest9162=ends[3];
    }
    if(ends[4]>=biggest9162){
      biggest9162=ends[4];
    }
    if(ends[5]>=biggest9162){
      biggest9162=ends[5];
    }
    if(ends[6]>=biggest9162){
      biggest9162=ends[6];
    }
    if(ends[7]>=biggest9162){
      biggest9162=ends[7];
    }
    if(ends[8]>=biggest9162){
      biggest9162=ends[8];
    }
    if(ends[9]>=biggest9162){
      biggest9162=ends[9];
    }
    if(ends[10]>=biggest9162){
      biggest9162=ends[10];
    }
    if(ends[11]>=biggest9162){
      biggest9162=ends[11];
    }
    if(ends[12]>=biggest9162){
      biggest9162=ends[12];
    }
    if(ends[13]>=biggest9162){
      biggest9162=ends[13];
    }
    if(biggest9162 == 1){
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
      switch(S9148){
        case 0 : 
          S9148=0;
          break RUN;
        
        case 1 : 
          S9148=2;
          S9148=2;
          new Thread(new GUI()).start();//sysj\plant.sysj line: 11, column: 2
          thread9150(tdone,ends);
          thread9163(tdone,ends);
          int biggest9169 = 0;
          if(ends[2]>=biggest9169){
            biggest9169=ends[2];
          }
          if(ends[14]>=biggest9169){
            biggest9169=ends[14];
          }
          if(biggest9169 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread9170(tdone,ends);
          thread9195(tdone,ends);
          int biggest9201 = 0;
          if(ends[2]>=biggest9201){
            biggest9201=ends[2];
          }
          if(ends[14]>=biggest9201){
            biggest9201=ends[14];
          }
          if(biggest9201 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest9201 == 0){
            S9148=0;
            active[1]=0;
            ends[1]=0;
            S9148=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
