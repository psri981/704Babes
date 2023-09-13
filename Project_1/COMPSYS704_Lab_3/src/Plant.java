import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import run.GUI;//sysj\plant.sysj line: 1, column: 1
import run.POS_GUI;//sysj\plant.sysj line: 2, column: 1

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
  private long __start_thread_2;//sysj\plant.sysj line: 37, column: 34
  private Integer bottles_thread_2;//sysj\plant.sysj line: 22, column: 4
  private Integer bottlesDone_thread_2;//sysj\plant.sysj line: 27, column: 4
  private int S19351 = 1;
  private int S9684 = 1;
  private int S104 = 1;
  private int S111 = 1;
  private int S106 = 1;
  private int S209 = 1;
  private int S179 = 1;
  private int S154 = 1;
  private int S236 = 1;
  private int S292 = 1;
  private int S348 = 1;
  private int S9726 = 1;
  private int S9692 = 1;
  private int S9700 = 1;
  private int S9708 = 1;
  private int S9716 = 1;
  private int S9724 = 1;
  
  private int[] ends = new int[12];
  private int[] tdone = new int[12];
  
  public void thread20186(int [] tdone, int [] ends){
        switch(S9724){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(botPos5.getprestatus()){//sysj\plant.sysj line: 93, column: 24
          labelTriggerE.setPresent();//sysj\plant.sysj line: 93, column: 33
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

  public void thread20185(int [] tdone, int [] ends){
        switch(S9716){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(botPos4.getprestatus()){//sysj\plant.sysj line: 91, column: 24
          capScrewTriggerE.setPresent();//sysj\plant.sysj line: 91, column: 33
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

  public void thread20184(int [] tdone, int [] ends){
        switch(S9708){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(botPos3.getprestatus()){//sysj\plant.sysj line: 89, column: 24
          lidloaderTriggerE.setPresent();//sysj\plant.sysj line: 89, column: 33
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

  public void thread20183(int [] tdone, int [] ends){
        switch(S9700){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(botPos2.getprestatus()){//sysj\plant.sysj line: 87, column: 24
          fillerTriggerE.setPresent();//sysj\plant.sysj line: 87, column: 33
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

  public void thread20182(int [] tdone, int [] ends){
        switch(S9692){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        if(botPos1.getprestatus()){//sysj\plant.sysj line: 85, column: 24
          conBeltTriggerE.setPresent();//sysj\plant.sysj line: 85, column: 33
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

  public void thread20181(int [] tdone, int [] ends){
        switch(S9726){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        thread20182(tdone,ends);
        thread20183(tdone,ends);
        thread20184(tdone,ends);
        thread20185(tdone,ends);
        thread20186(tdone,ends);
        int biggest20187 = 0;
        if(ends[4]>=biggest20187){
          biggest20187=ends[4];
        }
        if(ends[5]>=biggest20187){
          biggest20187=ends[5];
        }
        if(ends[6]>=biggest20187){
          biggest20187=ends[6];
        }
        if(ends[7]>=biggest20187){
          biggest20187=ends[7];
        }
        if(ends[8]>=biggest20187){
          biggest20187=ends[8];
        }
        if(biggest20187 == 1){
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        //FINXME code
        if(biggest20187 == 0){
          S9726=0;
          active[3]=0;
          ends[3]=0;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread20180(int [] tdone, int [] ends){
        switch(S9684){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S104){
          case 0 : 
            switch(S111){
              case 0 : 
                if(!bottleQuantityOutput_in.isPartnerPresent() || bottleQuantityOutput_in.isPartnerPreempted()){//sysj\plant.sysj line: 24, column: 4
                  bottleQuantityOutput_in.setACK(false);//sysj\plant.sysj line: 24, column: 4
                  S111=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  switch(S106){
                    case 0 : 
                      if(!bottleQuantityOutput_in.isREQ()){//sysj\plant.sysj line: 24, column: 4
                        bottleQuantityOutput_in.setACK(true);//sysj\plant.sysj line: 24, column: 4
                        S106=1;
                        if(bottleQuantityOutput_in.isREQ()){//sysj\plant.sysj line: 24, column: 4
                          bottleQuantityOutput_in.setACK(false);//sysj\plant.sysj line: 24, column: 4
                          ends[2]=2;
                          ;//sysj\plant.sysj line: 24, column: 4
                          bottles_thread_2 = (Integer)(bottleQuantityOutput_in.getVal() == null ? 0 : ((Integer)bottleQuantityOutput_in.getVal()).intValue());//sysj\plant.sysj line: 25, column: 4
                          System.out.println(bottles_thread_2);//sysj\plant.sysj line: 26, column: 4
                          bottlesDone_thread_2 = 0;//sysj\plant.sysj line: 27, column: 4
                          S104=1;
                          if(bottlesDone_thread_2 != bottles_thread_2){//sysj\plant.sysj line: 29, column: 10
                            S209=0;
                            botPos1.setPresent();//sysj\plant.sysj line: 32, column: 7
                            currsigs.addElement(botPos1);
                            tableAligned.setPresent();//sysj\plant.sysj line: 33, column: 7
                            currsigs.addElement(tableAligned);
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            ends[2]=2;
                            ;//sysj\plant.sysj line: 29, column: 4
                            S104=2;
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
                      if(bottleQuantityOutput_in.isREQ()){//sysj\plant.sysj line: 24, column: 4
                        bottleQuantityOutput_in.setACK(false);//sysj\plant.sysj line: 24, column: 4
                        ends[2]=2;
                        ;//sysj\plant.sysj line: 24, column: 4
                        bottles_thread_2 = (Integer)(bottleQuantityOutput_in.getVal() == null ? 0 : ((Integer)bottleQuantityOutput_in.getVal()).intValue());//sysj\plant.sysj line: 25, column: 4
                        System.out.println(bottles_thread_2);//sysj\plant.sysj line: 26, column: 4
                        bottlesDone_thread_2 = 0;//sysj\plant.sysj line: 27, column: 4
                        S104=1;
                        if(bottlesDone_thread_2 != bottles_thread_2){//sysj\plant.sysj line: 29, column: 10
                          S209=0;
                          botPos1.setPresent();//sysj\plant.sysj line: 32, column: 7
                          currsigs.addElement(botPos1);
                          tableAligned.setPresent();//sysj\plant.sysj line: 33, column: 7
                          currsigs.addElement(tableAligned);
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          ends[2]=2;
                          ;//sysj\plant.sysj line: 29, column: 4
                          S104=2;
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
                S111=1;
                S111=0;
                if(!bottleQuantityOutput_in.isPartnerPresent() || bottleQuantityOutput_in.isPartnerPreempted()){//sysj\plant.sysj line: 24, column: 4
                  bottleQuantityOutput_in.setACK(false);//sysj\plant.sysj line: 24, column: 4
                  S111=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S106=0;
                  if(!bottleQuantityOutput_in.isREQ()){//sysj\plant.sysj line: 24, column: 4
                    bottleQuantityOutput_in.setACK(true);//sysj\plant.sysj line: 24, column: 4
                    S106=1;
                    if(bottleQuantityOutput_in.isREQ()){//sysj\plant.sysj line: 24, column: 4
                      bottleQuantityOutput_in.setACK(false);//sysj\plant.sysj line: 24, column: 4
                      ends[2]=2;
                      ;//sysj\plant.sysj line: 24, column: 4
                      bottles_thread_2 = (Integer)(bottleQuantityOutput_in.getVal() == null ? 0 : ((Integer)bottleQuantityOutput_in.getVal()).intValue());//sysj\plant.sysj line: 25, column: 4
                      System.out.println(bottles_thread_2);//sysj\plant.sysj line: 26, column: 4
                      bottlesDone_thread_2 = 0;//sysj\plant.sysj line: 27, column: 4
                      S104=1;
                      if(bottlesDone_thread_2 != bottles_thread_2){//sysj\plant.sysj line: 29, column: 10
                        S209=0;
                        botPos1.setPresent();//sysj\plant.sysj line: 32, column: 7
                        currsigs.addElement(botPos1);
                        tableAligned.setPresent();//sysj\plant.sysj line: 33, column: 7
                        currsigs.addElement(tableAligned);
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
                        ends[2]=2;
                        ;//sysj\plant.sysj line: 29, column: 4
                        S104=2;
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
          
          case 1 : 
            switch(S209){
              case 0 : 
                if(rotate.getprestatus()){//sysj\plant.sysj line: 30, column: 11
                  S209=1;
                  S179=0;
                  __start_thread_2 = com.systemj.Timer.getMs();//sysj\plant.sysj line: 37, column: 34
                  S154=0;
                  if(com.systemj.Timer.getMs() - __start_thread_2 >= (2) * 1000){//sysj\plant.sysj line: 37, column: 34
                    ends[2]=7;
                    ;//sysj\plant.sysj line: 37, column: 34
                    S179=1;
                    botPos2.setPresent();//sysj\plant.sysj line: 41, column: 7
                    currsigs.addElement(botPos2);
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S154=1;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                else {
                  botPos1.setPresent();//sysj\plant.sysj line: 32, column: 7
                  currsigs.addElement(botPos1);
                  tableAligned.setPresent();//sysj\plant.sysj line: 33, column: 7
                  currsigs.addElement(tableAligned);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
              case 1 : 
                if(bottleAtPos1.getprestatus() && rotate.getprestatus()){//sysj\plant.sysj line: 37, column: 11
                  S209=2;
                  S236=0;
                  __start_thread_2 = com.systemj.Timer.getMs();//sysj\plant.sysj line: 46, column: 34
                  if(com.systemj.Timer.getMs() - __start_thread_2 >= (2) * 1000){//sysj\plant.sysj line: 46, column: 34
                    ends[2]=6;
                    ;//sysj\plant.sysj line: 46, column: 34
                    S236=1;
                    botPos3.setPresent();//sysj\plant.sysj line: 49, column: 7
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
                }
                else {
                  switch(S179){
                    case 0 : 
                      switch(S154){
                        case 0 : 
                          S154=0;
                          if(com.systemj.Timer.getMs() - __start_thread_2 >= (2) * 1000){//sysj\plant.sysj line: 37, column: 34
                            ends[2]=7;
                            ;//sysj\plant.sysj line: 37, column: 34
                            S179=1;
                            botPos2.setPresent();//sysj\plant.sysj line: 41, column: 7
                            currsigs.addElement(botPos2);
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S154=1;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          break;
                        
                        case 1 : 
                          S154=1;
                          S154=0;
                          if(com.systemj.Timer.getMs() - __start_thread_2 >= (2) * 1000){//sysj\plant.sysj line: 37, column: 34
                            ends[2]=7;
                            ;//sysj\plant.sysj line: 37, column: 34
                            S179=1;
                            botPos2.setPresent();//sysj\plant.sysj line: 41, column: 7
                            currsigs.addElement(botPos2);
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S154=1;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          break;
                        
                      }
                      break;
                    
                    case 1 : 
                      botPos2.setPresent();//sysj\plant.sysj line: 41, column: 7
                      currsigs.addElement(botPos2);
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                      break;
                    
                  }
                }
                break;
              
              case 2 : 
                if(bottleAtPos2.getprestatus() && rotate.getprestatus()){//sysj\plant.sysj line: 46, column: 11
                  S209=3;
                  S292=0;
                  __start_thread_2 = com.systemj.Timer.getMs();//sysj\plant.sysj line: 54, column: 34
                  if(com.systemj.Timer.getMs() - __start_thread_2 >= (2) * 1000){//sysj\plant.sysj line: 54, column: 34
                    ends[2]=5;
                    ;//sysj\plant.sysj line: 54, column: 34
                    S292=1;
                    botPos4.setPresent();//sysj\plant.sysj line: 57, column: 7
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
                }
                else {
                  switch(S236){
                    case 0 : 
                      if(com.systemj.Timer.getMs() - __start_thread_2 >= (2) * 1000){//sysj\plant.sysj line: 46, column: 34
                        ends[2]=6;
                        ;//sysj\plant.sysj line: 46, column: 34
                        S236=1;
                        botPos3.setPresent();//sysj\plant.sysj line: 49, column: 7
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
                    
                    case 1 : 
                      botPos3.setPresent();//sysj\plant.sysj line: 49, column: 7
                      currsigs.addElement(botPos3);
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                      break;
                    
                  }
                }
                break;
              
              case 3 : 
                if(bottleAtPos3.getprestatus() && rotate.getprestatus()){//sysj\plant.sysj line: 54, column: 11
                  S209=4;
                  S348=0;
                  __start_thread_2 = com.systemj.Timer.getMs();//sysj\plant.sysj line: 62, column: 34
                  if(com.systemj.Timer.getMs() - __start_thread_2 >= (2) * 1000){//sysj\plant.sysj line: 62, column: 34
                    ends[2]=4;
                    ;//sysj\plant.sysj line: 62, column: 34
                    S348=1;
                    botPos5.setPresent();//sysj\plant.sysj line: 65, column: 7
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
                }
                else {
                  switch(S292){
                    case 0 : 
                      if(com.systemj.Timer.getMs() - __start_thread_2 >= (2) * 1000){//sysj\plant.sysj line: 54, column: 34
                        ends[2]=5;
                        ;//sysj\plant.sysj line: 54, column: 34
                        S292=1;
                        botPos4.setPresent();//sysj\plant.sysj line: 57, column: 7
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
                    
                    case 1 : 
                      botPos4.setPresent();//sysj\plant.sysj line: 57, column: 7
                      currsigs.addElement(botPos4);
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                      break;
                    
                  }
                }
                break;
              
              case 4 : 
                if(bottleAtPos4.getprestatus() && rotate.getprestatus()){//sysj\plant.sysj line: 62, column: 11
                  S209=5;
                  __start_thread_2 = com.systemj.Timer.getMs();//sysj\plant.sysj line: 70, column: 34
                  if(com.systemj.Timer.getMs() - __start_thread_2 >= (2) * 1000){//sysj\plant.sysj line: 70, column: 34
                    ends[2]=3;
                    ;//sysj\plant.sysj line: 70, column: 34
                    tableAligned.setPresent();//sysj\plant.sysj line: 72, column: 6
                    currsigs.addElement(tableAligned);
                    bottlesDone_thread_2 = bottlesDone_thread_2 + 1;//sysj\plant.sysj line: 73, column: 6
                    System.out.println(bottlesDone_thread_2);//sysj\plant.sysj line: 74, column: 6
                    S209=6;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                else {
                  switch(S348){
                    case 0 : 
                      if(com.systemj.Timer.getMs() - __start_thread_2 >= (2) * 1000){//sysj\plant.sysj line: 62, column: 34
                        ends[2]=4;
                        ;//sysj\plant.sysj line: 62, column: 34
                        S348=1;
                        botPos5.setPresent();//sysj\plant.sysj line: 65, column: 7
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
                    
                    case 1 : 
                      botPos5.setPresent();//sysj\plant.sysj line: 65, column: 7
                      currsigs.addElement(botPos5);
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                      break;
                    
                  }
                }
                break;
              
              case 5 : 
                if(bottleAtPos5.getprestatus() && rotate.getprestatus()){//sysj\plant.sysj line: 70, column: 11
                  S209=6;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  if(com.systemj.Timer.getMs() - __start_thread_2 >= (2) * 1000){//sysj\plant.sysj line: 70, column: 34
                    ends[2]=3;
                    ;//sysj\plant.sysj line: 70, column: 34
                    tableAligned.setPresent();//sysj\plant.sysj line: 72, column: 6
                    currsigs.addElement(tableAligned);
                    bottlesDone_thread_2 = bottlesDone_thread_2 + 1;//sysj\plant.sysj line: 73, column: 6
                    System.out.println(bottlesDone_thread_2);//sysj\plant.sysj line: 74, column: 6
                    S209=6;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                break;
              
              case 6 : 
                S209=6;
                if(bottlesDone_thread_2 != bottles_thread_2){//sysj\plant.sysj line: 29, column: 10
                  S209=0;
                  botPos1.setPresent();//sysj\plant.sysj line: 32, column: 7
                  currsigs.addElement(botPos1);
                  tableAligned.setPresent();//sysj\plant.sysj line: 33, column: 7
                  currsigs.addElement(tableAligned);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  ends[2]=2;
                  ;//sysj\plant.sysj line: 29, column: 4
                  S104=2;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
            }
            break;
          
          case 2 : 
            S104=2;
            bottles_thread_2 = 0;//sysj\plant.sysj line: 22, column: 4
            System.out.println("Before Quantity");//sysj\plant.sysj line: 23, column: 4
            S104=0;
            S111=0;
            if(!bottleQuantityOutput_in.isPartnerPresent() || bottleQuantityOutput_in.isPartnerPreempted()){//sysj\plant.sysj line: 24, column: 4
              bottleQuantityOutput_in.setACK(false);//sysj\plant.sysj line: 24, column: 4
              S111=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              S106=0;
              if(!bottleQuantityOutput_in.isREQ()){//sysj\plant.sysj line: 24, column: 4
                bottleQuantityOutput_in.setACK(true);//sysj\plant.sysj line: 24, column: 4
                S106=1;
                if(bottleQuantityOutput_in.isREQ()){//sysj\plant.sysj line: 24, column: 4
                  bottleQuantityOutput_in.setACK(false);//sysj\plant.sysj line: 24, column: 4
                  ends[2]=2;
                  ;//sysj\plant.sysj line: 24, column: 4
                  bottles_thread_2 = (Integer)(bottleQuantityOutput_in.getVal() == null ? 0 : ((Integer)bottleQuantityOutput_in.getVal()).intValue());//sysj\plant.sysj line: 25, column: 4
                  System.out.println(bottles_thread_2);//sysj\plant.sysj line: 26, column: 4
                  bottlesDone_thread_2 = 0;//sysj\plant.sysj line: 27, column: 4
                  S104=1;
                  if(bottlesDone_thread_2 != bottles_thread_2){//sysj\plant.sysj line: 29, column: 10
                    S209=0;
                    botPos1.setPresent();//sysj\plant.sysj line: 32, column: 7
                    currsigs.addElement(botPos1);
                    tableAligned.setPresent();//sysj\plant.sysj line: 33, column: 7
                    currsigs.addElement(tableAligned);
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    ends[2]=2;
                    ;//sysj\plant.sysj line: 29, column: 4
                    S104=2;
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
      
    }
  }

  public void thread20177(int [] tdone, int [] ends){
        S9724=1;
    if(botPos5.getprestatus()){//sysj\plant.sysj line: 93, column: 24
      labelTriggerE.setPresent();//sysj\plant.sysj line: 93, column: 33
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

  public void thread20176(int [] tdone, int [] ends){
        S9716=1;
    if(botPos4.getprestatus()){//sysj\plant.sysj line: 91, column: 24
      capScrewTriggerE.setPresent();//sysj\plant.sysj line: 91, column: 33
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

  public void thread20175(int [] tdone, int [] ends){
        S9708=1;
    if(botPos3.getprestatus()){//sysj\plant.sysj line: 89, column: 24
      lidloaderTriggerE.setPresent();//sysj\plant.sysj line: 89, column: 33
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

  public void thread20174(int [] tdone, int [] ends){
        S9700=1;
    if(botPos2.getprestatus()){//sysj\plant.sysj line: 87, column: 24
      fillerTriggerE.setPresent();//sysj\plant.sysj line: 87, column: 33
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

  public void thread20173(int [] tdone, int [] ends){
        S9692=1;
    if(botPos1.getprestatus()){//sysj\plant.sysj line: 85, column: 24
      conBeltTriggerE.setPresent();//sysj\plant.sysj line: 85, column: 33
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

  public void thread20172(int [] tdone, int [] ends){
        S9726=1;
    thread20173(tdone,ends);
    thread20174(tdone,ends);
    thread20175(tdone,ends);
    thread20176(tdone,ends);
    thread20177(tdone,ends);
    int biggest20178 = 0;
    if(ends[4]>=biggest20178){
      biggest20178=ends[4];
    }
    if(ends[5]>=biggest20178){
      biggest20178=ends[5];
    }
    if(ends[6]>=biggest20178){
      biggest20178=ends[6];
    }
    if(ends[7]>=biggest20178){
      biggest20178=ends[7];
    }
    if(ends[8]>=biggest20178){
      biggest20178=ends[8];
    }
    if(biggest20178 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread20171(int [] tdone, int [] ends){
        S9684=1;
    bottles_thread_2 = 0;//sysj\plant.sysj line: 22, column: 4
    System.out.println("Before Quantity");//sysj\plant.sysj line: 23, column: 4
    S104=0;
    S111=0;
    if(!bottleQuantityOutput_in.isPartnerPresent() || bottleQuantityOutput_in.isPartnerPreempted()){//sysj\plant.sysj line: 24, column: 4
      bottleQuantityOutput_in.setACK(false);//sysj\plant.sysj line: 24, column: 4
      S111=1;
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      S106=0;
      if(!bottleQuantityOutput_in.isREQ()){//sysj\plant.sysj line: 24, column: 4
        bottleQuantityOutput_in.setACK(true);//sysj\plant.sysj line: 24, column: 4
        S106=1;
        if(bottleQuantityOutput_in.isREQ()){//sysj\plant.sysj line: 24, column: 4
          bottleQuantityOutput_in.setACK(false);//sysj\plant.sysj line: 24, column: 4
          ends[2]=2;
          ;//sysj\plant.sysj line: 24, column: 4
          bottles_thread_2 = (Integer)(bottleQuantityOutput_in.getVal() == null ? 0 : ((Integer)bottleQuantityOutput_in.getVal()).intValue());//sysj\plant.sysj line: 25, column: 4
          System.out.println(bottles_thread_2);//sysj\plant.sysj line: 26, column: 4
          bottlesDone_thread_2 = 0;//sysj\plant.sysj line: 27, column: 4
          S104=1;
          if(bottlesDone_thread_2 != bottles_thread_2){//sysj\plant.sysj line: 29, column: 10
            S209=0;
            botPos1.setPresent();//sysj\plant.sysj line: 32, column: 7
            currsigs.addElement(botPos1);
            tableAligned.setPresent();//sysj\plant.sysj line: 33, column: 7
            currsigs.addElement(tableAligned);
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
          }
          else {
            ends[2]=2;
            ;//sysj\plant.sysj line: 29, column: 4
            S104=2;
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

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S19351){
        case 0 : 
          S19351=0;
          break RUN;
        
        case 1 : 
          S19351=2;
          S19351=2;
          new Thread(new GUI()).start();//sysj\plant.sysj line: 15, column: 2
          thread20171(tdone,ends);
          thread20172(tdone,ends);
          int biggest20179 = 0;
          if(ends[2]>=biggest20179){
            biggest20179=ends[2];
          }
          if(ends[3]>=biggest20179){
            biggest20179=ends[3];
          }
          if(biggest20179 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread20180(tdone,ends);
          thread20181(tdone,ends);
          int biggest20188 = 0;
          if(ends[2]>=biggest20188){
            biggest20188=ends[2];
          }
          if(ends[3]>=biggest20188){
            biggest20188=ends[3];
          }
          if(biggest20188 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest20188 == 0){
            S19351=0;
            active[1]=0;
            ends[1]=0;
            S19351=0;
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
