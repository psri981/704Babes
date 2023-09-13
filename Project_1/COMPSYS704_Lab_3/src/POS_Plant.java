import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import run.GUI;//sysj\plant.sysj line: 1, column: 1
import run.POS_GUI;//sysj\plant.sysj line: 2, column: 1
import run.ECS_GUI;//sysj\plant.sysj line: 3, column: 1
import run.ACS_GUI;//sysj\plant.sysj line: 4, column: 1

public class POS_Plant extends ClockDomain{
  public POS_Plant(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal orderStart = new Signal("orderStart", Signal.INPUT);
  public Signal liquidMix = new Signal("liquidMix", Signal.INPUT);
  public Signal bottleQuantity = new Signal("bottleQuantity", Signal.INPUT);
  public Signal orderDoneGUIFlag = new Signal("orderDoneGUIFlag", Signal.OUTPUT);
  public input_Channel orderDoneFlag_in = new input_Channel();
  public output_Channel liquidMixOutput_o = new output_Channel();
  public output_Channel bottleQuantityOutput_o = new output_Channel();
  private Integer y_thread_10;//sysj\plant.sysj line: 129, column: 5
  private String x_thread_10;//sysj\plant.sysj line: 130, column: 5
  private int S59674 = 1;
  private int S59263 = 1;
  private int S58991 = 1;
  private int S58857 = 1;
  private int S58864 = 1;
  private int S58859 = 1;
  private int S58908 = 1;
  private int S58903 = 1;
  
  private int[] ends = new int[65];
  private int[] tdone = new int[65];
  
  public void thread68312(int [] tdone, int [] ends){
        active[11]=0;
    ends[11]=0;
    tdone[11]=1;
  }

  public void thread68311(int [] tdone, int [] ends){
        switch(S59263){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S58991){
          case 0 : 
            switch(S58857){
              case 0 : 
                switch(S58864){
                  case 0 : 
                    if(!bottleQuantityOutput_o.isPartnerPresent() || bottleQuantityOutput_o.isPartnerPreempted()){//sysj\plant.sysj line: 135, column: 5
                      bottleQuantityOutput_o.setREQ(false);//sysj\plant.sysj line: 135, column: 5
                      S58864=1;
                      active[10]=1;
                      ends[10]=1;
                      tdone[10]=1;
                    }
                    else {
                      switch(S58859){
                        case 0 : 
                          if(bottleQuantityOutput_o.isACK()){//sysj\plant.sysj line: 135, column: 5
                            bottleQuantityOutput_o.setVal(y_thread_10);//sysj\plant.sysj line: 135, column: 5
                            S58859=1;
                            if(!bottleQuantityOutput_o.isACK()){//sysj\plant.sysj line: 135, column: 5
                              bottleQuantityOutput_o.setREQ(false);//sysj\plant.sysj line: 135, column: 5
                              ends[10]=2;
                              ;//sysj\plant.sysj line: 135, column: 5
                              S58857=1;
                              S58908=0;
                              if(!liquidMixOutput_o.isPartnerPresent() || liquidMixOutput_o.isPartnerPreempted()){//sysj\plant.sysj line: 137, column: 5
                                liquidMixOutput_o.setREQ(false);//sysj\plant.sysj line: 137, column: 5
                                S58908=1;
                                active[10]=1;
                                ends[10]=1;
                                tdone[10]=1;
                              }
                              else {
                                S58903=0;
                                if(liquidMixOutput_o.isACK()){//sysj\plant.sysj line: 137, column: 5
                                  liquidMixOutput_o.setVal(x_thread_10);//sysj\plant.sysj line: 137, column: 5
                                  S58903=1;
                                  if(!liquidMixOutput_o.isACK()){//sysj\plant.sysj line: 137, column: 5
                                    liquidMixOutput_o.setREQ(false);//sysj\plant.sysj line: 137, column: 5
                                    ends[10]=2;
                                    ;//sysj\plant.sysj line: 137, column: 5
                                    S58991=1;
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
                                else {
                                  active[10]=1;
                                  ends[10]=1;
                                  tdone[10]=1;
                                }
                              }
                            }
                            else {
                              active[10]=1;
                              ends[10]=1;
                              tdone[10]=1;
                            }
                          }
                          else {
                            active[10]=1;
                            ends[10]=1;
                            tdone[10]=1;
                          }
                          break;
                        
                        case 1 : 
                          if(!bottleQuantityOutput_o.isACK()){//sysj\plant.sysj line: 135, column: 5
                            bottleQuantityOutput_o.setREQ(false);//sysj\plant.sysj line: 135, column: 5
                            ends[10]=2;
                            ;//sysj\plant.sysj line: 135, column: 5
                            S58857=1;
                            S58908=0;
                            if(!liquidMixOutput_o.isPartnerPresent() || liquidMixOutput_o.isPartnerPreempted()){//sysj\plant.sysj line: 137, column: 5
                              liquidMixOutput_o.setREQ(false);//sysj\plant.sysj line: 137, column: 5
                              S58908=1;
                              active[10]=1;
                              ends[10]=1;
                              tdone[10]=1;
                            }
                            else {
                              S58903=0;
                              if(liquidMixOutput_o.isACK()){//sysj\plant.sysj line: 137, column: 5
                                liquidMixOutput_o.setVal(x_thread_10);//sysj\plant.sysj line: 137, column: 5
                                S58903=1;
                                if(!liquidMixOutput_o.isACK()){//sysj\plant.sysj line: 137, column: 5
                                  liquidMixOutput_o.setREQ(false);//sysj\plant.sysj line: 137, column: 5
                                  ends[10]=2;
                                  ;//sysj\plant.sysj line: 137, column: 5
                                  S58991=1;
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
                              else {
                                active[10]=1;
                                ends[10]=1;
                                tdone[10]=1;
                              }
                            }
                          }
                          else {
                            active[10]=1;
                            ends[10]=1;
                            tdone[10]=1;
                          }
                          break;
                        
                      }
                    }
                    break;
                  
                  case 1 : 
                    S58864=1;
                    S58864=0;
                    if(!bottleQuantityOutput_o.isPartnerPresent() || bottleQuantityOutput_o.isPartnerPreempted()){//sysj\plant.sysj line: 135, column: 5
                      bottleQuantityOutput_o.setREQ(false);//sysj\plant.sysj line: 135, column: 5
                      S58864=1;
                      active[10]=1;
                      ends[10]=1;
                      tdone[10]=1;
                    }
                    else {
                      S58859=0;
                      if(bottleQuantityOutput_o.isACK()){//sysj\plant.sysj line: 135, column: 5
                        bottleQuantityOutput_o.setVal(y_thread_10);//sysj\plant.sysj line: 135, column: 5
                        S58859=1;
                        if(!bottleQuantityOutput_o.isACK()){//sysj\plant.sysj line: 135, column: 5
                          bottleQuantityOutput_o.setREQ(false);//sysj\plant.sysj line: 135, column: 5
                          ends[10]=2;
                          ;//sysj\plant.sysj line: 135, column: 5
                          S58857=1;
                          S58908=0;
                          if(!liquidMixOutput_o.isPartnerPresent() || liquidMixOutput_o.isPartnerPreempted()){//sysj\plant.sysj line: 137, column: 5
                            liquidMixOutput_o.setREQ(false);//sysj\plant.sysj line: 137, column: 5
                            S58908=1;
                            active[10]=1;
                            ends[10]=1;
                            tdone[10]=1;
                          }
                          else {
                            S58903=0;
                            if(liquidMixOutput_o.isACK()){//sysj\plant.sysj line: 137, column: 5
                              liquidMixOutput_o.setVal(x_thread_10);//sysj\plant.sysj line: 137, column: 5
                              S58903=1;
                              if(!liquidMixOutput_o.isACK()){//sysj\plant.sysj line: 137, column: 5
                                liquidMixOutput_o.setREQ(false);//sysj\plant.sysj line: 137, column: 5
                                ends[10]=2;
                                ;//sysj\plant.sysj line: 137, column: 5
                                S58991=1;
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
                            else {
                              active[10]=1;
                              ends[10]=1;
                              tdone[10]=1;
                            }
                          }
                        }
                        else {
                          active[10]=1;
                          ends[10]=1;
                          tdone[10]=1;
                        }
                      }
                      else {
                        active[10]=1;
                        ends[10]=1;
                        tdone[10]=1;
                      }
                    }
                    break;
                  
                }
                break;
              
              case 1 : 
                switch(S58908){
                  case 0 : 
                    if(!liquidMixOutput_o.isPartnerPresent() || liquidMixOutput_o.isPartnerPreempted()){//sysj\plant.sysj line: 137, column: 5
                      liquidMixOutput_o.setREQ(false);//sysj\plant.sysj line: 137, column: 5
                      S58908=1;
                      active[10]=1;
                      ends[10]=1;
                      tdone[10]=1;
                    }
                    else {
                      switch(S58903){
                        case 0 : 
                          if(liquidMixOutput_o.isACK()){//sysj\plant.sysj line: 137, column: 5
                            liquidMixOutput_o.setVal(x_thread_10);//sysj\plant.sysj line: 137, column: 5
                            S58903=1;
                            if(!liquidMixOutput_o.isACK()){//sysj\plant.sysj line: 137, column: 5
                              liquidMixOutput_o.setREQ(false);//sysj\plant.sysj line: 137, column: 5
                              ends[10]=2;
                              ;//sysj\plant.sysj line: 137, column: 5
                              S58991=1;
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
                          else {
                            active[10]=1;
                            ends[10]=1;
                            tdone[10]=1;
                          }
                          break;
                        
                        case 1 : 
                          if(!liquidMixOutput_o.isACK()){//sysj\plant.sysj line: 137, column: 5
                            liquidMixOutput_o.setREQ(false);//sysj\plant.sysj line: 137, column: 5
                            ends[10]=2;
                            ;//sysj\plant.sysj line: 137, column: 5
                            S58991=1;
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
                    break;
                  
                  case 1 : 
                    S58908=1;
                    S58908=0;
                    if(!liquidMixOutput_o.isPartnerPresent() || liquidMixOutput_o.isPartnerPreempted()){//sysj\plant.sysj line: 137, column: 5
                      liquidMixOutput_o.setREQ(false);//sysj\plant.sysj line: 137, column: 5
                      S58908=1;
                      active[10]=1;
                      ends[10]=1;
                      tdone[10]=1;
                    }
                    else {
                      S58903=0;
                      if(liquidMixOutput_o.isACK()){//sysj\plant.sysj line: 137, column: 5
                        liquidMixOutput_o.setVal(x_thread_10);//sysj\plant.sysj line: 137, column: 5
                        S58903=1;
                        if(!liquidMixOutput_o.isACK()){//sysj\plant.sysj line: 137, column: 5
                          liquidMixOutput_o.setREQ(false);//sysj\plant.sysj line: 137, column: 5
                          ends[10]=2;
                          ;//sysj\plant.sysj line: 137, column: 5
                          S58991=1;
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
                      else {
                        active[10]=1;
                        ends[10]=1;
                        tdone[10]=1;
                      }
                    }
                    break;
                  
                }
                break;
              
            }
            break;
          
          case 1 : 
            S58991=1;
            S58991=0;
            if(orderStart.getprestatus()){//sysj\plant.sysj line: 128, column: 12
                                          y_thread_10 = (bottleQuantity.getpreval() == null ? null : ((Integer)bottleQuantity.getpreval()));//sysj\plant.sysj line: 132, column: 5
              x_thread_10 = (liquidMix.getpreval() == null ? null : ((String)liquidMix.getpreval()));//sysj\plant.sysj line: 133, column: 5
              S58857=0;
              S58864=0;
              if(!bottleQuantityOutput_o.isPartnerPresent() || bottleQuantityOutput_o.isPartnerPreempted()){//sysj\plant.sysj line: 135, column: 5
                bottleQuantityOutput_o.setREQ(false);//sysj\plant.sysj line: 135, column: 5
                S58864=1;
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
              else {
                S58859=0;
                if(bottleQuantityOutput_o.isACK()){//sysj\plant.sysj line: 135, column: 5
                  bottleQuantityOutput_o.setVal(y_thread_10);//sysj\plant.sysj line: 135, column: 5
                  S58859=1;
                  if(!bottleQuantityOutput_o.isACK()){//sysj\plant.sysj line: 135, column: 5
                    bottleQuantityOutput_o.setREQ(false);//sysj\plant.sysj line: 135, column: 5
                    ends[10]=2;
                    ;//sysj\plant.sysj line: 135, column: 5
                    S58857=1;
                    S58908=0;
                    if(!liquidMixOutput_o.isPartnerPresent() || liquidMixOutput_o.isPartnerPreempted()){//sysj\plant.sysj line: 137, column: 5
                      liquidMixOutput_o.setREQ(false);//sysj\plant.sysj line: 137, column: 5
                      S58908=1;
                      active[10]=1;
                      ends[10]=1;
                      tdone[10]=1;
                    }
                    else {
                      S58903=0;
                      if(liquidMixOutput_o.isACK()){//sysj\plant.sysj line: 137, column: 5
                        liquidMixOutput_o.setVal(x_thread_10);//sysj\plant.sysj line: 137, column: 5
                        S58903=1;
                        if(!liquidMixOutput_o.isACK()){//sysj\plant.sysj line: 137, column: 5
                          liquidMixOutput_o.setREQ(false);//sysj\plant.sysj line: 137, column: 5
                          ends[10]=2;
                          ;//sysj\plant.sysj line: 137, column: 5
                          S58991=1;
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
                      else {
                        active[10]=1;
                        ends[10]=1;
                        tdone[10]=1;
                      }
                    }
                  }
                  else {
                    active[10]=1;
                    ends[10]=1;
                    tdone[10]=1;
                  }
                }
                else {
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                }
              }
            }
            else {
              S58991=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread68309(int [] tdone, int [] ends){
        active[11]=0;
    ends[11]=0;
    tdone[11]=1;
  }

  public void thread68308(int [] tdone, int [] ends){
        S59263=1;
    S58991=0;
    if(orderStart.getprestatus()){//sysj\plant.sysj line: 128, column: 12
                  y_thread_10 = (bottleQuantity.getpreval() == null ? null : ((Integer)bottleQuantity.getpreval()));//sysj\plant.sysj line: 132, column: 5
      x_thread_10 = (liquidMix.getpreval() == null ? null : ((String)liquidMix.getpreval()));//sysj\plant.sysj line: 133, column: 5
      S58857=0;
      S58864=0;
      if(!bottleQuantityOutput_o.isPartnerPresent() || bottleQuantityOutput_o.isPartnerPreempted()){//sysj\plant.sysj line: 135, column: 5
        bottleQuantityOutput_o.setREQ(false);//sysj\plant.sysj line: 135, column: 5
        S58864=1;
        active[10]=1;
        ends[10]=1;
        tdone[10]=1;
      }
      else {
        S58859=0;
        if(bottleQuantityOutput_o.isACK()){//sysj\plant.sysj line: 135, column: 5
          bottleQuantityOutput_o.setVal(y_thread_10);//sysj\plant.sysj line: 135, column: 5
          S58859=1;
          if(!bottleQuantityOutput_o.isACK()){//sysj\plant.sysj line: 135, column: 5
            bottleQuantityOutput_o.setREQ(false);//sysj\plant.sysj line: 135, column: 5
            ends[10]=2;
            ;//sysj\plant.sysj line: 135, column: 5
            S58857=1;
            S58908=0;
            if(!liquidMixOutput_o.isPartnerPresent() || liquidMixOutput_o.isPartnerPreempted()){//sysj\plant.sysj line: 137, column: 5
              liquidMixOutput_o.setREQ(false);//sysj\plant.sysj line: 137, column: 5
              S58908=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              S58903=0;
              if(liquidMixOutput_o.isACK()){//sysj\plant.sysj line: 137, column: 5
                liquidMixOutput_o.setVal(x_thread_10);//sysj\plant.sysj line: 137, column: 5
                S58903=1;
                if(!liquidMixOutput_o.isACK()){//sysj\plant.sysj line: 137, column: 5
                  liquidMixOutput_o.setREQ(false);//sysj\plant.sysj line: 137, column: 5
                  ends[10]=2;
                  ;//sysj\plant.sysj line: 137, column: 5
                  S58991=1;
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
              else {
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
            }
          }
          else {
            active[10]=1;
            ends[10]=1;
            tdone[10]=1;
          }
        }
        else {
          active[10]=1;
          ends[10]=1;
          tdone[10]=1;
        }
      }
    }
    else {
      S58991=1;
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S59674){
        case 0 : 
          S59674=0;
          break RUN;
        
        case 1 : 
          S59674=2;
          S59674=2;
          new Thread(new POS_GUI()).start();//sysj\plant.sysj line: 124, column: 2
          thread68308(tdone,ends);
          thread68309(tdone,ends);
          int biggest68310 = 0;
          if(ends[10]>=biggest68310){
            biggest68310=ends[10];
          }
          if(ends[11]>=biggest68310){
            biggest68310=ends[11];
          }
          if(biggest68310 == 1){
            active[9]=1;
            ends[9]=1;
            break RUN;
          }
        
        case 2 : 
          thread68311(tdone,ends);
          thread68312(tdone,ends);
          int biggest68313 = 0;
          if(ends[10]>=biggest68313){
            biggest68313=ends[10];
          }
          if(ends[11]>=biggest68313){
            biggest68313=ends[11];
          }
          if(biggest68313 == 1){
            active[9]=1;
            ends[9]=1;
            break RUN;
          }
          //FINXME code
          if(biggest68313 == 0){
            S59674=0;
            active[9]=0;
            ends[9]=0;
            S59674=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[9] != 0){
      int index = 9;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[9]!=0 || suspended[9]!=0 || active[9]!=1);
      else{
        if(!df){
          orderDoneFlag_in.gethook();
          liquidMixOutput_o.gethook();
          bottleQuantityOutput_o.gethook();
          orderStart.gethook();
          liquidMix.gethook();
          bottleQuantity.gethook();
          df = true;
        }
        runClockDomain();
      }
      orderStart.setpreclear();
      liquidMix.setpreclear();
      bottleQuantity.setpreclear();
      orderDoneGUIFlag.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = orderStart.getStatus() ? orderStart.setprepresent() : orderStart.setpreclear();
      orderStart.setpreval(orderStart.getValue());
      orderStart.setClear();
      dummyint = liquidMix.getStatus() ? liquidMix.setprepresent() : liquidMix.setpreclear();
      liquidMix.setpreval(liquidMix.getValue());
      liquidMix.setClear();
      dummyint = bottleQuantity.getStatus() ? bottleQuantity.setprepresent() : bottleQuantity.setpreclear();
      bottleQuantity.setpreval(bottleQuantity.getValue());
      bottleQuantity.setClear();
      orderDoneGUIFlag.sethook();
      orderDoneGUIFlag.setClear();
      orderDoneFlag_in.sethook();
      liquidMixOutput_o.sethook();
      bottleQuantityOutput_o.sethook();
      if(paused[9]!=0 || suspended[9]!=0 || active[9]!=1);
      else{
        orderDoneFlag_in.gethook();
        liquidMixOutput_o.gethook();
        bottleQuantityOutput_o.gethook();
        orderStart.gethook();
        liquidMix.gethook();
        bottleQuantity.gethook();
      }
      runFinisher();
      if(active[9] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
