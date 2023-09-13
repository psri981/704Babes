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
  public Signal cutPowZ1 = new Signal("cutPowZ1", Signal.INPUT);
  public Signal cutPowZ2 = new Signal("cutPowZ2", Signal.INPUT);
  public Signal cutPowZ3 = new Signal("cutPowZ3", Signal.INPUT);
  public Signal cutPowZ4 = new Signal("cutPowZ4", Signal.INPUT);
  public Signal cutPowZ5 = new Signal("cutPowZ5", Signal.INPUT);
  public Signal cutPowZ6 = new Signal("cutPowZ6", Signal.INPUT);
  public Signal cutPowZ7 = new Signal("cutPowZ7", Signal.INPUT);
  public Signal powZ1 = new Signal("powZ1", Signal.INPUT);
  public Signal powZ2 = new Signal("powZ2", Signal.INPUT);
  public Signal powZ3 = new Signal("powZ3", Signal.INPUT);
  public Signal powZ4 = new Signal("powZ4", Signal.INPUT);
  public Signal powZ5 = new Signal("powZ5", Signal.INPUT);
  public Signal powZ6 = new Signal("powZ6", Signal.INPUT);
  public Signal powZ7 = new Signal("powZ7", Signal.INPUT);
  public Signal safeOpTemp = new Signal("safeOpTemp", Signal.OUTPUT);
  public Signal safeOpHumid = new Signal("safeOpHumid", Signal.OUTPUT);
  public Signal powerOff = new Signal("powerOff", Signal.OUTPUT);
  public Signal roomCleaned = new Signal("roomCleaned", Signal.OUTPUT);
  public Signal fireOut = new Signal("fireOut", Signal.OUTPUT);
  public Signal alarmOff = new Signal("alarmOff", Signal.OUTPUT);
  public Signal blindsDown = new Signal("blindsDown", Signal.OUTPUT);
  public Signal evacuated = new Signal("evacuated", Signal.OUTPUT);
  private long __start_thread_1;//sysj\ECS_controller.sysj line: 23, column: 99
  private int S5047 = 1;
  private int S91 = 1;
  
  private int[] ends = new int[2];
  private int[] tdone = new int[2];
  
  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S5047){
        case 0 : 
          S5047=0;
          break RUN;
        
        case 1 : 
          S5047=2;
          S5047=2;
          S91=0;
          if(cutPowZ1.getprestatus() || cutPowZ2.getprestatus() || cutPowZ3.getprestatus() || cutPowZ4.getprestatus() || cutPowZ5.getprestatus() || cutPowZ6.getprestatus() || cutPowZ7.getprestatus()){//sysj\ECS_controller.sysj line: 18, column: 11
            powerOff.setPresent();//sysj\ECS_controller.sysj line: 19, column: 4
            currsigs.addElement(powerOff);
            S91=1;
            if(fireZone1.getprestatus() || fireZone2.getprestatus() || fireZone3.getprestatus() || fireZone4.getprestatus() || fireZone5.getprestatus() || fireZone6.getprestatus() || fireZone7.getprestatus()){//sysj\ECS_controller.sysj line: 23, column: 11
              System.out.println("");//sysj\ECS_controller.sysj line: 24, column: 4
              System.out.println("Smoke alarm activated please wait for fire to be extinguished...");//sysj\ECS_controller.sysj line: 25, column: 4
              __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 23, column: 99
              if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 23, column: 99
                ends[1]=2;
                ;//sysj\ECS_controller.sysj line: 23, column: 99
                alarmOff.setPresent();//sysj\ECS_controller.sysj line: 27, column: 4
                currsigs.addElement(alarmOff);
                S91=2;
                if(cleanZone1.getprestatus() || cleanZone2.getprestatus() || cleanZone3.getprestatus() || cleanZone4.getprestatus() || cleanZone5.getprestatus() || cleanZone6.getprestatus() || cleanZone7.getprestatus()){//sysj\ECS_controller.sysj line: 31, column: 11
                  System.out.println("");//sysj\ECS_controller.sysj line: 32, column: 4
                  System.out.println("High levels of dust detected please wait for room to be cleaned...");//sysj\ECS_controller.sysj line: 33, column: 4
                  __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 31, column: 106
                  if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 31, column: 106
                    ends[1]=2;
                    ;//sysj\ECS_controller.sysj line: 31, column: 106
                    roomCleaned.setPresent();//sysj\ECS_controller.sysj line: 35, column: 4
                    currsigs.addElement(roomCleaned);
                    S91=3;
                    if(fanOnZone1_7.getprestatus() || heatOnZone1_7.getprestatus() || airOnZone2_3.getprestatus() || airOnZone4_5_6.getprestatus() || heatOnZone2_3.getprestatus() || heatOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 39, column: 11
                      System.out.println("");//sysj\ECS_controller.sysj line: 40, column: 4
                      System.out.println("Room temperature is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 41, column: 4
                      __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 39, column: 111
                      if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 39, column: 111
                        ends[1]=2;
                        ;//sysj\ECS_controller.sysj line: 39, column: 111
                        safeOpTemp.setPresent();//sysj\ECS_controller.sysj line: 43, column: 4
                        currsigs.addElement(safeOpTemp);
                        S91=4;
                        if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 47, column: 11
                          System.out.println("");//sysj\ECS_controller.sysj line: 48, column: 4
                          System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 49, column: 4
                          __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 47, column: 114
                          if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 47, column: 114
                            ends[1]=2;
                            ;//sysj\ECS_controller.sysj line: 47, column: 114
                            safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 51, column: 4
                            currsigs.addElement(safeOpHumid);
                            S91=5;
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
                          S91=5;
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
                      S91=4;
                      if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 47, column: 11
                        System.out.println("");//sysj\ECS_controller.sysj line: 48, column: 4
                        System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 49, column: 4
                        __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 47, column: 114
                        if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 47, column: 114
                          ends[1]=2;
                          ;//sysj\ECS_controller.sysj line: 47, column: 114
                          safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 51, column: 4
                          currsigs.addElement(safeOpHumid);
                          S91=5;
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
                        S91=5;
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
                  S91=3;
                  if(fanOnZone1_7.getprestatus() || heatOnZone1_7.getprestatus() || airOnZone2_3.getprestatus() || airOnZone4_5_6.getprestatus() || heatOnZone2_3.getprestatus() || heatOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 39, column: 11
                    System.out.println("");//sysj\ECS_controller.sysj line: 40, column: 4
                    System.out.println("Room temperature is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 41, column: 4
                    __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 39, column: 111
                    if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 39, column: 111
                      ends[1]=2;
                      ;//sysj\ECS_controller.sysj line: 39, column: 111
                      safeOpTemp.setPresent();//sysj\ECS_controller.sysj line: 43, column: 4
                      currsigs.addElement(safeOpTemp);
                      S91=4;
                      if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 47, column: 11
                        System.out.println("");//sysj\ECS_controller.sysj line: 48, column: 4
                        System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 49, column: 4
                        __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 47, column: 114
                        if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 47, column: 114
                          ends[1]=2;
                          ;//sysj\ECS_controller.sysj line: 47, column: 114
                          safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 51, column: 4
                          currsigs.addElement(safeOpHumid);
                          S91=5;
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
                        S91=5;
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
                    S91=4;
                    if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 47, column: 11
                      System.out.println("");//sysj\ECS_controller.sysj line: 48, column: 4
                      System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 49, column: 4
                      __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 47, column: 114
                      if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 47, column: 114
                        ends[1]=2;
                        ;//sysj\ECS_controller.sysj line: 47, column: 114
                        safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 51, column: 4
                        currsigs.addElement(safeOpHumid);
                        S91=5;
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
                      S91=5;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
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
              S91=2;
              if(cleanZone1.getprestatus() || cleanZone2.getprestatus() || cleanZone3.getprestatus() || cleanZone4.getprestatus() || cleanZone5.getprestatus() || cleanZone6.getprestatus() || cleanZone7.getprestatus()){//sysj\ECS_controller.sysj line: 31, column: 11
                System.out.println("");//sysj\ECS_controller.sysj line: 32, column: 4
                System.out.println("High levels of dust detected please wait for room to be cleaned...");//sysj\ECS_controller.sysj line: 33, column: 4
                __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 31, column: 106
                if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 31, column: 106
                  ends[1]=2;
                  ;//sysj\ECS_controller.sysj line: 31, column: 106
                  roomCleaned.setPresent();//sysj\ECS_controller.sysj line: 35, column: 4
                  currsigs.addElement(roomCleaned);
                  S91=3;
                  if(fanOnZone1_7.getprestatus() || heatOnZone1_7.getprestatus() || airOnZone2_3.getprestatus() || airOnZone4_5_6.getprestatus() || heatOnZone2_3.getprestatus() || heatOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 39, column: 11
                    System.out.println("");//sysj\ECS_controller.sysj line: 40, column: 4
                    System.out.println("Room temperature is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 41, column: 4
                    __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 39, column: 111
                    if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 39, column: 111
                      ends[1]=2;
                      ;//sysj\ECS_controller.sysj line: 39, column: 111
                      safeOpTemp.setPresent();//sysj\ECS_controller.sysj line: 43, column: 4
                      currsigs.addElement(safeOpTemp);
                      S91=4;
                      if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 47, column: 11
                        System.out.println("");//sysj\ECS_controller.sysj line: 48, column: 4
                        System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 49, column: 4
                        __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 47, column: 114
                        if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 47, column: 114
                          ends[1]=2;
                          ;//sysj\ECS_controller.sysj line: 47, column: 114
                          safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 51, column: 4
                          currsigs.addElement(safeOpHumid);
                          S91=5;
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
                        S91=5;
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
                    S91=4;
                    if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 47, column: 11
                      System.out.println("");//sysj\ECS_controller.sysj line: 48, column: 4
                      System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 49, column: 4
                      __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 47, column: 114
                      if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 47, column: 114
                        ends[1]=2;
                        ;//sysj\ECS_controller.sysj line: 47, column: 114
                        safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 51, column: 4
                        currsigs.addElement(safeOpHumid);
                        S91=5;
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
                      S91=5;
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
                S91=3;
                if(fanOnZone1_7.getprestatus() || heatOnZone1_7.getprestatus() || airOnZone2_3.getprestatus() || airOnZone4_5_6.getprestatus() || heatOnZone2_3.getprestatus() || heatOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 39, column: 11
                  System.out.println("");//sysj\ECS_controller.sysj line: 40, column: 4
                  System.out.println("Room temperature is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 41, column: 4
                  __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 39, column: 111
                  if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 39, column: 111
                    ends[1]=2;
                    ;//sysj\ECS_controller.sysj line: 39, column: 111
                    safeOpTemp.setPresent();//sysj\ECS_controller.sysj line: 43, column: 4
                    currsigs.addElement(safeOpTemp);
                    S91=4;
                    if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 47, column: 11
                      System.out.println("");//sysj\ECS_controller.sysj line: 48, column: 4
                      System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 49, column: 4
                      __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 47, column: 114
                      if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 47, column: 114
                        ends[1]=2;
                        ;//sysj\ECS_controller.sysj line: 47, column: 114
                        safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 51, column: 4
                        currsigs.addElement(safeOpHumid);
                        S91=5;
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
                      S91=5;
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
                  S91=4;
                  if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 47, column: 11
                    System.out.println("");//sysj\ECS_controller.sysj line: 48, column: 4
                    System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 49, column: 4
                    __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 47, column: 114
                    if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 47, column: 114
                      ends[1]=2;
                      ;//sysj\ECS_controller.sysj line: 47, column: 114
                      safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 51, column: 4
                      currsigs.addElement(safeOpHumid);
                      S91=5;
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
                    S91=5;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                }
              }
            }
          }
          else {
            S91=1;
            if(fireZone1.getprestatus() || fireZone2.getprestatus() || fireZone3.getprestatus() || fireZone4.getprestatus() || fireZone5.getprestatus() || fireZone6.getprestatus() || fireZone7.getprestatus()){//sysj\ECS_controller.sysj line: 23, column: 11
              System.out.println("");//sysj\ECS_controller.sysj line: 24, column: 4
              System.out.println("Smoke alarm activated please wait for fire to be extinguished...");//sysj\ECS_controller.sysj line: 25, column: 4
              __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 23, column: 99
              if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 23, column: 99
                ends[1]=2;
                ;//sysj\ECS_controller.sysj line: 23, column: 99
                alarmOff.setPresent();//sysj\ECS_controller.sysj line: 27, column: 4
                currsigs.addElement(alarmOff);
                S91=2;
                if(cleanZone1.getprestatus() || cleanZone2.getprestatus() || cleanZone3.getprestatus() || cleanZone4.getprestatus() || cleanZone5.getprestatus() || cleanZone6.getprestatus() || cleanZone7.getprestatus()){//sysj\ECS_controller.sysj line: 31, column: 11
                  System.out.println("");//sysj\ECS_controller.sysj line: 32, column: 4
                  System.out.println("High levels of dust detected please wait for room to be cleaned...");//sysj\ECS_controller.sysj line: 33, column: 4
                  __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 31, column: 106
                  if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 31, column: 106
                    ends[1]=2;
                    ;//sysj\ECS_controller.sysj line: 31, column: 106
                    roomCleaned.setPresent();//sysj\ECS_controller.sysj line: 35, column: 4
                    currsigs.addElement(roomCleaned);
                    S91=3;
                    if(fanOnZone1_7.getprestatus() || heatOnZone1_7.getprestatus() || airOnZone2_3.getprestatus() || airOnZone4_5_6.getprestatus() || heatOnZone2_3.getprestatus() || heatOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 39, column: 11
                      System.out.println("");//sysj\ECS_controller.sysj line: 40, column: 4
                      System.out.println("Room temperature is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 41, column: 4
                      __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 39, column: 111
                      if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 39, column: 111
                        ends[1]=2;
                        ;//sysj\ECS_controller.sysj line: 39, column: 111
                        safeOpTemp.setPresent();//sysj\ECS_controller.sysj line: 43, column: 4
                        currsigs.addElement(safeOpTemp);
                        S91=4;
                        if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 47, column: 11
                          System.out.println("");//sysj\ECS_controller.sysj line: 48, column: 4
                          System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 49, column: 4
                          __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 47, column: 114
                          if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 47, column: 114
                            ends[1]=2;
                            ;//sysj\ECS_controller.sysj line: 47, column: 114
                            safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 51, column: 4
                            currsigs.addElement(safeOpHumid);
                            S91=5;
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
                          S91=5;
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
                      S91=4;
                      if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 47, column: 11
                        System.out.println("");//sysj\ECS_controller.sysj line: 48, column: 4
                        System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 49, column: 4
                        __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 47, column: 114
                        if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 47, column: 114
                          ends[1]=2;
                          ;//sysj\ECS_controller.sysj line: 47, column: 114
                          safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 51, column: 4
                          currsigs.addElement(safeOpHumid);
                          S91=5;
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
                        S91=5;
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
                  S91=3;
                  if(fanOnZone1_7.getprestatus() || heatOnZone1_7.getprestatus() || airOnZone2_3.getprestatus() || airOnZone4_5_6.getprestatus() || heatOnZone2_3.getprestatus() || heatOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 39, column: 11
                    System.out.println("");//sysj\ECS_controller.sysj line: 40, column: 4
                    System.out.println("Room temperature is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 41, column: 4
                    __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 39, column: 111
                    if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 39, column: 111
                      ends[1]=2;
                      ;//sysj\ECS_controller.sysj line: 39, column: 111
                      safeOpTemp.setPresent();//sysj\ECS_controller.sysj line: 43, column: 4
                      currsigs.addElement(safeOpTemp);
                      S91=4;
                      if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 47, column: 11
                        System.out.println("");//sysj\ECS_controller.sysj line: 48, column: 4
                        System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 49, column: 4
                        __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 47, column: 114
                        if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 47, column: 114
                          ends[1]=2;
                          ;//sysj\ECS_controller.sysj line: 47, column: 114
                          safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 51, column: 4
                          currsigs.addElement(safeOpHumid);
                          S91=5;
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
                        S91=5;
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
                    S91=4;
                    if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 47, column: 11
                      System.out.println("");//sysj\ECS_controller.sysj line: 48, column: 4
                      System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 49, column: 4
                      __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 47, column: 114
                      if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 47, column: 114
                        ends[1]=2;
                        ;//sysj\ECS_controller.sysj line: 47, column: 114
                        safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 51, column: 4
                        currsigs.addElement(safeOpHumid);
                        S91=5;
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
                      S91=5;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
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
              S91=2;
              if(cleanZone1.getprestatus() || cleanZone2.getprestatus() || cleanZone3.getprestatus() || cleanZone4.getprestatus() || cleanZone5.getprestatus() || cleanZone6.getprestatus() || cleanZone7.getprestatus()){//sysj\ECS_controller.sysj line: 31, column: 11
                System.out.println("");//sysj\ECS_controller.sysj line: 32, column: 4
                System.out.println("High levels of dust detected please wait for room to be cleaned...");//sysj\ECS_controller.sysj line: 33, column: 4
                __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 31, column: 106
                if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 31, column: 106
                  ends[1]=2;
                  ;//sysj\ECS_controller.sysj line: 31, column: 106
                  roomCleaned.setPresent();//sysj\ECS_controller.sysj line: 35, column: 4
                  currsigs.addElement(roomCleaned);
                  S91=3;
                  if(fanOnZone1_7.getprestatus() || heatOnZone1_7.getprestatus() || airOnZone2_3.getprestatus() || airOnZone4_5_6.getprestatus() || heatOnZone2_3.getprestatus() || heatOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 39, column: 11
                    System.out.println("");//sysj\ECS_controller.sysj line: 40, column: 4
                    System.out.println("Room temperature is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 41, column: 4
                    __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 39, column: 111
                    if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 39, column: 111
                      ends[1]=2;
                      ;//sysj\ECS_controller.sysj line: 39, column: 111
                      safeOpTemp.setPresent();//sysj\ECS_controller.sysj line: 43, column: 4
                      currsigs.addElement(safeOpTemp);
                      S91=4;
                      if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 47, column: 11
                        System.out.println("");//sysj\ECS_controller.sysj line: 48, column: 4
                        System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 49, column: 4
                        __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 47, column: 114
                        if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 47, column: 114
                          ends[1]=2;
                          ;//sysj\ECS_controller.sysj line: 47, column: 114
                          safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 51, column: 4
                          currsigs.addElement(safeOpHumid);
                          S91=5;
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
                        S91=5;
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
                    S91=4;
                    if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 47, column: 11
                      System.out.println("");//sysj\ECS_controller.sysj line: 48, column: 4
                      System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 49, column: 4
                      __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 47, column: 114
                      if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 47, column: 114
                        ends[1]=2;
                        ;//sysj\ECS_controller.sysj line: 47, column: 114
                        safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 51, column: 4
                        currsigs.addElement(safeOpHumid);
                        S91=5;
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
                      S91=5;
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
                S91=3;
                if(fanOnZone1_7.getprestatus() || heatOnZone1_7.getprestatus() || airOnZone2_3.getprestatus() || airOnZone4_5_6.getprestatus() || heatOnZone2_3.getprestatus() || heatOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 39, column: 11
                  System.out.println("");//sysj\ECS_controller.sysj line: 40, column: 4
                  System.out.println("Room temperature is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 41, column: 4
                  __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 39, column: 111
                  if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 39, column: 111
                    ends[1]=2;
                    ;//sysj\ECS_controller.sysj line: 39, column: 111
                    safeOpTemp.setPresent();//sysj\ECS_controller.sysj line: 43, column: 4
                    currsigs.addElement(safeOpTemp);
                    S91=4;
                    if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 47, column: 11
                      System.out.println("");//sysj\ECS_controller.sysj line: 48, column: 4
                      System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 49, column: 4
                      __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 47, column: 114
                      if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 47, column: 114
                        ends[1]=2;
                        ;//sysj\ECS_controller.sysj line: 47, column: 114
                        safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 51, column: 4
                        currsigs.addElement(safeOpHumid);
                        S91=5;
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
                      S91=5;
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
                  S91=4;
                  if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 47, column: 11
                    System.out.println("");//sysj\ECS_controller.sysj line: 48, column: 4
                    System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 49, column: 4
                    __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 47, column: 114
                    if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 47, column: 114
                      ends[1]=2;
                      ;//sysj\ECS_controller.sysj line: 47, column: 114
                      safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 51, column: 4
                      currsigs.addElement(safeOpHumid);
                      S91=5;
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
                    S91=5;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                }
              }
            }
          }
        
        case 2 : 
          switch(S91){
            case 0 : 
              S91=0;
              if(cutPowZ1.getprestatus() || cutPowZ2.getprestatus() || cutPowZ3.getprestatus() || cutPowZ4.getprestatus() || cutPowZ5.getprestatus() || cutPowZ6.getprestatus() || cutPowZ7.getprestatus()){//sysj\ECS_controller.sysj line: 18, column: 11
                powerOff.setPresent();//sysj\ECS_controller.sysj line: 19, column: 4
                currsigs.addElement(powerOff);
                S91=1;
                if(fireZone1.getprestatus() || fireZone2.getprestatus() || fireZone3.getprestatus() || fireZone4.getprestatus() || fireZone5.getprestatus() || fireZone6.getprestatus() || fireZone7.getprestatus()){//sysj\ECS_controller.sysj line: 23, column: 11
                  System.out.println("");//sysj\ECS_controller.sysj line: 24, column: 4
                  System.out.println("Smoke alarm activated please wait for fire to be extinguished...");//sysj\ECS_controller.sysj line: 25, column: 4
                  __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 23, column: 99
                  if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 23, column: 99
                    ends[1]=2;
                    ;//sysj\ECS_controller.sysj line: 23, column: 99
                    alarmOff.setPresent();//sysj\ECS_controller.sysj line: 27, column: 4
                    currsigs.addElement(alarmOff);
                    S91=2;
                    if(cleanZone1.getprestatus() || cleanZone2.getprestatus() || cleanZone3.getprestatus() || cleanZone4.getprestatus() || cleanZone5.getprestatus() || cleanZone6.getprestatus() || cleanZone7.getprestatus()){//sysj\ECS_controller.sysj line: 31, column: 11
                      System.out.println("");//sysj\ECS_controller.sysj line: 32, column: 4
                      System.out.println("High levels of dust detected please wait for room to be cleaned...");//sysj\ECS_controller.sysj line: 33, column: 4
                      __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 31, column: 106
                      if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 31, column: 106
                        ends[1]=2;
                        ;//sysj\ECS_controller.sysj line: 31, column: 106
                        roomCleaned.setPresent();//sysj\ECS_controller.sysj line: 35, column: 4
                        currsigs.addElement(roomCleaned);
                        S91=3;
                        if(fanOnZone1_7.getprestatus() || heatOnZone1_7.getprestatus() || airOnZone2_3.getprestatus() || airOnZone4_5_6.getprestatus() || heatOnZone2_3.getprestatus() || heatOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 39, column: 11
                          System.out.println("");//sysj\ECS_controller.sysj line: 40, column: 4
                          System.out.println("Room temperature is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 41, column: 4
                          __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 39, column: 111
                          if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 39, column: 111
                            ends[1]=2;
                            ;//sysj\ECS_controller.sysj line: 39, column: 111
                            safeOpTemp.setPresent();//sysj\ECS_controller.sysj line: 43, column: 4
                            currsigs.addElement(safeOpTemp);
                            S91=4;
                            if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 47, column: 11
                              System.out.println("");//sysj\ECS_controller.sysj line: 48, column: 4
                              System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 49, column: 4
                              __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 47, column: 114
                              if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 47, column: 114
                                ends[1]=2;
                                ;//sysj\ECS_controller.sysj line: 47, column: 114
                                safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 51, column: 4
                                currsigs.addElement(safeOpHumid);
                                S91=5;
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
                              S91=5;
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
                          S91=4;
                          if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 47, column: 11
                            System.out.println("");//sysj\ECS_controller.sysj line: 48, column: 4
                            System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 49, column: 4
                            __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 47, column: 114
                            if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 47, column: 114
                              ends[1]=2;
                              ;//sysj\ECS_controller.sysj line: 47, column: 114
                              safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 51, column: 4
                              currsigs.addElement(safeOpHumid);
                              S91=5;
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
                            S91=5;
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
                      S91=3;
                      if(fanOnZone1_7.getprestatus() || heatOnZone1_7.getprestatus() || airOnZone2_3.getprestatus() || airOnZone4_5_6.getprestatus() || heatOnZone2_3.getprestatus() || heatOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 39, column: 11
                        System.out.println("");//sysj\ECS_controller.sysj line: 40, column: 4
                        System.out.println("Room temperature is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 41, column: 4
                        __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 39, column: 111
                        if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 39, column: 111
                          ends[1]=2;
                          ;//sysj\ECS_controller.sysj line: 39, column: 111
                          safeOpTemp.setPresent();//sysj\ECS_controller.sysj line: 43, column: 4
                          currsigs.addElement(safeOpTemp);
                          S91=4;
                          if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 47, column: 11
                            System.out.println("");//sysj\ECS_controller.sysj line: 48, column: 4
                            System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 49, column: 4
                            __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 47, column: 114
                            if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 47, column: 114
                              ends[1]=2;
                              ;//sysj\ECS_controller.sysj line: 47, column: 114
                              safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 51, column: 4
                              currsigs.addElement(safeOpHumid);
                              S91=5;
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
                            S91=5;
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
                        S91=4;
                        if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 47, column: 11
                          System.out.println("");//sysj\ECS_controller.sysj line: 48, column: 4
                          System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 49, column: 4
                          __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 47, column: 114
                          if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 47, column: 114
                            ends[1]=2;
                            ;//sysj\ECS_controller.sysj line: 47, column: 114
                            safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 51, column: 4
                            currsigs.addElement(safeOpHumid);
                            S91=5;
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
                          S91=5;
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
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
                  S91=2;
                  if(cleanZone1.getprestatus() || cleanZone2.getprestatus() || cleanZone3.getprestatus() || cleanZone4.getprestatus() || cleanZone5.getprestatus() || cleanZone6.getprestatus() || cleanZone7.getprestatus()){//sysj\ECS_controller.sysj line: 31, column: 11
                    System.out.println("");//sysj\ECS_controller.sysj line: 32, column: 4
                    System.out.println("High levels of dust detected please wait for room to be cleaned...");//sysj\ECS_controller.sysj line: 33, column: 4
                    __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 31, column: 106
                    if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 31, column: 106
                      ends[1]=2;
                      ;//sysj\ECS_controller.sysj line: 31, column: 106
                      roomCleaned.setPresent();//sysj\ECS_controller.sysj line: 35, column: 4
                      currsigs.addElement(roomCleaned);
                      S91=3;
                      if(fanOnZone1_7.getprestatus() || heatOnZone1_7.getprestatus() || airOnZone2_3.getprestatus() || airOnZone4_5_6.getprestatus() || heatOnZone2_3.getprestatus() || heatOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 39, column: 11
                        System.out.println("");//sysj\ECS_controller.sysj line: 40, column: 4
                        System.out.println("Room temperature is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 41, column: 4
                        __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 39, column: 111
                        if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 39, column: 111
                          ends[1]=2;
                          ;//sysj\ECS_controller.sysj line: 39, column: 111
                          safeOpTemp.setPresent();//sysj\ECS_controller.sysj line: 43, column: 4
                          currsigs.addElement(safeOpTemp);
                          S91=4;
                          if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 47, column: 11
                            System.out.println("");//sysj\ECS_controller.sysj line: 48, column: 4
                            System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 49, column: 4
                            __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 47, column: 114
                            if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 47, column: 114
                              ends[1]=2;
                              ;//sysj\ECS_controller.sysj line: 47, column: 114
                              safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 51, column: 4
                              currsigs.addElement(safeOpHumid);
                              S91=5;
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
                            S91=5;
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
                        S91=4;
                        if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 47, column: 11
                          System.out.println("");//sysj\ECS_controller.sysj line: 48, column: 4
                          System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 49, column: 4
                          __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 47, column: 114
                          if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 47, column: 114
                            ends[1]=2;
                            ;//sysj\ECS_controller.sysj line: 47, column: 114
                            safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 51, column: 4
                            currsigs.addElement(safeOpHumid);
                            S91=5;
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
                          S91=5;
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
                    S91=3;
                    if(fanOnZone1_7.getprestatus() || heatOnZone1_7.getprestatus() || airOnZone2_3.getprestatus() || airOnZone4_5_6.getprestatus() || heatOnZone2_3.getprestatus() || heatOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 39, column: 11
                      System.out.println("");//sysj\ECS_controller.sysj line: 40, column: 4
                      System.out.println("Room temperature is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 41, column: 4
                      __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 39, column: 111
                      if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 39, column: 111
                        ends[1]=2;
                        ;//sysj\ECS_controller.sysj line: 39, column: 111
                        safeOpTemp.setPresent();//sysj\ECS_controller.sysj line: 43, column: 4
                        currsigs.addElement(safeOpTemp);
                        S91=4;
                        if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 47, column: 11
                          System.out.println("");//sysj\ECS_controller.sysj line: 48, column: 4
                          System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 49, column: 4
                          __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 47, column: 114
                          if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 47, column: 114
                            ends[1]=2;
                            ;//sysj\ECS_controller.sysj line: 47, column: 114
                            safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 51, column: 4
                            currsigs.addElement(safeOpHumid);
                            S91=5;
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
                          S91=5;
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
                      S91=4;
                      if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 47, column: 11
                        System.out.println("");//sysj\ECS_controller.sysj line: 48, column: 4
                        System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 49, column: 4
                        __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 47, column: 114
                        if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 47, column: 114
                          ends[1]=2;
                          ;//sysj\ECS_controller.sysj line: 47, column: 114
                          safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 51, column: 4
                          currsigs.addElement(safeOpHumid);
                          S91=5;
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
                        S91=5;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    }
                  }
                }
              }
              else {
                S91=1;
                if(fireZone1.getprestatus() || fireZone2.getprestatus() || fireZone3.getprestatus() || fireZone4.getprestatus() || fireZone5.getprestatus() || fireZone6.getprestatus() || fireZone7.getprestatus()){//sysj\ECS_controller.sysj line: 23, column: 11
                  System.out.println("");//sysj\ECS_controller.sysj line: 24, column: 4
                  System.out.println("Smoke alarm activated please wait for fire to be extinguished...");//sysj\ECS_controller.sysj line: 25, column: 4
                  __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 23, column: 99
                  if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 23, column: 99
                    ends[1]=2;
                    ;//sysj\ECS_controller.sysj line: 23, column: 99
                    alarmOff.setPresent();//sysj\ECS_controller.sysj line: 27, column: 4
                    currsigs.addElement(alarmOff);
                    S91=2;
                    if(cleanZone1.getprestatus() || cleanZone2.getprestatus() || cleanZone3.getprestatus() || cleanZone4.getprestatus() || cleanZone5.getprestatus() || cleanZone6.getprestatus() || cleanZone7.getprestatus()){//sysj\ECS_controller.sysj line: 31, column: 11
                      System.out.println("");//sysj\ECS_controller.sysj line: 32, column: 4
                      System.out.println("High levels of dust detected please wait for room to be cleaned...");//sysj\ECS_controller.sysj line: 33, column: 4
                      __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 31, column: 106
                      if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 31, column: 106
                        ends[1]=2;
                        ;//sysj\ECS_controller.sysj line: 31, column: 106
                        roomCleaned.setPresent();//sysj\ECS_controller.sysj line: 35, column: 4
                        currsigs.addElement(roomCleaned);
                        S91=3;
                        if(fanOnZone1_7.getprestatus() || heatOnZone1_7.getprestatus() || airOnZone2_3.getprestatus() || airOnZone4_5_6.getprestatus() || heatOnZone2_3.getprestatus() || heatOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 39, column: 11
                          System.out.println("");//sysj\ECS_controller.sysj line: 40, column: 4
                          System.out.println("Room temperature is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 41, column: 4
                          __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 39, column: 111
                          if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 39, column: 111
                            ends[1]=2;
                            ;//sysj\ECS_controller.sysj line: 39, column: 111
                            safeOpTemp.setPresent();//sysj\ECS_controller.sysj line: 43, column: 4
                            currsigs.addElement(safeOpTemp);
                            S91=4;
                            if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 47, column: 11
                              System.out.println("");//sysj\ECS_controller.sysj line: 48, column: 4
                              System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 49, column: 4
                              __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 47, column: 114
                              if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 47, column: 114
                                ends[1]=2;
                                ;//sysj\ECS_controller.sysj line: 47, column: 114
                                safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 51, column: 4
                                currsigs.addElement(safeOpHumid);
                                S91=5;
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
                              S91=5;
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
                          S91=4;
                          if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 47, column: 11
                            System.out.println("");//sysj\ECS_controller.sysj line: 48, column: 4
                            System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 49, column: 4
                            __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 47, column: 114
                            if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 47, column: 114
                              ends[1]=2;
                              ;//sysj\ECS_controller.sysj line: 47, column: 114
                              safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 51, column: 4
                              currsigs.addElement(safeOpHumid);
                              S91=5;
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
                            S91=5;
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
                      S91=3;
                      if(fanOnZone1_7.getprestatus() || heatOnZone1_7.getprestatus() || airOnZone2_3.getprestatus() || airOnZone4_5_6.getprestatus() || heatOnZone2_3.getprestatus() || heatOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 39, column: 11
                        System.out.println("");//sysj\ECS_controller.sysj line: 40, column: 4
                        System.out.println("Room temperature is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 41, column: 4
                        __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 39, column: 111
                        if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 39, column: 111
                          ends[1]=2;
                          ;//sysj\ECS_controller.sysj line: 39, column: 111
                          safeOpTemp.setPresent();//sysj\ECS_controller.sysj line: 43, column: 4
                          currsigs.addElement(safeOpTemp);
                          S91=4;
                          if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 47, column: 11
                            System.out.println("");//sysj\ECS_controller.sysj line: 48, column: 4
                            System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 49, column: 4
                            __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 47, column: 114
                            if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 47, column: 114
                              ends[1]=2;
                              ;//sysj\ECS_controller.sysj line: 47, column: 114
                              safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 51, column: 4
                              currsigs.addElement(safeOpHumid);
                              S91=5;
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
                            S91=5;
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
                        S91=4;
                        if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 47, column: 11
                          System.out.println("");//sysj\ECS_controller.sysj line: 48, column: 4
                          System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 49, column: 4
                          __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 47, column: 114
                          if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 47, column: 114
                            ends[1]=2;
                            ;//sysj\ECS_controller.sysj line: 47, column: 114
                            safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 51, column: 4
                            currsigs.addElement(safeOpHumid);
                            S91=5;
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
                          S91=5;
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
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
                  S91=2;
                  if(cleanZone1.getprestatus() || cleanZone2.getprestatus() || cleanZone3.getprestatus() || cleanZone4.getprestatus() || cleanZone5.getprestatus() || cleanZone6.getprestatus() || cleanZone7.getprestatus()){//sysj\ECS_controller.sysj line: 31, column: 11
                    System.out.println("");//sysj\ECS_controller.sysj line: 32, column: 4
                    System.out.println("High levels of dust detected please wait for room to be cleaned...");//sysj\ECS_controller.sysj line: 33, column: 4
                    __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 31, column: 106
                    if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 31, column: 106
                      ends[1]=2;
                      ;//sysj\ECS_controller.sysj line: 31, column: 106
                      roomCleaned.setPresent();//sysj\ECS_controller.sysj line: 35, column: 4
                      currsigs.addElement(roomCleaned);
                      S91=3;
                      if(fanOnZone1_7.getprestatus() || heatOnZone1_7.getprestatus() || airOnZone2_3.getprestatus() || airOnZone4_5_6.getprestatus() || heatOnZone2_3.getprestatus() || heatOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 39, column: 11
                        System.out.println("");//sysj\ECS_controller.sysj line: 40, column: 4
                        System.out.println("Room temperature is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 41, column: 4
                        __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 39, column: 111
                        if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 39, column: 111
                          ends[1]=2;
                          ;//sysj\ECS_controller.sysj line: 39, column: 111
                          safeOpTemp.setPresent();//sysj\ECS_controller.sysj line: 43, column: 4
                          currsigs.addElement(safeOpTemp);
                          S91=4;
                          if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 47, column: 11
                            System.out.println("");//sysj\ECS_controller.sysj line: 48, column: 4
                            System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 49, column: 4
                            __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 47, column: 114
                            if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 47, column: 114
                              ends[1]=2;
                              ;//sysj\ECS_controller.sysj line: 47, column: 114
                              safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 51, column: 4
                              currsigs.addElement(safeOpHumid);
                              S91=5;
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
                            S91=5;
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
                        S91=4;
                        if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 47, column: 11
                          System.out.println("");//sysj\ECS_controller.sysj line: 48, column: 4
                          System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 49, column: 4
                          __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 47, column: 114
                          if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 47, column: 114
                            ends[1]=2;
                            ;//sysj\ECS_controller.sysj line: 47, column: 114
                            safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 51, column: 4
                            currsigs.addElement(safeOpHumid);
                            S91=5;
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
                          S91=5;
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
                    S91=3;
                    if(fanOnZone1_7.getprestatus() || heatOnZone1_7.getprestatus() || airOnZone2_3.getprestatus() || airOnZone4_5_6.getprestatus() || heatOnZone2_3.getprestatus() || heatOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 39, column: 11
                      System.out.println("");//sysj\ECS_controller.sysj line: 40, column: 4
                      System.out.println("Room temperature is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 41, column: 4
                      __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 39, column: 111
                      if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 39, column: 111
                        ends[1]=2;
                        ;//sysj\ECS_controller.sysj line: 39, column: 111
                        safeOpTemp.setPresent();//sysj\ECS_controller.sysj line: 43, column: 4
                        currsigs.addElement(safeOpTemp);
                        S91=4;
                        if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 47, column: 11
                          System.out.println("");//sysj\ECS_controller.sysj line: 48, column: 4
                          System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 49, column: 4
                          __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 47, column: 114
                          if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 47, column: 114
                            ends[1]=2;
                            ;//sysj\ECS_controller.sysj line: 47, column: 114
                            safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 51, column: 4
                            currsigs.addElement(safeOpHumid);
                            S91=5;
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
                          S91=5;
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
                      S91=4;
                      if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 47, column: 11
                        System.out.println("");//sysj\ECS_controller.sysj line: 48, column: 4
                        System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 49, column: 4
                        __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 47, column: 114
                        if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 47, column: 114
                          ends[1]=2;
                          ;//sysj\ECS_controller.sysj line: 47, column: 114
                          safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 51, column: 4
                          currsigs.addElement(safeOpHumid);
                          S91=5;
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
                        S91=5;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    }
                  }
                }
              }
            
            case 1 : 
              if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 23, column: 99
                ends[1]=2;
                ;//sysj\ECS_controller.sysj line: 23, column: 99
                alarmOff.setPresent();//sysj\ECS_controller.sysj line: 27, column: 4
                currsigs.addElement(alarmOff);
                S91=2;
                if(cleanZone1.getprestatus() || cleanZone2.getprestatus() || cleanZone3.getprestatus() || cleanZone4.getprestatus() || cleanZone5.getprestatus() || cleanZone6.getprestatus() || cleanZone7.getprestatus()){//sysj\ECS_controller.sysj line: 31, column: 11
                  System.out.println("");//sysj\ECS_controller.sysj line: 32, column: 4
                  System.out.println("High levels of dust detected please wait for room to be cleaned...");//sysj\ECS_controller.sysj line: 33, column: 4
                  __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 31, column: 106
                  if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 31, column: 106
                    ends[1]=2;
                    ;//sysj\ECS_controller.sysj line: 31, column: 106
                    roomCleaned.setPresent();//sysj\ECS_controller.sysj line: 35, column: 4
                    currsigs.addElement(roomCleaned);
                    S91=3;
                    if(fanOnZone1_7.getprestatus() || heatOnZone1_7.getprestatus() || airOnZone2_3.getprestatus() || airOnZone4_5_6.getprestatus() || heatOnZone2_3.getprestatus() || heatOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 39, column: 11
                      System.out.println("");//sysj\ECS_controller.sysj line: 40, column: 4
                      System.out.println("Room temperature is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 41, column: 4
                      __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 39, column: 111
                      if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 39, column: 111
                        ends[1]=2;
                        ;//sysj\ECS_controller.sysj line: 39, column: 111
                        safeOpTemp.setPresent();//sysj\ECS_controller.sysj line: 43, column: 4
                        currsigs.addElement(safeOpTemp);
                        S91=4;
                        if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 47, column: 11
                          System.out.println("");//sysj\ECS_controller.sysj line: 48, column: 4
                          System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 49, column: 4
                          __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 47, column: 114
                          if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 47, column: 114
                            ends[1]=2;
                            ;//sysj\ECS_controller.sysj line: 47, column: 114
                            safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 51, column: 4
                            currsigs.addElement(safeOpHumid);
                            S91=5;
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
                          S91=5;
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
                      S91=4;
                      if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 47, column: 11
                        System.out.println("");//sysj\ECS_controller.sysj line: 48, column: 4
                        System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 49, column: 4
                        __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 47, column: 114
                        if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 47, column: 114
                          ends[1]=2;
                          ;//sysj\ECS_controller.sysj line: 47, column: 114
                          safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 51, column: 4
                          currsigs.addElement(safeOpHumid);
                          S91=5;
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
                        S91=5;
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
                  S91=3;
                  if(fanOnZone1_7.getprestatus() || heatOnZone1_7.getprestatus() || airOnZone2_3.getprestatus() || airOnZone4_5_6.getprestatus() || heatOnZone2_3.getprestatus() || heatOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 39, column: 11
                    System.out.println("");//sysj\ECS_controller.sysj line: 40, column: 4
                    System.out.println("Room temperature is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 41, column: 4
                    __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 39, column: 111
                    if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 39, column: 111
                      ends[1]=2;
                      ;//sysj\ECS_controller.sysj line: 39, column: 111
                      safeOpTemp.setPresent();//sysj\ECS_controller.sysj line: 43, column: 4
                      currsigs.addElement(safeOpTemp);
                      S91=4;
                      if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 47, column: 11
                        System.out.println("");//sysj\ECS_controller.sysj line: 48, column: 4
                        System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 49, column: 4
                        __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 47, column: 114
                        if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 47, column: 114
                          ends[1]=2;
                          ;//sysj\ECS_controller.sysj line: 47, column: 114
                          safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 51, column: 4
                          currsigs.addElement(safeOpHumid);
                          S91=5;
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
                        S91=5;
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
                    S91=4;
                    if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 47, column: 11
                      System.out.println("");//sysj\ECS_controller.sysj line: 48, column: 4
                      System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 49, column: 4
                      __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 47, column: 114
                      if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 47, column: 114
                        ends[1]=2;
                        ;//sysj\ECS_controller.sysj line: 47, column: 114
                        safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 51, column: 4
                        currsigs.addElement(safeOpHumid);
                        S91=5;
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
                      S91=5;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                }
              }
              else {
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 2 : 
              if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 31, column: 106
                ends[1]=2;
                ;//sysj\ECS_controller.sysj line: 31, column: 106
                roomCleaned.setPresent();//sysj\ECS_controller.sysj line: 35, column: 4
                currsigs.addElement(roomCleaned);
                S91=3;
                if(fanOnZone1_7.getprestatus() || heatOnZone1_7.getprestatus() || airOnZone2_3.getprestatus() || airOnZone4_5_6.getprestatus() || heatOnZone2_3.getprestatus() || heatOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 39, column: 11
                  System.out.println("");//sysj\ECS_controller.sysj line: 40, column: 4
                  System.out.println("Room temperature is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 41, column: 4
                  __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 39, column: 111
                  if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 39, column: 111
                    ends[1]=2;
                    ;//sysj\ECS_controller.sysj line: 39, column: 111
                    safeOpTemp.setPresent();//sysj\ECS_controller.sysj line: 43, column: 4
                    currsigs.addElement(safeOpTemp);
                    S91=4;
                    if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 47, column: 11
                      System.out.println("");//sysj\ECS_controller.sysj line: 48, column: 4
                      System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 49, column: 4
                      __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 47, column: 114
                      if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 47, column: 114
                        ends[1]=2;
                        ;//sysj\ECS_controller.sysj line: 47, column: 114
                        safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 51, column: 4
                        currsigs.addElement(safeOpHumid);
                        S91=5;
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
                      S91=5;
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
                  S91=4;
                  if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 47, column: 11
                    System.out.println("");//sysj\ECS_controller.sysj line: 48, column: 4
                    System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 49, column: 4
                    __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 47, column: 114
                    if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 47, column: 114
                      ends[1]=2;
                      ;//sysj\ECS_controller.sysj line: 47, column: 114
                      safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 51, column: 4
                      currsigs.addElement(safeOpHumid);
                      S91=5;
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
                    S91=5;
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
            
            case 3 : 
              if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 39, column: 111
                ends[1]=2;
                ;//sysj\ECS_controller.sysj line: 39, column: 111
                safeOpTemp.setPresent();//sysj\ECS_controller.sysj line: 43, column: 4
                currsigs.addElement(safeOpTemp);
                S91=4;
                if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 47, column: 11
                  System.out.println("");//sysj\ECS_controller.sysj line: 48, column: 4
                  System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 49, column: 4
                  __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 47, column: 114
                  if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 47, column: 114
                    ends[1]=2;
                    ;//sysj\ECS_controller.sysj line: 47, column: 114
                    safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 51, column: 4
                    currsigs.addElement(safeOpHumid);
                    S91=5;
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
                  S91=5;
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
            
            case 4 : 
              if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 47, column: 114
                ends[1]=2;
                ;//sysj\ECS_controller.sysj line: 47, column: 114
                safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 51, column: 4
                currsigs.addElement(safeOpHumid);
                S91=5;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 5 : 
              S91=5;
              S91=0;
              if(cutPowZ1.getprestatus() || cutPowZ2.getprestatus() || cutPowZ3.getprestatus() || cutPowZ4.getprestatus() || cutPowZ5.getprestatus() || cutPowZ6.getprestatus() || cutPowZ7.getprestatus()){//sysj\ECS_controller.sysj line: 18, column: 11
                powerOff.setPresent();//sysj\ECS_controller.sysj line: 19, column: 4
                currsigs.addElement(powerOff);
                S91=1;
                if(fireZone1.getprestatus() || fireZone2.getprestatus() || fireZone3.getprestatus() || fireZone4.getprestatus() || fireZone5.getprestatus() || fireZone6.getprestatus() || fireZone7.getprestatus()){//sysj\ECS_controller.sysj line: 23, column: 11
                  System.out.println("");//sysj\ECS_controller.sysj line: 24, column: 4
                  System.out.println("Smoke alarm activated please wait for fire to be extinguished...");//sysj\ECS_controller.sysj line: 25, column: 4
                  __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 23, column: 99
                  if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 23, column: 99
                    ends[1]=2;
                    ;//sysj\ECS_controller.sysj line: 23, column: 99
                    alarmOff.setPresent();//sysj\ECS_controller.sysj line: 27, column: 4
                    currsigs.addElement(alarmOff);
                    S91=2;
                    if(cleanZone1.getprestatus() || cleanZone2.getprestatus() || cleanZone3.getprestatus() || cleanZone4.getprestatus() || cleanZone5.getprestatus() || cleanZone6.getprestatus() || cleanZone7.getprestatus()){//sysj\ECS_controller.sysj line: 31, column: 11
                      System.out.println("");//sysj\ECS_controller.sysj line: 32, column: 4
                      System.out.println("High levels of dust detected please wait for room to be cleaned...");//sysj\ECS_controller.sysj line: 33, column: 4
                      __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 31, column: 106
                      if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 31, column: 106
                        ends[1]=2;
                        ;//sysj\ECS_controller.sysj line: 31, column: 106
                        roomCleaned.setPresent();//sysj\ECS_controller.sysj line: 35, column: 4
                        currsigs.addElement(roomCleaned);
                        S91=3;
                        if(fanOnZone1_7.getprestatus() || heatOnZone1_7.getprestatus() || airOnZone2_3.getprestatus() || airOnZone4_5_6.getprestatus() || heatOnZone2_3.getprestatus() || heatOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 39, column: 11
                          System.out.println("");//sysj\ECS_controller.sysj line: 40, column: 4
                          System.out.println("Room temperature is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 41, column: 4
                          __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 39, column: 111
                          if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 39, column: 111
                            ends[1]=2;
                            ;//sysj\ECS_controller.sysj line: 39, column: 111
                            safeOpTemp.setPresent();//sysj\ECS_controller.sysj line: 43, column: 4
                            currsigs.addElement(safeOpTemp);
                            S91=4;
                            if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 47, column: 11
                              System.out.println("");//sysj\ECS_controller.sysj line: 48, column: 4
                              System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 49, column: 4
                              __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 47, column: 114
                              if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 47, column: 114
                                ends[1]=2;
                                ;//sysj\ECS_controller.sysj line: 47, column: 114
                                safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 51, column: 4
                                currsigs.addElement(safeOpHumid);
                                S91=5;
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
                              S91=5;
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
                          S91=4;
                          if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 47, column: 11
                            System.out.println("");//sysj\ECS_controller.sysj line: 48, column: 4
                            System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 49, column: 4
                            __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 47, column: 114
                            if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 47, column: 114
                              ends[1]=2;
                              ;//sysj\ECS_controller.sysj line: 47, column: 114
                              safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 51, column: 4
                              currsigs.addElement(safeOpHumid);
                              S91=5;
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
                            S91=5;
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
                      S91=3;
                      if(fanOnZone1_7.getprestatus() || heatOnZone1_7.getprestatus() || airOnZone2_3.getprestatus() || airOnZone4_5_6.getprestatus() || heatOnZone2_3.getprestatus() || heatOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 39, column: 11
                        System.out.println("");//sysj\ECS_controller.sysj line: 40, column: 4
                        System.out.println("Room temperature is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 41, column: 4
                        __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 39, column: 111
                        if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 39, column: 111
                          ends[1]=2;
                          ;//sysj\ECS_controller.sysj line: 39, column: 111
                          safeOpTemp.setPresent();//sysj\ECS_controller.sysj line: 43, column: 4
                          currsigs.addElement(safeOpTemp);
                          S91=4;
                          if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 47, column: 11
                            System.out.println("");//sysj\ECS_controller.sysj line: 48, column: 4
                            System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 49, column: 4
                            __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 47, column: 114
                            if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 47, column: 114
                              ends[1]=2;
                              ;//sysj\ECS_controller.sysj line: 47, column: 114
                              safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 51, column: 4
                              currsigs.addElement(safeOpHumid);
                              S91=5;
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
                            S91=5;
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
                        S91=4;
                        if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 47, column: 11
                          System.out.println("");//sysj\ECS_controller.sysj line: 48, column: 4
                          System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 49, column: 4
                          __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 47, column: 114
                          if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 47, column: 114
                            ends[1]=2;
                            ;//sysj\ECS_controller.sysj line: 47, column: 114
                            safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 51, column: 4
                            currsigs.addElement(safeOpHumid);
                            S91=5;
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
                          S91=5;
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
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
                  S91=2;
                  if(cleanZone1.getprestatus() || cleanZone2.getprestatus() || cleanZone3.getprestatus() || cleanZone4.getprestatus() || cleanZone5.getprestatus() || cleanZone6.getprestatus() || cleanZone7.getprestatus()){//sysj\ECS_controller.sysj line: 31, column: 11
                    System.out.println("");//sysj\ECS_controller.sysj line: 32, column: 4
                    System.out.println("High levels of dust detected please wait for room to be cleaned...");//sysj\ECS_controller.sysj line: 33, column: 4
                    __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 31, column: 106
                    if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 31, column: 106
                      ends[1]=2;
                      ;//sysj\ECS_controller.sysj line: 31, column: 106
                      roomCleaned.setPresent();//sysj\ECS_controller.sysj line: 35, column: 4
                      currsigs.addElement(roomCleaned);
                      S91=3;
                      if(fanOnZone1_7.getprestatus() || heatOnZone1_7.getprestatus() || airOnZone2_3.getprestatus() || airOnZone4_5_6.getprestatus() || heatOnZone2_3.getprestatus() || heatOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 39, column: 11
                        System.out.println("");//sysj\ECS_controller.sysj line: 40, column: 4
                        System.out.println("Room temperature is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 41, column: 4
                        __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 39, column: 111
                        if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 39, column: 111
                          ends[1]=2;
                          ;//sysj\ECS_controller.sysj line: 39, column: 111
                          safeOpTemp.setPresent();//sysj\ECS_controller.sysj line: 43, column: 4
                          currsigs.addElement(safeOpTemp);
                          S91=4;
                          if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 47, column: 11
                            System.out.println("");//sysj\ECS_controller.sysj line: 48, column: 4
                            System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 49, column: 4
                            __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 47, column: 114
                            if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 47, column: 114
                              ends[1]=2;
                              ;//sysj\ECS_controller.sysj line: 47, column: 114
                              safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 51, column: 4
                              currsigs.addElement(safeOpHumid);
                              S91=5;
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
                            S91=5;
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
                        S91=4;
                        if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 47, column: 11
                          System.out.println("");//sysj\ECS_controller.sysj line: 48, column: 4
                          System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 49, column: 4
                          __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 47, column: 114
                          if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 47, column: 114
                            ends[1]=2;
                            ;//sysj\ECS_controller.sysj line: 47, column: 114
                            safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 51, column: 4
                            currsigs.addElement(safeOpHumid);
                            S91=5;
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
                          S91=5;
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
                    S91=3;
                    if(fanOnZone1_7.getprestatus() || heatOnZone1_7.getprestatus() || airOnZone2_3.getprestatus() || airOnZone4_5_6.getprestatus() || heatOnZone2_3.getprestatus() || heatOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 39, column: 11
                      System.out.println("");//sysj\ECS_controller.sysj line: 40, column: 4
                      System.out.println("Room temperature is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 41, column: 4
                      __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 39, column: 111
                      if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 39, column: 111
                        ends[1]=2;
                        ;//sysj\ECS_controller.sysj line: 39, column: 111
                        safeOpTemp.setPresent();//sysj\ECS_controller.sysj line: 43, column: 4
                        currsigs.addElement(safeOpTemp);
                        S91=4;
                        if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 47, column: 11
                          System.out.println("");//sysj\ECS_controller.sysj line: 48, column: 4
                          System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 49, column: 4
                          __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 47, column: 114
                          if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 47, column: 114
                            ends[1]=2;
                            ;//sysj\ECS_controller.sysj line: 47, column: 114
                            safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 51, column: 4
                            currsigs.addElement(safeOpHumid);
                            S91=5;
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
                          S91=5;
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
                      S91=4;
                      if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 47, column: 11
                        System.out.println("");//sysj\ECS_controller.sysj line: 48, column: 4
                        System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 49, column: 4
                        __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 47, column: 114
                        if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 47, column: 114
                          ends[1]=2;
                          ;//sysj\ECS_controller.sysj line: 47, column: 114
                          safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 51, column: 4
                          currsigs.addElement(safeOpHumid);
                          S91=5;
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
                        S91=5;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    }
                  }
                }
              }
              else {
                S91=1;
                if(fireZone1.getprestatus() || fireZone2.getprestatus() || fireZone3.getprestatus() || fireZone4.getprestatus() || fireZone5.getprestatus() || fireZone6.getprestatus() || fireZone7.getprestatus()){//sysj\ECS_controller.sysj line: 23, column: 11
                  System.out.println("");//sysj\ECS_controller.sysj line: 24, column: 4
                  System.out.println("Smoke alarm activated please wait for fire to be extinguished...");//sysj\ECS_controller.sysj line: 25, column: 4
                  __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 23, column: 99
                  if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 23, column: 99
                    ends[1]=2;
                    ;//sysj\ECS_controller.sysj line: 23, column: 99
                    alarmOff.setPresent();//sysj\ECS_controller.sysj line: 27, column: 4
                    currsigs.addElement(alarmOff);
                    S91=2;
                    if(cleanZone1.getprestatus() || cleanZone2.getprestatus() || cleanZone3.getprestatus() || cleanZone4.getprestatus() || cleanZone5.getprestatus() || cleanZone6.getprestatus() || cleanZone7.getprestatus()){//sysj\ECS_controller.sysj line: 31, column: 11
                      System.out.println("");//sysj\ECS_controller.sysj line: 32, column: 4
                      System.out.println("High levels of dust detected please wait for room to be cleaned...");//sysj\ECS_controller.sysj line: 33, column: 4
                      __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 31, column: 106
                      if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 31, column: 106
                        ends[1]=2;
                        ;//sysj\ECS_controller.sysj line: 31, column: 106
                        roomCleaned.setPresent();//sysj\ECS_controller.sysj line: 35, column: 4
                        currsigs.addElement(roomCleaned);
                        S91=3;
                        if(fanOnZone1_7.getprestatus() || heatOnZone1_7.getprestatus() || airOnZone2_3.getprestatus() || airOnZone4_5_6.getprestatus() || heatOnZone2_3.getprestatus() || heatOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 39, column: 11
                          System.out.println("");//sysj\ECS_controller.sysj line: 40, column: 4
                          System.out.println("Room temperature is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 41, column: 4
                          __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 39, column: 111
                          if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 39, column: 111
                            ends[1]=2;
                            ;//sysj\ECS_controller.sysj line: 39, column: 111
                            safeOpTemp.setPresent();//sysj\ECS_controller.sysj line: 43, column: 4
                            currsigs.addElement(safeOpTemp);
                            S91=4;
                            if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 47, column: 11
                              System.out.println("");//sysj\ECS_controller.sysj line: 48, column: 4
                              System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 49, column: 4
                              __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 47, column: 114
                              if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 47, column: 114
                                ends[1]=2;
                                ;//sysj\ECS_controller.sysj line: 47, column: 114
                                safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 51, column: 4
                                currsigs.addElement(safeOpHumid);
                                S91=5;
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
                              S91=5;
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
                          S91=4;
                          if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 47, column: 11
                            System.out.println("");//sysj\ECS_controller.sysj line: 48, column: 4
                            System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 49, column: 4
                            __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 47, column: 114
                            if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 47, column: 114
                              ends[1]=2;
                              ;//sysj\ECS_controller.sysj line: 47, column: 114
                              safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 51, column: 4
                              currsigs.addElement(safeOpHumid);
                              S91=5;
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
                            S91=5;
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
                      S91=3;
                      if(fanOnZone1_7.getprestatus() || heatOnZone1_7.getprestatus() || airOnZone2_3.getprestatus() || airOnZone4_5_6.getprestatus() || heatOnZone2_3.getprestatus() || heatOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 39, column: 11
                        System.out.println("");//sysj\ECS_controller.sysj line: 40, column: 4
                        System.out.println("Room temperature is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 41, column: 4
                        __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 39, column: 111
                        if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 39, column: 111
                          ends[1]=2;
                          ;//sysj\ECS_controller.sysj line: 39, column: 111
                          safeOpTemp.setPresent();//sysj\ECS_controller.sysj line: 43, column: 4
                          currsigs.addElement(safeOpTemp);
                          S91=4;
                          if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 47, column: 11
                            System.out.println("");//sysj\ECS_controller.sysj line: 48, column: 4
                            System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 49, column: 4
                            __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 47, column: 114
                            if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 47, column: 114
                              ends[1]=2;
                              ;//sysj\ECS_controller.sysj line: 47, column: 114
                              safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 51, column: 4
                              currsigs.addElement(safeOpHumid);
                              S91=5;
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
                            S91=5;
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
                        S91=4;
                        if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 47, column: 11
                          System.out.println("");//sysj\ECS_controller.sysj line: 48, column: 4
                          System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 49, column: 4
                          __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 47, column: 114
                          if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 47, column: 114
                            ends[1]=2;
                            ;//sysj\ECS_controller.sysj line: 47, column: 114
                            safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 51, column: 4
                            currsigs.addElement(safeOpHumid);
                            S91=5;
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
                          S91=5;
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
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
                  S91=2;
                  if(cleanZone1.getprestatus() || cleanZone2.getprestatus() || cleanZone3.getprestatus() || cleanZone4.getprestatus() || cleanZone5.getprestatus() || cleanZone6.getprestatus() || cleanZone7.getprestatus()){//sysj\ECS_controller.sysj line: 31, column: 11
                    System.out.println("");//sysj\ECS_controller.sysj line: 32, column: 4
                    System.out.println("High levels of dust detected please wait for room to be cleaned...");//sysj\ECS_controller.sysj line: 33, column: 4
                    __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 31, column: 106
                    if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 31, column: 106
                      ends[1]=2;
                      ;//sysj\ECS_controller.sysj line: 31, column: 106
                      roomCleaned.setPresent();//sysj\ECS_controller.sysj line: 35, column: 4
                      currsigs.addElement(roomCleaned);
                      S91=3;
                      if(fanOnZone1_7.getprestatus() || heatOnZone1_7.getprestatus() || airOnZone2_3.getprestatus() || airOnZone4_5_6.getprestatus() || heatOnZone2_3.getprestatus() || heatOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 39, column: 11
                        System.out.println("");//sysj\ECS_controller.sysj line: 40, column: 4
                        System.out.println("Room temperature is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 41, column: 4
                        __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 39, column: 111
                        if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 39, column: 111
                          ends[1]=2;
                          ;//sysj\ECS_controller.sysj line: 39, column: 111
                          safeOpTemp.setPresent();//sysj\ECS_controller.sysj line: 43, column: 4
                          currsigs.addElement(safeOpTemp);
                          S91=4;
                          if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 47, column: 11
                            System.out.println("");//sysj\ECS_controller.sysj line: 48, column: 4
                            System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 49, column: 4
                            __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 47, column: 114
                            if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 47, column: 114
                              ends[1]=2;
                              ;//sysj\ECS_controller.sysj line: 47, column: 114
                              safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 51, column: 4
                              currsigs.addElement(safeOpHumid);
                              S91=5;
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
                            S91=5;
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
                        S91=4;
                        if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 47, column: 11
                          System.out.println("");//sysj\ECS_controller.sysj line: 48, column: 4
                          System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 49, column: 4
                          __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 47, column: 114
                          if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 47, column: 114
                            ends[1]=2;
                            ;//sysj\ECS_controller.sysj line: 47, column: 114
                            safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 51, column: 4
                            currsigs.addElement(safeOpHumid);
                            S91=5;
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
                          S91=5;
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
                    S91=3;
                    if(fanOnZone1_7.getprestatus() || heatOnZone1_7.getprestatus() || airOnZone2_3.getprestatus() || airOnZone4_5_6.getprestatus() || heatOnZone2_3.getprestatus() || heatOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 39, column: 11
                      System.out.println("");//sysj\ECS_controller.sysj line: 40, column: 4
                      System.out.println("Room temperature is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 41, column: 4
                      __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 39, column: 111
                      if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 39, column: 111
                        ends[1]=2;
                        ;//sysj\ECS_controller.sysj line: 39, column: 111
                        safeOpTemp.setPresent();//sysj\ECS_controller.sysj line: 43, column: 4
                        currsigs.addElement(safeOpTemp);
                        S91=4;
                        if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 47, column: 11
                          System.out.println("");//sysj\ECS_controller.sysj line: 48, column: 4
                          System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 49, column: 4
                          __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 47, column: 114
                          if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 47, column: 114
                            ends[1]=2;
                            ;//sysj\ECS_controller.sysj line: 47, column: 114
                            safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 51, column: 4
                            currsigs.addElement(safeOpHumid);
                            S91=5;
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
                          S91=5;
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
                      S91=4;
                      if(humOnZone1_7.getprestatus() || humOnZone2_3.getprestatus() || humOnZone4_5_6.getprestatus() || deHumOnZone1_7.getprestatus() || deHumOnZone2_3.getprestatus() || deHumOnZone4_5_6.getprestatus()){//sysj\ECS_controller.sysj line: 47, column: 11
                        System.out.println("");//sysj\ECS_controller.sysj line: 48, column: 4
                        System.out.println("Room humidity is not optimal, please wait for it to moderate...");//sysj\ECS_controller.sysj line: 49, column: 4
                        __start_thread_1 = com.systemj.Timer.getMs();//sysj\ECS_controller.sysj line: 47, column: 114
                        if(com.systemj.Timer.getMs() - __start_thread_1 >= (5) * 1000){//sysj\ECS_controller.sysj line: 47, column: 114
                          ends[1]=2;
                          ;//sysj\ECS_controller.sysj line: 47, column: 114
                          safeOpHumid.setPresent();//sysj\ECS_controller.sysj line: 51, column: 4
                          currsigs.addElement(safeOpHumid);
                          S91=5;
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
                        S91=5;
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
          cutPowZ1.gethook();
          cutPowZ2.gethook();
          cutPowZ3.gethook();
          cutPowZ4.gethook();
          cutPowZ5.gethook();
          cutPowZ6.gethook();
          cutPowZ7.gethook();
          powZ1.gethook();
          powZ2.gethook();
          powZ3.gethook();
          powZ4.gethook();
          powZ5.gethook();
          powZ6.gethook();
          powZ7.gethook();
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
      cutPowZ1.setpreclear();
      cutPowZ2.setpreclear();
      cutPowZ3.setpreclear();
      cutPowZ4.setpreclear();
      cutPowZ5.setpreclear();
      cutPowZ6.setpreclear();
      cutPowZ7.setpreclear();
      powZ1.setpreclear();
      powZ2.setpreclear();
      powZ3.setpreclear();
      powZ4.setpreclear();
      powZ5.setpreclear();
      powZ6.setpreclear();
      powZ7.setpreclear();
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
      dummyint = cutPowZ1.getStatus() ? cutPowZ1.setprepresent() : cutPowZ1.setpreclear();
      cutPowZ1.setpreval(cutPowZ1.getValue());
      cutPowZ1.setClear();
      dummyint = cutPowZ2.getStatus() ? cutPowZ2.setprepresent() : cutPowZ2.setpreclear();
      cutPowZ2.setpreval(cutPowZ2.getValue());
      cutPowZ2.setClear();
      dummyint = cutPowZ3.getStatus() ? cutPowZ3.setprepresent() : cutPowZ3.setpreclear();
      cutPowZ3.setpreval(cutPowZ3.getValue());
      cutPowZ3.setClear();
      dummyint = cutPowZ4.getStatus() ? cutPowZ4.setprepresent() : cutPowZ4.setpreclear();
      cutPowZ4.setpreval(cutPowZ4.getValue());
      cutPowZ4.setClear();
      dummyint = cutPowZ5.getStatus() ? cutPowZ5.setprepresent() : cutPowZ5.setpreclear();
      cutPowZ5.setpreval(cutPowZ5.getValue());
      cutPowZ5.setClear();
      dummyint = cutPowZ6.getStatus() ? cutPowZ6.setprepresent() : cutPowZ6.setpreclear();
      cutPowZ6.setpreval(cutPowZ6.getValue());
      cutPowZ6.setClear();
      dummyint = cutPowZ7.getStatus() ? cutPowZ7.setprepresent() : cutPowZ7.setpreclear();
      cutPowZ7.setpreval(cutPowZ7.getValue());
      cutPowZ7.setClear();
      dummyint = powZ1.getStatus() ? powZ1.setprepresent() : powZ1.setpreclear();
      powZ1.setpreval(powZ1.getValue());
      powZ1.setClear();
      dummyint = powZ2.getStatus() ? powZ2.setprepresent() : powZ2.setpreclear();
      powZ2.setpreval(powZ2.getValue());
      powZ2.setClear();
      dummyint = powZ3.getStatus() ? powZ3.setprepresent() : powZ3.setpreclear();
      powZ3.setpreval(powZ3.getValue());
      powZ3.setClear();
      dummyint = powZ4.getStatus() ? powZ4.setprepresent() : powZ4.setpreclear();
      powZ4.setpreval(powZ4.getValue());
      powZ4.setClear();
      dummyint = powZ5.getStatus() ? powZ5.setprepresent() : powZ5.setpreclear();
      powZ5.setpreval(powZ5.getValue());
      powZ5.setClear();
      dummyint = powZ6.getStatus() ? powZ6.setprepresent() : powZ6.setpreclear();
      powZ6.setpreval(powZ6.getValue());
      powZ6.setClear();
      dummyint = powZ7.getStatus() ? powZ7.setprepresent() : powZ7.setpreclear();
      powZ7.setpreval(powZ7.getValue());
      powZ7.setClear();
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
        cutPowZ1.gethook();
        cutPowZ2.gethook();
        cutPowZ3.gethook();
        cutPowZ4.gethook();
        cutPowZ5.gethook();
        cutPowZ6.gethook();
        cutPowZ7.gethook();
        powZ1.gethook();
        powZ2.gethook();
        powZ3.gethook();
        powZ4.gethook();
        powZ5.gethook();
        powZ6.gethook();
        powZ7.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
