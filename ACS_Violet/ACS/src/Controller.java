import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class Controller extends ClockDomain{
  public Controller(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal reset = new Signal("reset", Signal.INPUT);
  public Signal laserProximity = new Signal("laserProximity", Signal.INPUT);
  public Signal firePresent = new Signal("firePresent", Signal.INPUT);
  public Signal door1req = new Signal("door1req", Signal.INPUT);
  public Signal door2req = new Signal("door2req", Signal.INPUT);
  public Signal door3req = new Signal("door3req", Signal.INPUT);
  public Signal manuPerm = new Signal("manuPerm", Signal.INPUT);
  public Signal officePerm = new Signal("officePerm", Signal.INPUT);
  public Signal zoneOcc1_t = new Signal("zoneOcc1_t", Signal.INPUT);
  public Signal zoneOcc2_t = new Signal("zoneOcc2_t", Signal.INPUT);
  public Signal zoneOcc3_t = new Signal("zoneOcc3_t", Signal.INPUT);
  public Signal zoneOcc4_t = new Signal("zoneOcc4_t", Signal.INPUT);
  public Signal zoneOcc5_t = new Signal("zoneOcc5_t", Signal.INPUT);
  public Signal zoneOcc6_t = new Signal("zoneOcc6_t", Signal.INPUT);
  public Signal zoneOcc7_t = new Signal("zoneOcc7_t", Signal.INPUT);
  public Signal absResume = new Signal("absResume", Signal.OUTPUT);
  public Signal absSuspend = new Signal("absSuspend", Signal.OUTPUT);
  public Signal proxLaser = new Signal("proxLaser", Signal.OUTPUT);
  public Signal unlock1 = new Signal("unlock1", Signal.OUTPUT);
  public Signal unlock2 = new Signal("unlock2", Signal.OUTPUT);
  public Signal unlock3 = new Signal("unlock3", Signal.OUTPUT);
  public Signal zoneOcc1 = new Signal("zoneOcc1", Signal.OUTPUT);
  public Signal zoneOcc2 = new Signal("zoneOcc2", Signal.OUTPUT);
  public Signal zoneOcc3 = new Signal("zoneOcc3", Signal.OUTPUT);
  public Signal zoneOcc4 = new Signal("zoneOcc4", Signal.OUTPUT);
  public Signal zoneOcc5 = new Signal("zoneOcc5", Signal.OUTPUT);
  public Signal zoneOcc6 = new Signal("zoneOcc6", Signal.OUTPUT);
  public Signal zoneOcc7 = new Signal("zoneOcc7", Signal.OUTPUT);
  private int S754 = 1;
  private int S250 = 1;
  private int S10 = 1;
  private int S9 = 1;
  private int S21 = 1;
  private int S20 = 1;
  private int S32 = 1;
  private int S31 = 1;
  private int S107 = 1;
  private int S112 = 1;
  private int S117 = 1;
  
  private int[] ends = new int[8];
  private int[] tdone = new int[8];
  
  public void thread790(int [] tdone, int [] ends){
        S117=1;
    unlock3.setPresent();//sysj\controller.sysj line: 41, column: 5
    currsigs.addElement(unlock3);
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread789(int [] tdone, int [] ends){
        S112=1;
    unlock2.setPresent();//sysj\controller.sysj line: 37, column: 5
    currsigs.addElement(unlock2);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread788(int [] tdone, int [] ends){
        S107=1;
    unlock1.setPresent();//sysj\controller.sysj line: 33, column: 5
    currsigs.addElement(unlock1);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread786(int [] tdone, int [] ends){
        S32=1;
    S31=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread785(int [] tdone, int [] ends){
        S21=1;
    S20=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread784(int [] tdone, int [] ends){
        S10=1;
    S9=0;
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread782(int [] tdone, int [] ends){
        S117=1;
    unlock3.setPresent();//sysj\controller.sysj line: 41, column: 5
    currsigs.addElement(unlock3);
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread781(int [] tdone, int [] ends){
        S112=1;
    unlock2.setPresent();//sysj\controller.sysj line: 37, column: 5
    currsigs.addElement(unlock2);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread780(int [] tdone, int [] ends){
        S107=1;
    unlock1.setPresent();//sysj\controller.sysj line: 33, column: 5
    currsigs.addElement(unlock1);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread778(int [] tdone, int [] ends){
        switch(S117){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        unlock3.setPresent();//sysj\controller.sysj line: 41, column: 5
        currsigs.addElement(unlock3);
        active[7]=1;
        ends[7]=1;
        tdone[7]=1;
        break;
      
    }
  }

  public void thread777(int [] tdone, int [] ends){
        switch(S112){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        unlock2.setPresent();//sysj\controller.sysj line: 37, column: 5
        currsigs.addElement(unlock2);
        active[6]=1;
        ends[6]=1;
        tdone[6]=1;
        break;
      
    }
  }

  public void thread776(int [] tdone, int [] ends){
        switch(S107){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        unlock1.setPresent();//sysj\controller.sysj line: 33, column: 5
        currsigs.addElement(unlock1);
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
        break;
      
    }
  }

  public void thread774(int [] tdone, int [] ends){
        S117=1;
    unlock3.setPresent();//sysj\controller.sysj line: 41, column: 5
    currsigs.addElement(unlock3);
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread773(int [] tdone, int [] ends){
        S112=1;
    unlock2.setPresent();//sysj\controller.sysj line: 37, column: 5
    currsigs.addElement(unlock2);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread772(int [] tdone, int [] ends){
        S107=1;
    unlock1.setPresent();//sysj\controller.sysj line: 33, column: 5
    currsigs.addElement(unlock1);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread770(int [] tdone, int [] ends){
        S32=1;
    S31=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread769(int [] tdone, int [] ends){
        S21=1;
    S20=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread768(int [] tdone, int [] ends){
        S10=1;
    S9=0;
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread766(int [] tdone, int [] ends){
        switch(S32){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S31){
          case 0 : 
            if(door3req.getprestatus()){//sysj\controller.sysj line: 25, column: 12
              S31=1;
              unlock1.setPresent();//sysj\controller.sysj line: 27, column: 7
              currsigs.addElement(unlock1);
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
            if(officePerm.getprestatus()){//sysj\controller.sysj line: 26, column: 12
              S32=0;
              active[4]=0;
              ends[4]=0;
              tdone[4]=1;
            }
            else {
              unlock1.setPresent();//sysj\controller.sysj line: 27, column: 7
              currsigs.addElement(unlock1);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread765(int [] tdone, int [] ends){
        switch(S21){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S20){
          case 0 : 
            if(door2req.getprestatus()){//sysj\controller.sysj line: 17, column: 12
              S20=1;
              unlock1.setPresent();//sysj\controller.sysj line: 19, column: 7
              currsigs.addElement(unlock1);
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
            if(!(officePerm.getprestatus() && manuPerm.getprestatus())){//sysj\controller.sysj line: 18, column: 12
              S21=0;
              active[3]=0;
              ends[3]=0;
              tdone[3]=1;
            }
            else {
              unlock1.setPresent();//sysj\controller.sysj line: 19, column: 7
              currsigs.addElement(unlock1);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread764(int [] tdone, int [] ends){
        switch(S10){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S9){
          case 0 : 
            if(door1req.getprestatus()){//sysj\controller.sysj line: 9, column: 11
              S9=1;
              unlock1.setPresent();//sysj\controller.sysj line: 11, column: 7
              currsigs.addElement(unlock1);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            if(!officePerm.getprestatus()){//sysj\controller.sysj line: 10, column: 11
              S10=0;
              active[2]=0;
              ends[2]=0;
              tdone[2]=1;
            }
            else {
              unlock1.setPresent();//sysj\controller.sysj line: 11, column: 7
              currsigs.addElement(unlock1);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread762(int [] tdone, int [] ends){
        S117=1;
    unlock3.setPresent();//sysj\controller.sysj line: 41, column: 5
    currsigs.addElement(unlock3);
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread761(int [] tdone, int [] ends){
        S112=1;
    unlock2.setPresent();//sysj\controller.sysj line: 37, column: 5
    currsigs.addElement(unlock2);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread760(int [] tdone, int [] ends){
        S107=1;
    unlock1.setPresent();//sysj\controller.sysj line: 33, column: 5
    currsigs.addElement(unlock1);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread758(int [] tdone, int [] ends){
        S32=1;
    S31=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread757(int [] tdone, int [] ends){
        S21=1;
    S20=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread756(int [] tdone, int [] ends){
        S10=1;
    S9=0;
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S754){
        case 0 : 
          S754=0;
          break RUN;
        
        case 1 : 
          S754=2;
          S754=2;
          S250=0;
          if(!firePresent){//sysj\controller.sysj line: 7, column: 9
            thread756(tdone,ends);
            thread757(tdone,ends);
            thread758(tdone,ends);
            int biggest759 = 0;
            if(ends[2]>=biggest759){
              biggest759=ends[2];
            }
            if(ends[3]>=biggest759){
              biggest759=ends[3];
            }
            if(ends[4]>=biggest759){
              biggest759=ends[4];
            }
            if(biggest759 == 1){
              active[1]=1;
              ends[1]=1;
              break RUN;
            }
          }
          else {
            ends[1]=2;
            ;//sysj\controller.sysj line: 7, column: 3
            S250=1;
            if(firePresent){//sysj\controller.sysj line: 31, column: 3
              thread760(tdone,ends);
              thread761(tdone,ends);
              thread762(tdone,ends);
              int biggest763 = 0;
              if(ends[5]>=biggest763){
                biggest763=ends[5];
              }
              if(ends[6]>=biggest763){
                biggest763=ends[6];
              }
              if(ends[7]>=biggest763){
                biggest763=ends[7];
              }
              if(biggest763 == 1){
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            }
            else {
              ends[1]=2;
              ;//sysj\controller.sysj line: 31, column: 3
              S250=2;
              active[1]=1;
              ends[1]=1;
              break RUN;
            }
          }
        
        case 2 : 
          switch(S250){
            case 0 : 
              thread764(tdone,ends);
              thread765(tdone,ends);
              thread766(tdone,ends);
              int biggest767 = 0;
              if(ends[2]>=biggest767){
                biggest767=ends[2];
              }
              if(ends[3]>=biggest767){
                biggest767=ends[3];
              }
              if(ends[4]>=biggest767){
                biggest767=ends[4];
              }
              if(biggest767 == 1){
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              //FINXME code
              if(biggest767 == 0){
                if(!firePresent){//sysj\controller.sysj line: 7, column: 9
                  thread768(tdone,ends);
                  thread769(tdone,ends);
                  thread770(tdone,ends);
                  int biggest771 = 0;
                  if(ends[2]>=biggest771){
                    biggest771=ends[2];
                  }
                  if(ends[3]>=biggest771){
                    biggest771=ends[3];
                  }
                  if(ends[4]>=biggest771){
                    biggest771=ends[4];
                  }
                  if(biggest771 == 1){
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                }
                else {
                  ends[1]=2;
                  ;//sysj\controller.sysj line: 7, column: 3
                  S250=1;
                  if(firePresent){//sysj\controller.sysj line: 31, column: 3
                    thread772(tdone,ends);
                    thread773(tdone,ends);
                    thread774(tdone,ends);
                    int biggest775 = 0;
                    if(ends[5]>=biggest775){
                      biggest775=ends[5];
                    }
                    if(ends[6]>=biggest775){
                      biggest775=ends[6];
                    }
                    if(ends[7]>=biggest775){
                      biggest775=ends[7];
                    }
                    if(biggest775 == 1){
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                  else {
                    ends[1]=2;
                    ;//sysj\controller.sysj line: 31, column: 3
                    S250=2;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                }
              }
            
            case 1 : 
              thread776(tdone,ends);
              thread777(tdone,ends);
              thread778(tdone,ends);
              int biggest779 = 0;
              if(ends[5]>=biggest779){
                biggest779=ends[5];
              }
              if(ends[6]>=biggest779){
                biggest779=ends[6];
              }
              if(ends[7]>=biggest779){
                biggest779=ends[7];
              }
              if(biggest779 == 1){
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              //FINXME code
              if(biggest779 == 0){
                if(firePresent){//sysj\controller.sysj line: 31, column: 3
                  thread780(tdone,ends);
                  thread781(tdone,ends);
                  thread782(tdone,ends);
                  int biggest783 = 0;
                  if(ends[5]>=biggest783){
                    biggest783=ends[5];
                  }
                  if(ends[6]>=biggest783){
                    biggest783=ends[6];
                  }
                  if(ends[7]>=biggest783){
                    biggest783=ends[7];
                  }
                  if(biggest783 == 1){
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                }
                else {
                  ends[1]=2;
                  ;//sysj\controller.sysj line: 31, column: 3
                  S250=2;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
            
            case 2 : 
              S250=2;
              S250=0;
              if(!firePresent){//sysj\controller.sysj line: 7, column: 9
                thread784(tdone,ends);
                thread785(tdone,ends);
                thread786(tdone,ends);
                int biggest787 = 0;
                if(ends[2]>=biggest787){
                  biggest787=ends[2];
                }
                if(ends[3]>=biggest787){
                  biggest787=ends[3];
                }
                if(ends[4]>=biggest787){
                  biggest787=ends[4];
                }
                if(biggest787 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
              else {
                ends[1]=2;
                ;//sysj\controller.sysj line: 7, column: 3
                S250=1;
                if(firePresent){//sysj\controller.sysj line: 31, column: 3
                  thread788(tdone,ends);
                  thread789(tdone,ends);
                  thread790(tdone,ends);
                  int biggest791 = 0;
                  if(ends[5]>=biggest791){
                    biggest791=ends[5];
                  }
                  if(ends[6]>=biggest791){
                    biggest791=ends[6];
                  }
                  if(ends[7]>=biggest791){
                    biggest791=ends[7];
                  }
                  if(biggest791 == 1){
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                }
                else {
                  ends[1]=2;
                  ;//sysj\controller.sysj line: 31, column: 3
                  S250=2;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0};
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
          reset.gethook();
          laserProximity.gethook();
          firePresent.gethook();
          door1req.gethook();
          door2req.gethook();
          door3req.gethook();
          manuPerm.gethook();
          officePerm.gethook();
          zoneOcc1_t.gethook();
          zoneOcc2_t.gethook();
          zoneOcc3_t.gethook();
          zoneOcc4_t.gethook();
          zoneOcc5_t.gethook();
          zoneOcc6_t.gethook();
          zoneOcc7_t.gethook();
          df = true;
        }
        runClockDomain();
      }
      reset.setpreclear();
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
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = reset.getStatus() ? reset.setprepresent() : reset.setpreclear();
      reset.setpreval(reset.getValue());
      reset.setClear();
      dummyint = laserProximity.getStatus() ? laserProximity.setprepresent() : laserProximity.setpreclear();
      laserProximity.setpreval(laserProximity.getValue());
      laserProximity.setClear();
      dummyint = firePresent.getStatus() ? firePresent.setprepresent() : firePresent.setpreclear();
      firePresent.setpreval(firePresent.getValue());
      firePresent.setClear();
      dummyint = door1req.getStatus() ? door1req.setprepresent() : door1req.setpreclear();
      door1req.setpreval(door1req.getValue());
      door1req.setClear();
      dummyint = door2req.getStatus() ? door2req.setprepresent() : door2req.setpreclear();
      door2req.setpreval(door2req.getValue());
      door2req.setClear();
      dummyint = door3req.getStatus() ? door3req.setprepresent() : door3req.setpreclear();
      door3req.setpreval(door3req.getValue());
      door3req.setClear();
      dummyint = manuPerm.getStatus() ? manuPerm.setprepresent() : manuPerm.setpreclear();
      manuPerm.setpreval(manuPerm.getValue());
      manuPerm.setClear();
      dummyint = officePerm.getStatus() ? officePerm.setprepresent() : officePerm.setpreclear();
      officePerm.setpreval(officePerm.getValue());
      officePerm.setClear();
      dummyint = zoneOcc1_t.getStatus() ? zoneOcc1_t.setprepresent() : zoneOcc1_t.setpreclear();
      zoneOcc1_t.setpreval(zoneOcc1_t.getValue());
      zoneOcc1_t.setClear();
      dummyint = zoneOcc2_t.getStatus() ? zoneOcc2_t.setprepresent() : zoneOcc2_t.setpreclear();
      zoneOcc2_t.setpreval(zoneOcc2_t.getValue());
      zoneOcc2_t.setClear();
      dummyint = zoneOcc3_t.getStatus() ? zoneOcc3_t.setprepresent() : zoneOcc3_t.setpreclear();
      zoneOcc3_t.setpreval(zoneOcc3_t.getValue());
      zoneOcc3_t.setClear();
      dummyint = zoneOcc4_t.getStatus() ? zoneOcc4_t.setprepresent() : zoneOcc4_t.setpreclear();
      zoneOcc4_t.setpreval(zoneOcc4_t.getValue());
      zoneOcc4_t.setClear();
      dummyint = zoneOcc5_t.getStatus() ? zoneOcc5_t.setprepresent() : zoneOcc5_t.setpreclear();
      zoneOcc5_t.setpreval(zoneOcc5_t.getValue());
      zoneOcc5_t.setClear();
      dummyint = zoneOcc6_t.getStatus() ? zoneOcc6_t.setprepresent() : zoneOcc6_t.setpreclear();
      zoneOcc6_t.setpreval(zoneOcc6_t.getValue());
      zoneOcc6_t.setClear();
      dummyint = zoneOcc7_t.getStatus() ? zoneOcc7_t.setprepresent() : zoneOcc7_t.setpreclear();
      zoneOcc7_t.setpreval(zoneOcc7_t.getValue());
      zoneOcc7_t.setClear();
      absResume.sethook();
      absResume.setClear();
      absSuspend.sethook();
      absSuspend.setClear();
      proxLaser.sethook();
      proxLaser.setClear();
      unlock1.sethook();
      unlock1.setClear();
      unlock2.sethook();
      unlock2.setClear();
      unlock3.sethook();
      unlock3.setClear();
      zoneOcc1.sethook();
      zoneOcc1.setClear();
      zoneOcc2.sethook();
      zoneOcc2.setClear();
      zoneOcc3.sethook();
      zoneOcc3.setClear();
      zoneOcc4.sethook();
      zoneOcc4.setClear();
      zoneOcc5.sethook();
      zoneOcc5.setClear();
      zoneOcc6.sethook();
      zoneOcc6.setClear();
      zoneOcc7.sethook();
      zoneOcc7.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        reset.gethook();
        laserProximity.gethook();
        firePresent.gethook();
        door1req.gethook();
        door2req.gethook();
        door3req.gethook();
        manuPerm.gethook();
        officePerm.gethook();
        zoneOcc1_t.gethook();
        zoneOcc2_t.gethook();
        zoneOcc3_t.gethook();
        zoneOcc4_t.gethook();
        zoneOcc5_t.gethook();
        zoneOcc6_t.gethook();
        zoneOcc7_t.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
