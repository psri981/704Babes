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
  private int S10422 = 1;
  private int S8587 = 1;
  private int S7069 = 1;
  private int S7068 = 1;
  private int S6975 = 1;
  private int S6959 = 1;
  private int S6958 = 1;
  private int S6963 = 1;
  private int S6962 = 1;
  private int S6974 = 1;
  private int S6973 = 1;
  private int S7488 = 1;
  private int S7487 = 1;
  private int S7139 = 1;
  private int S7083 = 1;
  private int S7082 = 1;
  private int S7094 = 1;
  private int S7093 = 1;
  private int S7105 = 1;
  private int S7104 = 1;
  private int S7116 = 1;
  private int S7115 = 1;
  private int S7127 = 1;
  private int S7126 = 1;
  private int S7138 = 1;
  private int S7137 = 1;
  private int S7499 = 1;
  private int S7498 = 1;
  private int S8688 = 1;
  private int S8595 = 1;
  private int S8603 = 1;
  private int S8611 = 1;
  private int S8619 = 1;
  private int S8627 = 1;
  private int S8638 = 1;
  private int S8646 = 1;
  private int S8654 = 1;
  private int S8662 = 1;
  private int S8670 = 1;
  private int S8678 = 1;
  private int S8686 = 1;
  
  private int[] ends = new int[29];
  private int[] tdone = new int[29];
  
  public void thread10501(int [] tdone, int [] ends){
        switch(S8686){
      case 0 : 
        active[28]=0;
        ends[28]=0;
        tdone[28]=1;
        break;
      
      case 1 : 
        if(zoneOcc7_t.getprestatus()){//sysj\plant.sysj line: 166, column: 25
          zoneOcc7GUI.setPresent();//sysj\plant.sysj line: 166, column: 37
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

  public void thread10500(int [] tdone, int [] ends){
        switch(S8678){
      case 0 : 
        active[27]=0;
        ends[27]=0;
        tdone[27]=1;
        break;
      
      case 1 : 
        if(zoneOcc6_t.getprestatus()){//sysj\plant.sysj line: 164, column: 25
          zoneOcc6GUI.setPresent();//sysj\plant.sysj line: 164, column: 37
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

  public void thread10499(int [] tdone, int [] ends){
        switch(S8670){
      case 0 : 
        active[26]=0;
        ends[26]=0;
        tdone[26]=1;
        break;
      
      case 1 : 
        if(zoneOcc5_t.getprestatus()){//sysj\plant.sysj line: 162, column: 25
          zoneOcc5GUI.setPresent();//sysj\plant.sysj line: 162, column: 37
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

  public void thread10498(int [] tdone, int [] ends){
        switch(S8662){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        if(zoneOcc4_t.getprestatus()){//sysj\plant.sysj line: 160, column: 25
          zoneOcc4GUI.setPresent();//sysj\plant.sysj line: 160, column: 37
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

  public void thread10497(int [] tdone, int [] ends){
        switch(S8654){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        if(zoneOcc3_t.getprestatus()){//sysj\plant.sysj line: 158, column: 25
          zoneOcc3GUI.setPresent();//sysj\plant.sysj line: 158, column: 37
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

  public void thread10496(int [] tdone, int [] ends){
        switch(S8646){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        if(zoneOcc2_t.getprestatus()){//sysj\plant.sysj line: 156, column: 25
          zoneOcc2GUI.setPresent();//sysj\plant.sysj line: 156, column: 37
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

  public void thread10495(int [] tdone, int [] ends){
        switch(S8638){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        if(zoneOcc1_t.getprestatus()){//sysj\plant.sysj line: 154, column: 25
          System.out.println("b");//sysj\plant.sysj line: 154, column: 37
          zoneOcc1GUI.setPresent();//sysj\plant.sysj line: 154, column: 61
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

  public void thread10494(int [] tdone, int [] ends){
        switch(S8627){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        if(zoneOcc0_t.getprestatus()){//sysj\plant.sysj line: 152, column: 25
          zoneOcc0GUI.setPresent();//sysj\plant.sysj line: 152, column: 37
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

  public void thread10493(int [] tdone, int [] ends){
        switch(S8619){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        if(accessManu_t.getprestatus()){//sysj\plant.sysj line: 150, column: 25
          accessManuGUI.setPresent();//sysj\plant.sysj line: 150, column: 39
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

  public void thread10492(int [] tdone, int [] ends){
        switch(S8611){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        if(accessOffice_t.getprestatus()){//sysj\plant.sysj line: 148, column: 25
          accessOfficeGUI.setPresent();//sysj\plant.sysj line: 148, column: 42
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

  public void thread10491(int [] tdone, int [] ends){
        switch(S8603){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        if(lock1_t.getprestatus()){//sysj\plant.sysj line: 146, column: 25
          lock1GUI.setPresent();//sysj\plant.sysj line: 146, column: 34
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

  public void thread10490(int [] tdone, int [] ends){
        switch(S8595){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        if(unlock1_t.getprestatus()){//sysj\plant.sysj line: 144, column: 25
          unlock1GUI.setPresent();//sysj\plant.sysj line: 144, column: 37
          currsigs.addElement(unlock1GUI);
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

  public void thread10489(int [] tdone, int [] ends){
        switch(S8688){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        thread10490(tdone,ends);
        thread10491(tdone,ends);
        thread10492(tdone,ends);
        thread10493(tdone,ends);
        thread10494(tdone,ends);
        thread10495(tdone,ends);
        thread10496(tdone,ends);
        thread10497(tdone,ends);
        thread10498(tdone,ends);
        thread10499(tdone,ends);
        thread10500(tdone,ends);
        thread10501(tdone,ends);
        int biggest10502 = 0;
        if(ends[17]>=biggest10502){
          biggest10502=ends[17];
        }
        if(ends[18]>=biggest10502){
          biggest10502=ends[18];
        }
        if(ends[19]>=biggest10502){
          biggest10502=ends[19];
        }
        if(ends[20]>=biggest10502){
          biggest10502=ends[20];
        }
        if(ends[21]>=biggest10502){
          biggest10502=ends[21];
        }
        if(ends[22]>=biggest10502){
          biggest10502=ends[22];
        }
        if(ends[23]>=biggest10502){
          biggest10502=ends[23];
        }
        if(ends[24]>=biggest10502){
          biggest10502=ends[24];
        }
        if(ends[25]>=biggest10502){
          biggest10502=ends[25];
        }
        if(ends[26]>=biggest10502){
          biggest10502=ends[26];
        }
        if(ends[27]>=biggest10502){
          biggest10502=ends[27];
        }
        if(ends[28]>=biggest10502){
          biggest10502=ends[28];
        }
        if(biggest10502 == 1){
          active[16]=1;
          ends[16]=1;
          tdone[16]=1;
        }
        //FINXME code
        if(biggest10502 == 0){
          S8688=0;
          active[16]=0;
          ends[16]=0;
          tdone[16]=1;
        }
        break;
      
    }
  }

  public void thread10487(int [] tdone, int [] ends){
        S7499=1;
    S7498=0;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread10486(int [] tdone, int [] ends){
        S7488=1;
    S7487=0;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread10485(int [] tdone, int [] ends){
        S7069=1;
    S7068=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread10483(int [] tdone, int [] ends){
        switch(S7499){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        switch(S7498){
          case 0 : 
            if(zoneOcc0.getprestatus()){//sysj\plant.sysj line: 130, column: 11
              S7498=1;
              zoneOcc0_t.setPresent();//sysj\plant.sysj line: 133, column: 7
              currsigs.addElement(zoneOcc0_t);
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
          
          case 1 : 
            if(!zoneOcc0.getprestatus()){//sysj\plant.sysj line: 131, column: 11
              S7498=2;
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            else {
              zoneOcc0_t.setPresent();//sysj\plant.sysj line: 133, column: 7
              currsigs.addElement(zoneOcc0_t);
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            break;
          
          case 2 : 
            S7498=2;
            S7499=0;
            active[15]=0;
            ends[15]=0;
            tdone[15]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread10481(int [] tdone, int [] ends){
        S7138=1;
    S7137=0;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread10480(int [] tdone, int [] ends){
        S7127=1;
    S7126=0;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread10479(int [] tdone, int [] ends){
        S7116=1;
    S7115=0;
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread10478(int [] tdone, int [] ends){
        S7105=1;
    S7104=0;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread10477(int [] tdone, int [] ends){
        S7094=1;
    S7093=0;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread10476(int [] tdone, int [] ends){
        S7083=1;
    S7082=0;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread10475(int [] tdone, int [] ends){
        accessManu_t.setPresent();//sysj\plant.sysj line: 53, column: 8
    currsigs.addElement(accessManu_t);
    active[8]=0;
    ends[8]=0;
    tdone[8]=1;
  }

  public void thread10473(int [] tdone, int [] ends){
        switch(S7138){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        switch(S7137){
          case 0 : 
            if(zoneOcc6.getprestatus()){//sysj\plant.sysj line: 112, column: 14
              S7137=1;
              zoneOcc6_t.setPresent();//sysj\plant.sysj line: 115, column: 10
              currsigs.addElement(zoneOcc6_t);
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
          
          case 1 : 
            if(!zoneOcc6.getprestatus()){//sysj\plant.sysj line: 113, column: 14
              S7137=2;
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            else {
              zoneOcc6_t.setPresent();//sysj\plant.sysj line: 115, column: 10
              currsigs.addElement(zoneOcc6_t);
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            break;
          
          case 2 : 
            S7137=2;
            S7138=0;
            active[14]=0;
            ends[14]=0;
            tdone[14]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread10472(int [] tdone, int [] ends){
        switch(S7127){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        switch(S7126){
          case 0 : 
            if(zoneOcc5.getprestatus()){//sysj\plant.sysj line: 101, column: 14
              S7126=1;
              zoneOcc5_t.setPresent();//sysj\plant.sysj line: 104, column: 10
              currsigs.addElement(zoneOcc5_t);
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
            if(!zoneOcc5.getprestatus()){//sysj\plant.sysj line: 102, column: 14
              S7126=2;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            else {
              zoneOcc5_t.setPresent();//sysj\plant.sysj line: 104, column: 10
              currsigs.addElement(zoneOcc5_t);
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            break;
          
          case 2 : 
            S7126=2;
            S7127=0;
            active[13]=0;
            ends[13]=0;
            tdone[13]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread10471(int [] tdone, int [] ends){
        switch(S7116){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        switch(S7115){
          case 0 : 
            if(zoneOcc4.getprestatus()){//sysj\plant.sysj line: 90, column: 14
              S7115=1;
              zoneOcc4_t.setPresent();//sysj\plant.sysj line: 93, column: 10
              currsigs.addElement(zoneOcc4_t);
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
            if(!zoneOcc4.getprestatus()){//sysj\plant.sysj line: 91, column: 14
              S7115=2;
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            else {
              zoneOcc4_t.setPresent();//sysj\plant.sysj line: 93, column: 10
              currsigs.addElement(zoneOcc4_t);
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            break;
          
          case 2 : 
            S7115=2;
            S7116=0;
            active[12]=0;
            ends[12]=0;
            tdone[12]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread10470(int [] tdone, int [] ends){
        switch(S7105){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        switch(S7104){
          case 0 : 
            if(zoneOcc3.getprestatus()){//sysj\plant.sysj line: 79, column: 14
              S7104=1;
              zoneOcc3_t.setPresent();//sysj\plant.sysj line: 82, column: 10
              currsigs.addElement(zoneOcc3_t);
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
            if(!zoneOcc3.getprestatus()){//sysj\plant.sysj line: 80, column: 14
              S7104=2;
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            else {
              zoneOcc3_t.setPresent();//sysj\plant.sysj line: 82, column: 10
              currsigs.addElement(zoneOcc3_t);
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            break;
          
          case 2 : 
            S7104=2;
            S7105=0;
            active[11]=0;
            ends[11]=0;
            tdone[11]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread10469(int [] tdone, int [] ends){
        switch(S7094){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S7093){
          case 0 : 
            if(zoneOcc2.getprestatus()){//sysj\plant.sysj line: 68, column: 14
              S7093=1;
              zoneOcc2_t.setPresent();//sysj\plant.sysj line: 71, column: 10
              currsigs.addElement(zoneOcc2_t);
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
            if(!zoneOcc2.getprestatus()){//sysj\plant.sysj line: 69, column: 14
              S7093=2;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              zoneOcc2_t.setPresent();//sysj\plant.sysj line: 71, column: 10
              currsigs.addElement(zoneOcc2_t);
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
          case 2 : 
            S7093=2;
            S7094=0;
            active[10]=0;
            ends[10]=0;
            tdone[10]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread10468(int [] tdone, int [] ends){
        switch(S7083){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S7082){
          case 0 : 
            if(zoneOcc1.getprestatus()){//sysj\plant.sysj line: 57, column: 14
              S7082=1;
              zoneOcc1_t.setPresent();//sysj\plant.sysj line: 60, column: 10
              currsigs.addElement(zoneOcc1_t);
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
            if(!zoneOcc1.getprestatus()){//sysj\plant.sysj line: 58, column: 14
              S7082=2;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            else {
              zoneOcc1_t.setPresent();//sysj\plant.sysj line: 60, column: 10
              currsigs.addElement(zoneOcc1_t);
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            break;
          
          case 2 : 
            S7082=2;
            S7083=0;
            active[9]=0;
            ends[9]=0;
            tdone[9]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread10467(int [] tdone, int [] ends){
        active[8]=0;
    ends[8]=0;
    tdone[8]=1;
  }

  public void thread10465(int [] tdone, int [] ends){
        S7138=1;
    S7137=0;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread10464(int [] tdone, int [] ends){
        S7127=1;
    S7126=0;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread10463(int [] tdone, int [] ends){
        S7116=1;
    S7115=0;
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread10462(int [] tdone, int [] ends){
        S7105=1;
    S7104=0;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread10461(int [] tdone, int [] ends){
        S7094=1;
    S7093=0;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread10460(int [] tdone, int [] ends){
        S7083=1;
    S7082=0;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread10459(int [] tdone, int [] ends){
        accessManu_t.setPresent();//sysj\plant.sysj line: 53, column: 8
    currsigs.addElement(accessManu_t);
    active[8]=0;
    ends[8]=0;
    tdone[8]=1;
  }

  public void thread10458(int [] tdone, int [] ends){
        switch(S7488){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S7487){
          case 0 : 
            if(accessManu.getprestatus()){//sysj\plant.sysj line: 50, column: 11
              S7487=1;
              S7139=0;
              thread10459(tdone,ends);
              thread10460(tdone,ends);
              thread10461(tdone,ends);
              thread10462(tdone,ends);
              thread10463(tdone,ends);
              thread10464(tdone,ends);
              thread10465(tdone,ends);
              int biggest10466 = 0;
              if(ends[8]>=biggest10466){
                biggest10466=ends[8];
              }
              if(ends[9]>=biggest10466){
                biggest10466=ends[9];
              }
              if(ends[10]>=biggest10466){
                biggest10466=ends[10];
              }
              if(ends[11]>=biggest10466){
                biggest10466=ends[11];
              }
              if(ends[12]>=biggest10466){
                biggest10466=ends[12];
              }
              if(ends[13]>=biggest10466){
                biggest10466=ends[13];
              }
              if(ends[14]>=biggest10466){
                biggest10466=ends[14];
              }
              if(biggest10466 == 1){
                active[7]=1;
                ends[7]=1;
                tdone[7]=1;
              }
            }
            else {
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 1 : 
            if(accessOffice.getprestatus()){//sysj\plant.sysj line: 51, column: 11
              S7487=2;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              switch(S7139){
                case 0 : 
                  thread10467(tdone,ends);
                  thread10468(tdone,ends);
                  thread10469(tdone,ends);
                  thread10470(tdone,ends);
                  thread10471(tdone,ends);
                  thread10472(tdone,ends);
                  thread10473(tdone,ends);
                  int biggest10474 = 0;
                  if(ends[8]>=biggest10474){
                    biggest10474=ends[8];
                  }
                  if(ends[9]>=biggest10474){
                    biggest10474=ends[9];
                  }
                  if(ends[10]>=biggest10474){
                    biggest10474=ends[10];
                  }
                  if(ends[11]>=biggest10474){
                    biggest10474=ends[11];
                  }
                  if(ends[12]>=biggest10474){
                    biggest10474=ends[12];
                  }
                  if(ends[13]>=biggest10474){
                    biggest10474=ends[13];
                  }
                  if(ends[14]>=biggest10474){
                    biggest10474=ends[14];
                  }
                  if(biggest10474 == 1){
                    active[7]=1;
                    ends[7]=1;
                    tdone[7]=1;
                  }
                  //FINXME code
                  if(biggest10474 == 0){
                    S7139=1;
                    active[7]=1;
                    ends[7]=1;
                    tdone[7]=1;
                  }
                  break;
                
                case 1 : 
                  S7139=1;
                  S7139=0;
                  thread10475(tdone,ends);
                  thread10476(tdone,ends);
                  thread10477(tdone,ends);
                  thread10478(tdone,ends);
                  thread10479(tdone,ends);
                  thread10480(tdone,ends);
                  thread10481(tdone,ends);
                  int biggest10482 = 0;
                  if(ends[8]>=biggest10482){
                    biggest10482=ends[8];
                  }
                  if(ends[9]>=biggest10482){
                    biggest10482=ends[9];
                  }
                  if(ends[10]>=biggest10482){
                    biggest10482=ends[10];
                  }
                  if(ends[11]>=biggest10482){
                    biggest10482=ends[11];
                  }
                  if(ends[12]>=biggest10482){
                    biggest10482=ends[12];
                  }
                  if(ends[13]>=biggest10482){
                    biggest10482=ends[13];
                  }
                  if(ends[14]>=biggest10482){
                    biggest10482=ends[14];
                  }
                  if(biggest10482 == 1){
                    active[7]=1;
                    ends[7]=1;
                    tdone[7]=1;
                  }
                  break;
                
              }
            }
            break;
          
          case 2 : 
            S7487=2;
            S7488=0;
            active[7]=0;
            ends[7]=0;
            tdone[7]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread10456(int [] tdone, int [] ends){
        S6974=1;
    S6973=0;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread10455(int [] tdone, int [] ends){
        S6963=1;
    S6962=0;
    if(zoneOcc1.getprestatus()){//sysj\plant.sysj line: 24, column: 16
      System.out.println("What");//sysj\plant.sysj line: 25, column: 9
      zoneOcc1_t.setPresent();//sysj\plant.sysj line: 26, column: 10
      currsigs.addElement(zoneOcc1_t);
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      S6962=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread10454(int [] tdone, int [] ends){
        S6959=1;
    System.out.println("moo");//sysj\plant.sysj line: 21, column: 8
    accessOffice_t.setPresent();//sysj\plant.sysj line: 21, column: 34
    currsigs.addElement(accessOffice_t);
    S6959=0;
    active[4]=0;
    ends[4]=0;
    tdone[4]=1;
  }

  public void thread10452(int [] tdone, int [] ends){
        switch(S6974){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S6973){
          case 0 : 
            if(zoneOcc7.getprestatus()){//sysj\plant.sysj line: 34, column: 14
              S6973=1;
              zoneOcc7_t.setPresent();//sysj\plant.sysj line: 37, column: 10
              currsigs.addElement(zoneOcc7_t);
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
            if(!zoneOcc7.getprestatus()){//sysj\plant.sysj line: 35, column: 14
              S6973=2;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              zoneOcc7_t.setPresent();//sysj\plant.sysj line: 37, column: 10
              currsigs.addElement(zoneOcc7_t);
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
          case 2 : 
            S6973=2;
            S6974=0;
            active[6]=0;
            ends[6]=0;
            tdone[6]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread10451(int [] tdone, int [] ends){
        switch(S6963){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S6962){
          case 0 : 
            S6962=1;
            active[5]=1;
            ends[5]=1;
            tdone[5]=1;
            break;
          
          case 1 : 
            S6962=1;
            S6963=0;
            active[5]=0;
            ends[5]=0;
            tdone[5]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread10450(int [] tdone, int [] ends){
        switch(S6959){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S6958){
        }
        break;
      
    }
  }

  public void thread10448(int [] tdone, int [] ends){
        S6974=1;
    S6973=0;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread10447(int [] tdone, int [] ends){
        S6963=1;
    S6962=0;
    if(zoneOcc1.getprestatus()){//sysj\plant.sysj line: 24, column: 16
      System.out.println("What");//sysj\plant.sysj line: 25, column: 9
      zoneOcc1_t.setPresent();//sysj\plant.sysj line: 26, column: 10
      currsigs.addElement(zoneOcc1_t);
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      S6962=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread10446(int [] tdone, int [] ends){
        S6959=1;
    System.out.println("moo");//sysj\plant.sysj line: 21, column: 8
    accessOffice_t.setPresent();//sysj\plant.sysj line: 21, column: 34
    currsigs.addElement(accessOffice_t);
    S6959=0;
    active[4]=0;
    ends[4]=0;
    tdone[4]=1;
  }

  public void thread10445(int [] tdone, int [] ends){
        switch(S7069){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S7068){
          case 0 : 
            if(accessOffice.getprestatus()){//sysj\plant.sysj line: 18, column: 11
              S7068=1;
              S6975=0;
              thread10446(tdone,ends);
              thread10447(tdone,ends);
              thread10448(tdone,ends);
              int biggest10449 = 0;
              if(ends[4]>=biggest10449){
                biggest10449=ends[4];
              }
              if(ends[5]>=biggest10449){
                biggest10449=ends[5];
              }
              if(ends[6]>=biggest10449){
                biggest10449=ends[6];
              }
              if(biggest10449 == 1){
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
              S7068=2;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              switch(S6975){
                case 0 : 
                  thread10450(tdone,ends);
                  thread10451(tdone,ends);
                  thread10452(tdone,ends);
                  int biggest10453 = 0;
                  if(ends[4]>=biggest10453){
                    biggest10453=ends[4];
                  }
                  if(ends[5]>=biggest10453){
                    biggest10453=ends[5];
                  }
                  if(ends[6]>=biggest10453){
                    biggest10453=ends[6];
                  }
                  if(biggest10453 == 1){
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                  }
                  //FINXME code
                  if(biggest10453 == 0){
                    S6975=1;
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                  }
                  break;
                
                case 1 : 
                  S6975=1;
                  S6975=0;
                  thread10454(tdone,ends);
                  thread10455(tdone,ends);
                  thread10456(tdone,ends);
                  int biggest10457 = 0;
                  if(ends[4]>=biggest10457){
                    biggest10457=ends[4];
                  }
                  if(ends[5]>=biggest10457){
                    biggest10457=ends[5];
                  }
                  if(ends[6]>=biggest10457){
                    biggest10457=ends[6];
                  }
                  if(biggest10457 == 1){
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                  }
                  break;
                
              }
            }
            break;
          
          case 2 : 
            S7068=2;
            S7069=0;
            active[3]=0;
            ends[3]=0;
            tdone[3]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread10444(int [] tdone, int [] ends){
        switch(S8587){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        thread10445(tdone,ends);
        thread10458(tdone,ends);
        thread10483(tdone,ends);
        int biggest10484 = 0;
        if(ends[3]>=biggest10484){
          biggest10484=ends[3];
        }
        if(ends[7]>=biggest10484){
          biggest10484=ends[7];
        }
        if(ends[15]>=biggest10484){
          biggest10484=ends[15];
        }
        if(biggest10484 == 1){
          active[2]=1;
          ends[2]=1;
          tdone[2]=1;
        }
        //FINXME code
        if(biggest10484 == 0){
          thread10485(tdone,ends);
          thread10486(tdone,ends);
          thread10487(tdone,ends);
          int biggest10488 = 0;
          if(ends[3]>=biggest10488){
            biggest10488=ends[3];
          }
          if(ends[7]>=biggest10488){
            biggest10488=ends[7];
          }
          if(ends[15]>=biggest10488){
            biggest10488=ends[15];
          }
          if(biggest10488 == 1){
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
          }
        }
        break;
      
    }
  }

  public void thread10441(int [] tdone, int [] ends){
        S8686=1;
    if(zoneOcc7_t.getprestatus()){//sysj\plant.sysj line: 166, column: 25
      zoneOcc7GUI.setPresent();//sysj\plant.sysj line: 166, column: 37
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

  public void thread10440(int [] tdone, int [] ends){
        S8678=1;
    if(zoneOcc6_t.getprestatus()){//sysj\plant.sysj line: 164, column: 25
      zoneOcc6GUI.setPresent();//sysj\plant.sysj line: 164, column: 37
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

  public void thread10439(int [] tdone, int [] ends){
        S8670=1;
    if(zoneOcc5_t.getprestatus()){//sysj\plant.sysj line: 162, column: 25
      zoneOcc5GUI.setPresent();//sysj\plant.sysj line: 162, column: 37
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

  public void thread10438(int [] tdone, int [] ends){
        S8662=1;
    if(zoneOcc4_t.getprestatus()){//sysj\plant.sysj line: 160, column: 25
      zoneOcc4GUI.setPresent();//sysj\plant.sysj line: 160, column: 37
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

  public void thread10437(int [] tdone, int [] ends){
        S8654=1;
    if(zoneOcc3_t.getprestatus()){//sysj\plant.sysj line: 158, column: 25
      zoneOcc3GUI.setPresent();//sysj\plant.sysj line: 158, column: 37
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

  public void thread10436(int [] tdone, int [] ends){
        S8646=1;
    if(zoneOcc2_t.getprestatus()){//sysj\plant.sysj line: 156, column: 25
      zoneOcc2GUI.setPresent();//sysj\plant.sysj line: 156, column: 37
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

  public void thread10435(int [] tdone, int [] ends){
        S8638=1;
    if(zoneOcc1_t.getprestatus()){//sysj\plant.sysj line: 154, column: 25
      System.out.println("b");//sysj\plant.sysj line: 154, column: 37
      zoneOcc1GUI.setPresent();//sysj\plant.sysj line: 154, column: 61
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

  public void thread10434(int [] tdone, int [] ends){
        S8627=1;
    if(zoneOcc0_t.getprestatus()){//sysj\plant.sysj line: 152, column: 25
      zoneOcc0GUI.setPresent();//sysj\plant.sysj line: 152, column: 37
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

  public void thread10433(int [] tdone, int [] ends){
        S8619=1;
    if(accessManu_t.getprestatus()){//sysj\plant.sysj line: 150, column: 25
      accessManuGUI.setPresent();//sysj\plant.sysj line: 150, column: 39
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

  public void thread10432(int [] tdone, int [] ends){
        S8611=1;
    if(accessOffice_t.getprestatus()){//sysj\plant.sysj line: 148, column: 25
      accessOfficeGUI.setPresent();//sysj\plant.sysj line: 148, column: 42
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

  public void thread10431(int [] tdone, int [] ends){
        S8603=1;
    if(lock1_t.getprestatus()){//sysj\plant.sysj line: 146, column: 25
      lock1GUI.setPresent();//sysj\plant.sysj line: 146, column: 34
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

  public void thread10430(int [] tdone, int [] ends){
        S8595=1;
    if(unlock1_t.getprestatus()){//sysj\plant.sysj line: 144, column: 25
      unlock1GUI.setPresent();//sysj\plant.sysj line: 144, column: 37
      currsigs.addElement(unlock1GUI);
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

  public void thread10429(int [] tdone, int [] ends){
        S8688=1;
    thread10430(tdone,ends);
    thread10431(tdone,ends);
    thread10432(tdone,ends);
    thread10433(tdone,ends);
    thread10434(tdone,ends);
    thread10435(tdone,ends);
    thread10436(tdone,ends);
    thread10437(tdone,ends);
    thread10438(tdone,ends);
    thread10439(tdone,ends);
    thread10440(tdone,ends);
    thread10441(tdone,ends);
    int biggest10442 = 0;
    if(ends[17]>=biggest10442){
      biggest10442=ends[17];
    }
    if(ends[18]>=biggest10442){
      biggest10442=ends[18];
    }
    if(ends[19]>=biggest10442){
      biggest10442=ends[19];
    }
    if(ends[20]>=biggest10442){
      biggest10442=ends[20];
    }
    if(ends[21]>=biggest10442){
      biggest10442=ends[21];
    }
    if(ends[22]>=biggest10442){
      biggest10442=ends[22];
    }
    if(ends[23]>=biggest10442){
      biggest10442=ends[23];
    }
    if(ends[24]>=biggest10442){
      biggest10442=ends[24];
    }
    if(ends[25]>=biggest10442){
      biggest10442=ends[25];
    }
    if(ends[26]>=biggest10442){
      biggest10442=ends[26];
    }
    if(ends[27]>=biggest10442){
      biggest10442=ends[27];
    }
    if(ends[28]>=biggest10442){
      biggest10442=ends[28];
    }
    if(biggest10442 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread10427(int [] tdone, int [] ends){
        S7499=1;
    S7498=0;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread10426(int [] tdone, int [] ends){
        S7488=1;
    S7487=0;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread10425(int [] tdone, int [] ends){
        S7069=1;
    S7068=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread10424(int [] tdone, int [] ends){
        S8587=1;
    thread10425(tdone,ends);
    thread10426(tdone,ends);
    thread10427(tdone,ends);
    int biggest10428 = 0;
    if(ends[3]>=biggest10428){
      biggest10428=ends[3];
    }
    if(ends[7]>=biggest10428){
      biggest10428=ends[7];
    }
    if(ends[15]>=biggest10428){
      biggest10428=ends[15];
    }
    if(biggest10428 == 1){
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
      switch(S10422){
        case 0 : 
          S10422=0;
          break RUN;
        
        case 1 : 
          S10422=2;
          S10422=2;
          new Thread(new GUI()).start();//sysj\plant.sysj line: 11, column: 2
          thread10424(tdone,ends);
          thread10429(tdone,ends);
          int biggest10443 = 0;
          if(ends[2]>=biggest10443){
            biggest10443=ends[2];
          }
          if(ends[16]>=biggest10443){
            biggest10443=ends[16];
          }
          if(biggest10443 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread10444(tdone,ends);
          thread10489(tdone,ends);
          int biggest10503 = 0;
          if(ends[2]>=biggest10503){
            biggest10503=ends[2];
          }
          if(ends[16]>=biggest10503){
            biggest10503=ends[16];
          }
          if(biggest10503 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest10503 == 0){
            S10422=0;
            active[1]=0;
            ends[1]=0;
            S10422=0;
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
