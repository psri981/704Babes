import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class ECS_controller extends ClockDomain{
  public ECS_controller(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal fireZone1 = new Signal("fireZone1", Signal.INPUT);
  public Signal fireZone2 = new Signal("fireZone2", Signal.INPUT);
  public Signal fireZone3 = new Signal("fireZone3", Signal.INPUT);
  public Signal fireZone4 = new Signal("fireZone4", Signal.INPUT);
  public Signal fireZone5 = new Signal("fireZone5", Signal.INPUT);
  public Signal fireZone6 = new Signal("fireZone6", Signal.INPUT);
  public Signal fireZone7 = new Signal("fireZone7", Signal.INPUT);
  public Signal cleanZone1 = new Signal("cleanZone1", Signal.INPUT);
  public Signal cleanZone2 = new Signal("cleanZone2", Signal.INPUT);
  public Signal cleanZone3 = new Signal("cleanZone3", Signal.INPUT);
  public Signal cleanZone4 = new Signal("cleanZone4", Signal.INPUT);
  public Signal cleanZone5 = new Signal("cleanZone5", Signal.INPUT);
  public Signal cleanZone6 = new Signal("cleanZone6", Signal.INPUT);
  public Signal cleanZone7 = new Signal("cleanZone7", Signal.INPUT);
  public Signal fanOnZone1_7 = new Signal("fanOnZone1_7", Signal.INPUT);
  public Signal heatOnZone1_7 = new Signal("heatOnZone1_7", Signal.INPUT);
  public Signal airOnZone2_3 = new Signal("airOnZone2_3", Signal.INPUT);
  public Signal airOnZone4_5_6 = new Signal("airOnZone4_5_6", Signal.INPUT);
  public Signal heatOnZone2_3 = new Signal("heatOnZone2_3", Signal.INPUT);
  public Signal heatOnZone4_5_6 = new Signal("heatOnZone4_5_6", Signal.INPUT);
  public Signal humOnZone1_7 = new Signal("humOnZone1_7", Signal.INPUT);
  public Signal humOnZone2_3 = new Signal("humOnZone2_3", Signal.INPUT);
  public Signal humOnZone4_5_6 = new Signal("humOnZone4_5_6", Signal.INPUT);
  public Signal deHumOnZone1_7 = new Signal("deHumOnZone1_7", Signal.INPUT);
  public Signal deHumOnZone2_3 = new Signal("deHumOnZone2_3", Signal.INPUT);
  public Signal deHumOnZone4_5_6 = new Signal("deHumOnZone4_5_6", Signal.INPUT);
  public Signal cutPow = new Signal("cutPow", Signal.INPUT);
  public Signal pow = new Signal("pow", Signal.INPUT);
  public Signal safeOpTemp = new Signal("safeOpTemp", Signal.OUTPUT);
  public Signal safeOpHumid = new Signal("safeOpHumid", Signal.OUTPUT);
  public Signal powerOff = new Signal("powerOff", Signal.OUTPUT);
  public Signal roomCleaned = new Signal("roomCleaned", Signal.OUTPUT);
  public Signal fireOut = new Signal("fireOut", Signal.OUTPUT);
  public Signal alarmOff = new Signal("alarmOff", Signal.OUTPUT);
  public Signal blindsDown = new Signal("blindsDown", Signal.OUTPUT);
  public Signal evacuated = new Signal("evacuated", Signal.OUTPUT);
  private long __start_thread_1;//sysj\ECS_controller.sysj line: 32, column: 106
  private int S3538 = 1;
  private int S8 = 1;
  
  private int[] ends = new int[2];
  private int[] tdone = new int[2];
  
  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S3538){
        case 0 : 
          S3538=0;
          break RUN;
        
        case 1 : 
          S3538=2;
          S3538=2;
          if(cutPow.getprestatus()){//sysj\ECS_controller.sysj line: 18, column: 11
            System.out.println("");//sysj\ECS_controller.sysj line: 19, column: 4
            System.out.println("Fire detected all power has been cut, please wait...");//sysj\ECS_controller.sysj line: 20, column: 4
            powerOff.setPresent();//sysj\ECS_controller.sysj line: 21, column: 4
            currsigs.addElement(powerOff);
            if(fireZone1.getprestatus()){//sysj\ECS_controller.sysj line: 25, column: 12
              System.out.println("");//sysj\ECS_controller.sysj line: 26, column: 4
              System.out.println("Smoke alarm activated please wait for fire to be extinguished...");//sysj\ECS_controller.sysj line: 27, column: 4
              alarmOff.setPresent();//sysj\ECS_controller.sysj line: 28, column: 4
              currsigs.addElement(alarmOff);
              S8=0;
              if(cleanZone1.getprestatus() || cleanZone2.getprestatus() || cleanZone3.getprestatus() || cleanZone4.getprestatus() || cleanZone5.getprestatus() || cleanZone6.getprestatus() || cleanZone7.getprestatus()){//sysj\ECS_controller.sysj line: 32, column: 11
                System.out.println("");//sysj\ECS_controller.sysj line: 33, column: 4
                System.out.println("High levels of dust detected please wait for room to be cleaned...");//sysj\ECS_controller.sysj line: 34, column: 4
                __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 32, column: 106
                if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 32, column: 106
                  ends[1]=2;
                  ;//sysj\ECS_controller.sysj line: 32, column: 106
                  roomCleaned.setPresent();//sysj\ECS_controller.sysj line: 36, column: 4
                  currsigs.addElement(roomCleaned);
                  S8=1;
                  if(fanOnZone1_7.getprestatus() || heatOnZone1_7.getprestatus() || airOnZone2_3.getprestatus() || airOnZone4_5_6.getprestatus() || heatOnZone2_3.getprestatus() || heatOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 40, column: 11
                    System.out.println("");//sysj\ECS_controller.sysj line: 41, column: 4
                    System.out.println("Room temperature is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 42, column: 4
                    __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 40, column: 111
                    if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 40, column: 111
                      ends[1]=2;
                      ;//sysj\ECS_controller.sysj line: 40, column: 111
                      safeOpTemp.setPresent();//sysj\ECS_controller.sysj line: 44, column: 4
                      currsigs.addElement(safeOpTemp);
                      S8=2;
                      if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 48, column: 11
                        System.out.println("");//sysj\ECS_controller.sysj line: 49, column: 4
                        System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 50, column: 4
                        __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 48, column: 114
                        if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 48, column: 114
                          ends[1]=2;
                          ;//sysj\ECS_controller.sysj line: 48, column: 114
                          safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 52, column: 4
                          currsigs.addElement(safeOpHumid);
                          S8=3;
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                        else {
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                      else {
                        S8=3;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                  else {
                    S8=2;
                    if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 48, column: 11
                      System.out.println("");//sysj\ECS_controller.sysj line: 49, column: 4
                      System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 50, column: 4
                      __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 48, column: 114
                      if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 48, column: 114
                        ends[1]=2;
                        ;//sysj\ECS_controller.sysj line: 48, column: 114
                        safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 52, column: 4
                        currsigs.addElement(safeOpHumid);
                        S8=3;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    }
                    else {
                      S8=3;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                }
                else {
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
              else {
                S8=1;
                if(fanOnZone1_7.getprestatus() || heatOnZone1_7.getprestatus() || airOnZone2_3.getprestatus() || airOnZone4_5_6.getprestatus() || heatOnZone2_3.getprestatus() || heatOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 40, column: 11
                  System.out.println("");//sysj\ECS_controller.sysj line: 41, column: 4
                  System.out.println("Room temperature is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 42, column: 4
                  __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 40, column: 111
                  if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 40, column: 111
                    ends[1]=2;
                    ;//sysj\ECS_controller.sysj line: 40, column: 111
                    safeOpTemp.setPresent();//sysj\ECS_controller.sysj line: 44, column: 4
                    currsigs.addElement(safeOpTemp);
                    S8=2;
                    if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 48, column: 11
                      System.out.println("");//sysj\ECS_controller.sysj line: 49, column: 4
                      System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 50, column: 4
                      __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 48, column: 114
                      if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 48, column: 114
                        ends[1]=2;
                        ;//sysj\ECS_controller.sysj line: 48, column: 114
                        safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 52, column: 4
                        currsigs.addElement(safeOpHumid);
                        S8=3;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    }
                    else {
                      S8=3;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                  else {
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                }
                else {
                  S8=2;
                  if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 48, column: 11
                    System.out.println("");//sysj\ECS_controller.sysj line: 49, column: 4
                    System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 50, column: 4
                    __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 48, column: 114
                    if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 48, column: 114
                      ends[1]=2;
                      ;//sysj\ECS_controller.sysj line: 48, column: 114
                      safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 52, column: 4
                      currsigs.addElement(safeOpHumid);
                      S8=3;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    else {
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                  else {
                    S8=3;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                }
              }
            }
            else {
              S8=0;
              if(cleanZone1.getprestatus() || cleanZone2.getprestatus() || cleanZone3.getprestatus() || cleanZone4.getprestatus() || cleanZone5.getprestatus() || cleanZone6.getprestatus() || cleanZone7.getprestatus()){//sysj\ECS_controller.sysj line: 32, column: 11
                System.out.println("");//sysj\ECS_controller.sysj line: 33, column: 4
                System.out.println("High levels of dust detected please wait for room to be cleaned...");//sysj\ECS_controller.sysj line: 34, column: 4
                __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 32, column: 106
                if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 32, column: 106
                  ends[1]=2;
                  ;//sysj\ECS_controller.sysj line: 32, column: 106
                  roomCleaned.setPresent();//sysj\ECS_controller.sysj line: 36, column: 4
                  currsigs.addElement(roomCleaned);
                  S8=1;
                  if(fanOnZone1_7.getprestatus() || heatOnZone1_7.getprestatus() || airOnZone2_3.getprestatus() || airOnZone4_5_6.getprestatus() || heatOnZone2_3.getprestatus() || heatOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 40, column: 11
                    System.out.println("");//sysj\ECS_controller.sysj line: 41, column: 4
                    System.out.println("Room temperature is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 42, column: 4
                    __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 40, column: 111
                    if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 40, column: 111
                      ends[1]=2;
                      ;//sysj\ECS_controller.sysj line: 40, column: 111
                      safeOpTemp.setPresent();//sysj\ECS_controller.sysj line: 44, column: 4
                      currsigs.addElement(safeOpTemp);
                      S8=2;
                      if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 48, column: 11
                        System.out.println("");//sysj\ECS_controller.sysj line: 49, column: 4
                        System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 50, column: 4
                        __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 48, column: 114
                        if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 48, column: 114
                          ends[1]=2;
                          ;//sysj\ECS_controller.sysj line: 48, column: 114
                          safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 52, column: 4
                          currsigs.addElement(safeOpHumid);
                          S8=3;
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                        else {
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                      else {
                        S8=3;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                  else {
                    S8=2;
                    if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 48, column: 11
                      System.out.println("");//sysj\ECS_controller.sysj line: 49, column: 4
                      System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 50, column: 4
                      __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 48, column: 114
                      if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 48, column: 114
                        ends[1]=2;
                        ;//sysj\ECS_controller.sysj line: 48, column: 114
                        safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 52, column: 4
                        currsigs.addElement(safeOpHumid);
                        S8=3;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    }
                    else {
                      S8=3;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                }
                else {
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
              else {
                S8=1;
                if(fanOnZone1_7.getprestatus() || heatOnZone1_7.getprestatus() || airOnZone2_3.getprestatus() || airOnZone4_5_6.getprestatus() || heatOnZone2_3.getprestatus() || heatOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 40, column: 11
                  System.out.println("");//sysj\ECS_controller.sysj line: 41, column: 4
                  System.out.println("Room temperature is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 42, column: 4
                  __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 40, column: 111
                  if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 40, column: 111
                    ends[1]=2;
                    ;//sysj\ECS_controller.sysj line: 40, column: 111
                    safeOpTemp.setPresent();//sysj\ECS_controller.sysj line: 44, column: 4
                    currsigs.addElement(safeOpTemp);
                    S8=2;
                    if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 48, column: 11
                      System.out.println("");//sysj\ECS_controller.sysj line: 49, column: 4
                      System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 50, column: 4
                      __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 48, column: 114
                      if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 48, column: 114
                        ends[1]=2;
                        ;//sysj\ECS_controller.sysj line: 48, column: 114
                        safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 52, column: 4
                        currsigs.addElement(safeOpHumid);
                        S8=3;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    }
                    else {
                      S8=3;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                  else {
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                }
                else {
                  S8=2;
                  if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 48, column: 11
                    System.out.println("");//sysj\ECS_controller.sysj line: 49, column: 4
                    System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 50, column: 4
                    __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 48, column: 114
                    if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 48, column: 114
                      ends[1]=2;
                      ;//sysj\ECS_controller.sysj line: 48, column: 114
                      safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 52, column: 4
                      currsigs.addElement(safeOpHumid);
                      S8=3;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    else {
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                  else {
                    S8=3;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                }
              }
            }
          }
          else {
            if(fireZone1.getprestatus()){//sysj\ECS_controller.sysj line: 25, column: 12
              System.out.println("");//sysj\ECS_controller.sysj line: 26, column: 4
              System.out.println("Smoke alarm activated please wait for fire to be extinguished...");//sysj\ECS_controller.sysj line: 27, column: 4
              alarmOff.setPresent();//sysj\ECS_controller.sysj line: 28, column: 4
              currsigs.addElement(alarmOff);
              S8=0;
              if(cleanZone1.getprestatus() || cleanZone2.getprestatus() || cleanZone3.getprestatus() || cleanZone4.getprestatus() || cleanZone5.getprestatus() || cleanZone6.getprestatus() || cleanZone7.getprestatus()){//sysj\ECS_controller.sysj line: 32, column: 11
                System.out.println("");//sysj\ECS_controller.sysj line: 33, column: 4
                System.out.println("High levels of dust detected please wait for room to be cleaned...");//sysj\ECS_controller.sysj line: 34, column: 4
                __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 32, column: 106
                if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 32, column: 106
                  ends[1]=2;
                  ;//sysj\ECS_controller.sysj line: 32, column: 106
                  roomCleaned.setPresent();//sysj\ECS_controller.sysj line: 36, column: 4
                  currsigs.addElement(roomCleaned);
                  S8=1;
                  if(fanOnZone1_7.getprestatus() || heatOnZone1_7.getprestatus() || airOnZone2_3.getprestatus() || airOnZone4_5_6.getprestatus() || heatOnZone2_3.getprestatus() || heatOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 40, column: 11
                    System.out.println("");//sysj\ECS_controller.sysj line: 41, column: 4
                    System.out.println("Room temperature is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 42, column: 4
                    __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 40, column: 111
                    if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 40, column: 111
                      ends[1]=2;
                      ;//sysj\ECS_controller.sysj line: 40, column: 111
                      safeOpTemp.setPresent();//sysj\ECS_controller.sysj line: 44, column: 4
                      currsigs.addElement(safeOpTemp);
                      S8=2;
                      if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 48, column: 11
                        System.out.println("");//sysj\ECS_controller.sysj line: 49, column: 4
                        System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 50, column: 4
                        __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 48, column: 114
                        if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 48, column: 114
                          ends[1]=2;
                          ;//sysj\ECS_controller.sysj line: 48, column: 114
                          safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 52, column: 4
                          currsigs.addElement(safeOpHumid);
                          S8=3;
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                        else {
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                      else {
                        S8=3;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                  else {
                    S8=2;
                    if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 48, column: 11
                      System.out.println("");//sysj\ECS_controller.sysj line: 49, column: 4
                      System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 50, column: 4
                      __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 48, column: 114
                      if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 48, column: 114
                        ends[1]=2;
                        ;//sysj\ECS_controller.sysj line: 48, column: 114
                        safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 52, column: 4
                        currsigs.addElement(safeOpHumid);
                        S8=3;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    }
                    else {
                      S8=3;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                }
                else {
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
              else {
                S8=1;
                if(fanOnZone1_7.getprestatus() || heatOnZone1_7.getprestatus() || airOnZone2_3.getprestatus() || airOnZone4_5_6.getprestatus() || heatOnZone2_3.getprestatus() || heatOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 40, column: 11
                  System.out.println("");//sysj\ECS_controller.sysj line: 41, column: 4
                  System.out.println("Room temperature is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 42, column: 4
                  __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 40, column: 111
                  if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 40, column: 111
                    ends[1]=2;
                    ;//sysj\ECS_controller.sysj line: 40, column: 111
                    safeOpTemp.setPresent();//sysj\ECS_controller.sysj line: 44, column: 4
                    currsigs.addElement(safeOpTemp);
                    S8=2;
                    if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 48, column: 11
                      System.out.println("");//sysj\ECS_controller.sysj line: 49, column: 4
                      System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 50, column: 4
                      __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 48, column: 114
                      if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 48, column: 114
                        ends[1]=2;
                        ;//sysj\ECS_controller.sysj line: 48, column: 114
                        safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 52, column: 4
                        currsigs.addElement(safeOpHumid);
                        S8=3;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    }
                    else {
                      S8=3;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                  else {
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                }
                else {
                  S8=2;
                  if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 48, column: 11
                    System.out.println("");//sysj\ECS_controller.sysj line: 49, column: 4
                    System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 50, column: 4
                    __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 48, column: 114
                    if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 48, column: 114
                      ends[1]=2;
                      ;//sysj\ECS_controller.sysj line: 48, column: 114
                      safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 52, column: 4
                      currsigs.addElement(safeOpHumid);
                      S8=3;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    else {
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                  else {
                    S8=3;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                }
              }
            }
            else {
              S8=0;
              if(cleanZone1.getprestatus() || cleanZone2.getprestatus() || cleanZone3.getprestatus() || cleanZone4.getprestatus() || cleanZone5.getprestatus() || cleanZone6.getprestatus() || cleanZone7.getprestatus()){//sysj\ECS_controller.sysj line: 32, column: 11
                System.out.println("");//sysj\ECS_controller.sysj line: 33, column: 4
                System.out.println("High levels of dust detected please wait for room to be cleaned...");//sysj\ECS_controller.sysj line: 34, column: 4
                __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 32, column: 106
                if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 32, column: 106
                  ends[1]=2;
                  ;//sysj\ECS_controller.sysj line: 32, column: 106
                  roomCleaned.setPresent();//sysj\ECS_controller.sysj line: 36, column: 4
                  currsigs.addElement(roomCleaned);
                  S8=1;
                  if(fanOnZone1_7.getprestatus() || heatOnZone1_7.getprestatus() || airOnZone2_3.getprestatus() || airOnZone4_5_6.getprestatus() || heatOnZone2_3.getprestatus() || heatOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 40, column: 11
                    System.out.println("");//sysj\ECS_controller.sysj line: 41, column: 4
                    System.out.println("Room temperature is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 42, column: 4
                    __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 40, column: 111
                    if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 40, column: 111
                      ends[1]=2;
                      ;//sysj\ECS_controller.sysj line: 40, column: 111
                      safeOpTemp.setPresent();//sysj\ECS_controller.sysj line: 44, column: 4
                      currsigs.addElement(safeOpTemp);
                      S8=2;
                      if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 48, column: 11
                        System.out.println("");//sysj\ECS_controller.sysj line: 49, column: 4
                        System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 50, column: 4
                        __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 48, column: 114
                        if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 48, column: 114
                          ends[1]=2;
                          ;//sysj\ECS_controller.sysj line: 48, column: 114
                          safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 52, column: 4
                          currsigs.addElement(safeOpHumid);
                          S8=3;
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                        else {
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                      else {
                        S8=3;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                  else {
                    S8=2;
                    if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 48, column: 11
                      System.out.println("");//sysj\ECS_controller.sysj line: 49, column: 4
                      System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 50, column: 4
                      __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 48, column: 114
                      if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 48, column: 114
                        ends[1]=2;
                        ;//sysj\ECS_controller.sysj line: 48, column: 114
                        safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 52, column: 4
                        currsigs.addElement(safeOpHumid);
                        S8=3;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    }
                    else {
                      S8=3;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                }
                else {
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
              else {
                S8=1;
                if(fanOnZone1_7.getprestatus() || heatOnZone1_7.getprestatus() || airOnZone2_3.getprestatus() || airOnZone4_5_6.getprestatus() || heatOnZone2_3.getprestatus() || heatOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 40, column: 11
                  System.out.println("");//sysj\ECS_controller.sysj line: 41, column: 4
                  System.out.println("Room temperature is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 42, column: 4
                  __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 40, column: 111
                  if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 40, column: 111
                    ends[1]=2;
                    ;//sysj\ECS_controller.sysj line: 40, column: 111
                    safeOpTemp.setPresent();//sysj\ECS_controller.sysj line: 44, column: 4
                    currsigs.addElement(safeOpTemp);
                    S8=2;
                    if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 48, column: 11
                      System.out.println("");//sysj\ECS_controller.sysj line: 49, column: 4
                      System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 50, column: 4
                      __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 48, column: 114
                      if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 48, column: 114
                        ends[1]=2;
                        ;//sysj\ECS_controller.sysj line: 48, column: 114
                        safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 52, column: 4
                        currsigs.addElement(safeOpHumid);
                        S8=3;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    }
                    else {
                      S8=3;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                  else {
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                }
                else {
                  S8=2;
                  if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 48, column: 11
                    System.out.println("");//sysj\ECS_controller.sysj line: 49, column: 4
                    System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 50, column: 4
                    __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 48, column: 114
                    if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 48, column: 114
                      ends[1]=2;
                      ;//sysj\ECS_controller.sysj line: 48, column: 114
                      safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 52, column: 4
                      currsigs.addElement(safeOpHumid);
                      S8=3;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    else {
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                  else {
                    S8=3;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                }
              }
            }
          }
        
        case 2 : 
          switch(S8){
            case 0 : 
              if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 32, column: 106
                ends[1]=2;
                ;//sysj\ECS_controller.sysj line: 32, column: 106
                roomCleaned.setPresent();//sysj\ECS_controller.sysj line: 36, column: 4
                currsigs.addElement(roomCleaned);
                S8=1;
                if(fanOnZone1_7.getprestatus() || heatOnZone1_7.getprestatus() || airOnZone2_3.getprestatus() || airOnZone4_5_6.getprestatus() || heatOnZone2_3.getprestatus() || heatOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 40, column: 11
                  System.out.println("");//sysj\ECS_controller.sysj line: 41, column: 4
                  System.out.println("Room temperature is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 42, column: 4
                  __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 40, column: 111
                  if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 40, column: 111
                    ends[1]=2;
                    ;//sysj\ECS_controller.sysj line: 40, column: 111
                    safeOpTemp.setPresent();//sysj\ECS_controller.sysj line: 44, column: 4
                    currsigs.addElement(safeOpTemp);
                    S8=2;
                    if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 48, column: 11
                      System.out.println("");//sysj\ECS_controller.sysj line: 49, column: 4
                      System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 50, column: 4
                      __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 48, column: 114
                      if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 48, column: 114
                        ends[1]=2;
                        ;//sysj\ECS_controller.sysj line: 48, column: 114
                        safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 52, column: 4
                        currsigs.addElement(safeOpHumid);
                        S8=3;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    }
                    else {
                      S8=3;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                  else {
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                }
                else {
                  S8=2;
                  if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 48, column: 11
                    System.out.println("");//sysj\ECS_controller.sysj line: 49, column: 4
                    System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 50, column: 4
                    __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 48, column: 114
                    if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 48, column: 114
                      ends[1]=2;
                      ;//sysj\ECS_controller.sysj line: 48, column: 114
                      safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 52, column: 4
                      currsigs.addElement(safeOpHumid);
                      S8=3;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    else {
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                  else {
                    S8=3;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                }
              }
              else {
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 1 : 
              if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 40, column: 111
                ends[1]=2;
                ;//sysj\ECS_controller.sysj line: 40, column: 111
                safeOpTemp.setPresent();//sysj\ECS_controller.sysj line: 44, column: 4
                currsigs.addElement(safeOpTemp);
                S8=2;
                if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 48, column: 11
                  System.out.println("");//sysj\ECS_controller.sysj line: 49, column: 4
                  System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 50, column: 4
                  __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 48, column: 114
                  if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 48, column: 114
                    ends[1]=2;
                    ;//sysj\ECS_controller.sysj line: 48, column: 114
                    safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 52, column: 4
                    currsigs.addElement(safeOpHumid);
                    S8=3;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                }
                else {
                  S8=3;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
              else {
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 2 : 
              if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 48, column: 114
                ends[1]=2;
                ;//sysj\ECS_controller.sysj line: 48, column: 114
                safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 52, column: 4
                currsigs.addElement(safeOpHumid);
                S8=3;
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
              S8=3;
              if(cutPow.getprestatus()){//sysj\ECS_controller.sysj line: 18, column: 11
                System.out.println("");//sysj\ECS_controller.sysj line: 19, column: 4
                System.out.println("Fire detected all power has been cut, please wait...");//sysj\ECS_controller.sysj line: 20, column: 4
                powerOff.setPresent();//sysj\ECS_controller.sysj line: 21, column: 4
                currsigs.addElement(powerOff);
                if(fireZone1.getprestatus()){//sysj\ECS_controller.sysj line: 25, column: 12
                  System.out.println("");//sysj\ECS_controller.sysj line: 26, column: 4
                  System.out.println("Smoke alarm activated please wait for fire to be extinguished...");//sysj\ECS_controller.sysj line: 27, column: 4
                  alarmOff.setPresent();//sysj\ECS_controller.sysj line: 28, column: 4
                  currsigs.addElement(alarmOff);
                  S8=0;
                  if(cleanZone1.getprestatus() || cleanZone2.getprestatus() || cleanZone3.getprestatus() || cleanZone4.getprestatus() || cleanZone5.getprestatus() || cleanZone6.getprestatus() || cleanZone7.getprestatus()){//sysj\ECS_controller.sysj line: 32, column: 11
                    System.out.println("");//sysj\ECS_controller.sysj line: 33, column: 4
                    System.out.println("High levels of dust detected please wait for room to be cleaned...");//sysj\ECS_controller.sysj line: 34, column: 4
                    __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 32, column: 106
                    if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 32, column: 106
                      ends[1]=2;
                      ;//sysj\ECS_controller.sysj line: 32, column: 106
                      roomCleaned.setPresent();//sysj\ECS_controller.sysj line: 36, column: 4
                      currsigs.addElement(roomCleaned);
                      S8=1;
                      if(fanOnZone1_7.getprestatus() || heatOnZone1_7.getprestatus() || airOnZone2_3.getprestatus() || airOnZone4_5_6.getprestatus() || heatOnZone2_3.getprestatus() || heatOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 40, column: 11
                        System.out.println("");//sysj\ECS_controller.sysj line: 41, column: 4
                        System.out.println("Room temperature is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 42, column: 4
                        __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 40, column: 111
                        if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 40, column: 111
                          ends[1]=2;
                          ;//sysj\ECS_controller.sysj line: 40, column: 111
                          safeOpTemp.setPresent();//sysj\ECS_controller.sysj line: 44, column: 4
                          currsigs.addElement(safeOpTemp);
                          S8=2;
                          if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 48, column: 11
                            System.out.println("");//sysj\ECS_controller.sysj line: 49, column: 4
                            System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 50, column: 4
                            __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 48, column: 114
                            if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 48, column: 114
                              ends[1]=2;
                              ;//sysj\ECS_controller.sysj line: 48, column: 114
                              safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 52, column: 4
                              currsigs.addElement(safeOpHumid);
                              S8=3;
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            else {
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          }
                          else {
                            S8=3;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                      else {
                        S8=2;
                        if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 48, column: 11
                          System.out.println("");//sysj\ECS_controller.sysj line: 49, column: 4
                          System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 50, column: 4
                          __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 48, column: 114
                          if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 48, column: 114
                            ends[1]=2;
                            ;//sysj\ECS_controller.sysj line: 48, column: 114
                            safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 52, column: 4
                            currsigs.addElement(safeOpHumid);
                            S8=3;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                        }
                        else {
                          S8=3;
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                    }
                    else {
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                  else {
                    S8=1;
                    if(fanOnZone1_7.getprestatus() || heatOnZone1_7.getprestatus() || airOnZone2_3.getprestatus() || airOnZone4_5_6.getprestatus() || heatOnZone2_3.getprestatus() || heatOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 40, column: 11
                      System.out.println("");//sysj\ECS_controller.sysj line: 41, column: 4
                      System.out.println("Room temperature is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 42, column: 4
                      __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 40, column: 111
                      if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 40, column: 111
                        ends[1]=2;
                        ;//sysj\ECS_controller.sysj line: 40, column: 111
                        safeOpTemp.setPresent();//sysj\ECS_controller.sysj line: 44, column: 4
                        currsigs.addElement(safeOpTemp);
                        S8=2;
                        if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 48, column: 11
                          System.out.println("");//sysj\ECS_controller.sysj line: 49, column: 4
                          System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 50, column: 4
                          __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 48, column: 114
                          if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 48, column: 114
                            ends[1]=2;
                            ;//sysj\ECS_controller.sysj line: 48, column: 114
                            safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 52, column: 4
                            currsigs.addElement(safeOpHumid);
                            S8=3;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                        }
                        else {
                          S8=3;
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                      else {
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    }
                    else {
                      S8=2;
                      if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 48, column: 11
                        System.out.println("");//sysj\ECS_controller.sysj line: 49, column: 4
                        System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 50, column: 4
                        __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 48, column: 114
                        if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 48, column: 114
                          ends[1]=2;
                          ;//sysj\ECS_controller.sysj line: 48, column: 114
                          safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 52, column: 4
                          currsigs.addElement(safeOpHumid);
                          S8=3;
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                        else {
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                      else {
                        S8=3;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    }
                  }
                }
                else {
                  S8=0;
                  if(cleanZone1.getprestatus() || cleanZone2.getprestatus() || cleanZone3.getprestatus() || cleanZone4.getprestatus() || cleanZone5.getprestatus() || cleanZone6.getprestatus() || cleanZone7.getprestatus()){//sysj\ECS_controller.sysj line: 32, column: 11
                    System.out.println("");//sysj\ECS_controller.sysj line: 33, column: 4
                    System.out.println("High levels of dust detected please wait for room to be cleaned...");//sysj\ECS_controller.sysj line: 34, column: 4
                    __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 32, column: 106
                    if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 32, column: 106
                      ends[1]=2;
                      ;//sysj\ECS_controller.sysj line: 32, column: 106
                      roomCleaned.setPresent();//sysj\ECS_controller.sysj line: 36, column: 4
                      currsigs.addElement(roomCleaned);
                      S8=1;
                      if(fanOnZone1_7.getprestatus() || heatOnZone1_7.getprestatus() || airOnZone2_3.getprestatus() || airOnZone4_5_6.getprestatus() || heatOnZone2_3.getprestatus() || heatOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 40, column: 11
                        System.out.println("");//sysj\ECS_controller.sysj line: 41, column: 4
                        System.out.println("Room temperature is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 42, column: 4
                        __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 40, column: 111
                        if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 40, column: 111
                          ends[1]=2;
                          ;//sysj\ECS_controller.sysj line: 40, column: 111
                          safeOpTemp.setPresent();//sysj\ECS_controller.sysj line: 44, column: 4
                          currsigs.addElement(safeOpTemp);
                          S8=2;
                          if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 48, column: 11
                            System.out.println("");//sysj\ECS_controller.sysj line: 49, column: 4
                            System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 50, column: 4
                            __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 48, column: 114
                            if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 48, column: 114
                              ends[1]=2;
                              ;//sysj\ECS_controller.sysj line: 48, column: 114
                              safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 52, column: 4
                              currsigs.addElement(safeOpHumid);
                              S8=3;
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            else {
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          }
                          else {
                            S8=3;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                      else {
                        S8=2;
                        if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 48, column: 11
                          System.out.println("");//sysj\ECS_controller.sysj line: 49, column: 4
                          System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 50, column: 4
                          __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 48, column: 114
                          if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 48, column: 114
                            ends[1]=2;
                            ;//sysj\ECS_controller.sysj line: 48, column: 114
                            safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 52, column: 4
                            currsigs.addElement(safeOpHumid);
                            S8=3;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                        }
                        else {
                          S8=3;
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                    }
                    else {
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                  else {
                    S8=1;
                    if(fanOnZone1_7.getprestatus() || heatOnZone1_7.getprestatus() || airOnZone2_3.getprestatus() || airOnZone4_5_6.getprestatus() || heatOnZone2_3.getprestatus() || heatOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 40, column: 11
                      System.out.println("");//sysj\ECS_controller.sysj line: 41, column: 4
                      System.out.println("Room temperature is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 42, column: 4
                      __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 40, column: 111
                      if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 40, column: 111
                        ends[1]=2;
                        ;//sysj\ECS_controller.sysj line: 40, column: 111
                        safeOpTemp.setPresent();//sysj\ECS_controller.sysj line: 44, column: 4
                        currsigs.addElement(safeOpTemp);
                        S8=2;
                        if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 48, column: 11
                          System.out.println("");//sysj\ECS_controller.sysj line: 49, column: 4
                          System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 50, column: 4
                          __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 48, column: 114
                          if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 48, column: 114
                            ends[1]=2;
                            ;//sysj\ECS_controller.sysj line: 48, column: 114
                            safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 52, column: 4
                            currsigs.addElement(safeOpHumid);
                            S8=3;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                        }
                        else {
                          S8=3;
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                      else {
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    }
                    else {
                      S8=2;
                      if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 48, column: 11
                        System.out.println("");//sysj\ECS_controller.sysj line: 49, column: 4
                        System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 50, column: 4
                        __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 48, column: 114
                        if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 48, column: 114
                          ends[1]=2;
                          ;//sysj\ECS_controller.sysj line: 48, column: 114
                          safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 52, column: 4
                          currsigs.addElement(safeOpHumid);
                          S8=3;
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                        else {
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                      else {
                        S8=3;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    }
                  }
                }
              }
              else {
                if(fireZone1.getprestatus()){//sysj\ECS_controller.sysj line: 25, column: 12
                  System.out.println("");//sysj\ECS_controller.sysj line: 26, column: 4
                  System.out.println("Smoke alarm activated please wait for fire to be extinguished...");//sysj\ECS_controller.sysj line: 27, column: 4
                  alarmOff.setPresent();//sysj\ECS_controller.sysj line: 28, column: 4
                  currsigs.addElement(alarmOff);
                  S8=0;
                  if(cleanZone1.getprestatus() || cleanZone2.getprestatus() || cleanZone3.getprestatus() || cleanZone4.getprestatus() || cleanZone5.getprestatus() || cleanZone6.getprestatus() || cleanZone7.getprestatus()){//sysj\ECS_controller.sysj line: 32, column: 11
                    System.out.println("");//sysj\ECS_controller.sysj line: 33, column: 4
                    System.out.println("High levels of dust detected please wait for room to be cleaned...");//sysj\ECS_controller.sysj line: 34, column: 4
                    __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 32, column: 106
                    if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 32, column: 106
                      ends[1]=2;
                      ;//sysj\ECS_controller.sysj line: 32, column: 106
                      roomCleaned.setPresent();//sysj\ECS_controller.sysj line: 36, column: 4
                      currsigs.addElement(roomCleaned);
                      S8=1;
                      if(fanOnZone1_7.getprestatus() || heatOnZone1_7.getprestatus() || airOnZone2_3.getprestatus() || airOnZone4_5_6.getprestatus() || heatOnZone2_3.getprestatus() || heatOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 40, column: 11
                        System.out.println("");//sysj\ECS_controller.sysj line: 41, column: 4
                        System.out.println("Room temperature is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 42, column: 4
                        __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 40, column: 111
                        if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 40, column: 111
                          ends[1]=2;
                          ;//sysj\ECS_controller.sysj line: 40, column: 111
                          safeOpTemp.setPresent();//sysj\ECS_controller.sysj line: 44, column: 4
                          currsigs.addElement(safeOpTemp);
                          S8=2;
                          if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 48, column: 11
                            System.out.println("");//sysj\ECS_controller.sysj line: 49, column: 4
                            System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 50, column: 4
                            __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 48, column: 114
                            if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 48, column: 114
                              ends[1]=2;
                              ;//sysj\ECS_controller.sysj line: 48, column: 114
                              safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 52, column: 4
                              currsigs.addElement(safeOpHumid);
                              S8=3;
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            else {
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          }
                          else {
                            S8=3;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                      else {
                        S8=2;
                        if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 48, column: 11
                          System.out.println("");//sysj\ECS_controller.sysj line: 49, column: 4
                          System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 50, column: 4
                          __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 48, column: 114
                          if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 48, column: 114
                            ends[1]=2;
                            ;//sysj\ECS_controller.sysj line: 48, column: 114
                            safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 52, column: 4
                            currsigs.addElement(safeOpHumid);
                            S8=3;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                        }
                        else {
                          S8=3;
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                    }
                    else {
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                  else {
                    S8=1;
                    if(fanOnZone1_7.getprestatus() || heatOnZone1_7.getprestatus() || airOnZone2_3.getprestatus() || airOnZone4_5_6.getprestatus() || heatOnZone2_3.getprestatus() || heatOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 40, column: 11
                      System.out.println("");//sysj\ECS_controller.sysj line: 41, column: 4
                      System.out.println("Room temperature is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 42, column: 4
                      __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 40, column: 111
                      if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 40, column: 111
                        ends[1]=2;
                        ;//sysj\ECS_controller.sysj line: 40, column: 111
                        safeOpTemp.setPresent();//sysj\ECS_controller.sysj line: 44, column: 4
                        currsigs.addElement(safeOpTemp);
                        S8=2;
                        if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 48, column: 11
                          System.out.println("");//sysj\ECS_controller.sysj line: 49, column: 4
                          System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 50, column: 4
                          __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 48, column: 114
                          if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 48, column: 114
                            ends[1]=2;
                            ;//sysj\ECS_controller.sysj line: 48, column: 114
                            safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 52, column: 4
                            currsigs.addElement(safeOpHumid);
                            S8=3;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                        }
                        else {
                          S8=3;
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                      else {
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    }
                    else {
                      S8=2;
                      if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 48, column: 11
                        System.out.println("");//sysj\ECS_controller.sysj line: 49, column: 4
                        System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 50, column: 4
                        __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 48, column: 114
                        if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 48, column: 114
                          ends[1]=2;
                          ;//sysj\ECS_controller.sysj line: 48, column: 114
                          safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 52, column: 4
                          currsigs.addElement(safeOpHumid);
                          S8=3;
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                        else {
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                      else {
                        S8=3;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    }
                  }
                }
                else {
                  S8=0;
                  if(cleanZone1.getprestatus() || cleanZone2.getprestatus() || cleanZone3.getprestatus() || cleanZone4.getprestatus() || cleanZone5.getprestatus() || cleanZone6.getprestatus() || cleanZone7.getprestatus()){//sysj\ECS_controller.sysj line: 32, column: 11
                    System.out.println("");//sysj\ECS_controller.sysj line: 33, column: 4
                    System.out.println("High levels of dust detected please wait for room to be cleaned...");//sysj\ECS_controller.sysj line: 34, column: 4
                    __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 32, column: 106
                    if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 32, column: 106
                      ends[1]=2;
                      ;//sysj\ECS_controller.sysj line: 32, column: 106
                      roomCleaned.setPresent();//sysj\ECS_controller.sysj line: 36, column: 4
                      currsigs.addElement(roomCleaned);
                      S8=1;
                      if(fanOnZone1_7.getprestatus() || heatOnZone1_7.getprestatus() || airOnZone2_3.getprestatus() || airOnZone4_5_6.getprestatus() || heatOnZone2_3.getprestatus() || heatOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 40, column: 11
                        System.out.println("");//sysj\ECS_controller.sysj line: 41, column: 4
                        System.out.println("Room temperature is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 42, column: 4
                        __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 40, column: 111
                        if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 40, column: 111
                          ends[1]=2;
                          ;//sysj\ECS_controller.sysj line: 40, column: 111
                          safeOpTemp.setPresent();//sysj\ECS_controller.sysj line: 44, column: 4
                          currsigs.addElement(safeOpTemp);
                          S8=2;
                          if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 48, column: 11
                            System.out.println("");//sysj\ECS_controller.sysj line: 49, column: 4
                            System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 50, column: 4
                            __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 48, column: 114
                            if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 48, column: 114
                              ends[1]=2;
                              ;//sysj\ECS_controller.sysj line: 48, column: 114
                              safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 52, column: 4
                              currsigs.addElement(safeOpHumid);
                              S8=3;
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            else {
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          }
                          else {
                            S8=3;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                      else {
                        S8=2;
                        if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 48, column: 11
                          System.out.println("");//sysj\ECS_controller.sysj line: 49, column: 4
                          System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 50, column: 4
                          __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 48, column: 114
                          if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 48, column: 114
                            ends[1]=2;
                            ;//sysj\ECS_controller.sysj line: 48, column: 114
                            safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 52, column: 4
                            currsigs.addElement(safeOpHumid);
                            S8=3;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                        }
                        else {
                          S8=3;
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                    }
                    else {
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                  else {
                    S8=1;
                    if(fanOnZone1_7.getprestatus() || heatOnZone1_7.getprestatus() || airOnZone2_3.getprestatus() || airOnZone4_5_6.getprestatus() || heatOnZone2_3.getprestatus() || heatOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 40, column: 11
                      System.out.println("");//sysj\ECS_controller.sysj line: 41, column: 4
                      System.out.println("Room temperature is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 42, column: 4
                      __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 40, column: 111
                      if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 40, column: 111
                        ends[1]=2;
                        ;//sysj\ECS_controller.sysj line: 40, column: 111
                        safeOpTemp.setPresent();//sysj\ECS_controller.sysj line: 44, column: 4
                        currsigs.addElement(safeOpTemp);
                        S8=2;
                        if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 48, column: 11
                          System.out.println("");//sysj\ECS_controller.sysj line: 49, column: 4
                          System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 50, column: 4
                          __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 48, column: 114
                          if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 48, column: 114
                            ends[1]=2;
                            ;//sysj\ECS_controller.sysj line: 48, column: 114
                            safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 52, column: 4
                            currsigs.addElement(safeOpHumid);
                            S8=3;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                        }
                        else {
                          S8=3;
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                      else {
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    }
                    else {
                      S8=2;
                      if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 48, column: 11
                        System.out.println("");//sysj\ECS_controller.sysj line: 49, column: 4
                        System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 50, column: 4
                        __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 48, column: 114
                        if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 48, column: 114
                          ends[1]=2;
                          ;//sysj\ECS_controller.sysj line: 48, column: 114
                          safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 52, column: 4
                          currsigs.addElement(safeOpHumid);
                          S8=3;
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                        else {
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                      else {
                        S8=3;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    }
                  }
                }
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1};
    char [] paused1 = {0, 0};
    char [] suspended1 = {0, 0};
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
          fireZone1.gethook();
          fireZone2.gethook();
          fireZone3.gethook();
          fireZone4.gethook();
          fireZone5.gethook();
          fireZone6.gethook();
          fireZone7.gethook();
          cleanZone1.gethook();
          cleanZone2.gethook();
          cleanZone3.gethook();
          cleanZone4.gethook();
          cleanZone5.gethook();
          cleanZone6.gethook();
          cleanZone7.gethook();
          fanOnZone1_7.gethook();
          heatOnZone1_7.gethook();
          airOnZone2_3.gethook();
          airOnZone4_5_6.gethook();
          heatOnZone2_3.gethook();
          heatOnZone4_5_6.gethook();
          humOnZone1_7.gethook();
          humOnZone2_3.gethook();
          humOnZone4_5_6.gethook();
          deHumOnZone1_7.gethook();
          deHumOnZone2_3.gethook();
          deHumOnZone4_5_6.gethook();
          cutPow.gethook();
          pow.gethook();
          df = true;
        }
        runClockDomain();
      }
      fireZone1.setpreclear();
      fireZone2.setpreclear();
      fireZone3.setpreclear();
      fireZone4.setpreclear();
      fireZone5.setpreclear();
      fireZone6.setpreclear();
      fireZone7.setpreclear();
      cleanZone1.setpreclear();
      cleanZone2.setpreclear();
      cleanZone3.setpreclear();
      cleanZone4.setpreclear();
      cleanZone5.setpreclear();
      cleanZone6.setpreclear();
      cleanZone7.setpreclear();
      fanOnZone1_7.setpreclear();
      heatOnZone1_7.setpreclear();
      airOnZone2_3.setpreclear();
      airOnZone4_5_6.setpreclear();
      heatOnZone2_3.setpreclear();
      heatOnZone4_5_6.setpreclear();
      humOnZone1_7.setpreclear();
      humOnZone2_3.setpreclear();
      humOnZone4_5_6.setpreclear();
      deHumOnZone1_7.setpreclear();
      deHumOnZone2_3.setpreclear();
      deHumOnZone4_5_6.setpreclear();
      cutPow.setpreclear();
      pow.setpreclear();
      safeOpTemp.setpreclear();
      safeOpHumid.setpreclear();
      powerOff.setpreclear();
      roomCleaned.setpreclear();
      fireOut.setpreclear();
      alarmOff.setpreclear();
      blindsDown.setpreclear();
      evacuated.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = fireZone1.getStatus() ? fireZone1.setprepresent() : fireZone1.setpreclear();
      fireZone1.setpreval(fireZone1.getValue());
      fireZone1.setClear();
      dummyint = fireZone2.getStatus() ? fireZone2.setprepresent() : fireZone2.setpreclear();
      fireZone2.setpreval(fireZone2.getValue());
      fireZone2.setClear();
      dummyint = fireZone3.getStatus() ? fireZone3.setprepresent() : fireZone3.setpreclear();
      fireZone3.setpreval(fireZone3.getValue());
      fireZone3.setClear();
      dummyint = fireZone4.getStatus() ? fireZone4.setprepresent() : fireZone4.setpreclear();
      fireZone4.setpreval(fireZone4.getValue());
      fireZone4.setClear();
      dummyint = fireZone5.getStatus() ? fireZone5.setprepresent() : fireZone5.setpreclear();
      fireZone5.setpreval(fireZone5.getValue());
      fireZone5.setClear();
      dummyint = fireZone6.getStatus() ? fireZone6.setprepresent() : fireZone6.setpreclear();
      fireZone6.setpreval(fireZone6.getValue());
      fireZone6.setClear();
      dummyint = fireZone7.getStatus() ? fireZone7.setprepresent() : fireZone7.setpreclear();
      fireZone7.setpreval(fireZone7.getValue());
      fireZone7.setClear();
      dummyint = cleanZone1.getStatus() ? cleanZone1.setprepresent() : cleanZone1.setpreclear();
      cleanZone1.setpreval(cleanZone1.getValue());
      cleanZone1.setClear();
      dummyint = cleanZone2.getStatus() ? cleanZone2.setprepresent() : cleanZone2.setpreclear();
      cleanZone2.setpreval(cleanZone2.getValue());
      cleanZone2.setClear();
      dummyint = cleanZone3.getStatus() ? cleanZone3.setprepresent() : cleanZone3.setpreclear();
      cleanZone3.setpreval(cleanZone3.getValue());
      cleanZone3.setClear();
      dummyint = cleanZone4.getStatus() ? cleanZone4.setprepresent() : cleanZone4.setpreclear();
      cleanZone4.setpreval(cleanZone4.getValue());
      cleanZone4.setClear();
      dummyint = cleanZone5.getStatus() ? cleanZone5.setprepresent() : cleanZone5.setpreclear();
      cleanZone5.setpreval(cleanZone5.getValue());
      cleanZone5.setClear();
      dummyint = cleanZone6.getStatus() ? cleanZone6.setprepresent() : cleanZone6.setpreclear();
      cleanZone6.setpreval(cleanZone6.getValue());
      cleanZone6.setClear();
      dummyint = cleanZone7.getStatus() ? cleanZone7.setprepresent() : cleanZone7.setpreclear();
      cleanZone7.setpreval(cleanZone7.getValue());
      cleanZone7.setClear();
      dummyint = fanOnZone1_7.getStatus() ? fanOnZone1_7.setprepresent() : fanOnZone1_7.setpreclear();
      fanOnZone1_7.setpreval(fanOnZone1_7.getValue());
      fanOnZone1_7.setClear();
      dummyint = heatOnZone1_7.getStatus() ? heatOnZone1_7.setprepresent() : heatOnZone1_7.setpreclear();
      heatOnZone1_7.setpreval(heatOnZone1_7.getValue());
      heatOnZone1_7.setClear();
      dummyint = airOnZone2_3.getStatus() ? airOnZone2_3.setprepresent() : airOnZone2_3.setpreclear();
      airOnZone2_3.setpreval(airOnZone2_3.getValue());
      airOnZone2_3.setClear();
      dummyint = airOnZone4_5_6.getStatus() ? airOnZone4_5_6.setprepresent() : airOnZone4_5_6.setpreclear();
      airOnZone4_5_6.setpreval(airOnZone4_5_6.getValue());
      airOnZone4_5_6.setClear();
      dummyint = heatOnZone2_3.getStatus() ? heatOnZone2_3.setprepresent() : heatOnZone2_3.setpreclear();
      heatOnZone2_3.setpreval(heatOnZone2_3.getValue());
      heatOnZone2_3.setClear();
      dummyint = heatOnZone4_5_6.getStatus() ? heatOnZone4_5_6.setprepresent() : heatOnZone4_5_6.setpreclear();
      heatOnZone4_5_6.setpreval(heatOnZone4_5_6.getValue());
      heatOnZone4_5_6.setClear();
      dummyint = humOnZone1_7.getStatus() ? humOnZone1_7.setprepresent() : humOnZone1_7.setpreclear();
      humOnZone1_7.setpreval(humOnZone1_7.getValue());
      humOnZone1_7.setClear();
      dummyint = humOnZone2_3.getStatus() ? humOnZone2_3.setprepresent() : humOnZone2_3.setpreclear();
      humOnZone2_3.setpreval(humOnZone2_3.getValue());
      humOnZone2_3.setClear();
      dummyint = humOnZone4_5_6.getStatus() ? humOnZone4_5_6.setprepresent() : humOnZone4_5_6.setpreclear();
      humOnZone4_5_6.setpreval(humOnZone4_5_6.getValue());
      humOnZone4_5_6.setClear();
      dummyint = deHumOnZone1_7.getStatus() ? deHumOnZone1_7.setprepresent() : deHumOnZone1_7.setpreclear();
      deHumOnZone1_7.setpreval(deHumOnZone1_7.getValue());
      deHumOnZone1_7.setClear();
      dummyint = deHumOnZone2_3.getStatus() ? deHumOnZone2_3.setprepresent() : deHumOnZone2_3.setpreclear();
      deHumOnZone2_3.setpreval(deHumOnZone2_3.getValue());
      deHumOnZone2_3.setClear();
      dummyint = deHumOnZone4_5_6.getStatus() ? deHumOnZone4_5_6.setprepresent() : deHumOnZone4_5_6.setpreclear();
      deHumOnZone4_5_6.setpreval(deHumOnZone4_5_6.getValue());
      deHumOnZone4_5_6.setClear();
      dummyint = cutPow.getStatus() ? cutPow.setprepresent() : cutPow.setpreclear();
      cutPow.setpreval(cutPow.getValue());
      cutPow.setClear();
      dummyint = pow.getStatus() ? pow.setprepresent() : pow.setpreclear();
      pow.setpreval(pow.getValue());
      pow.setClear();
      safeOpTemp.sethook();
      safeOpTemp.setClear();
      safeOpHumid.sethook();
      safeOpHumid.setClear();
      powerOff.sethook();
      powerOff.setClear();
      roomCleaned.sethook();
      roomCleaned.setClear();
      fireOut.sethook();
      fireOut.setClear();
      alarmOff.sethook();
      alarmOff.setClear();
      blindsDown.sethook();
      blindsDown.setClear();
      evacuated.sethook();
      evacuated.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        fireZone1.gethook();
        fireZone2.gethook();
        fireZone3.gethook();
        fireZone4.gethook();
        fireZone5.gethook();
        fireZone6.gethook();
        fireZone7.gethook();
        cleanZone1.gethook();
        cleanZone2.gethook();
        cleanZone3.gethook();
        cleanZone4.gethook();
        cleanZone5.gethook();
        cleanZone6.gethook();
        cleanZone7.gethook();
        fanOnZone1_7.gethook();
        heatOnZone1_7.gethook();
        airOnZone2_3.gethook();
        airOnZone4_5_6.gethook();
        heatOnZone2_3.gethook();
        heatOnZone4_5_6.gethook();
        humOnZone1_7.gethook();
        humOnZone2_3.gethook();
        humOnZone4_5_6.gethook();
        deHumOnZone1_7.gethook();
        deHumOnZone2_3.gethook();
        deHumOnZone4_5_6.gethook();
        cutPow.gethook();
        pow.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
