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
  public Signal pusherRetracted = new Signal("pusherRetracted", Signal.INPUT);
  public Signal pusherExtended = new Signal("pusherExtended", Signal.INPUT);
  public Signal WPgripped = new Signal("WPgripped", Signal.INPUT);
  public Signal armAtSource = new Signal("armAtSource", Signal.INPUT);
  public Signal armAtDest = new Signal("armAtDest", Signal.INPUT);
  public Signal empty = new Signal("empty", Signal.INPUT);
  public Signal request = new Signal("request", Signal.INPUT);
  public Signal mode = new Signal("mode", Signal.INPUT);
  public Signal pusherExtendM = new Signal("pusherExtendM", Signal.INPUT);
  public Signal vacOnM = new Signal("vacOnM", Signal.INPUT);
  public Signal armSourceM = new Signal("armSourceM", Signal.INPUT);
  public Signal armDestM = new Signal("armDestM", Signal.INPUT);
  public Signal pusherExtend = new Signal("pusherExtend", Signal.OUTPUT);
  public Signal vacOn = new Signal("vacOn", Signal.OUTPUT);
  public Signal armSource = new Signal("armSource", Signal.OUTPUT);
  public Signal armDest = new Signal("armDest", Signal.OUTPUT);
  private int S298 = 1;
  private int S98 = 1;
  private int S8 = 1;
  private int S25 = 1;
  private int S43 = 1;
  private int S42 = 1;
  private int S52 = 1;
  private int S51 = 1;
  private int S79 = 1;
  
  private int[] ends = new int[4];
  private int[] tdone = new int[4];
  
  public void thread304(int [] tdone, int [] ends){
        switch(S52){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S51){
          case 0 : 
            if(WPgripped.getprestatus()){//sysj\controller.sysj line: 50, column: 12
              S51=1;
              armDest.setPresent();//sysj\controller.sysj line: 51, column: 6
              currsigs.addElement(armDest);
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
            armDest.setPresent();//sysj\controller.sysj line: 51, column: 6
            currsigs.addElement(armDest);
            active[3]=1;
            ends[3]=1;
            tdone[3]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread303(int [] tdone, int [] ends){
        switch(S43){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S42){
          case 0 : 
            if(!WPgripped.getprestatus()){//sysj\controller.sysj line: 43, column: 12
              S42=1;
              vacOn.setPresent();//sysj\controller.sysj line: 44, column: 6
              currsigs.addElement(vacOn);
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
            vacOn.setPresent();//sysj\controller.sysj line: 44, column: 6
            currsigs.addElement(vacOn);
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread301(int [] tdone, int [] ends){
        S52=1;
    S51=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread300(int [] tdone, int [] ends){
        S43=1;
    S42=0;
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
      switch(S298){
        case 0 : 
          S298=0;
          break RUN;
        
        case 1 : 
          S298=2;
          S298=2;
          S98=0;
          if(request.getprestatus()){//sysj\controller.sysj line: 14, column: 12
            System.out.println("Got request");//sysj\controller.sysj line: 15, column: 5
            S8=0;
            armDest.setPresent();//sysj\controller.sysj line: 18, column: 6
            currsigs.addElement(armDest);
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          else {
            S98=1;
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          switch(S98){
            case 0 : 
              switch(S8){
                case 0 : 
                  if(armAtDest.getprestatus()){//sysj\controller.sysj line: 17, column: 11
                    System.out.println("Extended arm");//sysj\controller.sysj line: 20, column: 5
                    S8=1;
                    pusherExtend.setPresent();//sysj\controller.sysj line: 24, column: 6
                    currsigs.addElement(pusherExtend);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    armDest.setPresent();//sysj\controller.sysj line: 18, column: 6
                    currsigs.addElement(armDest);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                
                case 1 : 
                  if(pusherExtended.getprestatus()){//sysj\controller.sysj line: 23, column: 11
                    System.out.println("Pusher extended");//sysj\controller.sysj line: 26, column: 5
                    S8=2;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    pusherExtend.setPresent();//sysj\controller.sysj line: 24, column: 6
                    currsigs.addElement(pusherExtend);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                
                case 2 : 
                  if(pusherRetracted.getprestatus()){//sysj\controller.sysj line: 29, column: 11
                    System.out.println("Retracted Pusher");//sysj\controller.sysj line: 30, column: 5
                    S8=3;
                    S25=0;
                    armSource.setPresent();//sysj\controller.sysj line: 34, column: 6
                    currsigs.addElement(armSource);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                
                case 3 : 
                  if(armAtSource.getprestatus()){//sysj\controller.sysj line: 33, column: 11
                    System.out.println("Retracted Arm");//sysj\controller.sysj line: 37, column: 5
                    S8=4;
                    thread300(tdone,ends);
                    thread301(tdone,ends);
                    int biggest302 = 0;
                    if(ends[2]>=biggest302){
                      biggest302=ends[2];
                    }
                    if(ends[3]>=biggest302){
                      biggest302=ends[3];
                    }
                    if(biggest302 == 1){
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                  else {
                    switch(S25){
                      case 0 : 
                        armSource.setPresent();//sysj\controller.sysj line: 34, column: 6
                        currsigs.addElement(armSource);
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      
                      case 1 : 
                        vacOn.setPresent();//sysj\controller.sysj line: 35, column: 6
                        currsigs.addElement(vacOn);
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      
                    }
                  }
                  break;
                
                case 4 : 
                  if(armAtDest.getprestatus()){//sysj\controller.sysj line: 40, column: 11
                    System.out.println("Vaccum Off");//sysj\controller.sysj line: 54, column: 5
                    S8=5;
                    S79=0;
                    armSource.setPresent();//sysj\controller.sysj line: 58, column: 6
                    currsigs.addElement(armSource);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    thread303(tdone,ends);
                    thread304(tdone,ends);
                    int biggest305 = 0;
                    if(ends[2]>=biggest305){
                      biggest305=ends[2];
                    }
                    if(ends[3]>=biggest305){
                      biggest305=ends[3];
                    }
                    if(biggest305 == 1){
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    //FINXME code
                    if(biggest305 == 0){
                      System.out.println("Vaccum Off");//sysj\controller.sysj line: 54, column: 5
                      S8=5;
                      S79=0;
                      armSource.setPresent();//sysj\controller.sysj line: 58, column: 6
                      currsigs.addElement(armSource);
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                
                case 5 : 
                  if(armAtSource.getprestatus()){//sysj\controller.sysj line: 57, column: 11
                    System.out.println("Cycle End");//sysj\controller.sysj line: 61, column: 5
                    S98=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    switch(S79){
                      case 0 : 
                        armSource.setPresent();//sysj\controller.sysj line: 58, column: 6
                        currsigs.addElement(armSource);
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      
                      case 1 : 
                        vacOn.setPresent();//sysj\controller.sysj line: 59, column: 6
                        currsigs.addElement(vacOn);
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      
                    }
                  }
                  break;
                
              }
              break;
            
            case 1 : 
              S98=1;
              S98=0;
              if(request.getprestatus()){//sysj\controller.sysj line: 14, column: 12
                System.out.println("Got request");//sysj\controller.sysj line: 15, column: 5
                S8=0;
                armDest.setPresent();//sysj\controller.sysj line: 18, column: 6
                currsigs.addElement(armDest);
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                S98=1;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0};
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
          pusherRetracted.gethook();
          pusherExtended.gethook();
          WPgripped.gethook();
          armAtSource.gethook();
          armAtDest.gethook();
          empty.gethook();
          request.gethook();
          mode.gethook();
          pusherExtendM.gethook();
          vacOnM.gethook();
          armSourceM.gethook();
          armDestM.gethook();
          df = true;
        }
        runClockDomain();
      }
      pusherRetracted.setpreclear();
      pusherExtended.setpreclear();
      WPgripped.setpreclear();
      armAtSource.setpreclear();
      armAtDest.setpreclear();
      empty.setpreclear();
      request.setpreclear();
      mode.setpreclear();
      pusherExtendM.setpreclear();
      vacOnM.setpreclear();
      armSourceM.setpreclear();
      armDestM.setpreclear();
      pusherExtend.setpreclear();
      vacOn.setpreclear();
      armSource.setpreclear();
      armDest.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = pusherRetracted.getStatus() ? pusherRetracted.setprepresent() : pusherRetracted.setpreclear();
      pusherRetracted.setpreval(pusherRetracted.getValue());
      pusherRetracted.setClear();
      dummyint = pusherExtended.getStatus() ? pusherExtended.setprepresent() : pusherExtended.setpreclear();
      pusherExtended.setpreval(pusherExtended.getValue());
      pusherExtended.setClear();
      dummyint = WPgripped.getStatus() ? WPgripped.setprepresent() : WPgripped.setpreclear();
      WPgripped.setpreval(WPgripped.getValue());
      WPgripped.setClear();
      dummyint = armAtSource.getStatus() ? armAtSource.setprepresent() : armAtSource.setpreclear();
      armAtSource.setpreval(armAtSource.getValue());
      armAtSource.setClear();
      dummyint = armAtDest.getStatus() ? armAtDest.setprepresent() : armAtDest.setpreclear();
      armAtDest.setpreval(armAtDest.getValue());
      armAtDest.setClear();
      dummyint = empty.getStatus() ? empty.setprepresent() : empty.setpreclear();
      empty.setpreval(empty.getValue());
      empty.setClear();
      dummyint = request.getStatus() ? request.setprepresent() : request.setpreclear();
      request.setpreval(request.getValue());
      request.setClear();
      dummyint = mode.getStatus() ? mode.setprepresent() : mode.setpreclear();
      mode.setpreval(mode.getValue());
      mode.setClear();
      dummyint = pusherExtendM.getStatus() ? pusherExtendM.setprepresent() : pusherExtendM.setpreclear();
      pusherExtendM.setpreval(pusherExtendM.getValue());
      pusherExtendM.setClear();
      dummyint = vacOnM.getStatus() ? vacOnM.setprepresent() : vacOnM.setpreclear();
      vacOnM.setpreval(vacOnM.getValue());
      vacOnM.setClear();
      dummyint = armSourceM.getStatus() ? armSourceM.setprepresent() : armSourceM.setpreclear();
      armSourceM.setpreval(armSourceM.getValue());
      armSourceM.setClear();
      dummyint = armDestM.getStatus() ? armDestM.setprepresent() : armDestM.setpreclear();
      armDestM.setpreval(armDestM.getValue());
      armDestM.setClear();
      pusherExtend.sethook();
      pusherExtend.setClear();
      vacOn.sethook();
      vacOn.setClear();
      armSource.sethook();
      armSource.setClear();
      armDest.sethook();
      armDest.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        pusherRetracted.gethook();
        pusherExtended.gethook();
        WPgripped.gethook();
        armAtSource.gethook();
        armAtDest.gethook();
        empty.gethook();
        request.gethook();
        mode.gethook();
        pusherExtendM.gethook();
        vacOnM.gethook();
        armSourceM.gethook();
        armDestM.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
