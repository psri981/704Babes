import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import run.GUI;//sysj\plant.sysj line: 1, column: 1
import run.POS_GUI;//sysj\plant.sysj line: 2, column: 1
import run.ECS_GUI;//sysj\plant.sysj line: 3, column: 1
import run.ACS_GUI;//sysj\plant.sysj line: 4, column: 1

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
  private Integer bottles_thread_2;//sysj\plant.sysj line: 26, column: 4
  private String liquidMix_thread_2;//sysj\plant.sysj line: 31, column: 4
  private Integer bottlesDone_thread_2;//sysj\plant.sysj line: 35, column: 4
  private int S58856 = 1;
  private int S55543 = 1;
  private int S52361 = 1;
  private int S52323 = 1;
  private int S52318 = 1;
  private int S52368 = 1;
  private int S52363 = 1;
  private int S52456 = 1;
  private int S55585 = 1;
  private int S55551 = 1;
  private int S55559 = 1;
  private int S55567 = 1;
  private int S55575 = 1;
  private int S55583 = 1;
  
  private int[] ends = new int[65];
  private int[] tdone = new int[65];
  
  public void thread68305(int [] tdone, int [] ends){
        switch(S55583){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(botPos5.getprestatus()){//sysj\plant.sysj line: 104, column: 24
          labelTriggerE.setPresent();//sysj\plant.sysj line: 104, column: 33
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

  public void thread68304(int [] tdone, int [] ends){
        switch(S55575){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(botPos4.getprestatus()){//sysj\plant.sysj line: 102, column: 24
          capScrewTriggerE.setPresent();//sysj\plant.sysj line: 102, column: 33
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

  public void thread68303(int [] tdone, int [] ends){
        switch(S55567){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(botPos3.getprestatus()){//sysj\plant.sysj line: 100, column: 24
          lidloaderTriggerE.setPresent();//sysj\plant.sysj line: 100, column: 33
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

  public void thread68302(int [] tdone, int [] ends){
        switch(S55559){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(botPos2.getprestatus()){//sysj\plant.sysj line: 98, column: 24
          fillerTriggerE.setPresent();//sysj\plant.sysj line: 98, column: 33
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

  public void thread68301(int [] tdone, int [] ends){
        switch(S55551){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        if(botPos1.getprestatus()){//sysj\plant.sysj line: 96, column: 24
          conBeltTriggerE.setPresent();//sysj\plant.sysj line: 96, column: 33
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

  public void thread68300(int [] tdone, int [] ends){
        switch(S55585){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        thread68301(tdone,ends);
        thread68302(tdone,ends);
        thread68303(tdone,ends);
        thread68304(tdone,ends);
        thread68305(tdone,ends);
        int biggest68306 = 0;
        if(ends[4]>=biggest68306){
          biggest68306=ends[4];
        }
        if(ends[5]>=biggest68306){
          biggest68306=ends[5];
        }
        if(ends[6]>=biggest68306){
          biggest68306=ends[6];
        }
        if(ends[7]>=biggest68306){
          biggest68306=ends[7];
        }
        if(ends[8]>=biggest68306){
          biggest68306=ends[8];
        }
        if(biggest68306 == 1){
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        //FINXME code
        if(biggest68306 == 0){
          S55585=0;
          active[3]=0;
          ends[3]=0;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread68299(int [] tdone, int [] ends){
        switch(S55543){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S52361){
          case 0 : 
            switch(S52323){
              case 0 : 
                if(!bottleQuantityOutput_in.isPartnerPresent() || bottleQuantityOutput_in.isPartnerPreempted()){//sysj\plant.sysj line: 27, column: 4
                  bottleQuantityOutput_in.setACK(false);//sysj\plant.sysj line: 27, column: 4
                  S52323=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  switch(S52318){
                    case 0 : 
                      if(!bottleQuantityOutput_in.isREQ()){//sysj\plant.sysj line: 27, column: 4
                        bottleQuantityOutput_in.setACK(true);//sysj\plant.sysj line: 27, column: 4
                        S52318=1;
                        if(bottleQuantityOutput_in.isREQ()){//sysj\plant.sysj line: 27, column: 4
                          bottleQuantityOutput_in.setACK(false);//sysj\plant.sysj line: 27, column: 4
                          ends[2]=2;
                          ;//sysj\plant.sysj line: 27, column: 4
                          bottles_thread_2 = (Integer)(bottleQuantityOutput_in.getVal() == null ? 0 : ((Integer)bottleQuantityOutput_in.getVal()).intValue());//sysj\plant.sysj line: 28, column: 4
                          System.out.println("Bottle Quantity: " + bottles_thread_2);//sysj\plant.sysj line: 29, column: 4
                          S52361=1;
                          S52368=0;
                          if(!liquidMixOutput_in.isPartnerPresent() || liquidMixOutput_in.isPartnerPreempted()){//sysj\plant.sysj line: 30, column: 4
                            liquidMixOutput_in.setACK(false);//sysj\plant.sysj line: 30, column: 4
                            S52368=1;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S52363=0;
                            if(!liquidMixOutput_in.isREQ()){//sysj\plant.sysj line: 30, column: 4
                              liquidMixOutput_in.setACK(true);//sysj\plant.sysj line: 30, column: 4
                              S52363=1;
                              if(liquidMixOutput_in.isREQ()){//sysj\plant.sysj line: 30, column: 4
                                liquidMixOutput_in.setACK(false);//sysj\plant.sysj line: 30, column: 4
                                ends[2]=2;
                                ;//sysj\plant.sysj line: 30, column: 4
                                liquidMix_thread_2 = "";//sysj\plant.sysj line: 31, column: 4
                                liquidMix_thread_2 = (String)(liquidMixOutput_in.getVal() == null ? null : ((String)liquidMixOutput_in.getVal()));//sysj\plant.sysj line: 32, column: 4
                                System.out.println("Liquid Mix: " + liquidMix_thread_2);//sysj\plant.sysj line: 33, column: 4
                                bottlesDone_thread_2 = 0;//sysj\plant.sysj line: 35, column: 4
                                S52361=2;
                                if(bottlesDone_thread_2 != bottles_thread_2){//sysj\plant.sysj line: 37, column: 10
                                  S52456=0;
                                  botPos1.setPresent();//sysj\plant.sysj line: 40, column: 7
                                  currsigs.addElement(botPos1);
                                  tableAligned.setPresent();//sysj\plant.sysj line: 41, column: 7
                                  currsigs.addElement(tableAligned);
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                                else {
                                  ends[2]=2;
                                  ;//sysj\plant.sysj line: 37, column: 4
                                  S52361=3;
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
                      if(bottleQuantityOutput_in.isREQ()){//sysj\plant.sysj line: 27, column: 4
                        bottleQuantityOutput_in.setACK(false);//sysj\plant.sysj line: 27, column: 4
                        ends[2]=2;
                        ;//sysj\plant.sysj line: 27, column: 4
                        bottles_thread_2 = (Integer)(bottleQuantityOutput_in.getVal() == null ? 0 : ((Integer)bottleQuantityOutput_in.getVal()).intValue());//sysj\plant.sysj line: 28, column: 4
                        System.out.println("Bottle Quantity: " + bottles_thread_2);//sysj\plant.sysj line: 29, column: 4
                        S52361=1;
                        S52368=0;
                        if(!liquidMixOutput_in.isPartnerPresent() || liquidMixOutput_in.isPartnerPreempted()){//sysj\plant.sysj line: 30, column: 4
                          liquidMixOutput_in.setACK(false);//sysj\plant.sysj line: 30, column: 4
                          S52368=1;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          S52363=0;
                          if(!liquidMixOutput_in.isREQ()){//sysj\plant.sysj line: 30, column: 4
                            liquidMixOutput_in.setACK(true);//sysj\plant.sysj line: 30, column: 4
                            S52363=1;
                            if(liquidMixOutput_in.isREQ()){//sysj\plant.sysj line: 30, column: 4
                              liquidMixOutput_in.setACK(false);//sysj\plant.sysj line: 30, column: 4
                              ends[2]=2;
                              ;//sysj\plant.sysj line: 30, column: 4
                              liquidMix_thread_2 = "";//sysj\plant.sysj line: 31, column: 4
                              liquidMix_thread_2 = (String)(liquidMixOutput_in.getVal() == null ? null : ((String)liquidMixOutput_in.getVal()));//sysj\plant.sysj line: 32, column: 4
                              System.out.println("Liquid Mix: " + liquidMix_thread_2);//sysj\plant.sysj line: 33, column: 4
                              bottlesDone_thread_2 = 0;//sysj\plant.sysj line: 35, column: 4
                              S52361=2;
                              if(bottlesDone_thread_2 != bottles_thread_2){//sysj\plant.sysj line: 37, column: 10
                                S52456=0;
                                botPos1.setPresent();//sysj\plant.sysj line: 40, column: 7
                                currsigs.addElement(botPos1);
                                tableAligned.setPresent();//sysj\plant.sysj line: 41, column: 7
                                currsigs.addElement(tableAligned);
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                              else {
                                ends[2]=2;
                                ;//sysj\plant.sysj line: 37, column: 4
                                S52361=3;
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
                S52323=1;
                S52323=0;
                if(!bottleQuantityOutput_in.isPartnerPresent() || bottleQuantityOutput_in.isPartnerPreempted()){//sysj\plant.sysj line: 27, column: 4
                  bottleQuantityOutput_in.setACK(false);//sysj\plant.sysj line: 27, column: 4
                  S52323=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S52318=0;
                  if(!bottleQuantityOutput_in.isREQ()){//sysj\plant.sysj line: 27, column: 4
                    bottleQuantityOutput_in.setACK(true);//sysj\plant.sysj line: 27, column: 4
                    S52318=1;
                    if(bottleQuantityOutput_in.isREQ()){//sysj\plant.sysj line: 27, column: 4
                      bottleQuantityOutput_in.setACK(false);//sysj\plant.sysj line: 27, column: 4
                      ends[2]=2;
                      ;//sysj\plant.sysj line: 27, column: 4
                      bottles_thread_2 = (Integer)(bottleQuantityOutput_in.getVal() == null ? 0 : ((Integer)bottleQuantityOutput_in.getVal()).intValue());//sysj\plant.sysj line: 28, column: 4
                      System.out.println("Bottle Quantity: " + bottles_thread_2);//sysj\plant.sysj line: 29, column: 4
                      S52361=1;
                      S52368=0;
                      if(!liquidMixOutput_in.isPartnerPresent() || liquidMixOutput_in.isPartnerPreempted()){//sysj\plant.sysj line: 30, column: 4
                        liquidMixOutput_in.setACK(false);//sysj\plant.sysj line: 30, column: 4
                        S52368=1;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
                        S52363=0;
                        if(!liquidMixOutput_in.isREQ()){//sysj\plant.sysj line: 30, column: 4
                          liquidMixOutput_in.setACK(true);//sysj\plant.sysj line: 30, column: 4
                          S52363=1;
                          if(liquidMixOutput_in.isREQ()){//sysj\plant.sysj line: 30, column: 4
                            liquidMixOutput_in.setACK(false);//sysj\plant.sysj line: 30, column: 4
                            ends[2]=2;
                            ;//sysj\plant.sysj line: 30, column: 4
                            liquidMix_thread_2 = "";//sysj\plant.sysj line: 31, column: 4
                            liquidMix_thread_2 = (String)(liquidMixOutput_in.getVal() == null ? null : ((String)liquidMixOutput_in.getVal()));//sysj\plant.sysj line: 32, column: 4
                            System.out.println("Liquid Mix: " + liquidMix_thread_2);//sysj\plant.sysj line: 33, column: 4
                            bottlesDone_thread_2 = 0;//sysj\plant.sysj line: 35, column: 4
                            S52361=2;
                            if(bottlesDone_thread_2 != bottles_thread_2){//sysj\plant.sysj line: 37, column: 10
                              S52456=0;
                              botPos1.setPresent();//sysj\plant.sysj line: 40, column: 7
                              currsigs.addElement(botPos1);
                              tableAligned.setPresent();//sysj\plant.sysj line: 41, column: 7
                              currsigs.addElement(tableAligned);
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              ends[2]=2;
                              ;//sysj\plant.sysj line: 37, column: 4
                              S52361=3;
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
            switch(S52368){
              case 0 : 
                if(!liquidMixOutput_in.isPartnerPresent() || liquidMixOutput_in.isPartnerPreempted()){//sysj\plant.sysj line: 30, column: 4
                  liquidMixOutput_in.setACK(false);//sysj\plant.sysj line: 30, column: 4
                  S52368=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  switch(S52363){
                    case 0 : 
                      if(!liquidMixOutput_in.isREQ()){//sysj\plant.sysj line: 30, column: 4
                        liquidMixOutput_in.setACK(true);//sysj\plant.sysj line: 30, column: 4
                        S52363=1;
                        if(liquidMixOutput_in.isREQ()){//sysj\plant.sysj line: 30, column: 4
                          liquidMixOutput_in.setACK(false);//sysj\plant.sysj line: 30, column: 4
                          ends[2]=2;
                          ;//sysj\plant.sysj line: 30, column: 4
                          liquidMix_thread_2 = "";//sysj\plant.sysj line: 31, column: 4
                          liquidMix_thread_2 = (String)(liquidMixOutput_in.getVal() == null ? null : ((String)liquidMixOutput_in.getVal()));//sysj\plant.sysj line: 32, column: 4
                          System.out.println("Liquid Mix: " + liquidMix_thread_2);//sysj\plant.sysj line: 33, column: 4
                          bottlesDone_thread_2 = 0;//sysj\plant.sysj line: 35, column: 4
                          S52361=2;
                          if(bottlesDone_thread_2 != bottles_thread_2){//sysj\plant.sysj line: 37, column: 10
                            S52456=0;
                            botPos1.setPresent();//sysj\plant.sysj line: 40, column: 7
                            currsigs.addElement(botPos1);
                            tableAligned.setPresent();//sysj\plant.sysj line: 41, column: 7
                            currsigs.addElement(tableAligned);
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            ends[2]=2;
                            ;//sysj\plant.sysj line: 37, column: 4
                            S52361=3;
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
                      if(liquidMixOutput_in.isREQ()){//sysj\plant.sysj line: 30, column: 4
                        liquidMixOutput_in.setACK(false);//sysj\plant.sysj line: 30, column: 4
                        ends[2]=2;
                        ;//sysj\plant.sysj line: 30, column: 4
                        liquidMix_thread_2 = "";//sysj\plant.sysj line: 31, column: 4
                        liquidMix_thread_2 = (String)(liquidMixOutput_in.getVal() == null ? null : ((String)liquidMixOutput_in.getVal()));//sysj\plant.sysj line: 32, column: 4
                        System.out.println("Liquid Mix: " + liquidMix_thread_2);//sysj\plant.sysj line: 33, column: 4
                        bottlesDone_thread_2 = 0;//sysj\plant.sysj line: 35, column: 4
                        S52361=2;
                        if(bottlesDone_thread_2 != bottles_thread_2){//sysj\plant.sysj line: 37, column: 10
                          S52456=0;
                          botPos1.setPresent();//sysj\plant.sysj line: 40, column: 7
                          currsigs.addElement(botPos1);
                          tableAligned.setPresent();//sysj\plant.sysj line: 41, column: 7
                          currsigs.addElement(tableAligned);
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          ends[2]=2;
                          ;//sysj\plant.sysj line: 37, column: 4
                          S52361=3;
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
                S52368=1;
                S52368=0;
                if(!liquidMixOutput_in.isPartnerPresent() || liquidMixOutput_in.isPartnerPreempted()){//sysj\plant.sysj line: 30, column: 4
                  liquidMixOutput_in.setACK(false);//sysj\plant.sysj line: 30, column: 4
                  S52368=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S52363=0;
                  if(!liquidMixOutput_in.isREQ()){//sysj\plant.sysj line: 30, column: 4
                    liquidMixOutput_in.setACK(true);//sysj\plant.sysj line: 30, column: 4
                    S52363=1;
                    if(liquidMixOutput_in.isREQ()){//sysj\plant.sysj line: 30, column: 4
                      liquidMixOutput_in.setACK(false);//sysj\plant.sysj line: 30, column: 4
                      ends[2]=2;
                      ;//sysj\plant.sysj line: 30, column: 4
                      liquidMix_thread_2 = "";//sysj\plant.sysj line: 31, column: 4
                      liquidMix_thread_2 = (String)(liquidMixOutput_in.getVal() == null ? null : ((String)liquidMixOutput_in.getVal()));//sysj\plant.sysj line: 32, column: 4
                      System.out.println("Liquid Mix: " + liquidMix_thread_2);//sysj\plant.sysj line: 33, column: 4
                      bottlesDone_thread_2 = 0;//sysj\plant.sysj line: 35, column: 4
                      S52361=2;
                      if(bottlesDone_thread_2 != bottles_thread_2){//sysj\plant.sysj line: 37, column: 10
                        S52456=0;
                        botPos1.setPresent();//sysj\plant.sysj line: 40, column: 7
                        currsigs.addElement(botPos1);
                        tableAligned.setPresent();//sysj\plant.sysj line: 41, column: 7
                        currsigs.addElement(tableAligned);
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
                        ends[2]=2;
                        ;//sysj\plant.sysj line: 37, column: 4
                        S52361=3;
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
            switch(S52456){
              case 0 : 
                if(rotate.getprestatus()){//sysj\plant.sysj line: 38, column: 11
                  S52456=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  botPos1.setPresent();//sysj\plant.sysj line: 40, column: 7
                  currsigs.addElement(botPos1);
                  tableAligned.setPresent();//sysj\plant.sysj line: 41, column: 7
                  currsigs.addElement(tableAligned);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
              case 1 : 
                if(!rotate.getprestatus()){//sysj\plant.sysj line: 46, column: 11
                  S52456=2;
                  botPos2.setPresent();//sysj\plant.sysj line: 51, column: 7
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
                if(bottleAtPos1.getprestatus() && rotate.getprestatus()){//sysj\plant.sysj line: 48, column: 11
                  S52456=3;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  botPos2.setPresent();//sysj\plant.sysj line: 51, column: 7
                  currsigs.addElement(botPos2);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
              case 3 : 
                if(!rotate.getprestatus()){//sysj\plant.sysj line: 56, column: 11
                  S52456=4;
                  botPos3.setPresent();//sysj\plant.sysj line: 60, column: 7
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
                if(bottleAtPos2.getprestatus() && rotate.getprestatus()){//sysj\plant.sysj line: 58, column: 11
                  S52456=5;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  botPos3.setPresent();//sysj\plant.sysj line: 60, column: 7
                  currsigs.addElement(botPos3);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
              case 5 : 
                if(!rotate.getprestatus()){//sysj\plant.sysj line: 64, column: 12
                  S52456=6;
                  botPos4.setPresent();//sysj\plant.sysj line: 68, column: 7
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
                if(bottleAtPos3.getprestatus() && rotate.getprestatus()){//sysj\plant.sysj line: 66, column: 11
                  S52456=7;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  botPos4.setPresent();//sysj\plant.sysj line: 68, column: 7
                  currsigs.addElement(botPos4);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
              case 7 : 
                if(!rotate.getprestatus()){//sysj\plant.sysj line: 72, column: 12
                  S52456=8;
                  botPos5.setPresent();//sysj\plant.sysj line: 76, column: 7
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
                if(bottleAtPos4.getprestatus() && rotate.getprestatus()){//sysj\plant.sysj line: 74, column: 11
                  S52456=9;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  botPos5.setPresent();//sysj\plant.sysj line: 76, column: 7
                  currsigs.addElement(botPos5);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
              case 9 : 
                if(!rotate.getprestatus()){//sysj\plant.sysj line: 80, column: 11
                  tableAligned.setPresent();//sysj\plant.sysj line: 83, column: 6
                  currsigs.addElement(tableAligned);
                  bottlesDone_thread_2 = bottlesDone_thread_2 + 1;//sysj\plant.sysj line: 84, column: 6
                  System.out.println(bottlesDone_thread_2);//sysj\plant.sysj line: 85, column: 6
                  System.out.println("Bottle Loc: To Labelling");//sysj\plant.sysj line: 86, column: 6
                  S52456=10;
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
                S52456=10;
                if(bottlesDone_thread_2 != bottles_thread_2){//sysj\plant.sysj line: 37, column: 10
                  S52456=0;
                  botPos1.setPresent();//sysj\plant.sysj line: 40, column: 7
                  currsigs.addElement(botPos1);
                  tableAligned.setPresent();//sysj\plant.sysj line: 41, column: 7
                  currsigs.addElement(tableAligned);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  ends[2]=2;
                  ;//sysj\plant.sysj line: 37, column: 4
                  S52361=3;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
            }
            break;
          
          case 3 : 
            S52361=3;
            bottles_thread_2 = 0;//sysj\plant.sysj line: 26, column: 4
            S52361=0;
            S52323=0;
            if(!bottleQuantityOutput_in.isPartnerPresent() || bottleQuantityOutput_in.isPartnerPreempted()){//sysj\plant.sysj line: 27, column: 4
              bottleQuantityOutput_in.setACK(false);//sysj\plant.sysj line: 27, column: 4
              S52323=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              S52318=0;
              if(!bottleQuantityOutput_in.isREQ()){//sysj\plant.sysj line: 27, column: 4
                bottleQuantityOutput_in.setACK(true);//sysj\plant.sysj line: 27, column: 4
                S52318=1;
                if(bottleQuantityOutput_in.isREQ()){//sysj\plant.sysj line: 27, column: 4
                  bottleQuantityOutput_in.setACK(false);//sysj\plant.sysj line: 27, column: 4
                  ends[2]=2;
                  ;//sysj\plant.sysj line: 27, column: 4
                  bottles_thread_2 = (Integer)(bottleQuantityOutput_in.getVal() == null ? 0 : ((Integer)bottleQuantityOutput_in.getVal()).intValue());//sysj\plant.sysj line: 28, column: 4
                  System.out.println("Bottle Quantity: " + bottles_thread_2);//sysj\plant.sysj line: 29, column: 4
                  S52361=1;
                  S52368=0;
                  if(!liquidMixOutput_in.isPartnerPresent() || liquidMixOutput_in.isPartnerPreempted()){//sysj\plant.sysj line: 30, column: 4
                    liquidMixOutput_in.setACK(false);//sysj\plant.sysj line: 30, column: 4
                    S52368=1;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S52363=0;
                    if(!liquidMixOutput_in.isREQ()){//sysj\plant.sysj line: 30, column: 4
                      liquidMixOutput_in.setACK(true);//sysj\plant.sysj line: 30, column: 4
                      S52363=1;
                      if(liquidMixOutput_in.isREQ()){//sysj\plant.sysj line: 30, column: 4
                        liquidMixOutput_in.setACK(false);//sysj\plant.sysj line: 30, column: 4
                        ends[2]=2;
                        ;//sysj\plant.sysj line: 30, column: 4
                        liquidMix_thread_2 = "";//sysj\plant.sysj line: 31, column: 4
                        liquidMix_thread_2 = (String)(liquidMixOutput_in.getVal() == null ? null : ((String)liquidMixOutput_in.getVal()));//sysj\plant.sysj line: 32, column: 4
                        System.out.println("Liquid Mix: " + liquidMix_thread_2);//sysj\plant.sysj line: 33, column: 4
                        bottlesDone_thread_2 = 0;//sysj\plant.sysj line: 35, column: 4
                        S52361=2;
                        if(bottlesDone_thread_2 != bottles_thread_2){//sysj\plant.sysj line: 37, column: 10
                          S52456=0;
                          botPos1.setPresent();//sysj\plant.sysj line: 40, column: 7
                          currsigs.addElement(botPos1);
                          tableAligned.setPresent();//sysj\plant.sysj line: 41, column: 7
                          currsigs.addElement(tableAligned);
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          ends[2]=2;
                          ;//sysj\plant.sysj line: 37, column: 4
                          S52361=3;
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

  public void thread68296(int [] tdone, int [] ends){
        S55583=1;
    if(botPos5.getprestatus()){//sysj\plant.sysj line: 104, column: 24
      labelTriggerE.setPresent();//sysj\plant.sysj line: 104, column: 33
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

  public void thread68295(int [] tdone, int [] ends){
        S55575=1;
    if(botPos4.getprestatus()){//sysj\plant.sysj line: 102, column: 24
      capScrewTriggerE.setPresent();//sysj\plant.sysj line: 102, column: 33
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

  public void thread68294(int [] tdone, int [] ends){
        S55567=1;
    if(botPos3.getprestatus()){//sysj\plant.sysj line: 100, column: 24
      lidloaderTriggerE.setPresent();//sysj\plant.sysj line: 100, column: 33
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

  public void thread68293(int [] tdone, int [] ends){
        S55559=1;
    if(botPos2.getprestatus()){//sysj\plant.sysj line: 98, column: 24
      fillerTriggerE.setPresent();//sysj\plant.sysj line: 98, column: 33
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

  public void thread68292(int [] tdone, int [] ends){
        S55551=1;
    if(botPos1.getprestatus()){//sysj\plant.sysj line: 96, column: 24
      conBeltTriggerE.setPresent();//sysj\plant.sysj line: 96, column: 33
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

  public void thread68291(int [] tdone, int [] ends){
        S55585=1;
    thread68292(tdone,ends);
    thread68293(tdone,ends);
    thread68294(tdone,ends);
    thread68295(tdone,ends);
    thread68296(tdone,ends);
    int biggest68297 = 0;
    if(ends[4]>=biggest68297){
      biggest68297=ends[4];
    }
    if(ends[5]>=biggest68297){
      biggest68297=ends[5];
    }
    if(ends[6]>=biggest68297){
      biggest68297=ends[6];
    }
    if(ends[7]>=biggest68297){
      biggest68297=ends[7];
    }
    if(ends[8]>=biggest68297){
      biggest68297=ends[8];
    }
    if(biggest68297 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread68290(int [] tdone, int [] ends){
        S55543=1;
    bottles_thread_2 = 0;//sysj\plant.sysj line: 26, column: 4
    S52361=0;
    S52323=0;
    if(!bottleQuantityOutput_in.isPartnerPresent() || bottleQuantityOutput_in.isPartnerPreempted()){//sysj\plant.sysj line: 27, column: 4
      bottleQuantityOutput_in.setACK(false);//sysj\plant.sysj line: 27, column: 4
      S52323=1;
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      S52318=0;
      if(!bottleQuantityOutput_in.isREQ()){//sysj\plant.sysj line: 27, column: 4
        bottleQuantityOutput_in.setACK(true);//sysj\plant.sysj line: 27, column: 4
        S52318=1;
        if(bottleQuantityOutput_in.isREQ()){//sysj\plant.sysj line: 27, column: 4
          bottleQuantityOutput_in.setACK(false);//sysj\plant.sysj line: 27, column: 4
          ends[2]=2;
          ;//sysj\plant.sysj line: 27, column: 4
          bottles_thread_2 = (Integer)(bottleQuantityOutput_in.getVal() == null ? 0 : ((Integer)bottleQuantityOutput_in.getVal()).intValue());//sysj\plant.sysj line: 28, column: 4
          System.out.println("Bottle Quantity: " + bottles_thread_2);//sysj\plant.sysj line: 29, column: 4
          S52361=1;
          S52368=0;
          if(!liquidMixOutput_in.isPartnerPresent() || liquidMixOutput_in.isPartnerPreempted()){//sysj\plant.sysj line: 30, column: 4
            liquidMixOutput_in.setACK(false);//sysj\plant.sysj line: 30, column: 4
            S52368=1;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
          }
          else {
            S52363=0;
            if(!liquidMixOutput_in.isREQ()){//sysj\plant.sysj line: 30, column: 4
              liquidMixOutput_in.setACK(true);//sysj\plant.sysj line: 30, column: 4
              S52363=1;
              if(liquidMixOutput_in.isREQ()){//sysj\plant.sysj line: 30, column: 4
                liquidMixOutput_in.setACK(false);//sysj\plant.sysj line: 30, column: 4
                ends[2]=2;
                ;//sysj\plant.sysj line: 30, column: 4
                liquidMix_thread_2 = "";//sysj\plant.sysj line: 31, column: 4
                liquidMix_thread_2 = (String)(liquidMixOutput_in.getVal() == null ? null : ((String)liquidMixOutput_in.getVal()));//sysj\plant.sysj line: 32, column: 4
                System.out.println("Liquid Mix: " + liquidMix_thread_2);//sysj\plant.sysj line: 33, column: 4
                bottlesDone_thread_2 = 0;//sysj\plant.sysj line: 35, column: 4
                S52361=2;
                if(bottlesDone_thread_2 != bottles_thread_2){//sysj\plant.sysj line: 37, column: 10
                  S52456=0;
                  botPos1.setPresent();//sysj\plant.sysj line: 40, column: 7
                  currsigs.addElement(botPos1);
                  tableAligned.setPresent();//sysj\plant.sysj line: 41, column: 7
                  currsigs.addElement(tableAligned);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  ends[2]=2;
                  ;//sysj\plant.sysj line: 37, column: 4
                  S52361=3;
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
      switch(S58856){
        case 0 : 
          S58856=0;
          break RUN;
        
        case 1 : 
          S58856=2;
          S58856=2;
          new Thread(new GUI()).start();//sysj\plant.sysj line: 17, column: 2
          thread68290(tdone,ends);
          thread68291(tdone,ends);
          int biggest68298 = 0;
          if(ends[2]>=biggest68298){
            biggest68298=ends[2];
          }
          if(ends[3]>=biggest68298){
            biggest68298=ends[3];
          }
          if(biggest68298 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread68299(tdone,ends);
          thread68300(tdone,ends);
          int biggest68307 = 0;
          if(ends[2]>=biggest68307){
            biggest68307=ends[2];
          }
          if(ends[3]>=biggest68307){
            biggest68307=ends[3];
          }
          if(biggest68307 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest68307 == 0){
            S58856=0;
            active[1]=0;
            ends[1]=0;
            S58856=0;
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
