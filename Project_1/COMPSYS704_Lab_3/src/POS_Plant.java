import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import run.GUI;//sysj\plant.sysj line: 1, column: 1
import run.POS_GUI;//sysj\plant.sysj line: 2, column: 1

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
  private Integer y_thread_10;//sysj\plant.sysj line: 118, column: 5
  private String x_thread_10;//sysj\plant.sysj line: 119, column: 5
  private int S20169 = 1;
  private int S19758 = 1;
  private int S19486 = 1;
  private int S19352 = 1;
  private int S19359 = 1;
  private int S19354 = 1;
  private int S19403 = 1;
  private int S19398 = 1;
  
  private int[] ends = new int[12];
  private int[] tdone = new int[12];
  
  public void thread20193(int [] tdone, int [] ends){
        active[11]=0;
    ends[11]=0;
    tdone[11]=1;
  }

  public void thread20192(int [] tdone, int [] ends){
        switch(S19758){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S19486){
          case 0 : 
            switch(S19352){
              case 0 : 
                switch(S19359){
                  case 0 : 
                    if(!liquidMixOutput_o.isPartnerPresent() || liquidMixOutput_o.isPartnerPreempted()){//sysj\plant.sysj line: 126, column: 5
                      liquidMixOutput_o.setREQ(false);//sysj\plant.sysj line: 126, column: 5
                      S19359=1;
                      active[10]=1;
                      ends[10]=1;
                      tdone[10]=1;
                    }
                    else {
                      switch(S19354){
                        case 0 : 
                          if(liquidMixOutput_o.isACK()){//sysj\plant.sysj line: 126, column: 5
                            liquidMixOutput_o.setVal(liquidMix);//sysj\plant.sysj line: 126, column: 5
                            S19354=1;
                            if(!liquidMixOutput_o.isACK()){//sysj\plant.sysj line: 126, column: 5
                              liquidMixOutput_o.setREQ(false);//sysj\plant.sysj line: 126, column: 5
                              ends[10]=2;
                              ;//sysj\plant.sysj line: 126, column: 5
                              S19352=1;
                              S19403=0;
                              if(!bottleQuantityOutput_o.isPartnerPresent() || bottleQuantityOutput_o.isPartnerPreempted()){//sysj\plant.sysj line: 127, column: 5
                                bottleQuantityOutput_o.setREQ(false);//sysj\plant.sysj line: 127, column: 5
                                S19403=1;
                                active[10]=1;
                                ends[10]=1;
                                tdone[10]=1;
                              }
                              else {
                                S19398=0;
                                if(bottleQuantityOutput_o.isACK()){//sysj\plant.sysj line: 127, column: 5
                                  bottleQuantityOutput_o.setVal(y_thread_10);//sysj\plant.sysj line: 127, column: 5
                                  S19398=1;
                                  if(!bottleQuantityOutput_o.isACK()){//sysj\plant.sysj line: 127, column: 5
                                    bottleQuantityOutput_o.setREQ(false);//sysj\plant.sysj line: 127, column: 5
                                    ends[10]=2;
                                    ;//sysj\plant.sysj line: 127, column: 5
                                    S19486=1;
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
                          if(!liquidMixOutput_o.isACK()){//sysj\plant.sysj line: 126, column: 5
                            liquidMixOutput_o.setREQ(false);//sysj\plant.sysj line: 126, column: 5
                            ends[10]=2;
                            ;//sysj\plant.sysj line: 126, column: 5
                            S19352=1;
                            S19403=0;
                            if(!bottleQuantityOutput_o.isPartnerPresent() || bottleQuantityOutput_o.isPartnerPreempted()){//sysj\plant.sysj line: 127, column: 5
                              bottleQuantityOutput_o.setREQ(false);//sysj\plant.sysj line: 127, column: 5
                              S19403=1;
                              active[10]=1;
                              ends[10]=1;
                              tdone[10]=1;
                            }
                            else {
                              S19398=0;
                              if(bottleQuantityOutput_o.isACK()){//sysj\plant.sysj line: 127, column: 5
                                bottleQuantityOutput_o.setVal(y_thread_10);//sysj\plant.sysj line: 127, column: 5
                                S19398=1;
                                if(!bottleQuantityOutput_o.isACK()){//sysj\plant.sysj line: 127, column: 5
                                  bottleQuantityOutput_o.setREQ(false);//sysj\plant.sysj line: 127, column: 5
                                  ends[10]=2;
                                  ;//sysj\plant.sysj line: 127, column: 5
                                  S19486=1;
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
                    S19359=1;
                    S19359=0;
                    if(!liquidMixOutput_o.isPartnerPresent() || liquidMixOutput_o.isPartnerPreempted()){//sysj\plant.sysj line: 126, column: 5
                      liquidMixOutput_o.setREQ(false);//sysj\plant.sysj line: 126, column: 5
                      S19359=1;
                      active[10]=1;
                      ends[10]=1;
                      tdone[10]=1;
                    }
                    else {
                      S19354=0;
                      if(liquidMixOutput_o.isACK()){//sysj\plant.sysj line: 126, column: 5
                        liquidMixOutput_o.setVal(liquidMix);//sysj\plant.sysj line: 126, column: 5
                        S19354=1;
                        if(!liquidMixOutput_o.isACK()){//sysj\plant.sysj line: 126, column: 5
                          liquidMixOutput_o.setREQ(false);//sysj\plant.sysj line: 126, column: 5
                          ends[10]=2;
                          ;//sysj\plant.sysj line: 126, column: 5
                          S19352=1;
                          S19403=0;
                          if(!bottleQuantityOutput_o.isPartnerPresent() || bottleQuantityOutput_o.isPartnerPreempted()){//sysj\plant.sysj line: 127, column: 5
                            bottleQuantityOutput_o.setREQ(false);//sysj\plant.sysj line: 127, column: 5
                            S19403=1;
                            active[10]=1;
                            ends[10]=1;
                            tdone[10]=1;
                          }
                          else {
                            S19398=0;
                            if(bottleQuantityOutput_o.isACK()){//sysj\plant.sysj line: 127, column: 5
                              bottleQuantityOutput_o.setVal(y_thread_10);//sysj\plant.sysj line: 127, column: 5
                              S19398=1;
                              if(!bottleQuantityOutput_o.isACK()){//sysj\plant.sysj line: 127, column: 5
                                bottleQuantityOutput_o.setREQ(false);//sysj\plant.sysj line: 127, column: 5
                                ends[10]=2;
                                ;//sysj\plant.sysj line: 127, column: 5
                                S19486=1;
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
                switch(S19403){
                  case 0 : 
                    if(!bottleQuantityOutput_o.isPartnerPresent() || bottleQuantityOutput_o.isPartnerPreempted()){//sysj\plant.sysj line: 127, column: 5
                      bottleQuantityOutput_o.setREQ(false);//sysj\plant.sysj line: 127, column: 5
                      S19403=1;
                      active[10]=1;
                      ends[10]=1;
                      tdone[10]=1;
                    }
                    else {
                      switch(S19398){
                        case 0 : 
                          if(bottleQuantityOutput_o.isACK()){//sysj\plant.sysj line: 127, column: 5
                            bottleQuantityOutput_o.setVal(y_thread_10);//sysj\plant.sysj line: 127, column: 5
                            S19398=1;
                            if(!bottleQuantityOutput_o.isACK()){//sysj\plant.sysj line: 127, column: 5
                              bottleQuantityOutput_o.setREQ(false);//sysj\plant.sysj line: 127, column: 5
                              ends[10]=2;
                              ;//sysj\plant.sysj line: 127, column: 5
                              S19486=1;
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
                          if(!bottleQuantityOutput_o.isACK()){//sysj\plant.sysj line: 127, column: 5
                            bottleQuantityOutput_o.setREQ(false);//sysj\plant.sysj line: 127, column: 5
                            ends[10]=2;
                            ;//sysj\plant.sysj line: 127, column: 5
                            S19486=1;
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
                    S19403=1;
                    S19403=0;
                    if(!bottleQuantityOutput_o.isPartnerPresent() || bottleQuantityOutput_o.isPartnerPreempted()){//sysj\plant.sysj line: 127, column: 5
                      bottleQuantityOutput_o.setREQ(false);//sysj\plant.sysj line: 127, column: 5
                      S19403=1;
                      active[10]=1;
                      ends[10]=1;
                      tdone[10]=1;
                    }
                    else {
                      S19398=0;
                      if(bottleQuantityOutput_o.isACK()){//sysj\plant.sysj line: 127, column: 5
                        bottleQuantityOutput_o.setVal(y_thread_10);//sysj\plant.sysj line: 127, column: 5
                        S19398=1;
                        if(!bottleQuantityOutput_o.isACK()){//sysj\plant.sysj line: 127, column: 5
                          bottleQuantityOutput_o.setREQ(false);//sysj\plant.sysj line: 127, column: 5
                          ends[10]=2;
                          ;//sysj\plant.sysj line: 127, column: 5
                          S19486=1;
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
            S19486=1;
            S19486=0;
            if(orderStart.getprestatus()){//sysj\plant.sysj line: 117, column: 12
                                          y_thread_10 = (bottleQuantity.getpreval() == null ? null : ((Integer)bottleQuantity.getpreval()));//sysj\plant.sysj line: 121, column: 5
              x_thread_10 = (liquidMix.getpreval() == null ? null : ((String)liquidMix.getpreval()));//sysj\plant.sysj line: 122, column: 5
              System.out.println("Bottle Quantity: " + y_thread_10);//sysj\plant.sysj line: 124, column: 5
              System.out.println("Liquid Mix: " + x_thread_10);//sysj\plant.sysj line: 125, column: 5
              S19352=0;
              S19359=0;
              if(!liquidMixOutput_o.isPartnerPresent() || liquidMixOutput_o.isPartnerPreempted()){//sysj\plant.sysj line: 126, column: 5
                liquidMixOutput_o.setREQ(false);//sysj\plant.sysj line: 126, column: 5
                S19359=1;
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
              else {
                S19354=0;
                if(liquidMixOutput_o.isACK()){//sysj\plant.sysj line: 126, column: 5
                  liquidMixOutput_o.setVal(liquidMix);//sysj\plant.sysj line: 126, column: 5
                  S19354=1;
                  if(!liquidMixOutput_o.isACK()){//sysj\plant.sysj line: 126, column: 5
                    liquidMixOutput_o.setREQ(false);//sysj\plant.sysj line: 126, column: 5
                    ends[10]=2;
                    ;//sysj\plant.sysj line: 126, column: 5
                    S19352=1;
                    S19403=0;
                    if(!bottleQuantityOutput_o.isPartnerPresent() || bottleQuantityOutput_o.isPartnerPreempted()){//sysj\plant.sysj line: 127, column: 5
                      bottleQuantityOutput_o.setREQ(false);//sysj\plant.sysj line: 127, column: 5
                      S19403=1;
                      active[10]=1;
                      ends[10]=1;
                      tdone[10]=1;
                    }
                    else {
                      S19398=0;
                      if(bottleQuantityOutput_o.isACK()){//sysj\plant.sysj line: 127, column: 5
                        bottleQuantityOutput_o.setVal(y_thread_10);//sysj\plant.sysj line: 127, column: 5
                        S19398=1;
                        if(!bottleQuantityOutput_o.isACK()){//sysj\plant.sysj line: 127, column: 5
                          bottleQuantityOutput_o.setREQ(false);//sysj\plant.sysj line: 127, column: 5
                          ends[10]=2;
                          ;//sysj\plant.sysj line: 127, column: 5
                          S19486=1;
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
              S19486=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread20190(int [] tdone, int [] ends){
        active[11]=0;
    ends[11]=0;
    tdone[11]=1;
  }

  public void thread20189(int [] tdone, int [] ends){
        S19758=1;
    S19486=0;
    if(orderStart.getprestatus()){//sysj\plant.sysj line: 117, column: 12
                  y_thread_10 = (bottleQuantity.getpreval() == null ? null : ((Integer)bottleQuantity.getpreval()));//sysj\plant.sysj line: 121, column: 5
      x_thread_10 = (liquidMix.getpreval() == null ? null : ((String)liquidMix.getpreval()));//sysj\plant.sysj line: 122, column: 5
      System.out.println("Bottle Quantity: " + y_thread_10);//sysj\plant.sysj line: 124, column: 5
      System.out.println("Liquid Mix: " + x_thread_10);//sysj\plant.sysj line: 125, column: 5
      S19352=0;
      S19359=0;
      if(!liquidMixOutput_o.isPartnerPresent() || liquidMixOutput_o.isPartnerPreempted()){//sysj\plant.sysj line: 126, column: 5
        liquidMixOutput_o.setREQ(false);//sysj\plant.sysj line: 126, column: 5
        S19359=1;
        active[10]=1;
        ends[10]=1;
        tdone[10]=1;
      }
      else {
        S19354=0;
        if(liquidMixOutput_o.isACK()){//sysj\plant.sysj line: 126, column: 5
          liquidMixOutput_o.setVal(liquidMix);//sysj\plant.sysj line: 126, column: 5
          S19354=1;
          if(!liquidMixOutput_o.isACK()){//sysj\plant.sysj line: 126, column: 5
            liquidMixOutput_o.setREQ(false);//sysj\plant.sysj line: 126, column: 5
            ends[10]=2;
            ;//sysj\plant.sysj line: 126, column: 5
            S19352=1;
            S19403=0;
            if(!bottleQuantityOutput_o.isPartnerPresent() || bottleQuantityOutput_o.isPartnerPreempted()){//sysj\plant.sysj line: 127, column: 5
              bottleQuantityOutput_o.setREQ(false);//sysj\plant.sysj line: 127, column: 5
              S19403=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              S19398=0;
              if(bottleQuantityOutput_o.isACK()){//sysj\plant.sysj line: 127, column: 5
                bottleQuantityOutput_o.setVal(y_thread_10);//sysj\plant.sysj line: 127, column: 5
                S19398=1;
                if(!bottleQuantityOutput_o.isACK()){//sysj\plant.sysj line: 127, column: 5
                  bottleQuantityOutput_o.setREQ(false);//sysj\plant.sysj line: 127, column: 5
                  ends[10]=2;
                  ;//sysj\plant.sysj line: 127, column: 5
                  S19486=1;
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
      S19486=1;
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
      switch(S20169){
        case 0 : 
          S20169=0;
          break RUN;
        
        case 1 : 
          S20169=2;
          S20169=2;
          new Thread(new POS_GUI()).start();//sysj\plant.sysj line: 113, column: 2
          thread20189(tdone,ends);
          thread20190(tdone,ends);
          int biggest20191 = 0;
          if(ends[10]>=biggest20191){
            biggest20191=ends[10];
          }
          if(ends[11]>=biggest20191){
            biggest20191=ends[11];
          }
          if(biggest20191 == 1){
            active[9]=1;
            ends[9]=1;
            break RUN;
          }
        
        case 2 : 
          thread20192(tdone,ends);
          thread20193(tdone,ends);
          int biggest20194 = 0;
          if(ends[10]>=biggest20194){
            biggest20194=ends[10];
          }
          if(ends[11]>=biggest20194){
            biggest20194=ends[11];
          }
          if(biggest20194 == 1){
            active[9]=1;
            ends[9]=1;
            break RUN;
          }
          //FINXME code
          if(biggest20194 == 0){
            S20169=0;
            active[9]=0;
            ends[9]=0;
            S20169=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
