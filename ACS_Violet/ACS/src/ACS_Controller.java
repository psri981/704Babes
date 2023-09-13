import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class ACS_Controller extends ClockDomain{
  public ACS_Controller(String name){super(name);}
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
  public Signal zoneOcc0 = new Signal("zoneOcc0", Signal.INPUT);
  public Signal zoneOcc1 = new Signal("zoneOcc1", Signal.INPUT);
  public Signal zoneOcc2 = new Signal("zoneOcc2", Signal.INPUT);
  public Signal zoneOcc3 = new Signal("zoneOcc3", Signal.INPUT);
  public Signal zoneOcc4 = new Signal("zoneOcc4", Signal.INPUT);
  public Signal zoneOcc5 = new Signal("zoneOcc5", Signal.INPUT);
  public Signal zoneOcc6 = new Signal("zoneOcc6", Signal.INPUT);
  public Signal zoneOcc7 = new Signal("zoneOcc7", Signal.INPUT);
  public Signal person1accessOffice = new Signal("person1accessOffice", Signal.INPUT);
  public Signal person1accessManu = new Signal("person1accessManu", Signal.INPUT);
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
  private int[][] personArray_thread_1;//sysj\ACS_Controller.sysj line: 10, column: 2
  private int S57757 = 1;
  private int S0 = 1;
  private int S273 = 1;
  
  private int[] ends = new int[2];
  private int[] tdone = new int[2];
  
  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S57757){
        case 0 : 
          S57757=0;
          break RUN;
        
        case 1 : 
          S57757=2;
          S57757=2;
          personArray_thread_1 = new int[4][4];//sysj\ACS_Controller.sysj line: 10, column: 2
          personArray_thread_1[0][0] = 0;//sysj\ACS_Controller.sysj line: 13, column: 2
          personArray_thread_1[0][1] = 3;//sysj\ACS_Controller.sysj line: 14, column: 2
          personArray_thread_1[0][2] = 0;//sysj\ACS_Controller.sysj line: 15, column: 2
          personArray_thread_1[0][3] = 0;//sysj\ACS_Controller.sysj line: 16, column: 2
          S0=0;
          active[1]=1;
          ends[1]=1;
          break RUN;
        
        case 2 : 
          switch(S0){
            case 0 : 
              if(person1accessOffice.getprestatus() || person1accessManu.getprestatus()){//sysj\ACS_Controller.sysj line: 34, column: 9
                S0=1;
                if(person1accessOffice.getprestatus()){//sysj\ACS_Controller.sysj line: 35, column: 10
                  personArray_thread_1[0][1] = 0;//sysj\ACS_Controller.sysj line: 36, column: 3
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                else {
                  S0=2;
                  if(person1accessManu.getprestatus()){//sysj\ACS_Controller.sysj line: 39, column: 10
                    personArray_thread_1[0][1] = 1;//sysj\ACS_Controller.sysj line: 40, column: 3
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    S0=3;
                    System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 45, column: 3
                    S273=0;
                    personArray_thread_1[0][1] = 0;//sysj\ACS_Controller.sysj line: 49, column: 6
                    unlock1.setPresent();//sysj\ACS_Controller.sysj line: 51, column: 7
                    currsigs.addElement(unlock1);
                    if(zoneOcc0.getprestatus()){//sysj\ACS_Controller.sysj line: 52, column: 15
                      personArray_thread_1[0][2] = 0;//sysj\ACS_Controller.sysj line: 53, column: 8
                      System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 54, column: 8
                      if(zoneOcc1.getprestatus()){//sysj\ACS_Controller.sysj line: 56, column: 15
                        personArray_thread_1[0][2] = 1;//sysj\ACS_Controller.sysj line: 57, column: 8
                        System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 58, column: 8
                        if(zoneOcc7.getprestatus()){//sysj\ACS_Controller.sysj line: 60, column: 15
                          personArray_thread_1[0][2] = 7;//sysj\ACS_Controller.sysj line: 61, column: 8
                          System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 62, column: 8
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
                        if(zoneOcc7.getprestatus()){//sysj\ACS_Controller.sysj line: 60, column: 15
                          personArray_thread_1[0][2] = 7;//sysj\ACS_Controller.sysj line: 61, column: 8
                          System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 62, column: 8
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
                    }
                    else {
                      if(zoneOcc1.getprestatus()){//sysj\ACS_Controller.sysj line: 56, column: 15
                        personArray_thread_1[0][2] = 1;//sysj\ACS_Controller.sysj line: 57, column: 8
                        System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 58, column: 8
                        if(zoneOcc7.getprestatus()){//sysj\ACS_Controller.sysj line: 60, column: 15
                          personArray_thread_1[0][2] = 7;//sysj\ACS_Controller.sysj line: 61, column: 8
                          System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 62, column: 8
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
                        if(zoneOcc7.getprestatus()){//sysj\ACS_Controller.sysj line: 60, column: 15
                          personArray_thread_1[0][2] = 7;//sysj\ACS_Controller.sysj line: 61, column: 8
                          System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 62, column: 8
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
                    }
                  }
                }
              }
              else {
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 1 : 
              S0=2;
              if(person1accessManu.getprestatus()){//sysj\ACS_Controller.sysj line: 39, column: 10
                personArray_thread_1[0][1] = 1;//sysj\ACS_Controller.sysj line: 40, column: 3
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                S0=3;
                System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 45, column: 3
                S273=0;
                personArray_thread_1[0][1] = 0;//sysj\ACS_Controller.sysj line: 49, column: 6
                unlock1.setPresent();//sysj\ACS_Controller.sysj line: 51, column: 7
                currsigs.addElement(unlock1);
                if(zoneOcc0.getprestatus()){//sysj\ACS_Controller.sysj line: 52, column: 15
                  personArray_thread_1[0][2] = 0;//sysj\ACS_Controller.sysj line: 53, column: 8
                  System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 54, column: 8
                  if(zoneOcc1.getprestatus()){//sysj\ACS_Controller.sysj line: 56, column: 15
                    personArray_thread_1[0][2] = 1;//sysj\ACS_Controller.sysj line: 57, column: 8
                    System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 58, column: 8
                    if(zoneOcc7.getprestatus()){//sysj\ACS_Controller.sysj line: 60, column: 15
                      personArray_thread_1[0][2] = 7;//sysj\ACS_Controller.sysj line: 61, column: 8
                      System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 62, column: 8
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
                    if(zoneOcc7.getprestatus()){//sysj\ACS_Controller.sysj line: 60, column: 15
                      personArray_thread_1[0][2] = 7;//sysj\ACS_Controller.sysj line: 61, column: 8
                      System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 62, column: 8
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
                }
                else {
                  if(zoneOcc1.getprestatus()){//sysj\ACS_Controller.sysj line: 56, column: 15
                    personArray_thread_1[0][2] = 1;//sysj\ACS_Controller.sysj line: 57, column: 8
                    System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 58, column: 8
                    if(zoneOcc7.getprestatus()){//sysj\ACS_Controller.sysj line: 60, column: 15
                      personArray_thread_1[0][2] = 7;//sysj\ACS_Controller.sysj line: 61, column: 8
                      System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 62, column: 8
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
                    if(zoneOcc7.getprestatus()){//sysj\ACS_Controller.sysj line: 60, column: 15
                      personArray_thread_1[0][2] = 7;//sysj\ACS_Controller.sysj line: 61, column: 8
                      System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 62, column: 8
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
                }
              }
            
            case 2 : 
              S0=3;
              System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 45, column: 3
              S273=0;
              personArray_thread_1[0][1] = 0;//sysj\ACS_Controller.sysj line: 49, column: 6
              unlock1.setPresent();//sysj\ACS_Controller.sysj line: 51, column: 7
              currsigs.addElement(unlock1);
              if(zoneOcc0.getprestatus()){//sysj\ACS_Controller.sysj line: 52, column: 15
                personArray_thread_1[0][2] = 0;//sysj\ACS_Controller.sysj line: 53, column: 8
                System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 54, column: 8
                if(zoneOcc1.getprestatus()){//sysj\ACS_Controller.sysj line: 56, column: 15
                  personArray_thread_1[0][2] = 1;//sysj\ACS_Controller.sysj line: 57, column: 8
                  System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 58, column: 8
                  if(zoneOcc7.getprestatus()){//sysj\ACS_Controller.sysj line: 60, column: 15
                    personArray_thread_1[0][2] = 7;//sysj\ACS_Controller.sysj line: 61, column: 8
                    System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 62, column: 8
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
                  if(zoneOcc7.getprestatus()){//sysj\ACS_Controller.sysj line: 60, column: 15
                    personArray_thread_1[0][2] = 7;//sysj\ACS_Controller.sysj line: 61, column: 8
                    System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 62, column: 8
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
              }
              else {
                if(zoneOcc1.getprestatus()){//sysj\ACS_Controller.sysj line: 56, column: 15
                  personArray_thread_1[0][2] = 1;//sysj\ACS_Controller.sysj line: 57, column: 8
                  System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 58, column: 8
                  if(zoneOcc7.getprestatus()){//sysj\ACS_Controller.sysj line: 60, column: 15
                    personArray_thread_1[0][2] = 7;//sysj\ACS_Controller.sysj line: 61, column: 8
                    System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 62, column: 8
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
                  if(zoneOcc7.getprestatus()){//sysj\ACS_Controller.sysj line: 60, column: 15
                    personArray_thread_1[0][2] = 7;//sysj\ACS_Controller.sysj line: 61, column: 8
                    System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 62, column: 8
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
              }
            
            case 3 : 
              switch(S273){
                case 0 : 
                  if(person1accessManu.getprestatus()){//sysj\ACS_Controller.sysj line: 47, column: 9
                    S273=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    if(person1accessManu.getprestatus()){//sysj\ACS_Controller.sysj line: 48, column: 11
                      personArray_thread_1[0][1] = 1;//sysj\ACS_Controller.sysj line: 67, column: 5
                      S273=1;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    else {
                      unlock1.setPresent();//sysj\ACS_Controller.sysj line: 51, column: 7
                      currsigs.addElement(unlock1);
                      if(zoneOcc0.getprestatus()){//sysj\ACS_Controller.sysj line: 52, column: 15
                        personArray_thread_1[0][2] = 0;//sysj\ACS_Controller.sysj line: 53, column: 8
                        System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 54, column: 8
                        if(zoneOcc1.getprestatus()){//sysj\ACS_Controller.sysj line: 56, column: 15
                          personArray_thread_1[0][2] = 1;//sysj\ACS_Controller.sysj line: 57, column: 8
                          System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 58, column: 8
                          if(zoneOcc7.getprestatus()){//sysj\ACS_Controller.sysj line: 60, column: 15
                            personArray_thread_1[0][2] = 7;//sysj\ACS_Controller.sysj line: 61, column: 8
                            System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 62, column: 8
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
                          if(zoneOcc7.getprestatus()){//sysj\ACS_Controller.sysj line: 60, column: 15
                            personArray_thread_1[0][2] = 7;//sysj\ACS_Controller.sysj line: 61, column: 8
                            System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 62, column: 8
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
                      }
                      else {
                        if(zoneOcc1.getprestatus()){//sysj\ACS_Controller.sysj line: 56, column: 15
                          personArray_thread_1[0][2] = 1;//sysj\ACS_Controller.sysj line: 57, column: 8
                          System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 58, column: 8
                          if(zoneOcc7.getprestatus()){//sysj\ACS_Controller.sysj line: 60, column: 15
                            personArray_thread_1[0][2] = 7;//sysj\ACS_Controller.sysj line: 61, column: 8
                            System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 62, column: 8
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
                          if(zoneOcc7.getprestatus()){//sysj\ACS_Controller.sysj line: 60, column: 15
                            personArray_thread_1[0][2] = 7;//sysj\ACS_Controller.sysj line: 61, column: 8
                            System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 62, column: 8
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
                      }
                    }
                  }
                
                case 1 : 
                  S273=1;
                  S273=2;
                  System.out.println(personArray_thread_1[0][1]);//sysj\ACS_Controller.sysj line: 72, column: 4
                  personArray_thread_1[0][1] = 1;//sysj\ACS_Controller.sysj line: 74, column: 6
                  unlock3.setPresent();//sysj\ACS_Controller.sysj line: 76, column: 7
                  currsigs.addElement(unlock3);
                  if(zoneOcc0.getprestatus()){//sysj\ACS_Controller.sysj line: 77, column: 15
                    personArray_thread_1[0][2] = 0;//sysj\ACS_Controller.sysj line: 78, column: 8
                    System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 79, column: 8
                    if(zoneOcc2.getprestatus()){//sysj\ACS_Controller.sysj line: 81, column: 15
                      personArray_thread_1[0][2] = 2;//sysj\ACS_Controller.sysj line: 82, column: 8
                      System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 83, column: 8
                      if(zoneOcc3.getprestatus()){//sysj\ACS_Controller.sysj line: 85, column: 15
                        personArray_thread_1[0][2] = 3;//sysj\ACS_Controller.sysj line: 86, column: 8
                        System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 87, column: 8
                        if(zoneOcc4.getprestatus()){//sysj\ACS_Controller.sysj line: 89, column: 15
                          personArray_thread_1[0][2] = 4;//sysj\ACS_Controller.sysj line: 90, column: 8
                          absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 91, column: 8
                          currsigs.addElement(absSuspend);
                          System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 92, column: 8
                          if(zoneOcc5.getprestatus()){//sysj\ACS_Controller.sysj line: 94, column: 15
                            personArray_thread_1[0][2] = 5;//sysj\ACS_Controller.sysj line: 95, column: 8
                            absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 96, column: 8
                            currsigs.addElement(absSuspend);
                            System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 97, column: 8
                            if(zoneOcc6.getprestatus()){//sysj\ACS_Controller.sysj line: 99, column: 15
                              personArray_thread_1[0][2] = 6;//sysj\ACS_Controller.sysj line: 100, column: 8
                              absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 101, column: 8
                              currsigs.addElement(absSuspend);
                              System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 102, column: 8
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
                            if(zoneOcc6.getprestatus()){//sysj\ACS_Controller.sysj line: 99, column: 15
                              personArray_thread_1[0][2] = 6;//sysj\ACS_Controller.sysj line: 100, column: 8
                              absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 101, column: 8
                              currsigs.addElement(absSuspend);
                              System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 102, column: 8
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
                        }
                        else {
                          if(zoneOcc5.getprestatus()){//sysj\ACS_Controller.sysj line: 94, column: 15
                            personArray_thread_1[0][2] = 5;//sysj\ACS_Controller.sysj line: 95, column: 8
                            absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 96, column: 8
                            currsigs.addElement(absSuspend);
                            System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 97, column: 8
                            if(zoneOcc6.getprestatus()){//sysj\ACS_Controller.sysj line: 99, column: 15
                              personArray_thread_1[0][2] = 6;//sysj\ACS_Controller.sysj line: 100, column: 8
                              absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 101, column: 8
                              currsigs.addElement(absSuspend);
                              System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 102, column: 8
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
                            if(zoneOcc6.getprestatus()){//sysj\ACS_Controller.sysj line: 99, column: 15
                              personArray_thread_1[0][2] = 6;//sysj\ACS_Controller.sysj line: 100, column: 8
                              absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 101, column: 8
                              currsigs.addElement(absSuspend);
                              System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 102, column: 8
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
                        }
                      }
                      else {
                        if(zoneOcc4.getprestatus()){//sysj\ACS_Controller.sysj line: 89, column: 15
                          personArray_thread_1[0][2] = 4;//sysj\ACS_Controller.sysj line: 90, column: 8
                          absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 91, column: 8
                          currsigs.addElement(absSuspend);
                          System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 92, column: 8
                          if(zoneOcc5.getprestatus()){//sysj\ACS_Controller.sysj line: 94, column: 15
                            personArray_thread_1[0][2] = 5;//sysj\ACS_Controller.sysj line: 95, column: 8
                            absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 96, column: 8
                            currsigs.addElement(absSuspend);
                            System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 97, column: 8
                            if(zoneOcc6.getprestatus()){//sysj\ACS_Controller.sysj line: 99, column: 15
                              personArray_thread_1[0][2] = 6;//sysj\ACS_Controller.sysj line: 100, column: 8
                              absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 101, column: 8
                              currsigs.addElement(absSuspend);
                              System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 102, column: 8
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
                            if(zoneOcc6.getprestatus()){//sysj\ACS_Controller.sysj line: 99, column: 15
                              personArray_thread_1[0][2] = 6;//sysj\ACS_Controller.sysj line: 100, column: 8
                              absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 101, column: 8
                              currsigs.addElement(absSuspend);
                              System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 102, column: 8
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
                        }
                        else {
                          if(zoneOcc5.getprestatus()){//sysj\ACS_Controller.sysj line: 94, column: 15
                            personArray_thread_1[0][2] = 5;//sysj\ACS_Controller.sysj line: 95, column: 8
                            absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 96, column: 8
                            currsigs.addElement(absSuspend);
                            System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 97, column: 8
                            if(zoneOcc6.getprestatus()){//sysj\ACS_Controller.sysj line: 99, column: 15
                              personArray_thread_1[0][2] = 6;//sysj\ACS_Controller.sysj line: 100, column: 8
                              absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 101, column: 8
                              currsigs.addElement(absSuspend);
                              System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 102, column: 8
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
                            if(zoneOcc6.getprestatus()){//sysj\ACS_Controller.sysj line: 99, column: 15
                              personArray_thread_1[0][2] = 6;//sysj\ACS_Controller.sysj line: 100, column: 8
                              absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 101, column: 8
                              currsigs.addElement(absSuspend);
                              System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 102, column: 8
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
                        }
                      }
                    }
                    else {
                      if(zoneOcc3.getprestatus()){//sysj\ACS_Controller.sysj line: 85, column: 15
                        personArray_thread_1[0][2] = 3;//sysj\ACS_Controller.sysj line: 86, column: 8
                        System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 87, column: 8
                        if(zoneOcc4.getprestatus()){//sysj\ACS_Controller.sysj line: 89, column: 15
                          personArray_thread_1[0][2] = 4;//sysj\ACS_Controller.sysj line: 90, column: 8
                          absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 91, column: 8
                          currsigs.addElement(absSuspend);
                          System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 92, column: 8
                          if(zoneOcc5.getprestatus()){//sysj\ACS_Controller.sysj line: 94, column: 15
                            personArray_thread_1[0][2] = 5;//sysj\ACS_Controller.sysj line: 95, column: 8
                            absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 96, column: 8
                            currsigs.addElement(absSuspend);
                            System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 97, column: 8
                            if(zoneOcc6.getprestatus()){//sysj\ACS_Controller.sysj line: 99, column: 15
                              personArray_thread_1[0][2] = 6;//sysj\ACS_Controller.sysj line: 100, column: 8
                              absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 101, column: 8
                              currsigs.addElement(absSuspend);
                              System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 102, column: 8
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
                            if(zoneOcc6.getprestatus()){//sysj\ACS_Controller.sysj line: 99, column: 15
                              personArray_thread_1[0][2] = 6;//sysj\ACS_Controller.sysj line: 100, column: 8
                              absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 101, column: 8
                              currsigs.addElement(absSuspend);
                              System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 102, column: 8
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
                        }
                        else {
                          if(zoneOcc5.getprestatus()){//sysj\ACS_Controller.sysj line: 94, column: 15
                            personArray_thread_1[0][2] = 5;//sysj\ACS_Controller.sysj line: 95, column: 8
                            absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 96, column: 8
                            currsigs.addElement(absSuspend);
                            System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 97, column: 8
                            if(zoneOcc6.getprestatus()){//sysj\ACS_Controller.sysj line: 99, column: 15
                              personArray_thread_1[0][2] = 6;//sysj\ACS_Controller.sysj line: 100, column: 8
                              absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 101, column: 8
                              currsigs.addElement(absSuspend);
                              System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 102, column: 8
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
                            if(zoneOcc6.getprestatus()){//sysj\ACS_Controller.sysj line: 99, column: 15
                              personArray_thread_1[0][2] = 6;//sysj\ACS_Controller.sysj line: 100, column: 8
                              absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 101, column: 8
                              currsigs.addElement(absSuspend);
                              System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 102, column: 8
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
                        }
                      }
                      else {
                        if(zoneOcc4.getprestatus()){//sysj\ACS_Controller.sysj line: 89, column: 15
                          personArray_thread_1[0][2] = 4;//sysj\ACS_Controller.sysj line: 90, column: 8
                          absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 91, column: 8
                          currsigs.addElement(absSuspend);
                          System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 92, column: 8
                          if(zoneOcc5.getprestatus()){//sysj\ACS_Controller.sysj line: 94, column: 15
                            personArray_thread_1[0][2] = 5;//sysj\ACS_Controller.sysj line: 95, column: 8
                            absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 96, column: 8
                            currsigs.addElement(absSuspend);
                            System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 97, column: 8
                            if(zoneOcc6.getprestatus()){//sysj\ACS_Controller.sysj line: 99, column: 15
                              personArray_thread_1[0][2] = 6;//sysj\ACS_Controller.sysj line: 100, column: 8
                              absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 101, column: 8
                              currsigs.addElement(absSuspend);
                              System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 102, column: 8
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
                            if(zoneOcc6.getprestatus()){//sysj\ACS_Controller.sysj line: 99, column: 15
                              personArray_thread_1[0][2] = 6;//sysj\ACS_Controller.sysj line: 100, column: 8
                              absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 101, column: 8
                              currsigs.addElement(absSuspend);
                              System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 102, column: 8
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
                        }
                        else {
                          if(zoneOcc5.getprestatus()){//sysj\ACS_Controller.sysj line: 94, column: 15
                            personArray_thread_1[0][2] = 5;//sysj\ACS_Controller.sysj line: 95, column: 8
                            absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 96, column: 8
                            currsigs.addElement(absSuspend);
                            System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 97, column: 8
                            if(zoneOcc6.getprestatus()){//sysj\ACS_Controller.sysj line: 99, column: 15
                              personArray_thread_1[0][2] = 6;//sysj\ACS_Controller.sysj line: 100, column: 8
                              absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 101, column: 8
                              currsigs.addElement(absSuspend);
                              System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 102, column: 8
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
                            if(zoneOcc6.getprestatus()){//sysj\ACS_Controller.sysj line: 99, column: 15
                              personArray_thread_1[0][2] = 6;//sysj\ACS_Controller.sysj line: 100, column: 8
                              absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 101, column: 8
                              currsigs.addElement(absSuspend);
                              System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 102, column: 8
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
                        }
                      }
                    }
                  }
                  else {
                    if(zoneOcc2.getprestatus()){//sysj\ACS_Controller.sysj line: 81, column: 15
                      personArray_thread_1[0][2] = 2;//sysj\ACS_Controller.sysj line: 82, column: 8
                      System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 83, column: 8
                      if(zoneOcc3.getprestatus()){//sysj\ACS_Controller.sysj line: 85, column: 15
                        personArray_thread_1[0][2] = 3;//sysj\ACS_Controller.sysj line: 86, column: 8
                        System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 87, column: 8
                        if(zoneOcc4.getprestatus()){//sysj\ACS_Controller.sysj line: 89, column: 15
                          personArray_thread_1[0][2] = 4;//sysj\ACS_Controller.sysj line: 90, column: 8
                          absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 91, column: 8
                          currsigs.addElement(absSuspend);
                          System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 92, column: 8
                          if(zoneOcc5.getprestatus()){//sysj\ACS_Controller.sysj line: 94, column: 15
                            personArray_thread_1[0][2] = 5;//sysj\ACS_Controller.sysj line: 95, column: 8
                            absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 96, column: 8
                            currsigs.addElement(absSuspend);
                            System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 97, column: 8
                            if(zoneOcc6.getprestatus()){//sysj\ACS_Controller.sysj line: 99, column: 15
                              personArray_thread_1[0][2] = 6;//sysj\ACS_Controller.sysj line: 100, column: 8
                              absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 101, column: 8
                              currsigs.addElement(absSuspend);
                              System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 102, column: 8
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
                            if(zoneOcc6.getprestatus()){//sysj\ACS_Controller.sysj line: 99, column: 15
                              personArray_thread_1[0][2] = 6;//sysj\ACS_Controller.sysj line: 100, column: 8
                              absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 101, column: 8
                              currsigs.addElement(absSuspend);
                              System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 102, column: 8
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
                        }
                        else {
                          if(zoneOcc5.getprestatus()){//sysj\ACS_Controller.sysj line: 94, column: 15
                            personArray_thread_1[0][2] = 5;//sysj\ACS_Controller.sysj line: 95, column: 8
                            absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 96, column: 8
                            currsigs.addElement(absSuspend);
                            System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 97, column: 8
                            if(zoneOcc6.getprestatus()){//sysj\ACS_Controller.sysj line: 99, column: 15
                              personArray_thread_1[0][2] = 6;//sysj\ACS_Controller.sysj line: 100, column: 8
                              absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 101, column: 8
                              currsigs.addElement(absSuspend);
                              System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 102, column: 8
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
                            if(zoneOcc6.getprestatus()){//sysj\ACS_Controller.sysj line: 99, column: 15
                              personArray_thread_1[0][2] = 6;//sysj\ACS_Controller.sysj line: 100, column: 8
                              absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 101, column: 8
                              currsigs.addElement(absSuspend);
                              System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 102, column: 8
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
                        }
                      }
                      else {
                        if(zoneOcc4.getprestatus()){//sysj\ACS_Controller.sysj line: 89, column: 15
                          personArray_thread_1[0][2] = 4;//sysj\ACS_Controller.sysj line: 90, column: 8
                          absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 91, column: 8
                          currsigs.addElement(absSuspend);
                          System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 92, column: 8
                          if(zoneOcc5.getprestatus()){//sysj\ACS_Controller.sysj line: 94, column: 15
                            personArray_thread_1[0][2] = 5;//sysj\ACS_Controller.sysj line: 95, column: 8
                            absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 96, column: 8
                            currsigs.addElement(absSuspend);
                            System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 97, column: 8
                            if(zoneOcc6.getprestatus()){//sysj\ACS_Controller.sysj line: 99, column: 15
                              personArray_thread_1[0][2] = 6;//sysj\ACS_Controller.sysj line: 100, column: 8
                              absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 101, column: 8
                              currsigs.addElement(absSuspend);
                              System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 102, column: 8
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
                            if(zoneOcc6.getprestatus()){//sysj\ACS_Controller.sysj line: 99, column: 15
                              personArray_thread_1[0][2] = 6;//sysj\ACS_Controller.sysj line: 100, column: 8
                              absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 101, column: 8
                              currsigs.addElement(absSuspend);
                              System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 102, column: 8
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
                        }
                        else {
                          if(zoneOcc5.getprestatus()){//sysj\ACS_Controller.sysj line: 94, column: 15
                            personArray_thread_1[0][2] = 5;//sysj\ACS_Controller.sysj line: 95, column: 8
                            absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 96, column: 8
                            currsigs.addElement(absSuspend);
                            System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 97, column: 8
                            if(zoneOcc6.getprestatus()){//sysj\ACS_Controller.sysj line: 99, column: 15
                              personArray_thread_1[0][2] = 6;//sysj\ACS_Controller.sysj line: 100, column: 8
                              absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 101, column: 8
                              currsigs.addElement(absSuspend);
                              System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 102, column: 8
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
                            if(zoneOcc6.getprestatus()){//sysj\ACS_Controller.sysj line: 99, column: 15
                              personArray_thread_1[0][2] = 6;//sysj\ACS_Controller.sysj line: 100, column: 8
                              absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 101, column: 8
                              currsigs.addElement(absSuspend);
                              System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 102, column: 8
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
                        }
                      }
                    }
                    else {
                      if(zoneOcc3.getprestatus()){//sysj\ACS_Controller.sysj line: 85, column: 15
                        personArray_thread_1[0][2] = 3;//sysj\ACS_Controller.sysj line: 86, column: 8
                        System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 87, column: 8
                        if(zoneOcc4.getprestatus()){//sysj\ACS_Controller.sysj line: 89, column: 15
                          personArray_thread_1[0][2] = 4;//sysj\ACS_Controller.sysj line: 90, column: 8
                          absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 91, column: 8
                          currsigs.addElement(absSuspend);
                          System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 92, column: 8
                          if(zoneOcc5.getprestatus()){//sysj\ACS_Controller.sysj line: 94, column: 15
                            personArray_thread_1[0][2] = 5;//sysj\ACS_Controller.sysj line: 95, column: 8
                            absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 96, column: 8
                            currsigs.addElement(absSuspend);
                            System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 97, column: 8
                            if(zoneOcc6.getprestatus()){//sysj\ACS_Controller.sysj line: 99, column: 15
                              personArray_thread_1[0][2] = 6;//sysj\ACS_Controller.sysj line: 100, column: 8
                              absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 101, column: 8
                              currsigs.addElement(absSuspend);
                              System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 102, column: 8
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
                            if(zoneOcc6.getprestatus()){//sysj\ACS_Controller.sysj line: 99, column: 15
                              personArray_thread_1[0][2] = 6;//sysj\ACS_Controller.sysj line: 100, column: 8
                              absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 101, column: 8
                              currsigs.addElement(absSuspend);
                              System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 102, column: 8
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
                        }
                        else {
                          if(zoneOcc5.getprestatus()){//sysj\ACS_Controller.sysj line: 94, column: 15
                            personArray_thread_1[0][2] = 5;//sysj\ACS_Controller.sysj line: 95, column: 8
                            absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 96, column: 8
                            currsigs.addElement(absSuspend);
                            System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 97, column: 8
                            if(zoneOcc6.getprestatus()){//sysj\ACS_Controller.sysj line: 99, column: 15
                              personArray_thread_1[0][2] = 6;//sysj\ACS_Controller.sysj line: 100, column: 8
                              absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 101, column: 8
                              currsigs.addElement(absSuspend);
                              System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 102, column: 8
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
                            if(zoneOcc6.getprestatus()){//sysj\ACS_Controller.sysj line: 99, column: 15
                              personArray_thread_1[0][2] = 6;//sysj\ACS_Controller.sysj line: 100, column: 8
                              absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 101, column: 8
                              currsigs.addElement(absSuspend);
                              System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 102, column: 8
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
                        }
                      }
                      else {
                        if(zoneOcc4.getprestatus()){//sysj\ACS_Controller.sysj line: 89, column: 15
                          personArray_thread_1[0][2] = 4;//sysj\ACS_Controller.sysj line: 90, column: 8
                          absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 91, column: 8
                          currsigs.addElement(absSuspend);
                          System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 92, column: 8
                          if(zoneOcc5.getprestatus()){//sysj\ACS_Controller.sysj line: 94, column: 15
                            personArray_thread_1[0][2] = 5;//sysj\ACS_Controller.sysj line: 95, column: 8
                            absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 96, column: 8
                            currsigs.addElement(absSuspend);
                            System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 97, column: 8
                            if(zoneOcc6.getprestatus()){//sysj\ACS_Controller.sysj line: 99, column: 15
                              personArray_thread_1[0][2] = 6;//sysj\ACS_Controller.sysj line: 100, column: 8
                              absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 101, column: 8
                              currsigs.addElement(absSuspend);
                              System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 102, column: 8
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
                            if(zoneOcc6.getprestatus()){//sysj\ACS_Controller.sysj line: 99, column: 15
                              personArray_thread_1[0][2] = 6;//sysj\ACS_Controller.sysj line: 100, column: 8
                              absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 101, column: 8
                              currsigs.addElement(absSuspend);
                              System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 102, column: 8
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
                        }
                        else {
                          if(zoneOcc5.getprestatus()){//sysj\ACS_Controller.sysj line: 94, column: 15
                            personArray_thread_1[0][2] = 5;//sysj\ACS_Controller.sysj line: 95, column: 8
                            absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 96, column: 8
                            currsigs.addElement(absSuspend);
                            System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 97, column: 8
                            if(zoneOcc6.getprestatus()){//sysj\ACS_Controller.sysj line: 99, column: 15
                              personArray_thread_1[0][2] = 6;//sysj\ACS_Controller.sysj line: 100, column: 8
                              absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 101, column: 8
                              currsigs.addElement(absSuspend);
                              System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 102, column: 8
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
                            if(zoneOcc6.getprestatus()){//sysj\ACS_Controller.sysj line: 99, column: 15
                              personArray_thread_1[0][2] = 6;//sysj\ACS_Controller.sysj line: 100, column: 8
                              absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 101, column: 8
                              currsigs.addElement(absSuspend);
                              System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 102, column: 8
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
                        }
                      }
                    }
                  }
                
                case 2 : 
                  if(person1accessOffice.getprestatus()){//sysj\ACS_Controller.sysj line: 71, column: 9
                    System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 45, column: 3
                    S273=0;
                    personArray_thread_1[0][1] = 0;//sysj\ACS_Controller.sysj line: 49, column: 6
                    unlock1.setPresent();//sysj\ACS_Controller.sysj line: 51, column: 7
                    currsigs.addElement(unlock1);
                    if(zoneOcc0.getprestatus()){//sysj\ACS_Controller.sysj line: 52, column: 15
                      personArray_thread_1[0][2] = 0;//sysj\ACS_Controller.sysj line: 53, column: 8
                      System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 54, column: 8
                      if(zoneOcc1.getprestatus()){//sysj\ACS_Controller.sysj line: 56, column: 15
                        personArray_thread_1[0][2] = 1;//sysj\ACS_Controller.sysj line: 57, column: 8
                        System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 58, column: 8
                        if(zoneOcc7.getprestatus()){//sysj\ACS_Controller.sysj line: 60, column: 15
                          personArray_thread_1[0][2] = 7;//sysj\ACS_Controller.sysj line: 61, column: 8
                          System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 62, column: 8
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
                        if(zoneOcc7.getprestatus()){//sysj\ACS_Controller.sysj line: 60, column: 15
                          personArray_thread_1[0][2] = 7;//sysj\ACS_Controller.sysj line: 61, column: 8
                          System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 62, column: 8
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
                    }
                    else {
                      if(zoneOcc1.getprestatus()){//sysj\ACS_Controller.sysj line: 56, column: 15
                        personArray_thread_1[0][2] = 1;//sysj\ACS_Controller.sysj line: 57, column: 8
                        System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 58, column: 8
                        if(zoneOcc7.getprestatus()){//sysj\ACS_Controller.sysj line: 60, column: 15
                          personArray_thread_1[0][2] = 7;//sysj\ACS_Controller.sysj line: 61, column: 8
                          System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 62, column: 8
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
                        if(zoneOcc7.getprestatus()){//sysj\ACS_Controller.sysj line: 60, column: 15
                          personArray_thread_1[0][2] = 7;//sysj\ACS_Controller.sysj line: 61, column: 8
                          System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 62, column: 8
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
                    }
                  }
                  else {
                    if(person1accessOffice.getprestatus()){//sysj\ACS_Controller.sysj line: 73, column: 11
                      personArray_thread_1[0][1] = 0;//sysj\ACS_Controller.sysj line: 107, column: 5
                      System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 45, column: 3
                      S273=0;
                      personArray_thread_1[0][1] = 0;//sysj\ACS_Controller.sysj line: 49, column: 6
                      unlock1.setPresent();//sysj\ACS_Controller.sysj line: 51, column: 7
                      currsigs.addElement(unlock1);
                      if(zoneOcc0.getprestatus()){//sysj\ACS_Controller.sysj line: 52, column: 15
                        personArray_thread_1[0][2] = 0;//sysj\ACS_Controller.sysj line: 53, column: 8
                        System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 54, column: 8
                        if(zoneOcc1.getprestatus()){//sysj\ACS_Controller.sysj line: 56, column: 15
                          personArray_thread_1[0][2] = 1;//sysj\ACS_Controller.sysj line: 57, column: 8
                          System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 58, column: 8
                          if(zoneOcc7.getprestatus()){//sysj\ACS_Controller.sysj line: 60, column: 15
                            personArray_thread_1[0][2] = 7;//sysj\ACS_Controller.sysj line: 61, column: 8
                            System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 62, column: 8
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
                          if(zoneOcc7.getprestatus()){//sysj\ACS_Controller.sysj line: 60, column: 15
                            personArray_thread_1[0][2] = 7;//sysj\ACS_Controller.sysj line: 61, column: 8
                            System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 62, column: 8
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
                      }
                      else {
                        if(zoneOcc1.getprestatus()){//sysj\ACS_Controller.sysj line: 56, column: 15
                          personArray_thread_1[0][2] = 1;//sysj\ACS_Controller.sysj line: 57, column: 8
                          System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 58, column: 8
                          if(zoneOcc7.getprestatus()){//sysj\ACS_Controller.sysj line: 60, column: 15
                            personArray_thread_1[0][2] = 7;//sysj\ACS_Controller.sysj line: 61, column: 8
                            System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 62, column: 8
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
                          if(zoneOcc7.getprestatus()){//sysj\ACS_Controller.sysj line: 60, column: 15
                            personArray_thread_1[0][2] = 7;//sysj\ACS_Controller.sysj line: 61, column: 8
                            System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 62, column: 8
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
                      }
                    }
                    else {
                      unlock3.setPresent();//sysj\ACS_Controller.sysj line: 76, column: 7
                      currsigs.addElement(unlock3);
                      if(zoneOcc0.getprestatus()){//sysj\ACS_Controller.sysj line: 77, column: 15
                        personArray_thread_1[0][2] = 0;//sysj\ACS_Controller.sysj line: 78, column: 8
                        System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 79, column: 8
                        if(zoneOcc2.getprestatus()){//sysj\ACS_Controller.sysj line: 81, column: 15
                          personArray_thread_1[0][2] = 2;//sysj\ACS_Controller.sysj line: 82, column: 8
                          System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 83, column: 8
                          if(zoneOcc3.getprestatus()){//sysj\ACS_Controller.sysj line: 85, column: 15
                            personArray_thread_1[0][2] = 3;//sysj\ACS_Controller.sysj line: 86, column: 8
                            System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 87, column: 8
                            if(zoneOcc4.getprestatus()){//sysj\ACS_Controller.sysj line: 89, column: 15
                              personArray_thread_1[0][2] = 4;//sysj\ACS_Controller.sysj line: 90, column: 8
                              absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 91, column: 8
                              currsigs.addElement(absSuspend);
                              System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 92, column: 8
                              if(zoneOcc5.getprestatus()){//sysj\ACS_Controller.sysj line: 94, column: 15
                                personArray_thread_1[0][2] = 5;//sysj\ACS_Controller.sysj line: 95, column: 8
                                absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 96, column: 8
                                currsigs.addElement(absSuspend);
                                System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 97, column: 8
                                if(zoneOcc6.getprestatus()){//sysj\ACS_Controller.sysj line: 99, column: 15
                                  personArray_thread_1[0][2] = 6;//sysj\ACS_Controller.sysj line: 100, column: 8
                                  absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 101, column: 8
                                  currsigs.addElement(absSuspend);
                                  System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 102, column: 8
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
                                if(zoneOcc6.getprestatus()){//sysj\ACS_Controller.sysj line: 99, column: 15
                                  personArray_thread_1[0][2] = 6;//sysj\ACS_Controller.sysj line: 100, column: 8
                                  absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 101, column: 8
                                  currsigs.addElement(absSuspend);
                                  System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 102, column: 8
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
                            }
                            else {
                              if(zoneOcc5.getprestatus()){//sysj\ACS_Controller.sysj line: 94, column: 15
                                personArray_thread_1[0][2] = 5;//sysj\ACS_Controller.sysj line: 95, column: 8
                                absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 96, column: 8
                                currsigs.addElement(absSuspend);
                                System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 97, column: 8
                                if(zoneOcc6.getprestatus()){//sysj\ACS_Controller.sysj line: 99, column: 15
                                  personArray_thread_1[0][2] = 6;//sysj\ACS_Controller.sysj line: 100, column: 8
                                  absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 101, column: 8
                                  currsigs.addElement(absSuspend);
                                  System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 102, column: 8
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
                                if(zoneOcc6.getprestatus()){//sysj\ACS_Controller.sysj line: 99, column: 15
                                  personArray_thread_1[0][2] = 6;//sysj\ACS_Controller.sysj line: 100, column: 8
                                  absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 101, column: 8
                                  currsigs.addElement(absSuspend);
                                  System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 102, column: 8
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
                            }
                          }
                          else {
                            if(zoneOcc4.getprestatus()){//sysj\ACS_Controller.sysj line: 89, column: 15
                              personArray_thread_1[0][2] = 4;//sysj\ACS_Controller.sysj line: 90, column: 8
                              absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 91, column: 8
                              currsigs.addElement(absSuspend);
                              System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 92, column: 8
                              if(zoneOcc5.getprestatus()){//sysj\ACS_Controller.sysj line: 94, column: 15
                                personArray_thread_1[0][2] = 5;//sysj\ACS_Controller.sysj line: 95, column: 8
                                absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 96, column: 8
                                currsigs.addElement(absSuspend);
                                System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 97, column: 8
                                if(zoneOcc6.getprestatus()){//sysj\ACS_Controller.sysj line: 99, column: 15
                                  personArray_thread_1[0][2] = 6;//sysj\ACS_Controller.sysj line: 100, column: 8
                                  absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 101, column: 8
                                  currsigs.addElement(absSuspend);
                                  System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 102, column: 8
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
                                if(zoneOcc6.getprestatus()){//sysj\ACS_Controller.sysj line: 99, column: 15
                                  personArray_thread_1[0][2] = 6;//sysj\ACS_Controller.sysj line: 100, column: 8
                                  absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 101, column: 8
                                  currsigs.addElement(absSuspend);
                                  System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 102, column: 8
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
                            }
                            else {
                              if(zoneOcc5.getprestatus()){//sysj\ACS_Controller.sysj line: 94, column: 15
                                personArray_thread_1[0][2] = 5;//sysj\ACS_Controller.sysj line: 95, column: 8
                                absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 96, column: 8
                                currsigs.addElement(absSuspend);
                                System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 97, column: 8
                                if(zoneOcc6.getprestatus()){//sysj\ACS_Controller.sysj line: 99, column: 15
                                  personArray_thread_1[0][2] = 6;//sysj\ACS_Controller.sysj line: 100, column: 8
                                  absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 101, column: 8
                                  currsigs.addElement(absSuspend);
                                  System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 102, column: 8
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
                                if(zoneOcc6.getprestatus()){//sysj\ACS_Controller.sysj line: 99, column: 15
                                  personArray_thread_1[0][2] = 6;//sysj\ACS_Controller.sysj line: 100, column: 8
                                  absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 101, column: 8
                                  currsigs.addElement(absSuspend);
                                  System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 102, column: 8
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
                            }
                          }
                        }
                        else {
                          if(zoneOcc3.getprestatus()){//sysj\ACS_Controller.sysj line: 85, column: 15
                            personArray_thread_1[0][2] = 3;//sysj\ACS_Controller.sysj line: 86, column: 8
                            System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 87, column: 8
                            if(zoneOcc4.getprestatus()){//sysj\ACS_Controller.sysj line: 89, column: 15
                              personArray_thread_1[0][2] = 4;//sysj\ACS_Controller.sysj line: 90, column: 8
                              absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 91, column: 8
                              currsigs.addElement(absSuspend);
                              System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 92, column: 8
                              if(zoneOcc5.getprestatus()){//sysj\ACS_Controller.sysj line: 94, column: 15
                                personArray_thread_1[0][2] = 5;//sysj\ACS_Controller.sysj line: 95, column: 8
                                absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 96, column: 8
                                currsigs.addElement(absSuspend);
                                System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 97, column: 8
                                if(zoneOcc6.getprestatus()){//sysj\ACS_Controller.sysj line: 99, column: 15
                                  personArray_thread_1[0][2] = 6;//sysj\ACS_Controller.sysj line: 100, column: 8
                                  absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 101, column: 8
                                  currsigs.addElement(absSuspend);
                                  System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 102, column: 8
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
                                if(zoneOcc6.getprestatus()){//sysj\ACS_Controller.sysj line: 99, column: 15
                                  personArray_thread_1[0][2] = 6;//sysj\ACS_Controller.sysj line: 100, column: 8
                                  absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 101, column: 8
                                  currsigs.addElement(absSuspend);
                                  System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 102, column: 8
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
                            }
                            else {
                              if(zoneOcc5.getprestatus()){//sysj\ACS_Controller.sysj line: 94, column: 15
                                personArray_thread_1[0][2] = 5;//sysj\ACS_Controller.sysj line: 95, column: 8
                                absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 96, column: 8
                                currsigs.addElement(absSuspend);
                                System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 97, column: 8
                                if(zoneOcc6.getprestatus()){//sysj\ACS_Controller.sysj line: 99, column: 15
                                  personArray_thread_1[0][2] = 6;//sysj\ACS_Controller.sysj line: 100, column: 8
                                  absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 101, column: 8
                                  currsigs.addElement(absSuspend);
                                  System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 102, column: 8
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
                                if(zoneOcc6.getprestatus()){//sysj\ACS_Controller.sysj line: 99, column: 15
                                  personArray_thread_1[0][2] = 6;//sysj\ACS_Controller.sysj line: 100, column: 8
                                  absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 101, column: 8
                                  currsigs.addElement(absSuspend);
                                  System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 102, column: 8
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
                            }
                          }
                          else {
                            if(zoneOcc4.getprestatus()){//sysj\ACS_Controller.sysj line: 89, column: 15
                              personArray_thread_1[0][2] = 4;//sysj\ACS_Controller.sysj line: 90, column: 8
                              absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 91, column: 8
                              currsigs.addElement(absSuspend);
                              System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 92, column: 8
                              if(zoneOcc5.getprestatus()){//sysj\ACS_Controller.sysj line: 94, column: 15
                                personArray_thread_1[0][2] = 5;//sysj\ACS_Controller.sysj line: 95, column: 8
                                absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 96, column: 8
                                currsigs.addElement(absSuspend);
                                System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 97, column: 8
                                if(zoneOcc6.getprestatus()){//sysj\ACS_Controller.sysj line: 99, column: 15
                                  personArray_thread_1[0][2] = 6;//sysj\ACS_Controller.sysj line: 100, column: 8
                                  absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 101, column: 8
                                  currsigs.addElement(absSuspend);
                                  System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 102, column: 8
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
                                if(zoneOcc6.getprestatus()){//sysj\ACS_Controller.sysj line: 99, column: 15
                                  personArray_thread_1[0][2] = 6;//sysj\ACS_Controller.sysj line: 100, column: 8
                                  absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 101, column: 8
                                  currsigs.addElement(absSuspend);
                                  System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 102, column: 8
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
                            }
                            else {
                              if(zoneOcc5.getprestatus()){//sysj\ACS_Controller.sysj line: 94, column: 15
                                personArray_thread_1[0][2] = 5;//sysj\ACS_Controller.sysj line: 95, column: 8
                                absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 96, column: 8
                                currsigs.addElement(absSuspend);
                                System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 97, column: 8
                                if(zoneOcc6.getprestatus()){//sysj\ACS_Controller.sysj line: 99, column: 15
                                  personArray_thread_1[0][2] = 6;//sysj\ACS_Controller.sysj line: 100, column: 8
                                  absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 101, column: 8
                                  currsigs.addElement(absSuspend);
                                  System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 102, column: 8
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
                                if(zoneOcc6.getprestatus()){//sysj\ACS_Controller.sysj line: 99, column: 15
                                  personArray_thread_1[0][2] = 6;//sysj\ACS_Controller.sysj line: 100, column: 8
                                  absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 101, column: 8
                                  currsigs.addElement(absSuspend);
                                  System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 102, column: 8
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
                            }
                          }
                        }
                      }
                      else {
                        if(zoneOcc2.getprestatus()){//sysj\ACS_Controller.sysj line: 81, column: 15
                          personArray_thread_1[0][2] = 2;//sysj\ACS_Controller.sysj line: 82, column: 8
                          System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 83, column: 8
                          if(zoneOcc3.getprestatus()){//sysj\ACS_Controller.sysj line: 85, column: 15
                            personArray_thread_1[0][2] = 3;//sysj\ACS_Controller.sysj line: 86, column: 8
                            System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 87, column: 8
                            if(zoneOcc4.getprestatus()){//sysj\ACS_Controller.sysj line: 89, column: 15
                              personArray_thread_1[0][2] = 4;//sysj\ACS_Controller.sysj line: 90, column: 8
                              absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 91, column: 8
                              currsigs.addElement(absSuspend);
                              System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 92, column: 8
                              if(zoneOcc5.getprestatus()){//sysj\ACS_Controller.sysj line: 94, column: 15
                                personArray_thread_1[0][2] = 5;//sysj\ACS_Controller.sysj line: 95, column: 8
                                absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 96, column: 8
                                currsigs.addElement(absSuspend);
                                System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 97, column: 8
                                if(zoneOcc6.getprestatus()){//sysj\ACS_Controller.sysj line: 99, column: 15
                                  personArray_thread_1[0][2] = 6;//sysj\ACS_Controller.sysj line: 100, column: 8
                                  absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 101, column: 8
                                  currsigs.addElement(absSuspend);
                                  System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 102, column: 8
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
                                if(zoneOcc6.getprestatus()){//sysj\ACS_Controller.sysj line: 99, column: 15
                                  personArray_thread_1[0][2] = 6;//sysj\ACS_Controller.sysj line: 100, column: 8
                                  absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 101, column: 8
                                  currsigs.addElement(absSuspend);
                                  System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 102, column: 8
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
                            }
                            else {
                              if(zoneOcc5.getprestatus()){//sysj\ACS_Controller.sysj line: 94, column: 15
                                personArray_thread_1[0][2] = 5;//sysj\ACS_Controller.sysj line: 95, column: 8
                                absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 96, column: 8
                                currsigs.addElement(absSuspend);
                                System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 97, column: 8
                                if(zoneOcc6.getprestatus()){//sysj\ACS_Controller.sysj line: 99, column: 15
                                  personArray_thread_1[0][2] = 6;//sysj\ACS_Controller.sysj line: 100, column: 8
                                  absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 101, column: 8
                                  currsigs.addElement(absSuspend);
                                  System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 102, column: 8
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
                                if(zoneOcc6.getprestatus()){//sysj\ACS_Controller.sysj line: 99, column: 15
                                  personArray_thread_1[0][2] = 6;//sysj\ACS_Controller.sysj line: 100, column: 8
                                  absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 101, column: 8
                                  currsigs.addElement(absSuspend);
                                  System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 102, column: 8
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
                            }
                          }
                          else {
                            if(zoneOcc4.getprestatus()){//sysj\ACS_Controller.sysj line: 89, column: 15
                              personArray_thread_1[0][2] = 4;//sysj\ACS_Controller.sysj line: 90, column: 8
                              absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 91, column: 8
                              currsigs.addElement(absSuspend);
                              System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 92, column: 8
                              if(zoneOcc5.getprestatus()){//sysj\ACS_Controller.sysj line: 94, column: 15
                                personArray_thread_1[0][2] = 5;//sysj\ACS_Controller.sysj line: 95, column: 8
                                absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 96, column: 8
                                currsigs.addElement(absSuspend);
                                System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 97, column: 8
                                if(zoneOcc6.getprestatus()){//sysj\ACS_Controller.sysj line: 99, column: 15
                                  personArray_thread_1[0][2] = 6;//sysj\ACS_Controller.sysj line: 100, column: 8
                                  absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 101, column: 8
                                  currsigs.addElement(absSuspend);
                                  System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 102, column: 8
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
                                if(zoneOcc6.getprestatus()){//sysj\ACS_Controller.sysj line: 99, column: 15
                                  personArray_thread_1[0][2] = 6;//sysj\ACS_Controller.sysj line: 100, column: 8
                                  absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 101, column: 8
                                  currsigs.addElement(absSuspend);
                                  System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 102, column: 8
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
                            }
                            else {
                              if(zoneOcc5.getprestatus()){//sysj\ACS_Controller.sysj line: 94, column: 15
                                personArray_thread_1[0][2] = 5;//sysj\ACS_Controller.sysj line: 95, column: 8
                                absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 96, column: 8
                                currsigs.addElement(absSuspend);
                                System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 97, column: 8
                                if(zoneOcc6.getprestatus()){//sysj\ACS_Controller.sysj line: 99, column: 15
                                  personArray_thread_1[0][2] = 6;//sysj\ACS_Controller.sysj line: 100, column: 8
                                  absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 101, column: 8
                                  currsigs.addElement(absSuspend);
                                  System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 102, column: 8
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
                                if(zoneOcc6.getprestatus()){//sysj\ACS_Controller.sysj line: 99, column: 15
                                  personArray_thread_1[0][2] = 6;//sysj\ACS_Controller.sysj line: 100, column: 8
                                  absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 101, column: 8
                                  currsigs.addElement(absSuspend);
                                  System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 102, column: 8
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
                            }
                          }
                        }
                        else {
                          if(zoneOcc3.getprestatus()){//sysj\ACS_Controller.sysj line: 85, column: 15
                            personArray_thread_1[0][2] = 3;//sysj\ACS_Controller.sysj line: 86, column: 8
                            System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 87, column: 8
                            if(zoneOcc4.getprestatus()){//sysj\ACS_Controller.sysj line: 89, column: 15
                              personArray_thread_1[0][2] = 4;//sysj\ACS_Controller.sysj line: 90, column: 8
                              absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 91, column: 8
                              currsigs.addElement(absSuspend);
                              System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 92, column: 8
                              if(zoneOcc5.getprestatus()){//sysj\ACS_Controller.sysj line: 94, column: 15
                                personArray_thread_1[0][2] = 5;//sysj\ACS_Controller.sysj line: 95, column: 8
                                absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 96, column: 8
                                currsigs.addElement(absSuspend);
                                System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 97, column: 8
                                if(zoneOcc6.getprestatus()){//sysj\ACS_Controller.sysj line: 99, column: 15
                                  personArray_thread_1[0][2] = 6;//sysj\ACS_Controller.sysj line: 100, column: 8
                                  absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 101, column: 8
                                  currsigs.addElement(absSuspend);
                                  System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 102, column: 8
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
                                if(zoneOcc6.getprestatus()){//sysj\ACS_Controller.sysj line: 99, column: 15
                                  personArray_thread_1[0][2] = 6;//sysj\ACS_Controller.sysj line: 100, column: 8
                                  absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 101, column: 8
                                  currsigs.addElement(absSuspend);
                                  System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 102, column: 8
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
                            }
                            else {
                              if(zoneOcc5.getprestatus()){//sysj\ACS_Controller.sysj line: 94, column: 15
                                personArray_thread_1[0][2] = 5;//sysj\ACS_Controller.sysj line: 95, column: 8
                                absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 96, column: 8
                                currsigs.addElement(absSuspend);
                                System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 97, column: 8
                                if(zoneOcc6.getprestatus()){//sysj\ACS_Controller.sysj line: 99, column: 15
                                  personArray_thread_1[0][2] = 6;//sysj\ACS_Controller.sysj line: 100, column: 8
                                  absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 101, column: 8
                                  currsigs.addElement(absSuspend);
                                  System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 102, column: 8
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
                                if(zoneOcc6.getprestatus()){//sysj\ACS_Controller.sysj line: 99, column: 15
                                  personArray_thread_1[0][2] = 6;//sysj\ACS_Controller.sysj line: 100, column: 8
                                  absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 101, column: 8
                                  currsigs.addElement(absSuspend);
                                  System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 102, column: 8
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
                            }
                          }
                          else {
                            if(zoneOcc4.getprestatus()){//sysj\ACS_Controller.sysj line: 89, column: 15
                              personArray_thread_1[0][2] = 4;//sysj\ACS_Controller.sysj line: 90, column: 8
                              absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 91, column: 8
                              currsigs.addElement(absSuspend);
                              System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 92, column: 8
                              if(zoneOcc5.getprestatus()){//sysj\ACS_Controller.sysj line: 94, column: 15
                                personArray_thread_1[0][2] = 5;//sysj\ACS_Controller.sysj line: 95, column: 8
                                absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 96, column: 8
                                currsigs.addElement(absSuspend);
                                System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 97, column: 8
                                if(zoneOcc6.getprestatus()){//sysj\ACS_Controller.sysj line: 99, column: 15
                                  personArray_thread_1[0][2] = 6;//sysj\ACS_Controller.sysj line: 100, column: 8
                                  absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 101, column: 8
                                  currsigs.addElement(absSuspend);
                                  System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 102, column: 8
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
                                if(zoneOcc6.getprestatus()){//sysj\ACS_Controller.sysj line: 99, column: 15
                                  personArray_thread_1[0][2] = 6;//sysj\ACS_Controller.sysj line: 100, column: 8
                                  absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 101, column: 8
                                  currsigs.addElement(absSuspend);
                                  System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 102, column: 8
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
                            }
                            else {
                              if(zoneOcc5.getprestatus()){//sysj\ACS_Controller.sysj line: 94, column: 15
                                personArray_thread_1[0][2] = 5;//sysj\ACS_Controller.sysj line: 95, column: 8
                                absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 96, column: 8
                                currsigs.addElement(absSuspend);
                                System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 97, column: 8
                                if(zoneOcc6.getprestatus()){//sysj\ACS_Controller.sysj line: 99, column: 15
                                  personArray_thread_1[0][2] = 6;//sysj\ACS_Controller.sysj line: 100, column: 8
                                  absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 101, column: 8
                                  currsigs.addElement(absSuspend);
                                  System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 102, column: 8
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
                                if(zoneOcc6.getprestatus()){//sysj\ACS_Controller.sysj line: 99, column: 15
                                  personArray_thread_1[0][2] = 6;//sysj\ACS_Controller.sysj line: 100, column: 8
                                  absSuspend.setPresent();//sysj\ACS_Controller.sysj line: 101, column: 8
                                  currsigs.addElement(absSuspend);
                                  System.out.println(personArray_thread_1[0][2]);//sysj\ACS_Controller.sysj line: 102, column: 8
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
                            }
                          }
                        }
                      }
                    }
                  }
                
              }
              break;
            
            case 4 : 
              S0=4;
              S57757=0;
              active[1]=0;
              ends[1]=0;
              S57757=0;
              break RUN;
            
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
          zoneOcc0.gethook();
          zoneOcc1.gethook();
          zoneOcc2.gethook();
          zoneOcc3.gethook();
          zoneOcc4.gethook();
          zoneOcc5.gethook();
          zoneOcc6.gethook();
          zoneOcc7.gethook();
          person1accessOffice.gethook();
          person1accessManu.gethook();
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
      zoneOcc0.setpreclear();
      zoneOcc1.setpreclear();
      zoneOcc2.setpreclear();
      zoneOcc3.setpreclear();
      zoneOcc4.setpreclear();
      zoneOcc5.setpreclear();
      zoneOcc6.setpreclear();
      zoneOcc7.setpreclear();
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
      absResume.setpreclear();
      absSuspend.setpreclear();
      proxLaser.setpreclear();
      unlock1.setpreclear();
      unlock2.setpreclear();
      unlock3.setpreclear();
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
      dummyint = person1accessOffice.getStatus() ? person1accessOffice.setprepresent() : person1accessOffice.setpreclear();
      person1accessOffice.setpreval(person1accessOffice.getValue());
      person1accessOffice.setClear();
      dummyint = person1accessManu.getStatus() ? person1accessManu.setprepresent() : person1accessManu.setpreclear();
      person1accessManu.setpreval(person1accessManu.getValue());
      person1accessManu.setClear();
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
        zoneOcc0.gethook();
        zoneOcc1.gethook();
        zoneOcc2.gethook();
        zoneOcc3.gethook();
        zoneOcc4.gethook();
        zoneOcc5.gethook();
        zoneOcc6.gethook();
        zoneOcc7.gethook();
        person1accessOffice.gethook();
        person1accessManu.gethook();
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
