import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import run.GUI;//sysj\plant.sysj line: 1, column: 1
import run.POS_GUI;//sysj\plant.sysj line: 2, column: 1
import run.ECS_GUI;//sysj\plant.sysj line: 3, column: 1

public class Plant extends ClockDomain{
  public Plant(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal capOnBottleAtPos1 = new Signal("capOnBottleAtPos1", Signal.INPUT);
  public Signal tableAlignedWithSensor = new Signal("tableAlignedWithSensor", Signal.INPUT);
  public Signal bottleAtPos1 = new Signal("bottleAtPos1", Signal.INPUT);
  public Signal bottleAtPos2 = new Signal("bottleAtPos2", Signal.INPUT);
  public Signal bottleAtPos3 = new Signal("bottleAtPos3", Signal.INPUT);
  public Signal bottleAtPos4 = new Signal("bottleAtPos4", Signal.INPUT);
  public Signal bottleAtPos5 = new Signal("bottleAtPos5", Signal.INPUT);
  public Signal rotate = new Signal("rotate", Signal.INPUT);
  public Signal capOnPos1 = new Signal("capOnPos1", Signal.OUTPUT);
  public Signal tableAligned = new Signal("tableAligned", Signal.OUTPUT);
  public Signal botPos1 = new Signal("botPos1", Signal.OUTPUT);
  public Signal botPos2 = new Signal("botPos2", Signal.OUTPUT);
  public Signal botPos3 = new Signal("botPos3", Signal.OUTPUT);
  public Signal botPos4 = new Signal("botPos4", Signal.OUTPUT);
  public Signal botPos5 = new Signal("botPos5", Signal.OUTPUT);
  public Signal conBeltTriggerE = new Signal("conBeltTriggerE", Signal.OUTPUT);
  public Signal fillerTriggerE = new Signal("fillerTriggerE", Signal.OUTPUT);
  public Signal lidloaderTriggerE = new Signal("lidloaderTriggerE", Signal.OUTPUT);
  public Signal capScrewTriggerE = new Signal("capScrewTriggerE", Signal.OUTPUT);
  public Signal labelTriggerE = new Signal("labelTriggerE", Signal.OUTPUT);
  public input_Channel liquidMixOutput_in = new input_Channel();
  public input_Channel bottleQuantityOutput_in = new input_Channel();
  public output_Channel orderDoneFlag_o = new output_Channel();
  private Integer bottles_thread_2;//sysj\plant.sysj line: 25, column: 4
  private String liquidMix_thread_2;//sysj\plant.sysj line: 30, column: 4
  private Integer bottlesDone_thread_2;//sysj\plant.sysj line: 34, column: 4
  private int S6858 = 1;
  private int S3545 = 1;
  private int S363 = 1;
  private int S325 = 1;
  private int S320 = 1;
  private int S370 = 1;
  private int S365 = 1;
  private int S458 = 1;
  private int S3587 = 1;
  private int S3553 = 1;
  private int S3561 = 1;
  private int S3569 = 1;
  private int S3577 = 1;
  private int S3585 = 1;
  
  private int[] ends = new int[37];
  private int[] tdone = new int[37];
  
  public void thread14901(int [] tdone, int [] ends){
        switch(S3585){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(botPos5.getprestatus()){//sysj\plant.sysj line: 103, column: 24
          labelTriggerE.setPresent();//sysj\plant.sysj line: 103, column: 33
          currsigs.addElement(labelTriggerE);
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

  public void thread14900(int [] tdone, int [] ends){
        switch(S3577){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(botPos4.getprestatus()){//sysj\plant.sysj line: 101, column: 24
          capScrewTriggerE.setPresent();//sysj\plant.sysj line: 101, column: 33
          currsigs.addElement(capScrewTriggerE);
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

  public void thread14899(int [] tdone, int [] ends){
        switch(S3569){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(botPos3.getprestatus()){//sysj\plant.sysj line: 99, column: 24
          lidloaderTriggerE.setPresent();//sysj\plant.sysj line: 99, column: 33
          currsigs.addElement(lidloaderTriggerE);
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

  public void thread14898(int [] tdone, int [] ends){
        switch(S3561){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(botPos2.getprestatus()){//sysj\plant.sysj line: 97, column: 24
          fillerTriggerE.setPresent();//sysj\plant.sysj line: 97, column: 33
          currsigs.addElement(fillerTriggerE);
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        else {
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        break;
      
    }
  }

  public void thread14897(int [] tdone, int [] ends){
        switch(S3553){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        if(botPos1.getprestatus()){//sysj\plant.sysj line: 95, column: 24
          conBeltTriggerE.setPresent();//sysj\plant.sysj line: 95, column: 33
          currsigs.addElement(conBeltTriggerE);
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
      
    }
  }

  public void thread14896(int [] tdone, int [] ends){
        switch(S3587){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        thread14897(tdone,ends);
        thread14898(tdone,ends);
        thread14899(tdone,ends);
        thread14900(tdone,ends);
        thread14901(tdone,ends);
        int biggest14902 = 0;
        if(ends[4]>=biggest14902){
          biggest14902=ends[4];
        }
        if(ends[5]>=biggest14902){
          biggest14902=ends[5];
        }
        if(ends[6]>=biggest14902){
          biggest14902=ends[6];
        }
        if(ends[7]>=biggest14902){
          biggest14902=ends[7];
        }
        if(ends[8]>=biggest14902){
          biggest14902=ends[8];
        }
        if(biggest14902 == 1){
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        //FINXME code
        if(biggest14902 == 0){
          S3587=0;
          active[3]=0;
          ends[3]=0;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread14895(int [] tdone, int [] ends){
        switch(S3545){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S363){
          case 0 : 
            switch(S325){
              case 0 : 
                if(!bottleQuantityOutput_in.isPartnerPresent() || bottleQuantityOutput_in.isPartnerPreempted()){//sysj\plant.sysj line: 26, column: 4
                  bottleQuantityOutput_in.setACK(false);//sysj\plant.sysj line: 26, column: 4
                  S325=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  switch(S320){
                    case 0 : 
                      if(!bottleQuantityOutput_in.isREQ()){//sysj\plant.sysj line: 26, column: 4
                        bottleQuantityOutput_in.setACK(true);//sysj\plant.sysj line: 26, column: 4
                        S320=1;
                        if(bottleQuantityOutput_in.isREQ()){//sysj\plant.sysj line: 26, column: 4
                          bottleQuantityOutput_in.setACK(false);//sysj\plant.sysj line: 26, column: 4
                          ends[2]=2;
                          ;//sysj\plant.sysj line: 26, column: 4
                          bottles_thread_2 = (Integer)(bottleQuantityOutput_in.getVal() == null ? 0 : ((Integer)bottleQuantityOutput_in.getVal()).intValue());//sysj\plant.sysj line: 27, column: 4
                          System.out.println("Bottle Quantity: " + bottles_thread_2);//sysj\plant.sysj line: 28, column: 4
                          S363=1;
                          S370=0;
                          if(!liquidMixOutput_in.isPartnerPresent() || liquidMixOutput_in.isPartnerPreempted()){//sysj\plant.sysj line: 29, column: 4
                            liquidMixOutput_in.setACK(false);//sysj\plant.sysj line: 29, column: 4
                            S370=1;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S365=0;
                            if(!liquidMixOutput_in.isREQ()){//sysj\plant.sysj line: 29, column: 4
                              liquidMixOutput_in.setACK(true);//sysj\plant.sysj line: 29, column: 4
                              S365=1;
                              if(liquidMixOutput_in.isREQ()){//sysj\plant.sysj line: 29, column: 4
                                liquidMixOutput_in.setACK(false);//sysj\plant.sysj line: 29, column: 4
                                ends[2]=2;
                                ;//sysj\plant.sysj line: 29, column: 4
                                liquidMix_thread_2 = "";//sysj\plant.sysj line: 30, column: 4
                                liquidMix_thread_2 = (String)(liquidMixOutput_in.getVal() == null ? null : ((String)liquidMixOutput_in.getVal()));//sysj\plant.sysj line: 31, column: 4
                                System.out.println("Liquid Mix: " + liquidMix_thread_2);//sysj\plant.sysj line: 32, column: 4
                                bottlesDone_thread_2 = 0;//sysj\plant.sysj line: 34, column: 4
                                S363=2;
                                if(bottlesDone_thread_2 != bottles_thread_2){//sysj\plant.sysj line: 36, column: 10
                                  S458=0;
                                  botPos1.setPresent();//sysj\plant.sysj line: 39, column: 7
                                  currsigs.addElement(botPos1);
                                  tableAligned.setPresent();//sysj\plant.sysj line: 40, column: 7
                                  currsigs.addElement(tableAligned);
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                                else {
                                  ends[2]=2;
                                  ;//sysj\plant.sysj line: 36, column: 4
                                  S363=3;
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                              }
                              else {
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                            }
                            else {
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                        }
                        else {
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                      }
                      else {
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(bottleQuantityOutput_in.isREQ()){//sysj\plant.sysj line: 26, column: 4
                        bottleQuantityOutput_in.setACK(false);//sysj\plant.sysj line: 26, column: 4
                        ends[2]=2;
                        ;//sysj\plant.sysj line: 26, column: 4
                        bottles_thread_2 = (Integer)(bottleQuantityOutput_in.getVal() == null ? 0 : ((Integer)bottleQuantityOutput_in.getVal()).intValue());//sysj\plant.sysj line: 27, column: 4
                        System.out.println("Bottle Quantity: " + bottles_thread_2);//sysj\plant.sysj line: 28, column: 4
                        S363=1;
                        S370=0;
                        if(!liquidMixOutput_in.isPartnerPresent() || liquidMixOutput_in.isPartnerPreempted()){//sysj\plant.sysj line: 29, column: 4
                          liquidMixOutput_in.setACK(false);//sysj\plant.sysj line: 29, column: 4
                          S370=1;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          S365=0;
                          if(!liquidMixOutput_in.isREQ()){//sysj\plant.sysj line: 29, column: 4
                            liquidMixOutput_in.setACK(true);//sysj\plant.sysj line: 29, column: 4
                            S365=1;
                            if(liquidMixOutput_in.isREQ()){//sysj\plant.sysj line: 29, column: 4
                              liquidMixOutput_in.setACK(false);//sysj\plant.sysj line: 29, column: 4
                              ends[2]=2;
                              ;//sysj\plant.sysj line: 29, column: 4
                              liquidMix_thread_2 = "";//sysj\plant.sysj line: 30, column: 4
                              liquidMix_thread_2 = (String)(liquidMixOutput_in.getVal() == null ? null : ((String)liquidMixOutput_in.getVal()));//sysj\plant.sysj line: 31, column: 4
                              System.out.println("Liquid Mix: " + liquidMix_thread_2);//sysj\plant.sysj line: 32, column: 4
                              bottlesDone_thread_2 = 0;//sysj\plant.sysj line: 34, column: 4
                              S363=2;
                              if(bottlesDone_thread_2 != bottles_thread_2){//sysj\plant.sysj line: 36, column: 10
                                S458=0;
                                botPos1.setPresent();//sysj\plant.sysj line: 39, column: 7
                                currsigs.addElement(botPos1);
                                tableAligned.setPresent();//sysj\plant.sysj line: 40, column: 7
                                currsigs.addElement(tableAligned);
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                              else {
                                ends[2]=2;
                                ;//sysj\plant.sysj line: 36, column: 4
                                S363=3;
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                            }
                            else {
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                          else {
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                      }
                      else {
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S325=1;
                S325=0;
                if(!bottleQuantityOutput_in.isPartnerPresent() || bottleQuantityOutput_in.isPartnerPreempted()){//sysj\plant.sysj line: 26, column: 4
                  bottleQuantityOutput_in.setACK(false);//sysj\plant.sysj line: 26, column: 4
                  S325=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S320=0;
                  if(!bottleQuantityOutput_in.isREQ()){//sysj\plant.sysj line: 26, column: 4
                    bottleQuantityOutput_in.setACK(true);//sysj\plant.sysj line: 26, column: 4
                    S320=1;
                    if(bottleQuantityOutput_in.isREQ()){//sysj\plant.sysj line: 26, column: 4
                      bottleQuantityOutput_in.setACK(false);//sysj\plant.sysj line: 26, column: 4
                      ends[2]=2;
                      ;//sysj\plant.sysj line: 26, column: 4
                      bottles_thread_2 = (Integer)(bottleQuantityOutput_in.getVal() == null ? 0 : ((Integer)bottleQuantityOutput_in.getVal()).intValue());//sysj\plant.sysj line: 27, column: 4
                      System.out.println("Bottle Quantity: " + bottles_thread_2);//sysj\plant.sysj line: 28, column: 4
                      S363=1;
                      S370=0;
                      if(!liquidMixOutput_in.isPartnerPresent() || liquidMixOutput_in.isPartnerPreempted()){//sysj\plant.sysj line: 29, column: 4
                        liquidMixOutput_in.setACK(false);//sysj\plant.sysj line: 29, column: 4
                        S370=1;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
                        S365=0;
                        if(!liquidMixOutput_in.isREQ()){//sysj\plant.sysj line: 29, column: 4
                          liquidMixOutput_in.setACK(true);//sysj\plant.sysj line: 29, column: 4
                          S365=1;
                          if(liquidMixOutput_in.isREQ()){//sysj\plant.sysj line: 29, column: 4
                            liquidMixOutput_in.setACK(false);//sysj\plant.sysj line: 29, column: 4
                            ends[2]=2;
                            ;//sysj\plant.sysj line: 29, column: 4
                            liquidMix_thread_2 = "";//sysj\plant.sysj line: 30, column: 4
                            liquidMix_thread_2 = (String)(liquidMixOutput_in.getVal() == null ? null : ((String)liquidMixOutput_in.getVal()));//sysj\plant.sysj line: 31, column: 4
                            System.out.println("Liquid Mix: " + liquidMix_thread_2);//sysj\plant.sysj line: 32, column: 4
                            bottlesDone_thread_2 = 0;//sysj\plant.sysj line: 34, column: 4
                            S363=2;
                            if(bottlesDone_thread_2 != bottles_thread_2){//sysj\plant.sysj line: 36, column: 10
                              S458=0;
                              botPos1.setPresent();//sysj\plant.sysj line: 39, column: 7
                              currsigs.addElement(botPos1);
                              tableAligned.setPresent();//sysj\plant.sysj line: 40, column: 7
                              currsigs.addElement(tableAligned);
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              ends[2]=2;
                              ;//sysj\plant.sysj line: 36, column: 4
                              S363=3;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                          else {
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                        else {
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                      }
                    }
                    else {
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                  else {
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            switch(S370){
              case 0 : 
                if(!liquidMixOutput_in.isPartnerPresent() || liquidMixOutput_in.isPartnerPreempted()){//sysj\plant.sysj line: 29, column: 4
                  liquidMixOutput_in.setACK(false);//sysj\plant.sysj line: 29, column: 4
                  S370=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  switch(S365){
                    case 0 : 
                      if(!liquidMixOutput_in.isREQ()){//sysj\plant.sysj line: 29, column: 4
                        liquidMixOutput_in.setACK(true);//sysj\plant.sysj line: 29, column: 4
                        S365=1;
                        if(liquidMixOutput_in.isREQ()){//sysj\plant.sysj line: 29, column: 4
                          liquidMixOutput_in.setACK(false);//sysj\plant.sysj line: 29, column: 4
                          ends[2]=2;
                          ;//sysj\plant.sysj line: 29, column: 4
                          liquidMix_thread_2 = "";//sysj\plant.sysj line: 30, column: 4
                          liquidMix_thread_2 = (String)(liquidMixOutput_in.getVal() == null ? null : ((String)liquidMixOutput_in.getVal()));//sysj\plant.sysj line: 31, column: 4
                          System.out.println("Liquid Mix: " + liquidMix_thread_2);//sysj\plant.sysj line: 32, column: 4
                          bottlesDone_thread_2 = 0;//sysj\plant.sysj line: 34, column: 4
                          S363=2;
                          if(bottlesDone_thread_2 != bottles_thread_2){//sysj\plant.sysj line: 36, column: 10
                            S458=0;
                            botPos1.setPresent();//sysj\plant.sysj line: 39, column: 7
                            currsigs.addElement(botPos1);
                            tableAligned.setPresent();//sysj\plant.sysj line: 40, column: 7
                            currsigs.addElement(tableAligned);
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            ends[2]=2;
                            ;//sysj\plant.sysj line: 36, column: 4
                            S363=3;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                        else {
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                      }
                      else {
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(liquidMixOutput_in.isREQ()){//sysj\plant.sysj line: 29, column: 4
                        liquidMixOutput_in.setACK(false);//sysj\plant.sysj line: 29, column: 4
                        ends[2]=2;
                        ;//sysj\plant.sysj line: 29, column: 4
                        liquidMix_thread_2 = "";//sysj\plant.sysj line: 30, column: 4
                        liquidMix_thread_2 = (String)(liquidMixOutput_in.getVal() == null ? null : ((String)liquidMixOutput_in.getVal()));//sysj\plant.sysj line: 31, column: 4
                        System.out.println("Liquid Mix: " + liquidMix_thread_2);//sysj\plant.sysj line: 32, column: 4
                        bottlesDone_thread_2 = 0;//sysj\plant.sysj line: 34, column: 4
                        S363=2;
                        if(bottlesDone_thread_2 != bottles_thread_2){//sysj\plant.sysj line: 36, column: 10
                          S458=0;
                          botPos1.setPresent();//sysj\plant.sysj line: 39, column: 7
                          currsigs.addElement(botPos1);
                          tableAligned.setPresent();//sysj\plant.sysj line: 40, column: 7
                          currsigs.addElement(tableAligned);
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          ends[2]=2;
                          ;//sysj\plant.sysj line: 36, column: 4
                          S363=3;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                      }
                      else {
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S370=1;
                S370=0;
                if(!liquidMixOutput_in.isPartnerPresent() || liquidMixOutput_in.isPartnerPreempted()){//sysj\plant.sysj line: 29, column: 4
                  liquidMixOutput_in.setACK(false);//sysj\plant.sysj line: 29, column: 4
                  S370=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S365=0;
                  if(!liquidMixOutput_in.isREQ()){//sysj\plant.sysj line: 29, column: 4
                    liquidMixOutput_in.setACK(true);//sysj\plant.sysj line: 29, column: 4
                    S365=1;
                    if(liquidMixOutput_in.isREQ()){//sysj\plant.sysj line: 29, column: 4
                      liquidMixOutput_in.setACK(false);//sysj\plant.sysj line: 29, column: 4
                      ends[2]=2;
                      ;//sysj\plant.sysj line: 29, column: 4
                      liquidMix_thread_2 = "";//sysj\plant.sysj line: 30, column: 4
                      liquidMix_thread_2 = (String)(liquidMixOutput_in.getVal() == null ? null : ((String)liquidMixOutput_in.getVal()));//sysj\plant.sysj line: 31, column: 4
                      System.out.println("Liquid Mix: " + liquidMix_thread_2);//sysj\plant.sysj line: 32, column: 4
                      bottlesDone_thread_2 = 0;//sysj\plant.sysj line: 34, column: 4
                      S363=2;
                      if(bottlesDone_thread_2 != bottles_thread_2){//sysj\plant.sysj line: 36, column: 10
                        S458=0;
                        botPos1.setPresent();//sysj\plant.sysj line: 39, column: 7
                        currsigs.addElement(botPos1);
                        tableAligned.setPresent();//sysj\plant.sysj line: 40, column: 7
                        currsigs.addElement(tableAligned);
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
                        ends[2]=2;
                        ;//sysj\plant.sysj line: 36, column: 4
                        S363=3;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                    }
                    else {
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                  else {
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 2 : 
            switch(S458){
              case 0 : 
                if(rotate.getprestatus()){//sysj\plant.sysj line: 37, column: 11
                  S458=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  botPos1.setPresent();//sysj\plant.sysj line: 39, column: 7
                  currsigs.addElement(botPos1);
                  tableAligned.setPresent();//sysj\plant.sysj line: 40, column: 7
                  currsigs.addElement(tableAligned);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
              case 1 : 
                if(!rotate.getprestatus()){//sysj\plant.sysj line: 45, column: 11
                  S458=2;
                  botPos2.setPresent();//sysj\plant.sysj line: 50, column: 7
                  currsigs.addElement(botPos2);
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
              
              case 2 : 
                if(bottleAtPos1.getprestatus() && rotate.getprestatus()){//sysj\plant.sysj line: 47, column: 11
                  S458=3;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  botPos2.setPresent();//sysj\plant.sysj line: 50, column: 7
                  currsigs.addElement(botPos2);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
              case 3 : 
                if(!rotate.getprestatus()){//sysj\plant.sysj line: 55, column: 11
                  S458=4;
                  botPos3.setPresent();//sysj\plant.sysj line: 59, column: 7
                  currsigs.addElement(botPos3);
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
              
              case 4 : 
                if(bottleAtPos2.getprestatus() && rotate.getprestatus()){//sysj\plant.sysj line: 57, column: 11
                  S458=5;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  botPos3.setPresent();//sysj\plant.sysj line: 59, column: 7
                  currsigs.addElement(botPos3);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
              case 5 : 
                if(!rotate.getprestatus()){//sysj\plant.sysj line: 63, column: 12
                  S458=6;
                  botPos4.setPresent();//sysj\plant.sysj line: 67, column: 7
                  currsigs.addElement(botPos4);
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
              
              case 6 : 
                if(bottleAtPos3.getprestatus() && rotate.getprestatus()){//sysj\plant.sysj line: 65, column: 11
                  S458=7;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  botPos4.setPresent();//sysj\plant.sysj line: 67, column: 7
                  currsigs.addElement(botPos4);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
              case 7 : 
                if(!rotate.getprestatus()){//sysj\plant.sysj line: 71, column: 12
                  S458=8;
                  botPos5.setPresent();//sysj\plant.sysj line: 75, column: 7
                  currsigs.addElement(botPos5);
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
              
              case 8 : 
                if(bottleAtPos4.getprestatus() && rotate.getprestatus()){//sysj\plant.sysj line: 73, column: 11
                  S458=9;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  botPos5.setPresent();//sysj\plant.sysj line: 75, column: 7
                  currsigs.addElement(botPos5);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
              case 9 : 
                if(!rotate.getprestatus()){//sysj\plant.sysj line: 79, column: 11
                  tableAligned.setPresent();//sysj\plant.sysj line: 82, column: 6
                  currsigs.addElement(tableAligned);
                  bottlesDone_thread_2 = bottlesDone_thread_2 + 1;//sysj\plant.sysj line: 83, column: 6
                  System.out.println(bottlesDone_thread_2);//sysj\plant.sysj line: 84, column: 6
                  System.out.println("Bottle Loc: To Labelling");//sysj\plant.sysj line: 85, column: 6
                  S458=10;
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
              
              case 10 : 
                S458=10;
                if(bottlesDone_thread_2 != bottles_thread_2){//sysj\plant.sysj line: 36, column: 10
                  S458=0;
                  botPos1.setPresent();//sysj\plant.sysj line: 39, column: 7
                  currsigs.addElement(botPos1);
                  tableAligned.setPresent();//sysj\plant.sysj line: 40, column: 7
                  currsigs.addElement(tableAligned);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  ends[2]=2;
                  ;//sysj\plant.sysj line: 36, column: 4
                  S363=3;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
            }
            break;
          
          case 3 : 
            S363=3;
            bottles_thread_2 = 0;//sysj\plant.sysj line: 25, column: 4
            S363=0;
            S325=0;
            if(!bottleQuantityOutput_in.isPartnerPresent() || bottleQuantityOutput_in.isPartnerPreempted()){//sysj\plant.sysj line: 26, column: 4
              bottleQuantityOutput_in.setACK(false);//sysj\plant.sysj line: 26, column: 4
              S325=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              S320=0;
              if(!bottleQuantityOutput_in.isREQ()){//sysj\plant.sysj line: 26, column: 4
                bottleQuantityOutput_in.setACK(true);//sysj\plant.sysj line: 26, column: 4
                S320=1;
                if(bottleQuantityOutput_in.isREQ()){//sysj\plant.sysj line: 26, column: 4
                  bottleQuantityOutput_in.setACK(false);//sysj\plant.sysj line: 26, column: 4
                  ends[2]=2;
                  ;//sysj\plant.sysj line: 26, column: 4
                  bottles_thread_2 = (Integer)(bottleQuantityOutput_in.getVal() == null ? 0 : ((Integer)bottleQuantityOutput_in.getVal()).intValue());//sysj\plant.sysj line: 27, column: 4
                  System.out.println("Bottle Quantity: " + bottles_thread_2);//sysj\plant.sysj line: 28, column: 4
                  S363=1;
                  S370=0;
                  if(!liquidMixOutput_in.isPartnerPresent() || liquidMixOutput_in.isPartnerPreempted()){//sysj\plant.sysj line: 29, column: 4
                    liquidMixOutput_in.setACK(false);//sysj\plant.sysj line: 29, column: 4
                    S370=1;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S365=0;
                    if(!liquidMixOutput_in.isREQ()){//sysj\plant.sysj line: 29, column: 4
                      liquidMixOutput_in.setACK(true);//sysj\plant.sysj line: 29, column: 4
                      S365=1;
                      if(liquidMixOutput_in.isREQ()){//sysj\plant.sysj line: 29, column: 4
                        liquidMixOutput_in.setACK(false);//sysj\plant.sysj line: 29, column: 4
                        ends[2]=2;
                        ;//sysj\plant.sysj line: 29, column: 4
                        liquidMix_thread_2 = "";//sysj\plant.sysj line: 30, column: 4
                        liquidMix_thread_2 = (String)(liquidMixOutput_in.getVal() == null ? null : ((String)liquidMixOutput_in.getVal()));//sysj\plant.sysj line: 31, column: 4
                        System.out.println("Liquid Mix: " + liquidMix_thread_2);//sysj\plant.sysj line: 32, column: 4
                        bottlesDone_thread_2 = 0;//sysj\plant.sysj line: 34, column: 4
                        S363=2;
                        if(bottlesDone_thread_2 != bottles_thread_2){//sysj\plant.sysj line: 36, column: 10
                          S458=0;
                          botPos1.setPresent();//sysj\plant.sysj line: 39, column: 7
                          currsigs.addElement(botPos1);
                          tableAligned.setPresent();//sysj\plant.sysj line: 40, column: 7
                          currsigs.addElement(tableAligned);
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          ends[2]=2;
                          ;//sysj\plant.sysj line: 36, column: 4
                          S363=3;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                      }
                      else {
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                    }
                    else {
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                }
                else {
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
              else {
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread14892(int [] tdone, int [] ends){
        S3585=1;
    if(botPos5.getprestatus()){//sysj\plant.sysj line: 103, column: 24
      labelTriggerE.setPresent();//sysj\plant.sysj line: 103, column: 33
      currsigs.addElement(labelTriggerE);
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

  public void thread14891(int [] tdone, int [] ends){
        S3577=1;
    if(botPos4.getprestatus()){//sysj\plant.sysj line: 101, column: 24
      capScrewTriggerE.setPresent();//sysj\plant.sysj line: 101, column: 33
      currsigs.addElement(capScrewTriggerE);
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

  public void thread14890(int [] tdone, int [] ends){
        S3569=1;
    if(botPos3.getprestatus()){//sysj\plant.sysj line: 99, column: 24
      lidloaderTriggerE.setPresent();//sysj\plant.sysj line: 99, column: 33
      currsigs.addElement(lidloaderTriggerE);
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

  public void thread14889(int [] tdone, int [] ends){
        S3561=1;
    if(botPos2.getprestatus()){//sysj\plant.sysj line: 97, column: 24
      fillerTriggerE.setPresent();//sysj\plant.sysj line: 97, column: 33
      currsigs.addElement(fillerTriggerE);
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread14888(int [] tdone, int [] ends){
        S3553=1;
    if(botPos1.getprestatus()){//sysj\plant.sysj line: 95, column: 24
      conBeltTriggerE.setPresent();//sysj\plant.sysj line: 95, column: 33
      currsigs.addElement(conBeltTriggerE);
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread14887(int [] tdone, int [] ends){
        S3587=1;
    thread14888(tdone,ends);
    thread14889(tdone,ends);
    thread14890(tdone,ends);
    thread14891(tdone,ends);
    thread14892(tdone,ends);
    int biggest14893 = 0;
    if(ends[4]>=biggest14893){
      biggest14893=ends[4];
    }
    if(ends[5]>=biggest14893){
      biggest14893=ends[5];
    }
    if(ends[6]>=biggest14893){
      biggest14893=ends[6];
    }
    if(ends[7]>=biggest14893){
      biggest14893=ends[7];
    }
    if(ends[8]>=biggest14893){
      biggest14893=ends[8];
    }
    if(biggest14893 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread14886(int [] tdone, int [] ends){
        S3545=1;
    bottles_thread_2 = 0;//sysj\plant.sysj line: 25, column: 4
    S363=0;
    S325=0;
    if(!bottleQuantityOutput_in.isPartnerPresent() || bottleQuantityOutput_in.isPartnerPreempted()){//sysj\plant.sysj line: 26, column: 4
      bottleQuantityOutput_in.setACK(false);//sysj\plant.sysj line: 26, column: 4
      S325=1;
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      S320=0;
      if(!bottleQuantityOutput_in.isREQ()){//sysj\plant.sysj line: 26, column: 4
        bottleQuantityOutput_in.setACK(true);//sysj\plant.sysj line: 26, column: 4
        S320=1;
        if(bottleQuantityOutput_in.isREQ()){//sysj\plant.sysj line: 26, column: 4
          bottleQuantityOutput_in.setACK(false);//sysj\plant.sysj line: 26, column: 4
          ends[2]=2;
          ;//sysj\plant.sysj line: 26, column: 4
          bottles_thread_2 = (Integer)(bottleQuantityOutput_in.getVal() == null ? 0 : ((Integer)bottleQuantityOutput_in.getVal()).intValue());//sysj\plant.sysj line: 27, column: 4
          System.out.println("Bottle Quantity: " + bottles_thread_2);//sysj\plant.sysj line: 28, column: 4
          S363=1;
          S370=0;
          if(!liquidMixOutput_in.isPartnerPresent() || liquidMixOutput_in.isPartnerPreempted()){//sysj\plant.sysj line: 29, column: 4
            liquidMixOutput_in.setACK(false);//sysj\plant.sysj line: 29, column: 4
            S370=1;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
          }
          else {
            S365=0;
            if(!liquidMixOutput_in.isREQ()){//sysj\plant.sysj line: 29, column: 4
              liquidMixOutput_in.setACK(true);//sysj\plant.sysj line: 29, column: 4
              S365=1;
              if(liquidMixOutput_in.isREQ()){//sysj\plant.sysj line: 29, column: 4
                liquidMixOutput_in.setACK(false);//sysj\plant.sysj line: 29, column: 4
                ends[2]=2;
                ;//sysj\plant.sysj line: 29, column: 4
                liquidMix_thread_2 = "";//sysj\plant.sysj line: 30, column: 4
                liquidMix_thread_2 = (String)(liquidMixOutput_in.getVal() == null ? null : ((String)liquidMixOutput_in.getVal()));//sysj\plant.sysj line: 31, column: 4
                System.out.println("Liquid Mix: " + liquidMix_thread_2);//sysj\plant.sysj line: 32, column: 4
                bottlesDone_thread_2 = 0;//sysj\plant.sysj line: 34, column: 4
                S363=2;
                if(bottlesDone_thread_2 != bottles_thread_2){//sysj\plant.sysj line: 36, column: 10
                  S458=0;
                  botPos1.setPresent();//sysj\plant.sysj line: 39, column: 7
                  currsigs.addElement(botPos1);
                  tableAligned.setPresent();//sysj\plant.sysj line: 40, column: 7
                  currsigs.addElement(tableAligned);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  ends[2]=2;
                  ;//sysj\plant.sysj line: 36, column: 4
                  S363=3;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
              else {
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
          }
        }
        else {
          active[2]=1;
          ends[2]=1;
          tdone[2]=1;
        }
      }
      else {
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
      }
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S6858){
        case 0 : 
          S6858=0;
          break RUN;
        
        case 1 : 
          S6858=2;
          S6858=2;
          new Thread(new GUI()).start();//sysj\plant.sysj line: 16, column: 2
          thread14886(tdone,ends);
          thread14887(tdone,ends);
          int biggest14894 = 0;
          if(ends[2]>=biggest14894){
            biggest14894=ends[2];
          }
          if(ends[3]>=biggest14894){
            biggest14894=ends[3];
          }
          if(biggest14894 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread14895(tdone,ends);
          thread14896(tdone,ends);
          int biggest14903 = 0;
          if(ends[2]>=biggest14903){
            biggest14903=ends[2];
          }
          if(ends[3]>=biggest14903){
            biggest14903=ends[3];
          }
          if(biggest14903 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest14903 == 0){
            S6858=0;
            active[1]=0;
            ends[1]=0;
            S6858=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
          liquidMixOutput_in.gethook();
          bottleQuantityOutput_in.gethook();
          orderDoneFlag_o.gethook();
          capOnBottleAtPos1.gethook();
          tableAlignedWithSensor.gethook();
          bottleAtPos1.gethook();
          bottleAtPos2.gethook();
          bottleAtPos3.gethook();
          bottleAtPos4.gethook();
          bottleAtPos5.gethook();
          rotate.gethook();
          df = true;
        }
        runClockDomain();
      }
      capOnBottleAtPos1.setpreclear();
      tableAlignedWithSensor.setpreclear();
      bottleAtPos1.setpreclear();
      bottleAtPos2.setpreclear();
      bottleAtPos3.setpreclear();
      bottleAtPos4.setpreclear();
      bottleAtPos5.setpreclear();
      rotate.setpreclear();
      capOnPos1.setpreclear();
      tableAligned.setpreclear();
      botPos1.setpreclear();
      botPos2.setpreclear();
      botPos3.setpreclear();
      botPos4.setpreclear();
      botPos5.setpreclear();
      conBeltTriggerE.setpreclear();
      fillerTriggerE.setpreclear();
      lidloaderTriggerE.setpreclear();
      capScrewTriggerE.setpreclear();
      labelTriggerE.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = capOnBottleAtPos1.getStatus() ? capOnBottleAtPos1.setprepresent() : capOnBottleAtPos1.setpreclear();
      capOnBottleAtPos1.setpreval(capOnBottleAtPos1.getValue());
      capOnBottleAtPos1.setClear();
      dummyint = tableAlignedWithSensor.getStatus() ? tableAlignedWithSensor.setprepresent() : tableAlignedWithSensor.setpreclear();
      tableAlignedWithSensor.setpreval(tableAlignedWithSensor.getValue());
      tableAlignedWithSensor.setClear();
      dummyint = bottleAtPos1.getStatus() ? bottleAtPos1.setprepresent() : bottleAtPos1.setpreclear();
      bottleAtPos1.setpreval(bottleAtPos1.getValue());
      bottleAtPos1.setClear();
      dummyint = bottleAtPos2.getStatus() ? bottleAtPos2.setprepresent() : bottleAtPos2.setpreclear();
      bottleAtPos2.setpreval(bottleAtPos2.getValue());
      bottleAtPos2.setClear();
      dummyint = bottleAtPos3.getStatus() ? bottleAtPos3.setprepresent() : bottleAtPos3.setpreclear();
      bottleAtPos3.setpreval(bottleAtPos3.getValue());
      bottleAtPos3.setClear();
      dummyint = bottleAtPos4.getStatus() ? bottleAtPos4.setprepresent() : bottleAtPos4.setpreclear();
      bottleAtPos4.setpreval(bottleAtPos4.getValue());
      bottleAtPos4.setClear();
      dummyint = bottleAtPos5.getStatus() ? bottleAtPos5.setprepresent() : bottleAtPos5.setpreclear();
      bottleAtPos5.setpreval(bottleAtPos5.getValue());
      bottleAtPos5.setClear();
      dummyint = rotate.getStatus() ? rotate.setprepresent() : rotate.setpreclear();
      rotate.setpreval(rotate.getValue());
      rotate.setClear();
      capOnPos1.sethook();
      capOnPos1.setClear();
      tableAligned.sethook();
      tableAligned.setClear();
      botPos1.sethook();
      botPos1.setClear();
      botPos2.sethook();
      botPos2.setClear();
      botPos3.sethook();
      botPos3.setClear();
      botPos4.sethook();
      botPos4.setClear();
      botPos5.sethook();
      botPos5.setClear();
      conBeltTriggerE.sethook();
      conBeltTriggerE.setClear();
      fillerTriggerE.sethook();
      fillerTriggerE.setClear();
      lidloaderTriggerE.sethook();
      lidloaderTriggerE.setClear();
      capScrewTriggerE.sethook();
      capScrewTriggerE.setClear();
      labelTriggerE.sethook();
      labelTriggerE.setClear();
      liquidMixOutput_in.sethook();
      bottleQuantityOutput_in.sethook();
      orderDoneFlag_o.sethook();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        liquidMixOutput_in.gethook();
        bottleQuantityOutput_in.gethook();
        orderDoneFlag_o.gethook();
        capOnBottleAtPos1.gethook();
        tableAlignedWithSensor.gethook();
        bottleAtPos1.gethook();
        bottleAtPos2.gethook();
        bottleAtPos3.gethook();
        bottleAtPos4.gethook();
        bottleAtPos5.gethook();
        rotate.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
