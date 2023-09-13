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
  public Signal unlock1_t = new Signal("unlock1_t", Signal.INPUT);
  public Signal lock1 = new Signal("lock1", Signal.INPUT);
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
  public Signal person1access = new Signal("person1access", Signal.INPUT);
  public Signal person1zone = new Signal("person1zone", Signal.INPUT);
  public Signal person1doorreq = new Signal("person1doorreq", Signal.INPUT);
  public Signal person2zone = new Signal("person2zone", Signal.INPUT);
  public Signal person2doorreq = new Signal("person2doorreq", Signal.INPUT);
  public Signal person3zone = new Signal("person3zone", Signal.INPUT);
  public Signal person3doorreq = new Signal("person3doorreq", Signal.INPUT);
  public Signal person4zone = new Signal("person4zone", Signal.INPUT);
  public Signal person4doorreq = new Signal("person4doorreq", Signal.INPUT);
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
  private int[][] personArray_thread_1;//sysj\controller.sysj line: 10, column: 2
  private int S1249 = 1;
  private int S5 = 1;
  
  private int[] ends = new int[2];
  private int[] tdone = new int[2];
  
  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S1249){
        case 0 : 
          S1249=0;
          break RUN;
        
        case 1 : 
          S1249=2;
          S1249=2;
          personArray_thread_1 = new int[4][4];//sysj\controller.sysj line: 10, column: 2
          personArray_thread_1[0][0] = 0;//sysj\controller.sysj line: 13, column: 2
          personArray_thread_1[0][1] = 3;//sysj\controller.sysj line: 14, column: 2
          personArray_thread_1[0][2] = 1;//sysj\controller.sysj line: 15, column: 2
          personArray_thread_1[0][3] = 0;//sysj\controller.sysj line: 16, column: 2
          personArray_thread_1[1][0] = 1;//sysj\controller.sysj line: 18, column: 2
          personArray_thread_1[1][1] = 0;//sysj\controller.sysj line: 19, column: 2
          personArray_thread_1[1][2] = 1;//sysj\controller.sysj line: 20, column: 2
          personArray_thread_1[1][3] = 0;//sysj\controller.sysj line: 21, column: 2
          personArray_thread_1[2][0] = 2;//sysj\controller.sysj line: 23, column: 2
          personArray_thread_1[2][1] = 1;//sysj\controller.sysj line: 24, column: 2
          personArray_thread_1[2][2] = 4;//sysj\controller.sysj line: 25, column: 2
          personArray_thread_1[2][3] = 0;//sysj\controller.sysj line: 26, column: 2
          personArray_thread_1[3][0] = 3;//sysj\controller.sysj line: 28, column: 2
          personArray_thread_1[3][1] = 1;//sysj\controller.sysj line: 29, column: 2
          personArray_thread_1[3][2] = 4;//sysj\controller.sysj line: 30, column: 2
          personArray_thread_1[3][3] = 0;//sysj\controller.sysj line: 31, column: 2
          System.out.println(personArray_thread_1[0][1]);//sysj\controller.sysj line: 39, column: 3
          if(person1access.getprestatus()){//sysj\controller.sysj line: 40, column: 11
            personArray_thread_1[0][1] = 5;//sysj\controller.sysj line: 41, column: 4
            System.out.println("POO");//sysj\controller.sysj line: 42, column: 4
            S5=0;
            if(personArray_thread_1[0][1] == 0){//sysj\controller.sysj line: 44, column: 6
              if(personArray_thread_1[0][2] < 2){//sysj\controller.sysj line: 45, column: 7
                if(personArray_thread_1[0][3] == 0){//sysj\controller.sysj line: 46, column: 11
                  System.out.println("aaaaaaaaaa");//sysj\controller.sysj line: 47, column: 6
                  unlock1.setPresent();//sysj\controller.sysj line: 48, column: 6
                  currsigs.addElement(unlock1);
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                else {
                  ends[1]=2;
                  ;//sysj\controller.sysj line: 46, column: 5
                  S5=1;
                  if(personArray_thread_1[0][1] == 1){//sysj\controller.sysj line: 59, column: 6
                    System.out.println(personArray_thread_1[0][1]);//sysj\controller.sysj line: 60, column: 4
                    if((personArray_thread_1[0][2] == 0) | (personArray_thread_1[0][2] == 2)){//sysj\controller.sysj line: 61, column: 7
                      if(personArray_thread_1[0][3] == 2){//sysj\controller.sysj line: 62, column: 11
                        unlock3.setPresent();//sysj\controller.sysj line: 63, column: 6
                        currsigs.addElement(unlock3);
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        ends[1]=2;
                        ;//sysj\controller.sysj line: 62, column: 5
                        S5=2;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    }
                    else {
                      S5=2;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                  else {
                    S5=2;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                }
              }
              else {
                S5=1;
                if(personArray_thread_1[0][1] == 1){//sysj\controller.sysj line: 59, column: 6
                  System.out.println(personArray_thread_1[0][1]);//sysj\controller.sysj line: 60, column: 4
                  if((personArray_thread_1[0][2] == 0) | (personArray_thread_1[0][2] == 2)){//sysj\controller.sysj line: 61, column: 7
                    if(personArray_thread_1[0][3] == 2){//sysj\controller.sysj line: 62, column: 11
                      unlock3.setPresent();//sysj\controller.sysj line: 63, column: 6
                      currsigs.addElement(unlock3);
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    else {
                      ends[1]=2;
                      ;//sysj\controller.sysj line: 62, column: 5
                      S5=2;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                  else {
                    S5=2;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                }
                else {
                  S5=2;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
            }
            else {
              S5=1;
              if(personArray_thread_1[0][1] == 1){//sysj\controller.sysj line: 59, column: 6
                System.out.println(personArray_thread_1[0][1]);//sysj\controller.sysj line: 60, column: 4
                if((personArray_thread_1[0][2] == 0) | (personArray_thread_1[0][2] == 2)){//sysj\controller.sysj line: 61, column: 7
                  if(personArray_thread_1[0][3] == 2){//sysj\controller.sysj line: 62, column: 11
                    unlock3.setPresent();//sysj\controller.sysj line: 63, column: 6
                    currsigs.addElement(unlock3);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    ends[1]=2;
                    ;//sysj\controller.sysj line: 62, column: 5
                    S5=2;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                }
                else {
                  S5=2;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
              else {
                S5=2;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            }
          }
          else {
            S5=0;
            if(personArray_thread_1[0][1] == 0){//sysj\controller.sysj line: 44, column: 6
              if(personArray_thread_1[0][2] < 2){//sysj\controller.sysj line: 45, column: 7
                if(personArray_thread_1[0][3] == 0){//sysj\controller.sysj line: 46, column: 11
                  System.out.println("aaaaaaaaaa");//sysj\controller.sysj line: 47, column: 6
                  unlock1.setPresent();//sysj\controller.sysj line: 48, column: 6
                  currsigs.addElement(unlock1);
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                else {
                  ends[1]=2;
                  ;//sysj\controller.sysj line: 46, column: 5
                  S5=1;
                  if(personArray_thread_1[0][1] == 1){//sysj\controller.sysj line: 59, column: 6
                    System.out.println(personArray_thread_1[0][1]);//sysj\controller.sysj line: 60, column: 4
                    if((personArray_thread_1[0][2] == 0) | (personArray_thread_1[0][2] == 2)){//sysj\controller.sysj line: 61, column: 7
                      if(personArray_thread_1[0][3] == 2){//sysj\controller.sysj line: 62, column: 11
                        unlock3.setPresent();//sysj\controller.sysj line: 63, column: 6
                        currsigs.addElement(unlock3);
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        ends[1]=2;
                        ;//sysj\controller.sysj line: 62, column: 5
                        S5=2;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    }
                    else {
                      S5=2;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                  else {
                    S5=2;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                }
              }
              else {
                S5=1;
                if(personArray_thread_1[0][1] == 1){//sysj\controller.sysj line: 59, column: 6
                  System.out.println(personArray_thread_1[0][1]);//sysj\controller.sysj line: 60, column: 4
                  if((personArray_thread_1[0][2] == 0) | (personArray_thread_1[0][2] == 2)){//sysj\controller.sysj line: 61, column: 7
                    if(personArray_thread_1[0][3] == 2){//sysj\controller.sysj line: 62, column: 11
                      unlock3.setPresent();//sysj\controller.sysj line: 63, column: 6
                      currsigs.addElement(unlock3);
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    else {
                      ends[1]=2;
                      ;//sysj\controller.sysj line: 62, column: 5
                      S5=2;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                  else {
                    S5=2;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                }
                else {
                  S5=2;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
            }
            else {
              S5=1;
              if(personArray_thread_1[0][1] == 1){//sysj\controller.sysj line: 59, column: 6
                System.out.println(personArray_thread_1[0][1]);//sysj\controller.sysj line: 60, column: 4
                if((personArray_thread_1[0][2] == 0) | (personArray_thread_1[0][2] == 2)){//sysj\controller.sysj line: 61, column: 7
                  if(personArray_thread_1[0][3] == 2){//sysj\controller.sysj line: 62, column: 11
                    unlock3.setPresent();//sysj\controller.sysj line: 63, column: 6
                    currsigs.addElement(unlock3);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    ends[1]=2;
                    ;//sysj\controller.sysj line: 62, column: 5
                    S5=2;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                }
                else {
                  S5=2;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
              else {
                S5=2;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            }
          }
        
        case 2 : 
          switch(S5){
            case 0 : 
              if(personArray_thread_1[0][3] == 0){//sysj\controller.sysj line: 46, column: 11
                System.out.println("aaaaaaaaaa");//sysj\controller.sysj line: 47, column: 6
                unlock1.setPresent();//sysj\controller.sysj line: 48, column: 6
                currsigs.addElement(unlock1);
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                ends[1]=2;
                ;//sysj\controller.sysj line: 46, column: 5
                S5=1;
                if(personArray_thread_1[0][1] == 1){//sysj\controller.sysj line: 59, column: 6
                  System.out.println(personArray_thread_1[0][1]);//sysj\controller.sysj line: 60, column: 4
                  if((personArray_thread_1[0][2] == 0) | (personArray_thread_1[0][2] == 2)){//sysj\controller.sysj line: 61, column: 7
                    if(personArray_thread_1[0][3] == 2){//sysj\controller.sysj line: 62, column: 11
                      unlock3.setPresent();//sysj\controller.sysj line: 63, column: 6
                      currsigs.addElement(unlock3);
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    else {
                      ends[1]=2;
                      ;//sysj\controller.sysj line: 62, column: 5
                      S5=2;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                  else {
                    S5=2;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                }
                else {
                  S5=2;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
            
            case 1 : 
              unlock3.setPresent();//sysj\controller.sysj line: 63, column: 6
              currsigs.addElement(unlock3);
              active[1]=1;
              ends[1]=1;
              break RUN;
            
            case 2 : 
              S5=2;
              System.out.println(personArray_thread_1[0][1]);//sysj\controller.sysj line: 39, column: 3
              if(person1access.getprestatus()){//sysj\controller.sysj line: 40, column: 11
                personArray_thread_1[0][1] = 5;//sysj\controller.sysj line: 41, column: 4
                System.out.println("POO");//sysj\controller.sysj line: 42, column: 4
                S5=0;
                if(personArray_thread_1[0][1] == 0){//sysj\controller.sysj line: 44, column: 6
                  if(personArray_thread_1[0][2] < 2){//sysj\controller.sysj line: 45, column: 7
                    if(personArray_thread_1[0][3] == 0){//sysj\controller.sysj line: 46, column: 11
                      System.out.println("aaaaaaaaaa");//sysj\controller.sysj line: 47, column: 6
                      unlock1.setPresent();//sysj\controller.sysj line: 48, column: 6
                      currsigs.addElement(unlock1);
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    else {
                      ends[1]=2;
                      ;//sysj\controller.sysj line: 46, column: 5
                      S5=1;
                      if(personArray_thread_1[0][1] == 1){//sysj\controller.sysj line: 59, column: 6
                        System.out.println(personArray_thread_1[0][1]);//sysj\controller.sysj line: 60, column: 4
                        if((personArray_thread_1[0][2] == 0) | (personArray_thread_1[0][2] == 2)){//sysj\controller.sysj line: 61, column: 7
                          if(personArray_thread_1[0][3] == 2){//sysj\controller.sysj line: 62, column: 11
                            unlock3.setPresent();//sysj\controller.sysj line: 63, column: 6
                            currsigs.addElement(unlock3);
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            ends[1]=2;
                            ;//sysj\controller.sysj line: 62, column: 5
                            S5=2;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                        }
                        else {
                          S5=2;
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                      else {
                        S5=2;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    }
                  }
                  else {
                    S5=1;
                    if(personArray_thread_1[0][1] == 1){//sysj\controller.sysj line: 59, column: 6
                      System.out.println(personArray_thread_1[0][1]);//sysj\controller.sysj line: 60, column: 4
                      if((personArray_thread_1[0][2] == 0) | (personArray_thread_1[0][2] == 2)){//sysj\controller.sysj line: 61, column: 7
                        if(personArray_thread_1[0][3] == 2){//sysj\controller.sysj line: 62, column: 11
                          unlock3.setPresent();//sysj\controller.sysj line: 63, column: 6
                          currsigs.addElement(unlock3);
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                        else {
                          ends[1]=2;
                          ;//sysj\controller.sysj line: 62, column: 5
                          S5=2;
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                      else {
                        S5=2;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    }
                    else {
                      S5=2;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                }
                else {
                  S5=1;
                  if(personArray_thread_1[0][1] == 1){//sysj\controller.sysj line: 59, column: 6
                    System.out.println(personArray_thread_1[0][1]);//sysj\controller.sysj line: 60, column: 4
                    if((personArray_thread_1[0][2] == 0) | (personArray_thread_1[0][2] == 2)){//sysj\controller.sysj line: 61, column: 7
                      if(personArray_thread_1[0][3] == 2){//sysj\controller.sysj line: 62, column: 11
                        unlock3.setPresent();//sysj\controller.sysj line: 63, column: 6
                        currsigs.addElement(unlock3);
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        ends[1]=2;
                        ;//sysj\controller.sysj line: 62, column: 5
                        S5=2;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    }
                    else {
                      S5=2;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                  else {
                    S5=2;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                }
              }
              else {
                S5=0;
                if(personArray_thread_1[0][1] == 0){//sysj\controller.sysj line: 44, column: 6
                  if(personArray_thread_1[0][2] < 2){//sysj\controller.sysj line: 45, column: 7
                    if(personArray_thread_1[0][3] == 0){//sysj\controller.sysj line: 46, column: 11
                      System.out.println("aaaaaaaaaa");//sysj\controller.sysj line: 47, column: 6
                      unlock1.setPresent();//sysj\controller.sysj line: 48, column: 6
                      currsigs.addElement(unlock1);
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    else {
                      ends[1]=2;
                      ;//sysj\controller.sysj line: 46, column: 5
                      S5=1;
                      if(personArray_thread_1[0][1] == 1){//sysj\controller.sysj line: 59, column: 6
                        System.out.println(personArray_thread_1[0][1]);//sysj\controller.sysj line: 60, column: 4
                        if((personArray_thread_1[0][2] == 0) | (personArray_thread_1[0][2] == 2)){//sysj\controller.sysj line: 61, column: 7
                          if(personArray_thread_1[0][3] == 2){//sysj\controller.sysj line: 62, column: 11
                            unlock3.setPresent();//sysj\controller.sysj line: 63, column: 6
                            currsigs.addElement(unlock3);
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            ends[1]=2;
                            ;//sysj\controller.sysj line: 62, column: 5
                            S5=2;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                        }
                        else {
                          S5=2;
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                      else {
                        S5=2;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    }
                  }
                  else {
                    S5=1;
                    if(personArray_thread_1[0][1] == 1){//sysj\controller.sysj line: 59, column: 6
                      System.out.println(personArray_thread_1[0][1]);//sysj\controller.sysj line: 60, column: 4
                      if((personArray_thread_1[0][2] == 0) | (personArray_thread_1[0][2] == 2)){//sysj\controller.sysj line: 61, column: 7
                        if(personArray_thread_1[0][3] == 2){//sysj\controller.sysj line: 62, column: 11
                          unlock3.setPresent();//sysj\controller.sysj line: 63, column: 6
                          currsigs.addElement(unlock3);
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                        else {
                          ends[1]=2;
                          ;//sysj\controller.sysj line: 62, column: 5
                          S5=2;
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                      else {
                        S5=2;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    }
                    else {
                      S5=2;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                }
                else {
                  S5=1;
                  if(personArray_thread_1[0][1] == 1){//sysj\controller.sysj line: 59, column: 6
                    System.out.println(personArray_thread_1[0][1]);//sysj\controller.sysj line: 60, column: 4
                    if((personArray_thread_1[0][2] == 0) | (personArray_thread_1[0][2] == 2)){//sysj\controller.sysj line: 61, column: 7
                      if(personArray_thread_1[0][3] == 2){//sysj\controller.sysj line: 62, column: 11
                        unlock3.setPresent();//sysj\controller.sysj line: 63, column: 6
                        currsigs.addElement(unlock3);
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        ends[1]=2;
                        ;//sysj\controller.sysj line: 62, column: 5
                        S5=2;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    }
                    else {
                      S5=2;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                  else {
                    S5=2;
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
          unlock1_t.gethook();
          lock1.gethook();
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
          person1access.gethook();
          person1zone.gethook();
          person1doorreq.gethook();
          person2zone.gethook();
          person2doorreq.gethook();
          person3zone.gethook();
          person3doorreq.gethook();
          person4zone.gethook();
          person4doorreq.gethook();
          df = true;
        }
        runClockDomain();
      }
      unlock1_t.setpreclear();
      lock1.setpreclear();
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
      person1access.setpreclear();
      person1zone.setpreclear();
      person1doorreq.setpreclear();
      person2zone.setpreclear();
      person2doorreq.setpreclear();
      person3zone.setpreclear();
      person3doorreq.setpreclear();
      person4zone.setpreclear();
      person4doorreq.setpreclear();
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
      dummyint = unlock1_t.getStatus() ? unlock1_t.setprepresent() : unlock1_t.setpreclear();
      unlock1_t.setpreval(unlock1_t.getValue());
      unlock1_t.setClear();
      dummyint = lock1.getStatus() ? lock1.setprepresent() : lock1.setpreclear();
      lock1.setpreval(lock1.getValue());
      lock1.setClear();
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
      dummyint = person1access.getStatus() ? person1access.setprepresent() : person1access.setpreclear();
      person1access.setpreval(person1access.getValue());
      person1access.setClear();
      dummyint = person1zone.getStatus() ? person1zone.setprepresent() : person1zone.setpreclear();
      person1zone.setpreval(person1zone.getValue());
      person1zone.setClear();
      dummyint = person1doorreq.getStatus() ? person1doorreq.setprepresent() : person1doorreq.setpreclear();
      person1doorreq.setpreval(person1doorreq.getValue());
      person1doorreq.setClear();
      dummyint = person2zone.getStatus() ? person2zone.setprepresent() : person2zone.setpreclear();
      person2zone.setpreval(person2zone.getValue());
      person2zone.setClear();
      dummyint = person2doorreq.getStatus() ? person2doorreq.setprepresent() : person2doorreq.setpreclear();
      person2doorreq.setpreval(person2doorreq.getValue());
      person2doorreq.setClear();
      dummyint = person3zone.getStatus() ? person3zone.setprepresent() : person3zone.setpreclear();
      person3zone.setpreval(person3zone.getValue());
      person3zone.setClear();
      dummyint = person3doorreq.getStatus() ? person3doorreq.setprepresent() : person3doorreq.setpreclear();
      person3doorreq.setpreval(person3doorreq.getValue());
      person3doorreq.setClear();
      dummyint = person4zone.getStatus() ? person4zone.setprepresent() : person4zone.setpreclear();
      person4zone.setpreval(person4zone.getValue());
      person4zone.setClear();
      dummyint = person4doorreq.getStatus() ? person4doorreq.setprepresent() : person4doorreq.setpreclear();
      person4doorreq.setpreval(person4doorreq.getValue());
      person4doorreq.setClear();
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
        unlock1_t.gethook();
        lock1.gethook();
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
        person1access.gethook();
        person1zone.gethook();
        person1doorreq.gethook();
        person2zone.gethook();
        person2doorreq.gethook();
        person3zone.gethook();
        person3doorreq.gethook();
        person4zone.gethook();
        person4doorreq.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
