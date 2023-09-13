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
  private Integer y_thread_10;//sysj\plant.sysj line: 120, column: 5
  private String x_thread_10;//sysj\plant.sysj line: 121, column: 5
  private int S6813 = 1;
  private int S6402 = 1;
  private int S6130 = 1;
  private int S5996 = 1;
  private int S6003 = 1;
  private int S5998 = 1;
  private int S6047 = 1;
  private int S6042 = 1;
  
  private int[] ends = new int[12];
  private int[] tdone = new int[12];
  
  public void thread6837(int [] tdone, int [] ends){
        active[11]=0;
    ends[11]=0;
    tdone[11]=1;
  }

  public void thread6836(int [] tdone, int [] ends){
        switch(S6402){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S6130){
          case 0 : 
            switch(S5996){
              case 0 : 
                switch(S6003){
                  case 0 : 
                    if(!bottleQuantityOutput_o.isPartnerPresent() || bottleQuantityOutput_o.isPartnerPreempted()){//sysj\plant.sysj line: 126, column: 5
                      bottleQuantityOutput_o.setREQ(false);//sysj\plant.sysj line: 126, column: 5
                      S6003=1;
                      active[10]=1;
                      ends[10]=1;
                      tdone[10]=1;
                    }
                    else {
                      switch(S5998){
                        case 0 : 
                          if(bottleQuantityOutput_o.isACK()){//sysj\plant.sysj line: 126, column: 5
                            bottleQuantityOutput_o.setVal(y_thread_10);//sysj\plant.sysj line: 126, column: 5
                            S5998=1;
                            if(!bottleQuantityOutput_o.isACK()){//sysj\plant.sysj line: 126, column: 5
                              bottleQuantityOutput_o.setREQ(false);//sysj\plant.sysj line: 126, column: 5
                              ends[10]=2;
                              ;//sysj\plant.sysj line: 126, column: 5
                              S5996=1;
                              S6047=0;
                              if(!liquidMixOutput_o.isPartnerPresent() || liquidMixOutput_o.isPartnerPreempted()){//sysj\plant.sysj line: 128, column: 5
                                liquidMixOutput_o.setREQ(false);//sysj\plant.sysj line: 128, column: 5
                                S6047=1;
                                active[10]=1;
                                ends[10]=1;
                                tdone[10]=1;
                              }
                              else {
                                S6042=0;
                                if(liquidMixOutput_o.isACK()){//sysj\plant.sysj line: 128, column: 5
                                  liquidMixOutput_o.setVal(x_thread_10);//sysj\plant.sysj line: 128, column: 5
                                  S6042=1;
                                  if(!liquidMixOutput_o.isACK()){//sysj\plant.sysj line: 128, column: 5
                                    liquidMixOutput_o.setREQ(false);//sysj\plant.sysj line: 128, column: 5
                                    ends[10]=2;
                                    ;//sysj\plant.sysj line: 128, column: 5
                                    S6130=1;
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
                          if(!bottleQuantityOutput_o.isACK()){//sysj\plant.sysj line: 126, column: 5
                            bottleQuantityOutput_o.setREQ(false);//sysj\plant.sysj line: 126, column: 5
                            ends[10]=2;
                            ;//sysj\plant.sysj line: 126, column: 5
                            S5996=1;
                            S6047=0;
                            if(!liquidMixOutput_o.isPartnerPresent() || liquidMixOutput_o.isPartnerPreempted()){//sysj\plant.sysj line: 128, column: 5
                              liquidMixOutput_o.setREQ(false);//sysj\plant.sysj line: 128, column: 5
                              S6047=1;
                              active[10]=1;
                              ends[10]=1;
                              tdone[10]=1;
                            }
                            else {
                              S6042=0;
                              if(liquidMixOutput_o.isACK()){//sysj\plant.sysj line: 128, column: 5
                                liquidMixOutput_o.setVal(x_thread_10);//sysj\plant.sysj line: 128, column: 5
                                S6042=1;
                                if(!liquidMixOutput_o.isACK()){//sysj\plant.sysj line: 128, column: 5
                                  liquidMixOutput_o.setREQ(false);//sysj\plant.sysj line: 128, column: 5
                                  ends[10]=2;
                                  ;//sysj\plant.sysj line: 128, column: 5
                                  S6130=1;
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
                    S6003=1;
                    S6003=0;
                    if(!bottleQuantityOutput_o.isPartnerPresent() || bottleQuantityOutput_o.isPartnerPreempted()){//sysj\plant.sysj line: 126, column: 5
                      bottleQuantityOutput_o.setREQ(false);//sysj\plant.sysj line: 126, column: 5
                      S6003=1;
                      active[10]=1;
                      ends[10]=1;
                      tdone[10]=1;
                    }
                    else {
                      S5998=0;
                      if(bottleQuantityOutput_o.isACK()){//sysj\plant.sysj line: 126, column: 5
                        bottleQuantityOutput_o.setVal(y_thread_10);//sysj\plant.sysj line: 126, column: 5
                        S5998=1;
                        if(!bottleQuantityOutput_o.isACK()){//sysj\plant.sysj line: 126, column: 5
                          bottleQuantityOutput_o.setREQ(false);//sysj\plant.sysj line: 126, column: 5
                          ends[10]=2;
                          ;//sysj\plant.sysj line: 126, column: 5
                          S5996=1;
                          S6047=0;
                          if(!liquidMixOutput_o.isPartnerPresent() || liquidMixOutput_o.isPartnerPreempted()){//sysj\plant.sysj line: 128, column: 5
                            liquidMixOutput_o.setREQ(false);//sysj\plant.sysj line: 128, column: 5
                            S6047=1;
                            active[10]=1;
                            ends[10]=1;
                            tdone[10]=1;
                          }
                          else {
                            S6042=0;
                            if(liquidMixOutput_o.isACK()){//sysj\plant.sysj line: 128, column: 5
                              liquidMixOutput_o.setVal(x_thread_10);//sysj\plant.sysj line: 128, column: 5
                              S6042=1;
                              if(!liquidMixOutput_o.isACK()){//sysj\plant.sysj line: 128, column: 5
                                liquidMixOutput_o.setREQ(false);//sysj\plant.sysj line: 128, column: 5
                                ends[10]=2;
                                ;//sysj\plant.sysj line: 128, column: 5
                                S6130=1;
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
                switch(S6047){
                  case 0 : 
                    if(!liquidMixOutput_o.isPartnerPresent() || liquidMixOutput_o.isPartnerPreempted()){//sysj\plant.sysj line: 128, column: 5
                      liquidMixOutput_o.setREQ(false);//sysj\plant.sysj line: 128, column: 5
                      S6047=1;
                      active[10]=1;
                      ends[10]=1;
                      tdone[10]=1;
                    }
                    else {
                      switch(S6042){
                        case 0 : 
                          if(liquidMixOutput_o.isACK()){//sysj\plant.sysj line: 128, column: 5
                            liquidMixOutput_o.setVal(x_thread_10);//sysj\plant.sysj line: 128, column: 5
                            S6042=1;
                            if(!liquidMixOutput_o.isACK()){//sysj\plant.sysj line: 128, column: 5
                              liquidMixOutput_o.setREQ(false);//sysj\plant.sysj line: 128, column: 5
                              ends[10]=2;
                              ;//sysj\plant.sysj line: 128, column: 5
                              S6130=1;
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
                          if(!liquidMixOutput_o.isACK()){//sysj\plant.sysj line: 128, column: 5
                            liquidMixOutput_o.setREQ(false);//sysj\plant.sysj line: 128, column: 5
                            ends[10]=2;
                            ;//sysj\plant.sysj line: 128, column: 5
                            S6130=1;
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
                    S6047=1;
                    S6047=0;
                    if(!liquidMixOutput_o.isPartnerPresent() || liquidMixOutput_o.isPartnerPreempted()){//sysj\plant.sysj line: 128, column: 5
                      liquidMixOutput_o.setREQ(false);//sysj\plant.sysj line: 128, column: 5
                      S6047=1;
                      active[10]=1;
                      ends[10]=1;
                      tdone[10]=1;
                    }
                    else {
                      S6042=0;
                      if(liquidMixOutput_o.isACK()){//sysj\plant.sysj line: 128, column: 5
                        liquidMixOutput_o.setVal(x_thread_10);//sysj\plant.sysj line: 128, column: 5
                        S6042=1;
                        if(!liquidMixOutput_o.isACK()){//sysj\plant.sysj line: 128, column: 5
                          liquidMixOutput_o.setREQ(false);//sysj\plant.sysj line: 128, column: 5
                          ends[10]=2;
                          ;//sysj\plant.sysj line: 128, column: 5
                          S6130=1;
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
            S6130=1;
            S6130=0;
            if(orderStart.getprestatus()){//sysj\plant.sysj line: 119, column: 12
                                          y_thread_10 = (bottleQuantity.getpreval() == null ? null : ((Integer)bottleQuantity.getpreval()));//sysj\plant.sysj line: 123, column: 5
              x_thread_10 = (liquidMix.getpreval() == null ? null : ((String)liquidMix.getpreval()));//sysj\plant.sysj line: 124, column: 5
              S5996=0;
              S6003=0;
              if(!bottleQuantityOutput_o.isPartnerPresent() || bottleQuantityOutput_o.isPartnerPreempted()){//sysj\plant.sysj line: 126, column: 5
                bottleQuantityOutput_o.setREQ(false);//sysj\plant.sysj line: 126, column: 5
                S6003=1;
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
              else {
                S5998=0;
                if(bottleQuantityOutput_o.isACK()){//sysj\plant.sysj line: 126, column: 5
                  bottleQuantityOutput_o.setVal(y_thread_10);//sysj\plant.sysj line: 126, column: 5
                  S5998=1;
                  if(!bottleQuantityOutput_o.isACK()){//sysj\plant.sysj line: 126, column: 5
                    bottleQuantityOutput_o.setREQ(false);//sysj\plant.sysj line: 126, column: 5
                    ends[10]=2;
                    ;//sysj\plant.sysj line: 126, column: 5
                    S5996=1;
                    S6047=0;
                    if(!liquidMixOutput_o.isPartnerPresent() || liquidMixOutput_o.isPartnerPreempted()){//sysj\plant.sysj line: 128, column: 5
                      liquidMixOutput_o.setREQ(false);//sysj\plant.sysj line: 128, column: 5
                      S6047=1;
                      active[10]=1;
                      ends[10]=1;
                      tdone[10]=1;
                    }
                    else {
                      S6042=0;
                      if(liquidMixOutput_o.isACK()){//sysj\plant.sysj line: 128, column: 5
                        liquidMixOutput_o.setVal(x_thread_10);//sysj\plant.sysj line: 128, column: 5
                        S6042=1;
                        if(!liquidMixOutput_o.isACK()){//sysj\plant.sysj line: 128, column: 5
                          liquidMixOutput_o.setREQ(false);//sysj\plant.sysj line: 128, column: 5
                          ends[10]=2;
                          ;//sysj\plant.sysj line: 128, column: 5
                          S6130=1;
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
              S6130=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread6834(int [] tdone, int [] ends){
        active[11]=0;
    ends[11]=0;
    tdone[11]=1;
  }

  public void thread6833(int [] tdone, int [] ends){
        S6402=1;
    S6130=0;
    if(orderStart.getprestatus()){//sysj\plant.sysj line: 119, column: 12
                  y_thread_10 = (bottleQuantity.getpreval() == null ? null : ((Integer)bottleQuantity.getpreval()));//sysj\plant.sysj line: 123, column: 5
      x_thread_10 = (liquidMix.getpreval() == null ? null : ((String)liquidMix.getpreval()));//sysj\plant.sysj line: 124, column: 5
      S5996=0;
      S6003=0;
      if(!bottleQuantityOutput_o.isPartnerPresent() || bottleQuantityOutput_o.isPartnerPreempted()){//sysj\plant.sysj line: 126, column: 5
        bottleQuantityOutput_o.setREQ(false);//sysj\plant.sysj line: 126, column: 5
        S6003=1;
        active[10]=1;
        ends[10]=1;
        tdone[10]=1;
      }
      else {
        S5998=0;
        if(bottleQuantityOutput_o.isACK()){//sysj\plant.sysj line: 126, column: 5
          bottleQuantityOutput_o.setVal(y_thread_10);//sysj\plant.sysj line: 126, column: 5
          S5998=1;
          if(!bottleQuantityOutput_o.isACK()){//sysj\plant.sysj line: 126, column: 5
            bottleQuantityOutput_o.setREQ(false);//sysj\plant.sysj line: 126, column: 5
            ends[10]=2;
            ;//sysj\plant.sysj line: 126, column: 5
            S5996=1;
            S6047=0;
            if(!liquidMixOutput_o.isPartnerPresent() || liquidMixOutput_o.isPartnerPreempted()){//sysj\plant.sysj line: 128, column: 5
              liquidMixOutput_o.setREQ(false);//sysj\plant.sysj line: 128, column: 5
              S6047=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              S6042=0;
              if(liquidMixOutput_o.isACK()){//sysj\plant.sysj line: 128, column: 5
                liquidMixOutput_o.setVal(x_thread_10);//sysj\plant.sysj line: 128, column: 5
                S6042=1;
                if(!liquidMixOutput_o.isACK()){//sysj\plant.sysj line: 128, column: 5
                  liquidMixOutput_o.setREQ(false);//sysj\plant.sysj line: 128, column: 5
                  ends[10]=2;
                  ;//sysj\plant.sysj line: 128, column: 5
                  S6130=1;
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
      S6130=1;
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
      switch(S6813){
        case 0 : 
          S6813=0;
          break RUN;
        
        case 1 : 
          S6813=2;
          S6813=2;
          new Thread(new POS_GUI()).start();//sysj\plant.sysj line: 115, column: 2
          thread6833(tdone,ends);
          thread6834(tdone,ends);
          int biggest6835 = 0;
          if(ends[10]>=biggest6835){
            biggest6835=ends[10];
          }
          if(ends[11]>=biggest6835){
            biggest6835=ends[11];
          }
          if(biggest6835 == 1){
            active[9]=1;
            ends[9]=1;
            break RUN;
          }
        
        case 2 : 
          thread6836(tdone,ends);
          thread6837(tdone,ends);
          int biggest6838 = 0;
          if(ends[10]>=biggest6838){
            biggest6838=ends[10];
          }
          if(ends[11]>=biggest6838){
            biggest6838=ends[11];
          }
          if(biggest6838 == 1){
            active[9]=1;
            ends[9]=1;
            break RUN;
          }
          //FINXME code
          if(biggest6838 == 0){
            S6813=0;
            active[9]=0;
            ends[9]=0;
            S6813=0;
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
