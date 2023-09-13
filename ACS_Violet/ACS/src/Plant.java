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
  private int S2794 = 1;
  private int S2644 = 1;
  private int S2587 = 1;
  private int S2586 = 1;
  private int S2598 = 1;
  private int S2597 = 1;
  private int S2684 = 1;
  private int S2655 = 1;
  private int S2663 = 1;
  private int S2674 = 1;
  private int S2682 = 1;
  
  private int[] ends = new int[10];
  private int[] tdone = new int[10];
  
  public void thread2818(int [] tdone, int [] ends){
        switch(S2682){
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

  public void thread2817(int [] tdone, int [] ends){
        switch(S2674){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(accessOffice_t.getprestatus()){//sysj\plant.sysj line: 66, column: 25
          System.out.println("b");//sysj\plant.sysj line: 66, column: 41
          accessOfficeGUI.setPresent();//sysj\plant.sysj line: 66, column: 66
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

  public void thread2816(int [] tdone, int [] ends){
        switch(S2663){
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

  public void thread2815(int [] tdone, int [] ends){
        switch(S2655){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(unlock1_t.getprestatus()){//sysj\plant.sysj line: 62, column: 25
          System.out.println("a");//sysj\plant.sysj line: 62, column: 36
          unlock1GUI.setPresent();//sysj\plant.sysj line: 62, column: 61
          currsigs.addElement(unlock1GUI);
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

  public void thread2814(int [] tdone, int [] ends){
        switch(S2684){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        thread2815(tdone,ends);
        thread2816(tdone,ends);
        thread2817(tdone,ends);
        thread2818(tdone,ends);
        int biggest2819 = 0;
        if(ends[6]>=biggest2819){
          biggest2819=ends[6];
        }
        if(ends[7]>=biggest2819){
          biggest2819=ends[7];
        }
        if(ends[8]>=biggest2819){
          biggest2819=ends[8];
        }
        if(ends[9]>=biggest2819){
          biggest2819=ends[9];
        }
        if(biggest2819 == 1){
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        //FINXME code
        if(biggest2819 == 0){
          S2684=0;
          active[5]=0;
          ends[5]=0;
          tdone[5]=1;
        }
        break;
      
    }
  }

  public void thread2812(int [] tdone, int [] ends){
        S2598=1;
    S2597=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread2811(int [] tdone, int [] ends){
        S2587=1;
    S2586=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread2809(int [] tdone, int [] ends){
        switch(S2598){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S2597){
          case 0 : 
            if(accessManu.getprestatus()){//sysj\plant.sysj line: 30, column: 11
              S2597=1;
              System.out.println("MANUUUUU");//sysj\plant.sysj line: 33, column: 7
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
              S2597=2;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              System.out.println("MANUUUUU");//sysj\plant.sysj line: 33, column: 7
              accessManu_t.setPresent();//sysj\plant.sysj line: 34, column: 7
              currsigs.addElement(accessManu_t);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 2 : 
            S2597=2;
            S2598=0;
            active[4]=0;
            ends[4]=0;
            tdone[4]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread2808(int [] tdone, int [] ends){
        switch(S2587){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S2586){
          case 0 : 
            if(accessOffice.getprestatus()){//sysj\plant.sysj line: 18, column: 11
              S2586=1;
              System.out.println("OFFIIICEEE");//sysj\plant.sysj line: 21, column: 7
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
              S2586=2;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              System.out.println("OFFIIICEEE");//sysj\plant.sysj line: 21, column: 7
              accessOffice_t.setPresent();//sysj\plant.sysj line: 22, column: 7
              currsigs.addElement(accessOffice_t);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 2 : 
            S2586=2;
            S2587=0;
            active[3]=0;
            ends[3]=0;
            tdone[3]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread2807(int [] tdone, int [] ends){
        switch(S2644){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        thread2808(tdone,ends);
        thread2809(tdone,ends);
        int biggest2810 = 0;
        if(ends[3]>=biggest2810){
          biggest2810=ends[3];
        }
        if(ends[4]>=biggest2810){
          biggest2810=ends[4];
        }
        if(biggest2810 == 1){
          active[2]=1;
          ends[2]=1;
          tdone[2]=1;
        }
        //FINXME code
        if(biggest2810 == 0){
          thread2811(tdone,ends);
          thread2812(tdone,ends);
          int biggest2813 = 0;
          if(ends[3]>=biggest2813){
            biggest2813=ends[3];
          }
          if(ends[4]>=biggest2813){
            biggest2813=ends[4];
          }
          if(biggest2813 == 1){
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
          }
        }
        break;
      
    }
  }

  public void thread2804(int [] tdone, int [] ends){
        S2682=1;
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

  public void thread2803(int [] tdone, int [] ends){
        S2674=1;
    if(accessOffice_t.getprestatus()){//sysj\plant.sysj line: 66, column: 25
      System.out.println("b");//sysj\plant.sysj line: 66, column: 41
      accessOfficeGUI.setPresent();//sysj\plant.sysj line: 66, column: 66
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

  public void thread2802(int [] tdone, int [] ends){
        S2663=1;
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

  public void thread2801(int [] tdone, int [] ends){
        S2655=1;
    if(unlock1_t.getprestatus()){//sysj\plant.sysj line: 62, column: 25
      System.out.println("a");//sysj\plant.sysj line: 62, column: 36
      unlock1GUI.setPresent();//sysj\plant.sysj line: 62, column: 61
      currsigs.addElement(unlock1GUI);
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

  public void thread2800(int [] tdone, int [] ends){
        S2684=1;
    thread2801(tdone,ends);
    thread2802(tdone,ends);
    thread2803(tdone,ends);
    thread2804(tdone,ends);
    int biggest2805 = 0;
    if(ends[6]>=biggest2805){
      biggest2805=ends[6];
    }
    if(ends[7]>=biggest2805){
      biggest2805=ends[7];
    }
    if(ends[8]>=biggest2805){
      biggest2805=ends[8];
    }
    if(ends[9]>=biggest2805){
      biggest2805=ends[9];
    }
    if(biggest2805 == 1){
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread2798(int [] tdone, int [] ends){
        S2598=1;
    S2597=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread2797(int [] tdone, int [] ends){
        S2587=1;
    S2586=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread2796(int [] tdone, int [] ends){
        S2644=1;
    thread2797(tdone,ends);
    thread2798(tdone,ends);
    int biggest2799 = 0;
    if(ends[3]>=biggest2799){
      biggest2799=ends[3];
    }
    if(ends[4]>=biggest2799){
      biggest2799=ends[4];
    }
    if(biggest2799 == 1){
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
      switch(S2794){
        case 0 : 
          S2794=0;
          break RUN;
        
        case 1 : 
          S2794=2;
          S2794=2;
          new Thread(new GUI()).start();//sysj\plant.sysj line: 11, column: 2
          thread2796(tdone,ends);
          thread2800(tdone,ends);
          int biggest2806 = 0;
          if(ends[2]>=biggest2806){
            biggest2806=ends[2];
          }
          if(ends[5]>=biggest2806){
            biggest2806=ends[5];
          }
          if(biggest2806 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread2807(tdone,ends);
          thread2814(tdone,ends);
          int biggest2820 = 0;
          if(ends[2]>=biggest2820){
            biggest2820=ends[2];
          }
          if(ends[5]>=biggest2820){
            biggest2820=ends[5];
          }
          if(biggest2820 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest2820 == 0){
            S2794=0;
            active[1]=0;
            ends[1]=0;
            S2794=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
