import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import run.ECS_GUI;//sysj\ECS_plant.sysj line: 1, column: 1

public class ECS_plant extends ClockDomain{
  public ECS_plant(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal tempZone1_7 = new Signal("tempZone1_7", Signal.INPUT);
  public Signal tempZone2_3 = new Signal("tempZone2_3", Signal.INPUT);
  public Signal tempZone4_5_6 = new Signal("tempZone4_5_6", Signal.INPUT);
  public Signal humidZone1_7 = new Signal("humidZone1_7", Signal.INPUT);
  public Signal humidZone2_3 = new Signal("humidZone2_3", Signal.INPUT);
  public Signal humidZone4_5_6 = new Signal("humidZone4_5_6", Signal.INPUT);
  public Signal lightInt = new Signal("lightInt", Signal.INPUT);
  public Signal selectedZone = new Signal("selectedZone", Signal.INPUT);
  public Signal time = new Signal("time", Signal.INPUT);
  public Signal humanZ1 = new Signal("humanZ1", Signal.INPUT);
  public Signal humanZ2 = new Signal("humanZ2", Signal.INPUT);
  public Signal humanZ3 = new Signal("humanZ3", Signal.INPUT);
  public Signal humanZ4 = new Signal("humanZ4", Signal.INPUT);
  public Signal humanZ5 = new Signal("humanZ5", Signal.INPUT);
  public Signal humanZ6 = new Signal("humanZ6", Signal.INPUT);
  public Signal humanZ7 = new Signal("humanZ7", Signal.INPUT);
  public Signal dust = new Signal("dust", Signal.INPUT);
  public Signal fire = new Signal("fire", Signal.INPUT);
  public Signal powerOff = new Signal("powerOff", Signal.INPUT);
  public Signal roomCleaned = new Signal("roomCleaned", Signal.INPUT);
  public Signal alarmOff = new Signal("alarmOff", Signal.INPUT);
  public Signal safeOpTemp = new Signal("safeOpTemp", Signal.INPUT);
  public Signal safeOpHumid = new Signal("safeOpHumid", Signal.INPUT);
  public Signal run = new Signal("run", Signal.INPUT);
  public Signal fireZone1 = new Signal("fireZone1", Signal.OUTPUT);
  public Signal fireZone2 = new Signal("fireZone2", Signal.OUTPUT);
  public Signal fireZone3 = new Signal("fireZone3", Signal.OUTPUT);
  public Signal fireZone4 = new Signal("fireZone4", Signal.OUTPUT);
  public Signal fireZone5 = new Signal("fireZone5", Signal.OUTPUT);
  public Signal fireZone6 = new Signal("fireZone6", Signal.OUTPUT);
  public Signal fireZone7 = new Signal("fireZone7", Signal.OUTPUT);
  public Signal cleanZone1 = new Signal("cleanZone1", Signal.OUTPUT);
  public Signal cleanZone2 = new Signal("cleanZone2", Signal.OUTPUT);
  public Signal cleanZone3 = new Signal("cleanZone3", Signal.OUTPUT);
  public Signal cleanZone4 = new Signal("cleanZone4", Signal.OUTPUT);
  public Signal cleanZone5 = new Signal("cleanZone5", Signal.OUTPUT);
  public Signal cleanZone6 = new Signal("cleanZone6", Signal.OUTPUT);
  public Signal cleanZone7 = new Signal("cleanZone7", Signal.OUTPUT);
  public Signal fanOnZone1_7 = new Signal("fanOnZone1_7", Signal.OUTPUT);
  public Signal heatOnZone1_7 = new Signal("heatOnZone1_7", Signal.OUTPUT);
  public Signal airOnZone2_3 = new Signal("airOnZone2_3", Signal.OUTPUT);
  public Signal airOnZone4_5_6 = new Signal("airOnZone4_5_6", Signal.OUTPUT);
  public Signal heatOnZone2_3 = new Signal("heatOnZone2_3", Signal.OUTPUT);
  public Signal heatOnZone4_5_6 = new Signal("heatOnZone4_5_6", Signal.OUTPUT);
  public Signal blindsDownZone1_7 = new Signal("blindsDownZone1_7", Signal.OUTPUT);
  public Signal blindsDownZone2_3 = new Signal("blindsDownZone2_3", Signal.OUTPUT);
  public Signal blindsDownZone4_5_6 = new Signal("blindsDownZone4_5_6", Signal.OUTPUT);
  public Signal humOnZone1_7 = new Signal("humOnZone1_7", Signal.OUTPUT);
  public Signal humOnZone2_3 = new Signal("humOnZone2_3", Signal.OUTPUT);
  public Signal humOnZone4_5_6 = new Signal("humOnZone4_5_6", Signal.OUTPUT);
  public Signal deHumOnZone1_7 = new Signal("deHumOnZone1_7", Signal.OUTPUT);
  public Signal deHumOnZone2_3 = new Signal("deHumOnZone2_3", Signal.OUTPUT);
  public Signal deHumOnZone4_5_6 = new Signal("deHumOnZone4_5_6", Signal.OUTPUT);
  public Signal cutPowZ1 = new Signal("cutPowZ1", Signal.OUTPUT);
  public Signal cutPowZ2 = new Signal("cutPowZ2", Signal.OUTPUT);
  public Signal cutPowZ3 = new Signal("cutPowZ3", Signal.OUTPUT);
  public Signal cutPowZ4 = new Signal("cutPowZ4", Signal.OUTPUT);
  public Signal cutPowZ5 = new Signal("cutPowZ5", Signal.OUTPUT);
  public Signal cutPowZ6 = new Signal("cutPowZ6", Signal.OUTPUT);
  public Signal cutPowZ7 = new Signal("cutPowZ7", Signal.OUTPUT);
  public Signal powZ1 = new Signal("powZ1", Signal.OUTPUT);
  public Signal powZ2 = new Signal("powZ2", Signal.OUTPUT);
  public Signal powZ3 = new Signal("powZ3", Signal.OUTPUT);
  public Signal powZ4 = new Signal("powZ4", Signal.OUTPUT);
  public Signal powZ5 = new Signal("powZ5", Signal.OUTPUT);
  public Signal powZ6 = new Signal("powZ6", Signal.OUTPUT);
  public Signal powZ7 = new Signal("powZ7", Signal.OUTPUT);
  public Signal alarmZone1TriggerE = new Signal("alarmZone1TriggerE", Signal.OUTPUT);
  public Signal alarmZone2TriggerE = new Signal("alarmZone2TriggerE", Signal.OUTPUT);
  public Signal alarmZone3TriggerE = new Signal("alarmZone3TriggerE", Signal.OUTPUT);
  public Signal alarmZone4TriggerE = new Signal("alarmZone4TriggerE", Signal.OUTPUT);
  public Signal alarmZone5TriggerE = new Signal("alarmZone5TriggerE", Signal.OUTPUT);
  public Signal alarmZone6TriggerE = new Signal("alarmZone6TriggerE", Signal.OUTPUT);
  public Signal alarmZone7TriggerE = new Signal("alarmZone7TriggerE", Signal.OUTPUT);
  public Signal cleanZone1TriggerE = new Signal("cleanZone1TriggerE", Signal.OUTPUT);
  public Signal cleanZone2TriggerE = new Signal("cleanZone2TriggerE", Signal.OUTPUT);
  public Signal cleanZone3TriggerE = new Signal("cleanZone3TriggerE", Signal.OUTPUT);
  public Signal cleanZone4TriggerE = new Signal("cleanZone4TriggerE", Signal.OUTPUT);
  public Signal cleanZone5TriggerE = new Signal("cleanZone5TriggerE", Signal.OUTPUT);
  public Signal cleanZone6TriggerE = new Signal("cleanZone6TriggerE", Signal.OUTPUT);
  public Signal cleanZone7TriggerE = new Signal("cleanZone7TriggerE", Signal.OUTPUT);
  public Signal fanOnZone1_7TriggerE = new Signal("fanOnZone1_7TriggerE", Signal.OUTPUT);
  public Signal heatOnZone1_7TriggerE = new Signal("heatOnZone1_7TriggerE", Signal.OUTPUT);
  public Signal airOnZone2_3TriggerE = new Signal("airOnZone2_3TriggerE", Signal.OUTPUT);
  public Signal airOnZone4_5_6TriggerE = new Signal("airOnZone4_5_6TriggerE", Signal.OUTPUT);
  public Signal heatOnZone2_3TriggerE = new Signal("heatOnZone2_3TriggerE", Signal.OUTPUT);
  public Signal heatOnZone4_5_6TriggerE = new Signal("heatOnZone4_5_6TriggerE", Signal.OUTPUT);
  public Signal humOnZone1_7TriggerE = new Signal("humOnZone1_7TriggerE", Signal.OUTPUT);
  public Signal humOnZone2_3TriggerE = new Signal("humOnZone2_3TriggerE", Signal.OUTPUT);
  public Signal humOnZone4_5_6TriggerE = new Signal("humOnZone4_5_6TriggerE", Signal.OUTPUT);
  public Signal deHumOnZone1_7TriggerE = new Signal("deHumOnZone1_7TriggerE", Signal.OUTPUT);
  public Signal deHumOnZone2_3TriggerE = new Signal("deHumOnZone2_3TriggerE", Signal.OUTPUT);
  public Signal deHumOnZone4_5_6TriggerE = new Signal("deHumOnZone4_5_6TriggerE", Signal.OUTPUT);
  public Signal cutPowZ1_TriggerE = new Signal("cutPowZ1_TriggerE", Signal.OUTPUT);
  public Signal cutPowZ2_TriggerE = new Signal("cutPowZ2_TriggerE", Signal.OUTPUT);
  public Signal cutPowZ3_TriggerE = new Signal("cutPowZ3_TriggerE", Signal.OUTPUT);
  public Signal cutPowZ4_TriggerE = new Signal("cutPowZ4_TriggerE", Signal.OUTPUT);
  public Signal cutPowZ5_TriggerE = new Signal("cutPowZ5_TriggerE", Signal.OUTPUT);
  public Signal cutPowZ6_TriggerE = new Signal("cutPowZ6_TriggerE", Signal.OUTPUT);
  public Signal cutPowZ7_TriggerE = new Signal("cutPowZ7_TriggerE", Signal.OUTPUT);
  public Signal lightIntZ1Trigger = new Signal("lightIntZ1Trigger", Signal.OUTPUT);
  public Signal lightIntZ2Trigger = new Signal("lightIntZ2Trigger", Signal.OUTPUT);
  public Signal lightIntZ3Trigger = new Signal("lightIntZ3Trigger", Signal.OUTPUT);
  public Signal lightIntZ4Trigger = new Signal("lightIntZ4Trigger", Signal.OUTPUT);
  public Signal lightIntZ5Trigger = new Signal("lightIntZ5Trigger", Signal.OUTPUT);
  public Signal lightIntZ6Trigger = new Signal("lightIntZ6Trigger", Signal.OUTPUT);
  public Signal lightIntZ7Trigger = new Signal("lightIntZ7Trigger", Signal.OUTPUT);
  private Integer zone_thread_2;//sysj\ECS_plant.sysj line: 44, column: 4
  private Integer lightIntensity_thread_2;//sysj\ECS_plant.sysj line: 51, column: 4
  private String clock_thread_2;//sysj\ECS_plant.sysj line: 55, column: 4
  private Integer temp17_thread_2;//sysj\ECS_plant.sysj line: 194, column: 5
  private Integer temp23_thread_2;//sysj\ECS_plant.sysj line: 217, column: 5
  private Integer temp456_thread_2;//sysj\ECS_plant.sysj line: 240, column: 5
  private Integer humid17_thread_2;//sysj\ECS_plant.sysj line: 265, column: 5
  private Integer humid23_thread_2;//sysj\ECS_plant.sysj line: 291, column: 5
  private Integer humid456_thread_2;//sysj\ECS_plant.sysj line: 317, column: 5
  private int S24888 = 1;
  private int S14701 = 1;
  private int S5051 = 1;
  private int S5101 = 1;
  private int S5056 = 1;
  private int S5069 = 1;
  private int S5106 = 1;
  private int S5142 = 1;
  private int S5178 = 1;
  private int S5214 = 1;
  private int S5250 = 1;
  private int S5530 = 1;
  private int S5635 = 1;
  private int S5634 = 1;
  private int S5695 = 1;
  private int S5795 = 1;
  private int S5975 = 1;
  private int S6315 = 1;
  private int S6975 = 1;
  private int S14967 = 1;
  private int S14709 = 1;
  private int S14717 = 1;
  private int S14725 = 1;
  private int S14733 = 1;
  private int S14741 = 1;
  private int S14749 = 1;
  private int S14757 = 1;
  private int S14765 = 1;
  private int S14773 = 1;
  private int S14781 = 1;
  private int S14789 = 1;
  private int S14797 = 1;
  private int S14805 = 1;
  private int S14813 = 1;
  private int S14821 = 1;
  private int S14829 = 1;
  private int S14837 = 1;
  private int S14845 = 1;
  private int S14853 = 1;
  private int S14861 = 1;
  private int S14869 = 1;
  private int S14877 = 1;
  private int S14885 = 1;
  private int S14893 = 1;
  private int S14901 = 1;
  private int S14909 = 1;
  private int S14917 = 1;
  private int S14925 = 1;
  private int S14933 = 1;
  private int S14941 = 1;
  private int S14949 = 1;
  private int S14957 = 1;
  private int S14965 = 1;
  
  private int[] ends = new int[37];
  private int[] tdone = new int[37];
  
  public void thread24961(int [] tdone, int [] ends){
        switch(S14965){
      case 0 : 
        active[36]=0;
        ends[36]=0;
        tdone[36]=1;
        break;
      
      case 1 : 
        if(cutPowZ7.getprestatus()){//sysj\ECS_plant.sysj line: 412, column: 24
          cutPowZ7_TriggerE.setPresent();//sysj\ECS_plant.sysj line: 412, column: 34
          currsigs.addElement(cutPowZ7_TriggerE);
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
        else {
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
        break;
      
    }
  }

  public void thread24960(int [] tdone, int [] ends){
        switch(S14957){
      case 0 : 
        active[35]=0;
        ends[35]=0;
        tdone[35]=1;
        break;
      
      case 1 : 
        if(cutPowZ6.getprestatus()){//sysj\ECS_plant.sysj line: 410, column: 24
          cutPowZ6_TriggerE.setPresent();//sysj\ECS_plant.sysj line: 410, column: 34
          currsigs.addElement(cutPowZ6_TriggerE);
          active[35]=1;
          ends[35]=1;
          tdone[35]=1;
        }
        else {
          active[35]=1;
          ends[35]=1;
          tdone[35]=1;
        }
        break;
      
    }
  }

  public void thread24959(int [] tdone, int [] ends){
        switch(S14949){
      case 0 : 
        active[34]=0;
        ends[34]=0;
        tdone[34]=1;
        break;
      
      case 1 : 
        if(cutPowZ5.getprestatus()){//sysj\ECS_plant.sysj line: 408, column: 24
          cutPowZ5_TriggerE.setPresent();//sysj\ECS_plant.sysj line: 408, column: 34
          currsigs.addElement(cutPowZ5_TriggerE);
          active[34]=1;
          ends[34]=1;
          tdone[34]=1;
        }
        else {
          active[34]=1;
          ends[34]=1;
          tdone[34]=1;
        }
        break;
      
    }
  }

  public void thread24958(int [] tdone, int [] ends){
        switch(S14941){
      case 0 : 
        active[33]=0;
        ends[33]=0;
        tdone[33]=1;
        break;
      
      case 1 : 
        if(cutPowZ4.getprestatus()){//sysj\ECS_plant.sysj line: 406, column: 24
          cutPowZ4_TriggerE.setPresent();//sysj\ECS_plant.sysj line: 406, column: 34
          currsigs.addElement(cutPowZ4_TriggerE);
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
        else {
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
        break;
      
    }
  }

  public void thread24957(int [] tdone, int [] ends){
        switch(S14933){
      case 0 : 
        active[32]=0;
        ends[32]=0;
        tdone[32]=1;
        break;
      
      case 1 : 
        if(cutPowZ3.getprestatus()){//sysj\ECS_plant.sysj line: 404, column: 24
          cutPowZ3_TriggerE.setPresent();//sysj\ECS_plant.sysj line: 404, column: 34
          currsigs.addElement(cutPowZ3_TriggerE);
          active[32]=1;
          ends[32]=1;
          tdone[32]=1;
        }
        else {
          active[32]=1;
          ends[32]=1;
          tdone[32]=1;
        }
        break;
      
    }
  }

  public void thread24956(int [] tdone, int [] ends){
        switch(S14925){
      case 0 : 
        active[31]=0;
        ends[31]=0;
        tdone[31]=1;
        break;
      
      case 1 : 
        if(cutPowZ2.getprestatus()){//sysj\ECS_plant.sysj line: 402, column: 24
          cutPowZ2_TriggerE.setPresent();//sysj\ECS_plant.sysj line: 402, column: 34
          currsigs.addElement(cutPowZ2_TriggerE);
          active[31]=1;
          ends[31]=1;
          tdone[31]=1;
        }
        else {
          active[31]=1;
          ends[31]=1;
          tdone[31]=1;
        }
        break;
      
    }
  }

  public void thread24955(int [] tdone, int [] ends){
        switch(S14917){
      case 0 : 
        active[30]=0;
        ends[30]=0;
        tdone[30]=1;
        break;
      
      case 1 : 
        if(cutPowZ1.getprestatus()){//sysj\ECS_plant.sysj line: 400, column: 24
          cutPowZ1_TriggerE.setPresent();//sysj\ECS_plant.sysj line: 400, column: 34
          currsigs.addElement(cutPowZ1_TriggerE);
          active[30]=1;
          ends[30]=1;
          tdone[30]=1;
        }
        else {
          active[30]=1;
          ends[30]=1;
          tdone[30]=1;
        }
        break;
      
    }
  }

  public void thread24954(int [] tdone, int [] ends){
        switch(S14909){
      case 0 : 
        active[29]=0;
        ends[29]=0;
        tdone[29]=1;
        break;
      
      case 1 : 
        if(deHumOnZone4_5_6.getprestatus()){//sysj\ECS_plant.sysj line: 398, column: 24
          deHumOnZone4_5_6TriggerE.setPresent();//sysj\ECS_plant.sysj line: 398, column: 42
          currsigs.addElement(deHumOnZone4_5_6TriggerE);
          active[29]=1;
          ends[29]=1;
          tdone[29]=1;
        }
        else {
          active[29]=1;
          ends[29]=1;
          tdone[29]=1;
        }
        break;
      
    }
  }

  public void thread24953(int [] tdone, int [] ends){
        switch(S14901){
      case 0 : 
        active[28]=0;
        ends[28]=0;
        tdone[28]=1;
        break;
      
      case 1 : 
        if(deHumOnZone2_3.getprestatus()){//sysj\ECS_plant.sysj line: 396, column: 24
          deHumOnZone2_3TriggerE.setPresent();//sysj\ECS_plant.sysj line: 396, column: 40
          currsigs.addElement(deHumOnZone2_3TriggerE);
          active[28]=1;
          ends[28]=1;
          tdone[28]=1;
        }
        else {
          active[28]=1;
          ends[28]=1;
          tdone[28]=1;
        }
        break;
      
    }
  }

  public void thread24952(int [] tdone, int [] ends){
        switch(S14893){
      case 0 : 
        active[27]=0;
        ends[27]=0;
        tdone[27]=1;
        break;
      
      case 1 : 
        if(deHumOnZone1_7.getprestatus()){//sysj\ECS_plant.sysj line: 394, column: 24
          deHumOnZone1_7TriggerE.setPresent();//sysj\ECS_plant.sysj line: 394, column: 40
          currsigs.addElement(deHumOnZone1_7TriggerE);
          active[27]=1;
          ends[27]=1;
          tdone[27]=1;
        }
        else {
          active[27]=1;
          ends[27]=1;
          tdone[27]=1;
        }
        break;
      
    }
  }

  public void thread24951(int [] tdone, int [] ends){
        switch(S14885){
      case 0 : 
        active[26]=0;
        ends[26]=0;
        tdone[26]=1;
        break;
      
      case 1 : 
        if(humOnZone4_5_6.getprestatus()){//sysj\ECS_plant.sysj line: 392, column: 24
          humOnZone4_5_6TriggerE.setPresent();//sysj\ECS_plant.sysj line: 392, column: 40
          currsigs.addElement(humOnZone4_5_6TriggerE);
          active[26]=1;
          ends[26]=1;
          tdone[26]=1;
        }
        else {
          active[26]=1;
          ends[26]=1;
          tdone[26]=1;
        }
        break;
      
    }
  }

  public void thread24950(int [] tdone, int [] ends){
        switch(S14877){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        if(humOnZone2_3.getprestatus()){//sysj\ECS_plant.sysj line: 390, column: 24
          humOnZone2_3TriggerE.setPresent();//sysj\ECS_plant.sysj line: 390, column: 38
          currsigs.addElement(humOnZone2_3TriggerE);
          active[25]=1;
          ends[25]=1;
          tdone[25]=1;
        }
        else {
          active[25]=1;
          ends[25]=1;
          tdone[25]=1;
        }
        break;
      
    }
  }

  public void thread24949(int [] tdone, int [] ends){
        switch(S14869){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        if(humOnZone1_7.getprestatus()){//sysj\ECS_plant.sysj line: 388, column: 24
          humOnZone1_7TriggerE.setPresent();//sysj\ECS_plant.sysj line: 388, column: 38
          currsigs.addElement(humOnZone1_7TriggerE);
          active[24]=1;
          ends[24]=1;
          tdone[24]=1;
        }
        else {
          active[24]=1;
          ends[24]=1;
          tdone[24]=1;
        }
        break;
      
    }
  }

  public void thread24948(int [] tdone, int [] ends){
        switch(S14861){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        if(heatOnZone4_5_6.getprestatus()){//sysj\ECS_plant.sysj line: 386, column: 24
          heatOnZone4_5_6TriggerE.setPresent();//sysj\ECS_plant.sysj line: 386, column: 41
          currsigs.addElement(heatOnZone4_5_6TriggerE);
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
        else {
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
        break;
      
    }
  }

  public void thread24947(int [] tdone, int [] ends){
        switch(S14853){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        if(heatOnZone2_3.getprestatus()){//sysj\ECS_plant.sysj line: 384, column: 24
          heatOnZone2_3TriggerE.setPresent();//sysj\ECS_plant.sysj line: 384, column: 39
          currsigs.addElement(heatOnZone2_3TriggerE);
          active[22]=1;
          ends[22]=1;
          tdone[22]=1;
        }
        else {
          active[22]=1;
          ends[22]=1;
          tdone[22]=1;
        }
        break;
      
    }
  }

  public void thread24946(int [] tdone, int [] ends){
        switch(S14845){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        if(airOnZone4_5_6.getprestatus()){//sysj\ECS_plant.sysj line: 382, column: 24
          airOnZone4_5_6TriggerE.setPresent();//sysj\ECS_plant.sysj line: 382, column: 40
          currsigs.addElement(airOnZone4_5_6TriggerE);
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
        else {
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
        break;
      
    }
  }

  public void thread24945(int [] tdone, int [] ends){
        switch(S14837){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        if(airOnZone2_3.getprestatus()){//sysj\ECS_plant.sysj line: 380, column: 24
          airOnZone2_3TriggerE.setPresent();//sysj\ECS_plant.sysj line: 380, column: 38
          currsigs.addElement(airOnZone2_3TriggerE);
          active[20]=1;
          ends[20]=1;
          tdone[20]=1;
        }
        else {
          active[20]=1;
          ends[20]=1;
          tdone[20]=1;
        }
        break;
      
    }
  }

  public void thread24944(int [] tdone, int [] ends){
        switch(S14829){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        if(heatOnZone1_7.getprestatus()){//sysj\ECS_plant.sysj line: 378, column: 24
          heatOnZone1_7TriggerE.setPresent();//sysj\ECS_plant.sysj line: 378, column: 39
          currsigs.addElement(heatOnZone1_7TriggerE);
          active[19]=1;
          ends[19]=1;
          tdone[19]=1;
        }
        else {
          active[19]=1;
          ends[19]=1;
          tdone[19]=1;
        }
        break;
      
    }
  }

  public void thread24943(int [] tdone, int [] ends){
        switch(S14821){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        if(fanOnZone1_7.getprestatus()){//sysj\ECS_plant.sysj line: 376, column: 24
          fanOnZone1_7TriggerE.setPresent();//sysj\ECS_plant.sysj line: 376, column: 38
          currsigs.addElement(fanOnZone1_7TriggerE);
          active[18]=1;
          ends[18]=1;
          tdone[18]=1;
        }
        else {
          active[18]=1;
          ends[18]=1;
          tdone[18]=1;
        }
        break;
      
    }
  }

  public void thread24942(int [] tdone, int [] ends){
        switch(S14813){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        if(cleanZone7.getprestatus()){//sysj\ECS_plant.sysj line: 374, column: 24
          cleanZone7TriggerE.setPresent();//sysj\ECS_plant.sysj line: 374, column: 36
          currsigs.addElement(cleanZone7TriggerE);
          active[17]=1;
          ends[17]=1;
          tdone[17]=1;
        }
        else {
          active[17]=1;
          ends[17]=1;
          tdone[17]=1;
        }
        break;
      
    }
  }

  public void thread24941(int [] tdone, int [] ends){
        switch(S14805){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        if(cleanZone6.getprestatus()){//sysj\ECS_plant.sysj line: 372, column: 24
          cleanZone6TriggerE.setPresent();//sysj\ECS_plant.sysj line: 372, column: 36
          currsigs.addElement(cleanZone6TriggerE);
          active[16]=1;
          ends[16]=1;
          tdone[16]=1;
        }
        else {
          active[16]=1;
          ends[16]=1;
          tdone[16]=1;
        }
        break;
      
    }
  }

  public void thread24940(int [] tdone, int [] ends){
        switch(S14797){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(cleanZone5.getprestatus()){//sysj\ECS_plant.sysj line: 370, column: 24
          cleanZone5TriggerE.setPresent();//sysj\ECS_plant.sysj line: 370, column: 36
          currsigs.addElement(cleanZone5TriggerE);
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
        else {
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
        break;
      
    }
  }

  public void thread24939(int [] tdone, int [] ends){
        switch(S14789){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(cleanZone4.getprestatus()){//sysj\ECS_plant.sysj line: 368, column: 24
          cleanZone4TriggerE.setPresent();//sysj\ECS_plant.sysj line: 368, column: 36
          currsigs.addElement(cleanZone4TriggerE);
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
        else {
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
        break;
      
    }
  }

  public void thread24938(int [] tdone, int [] ends){
        switch(S14781){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(cleanZone3.getprestatus()){//sysj\ECS_plant.sysj line: 366, column: 24
          cleanZone3TriggerE.setPresent();//sysj\ECS_plant.sysj line: 366, column: 36
          currsigs.addElement(cleanZone3TriggerE);
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
        else {
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
        break;
      
    }
  }

  public void thread24937(int [] tdone, int [] ends){
        switch(S14773){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(cleanZone2.getprestatus()){//sysj\ECS_plant.sysj line: 364, column: 24
          cleanZone2TriggerE.setPresent();//sysj\ECS_plant.sysj line: 364, column: 36
          currsigs.addElement(cleanZone2TriggerE);
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
        else {
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
        break;
      
    }
  }

  public void thread24936(int [] tdone, int [] ends){
        switch(S14765){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(cleanZone1.getprestatus()){//sysj\ECS_plant.sysj line: 362, column: 24
          cleanZone1TriggerE.setPresent();//sysj\ECS_plant.sysj line: 362, column: 36
          currsigs.addElement(cleanZone1TriggerE);
          active[11]=1;
          ends[11]=1;
          tdone[11]=1;
        }
        else {
          active[11]=1;
          ends[11]=1;
          tdone[11]=1;
        }
        break;
      
    }
  }

  public void thread24935(int [] tdone, int [] ends){
        switch(S14757){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(fireZone7.getprestatus()){//sysj\ECS_plant.sysj line: 360, column: 24
          alarmZone7TriggerE.setPresent();//sysj\ECS_plant.sysj line: 360, column: 35
          currsigs.addElement(alarmZone7TriggerE);
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

  public void thread24934(int [] tdone, int [] ends){
        switch(S14749){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(fireZone6.getprestatus()){//sysj\ECS_plant.sysj line: 358, column: 24
          alarmZone6TriggerE.setPresent();//sysj\ECS_plant.sysj line: 358, column: 35
          currsigs.addElement(alarmZone6TriggerE);
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
        else {
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
        break;
      
    }
  }

  public void thread24933(int [] tdone, int [] ends){
        switch(S14741){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(fireZone5.getprestatus()){//sysj\ECS_plant.sysj line: 356, column: 24
          alarmZone5TriggerE.setPresent();//sysj\ECS_plant.sysj line: 356, column: 35
          currsigs.addElement(alarmZone5TriggerE);
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

  public void thread24932(int [] tdone, int [] ends){
        switch(S14733){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(fireZone4.getprestatus()){//sysj\ECS_plant.sysj line: 354, column: 24
          alarmZone4TriggerE.setPresent();//sysj\ECS_plant.sysj line: 354, column: 35
          currsigs.addElement(alarmZone4TriggerE);
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

  public void thread24931(int [] tdone, int [] ends){
        switch(S14725){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(fireZone3.getprestatus()){//sysj\ECS_plant.sysj line: 352, column: 24
          alarmZone3TriggerE.setPresent();//sysj\ECS_plant.sysj line: 352, column: 35
          currsigs.addElement(alarmZone3TriggerE);
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

  public void thread24930(int [] tdone, int [] ends){
        switch(S14717){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(fireZone2.getprestatus()){//sysj\ECS_plant.sysj line: 350, column: 24
          alarmZone2TriggerE.setPresent();//sysj\ECS_plant.sysj line: 350, column: 35
          currsigs.addElement(alarmZone2TriggerE);
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

  public void thread24929(int [] tdone, int [] ends){
        switch(S14709){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        if(fireZone1.getprestatus()){//sysj\ECS_plant.sysj line: 348, column: 24
          alarmZone1TriggerE.setPresent();//sysj\ECS_plant.sysj line: 348, column: 35
          currsigs.addElement(alarmZone1TriggerE);
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

  public void thread24928(int [] tdone, int [] ends){
        switch(S14967){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        thread24929(tdone,ends);
        thread24930(tdone,ends);
        thread24931(tdone,ends);
        thread24932(tdone,ends);
        thread24933(tdone,ends);
        thread24934(tdone,ends);
        thread24935(tdone,ends);
        thread24936(tdone,ends);
        thread24937(tdone,ends);
        thread24938(tdone,ends);
        thread24939(tdone,ends);
        thread24940(tdone,ends);
        thread24941(tdone,ends);
        thread24942(tdone,ends);
        thread24943(tdone,ends);
        thread24944(tdone,ends);
        thread24945(tdone,ends);
        thread24946(tdone,ends);
        thread24947(tdone,ends);
        thread24948(tdone,ends);
        thread24949(tdone,ends);
        thread24950(tdone,ends);
        thread24951(tdone,ends);
        thread24952(tdone,ends);
        thread24953(tdone,ends);
        thread24954(tdone,ends);
        thread24955(tdone,ends);
        thread24956(tdone,ends);
        thread24957(tdone,ends);
        thread24958(tdone,ends);
        thread24959(tdone,ends);
        thread24960(tdone,ends);
        thread24961(tdone,ends);
        int biggest24962 = 0;
        if(ends[4]>=biggest24962){
          biggest24962=ends[4];
        }
        if(ends[5]>=biggest24962){
          biggest24962=ends[5];
        }
        if(ends[6]>=biggest24962){
          biggest24962=ends[6];
        }
        if(ends[7]>=biggest24962){
          biggest24962=ends[7];
        }
        if(ends[8]>=biggest24962){
          biggest24962=ends[8];
        }
        if(ends[9]>=biggest24962){
          biggest24962=ends[9];
        }
        if(ends[10]>=biggest24962){
          biggest24962=ends[10];
        }
        if(ends[11]>=biggest24962){
          biggest24962=ends[11];
        }
        if(ends[12]>=biggest24962){
          biggest24962=ends[12];
        }
        if(ends[13]>=biggest24962){
          biggest24962=ends[13];
        }
        if(ends[14]>=biggest24962){
          biggest24962=ends[14];
        }
        if(ends[15]>=biggest24962){
          biggest24962=ends[15];
        }
        if(ends[16]>=biggest24962){
          biggest24962=ends[16];
        }
        if(ends[17]>=biggest24962){
          biggest24962=ends[17];
        }
        if(ends[18]>=biggest24962){
          biggest24962=ends[18];
        }
        if(ends[19]>=biggest24962){
          biggest24962=ends[19];
        }
        if(ends[20]>=biggest24962){
          biggest24962=ends[20];
        }
        if(ends[21]>=biggest24962){
          biggest24962=ends[21];
        }
        if(ends[22]>=biggest24962){
          biggest24962=ends[22];
        }
        if(ends[23]>=biggest24962){
          biggest24962=ends[23];
        }
        if(ends[24]>=biggest24962){
          biggest24962=ends[24];
        }
        if(ends[25]>=biggest24962){
          biggest24962=ends[25];
        }
        if(ends[26]>=biggest24962){
          biggest24962=ends[26];
        }
        if(ends[27]>=biggest24962){
          biggest24962=ends[27];
        }
        if(ends[28]>=biggest24962){
          biggest24962=ends[28];
        }
        if(ends[29]>=biggest24962){
          biggest24962=ends[29];
        }
        if(ends[30]>=biggest24962){
          biggest24962=ends[30];
        }
        if(ends[31]>=biggest24962){
          biggest24962=ends[31];
        }
        if(ends[32]>=biggest24962){
          biggest24962=ends[32];
        }
        if(ends[33]>=biggest24962){
          biggest24962=ends[33];
        }
        if(ends[34]>=biggest24962){
          biggest24962=ends[34];
        }
        if(ends[35]>=biggest24962){
          biggest24962=ends[35];
        }
        if(ends[36]>=biggest24962){
          biggest24962=ends[36];
        }
        if(biggest24962 == 1){
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        //FINXME code
        if(biggest24962 == 0){
          S14967=0;
          active[3]=0;
          ends[3]=0;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread24927(int [] tdone, int [] ends){
        switch(S14701){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S5051){
          case 0 : 
            if(run.getprestatus()){//sysj\ECS_plant.sysj line: 39, column: 10
              System.out.println("");//sysj\ECS_plant.sysj line: 40, column: 4
              System.out.println("RUN BUTTON PRESSED");//sysj\ECS_plant.sysj line: 41, column: 4
              zone_thread_2 = 0;//sysj\ECS_plant.sysj line: 44, column: 4
              zone_thread_2 = (selectedZone.getpreval() == null ? null : ((Integer)selectedZone.getpreval()));//sysj\ECS_plant.sysj line: 45, column: 4
              System.out.println("");//sysj\ECS_plant.sysj line: 47, column: 4
              System.out.println("Zone selected is: " + zone_thread_2);//sysj\ECS_plant.sysj line: 48, column: 4
              lightIntensity_thread_2 = 0;//sysj\ECS_plant.sysj line: 51, column: 4
              lightIntensity_thread_2 = (lightInt.getpreval() == null ? null : ((Integer)lightInt.getpreval()));//sysj\ECS_plant.sysj line: 52, column: 4
              clock_thread_2 = "";//sysj\ECS_plant.sysj line: 55, column: 4
              clock_thread_2 = (time.getpreval() == null ? null : ((String)time.getpreval()));//sysj\ECS_plant.sysj line: 56, column: 4
              S5051=1;
              if(fire.getprestatus()){//sysj\ECS_plant.sysj line: 60, column: 12
                S5101=0;
                if(zone_thread_2 == 1){//sysj\ECS_plant.sysj line: 61, column: 8
                  S5056=0;
                  cutPowZ1.setPresent();//sysj\ECS_plant.sysj line: 63, column: 7
                  currsigs.addElement(cutPowZ1);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S5101=1;
                  if(zone_thread_2 == 2){//sysj\ECS_plant.sysj line: 74, column: 8
                    S5069=0;
                    cutPowZ2.setPresent();//sysj\ECS_plant.sysj line: 76, column: 7
                    currsigs.addElement(cutPowZ2);
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S5101=2;
                    if(zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 85, column: 8
                      S5106=0;
                      cutPowZ3.setPresent();//sysj\ECS_plant.sysj line: 87, column: 7
                      currsigs.addElement(cutPowZ3);
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S5101=3;
                      if(zone_thread_2 == 4){//sysj\ECS_plant.sysj line: 96, column: 8
                        S5142=0;
                        cutPowZ4.setPresent();//sysj\ECS_plant.sysj line: 98, column: 7
                        currsigs.addElement(cutPowZ4);
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
                        S5101=4;
                        if(zone_thread_2 == 5){//sysj\ECS_plant.sysj line: 107, column: 8
                          S5178=0;
                          cutPowZ5.setPresent();//sysj\ECS_plant.sysj line: 109, column: 7
                          currsigs.addElement(cutPowZ5);
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          S5101=5;
                          if(zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 118, column: 8
                            S5214=0;
                            cutPowZ6.setPresent();//sysj\ECS_plant.sysj line: 120, column: 7
                            currsigs.addElement(cutPowZ6);
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S5101=6;
                            if(zone_thread_2 == 7){//sysj\ECS_plant.sysj line: 129, column: 8
                              S5250=0;
                              cutPowZ7.setPresent();//sysj\ECS_plant.sysj line: 131, column: 7
                              currsigs.addElement(cutPowZ7);
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S5051=2;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              else {
                S5051=2;
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
            switch(S5101){
              case 0 : 
                switch(S5056){
                  case 0 : 
                    cutPowZ1.setPresent();//sysj\ECS_plant.sysj line: 63, column: 7
                    currsigs.addElement(cutPowZ1);
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                    break;
                  
                  case 1 : 
                    if(powerOff.getprestatus()){//sysj\ECS_plant.sysj line: 66, column: 12
                      S5056=2;
                      fireZone1.setPresent();//sysj\ECS_plant.sysj line: 68, column: 7
                      currsigs.addElement(fireZone1);
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
                    fireZone1.setPresent();//sysj\ECS_plant.sysj line: 68, column: 7
                    currsigs.addElement(fireZone1);
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                    break;
                  
                  case 3 : 
                    if(alarmOff.getprestatus()){//sysj\ECS_plant.sysj line: 71, column: 12
                      System.out.println("Fire Out");//sysj\ECS_plant.sysj line: 72, column: 6
                      S5101=1;
                      if(zone_thread_2 == 2){//sysj\ECS_plant.sysj line: 74, column: 8
                        S5069=0;
                        cutPowZ2.setPresent();//sysj\ECS_plant.sysj line: 76, column: 7
                        currsigs.addElement(cutPowZ2);
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
                        S5101=2;
                        if(zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 85, column: 8
                          S5106=0;
                          cutPowZ3.setPresent();//sysj\ECS_plant.sysj line: 87, column: 7
                          currsigs.addElement(cutPowZ3);
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          S5101=3;
                          if(zone_thread_2 == 4){//sysj\ECS_plant.sysj line: 96, column: 8
                            S5142=0;
                            cutPowZ4.setPresent();//sysj\ECS_plant.sysj line: 98, column: 7
                            currsigs.addElement(cutPowZ4);
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S5101=4;
                            if(zone_thread_2 == 5){//sysj\ECS_plant.sysj line: 107, column: 8
                              S5178=0;
                              cutPowZ5.setPresent();//sysj\ECS_plant.sysj line: 109, column: 7
                              currsigs.addElement(cutPowZ5);
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S5101=5;
                              if(zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 118, column: 8
                                S5214=0;
                                cutPowZ6.setPresent();//sysj\ECS_plant.sysj line: 120, column: 7
                                currsigs.addElement(cutPowZ6);
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                              else {
                                S5101=6;
                                if(zone_thread_2 == 7){//sysj\ECS_plant.sysj line: 129, column: 8
                                  S5250=0;
                                  cutPowZ7.setPresent();//sysj\ECS_plant.sysj line: 131, column: 7
                                  currsigs.addElement(cutPowZ7);
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                                else {
                                  S5051=2;
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                              }
                            }
                          }
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
                break;
              
              case 1 : 
                switch(S5069){
                  case 0 : 
                    cutPowZ2.setPresent();//sysj\ECS_plant.sysj line: 76, column: 7
                    currsigs.addElement(cutPowZ2);
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                    break;
                  
                  case 1 : 
                    if(powerOff.getprestatus()){//sysj\ECS_plant.sysj line: 79, column: 12
                      S5069=2;
                      fireZone2.setPresent();//sysj\ECS_plant.sysj line: 81, column: 7
                      currsigs.addElement(fireZone2);
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
                    fireZone2.setPresent();//sysj\ECS_plant.sysj line: 81, column: 7
                    currsigs.addElement(fireZone2);
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                    break;
                  
                }
                break;
              
              case 2 : 
                switch(S5106){
                  case 0 : 
                    cutPowZ3.setPresent();//sysj\ECS_plant.sysj line: 87, column: 7
                    currsigs.addElement(cutPowZ3);
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                    break;
                  
                  case 1 : 
                    if(powerOff.getprestatus()){//sysj\ECS_plant.sysj line: 90, column: 12
                      S5106=2;
                      fireZone3.setPresent();//sysj\ECS_plant.sysj line: 92, column: 7
                      currsigs.addElement(fireZone3);
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
                    fireZone3.setPresent();//sysj\ECS_plant.sysj line: 92, column: 7
                    currsigs.addElement(fireZone3);
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                    break;
                  
                }
                break;
              
              case 3 : 
                switch(S5142){
                  case 0 : 
                    cutPowZ4.setPresent();//sysj\ECS_plant.sysj line: 98, column: 7
                    currsigs.addElement(cutPowZ4);
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                    break;
                  
                  case 1 : 
                    if(powerOff.getprestatus()){//sysj\ECS_plant.sysj line: 101, column: 12
                      S5142=2;
                      fireZone4.setPresent();//sysj\ECS_plant.sysj line: 103, column: 7
                      currsigs.addElement(fireZone4);
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
                    fireZone4.setPresent();//sysj\ECS_plant.sysj line: 103, column: 7
                    currsigs.addElement(fireZone4);
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                    break;
                  
                }
                break;
              
              case 4 : 
                switch(S5178){
                  case 0 : 
                    cutPowZ5.setPresent();//sysj\ECS_plant.sysj line: 109, column: 7
                    currsigs.addElement(cutPowZ5);
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                    break;
                  
                  case 1 : 
                    if(powerOff.getprestatus()){//sysj\ECS_plant.sysj line: 112, column: 12
                      S5178=2;
                      fireZone5.setPresent();//sysj\ECS_plant.sysj line: 114, column: 7
                      currsigs.addElement(fireZone5);
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
                    fireZone5.setPresent();//sysj\ECS_plant.sysj line: 114, column: 7
                    currsigs.addElement(fireZone5);
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                    break;
                  
                }
                break;
              
              case 5 : 
                switch(S5214){
                  case 0 : 
                    cutPowZ6.setPresent();//sysj\ECS_plant.sysj line: 120, column: 7
                    currsigs.addElement(cutPowZ6);
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                    break;
                  
                  case 1 : 
                    if(powerOff.getprestatus()){//sysj\ECS_plant.sysj line: 123, column: 12
                      S5214=2;
                      fireZone7.setPresent();//sysj\ECS_plant.sysj line: 125, column: 7
                      currsigs.addElement(fireZone7);
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
                    fireZone7.setPresent();//sysj\ECS_plant.sysj line: 125, column: 7
                    currsigs.addElement(fireZone7);
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                    break;
                  
                }
                break;
              
              case 6 : 
                switch(S5250){
                  case 0 : 
                    cutPowZ7.setPresent();//sysj\ECS_plant.sysj line: 131, column: 7
                    currsigs.addElement(cutPowZ7);
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                    break;
                  
                  case 1 : 
                    if(powerOff.getprestatus()){//sysj\ECS_plant.sysj line: 134, column: 12
                      S5250=2;
                      fireZone7.setPresent();//sysj\ECS_plant.sysj line: 136, column: 7
                      currsigs.addElement(fireZone7);
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
                    fireZone7.setPresent();//sysj\ECS_plant.sysj line: 136, column: 7
                    currsigs.addElement(fireZone7);
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                    break;
                  
                }
                break;
              
            }
            break;
          
          case 2 : 
            if(run.getprestatus()){//sysj\ECS_plant.sysj line: 143, column: 10
              S5051=3;
              if(dust.getprestatus()){//sysj\ECS_plant.sysj line: 146, column: 12
                S5530=0;
                if(zone_thread_2 == 1){//sysj\ECS_plant.sysj line: 148, column: 8
                  cleanZone1.setPresent();//sysj\ECS_plant.sysj line: 150, column: 7
                  currsigs.addElement(cleanZone1);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S5530=1;
                  if(zone_thread_2 == 2){//sysj\ECS_plant.sysj line: 154, column: 8
                    cleanZone2.setPresent();//sysj\ECS_plant.sysj line: 156, column: 7
                    currsigs.addElement(cleanZone2);
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S5530=2;
                    if(zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 160, column: 8
                      cleanZone3.setPresent();//sysj\ECS_plant.sysj line: 162, column: 7
                      currsigs.addElement(cleanZone3);
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S5530=3;
                      if(zone_thread_2 == 4){//sysj\ECS_plant.sysj line: 166, column: 8
                        cleanZone4.setPresent();//sysj\ECS_plant.sysj line: 168, column: 7
                        currsigs.addElement(cleanZone4);
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
                        S5530=4;
                        if(zone_thread_2 == 5){//sysj\ECS_plant.sysj line: 172, column: 8
                          cleanZone5.setPresent();//sysj\ECS_plant.sysj line: 174, column: 7
                          currsigs.addElement(cleanZone5);
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          S5530=5;
                          if(zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 178, column: 8
                            cleanZone7.setPresent();//sysj\ECS_plant.sysj line: 180, column: 7
                            currsigs.addElement(cleanZone7);
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S5530=6;
                            if(zone_thread_2 == 7){//sysj\ECS_plant.sysj line: 184, column: 8
                              cleanZone7.setPresent();//sysj\ECS_plant.sysj line: 186, column: 7
                              currsigs.addElement(cleanZone7);
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S5051=4;
                              if(zone_thread_2 == 1 || zone_thread_2 == 7){//sysj\ECS_plant.sysj line: 193, column: 7
                                temp17_thread_2 = 0;//sysj\ECS_plant.sysj line: 194, column: 5
                                temp17_thread_2 = (tempZone1_7.getpreval() == null ? null : ((Integer)tempZone1_7.getpreval()));//sysj\ECS_plant.sysj line: 195, column: 5
                                if(temp17_thread_2 > 22){//sysj\ECS_plant.sysj line: 196, column: 8
                                  S5635=0;
                                  System.out.println("");//sysj\ECS_plant.sysj line: 198, column: 7
                                  System.out.println("Room temperature is too high at " + temp17_thread_2);//sysj\ECS_plant.sysj line: 199, column: 7
                                  fanOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 200, column: 7
                                  currsigs.addElement(fanOnZone1_7);
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                                else {
                                  S5635=1;
                                  if(temp17_thread_2 < 21){//sysj\ECS_plant.sysj line: 203, column: 15
                                    S5634=0;
                                    System.out.println("Room temperature is too low at " + temp17_thread_2);//sysj\ECS_plant.sysj line: 205, column: 7
                                    heatOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 206, column: 7
                                    currsigs.addElement(heatOnZone1_7);
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                  else {
                                    S5634=1;
                                    System.out.println("");//sysj\ECS_plant.sysj line: 210, column: 6
                                    System.out.println("Room temperature is safe at" + temp17_thread_2);//sysj\ECS_plant.sysj line: 211, column: 6
                                    S5051=5;
                                    if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 216, column: 7
                                      temp23_thread_2 = 0;//sysj\ECS_plant.sysj line: 217, column: 5
                                      temp23_thread_2 = (tempZone2_3.getpreval() == null ? null : ((Integer)tempZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 218, column: 5
                                      if(temp23_thread_2 > 22){//sysj\ECS_plant.sysj line: 219, column: 8
                                        S5695=0;
                                        System.out.println("");//sysj\ECS_plant.sysj line: 221, column: 7
                                        System.out.println("Room temperature is too high at " + temp23_thread_2);//sysj\ECS_plant.sysj line: 222, column: 7
                                        airOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 223, column: 7
                                        currsigs.addElement(airOnZone2_3);
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                      else {
                                        S5695=1;
                                        if(temp23_thread_2 < 21){//sysj\ECS_plant.sysj line: 226, column: 15
                                          heatOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 228, column: 7
                                          currsigs.addElement(heatOnZone2_3);
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                        else {
                                          System.out.println("");//sysj\ECS_plant.sysj line: 232, column: 6
                                          System.out.println("Room temperature is safe at" + temp23_thread_2);//sysj\ECS_plant.sysj line: 233, column: 6
                                          S5051=6;
                                          if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 239, column: 7
                                            temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 240, column: 5
                                            temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 241, column: 5
                                            if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 242, column: 8
                                              S5795=0;
                                              System.out.println("");//sysj\ECS_plant.sysj line: 244, column: 7
                                              System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 245, column: 7
                                              airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 246, column: 7
                                              currsigs.addElement(airOnZone4_5_6);
                                              active[2]=1;
                                              ends[2]=1;
                                              tdone[2]=1;
                                            }
                                            else {
                                              S5795=1;
                                              if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 249, column: 15
                                                System.out.println("");//sysj\ECS_plant.sysj line: 251, column: 7
                                                System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 252, column: 7
                                                heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 253, column: 7
                                                currsigs.addElement(heatOnZone4_5_6);
                                                active[2]=1;
                                                ends[2]=1;
                                                tdone[2]=1;
                                              }
                                              else {
                                                System.out.println("");//sysj\ECS_plant.sysj line: 257, column: 6
                                                System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 258, column: 6
                                                S5051=7;
                                                if(zone_thread_2 == 1 || zone_thread_2 == 7){//sysj\ECS_plant.sysj line: 264, column: 7
                                                  humid17_thread_2 = 0;//sysj\ECS_plant.sysj line: 265, column: 5
                                                  humid17_thread_2 = (humidZone1_7.getpreval() == null ? null : ((Integer)humidZone1_7.getpreval()));//sysj\ECS_plant.sysj line: 266, column: 5
                                                  if(humid17_thread_2 > 60){//sysj\ECS_plant.sysj line: 267, column: 8
                                                    S5975=0;
                                                    System.out.println("");//sysj\ECS_plant.sysj line: 269, column: 7
                                                    System.out.println("Room humidity is too high at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 270, column: 7
                                                    System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 271, column: 7
                                                    deHumOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 272, column: 7
                                                    currsigs.addElement(deHumOnZone1_7);
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                  else {
                                                    S5975=1;
                                                    if(humid17_thread_2 < 30){//sysj\ECS_plant.sysj line: 275, column: 15
                                                      System.out.println("");//sysj\ECS_plant.sysj line: 277, column: 7
                                                      System.out.println("Room humidity is too low at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 278, column: 7
                                                      System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 279, column: 7
                                                      humOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 280, column: 7
                                                      currsigs.addElement(humOnZone1_7);
                                                      active[2]=1;
                                                      ends[2]=1;
                                                      tdone[2]=1;
                                                    }
                                                    else {
                                                      System.out.println("");//sysj\ECS_plant.sysj line: 284, column: 6
                                                      System.out.println("Room humidity is safe at" + humid17_thread_2);//sysj\ECS_plant.sysj line: 285, column: 6
                                                      S5051=8;
                                                      if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 290, column: 7
                                                        humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 291, column: 5
                                                        humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 292, column: 5
                                                        if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 293, column: 8
                                                          S6315=0;
                                                          System.out.println("");//sysj\ECS_plant.sysj line: 295, column: 7
                                                          System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 296, column: 7
                                                          System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 297, column: 7
                                                          deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 298, column: 7
                                                          currsigs.addElement(deHumOnZone2_3);
                                                          active[2]=1;
                                                          ends[2]=1;
                                                          tdone[2]=1;
                                                        }
                                                        else {
                                                          S6315=1;
                                                          if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 301, column: 15
                                                            System.out.println("");//sysj\ECS_plant.sysj line: 303, column: 7
                                                            System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 304, column: 7
                                                            System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 305, column: 7
                                                            humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 306, column: 7
                                                            currsigs.addElement(humOnZone2_3);
                                                            active[2]=1;
                                                            ends[2]=1;
                                                            tdone[2]=1;
                                                          }
                                                          else {
                                                            System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 6
                                                            System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 311, column: 6
                                                            S5051=9;
                                                            if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 316, column: 7
                                                              humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 317, column: 5
                                                              humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 318, column: 5
                                                              if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 319, column: 8
                                                                S6975=0;
                                                                System.out.println("");//sysj\ECS_plant.sysj line: 321, column: 7
                                                                System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 322, column: 7
                                                                System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 323, column: 7
                                                                deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 324, column: 7
                                                                currsigs.addElement(deHumOnZone4_5_6);
                                                                active[2]=1;
                                                                ends[2]=1;
                                                                tdone[2]=1;
                                                              }
                                                              else {
                                                                S6975=1;
                                                                if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 327, column: 15
                                                                  System.out.println("");//sysj\ECS_plant.sysj line: 329, column: 7
                                                                  System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 330, column: 7
                                                                  System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 331, column: 7
                                                                  humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 332, column: 7
                                                                  currsigs.addElement(humOnZone4_5_6);
                                                                  active[2]=1;
                                                                  ends[2]=1;
                                                                  tdone[2]=1;
                                                                }
                                                                else {
                                                                  System.out.println("");//sysj\ECS_plant.sysj line: 336, column: 6
                                                                  System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 337, column: 6
                                                                  S5051=10;
                                                                  active[2]=1;
                                                                  ends[2]=1;
                                                                  tdone[2]=1;
                                                                }
                                                              }
                                                            }
                                                            else {
                                                              S5051=10;
                                                              active[2]=1;
                                                              ends[2]=1;
                                                              tdone[2]=1;
                                                            }
                                                          }
                                                        }
                                                      }
                                                      else {
                                                        S5051=9;
                                                        if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 316, column: 7
                                                          humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 317, column: 5
                                                          humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 318, column: 5
                                                          if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 319, column: 8
                                                            S6975=0;
                                                            System.out.println("");//sysj\ECS_plant.sysj line: 321, column: 7
                                                            System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 322, column: 7
                                                            System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 323, column: 7
                                                            deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 324, column: 7
                                                            currsigs.addElement(deHumOnZone4_5_6);
                                                            active[2]=1;
                                                            ends[2]=1;
                                                            tdone[2]=1;
                                                          }
                                                          else {
                                                            S6975=1;
                                                            if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 327, column: 15
                                                              System.out.println("");//sysj\ECS_plant.sysj line: 329, column: 7
                                                              System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 330, column: 7
                                                              System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 331, column: 7
                                                              humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 332, column: 7
                                                              currsigs.addElement(humOnZone4_5_6);
                                                              active[2]=1;
                                                              ends[2]=1;
                                                              tdone[2]=1;
                                                            }
                                                            else {
                                                              System.out.println("");//sysj\ECS_plant.sysj line: 336, column: 6
                                                              System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 337, column: 6
                                                              S5051=10;
                                                              active[2]=1;
                                                              ends[2]=1;
                                                              tdone[2]=1;
                                                            }
                                                          }
                                                        }
                                                        else {
                                                          S5051=10;
                                                          active[2]=1;
                                                          ends[2]=1;
                                                          tdone[2]=1;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                                else {
                                                  S5051=8;
                                                  if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 290, column: 7
                                                    humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 291, column: 5
                                                    humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 292, column: 5
                                                    if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 293, column: 8
                                                      S6315=0;
                                                      System.out.println("");//sysj\ECS_plant.sysj line: 295, column: 7
                                                      System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 296, column: 7
                                                      System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 297, column: 7
                                                      deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 298, column: 7
                                                      currsigs.addElement(deHumOnZone2_3);
                                                      active[2]=1;
                                                      ends[2]=1;
                                                      tdone[2]=1;
                                                    }
                                                    else {
                                                      S6315=1;
                                                      if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 301, column: 15
                                                        System.out.println("");//sysj\ECS_plant.sysj line: 303, column: 7
                                                        System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 304, column: 7
                                                        System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 305, column: 7
                                                        humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 306, column: 7
                                                        currsigs.addElement(humOnZone2_3);
                                                        active[2]=1;
                                                        ends[2]=1;
                                                        tdone[2]=1;
                                                      }
                                                      else {
                                                        System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 6
                                                        System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 311, column: 6
                                                        S5051=9;
                                                        if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 316, column: 7
                                                          humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 317, column: 5
                                                          humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 318, column: 5
                                                          if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 319, column: 8
                                                            S6975=0;
                                                            System.out.println("");//sysj\ECS_plant.sysj line: 321, column: 7
                                                            System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 322, column: 7
                                                            System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 323, column: 7
                                                            deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 324, column: 7
                                                            currsigs.addElement(deHumOnZone4_5_6);
                                                            active[2]=1;
                                                            ends[2]=1;
                                                            tdone[2]=1;
                                                          }
                                                          else {
                                                            S6975=1;
                                                            if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 327, column: 15
                                                              System.out.println("");//sysj\ECS_plant.sysj line: 329, column: 7
                                                              System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 330, column: 7
                                                              System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 331, column: 7
                                                              humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 332, column: 7
                                                              currsigs.addElement(humOnZone4_5_6);
                                                              active[2]=1;
                                                              ends[2]=1;
                                                              tdone[2]=1;
                                                            }
                                                            else {
                                                              System.out.println("");//sysj\ECS_plant.sysj line: 336, column: 6
                                                              System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 337, column: 6
                                                              S5051=10;
                                                              active[2]=1;
                                                              ends[2]=1;
                                                              tdone[2]=1;
                                                            }
                                                          }
                                                        }
                                                        else {
                                                          S5051=10;
                                                          active[2]=1;
                                                          ends[2]=1;
                                                          tdone[2]=1;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  else {
                                                    S5051=9;
                                                    if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 316, column: 7
                                                      humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 317, column: 5
                                                      humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 318, column: 5
                                                      if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 319, column: 8
                                                        S6975=0;
                                                        System.out.println("");//sysj\ECS_plant.sysj line: 321, column: 7
                                                        System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 322, column: 7
                                                        System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 323, column: 7
                                                        deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 324, column: 7
                                                        currsigs.addElement(deHumOnZone4_5_6);
                                                        active[2]=1;
                                                        ends[2]=1;
                                                        tdone[2]=1;
                                                      }
                                                      else {
                                                        S6975=1;
                                                        if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 327, column: 15
                                                          System.out.println("");//sysj\ECS_plant.sysj line: 329, column: 7
                                                          System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 330, column: 7
                                                          System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 331, column: 7
                                                          humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 332, column: 7
                                                          currsigs.addElement(humOnZone4_5_6);
                                                          active[2]=1;
                                                          ends[2]=1;
                                                          tdone[2]=1;
                                                        }
                                                        else {
                                                          System.out.println("");//sysj\ECS_plant.sysj line: 336, column: 6
                                                          System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 337, column: 6
                                                          S5051=10;
                                                          active[2]=1;
                                                          ends[2]=1;
                                                          tdone[2]=1;
                                                        }
                                                      }
                                                    }
                                                    else {
                                                      S5051=10;
                                                      active[2]=1;
                                                      ends[2]=1;
                                                      tdone[2]=1;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          else {
                                            S5051=7;
                                            if(zone_thread_2 == 1 || zone_thread_2 == 7){//sysj\ECS_plant.sysj line: 264, column: 7
                                              humid17_thread_2 = 0;//sysj\ECS_plant.sysj line: 265, column: 5
                                              humid17_thread_2 = (humidZone1_7.getpreval() == null ? null : ((Integer)humidZone1_7.getpreval()));//sysj\ECS_plant.sysj line: 266, column: 5
                                              if(humid17_thread_2 > 60){//sysj\ECS_plant.sysj line: 267, column: 8
                                                S5975=0;
                                                System.out.println("");//sysj\ECS_plant.sysj line: 269, column: 7
                                                System.out.println("Room humidity is too high at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 270, column: 7
                                                System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 271, column: 7
                                                deHumOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 272, column: 7
                                                currsigs.addElement(deHumOnZone1_7);
                                                active[2]=1;
                                                ends[2]=1;
                                                tdone[2]=1;
                                              }
                                              else {
                                                S5975=1;
                                                if(humid17_thread_2 < 30){//sysj\ECS_plant.sysj line: 275, column: 15
                                                  System.out.println("");//sysj\ECS_plant.sysj line: 277, column: 7
                                                  System.out.println("Room humidity is too low at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 278, column: 7
                                                  System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 279, column: 7
                                                  humOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 280, column: 7
                                                  currsigs.addElement(humOnZone1_7);
                                                  active[2]=1;
                                                  ends[2]=1;
                                                  tdone[2]=1;
                                                }
                                                else {
                                                  System.out.println("");//sysj\ECS_plant.sysj line: 284, column: 6
                                                  System.out.println("Room humidity is safe at" + humid17_thread_2);//sysj\ECS_plant.sysj line: 285, column: 6
                                                  S5051=8;
                                                  if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 290, column: 7
                                                    humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 291, column: 5
                                                    humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 292, column: 5
                                                    if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 293, column: 8
                                                      S6315=0;
                                                      System.out.println("");//sysj\ECS_plant.sysj line: 295, column: 7
                                                      System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 296, column: 7
                                                      System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 297, column: 7
                                                      deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 298, column: 7
                                                      currsigs.addElement(deHumOnZone2_3);
                                                      active[2]=1;
                                                      ends[2]=1;
                                                      tdone[2]=1;
                                                    }
                                                    else {
                                                      S6315=1;
                                                      if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 301, column: 15
                                                        System.out.println("");//sysj\ECS_plant.sysj line: 303, column: 7
                                                        System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 304, column: 7
                                                        System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 305, column: 7
                                                        humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 306, column: 7
                                                        currsigs.addElement(humOnZone2_3);
                                                        active[2]=1;
                                                        ends[2]=1;
                                                        tdone[2]=1;
                                                      }
                                                      else {
                                                        System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 6
                                                        System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 311, column: 6
                                                        S5051=9;
                                                        if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 316, column: 7
                                                          humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 317, column: 5
                                                          humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 318, column: 5
                                                          if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 319, column: 8
                                                            S6975=0;
                                                            System.out.println("");//sysj\ECS_plant.sysj line: 321, column: 7
                                                            System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 322, column: 7
                                                            System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 323, column: 7
                                                            deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 324, column: 7
                                                            currsigs.addElement(deHumOnZone4_5_6);
                                                            active[2]=1;
                                                            ends[2]=1;
                                                            tdone[2]=1;
                                                          }
                                                          else {
                                                            S6975=1;
                                                            if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 327, column: 15
                                                              System.out.println("");//sysj\ECS_plant.sysj line: 329, column: 7
                                                              System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 330, column: 7
                                                              System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 331, column: 7
                                                              humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 332, column: 7
                                                              currsigs.addElement(humOnZone4_5_6);
                                                              active[2]=1;
                                                              ends[2]=1;
                                                              tdone[2]=1;
                                                            }
                                                            else {
                                                              System.out.println("");//sysj\ECS_plant.sysj line: 336, column: 6
                                                              System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 337, column: 6
                                                              S5051=10;
                                                              active[2]=1;
                                                              ends[2]=1;
                                                              tdone[2]=1;
                                                            }
                                                          }
                                                        }
                                                        else {
                                                          S5051=10;
                                                          active[2]=1;
                                                          ends[2]=1;
                                                          tdone[2]=1;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  else {
                                                    S5051=9;
                                                    if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 316, column: 7
                                                      humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 317, column: 5
                                                      humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 318, column: 5
                                                      if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 319, column: 8
                                                        S6975=0;
                                                        System.out.println("");//sysj\ECS_plant.sysj line: 321, column: 7
                                                        System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 322, column: 7
                                                        System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 323, column: 7
                                                        deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 324, column: 7
                                                        currsigs.addElement(deHumOnZone4_5_6);
                                                        active[2]=1;
                                                        ends[2]=1;
                                                        tdone[2]=1;
                                                      }
                                                      else {
                                                        S6975=1;
                                                        if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 327, column: 15
                                                          System.out.println("");//sysj\ECS_plant.sysj line: 329, column: 7
                                                          System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 330, column: 7
                                                          System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 331, column: 7
                                                          humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 332, column: 7
                                                          currsigs.addElement(humOnZone4_5_6);
                                                          active[2]=1;
                                                          ends[2]=1;
                                                          tdone[2]=1;
                                                        }
                                                        else {
                                                          System.out.println("");//sysj\ECS_plant.sysj line: 336, column: 6
                                                          System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 337, column: 6
                                                          S5051=10;
                                                          active[2]=1;
                                                          ends[2]=1;
                                                          tdone[2]=1;
                                                        }
                                                      }
                                                    }
                                                    else {
                                                      S5051=10;
                                                      active[2]=1;
                                                      ends[2]=1;
                                                      tdone[2]=1;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            else {
                                              S5051=8;
                                              if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 290, column: 7
                                                humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 291, column: 5
                                                humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 292, column: 5
                                                if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 293, column: 8
                                                  S6315=0;
                                                  System.out.println("");//sysj\ECS_plant.sysj line: 295, column: 7
                                                  System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 296, column: 7
                                                  System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 297, column: 7
                                                  deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 298, column: 7
                                                  currsigs.addElement(deHumOnZone2_3);
                                                  active[2]=1;
                                                  ends[2]=1;
                                                  tdone[2]=1;
                                                }
                                                else {
                                                  S6315=1;
                                                  if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 301, column: 15
                                                    System.out.println("");//sysj\ECS_plant.sysj line: 303, column: 7
                                                    System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 304, column: 7
                                                    System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 305, column: 7
                                                    humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 306, column: 7
                                                    currsigs.addElement(humOnZone2_3);
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                  else {
                                                    System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 6
                                                    System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 311, column: 6
                                                    S5051=9;
                                                    if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 316, column: 7
                                                      humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 317, column: 5
                                                      humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 318, column: 5
                                                      if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 319, column: 8
                                                        S6975=0;
                                                        System.out.println("");//sysj\ECS_plant.sysj line: 321, column: 7
                                                        System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 322, column: 7
                                                        System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 323, column: 7
                                                        deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 324, column: 7
                                                        currsigs.addElement(deHumOnZone4_5_6);
                                                        active[2]=1;
                                                        ends[2]=1;
                                                        tdone[2]=1;
                                                      }
                                                      else {
                                                        S6975=1;
                                                        if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 327, column: 15
                                                          System.out.println("");//sysj\ECS_plant.sysj line: 329, column: 7
                                                          System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 330, column: 7
                                                          System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 331, column: 7
                                                          humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 332, column: 7
                                                          currsigs.addElement(humOnZone4_5_6);
                                                          active[2]=1;
                                                          ends[2]=1;
                                                          tdone[2]=1;
                                                        }
                                                        else {
                                                          System.out.println("");//sysj\ECS_plant.sysj line: 336, column: 6
                                                          System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 337, column: 6
                                                          S5051=10;
                                                          active[2]=1;
                                                          ends[2]=1;
                                                          tdone[2]=1;
                                                        }
                                                      }
                                                    }
                                                    else {
                                                      S5051=10;
                                                      active[2]=1;
                                                      ends[2]=1;
                                                      tdone[2]=1;
                                                    }
                                                  }
                                                }
                                              }
                                              else {
                                                S5051=9;
                                                if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 316, column: 7
                                                  humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 317, column: 5
                                                  humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 318, column: 5
                                                  if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 319, column: 8
                                                    S6975=0;
                                                    System.out.println("");//sysj\ECS_plant.sysj line: 321, column: 7
                                                    System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 322, column: 7
                                                    System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 323, column: 7
                                                    deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 324, column: 7
                                                    currsigs.addElement(deHumOnZone4_5_6);
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                  else {
                                                    S6975=1;
                                                    if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 327, column: 15
                                                      System.out.println("");//sysj\ECS_plant.sysj line: 329, column: 7
                                                      System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 330, column: 7
                                                      System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 331, column: 7
                                                      humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 332, column: 7
                                                      currsigs.addElement(humOnZone4_5_6);
                                                      active[2]=1;
                                                      ends[2]=1;
                                                      tdone[2]=1;
                                                    }
                                                    else {
                                                      System.out.println("");//sysj\ECS_plant.sysj line: 336, column: 6
                                                      System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 337, column: 6
                                                      S5051=10;
                                                      active[2]=1;
                                                      ends[2]=1;
                                                      tdone[2]=1;
                                                    }
                                                  }
                                                }
                                                else {
                                                  S5051=10;
                                                  active[2]=1;
                                                  ends[2]=1;
                                                  tdone[2]=1;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    else {
                                      S5051=6;
                                      if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 239, column: 7
                                        temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 240, column: 5
                                        temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 241, column: 5
                                        if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 242, column: 8
                                          S5795=0;
                                          System.out.println("");//sysj\ECS_plant.sysj line: 244, column: 7
                                          System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 245, column: 7
                                          airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 246, column: 7
                                          currsigs.addElement(airOnZone4_5_6);
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                        else {
                                          S5795=1;
                                          if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 249, column: 15
                                            System.out.println("");//sysj\ECS_plant.sysj line: 251, column: 7
                                            System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 252, column: 7
                                            heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 253, column: 7
                                            currsigs.addElement(heatOnZone4_5_6);
                                            active[2]=1;
                                            ends[2]=1;
                                            tdone[2]=1;
                                          }
                                          else {
                                            System.out.println("");//sysj\ECS_plant.sysj line: 257, column: 6
                                            System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 258, column: 6
                                            S5051=7;
                                            if(zone_thread_2 == 1 || zone_thread_2 == 7){//sysj\ECS_plant.sysj line: 264, column: 7
                                              humid17_thread_2 = 0;//sysj\ECS_plant.sysj line: 265, column: 5
                                              humid17_thread_2 = (humidZone1_7.getpreval() == null ? null : ((Integer)humidZone1_7.getpreval()));//sysj\ECS_plant.sysj line: 266, column: 5
                                              if(humid17_thread_2 > 60){//sysj\ECS_plant.sysj line: 267, column: 8
                                                S5975=0;
                                                System.out.println("");//sysj\ECS_plant.sysj line: 269, column: 7
                                                System.out.println("Room humidity is too high at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 270, column: 7
                                                System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 271, column: 7
                                                deHumOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 272, column: 7
                                                currsigs.addElement(deHumOnZone1_7);
                                                active[2]=1;
                                                ends[2]=1;
                                                tdone[2]=1;
                                              }
                                              else {
                                                S5975=1;
                                                if(humid17_thread_2 < 30){//sysj\ECS_plant.sysj line: 275, column: 15
                                                  System.out.println("");//sysj\ECS_plant.sysj line: 277, column: 7
                                                  System.out.println("Room humidity is too low at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 278, column: 7
                                                  System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 279, column: 7
                                                  humOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 280, column: 7
                                                  currsigs.addElement(humOnZone1_7);
                                                  active[2]=1;
                                                  ends[2]=1;
                                                  tdone[2]=1;
                                                }
                                                else {
                                                  System.out.println("");//sysj\ECS_plant.sysj line: 284, column: 6
                                                  System.out.println("Room humidity is safe at" + humid17_thread_2);//sysj\ECS_plant.sysj line: 285, column: 6
                                                  S5051=8;
                                                  if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 290, column: 7
                                                    humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 291, column: 5
                                                    humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 292, column: 5
                                                    if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 293, column: 8
                                                      S6315=0;
                                                      System.out.println("");//sysj\ECS_plant.sysj line: 295, column: 7
                                                      System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 296, column: 7
                                                      System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 297, column: 7
                                                      deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 298, column: 7
                                                      currsigs.addElement(deHumOnZone2_3);
                                                      active[2]=1;
                                                      ends[2]=1;
                                                      tdone[2]=1;
                                                    }
                                                    else {
                                                      S6315=1;
                                                      if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 301, column: 15
                                                        System.out.println("");//sysj\ECS_plant.sysj line: 303, column: 7
                                                        System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 304, column: 7
                                                        System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 305, column: 7
                                                        humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 306, column: 7
                                                        currsigs.addElement(humOnZone2_3);
                                                        active[2]=1;
                                                        ends[2]=1;
                                                        tdone[2]=1;
                                                      }
                                                      else {
                                                        System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 6
                                                        System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 311, column: 6
                                                        S5051=9;
                                                        if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 316, column: 7
                                                          humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 317, column: 5
                                                          humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 318, column: 5
                                                          if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 319, column: 8
                                                            S6975=0;
                                                            System.out.println("");//sysj\ECS_plant.sysj line: 321, column: 7
                                                            System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 322, column: 7
                                                            System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 323, column: 7
                                                            deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 324, column: 7
                                                            currsigs.addElement(deHumOnZone4_5_6);
                                                            active[2]=1;
                                                            ends[2]=1;
                                                            tdone[2]=1;
                                                          }
                                                          else {
                                                            S6975=1;
                                                            if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 327, column: 15
                                                              System.out.println("");//sysj\ECS_plant.sysj line: 329, column: 7
                                                              System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 330, column: 7
                                                              System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 331, column: 7
                                                              humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 332, column: 7
                                                              currsigs.addElement(humOnZone4_5_6);
                                                              active[2]=1;
                                                              ends[2]=1;
                                                              tdone[2]=1;
                                                            }
                                                            else {
                                                              System.out.println("");//sysj\ECS_plant.sysj line: 336, column: 6
                                                              System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 337, column: 6
                                                              S5051=10;
                                                              active[2]=1;
                                                              ends[2]=1;
                                                              tdone[2]=1;
                                                            }
                                                          }
                                                        }
                                                        else {
                                                          S5051=10;
                                                          active[2]=1;
                                                          ends[2]=1;
                                                          tdone[2]=1;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  else {
                                                    S5051=9;
                                                    if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 316, column: 7
                                                      humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 317, column: 5
                                                      humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 318, column: 5
                                                      if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 319, column: 8
                                                        S6975=0;
                                                        System.out.println("");//sysj\ECS_plant.sysj line: 321, column: 7
                                                        System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 322, column: 7
                                                        System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 323, column: 7
                                                        deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 324, column: 7
                                                        currsigs.addElement(deHumOnZone4_5_6);
                                                        active[2]=1;
                                                        ends[2]=1;
                                                        tdone[2]=1;
                                                      }
                                                      else {
                                                        S6975=1;
                                                        if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 327, column: 15
                                                          System.out.println("");//sysj\ECS_plant.sysj line: 329, column: 7
                                                          System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 330, column: 7
                                                          System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 331, column: 7
                                                          humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 332, column: 7
                                                          currsigs.addElement(humOnZone4_5_6);
                                                          active[2]=1;
                                                          ends[2]=1;
                                                          tdone[2]=1;
                                                        }
                                                        else {
                                                          System.out.println("");//sysj\ECS_plant.sysj line: 336, column: 6
                                                          System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 337, column: 6
                                                          S5051=10;
                                                          active[2]=1;
                                                          ends[2]=1;
                                                          tdone[2]=1;
                                                        }
                                                      }
                                                    }
                                                    else {
                                                      S5051=10;
                                                      active[2]=1;
                                                      ends[2]=1;
                                                      tdone[2]=1;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            else {
                                              S5051=8;
                                              if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 290, column: 7
                                                humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 291, column: 5
                                                humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 292, column: 5
                                                if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 293, column: 8
                                                  S6315=0;
                                                  System.out.println("");//sysj\ECS_plant.sysj line: 295, column: 7
                                                  System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 296, column: 7
                                                  System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 297, column: 7
                                                  deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 298, column: 7
                                                  currsigs.addElement(deHumOnZone2_3);
                                                  active[2]=1;
                                                  ends[2]=1;
                                                  tdone[2]=1;
                                                }
                                                else {
                                                  S6315=1;
                                                  if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 301, column: 15
                                                    System.out.println("");//sysj\ECS_plant.sysj line: 303, column: 7
                                                    System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 304, column: 7
                                                    System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 305, column: 7
                                                    humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 306, column: 7
                                                    currsigs.addElement(humOnZone2_3);
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                  else {
                                                    System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 6
                                                    System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 311, column: 6
                                                    S5051=9;
                                                    if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 316, column: 7
                                                      humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 317, column: 5
                                                      humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 318, column: 5
                                                      if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 319, column: 8
                                                        S6975=0;
                                                        System.out.println("");//sysj\ECS_plant.sysj line: 321, column: 7
                                                        System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 322, column: 7
                                                        System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 323, column: 7
                                                        deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 324, column: 7
                                                        currsigs.addElement(deHumOnZone4_5_6);
                                                        active[2]=1;
                                                        ends[2]=1;
                                                        tdone[2]=1;
                                                      }
                                                      else {
                                                        S6975=1;
                                                        if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 327, column: 15
                                                          System.out.println("");//sysj\ECS_plant.sysj line: 329, column: 7
                                                          System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 330, column: 7
                                                          System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 331, column: 7
                                                          humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 332, column: 7
                                                          currsigs.addElement(humOnZone4_5_6);
                                                          active[2]=1;
                                                          ends[2]=1;
                                                          tdone[2]=1;
                                                        }
                                                        else {
                                                          System.out.println("");//sysj\ECS_plant.sysj line: 336, column: 6
                                                          System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 337, column: 6
                                                          S5051=10;
                                                          active[2]=1;
                                                          ends[2]=1;
                                                          tdone[2]=1;
                                                        }
                                                      }
                                                    }
                                                    else {
                                                      S5051=10;
                                                      active[2]=1;
                                                      ends[2]=1;
                                                      tdone[2]=1;
                                                    }
                                                  }
                                                }
                                              }
                                              else {
                                                S5051=9;
                                                if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 316, column: 7
                                                  humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 317, column: 5
                                                  humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 318, column: 5
                                                  if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 319, column: 8
                                                    S6975=0;
                                                    System.out.println("");//sysj\ECS_plant.sysj line: 321, column: 7
                                                    System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 322, column: 7
                                                    System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 323, column: 7
                                                    deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 324, column: 7
                                                    currsigs.addElement(deHumOnZone4_5_6);
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                  else {
                                                    S6975=1;
                                                    if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 327, column: 15
                                                      System.out.println("");//sysj\ECS_plant.sysj line: 329, column: 7
                                                      System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 330, column: 7
                                                      System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 331, column: 7
                                                      humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 332, column: 7
                                                      currsigs.addElement(humOnZone4_5_6);
                                                      active[2]=1;
                                                      ends[2]=1;
                                                      tdone[2]=1;
                                                    }
                                                    else {
                                                      System.out.println("");//sysj\ECS_plant.sysj line: 336, column: 6
                                                      System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 337, column: 6
                                                      S5051=10;
                                                      active[2]=1;
                                                      ends[2]=1;
                                                      tdone[2]=1;
                                                    }
                                                  }
                                                }
                                                else {
                                                  S5051=10;
                                                  active[2]=1;
                                                  ends[2]=1;
                                                  tdone[2]=1;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                      else {
                                        S5051=7;
                                        if(zone_thread_2 == 1 || zone_thread_2 == 7){//sysj\ECS_plant.sysj line: 264, column: 7
                                          humid17_thread_2 = 0;//sysj\ECS_plant.sysj line: 265, column: 5
                                          humid17_thread_2 = (humidZone1_7.getpreval() == null ? null : ((Integer)humidZone1_7.getpreval()));//sysj\ECS_plant.sysj line: 266, column: 5
                                          if(humid17_thread_2 > 60){//sysj\ECS_plant.sysj line: 267, column: 8
                                            S5975=0;
                                            System.out.println("");//sysj\ECS_plant.sysj line: 269, column: 7
                                            System.out.println("Room humidity is too high at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 270, column: 7
                                            System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 271, column: 7
                                            deHumOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 272, column: 7
                                            currsigs.addElement(deHumOnZone1_7);
                                            active[2]=1;
                                            ends[2]=1;
                                            tdone[2]=1;
                                          }
                                          else {
                                            S5975=1;
                                            if(humid17_thread_2 < 30){//sysj\ECS_plant.sysj line: 275, column: 15
                                              System.out.println("");//sysj\ECS_plant.sysj line: 277, column: 7
                                              System.out.println("Room humidity is too low at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 278, column: 7
                                              System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 279, column: 7
                                              humOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 280, column: 7
                                              currsigs.addElement(humOnZone1_7);
                                              active[2]=1;
                                              ends[2]=1;
                                              tdone[2]=1;
                                            }
                                            else {
                                              System.out.println("");//sysj\ECS_plant.sysj line: 284, column: 6
                                              System.out.println("Room humidity is safe at" + humid17_thread_2);//sysj\ECS_plant.sysj line: 285, column: 6
                                              S5051=8;
                                              if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 290, column: 7
                                                humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 291, column: 5
                                                humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 292, column: 5
                                                if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 293, column: 8
                                                  S6315=0;
                                                  System.out.println("");//sysj\ECS_plant.sysj line: 295, column: 7
                                                  System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 296, column: 7
                                                  System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 297, column: 7
                                                  deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 298, column: 7
                                                  currsigs.addElement(deHumOnZone2_3);
                                                  active[2]=1;
                                                  ends[2]=1;
                                                  tdone[2]=1;
                                                }
                                                else {
                                                  S6315=1;
                                                  if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 301, column: 15
                                                    System.out.println("");//sysj\ECS_plant.sysj line: 303, column: 7
                                                    System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 304, column: 7
                                                    System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 305, column: 7
                                                    humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 306, column: 7
                                                    currsigs.addElement(humOnZone2_3);
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                  else {
                                                    System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 6
                                                    System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 311, column: 6
                                                    S5051=9;
                                                    if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 316, column: 7
                                                      humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 317, column: 5
                                                      humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 318, column: 5
                                                      if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 319, column: 8
                                                        S6975=0;
                                                        System.out.println("");//sysj\ECS_plant.sysj line: 321, column: 7
                                                        System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 322, column: 7
                                                        System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 323, column: 7
                                                        deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 324, column: 7
                                                        currsigs.addElement(deHumOnZone4_5_6);
                                                        active[2]=1;
                                                        ends[2]=1;
                                                        tdone[2]=1;
                                                      }
                                                      else {
                                                        S6975=1;
                                                        if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 327, column: 15
                                                          System.out.println("");//sysj\ECS_plant.sysj line: 329, column: 7
                                                          System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 330, column: 7
                                                          System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 331, column: 7
                                                          humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 332, column: 7
                                                          currsigs.addElement(humOnZone4_5_6);
                                                          active[2]=1;
                                                          ends[2]=1;
                                                          tdone[2]=1;
                                                        }
                                                        else {
                                                          System.out.println("");//sysj\ECS_plant.sysj line: 336, column: 6
                                                          System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 337, column: 6
                                                          S5051=10;
                                                          active[2]=1;
                                                          ends[2]=1;
                                                          tdone[2]=1;
                                                        }
                                                      }
                                                    }
                                                    else {
                                                      S5051=10;
                                                      active[2]=1;
                                                      ends[2]=1;
                                                      tdone[2]=1;
                                                    }
                                                  }
                                                }
                                              }
                                              else {
                                                S5051=9;
                                                if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 316, column: 7
                                                  humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 317, column: 5
                                                  humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 318, column: 5
                                                  if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 319, column: 8
                                                    S6975=0;
                                                    System.out.println("");//sysj\ECS_plant.sysj line: 321, column: 7
                                                    System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 322, column: 7
                                                    System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 323, column: 7
                                                    deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 324, column: 7
                                                    currsigs.addElement(deHumOnZone4_5_6);
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                  else {
                                                    S6975=1;
                                                    if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 327, column: 15
                                                      System.out.println("");//sysj\ECS_plant.sysj line: 329, column: 7
                                                      System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 330, column: 7
                                                      System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 331, column: 7
                                                      humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 332, column: 7
                                                      currsigs.addElement(humOnZone4_5_6);
                                                      active[2]=1;
                                                      ends[2]=1;
                                                      tdone[2]=1;
                                                    }
                                                    else {
                                                      System.out.println("");//sysj\ECS_plant.sysj line: 336, column: 6
                                                      System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 337, column: 6
                                                      S5051=10;
                                                      active[2]=1;
                                                      ends[2]=1;
                                                      tdone[2]=1;
                                                    }
                                                  }
                                                }
                                                else {
                                                  S5051=10;
                                                  active[2]=1;
                                                  ends[2]=1;
                                                  tdone[2]=1;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        else {
                                          S5051=8;
                                          if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 290, column: 7
                                            humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 291, column: 5
                                            humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 292, column: 5
                                            if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 293, column: 8
                                              S6315=0;
                                              System.out.println("");//sysj\ECS_plant.sysj line: 295, column: 7
                                              System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 296, column: 7
                                              System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 297, column: 7
                                              deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 298, column: 7
                                              currsigs.addElement(deHumOnZone2_3);
                                              active[2]=1;
                                              ends[2]=1;
                                              tdone[2]=1;
                                            }
                                            else {
                                              S6315=1;
                                              if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 301, column: 15
                                                System.out.println("");//sysj\ECS_plant.sysj line: 303, column: 7
                                                System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 304, column: 7
                                                System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 305, column: 7
                                                humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 306, column: 7
                                                currsigs.addElement(humOnZone2_3);
                                                active[2]=1;
                                                ends[2]=1;
                                                tdone[2]=1;
                                              }
                                              else {
                                                System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 6
                                                System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 311, column: 6
                                                S5051=9;
                                                if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 316, column: 7
                                                  humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 317, column: 5
                                                  humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 318, column: 5
                                                  if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 319, column: 8
                                                    S6975=0;
                                                    System.out.println("");//sysj\ECS_plant.sysj line: 321, column: 7
                                                    System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 322, column: 7
                                                    System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 323, column: 7
                                                    deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 324, column: 7
                                                    currsigs.addElement(deHumOnZone4_5_6);
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                  else {
                                                    S6975=1;
                                                    if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 327, column: 15
                                                      System.out.println("");//sysj\ECS_plant.sysj line: 329, column: 7
                                                      System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 330, column: 7
                                                      System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 331, column: 7
                                                      humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 332, column: 7
                                                      currsigs.addElement(humOnZone4_5_6);
                                                      active[2]=1;
                                                      ends[2]=1;
                                                      tdone[2]=1;
                                                    }
                                                    else {
                                                      System.out.println("");//sysj\ECS_plant.sysj line: 336, column: 6
                                                      System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 337, column: 6
                                                      S5051=10;
                                                      active[2]=1;
                                                      ends[2]=1;
                                                      tdone[2]=1;
                                                    }
                                                  }
                                                }
                                                else {
                                                  S5051=10;
                                                  active[2]=1;
                                                  ends[2]=1;
                                                  tdone[2]=1;
                                                }
                                              }
                                            }
                                          }
                                          else {
                                            S5051=9;
                                            if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 316, column: 7
                                              humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 317, column: 5
                                              humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 318, column: 5
                                              if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 319, column: 8
                                                S6975=0;
                                                System.out.println("");//sysj\ECS_plant.sysj line: 321, column: 7
                                                System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 322, column: 7
                                                System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 323, column: 7
                                                deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 324, column: 7
                                                currsigs.addElement(deHumOnZone4_5_6);
                                                active[2]=1;
                                                ends[2]=1;
                                                tdone[2]=1;
                                              }
                                              else {
                                                S6975=1;
                                                if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 327, column: 15
                                                  System.out.println("");//sysj\ECS_plant.sysj line: 329, column: 7
                                                  System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 330, column: 7
                                                  System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 331, column: 7
                                                  humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 332, column: 7
                                                  currsigs.addElement(humOnZone4_5_6);
                                                  active[2]=1;
                                                  ends[2]=1;
                                                  tdone[2]=1;
                                                }
                                                else {
                                                  System.out.println("");//sysj\ECS_plant.sysj line: 336, column: 6
                                                  System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 337, column: 6
                                                  S5051=10;
                                                  active[2]=1;
                                                  ends[2]=1;
                                                  tdone[2]=1;
                                                }
                                              }
                                            }
                                            else {
                                              S5051=10;
                                              active[2]=1;
                                              ends[2]=1;
                                              tdone[2]=1;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              else {
                                S5051=5;
                                if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 216, column: 7
                                  temp23_thread_2 = 0;//sysj\ECS_plant.sysj line: 217, column: 5
                                  temp23_thread_2 = (tempZone2_3.getpreval() == null ? null : ((Integer)tempZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 218, column: 5
                                  if(temp23_thread_2 > 22){//sysj\ECS_plant.sysj line: 219, column: 8
                                    S5695=0;
                                    System.out.println("");//sysj\ECS_plant.sysj line: 221, column: 7
                                    System.out.println("Room temperature is too high at " + temp23_thread_2);//sysj\ECS_plant.sysj line: 222, column: 7
                                    airOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 223, column: 7
                                    currsigs.addElement(airOnZone2_3);
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                  else {
                                    S5695=1;
                                    if(temp23_thread_2 < 21){//sysj\ECS_plant.sysj line: 226, column: 15
                                      heatOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 228, column: 7
                                      currsigs.addElement(heatOnZone2_3);
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                    else {
                                      System.out.println("");//sysj\ECS_plant.sysj line: 232, column: 6
                                      System.out.println("Room temperature is safe at" + temp23_thread_2);//sysj\ECS_plant.sysj line: 233, column: 6
                                      S5051=6;
                                      if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 239, column: 7
                                        temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 240, column: 5
                                        temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 241, column: 5
                                        if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 242, column: 8
                                          S5795=0;
                                          System.out.println("");//sysj\ECS_plant.sysj line: 244, column: 7
                                          System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 245, column: 7
                                          airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 246, column: 7
                                          currsigs.addElement(airOnZone4_5_6);
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                        else {
                                          S5795=1;
                                          if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 249, column: 15
                                            System.out.println("");//sysj\ECS_plant.sysj line: 251, column: 7
                                            System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 252, column: 7
                                            heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 253, column: 7
                                            currsigs.addElement(heatOnZone4_5_6);
                                            active[2]=1;
                                            ends[2]=1;
                                            tdone[2]=1;
                                          }
                                          else {
                                            System.out.println("");//sysj\ECS_plant.sysj line: 257, column: 6
                                            System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 258, column: 6
                                            S5051=7;
                                            if(zone_thread_2 == 1 || zone_thread_2 == 7){//sysj\ECS_plant.sysj line: 264, column: 7
                                              humid17_thread_2 = 0;//sysj\ECS_plant.sysj line: 265, column: 5
                                              humid17_thread_2 = (humidZone1_7.getpreval() == null ? null : ((Integer)humidZone1_7.getpreval()));//sysj\ECS_plant.sysj line: 266, column: 5
                                              if(humid17_thread_2 > 60){//sysj\ECS_plant.sysj line: 267, column: 8
                                                S5975=0;
                                                System.out.println("");//sysj\ECS_plant.sysj line: 269, column: 7
                                                System.out.println("Room humidity is too high at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 270, column: 7
                                                System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 271, column: 7
                                                deHumOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 272, column: 7
                                                currsigs.addElement(deHumOnZone1_7);
                                                active[2]=1;
                                                ends[2]=1;
                                                tdone[2]=1;
                                              }
                                              else {
                                                S5975=1;
                                                if(humid17_thread_2 < 30){//sysj\ECS_plant.sysj line: 275, column: 15
                                                  System.out.println("");//sysj\ECS_plant.sysj line: 277, column: 7
                                                  System.out.println("Room humidity is too low at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 278, column: 7
                                                  System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 279, column: 7
                                                  humOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 280, column: 7
                                                  currsigs.addElement(humOnZone1_7);
                                                  active[2]=1;
                                                  ends[2]=1;
                                                  tdone[2]=1;
                                                }
                                                else {
                                                  System.out.println("");//sysj\ECS_plant.sysj line: 284, column: 6
                                                  System.out.println("Room humidity is safe at" + humid17_thread_2);//sysj\ECS_plant.sysj line: 285, column: 6
                                                  S5051=8;
                                                  if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 290, column: 7
                                                    humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 291, column: 5
                                                    humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 292, column: 5
                                                    if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 293, column: 8
                                                      S6315=0;
                                                      System.out.println("");//sysj\ECS_plant.sysj line: 295, column: 7
                                                      System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 296, column: 7
                                                      System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 297, column: 7
                                                      deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 298, column: 7
                                                      currsigs.addElement(deHumOnZone2_3);
                                                      active[2]=1;
                                                      ends[2]=1;
                                                      tdone[2]=1;
                                                    }
                                                    else {
                                                      S6315=1;
                                                      if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 301, column: 15
                                                        System.out.println("");//sysj\ECS_plant.sysj line: 303, column: 7
                                                        System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 304, column: 7
                                                        System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 305, column: 7
                                                        humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 306, column: 7
                                                        currsigs.addElement(humOnZone2_3);
                                                        active[2]=1;
                                                        ends[2]=1;
                                                        tdone[2]=1;
                                                      }
                                                      else {
                                                        System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 6
                                                        System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 311, column: 6
                                                        S5051=9;
                                                        if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 316, column: 7
                                                          humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 317, column: 5
                                                          humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 318, column: 5
                                                          if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 319, column: 8
                                                            S6975=0;
                                                            System.out.println("");//sysj\ECS_plant.sysj line: 321, column: 7
                                                            System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 322, column: 7
                                                            System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 323, column: 7
                                                            deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 324, column: 7
                                                            currsigs.addElement(deHumOnZone4_5_6);
                                                            active[2]=1;
                                                            ends[2]=1;
                                                            tdone[2]=1;
                                                          }
                                                          else {
                                                            S6975=1;
                                                            if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 327, column: 15
                                                              System.out.println("");//sysj\ECS_plant.sysj line: 329, column: 7
                                                              System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 330, column: 7
                                                              System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 331, column: 7
                                                              humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 332, column: 7
                                                              currsigs.addElement(humOnZone4_5_6);
                                                              active[2]=1;
                                                              ends[2]=1;
                                                              tdone[2]=1;
                                                            }
                                                            else {
                                                              System.out.println("");//sysj\ECS_plant.sysj line: 336, column: 6
                                                              System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 337, column: 6
                                                              S5051=10;
                                                              active[2]=1;
                                                              ends[2]=1;
                                                              tdone[2]=1;
                                                            }
                                                          }
                                                        }
                                                        else {
                                                          S5051=10;
                                                          active[2]=1;
                                                          ends[2]=1;
                                                          tdone[2]=1;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  else {
                                                    S5051=9;
                                                    if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 316, column: 7
                                                      humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 317, column: 5
                                                      humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 318, column: 5
                                                      if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 319, column: 8
                                                        S6975=0;
                                                        System.out.println("");//sysj\ECS_plant.sysj line: 321, column: 7
                                                        System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 322, column: 7
                                                        System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 323, column: 7
                                                        deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 324, column: 7
                                                        currsigs.addElement(deHumOnZone4_5_6);
                                                        active[2]=1;
                                                        ends[2]=1;
                                                        tdone[2]=1;
                                                      }
                                                      else {
                                                        S6975=1;
                                                        if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 327, column: 15
                                                          System.out.println("");//sysj\ECS_plant.sysj line: 329, column: 7
                                                          System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 330, column: 7
                                                          System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 331, column: 7
                                                          humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 332, column: 7
                                                          currsigs.addElement(humOnZone4_5_6);
                                                          active[2]=1;
                                                          ends[2]=1;
                                                          tdone[2]=1;
                                                        }
                                                        else {
                                                          System.out.println("");//sysj\ECS_plant.sysj line: 336, column: 6
                                                          System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 337, column: 6
                                                          S5051=10;
                                                          active[2]=1;
                                                          ends[2]=1;
                                                          tdone[2]=1;
                                                        }
                                                      }
                                                    }
                                                    else {
                                                      S5051=10;
                                                      active[2]=1;
                                                      ends[2]=1;
                                                      tdone[2]=1;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            else {
                                              S5051=8;
                                              if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 290, column: 7
                                                humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 291, column: 5
                                                humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 292, column: 5
                                                if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 293, column: 8
                                                  S6315=0;
                                                  System.out.println("");//sysj\ECS_plant.sysj line: 295, column: 7
                                                  System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 296, column: 7
                                                  System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 297, column: 7
                                                  deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 298, column: 7
                                                  currsigs.addElement(deHumOnZone2_3);
                                                  active[2]=1;
                                                  ends[2]=1;
                                                  tdone[2]=1;
                                                }
                                                else {
                                                  S6315=1;
                                                  if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 301, column: 15
                                                    System.out.println("");//sysj\ECS_plant.sysj line: 303, column: 7
                                                    System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 304, column: 7
                                                    System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 305, column: 7
                                                    humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 306, column: 7
                                                    currsigs.addElement(humOnZone2_3);
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                  else {
                                                    System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 6
                                                    System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 311, column: 6
                                                    S5051=9;
                                                    if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 316, column: 7
                                                      humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 317, column: 5
                                                      humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 318, column: 5
                                                      if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 319, column: 8
                                                        S6975=0;
                                                        System.out.println("");//sysj\ECS_plant.sysj line: 321, column: 7
                                                        System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 322, column: 7
                                                        System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 323, column: 7
                                                        deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 324, column: 7
                                                        currsigs.addElement(deHumOnZone4_5_6);
                                                        active[2]=1;
                                                        ends[2]=1;
                                                        tdone[2]=1;
                                                      }
                                                      else {
                                                        S6975=1;
                                                        if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 327, column: 15
                                                          System.out.println("");//sysj\ECS_plant.sysj line: 329, column: 7
                                                          System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 330, column: 7
                                                          System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 331, column: 7
                                                          humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 332, column: 7
                                                          currsigs.addElement(humOnZone4_5_6);
                                                          active[2]=1;
                                                          ends[2]=1;
                                                          tdone[2]=1;
                                                        }
                                                        else {
                                                          System.out.println("");//sysj\ECS_plant.sysj line: 336, column: 6
                                                          System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 337, column: 6
                                                          S5051=10;
                                                          active[2]=1;
                                                          ends[2]=1;
                                                          tdone[2]=1;
                                                        }
                                                      }
                                                    }
                                                    else {
                                                      S5051=10;
                                                      active[2]=1;
                                                      ends[2]=1;
                                                      tdone[2]=1;
                                                    }
                                                  }
                                                }
                                              }
                                              else {
                                                S5051=9;
                                                if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 316, column: 7
                                                  humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 317, column: 5
                                                  humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 318, column: 5
                                                  if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 319, column: 8
                                                    S6975=0;
                                                    System.out.println("");//sysj\ECS_plant.sysj line: 321, column: 7
                                                    System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 322, column: 7
                                                    System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 323, column: 7
                                                    deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 324, column: 7
                                                    currsigs.addElement(deHumOnZone4_5_6);
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                  else {
                                                    S6975=1;
                                                    if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 327, column: 15
                                                      System.out.println("");//sysj\ECS_plant.sysj line: 329, column: 7
                                                      System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 330, column: 7
                                                      System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 331, column: 7
                                                      humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 332, column: 7
                                                      currsigs.addElement(humOnZone4_5_6);
                                                      active[2]=1;
                                                      ends[2]=1;
                                                      tdone[2]=1;
                                                    }
                                                    else {
                                                      System.out.println("");//sysj\ECS_plant.sysj line: 336, column: 6
                                                      System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 337, column: 6
                                                      S5051=10;
                                                      active[2]=1;
                                                      ends[2]=1;
                                                      tdone[2]=1;
                                                    }
                                                  }
                                                }
                                                else {
                                                  S5051=10;
                                                  active[2]=1;
                                                  ends[2]=1;
                                                  tdone[2]=1;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                      else {
                                        S5051=7;
                                        if(zone_thread_2 == 1 || zone_thread_2 == 7){//sysj\ECS_plant.sysj line: 264, column: 7
                                          humid17_thread_2 = 0;//sysj\ECS_plant.sysj line: 265, column: 5
                                          humid17_thread_2 = (humidZone1_7.getpreval() == null ? null : ((Integer)humidZone1_7.getpreval()));//sysj\ECS_plant.sysj line: 266, column: 5
                                          if(humid17_thread_2 > 60){//sysj\ECS_plant.sysj line: 267, column: 8
                                            S5975=0;
                                            System.out.println("");//sysj\ECS_plant.sysj line: 269, column: 7
                                            System.out.println("Room humidity is too high at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 270, column: 7
                                            System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 271, column: 7
                                            deHumOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 272, column: 7
                                            currsigs.addElement(deHumOnZone1_7);
                                            active[2]=1;
                                            ends[2]=1;
                                            tdone[2]=1;
                                          }
                                          else {
                                            S5975=1;
                                            if(humid17_thread_2 < 30){//sysj\ECS_plant.sysj line: 275, column: 15
                                              System.out.println("");//sysj\ECS_plant.sysj line: 277, column: 7
                                              System.out.println("Room humidity is too low at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 278, column: 7
                                              System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 279, column: 7
                                              humOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 280, column: 7
                                              currsigs.addElement(humOnZone1_7);
                                              active[2]=1;
                                              ends[2]=1;
                                              tdone[2]=1;
                                            }
                                            else {
                                              System.out.println("");//sysj\ECS_plant.sysj line: 284, column: 6
                                              System.out.println("Room humidity is safe at" + humid17_thread_2);//sysj\ECS_plant.sysj line: 285, column: 6
                                              S5051=8;
                                              if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 290, column: 7
                                                humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 291, column: 5
                                                humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 292, column: 5
                                                if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 293, column: 8
                                                  S6315=0;
                                                  System.out.println("");//sysj\ECS_plant.sysj line: 295, column: 7
                                                  System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 296, column: 7
                                                  System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 297, column: 7
                                                  deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 298, column: 7
                                                  currsigs.addElement(deHumOnZone2_3);
                                                  active[2]=1;
                                                  ends[2]=1;
                                                  tdone[2]=1;
                                                }
                                                else {
                                                  S6315=1;
                                                  if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 301, column: 15
                                                    System.out.println("");//sysj\ECS_plant.sysj line: 303, column: 7
                                                    System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 304, column: 7
                                                    System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 305, column: 7
                                                    humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 306, column: 7
                                                    currsigs.addElement(humOnZone2_3);
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                  else {
                                                    System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 6
                                                    System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 311, column: 6
                                                    S5051=9;
                                                    if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 316, column: 7
                                                      humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 317, column: 5
                                                      humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 318, column: 5
                                                      if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 319, column: 8
                                                        S6975=0;
                                                        System.out.println("");//sysj\ECS_plant.sysj line: 321, column: 7
                                                        System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 322, column: 7
                                                        System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 323, column: 7
                                                        deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 324, column: 7
                                                        currsigs.addElement(deHumOnZone4_5_6);
                                                        active[2]=1;
                                                        ends[2]=1;
                                                        tdone[2]=1;
                                                      }
                                                      else {
                                                        S6975=1;
                                                        if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 327, column: 15
                                                          System.out.println("");//sysj\ECS_plant.sysj line: 329, column: 7
                                                          System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 330, column: 7
                                                          System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 331, column: 7
                                                          humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 332, column: 7
                                                          currsigs.addElement(humOnZone4_5_6);
                                                          active[2]=1;
                                                          ends[2]=1;
                                                          tdone[2]=1;
                                                        }
                                                        else {
                                                          System.out.println("");//sysj\ECS_plant.sysj line: 336, column: 6
                                                          System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 337, column: 6
                                                          S5051=10;
                                                          active[2]=1;
                                                          ends[2]=1;
                                                          tdone[2]=1;
                                                        }
                                                      }
                                                    }
                                                    else {
                                                      S5051=10;
                                                      active[2]=1;
                                                      ends[2]=1;
                                                      tdone[2]=1;
                                                    }
                                                  }
                                                }
                                              }
                                              else {
                                                S5051=9;
                                                if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 316, column: 7
                                                  humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 317, column: 5
                                                  humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 318, column: 5
                                                  if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 319, column: 8
                                                    S6975=0;
                                                    System.out.println("");//sysj\ECS_plant.sysj line: 321, column: 7
                                                    System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 322, column: 7
                                                    System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 323, column: 7
                                                    deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 324, column: 7
                                                    currsigs.addElement(deHumOnZone4_5_6);
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                  else {
                                                    S6975=1;
                                                    if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 327, column: 15
                                                      System.out.println("");//sysj\ECS_plant.sysj line: 329, column: 7
                                                      System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 330, column: 7
                                                      System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 331, column: 7
                                                      humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 332, column: 7
                                                      currsigs.addElement(humOnZone4_5_6);
                                                      active[2]=1;
                                                      ends[2]=1;
                                                      tdone[2]=1;
                                                    }
                                                    else {
                                                      System.out.println("");//sysj\ECS_plant.sysj line: 336, column: 6
                                                      System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 337, column: 6
                                                      S5051=10;
                                                      active[2]=1;
                                                      ends[2]=1;
                                                      tdone[2]=1;
                                                    }
                                                  }
                                                }
                                                else {
                                                  S5051=10;
                                                  active[2]=1;
                                                  ends[2]=1;
                                                  tdone[2]=1;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        else {
                                          S5051=8;
                                          if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 290, column: 7
                                            humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 291, column: 5
                                            humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 292, column: 5
                                            if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 293, column: 8
                                              S6315=0;
                                              System.out.println("");//sysj\ECS_plant.sysj line: 295, column: 7
                                              System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 296, column: 7
                                              System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 297, column: 7
                                              deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 298, column: 7
                                              currsigs.addElement(deHumOnZone2_3);
                                              active[2]=1;
                                              ends[2]=1;
                                              tdone[2]=1;
                                            }
                                            else {
                                              S6315=1;
                                              if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 301, column: 15
                                                System.out.println("");//sysj\ECS_plant.sysj line: 303, column: 7
                                                System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 304, column: 7
                                                System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 305, column: 7
                                                humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 306, column: 7
                                                currsigs.addElement(humOnZone2_3);
                                                active[2]=1;
                                                ends[2]=1;
                                                tdone[2]=1;
                                              }
                                              else {
                                                System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 6
                                                System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 311, column: 6
                                                S5051=9;
                                                if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 316, column: 7
                                                  humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 317, column: 5
                                                  humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 318, column: 5
                                                  if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 319, column: 8
                                                    S6975=0;
                                                    System.out.println("");//sysj\ECS_plant.sysj line: 321, column: 7
                                                    System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 322, column: 7
                                                    System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 323, column: 7
                                                    deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 324, column: 7
                                                    currsigs.addElement(deHumOnZone4_5_6);
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                  else {
                                                    S6975=1;
                                                    if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 327, column: 15
                                                      System.out.println("");//sysj\ECS_plant.sysj line: 329, column: 7
                                                      System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 330, column: 7
                                                      System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 331, column: 7
                                                      humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 332, column: 7
                                                      currsigs.addElement(humOnZone4_5_6);
                                                      active[2]=1;
                                                      ends[2]=1;
                                                      tdone[2]=1;
                                                    }
                                                    else {
                                                      System.out.println("");//sysj\ECS_plant.sysj line: 336, column: 6
                                                      System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 337, column: 6
                                                      S5051=10;
                                                      active[2]=1;
                                                      ends[2]=1;
                                                      tdone[2]=1;
                                                    }
                                                  }
                                                }
                                                else {
                                                  S5051=10;
                                                  active[2]=1;
                                                  ends[2]=1;
                                                  tdone[2]=1;
                                                }
                                              }
                                            }
                                          }
                                          else {
                                            S5051=9;
                                            if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 316, column: 7
                                              humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 317, column: 5
                                              humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 318, column: 5
                                              if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 319, column: 8
                                                S6975=0;
                                                System.out.println("");//sysj\ECS_plant.sysj line: 321, column: 7
                                                System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 322, column: 7
                                                System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 323, column: 7
                                                deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 324, column: 7
                                                currsigs.addElement(deHumOnZone4_5_6);
                                                active[2]=1;
                                                ends[2]=1;
                                                tdone[2]=1;
                                              }
                                              else {
                                                S6975=1;
                                                if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 327, column: 15
                                                  System.out.println("");//sysj\ECS_plant.sysj line: 329, column: 7
                                                  System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 330, column: 7
                                                  System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 331, column: 7
                                                  humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 332, column: 7
                                                  currsigs.addElement(humOnZone4_5_6);
                                                  active[2]=1;
                                                  ends[2]=1;
                                                  tdone[2]=1;
                                                }
                                                else {
                                                  System.out.println("");//sysj\ECS_plant.sysj line: 336, column: 6
                                                  System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 337, column: 6
                                                  S5051=10;
                                                  active[2]=1;
                                                  ends[2]=1;
                                                  tdone[2]=1;
                                                }
                                              }
                                            }
                                            else {
                                              S5051=10;
                                              active[2]=1;
                                              ends[2]=1;
                                              tdone[2]=1;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                else {
                                  S5051=6;
                                  if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 239, column: 7
                                    temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 240, column: 5
                                    temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 241, column: 5
                                    if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 242, column: 8
                                      S5795=0;
                                      System.out.println("");//sysj\ECS_plant.sysj line: 244, column: 7
                                      System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 245, column: 7
                                      airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 246, column: 7
                                      currsigs.addElement(airOnZone4_5_6);
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                    else {
                                      S5795=1;
                                      if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 249, column: 15
                                        System.out.println("");//sysj\ECS_plant.sysj line: 251, column: 7
                                        System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 252, column: 7
                                        heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 253, column: 7
                                        currsigs.addElement(heatOnZone4_5_6);
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                      else {
                                        System.out.println("");//sysj\ECS_plant.sysj line: 257, column: 6
                                        System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 258, column: 6
                                        S5051=7;
                                        if(zone_thread_2 == 1 || zone_thread_2 == 7){//sysj\ECS_plant.sysj line: 264, column: 7
                                          humid17_thread_2 = 0;//sysj\ECS_plant.sysj line: 265, column: 5
                                          humid17_thread_2 = (humidZone1_7.getpreval() == null ? null : ((Integer)humidZone1_7.getpreval()));//sysj\ECS_plant.sysj line: 266, column: 5
                                          if(humid17_thread_2 > 60){//sysj\ECS_plant.sysj line: 267, column: 8
                                            S5975=0;
                                            System.out.println("");//sysj\ECS_plant.sysj line: 269, column: 7
                                            System.out.println("Room humidity is too high at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 270, column: 7
                                            System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 271, column: 7
                                            deHumOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 272, column: 7
                                            currsigs.addElement(deHumOnZone1_7);
                                            active[2]=1;
                                            ends[2]=1;
                                            tdone[2]=1;
                                          }
                                          else {
                                            S5975=1;
                                            if(humid17_thread_2 < 30){//sysj\ECS_plant.sysj line: 275, column: 15
                                              System.out.println("");//sysj\ECS_plant.sysj line: 277, column: 7
                                              System.out.println("Room humidity is too low at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 278, column: 7
                                              System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 279, column: 7
                                              humOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 280, column: 7
                                              currsigs.addElement(humOnZone1_7);
                                              active[2]=1;
                                              ends[2]=1;
                                              tdone[2]=1;
                                            }
                                            else {
                                              System.out.println("");//sysj\ECS_plant.sysj line: 284, column: 6
                                              System.out.println("Room humidity is safe at" + humid17_thread_2);//sysj\ECS_plant.sysj line: 285, column: 6
                                              S5051=8;
                                              if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 290, column: 7
                                                humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 291, column: 5
                                                humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 292, column: 5
                                                if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 293, column: 8
                                                  S6315=0;
                                                  System.out.println("");//sysj\ECS_plant.sysj line: 295, column: 7
                                                  System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 296, column: 7
                                                  System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 297, column: 7
                                                  deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 298, column: 7
                                                  currsigs.addElement(deHumOnZone2_3);
                                                  active[2]=1;
                                                  ends[2]=1;
                                                  tdone[2]=1;
                                                }
                                                else {
                                                  S6315=1;
                                                  if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 301, column: 15
                                                    System.out.println("");//sysj\ECS_plant.sysj line: 303, column: 7
                                                    System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 304, column: 7
                                                    System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 305, column: 7
                                                    humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 306, column: 7
                                                    currsigs.addElement(humOnZone2_3);
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                  else {
                                                    System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 6
                                                    System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 311, column: 6
                                                    S5051=9;
                                                    if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 316, column: 7
                                                      humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 317, column: 5
                                                      humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 318, column: 5
                                                      if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 319, column: 8
                                                        S6975=0;
                                                        System.out.println("");//sysj\ECS_plant.sysj line: 321, column: 7
                                                        System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 322, column: 7
                                                        System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 323, column: 7
                                                        deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 324, column: 7
                                                        currsigs.addElement(deHumOnZone4_5_6);
                                                        active[2]=1;
                                                        ends[2]=1;
                                                        tdone[2]=1;
                                                      }
                                                      else {
                                                        S6975=1;
                                                        if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 327, column: 15
                                                          System.out.println("");//sysj\ECS_plant.sysj line: 329, column: 7
                                                          System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 330, column: 7
                                                          System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 331, column: 7
                                                          humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 332, column: 7
                                                          currsigs.addElement(humOnZone4_5_6);
                                                          active[2]=1;
                                                          ends[2]=1;
                                                          tdone[2]=1;
                                                        }
                                                        else {
                                                          System.out.println("");//sysj\ECS_plant.sysj line: 336, column: 6
                                                          System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 337, column: 6
                                                          S5051=10;
                                                          active[2]=1;
                                                          ends[2]=1;
                                                          tdone[2]=1;
                                                        }
                                                      }
                                                    }
                                                    else {
                                                      S5051=10;
                                                      active[2]=1;
                                                      ends[2]=1;
                                                      tdone[2]=1;
                                                    }
                                                  }
                                                }
                                              }
                                              else {
                                                S5051=9;
                                                if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 316, column: 7
                                                  humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 317, column: 5
                                                  humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 318, column: 5
                                                  if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 319, column: 8
                                                    S6975=0;
                                                    System.out.println("");//sysj\ECS_plant.sysj line: 321, column: 7
                                                    System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 322, column: 7
                                                    System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 323, column: 7
                                                    deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 324, column: 7
                                                    currsigs.addElement(deHumOnZone4_5_6);
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                  else {
                                                    S6975=1;
                                                    if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 327, column: 15
                                                      System.out.println("");//sysj\ECS_plant.sysj line: 329, column: 7
                                                      System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 330, column: 7
                                                      System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 331, column: 7
                                                      humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 332, column: 7
                                                      currsigs.addElement(humOnZone4_5_6);
                                                      active[2]=1;
                                                      ends[2]=1;
                                                      tdone[2]=1;
                                                    }
                                                    else {
                                                      System.out.println("");//sysj\ECS_plant.sysj line: 336, column: 6
                                                      System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 337, column: 6
                                                      S5051=10;
                                                      active[2]=1;
                                                      ends[2]=1;
                                                      tdone[2]=1;
                                                    }
                                                  }
                                                }
                                                else {
                                                  S5051=10;
                                                  active[2]=1;
                                                  ends[2]=1;
                                                  tdone[2]=1;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        else {
                                          S5051=8;
                                          if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 290, column: 7
                                            humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 291, column: 5
                                            humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 292, column: 5
                                            if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 293, column: 8
                                              S6315=0;
                                              System.out.println("");//sysj\ECS_plant.sysj line: 295, column: 7
                                              System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 296, column: 7
                                              System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 297, column: 7
                                              deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 298, column: 7
                                              currsigs.addElement(deHumOnZone2_3);
                                              active[2]=1;
                                              ends[2]=1;
                                              tdone[2]=1;
                                            }
                                            else {
                                              S6315=1;
                                              if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 301, column: 15
                                                System.out.println("");//sysj\ECS_plant.sysj line: 303, column: 7
                                                System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 304, column: 7
                                                System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 305, column: 7
                                                humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 306, column: 7
                                                currsigs.addElement(humOnZone2_3);
                                                active[2]=1;
                                                ends[2]=1;
                                                tdone[2]=1;
                                              }
                                              else {
                                                System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 6
                                                System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 311, column: 6
                                                S5051=9;
                                                if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 316, column: 7
                                                  humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 317, column: 5
                                                  humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 318, column: 5
                                                  if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 319, column: 8
                                                    S6975=0;
                                                    System.out.println("");//sysj\ECS_plant.sysj line: 321, column: 7
                                                    System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 322, column: 7
                                                    System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 323, column: 7
                                                    deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 324, column: 7
                                                    currsigs.addElement(deHumOnZone4_5_6);
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                  else {
                                                    S6975=1;
                                                    if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 327, column: 15
                                                      System.out.println("");//sysj\ECS_plant.sysj line: 329, column: 7
                                                      System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 330, column: 7
                                                      System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 331, column: 7
                                                      humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 332, column: 7
                                                      currsigs.addElement(humOnZone4_5_6);
                                                      active[2]=1;
                                                      ends[2]=1;
                                                      tdone[2]=1;
                                                    }
                                                    else {
                                                      System.out.println("");//sysj\ECS_plant.sysj line: 336, column: 6
                                                      System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 337, column: 6
                                                      S5051=10;
                                                      active[2]=1;
                                                      ends[2]=1;
                                                      tdone[2]=1;
                                                    }
                                                  }
                                                }
                                                else {
                                                  S5051=10;
                                                  active[2]=1;
                                                  ends[2]=1;
                                                  tdone[2]=1;
                                                }
                                              }
                                            }
                                          }
                                          else {
                                            S5051=9;
                                            if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 316, column: 7
                                              humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 317, column: 5
                                              humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 318, column: 5
                                              if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 319, column: 8
                                                S6975=0;
                                                System.out.println("");//sysj\ECS_plant.sysj line: 321, column: 7
                                                System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 322, column: 7
                                                System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 323, column: 7
                                                deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 324, column: 7
                                                currsigs.addElement(deHumOnZone4_5_6);
                                                active[2]=1;
                                                ends[2]=1;
                                                tdone[2]=1;
                                              }
                                              else {
                                                S6975=1;
                                                if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 327, column: 15
                                                  System.out.println("");//sysj\ECS_plant.sysj line: 329, column: 7
                                                  System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 330, column: 7
                                                  System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 331, column: 7
                                                  humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 332, column: 7
                                                  currsigs.addElement(humOnZone4_5_6);
                                                  active[2]=1;
                                                  ends[2]=1;
                                                  tdone[2]=1;
                                                }
                                                else {
                                                  System.out.println("");//sysj\ECS_plant.sysj line: 336, column: 6
                                                  System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 337, column: 6
                                                  S5051=10;
                                                  active[2]=1;
                                                  ends[2]=1;
                                                  tdone[2]=1;
                                                }
                                              }
                                            }
                                            else {
                                              S5051=10;
                                              active[2]=1;
                                              ends[2]=1;
                                              tdone[2]=1;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  else {
                                    S5051=7;
                                    if(zone_thread_2 == 1 || zone_thread_2 == 7){//sysj\ECS_plant.sysj line: 264, column: 7
                                      humid17_thread_2 = 0;//sysj\ECS_plant.sysj line: 265, column: 5
                                      humid17_thread_2 = (humidZone1_7.getpreval() == null ? null : ((Integer)humidZone1_7.getpreval()));//sysj\ECS_plant.sysj line: 266, column: 5
                                      if(humid17_thread_2 > 60){//sysj\ECS_plant.sysj line: 267, column: 8
                                        S5975=0;
                                        System.out.println("");//sysj\ECS_plant.sysj line: 269, column: 7
                                        System.out.println("Room humidity is too high at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 270, column: 7
                                        System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 271, column: 7
                                        deHumOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 272, column: 7
                                        currsigs.addElement(deHumOnZone1_7);
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                      else {
                                        S5975=1;
                                        if(humid17_thread_2 < 30){//sysj\ECS_plant.sysj line: 275, column: 15
                                          System.out.println("");//sysj\ECS_plant.sysj line: 277, column: 7
                                          System.out.println("Room humidity is too low at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 278, column: 7
                                          System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 279, column: 7
                                          humOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 280, column: 7
                                          currsigs.addElement(humOnZone1_7);
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                        else {
                                          System.out.println("");//sysj\ECS_plant.sysj line: 284, column: 6
                                          System.out.println("Room humidity is safe at" + humid17_thread_2);//sysj\ECS_plant.sysj line: 285, column: 6
                                          S5051=8;
                                          if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 290, column: 7
                                            humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 291, column: 5
                                            humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 292, column: 5
                                            if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 293, column: 8
                                              S6315=0;
                                              System.out.println("");//sysj\ECS_plant.sysj line: 295, column: 7
                                              System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 296, column: 7
                                              System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 297, column: 7
                                              deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 298, column: 7
                                              currsigs.addElement(deHumOnZone2_3);
                                              active[2]=1;
                                              ends[2]=1;
                                              tdone[2]=1;
                                            }
                                            else {
                                              S6315=1;
                                              if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 301, column: 15
                                                System.out.println("");//sysj\ECS_plant.sysj line: 303, column: 7
                                                System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 304, column: 7
                                                System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 305, column: 7
                                                humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 306, column: 7
                                                currsigs.addElement(humOnZone2_3);
                                                active[2]=1;
                                                ends[2]=1;
                                                tdone[2]=1;
                                              }
                                              else {
                                                System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 6
                                                System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 311, column: 6
                                                S5051=9;
                                                if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 316, column: 7
                                                  humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 317, column: 5
                                                  humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 318, column: 5
                                                  if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 319, column: 8
                                                    S6975=0;
                                                    System.out.println("");//sysj\ECS_plant.sysj line: 321, column: 7
                                                    System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 322, column: 7
                                                    System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 323, column: 7
                                                    deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 324, column: 7
                                                    currsigs.addElement(deHumOnZone4_5_6);
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                  else {
                                                    S6975=1;
                                                    if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 327, column: 15
                                                      System.out.println("");//sysj\ECS_plant.sysj line: 329, column: 7
                                                      System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 330, column: 7
                                                      System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 331, column: 7
                                                      humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 332, column: 7
                                                      currsigs.addElement(humOnZone4_5_6);
                                                      active[2]=1;
                                                      ends[2]=1;
                                                      tdone[2]=1;
                                                    }
                                                    else {
                                                      System.out.println("");//sysj\ECS_plant.sysj line: 336, column: 6
                                                      System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 337, column: 6
                                                      S5051=10;
                                                      active[2]=1;
                                                      ends[2]=1;
                                                      tdone[2]=1;
                                                    }
                                                  }
                                                }
                                                else {
                                                  S5051=10;
                                                  active[2]=1;
                                                  ends[2]=1;
                                                  tdone[2]=1;
                                                }
                                              }
                                            }
                                          }
                                          else {
                                            S5051=9;
                                            if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 316, column: 7
                                              humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 317, column: 5
                                              humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 318, column: 5
                                              if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 319, column: 8
                                                S6975=0;
                                                System.out.println("");//sysj\ECS_plant.sysj line: 321, column: 7
                                                System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 322, column: 7
                                                System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 323, column: 7
                                                deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 324, column: 7
                                                currsigs.addElement(deHumOnZone4_5_6);
                                                active[2]=1;
                                                ends[2]=1;
                                                tdone[2]=1;
                                              }
                                              else {
                                                S6975=1;
                                                if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 327, column: 15
                                                  System.out.println("");//sysj\ECS_plant.sysj line: 329, column: 7
                                                  System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 330, column: 7
                                                  System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 331, column: 7
                                                  humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 332, column: 7
                                                  currsigs.addElement(humOnZone4_5_6);
                                                  active[2]=1;
                                                  ends[2]=1;
                                                  tdone[2]=1;
                                                }
                                                else {
                                                  System.out.println("");//sysj\ECS_plant.sysj line: 336, column: 6
                                                  System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 337, column: 6
                                                  S5051=10;
                                                  active[2]=1;
                                                  ends[2]=1;
                                                  tdone[2]=1;
                                                }
                                              }
                                            }
                                            else {
                                              S5051=10;
                                              active[2]=1;
                                              ends[2]=1;
                                              tdone[2]=1;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    else {
                                      S5051=8;
                                      if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 290, column: 7
                                        humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 291, column: 5
                                        humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 292, column: 5
                                        if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 293, column: 8
                                          S6315=0;
                                          System.out.println("");//sysj\ECS_plant.sysj line: 295, column: 7
                                          System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 296, column: 7
                                          System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 297, column: 7
                                          deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 298, column: 7
                                          currsigs.addElement(deHumOnZone2_3);
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                        else {
                                          S6315=1;
                                          if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 301, column: 15
                                            System.out.println("");//sysj\ECS_plant.sysj line: 303, column: 7
                                            System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 304, column: 7
                                            System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 305, column: 7
                                            humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 306, column: 7
                                            currsigs.addElement(humOnZone2_3);
                                            active[2]=1;
                                            ends[2]=1;
                                            tdone[2]=1;
                                          }
                                          else {
                                            System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 6
                                            System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 311, column: 6
                                            S5051=9;
                                            if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 316, column: 7
                                              humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 317, column: 5
                                              humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 318, column: 5
                                              if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 319, column: 8
                                                S6975=0;
                                                System.out.println("");//sysj\ECS_plant.sysj line: 321, column: 7
                                                System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 322, column: 7
                                                System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 323, column: 7
                                                deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 324, column: 7
                                                currsigs.addElement(deHumOnZone4_5_6);
                                                active[2]=1;
                                                ends[2]=1;
                                                tdone[2]=1;
                                              }
                                              else {
                                                S6975=1;
                                                if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 327, column: 15
                                                  System.out.println("");//sysj\ECS_plant.sysj line: 329, column: 7
                                                  System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 330, column: 7
                                                  System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 331, column: 7
                                                  humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 332, column: 7
                                                  currsigs.addElement(humOnZone4_5_6);
                                                  active[2]=1;
                                                  ends[2]=1;
                                                  tdone[2]=1;
                                                }
                                                else {
                                                  System.out.println("");//sysj\ECS_plant.sysj line: 336, column: 6
                                                  System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 337, column: 6
                                                  S5051=10;
                                                  active[2]=1;
                                                  ends[2]=1;
                                                  tdone[2]=1;
                                                }
                                              }
                                            }
                                            else {
                                              S5051=10;
                                              active[2]=1;
                                              ends[2]=1;
                                              tdone[2]=1;
                                            }
                                          }
                                        }
                                      }
                                      else {
                                        S5051=9;
                                        if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 316, column: 7
                                          humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 317, column: 5
                                          humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 318, column: 5
                                          if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 319, column: 8
                                            S6975=0;
                                            System.out.println("");//sysj\ECS_plant.sysj line: 321, column: 7
                                            System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 322, column: 7
                                            System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 323, column: 7
                                            deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 324, column: 7
                                            currsigs.addElement(deHumOnZone4_5_6);
                                            active[2]=1;
                                            ends[2]=1;
                                            tdone[2]=1;
                                          }
                                          else {
                                            S6975=1;
                                            if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 327, column: 15
                                              System.out.println("");//sysj\ECS_plant.sysj line: 329, column: 7
                                              System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 330, column: 7
                                              System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 331, column: 7
                                              humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 332, column: 7
                                              currsigs.addElement(humOnZone4_5_6);
                                              active[2]=1;
                                              ends[2]=1;
                                              tdone[2]=1;
                                            }
                                            else {
                                              System.out.println("");//sysj\ECS_plant.sysj line: 336, column: 6
                                              System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 337, column: 6
                                              S5051=10;
                                              active[2]=1;
                                              ends[2]=1;
                                              tdone[2]=1;
                                            }
                                          }
                                        }
                                        else {
                                          S5051=10;
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              else {
                S5051=4;
                if(zone_thread_2 == 1 || zone_thread_2 == 7){//sysj\ECS_plant.sysj line: 193, column: 7
                  temp17_thread_2 = 0;//sysj\ECS_plant.sysj line: 194, column: 5
                  temp17_thread_2 = (tempZone1_7.getpreval() == null ? null : ((Integer)tempZone1_7.getpreval()));//sysj\ECS_plant.sysj line: 195, column: 5
                  if(temp17_thread_2 > 22){//sysj\ECS_plant.sysj line: 196, column: 8
                    S5635=0;
                    System.out.println("");//sysj\ECS_plant.sysj line: 198, column: 7
                    System.out.println("Room temperature is too high at " + temp17_thread_2);//sysj\ECS_plant.sysj line: 199, column: 7
                    fanOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 200, column: 7
                    currsigs.addElement(fanOnZone1_7);
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S5635=1;
                    if(temp17_thread_2 < 21){//sysj\ECS_plant.sysj line: 203, column: 15
                      S5634=0;
                      System.out.println("Room temperature is too low at " + temp17_thread_2);//sysj\ECS_plant.sysj line: 205, column: 7
                      heatOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 206, column: 7
                      currsigs.addElement(heatOnZone1_7);
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S5634=1;
                      System.out.println("");//sysj\ECS_plant.sysj line: 210, column: 6
                      System.out.println("Room temperature is safe at" + temp17_thread_2);//sysj\ECS_plant.sysj line: 211, column: 6
                      S5051=5;
                      if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 216, column: 7
                        temp23_thread_2 = 0;//sysj\ECS_plant.sysj line: 217, column: 5
                        temp23_thread_2 = (tempZone2_3.getpreval() == null ? null : ((Integer)tempZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 218, column: 5
                        if(temp23_thread_2 > 22){//sysj\ECS_plant.sysj line: 219, column: 8
                          S5695=0;
                          System.out.println("");//sysj\ECS_plant.sysj line: 221, column: 7
                          System.out.println("Room temperature is too high at " + temp23_thread_2);//sysj\ECS_plant.sysj line: 222, column: 7
                          airOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 223, column: 7
                          currsigs.addElement(airOnZone2_3);
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          S5695=1;
                          if(temp23_thread_2 < 21){//sysj\ECS_plant.sysj line: 226, column: 15
                            heatOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 228, column: 7
                            currsigs.addElement(heatOnZone2_3);
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            System.out.println("");//sysj\ECS_plant.sysj line: 232, column: 6
                            System.out.println("Room temperature is safe at" + temp23_thread_2);//sysj\ECS_plant.sysj line: 233, column: 6
                            S5051=6;
                            if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 239, column: 7
                              temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 240, column: 5
                              temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 241, column: 5
                              if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 242, column: 8
                                S5795=0;
                                System.out.println("");//sysj\ECS_plant.sysj line: 244, column: 7
                                System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 245, column: 7
                                airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 246, column: 7
                                currsigs.addElement(airOnZone4_5_6);
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                              else {
                                S5795=1;
                                if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 249, column: 15
                                  System.out.println("");//sysj\ECS_plant.sysj line: 251, column: 7
                                  System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 252, column: 7
                                  heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 253, column: 7
                                  currsigs.addElement(heatOnZone4_5_6);
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                                else {
                                  System.out.println("");//sysj\ECS_plant.sysj line: 257, column: 6
                                  System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 258, column: 6
                                  S5051=7;
                                  if(zone_thread_2 == 1 || zone_thread_2 == 7){//sysj\ECS_plant.sysj line: 264, column: 7
                                    humid17_thread_2 = 0;//sysj\ECS_plant.sysj line: 265, column: 5
                                    humid17_thread_2 = (humidZone1_7.getpreval() == null ? null : ((Integer)humidZone1_7.getpreval()));//sysj\ECS_plant.sysj line: 266, column: 5
                                    if(humid17_thread_2 > 60){//sysj\ECS_plant.sysj line: 267, column: 8
                                      S5975=0;
                                      System.out.println("");//sysj\ECS_plant.sysj line: 269, column: 7
                                      System.out.println("Room humidity is too high at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 270, column: 7
                                      System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 271, column: 7
                                      deHumOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 272, column: 7
                                      currsigs.addElement(deHumOnZone1_7);
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                    else {
                                      S5975=1;
                                      if(humid17_thread_2 < 30){//sysj\ECS_plant.sysj line: 275, column: 15
                                        System.out.println("");//sysj\ECS_plant.sysj line: 277, column: 7
                                        System.out.println("Room humidity is too low at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 278, column: 7
                                        System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 279, column: 7
                                        humOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 280, column: 7
                                        currsigs.addElement(humOnZone1_7);
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                      else {
                                        System.out.println("");//sysj\ECS_plant.sysj line: 284, column: 6
                                        System.out.println("Room humidity is safe at" + humid17_thread_2);//sysj\ECS_plant.sysj line: 285, column: 6
                                        S5051=8;
                                        if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 290, column: 7
                                          humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 291, column: 5
                                          humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 292, column: 5
                                          if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 293, column: 8
                                            S6315=0;
                                            System.out.println("");//sysj\ECS_plant.sysj line: 295, column: 7
                                            System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 296, column: 7
                                            System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 297, column: 7
                                            deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 298, column: 7
                                            currsigs.addElement(deHumOnZone2_3);
                                            active[2]=1;
                                            ends[2]=1;
                                            tdone[2]=1;
                                          }
                                          else {
                                            S6315=1;
                                            if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 301, column: 15
                                              System.out.println("");//sysj\ECS_plant.sysj line: 303, column: 7
                                              System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 304, column: 7
                                              System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 305, column: 7
                                              humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 306, column: 7
                                              currsigs.addElement(humOnZone2_3);
                                              active[2]=1;
                                              ends[2]=1;
                                              tdone[2]=1;
                                            }
                                            else {
                                              System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 6
                                              System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 311, column: 6
                                              S5051=9;
                                              if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 316, column: 7
                                                humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 317, column: 5
                                                humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 318, column: 5
                                                if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 319, column: 8
                                                  S6975=0;
                                                  System.out.println("");//sysj\ECS_plant.sysj line: 321, column: 7
                                                  System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 322, column: 7
                                                  System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 323, column: 7
                                                  deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 324, column: 7
                                                  currsigs.addElement(deHumOnZone4_5_6);
                                                  active[2]=1;
                                                  ends[2]=1;
                                                  tdone[2]=1;
                                                }
                                                else {
                                                  S6975=1;
                                                  if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 327, column: 15
                                                    System.out.println("");//sysj\ECS_plant.sysj line: 329, column: 7
                                                    System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 330, column: 7
                                                    System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 331, column: 7
                                                    humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 332, column: 7
                                                    currsigs.addElement(humOnZone4_5_6);
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                  else {
                                                    System.out.println("");//sysj\ECS_plant.sysj line: 336, column: 6
                                                    System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 337, column: 6
                                                    S5051=10;
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                }
                                              }
                                              else {
                                                S5051=10;
                                                active[2]=1;
                                                ends[2]=1;
                                                tdone[2]=1;
                                              }
                                            }
                                          }
                                        }
                                        else {
                                          S5051=9;
                                          if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 316, column: 7
                                            humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 317, column: 5
                                            humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 318, column: 5
                                            if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 319, column: 8
                                              S6975=0;
                                              System.out.println("");//sysj\ECS_plant.sysj line: 321, column: 7
                                              System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 322, column: 7
                                              System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 323, column: 7
                                              deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 324, column: 7
                                              currsigs.addElement(deHumOnZone4_5_6);
                                              active[2]=1;
                                              ends[2]=1;
                                              tdone[2]=1;
                                            }
                                            else {
                                              S6975=1;
                                              if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 327, column: 15
                                                System.out.println("");//sysj\ECS_plant.sysj line: 329, column: 7
                                                System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 330, column: 7
                                                System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 331, column: 7
                                                humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 332, column: 7
                                                currsigs.addElement(humOnZone4_5_6);
                                                active[2]=1;
                                                ends[2]=1;
                                                tdone[2]=1;
                                              }
                                              else {
                                                System.out.println("");//sysj\ECS_plant.sysj line: 336, column: 6
                                                System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 337, column: 6
                                                S5051=10;
                                                active[2]=1;
                                                ends[2]=1;
                                                tdone[2]=1;
                                              }
                                            }
                                          }
                                          else {
                                            S5051=10;
                                            active[2]=1;
                                            ends[2]=1;
                                            tdone[2]=1;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  else {
                                    S5051=8;
                                    if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 290, column: 7
                                      humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 291, column: 5
                                      humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 292, column: 5
                                      if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 293, column: 8
                                        S6315=0;
                                        System.out.println("");//sysj\ECS_plant.sysj line: 295, column: 7
                                        System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 296, column: 7
                                        System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 297, column: 7
                                        deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 298, column: 7
                                        currsigs.addElement(deHumOnZone2_3);
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                      else {
                                        S6315=1;
                                        if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 301, column: 15
                                          System.out.println("");//sysj\ECS_plant.sysj line: 303, column: 7
                                          System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 304, column: 7
                                          System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 305, column: 7
                                          humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 306, column: 7
                                          currsigs.addElement(humOnZone2_3);
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                        else {
                                          System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 6
                                          System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 311, column: 6
                                          S5051=9;
                                          if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 316, column: 7
                                            humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 317, column: 5
                                            humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 318, column: 5
                                            if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 319, column: 8
                                              S6975=0;
                                              System.out.println("");//sysj\ECS_plant.sysj line: 321, column: 7
                                              System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 322, column: 7
                                              System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 323, column: 7
                                              deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 324, column: 7
                                              currsigs.addElement(deHumOnZone4_5_6);
                                              active[2]=1;
                                              ends[2]=1;
                                              tdone[2]=1;
                                            }
                                            else {
                                              S6975=1;
                                              if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 327, column: 15
                                                System.out.println("");//sysj\ECS_plant.sysj line: 329, column: 7
                                                System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 330, column: 7
                                                System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 331, column: 7
                                                humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 332, column: 7
                                                currsigs.addElement(humOnZone4_5_6);
                                                active[2]=1;
                                                ends[2]=1;
                                                tdone[2]=1;
                                              }
                                              else {
                                                System.out.println("");//sysj\ECS_plant.sysj line: 336, column: 6
                                                System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 337, column: 6
                                                S5051=10;
                                                active[2]=1;
                                                ends[2]=1;
                                                tdone[2]=1;
                                              }
                                            }
                                          }
                                          else {
                                            S5051=10;
                                            active[2]=1;
                                            ends[2]=1;
                                            tdone[2]=1;
                                          }
                                        }
                                      }
                                    }
                                    else {
                                      S5051=9;
                                      if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 316, column: 7
                                        humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 317, column: 5
                                        humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 318, column: 5
                                        if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 319, column: 8
                                          S6975=0;
                                          System.out.println("");//sysj\ECS_plant.sysj line: 321, column: 7
                                          System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 322, column: 7
                                          System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 323, column: 7
                                          deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 324, column: 7
                                          currsigs.addElement(deHumOnZone4_5_6);
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                        else {
                                          S6975=1;
                                          if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 327, column: 15
                                            System.out.println("");//sysj\ECS_plant.sysj line: 329, column: 7
                                            System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 330, column: 7
                                            System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 331, column: 7
                                            humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 332, column: 7
                                            currsigs.addElement(humOnZone4_5_6);
                                            active[2]=1;
                                            ends[2]=1;
                                            tdone[2]=1;
                                          }
                                          else {
                                            System.out.println("");//sysj\ECS_plant.sysj line: 336, column: 6
                                            System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 337, column: 6
                                            S5051=10;
                                            active[2]=1;
                                            ends[2]=1;
                                            tdone[2]=1;
                                          }
                                        }
                                      }
                                      else {
                                        S5051=10;
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            else {
                              S5051=7;
                              if(zone_thread_2 == 1 || zone_thread_2 == 7){//sysj\ECS_plant.sysj line: 264, column: 7
                                humid17_thread_2 = 0;//sysj\ECS_plant.sysj line: 265, column: 5
                                humid17_thread_2 = (humidZone1_7.getpreval() == null ? null : ((Integer)humidZone1_7.getpreval()));//sysj\ECS_plant.sysj line: 266, column: 5
                                if(humid17_thread_2 > 60){//sysj\ECS_plant.sysj line: 267, column: 8
                                  S5975=0;
                                  System.out.println("");//sysj\ECS_plant.sysj line: 269, column: 7
                                  System.out.println("Room humidity is too high at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 270, column: 7
                                  System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 271, column: 7
                                  deHumOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 272, column: 7
                                  currsigs.addElement(deHumOnZone1_7);
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                                else {
                                  S5975=1;
                                  if(humid17_thread_2 < 30){//sysj\ECS_plant.sysj line: 275, column: 15
                                    System.out.println("");//sysj\ECS_plant.sysj line: 277, column: 7
                                    System.out.println("Room humidity is too low at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 278, column: 7
                                    System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 279, column: 7
                                    humOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 280, column: 7
                                    currsigs.addElement(humOnZone1_7);
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                  else {
                                    System.out.println("");//sysj\ECS_plant.sysj line: 284, column: 6
                                    System.out.println("Room humidity is safe at" + humid17_thread_2);//sysj\ECS_plant.sysj line: 285, column: 6
                                    S5051=8;
                                    if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 290, column: 7
                                      humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 291, column: 5
                                      humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 292, column: 5
                                      if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 293, column: 8
                                        S6315=0;
                                        System.out.println("");//sysj\ECS_plant.sysj line: 295, column: 7
                                        System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 296, column: 7
                                        System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 297, column: 7
                                        deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 298, column: 7
                                        currsigs.addElement(deHumOnZone2_3);
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                      else {
                                        S6315=1;
                                        if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 301, column: 15
                                          System.out.println("");//sysj\ECS_plant.sysj line: 303, column: 7
                                          System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 304, column: 7
                                          System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 305, column: 7
                                          humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 306, column: 7
                                          currsigs.addElement(humOnZone2_3);
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                        else {
                                          System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 6
                                          System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 311, column: 6
                                          S5051=9;
                                          if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 316, column: 7
                                            humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 317, column: 5
                                            humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 318, column: 5
                                            if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 319, column: 8
                                              S6975=0;
                                              System.out.println("");//sysj\ECS_plant.sysj line: 321, column: 7
                                              System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 322, column: 7
                                              System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 323, column: 7
                                              deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 324, column: 7
                                              currsigs.addElement(deHumOnZone4_5_6);
                                              active[2]=1;
                                              ends[2]=1;
                                              tdone[2]=1;
                                            }
                                            else {
                                              S6975=1;
                                              if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 327, column: 15
                                                System.out.println("");//sysj\ECS_plant.sysj line: 329, column: 7
                                                System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 330, column: 7
                                                System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 331, column: 7
                                                humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 332, column: 7
                                                currsigs.addElement(humOnZone4_5_6);
                                                active[2]=1;
                                                ends[2]=1;
                                                tdone[2]=1;
                                              }
                                              else {
                                                System.out.println("");//sysj\ECS_plant.sysj line: 336, column: 6
                                                System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 337, column: 6
                                                S5051=10;
                                                active[2]=1;
                                                ends[2]=1;
                                                tdone[2]=1;
                                              }
                                            }
                                          }
                                          else {
                                            S5051=10;
                                            active[2]=1;
                                            ends[2]=1;
                                            tdone[2]=1;
                                          }
                                        }
                                      }
                                    }
                                    else {
                                      S5051=9;
                                      if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 316, column: 7
                                        humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 317, column: 5
                                        humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 318, column: 5
                                        if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 319, column: 8
                                          S6975=0;
                                          System.out.println("");//sysj\ECS_plant.sysj line: 321, column: 7
                                          System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 322, column: 7
                                          System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 323, column: 7
                                          deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 324, column: 7
                                          currsigs.addElement(deHumOnZone4_5_6);
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                        else {
                                          S6975=1;
                                          if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 327, column: 15
                                            System.out.println("");//sysj\ECS_plant.sysj line: 329, column: 7
                                            System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 330, column: 7
                                            System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 331, column: 7
                                            humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 332, column: 7
                                            currsigs.addElement(humOnZone4_5_6);
                                            active[2]=1;
                                            ends[2]=1;
                                            tdone[2]=1;
                                          }
                                          else {
                                            System.out.println("");//sysj\ECS_plant.sysj line: 336, column: 6
                                            System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 337, column: 6
                                            S5051=10;
                                            active[2]=1;
                                            ends[2]=1;
                                            tdone[2]=1;
                                          }
                                        }
                                      }
                                      else {
                                        S5051=10;
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                    }
                                  }
                                }
                              }
                              else {
                                S5051=8;
                                if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 290, column: 7
                                  humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 291, column: 5
                                  humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 292, column: 5
                                  if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 293, column: 8
                                    S6315=0;
                                    System.out.println("");//sysj\ECS_plant.sysj line: 295, column: 7
                                    System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 296, column: 7
                                    System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 297, column: 7
                                    deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 298, column: 7
                                    currsigs.addElement(deHumOnZone2_3);
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                  else {
                                    S6315=1;
                                    if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 301, column: 15
                                      System.out.println("");//sysj\ECS_plant.sysj line: 303, column: 7
                                      System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 304, column: 7
                                      System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 305, column: 7
                                      humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 306, column: 7
                                      currsigs.addElement(humOnZone2_3);
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                    else {
                                      System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 6
                                      System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 311, column: 6
                                      S5051=9;
                                      if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 316, column: 7
                                        humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 317, column: 5
                                        humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 318, column: 5
                                        if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 319, column: 8
                                          S6975=0;
                                          System.out.println("");//sysj\ECS_plant.sysj line: 321, column: 7
                                          System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 322, column: 7
                                          System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 323, column: 7
                                          deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 324, column: 7
                                          currsigs.addElement(deHumOnZone4_5_6);
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                        else {
                                          S6975=1;
                                          if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 327, column: 15
                                            System.out.println("");//sysj\ECS_plant.sysj line: 329, column: 7
                                            System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 330, column: 7
                                            System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 331, column: 7
                                            humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 332, column: 7
                                            currsigs.addElement(humOnZone4_5_6);
                                            active[2]=1;
                                            ends[2]=1;
                                            tdone[2]=1;
                                          }
                                          else {
                                            System.out.println("");//sysj\ECS_plant.sysj line: 336, column: 6
                                            System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 337, column: 6
                                            S5051=10;
                                            active[2]=1;
                                            ends[2]=1;
                                            tdone[2]=1;
                                          }
                                        }
                                      }
                                      else {
                                        S5051=10;
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                    }
                                  }
                                }
                                else {
                                  S5051=9;
                                  if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 316, column: 7
                                    humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 317, column: 5
                                    humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 318, column: 5
                                    if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 319, column: 8
                                      S6975=0;
                                      System.out.println("");//sysj\ECS_plant.sysj line: 321, column: 7
                                      System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 322, column: 7
                                      System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 323, column: 7
                                      deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 324, column: 7
                                      currsigs.addElement(deHumOnZone4_5_6);
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                    else {
                                      S6975=1;
                                      if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 327, column: 15
                                        System.out.println("");//sysj\ECS_plant.sysj line: 329, column: 7
                                        System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 330, column: 7
                                        System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 331, column: 7
                                        humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 332, column: 7
                                        currsigs.addElement(humOnZone4_5_6);
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                      else {
                                        System.out.println("");//sysj\ECS_plant.sysj line: 336, column: 6
                                        System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 337, column: 6
                                        S5051=10;
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                    }
                                  }
                                  else {
                                    S5051=10;
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      else {
                        S5051=6;
                        if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 239, column: 7
                          temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 240, column: 5
                          temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 241, column: 5
                          if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 242, column: 8
                            S5795=0;
                            System.out.println("");//sysj\ECS_plant.sysj line: 244, column: 7
                            System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 245, column: 7
                            airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 246, column: 7
                            currsigs.addElement(airOnZone4_5_6);
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S5795=1;
                            if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 249, column: 15
                              System.out.println("");//sysj\ECS_plant.sysj line: 251, column: 7
                              System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 252, column: 7
                              heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 253, column: 7
                              currsigs.addElement(heatOnZone4_5_6);
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              System.out.println("");//sysj\ECS_plant.sysj line: 257, column: 6
                              System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 258, column: 6
                              S5051=7;
                              if(zone_thread_2 == 1 || zone_thread_2 == 7){//sysj\ECS_plant.sysj line: 264, column: 7
                                humid17_thread_2 = 0;//sysj\ECS_plant.sysj line: 265, column: 5
                                humid17_thread_2 = (humidZone1_7.getpreval() == null ? null : ((Integer)humidZone1_7.getpreval()));//sysj\ECS_plant.sysj line: 266, column: 5
                                if(humid17_thread_2 > 60){//sysj\ECS_plant.sysj line: 267, column: 8
                                  S5975=0;
                                  System.out.println("");//sysj\ECS_plant.sysj line: 269, column: 7
                                  System.out.println("Room humidity is too high at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 270, column: 7
                                  System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 271, column: 7
                                  deHumOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 272, column: 7
                                  currsigs.addElement(deHumOnZone1_7);
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                                else {
                                  S5975=1;
                                  if(humid17_thread_2 < 30){//sysj\ECS_plant.sysj line: 275, column: 15
                                    System.out.println("");//sysj\ECS_plant.sysj line: 277, column: 7
                                    System.out.println("Room humidity is too low at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 278, column: 7
                                    System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 279, column: 7
                                    humOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 280, column: 7
                                    currsigs.addElement(humOnZone1_7);
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                  else {
                                    System.out.println("");//sysj\ECS_plant.sysj line: 284, column: 6
                                    System.out.println("Room humidity is safe at" + humid17_thread_2);//sysj\ECS_plant.sysj line: 285, column: 6
                                    S5051=8;
                                    if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 290, column: 7
                                      humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 291, column: 5
                                      humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 292, column: 5
                                      if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 293, column: 8
                                        S6315=0;
                                        System.out.println("");//sysj\ECS_plant.sysj line: 295, column: 7
                                        System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 296, column: 7
                                        System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 297, column: 7
                                        deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 298, column: 7
                                        currsigs.addElement(deHumOnZone2_3);
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                      else {
                                        S6315=1;
                                        if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 301, column: 15
                                          System.out.println("");//sysj\ECS_plant.sysj line: 303, column: 7
                                          System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 304, column: 7
                                          System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 305, column: 7
                                          humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 306, column: 7
                                          currsigs.addElement(humOnZone2_3);
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                        else {
                                          System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 6
                                          System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 311, column: 6
                                          S5051=9;
                                          if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 316, column: 7
                                            humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 317, column: 5
                                            humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 318, column: 5
                                            if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 319, column: 8
                                              S6975=0;
                                              System.out.println("");//sysj\ECS_plant.sysj line: 321, column: 7
                                              System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 322, column: 7
                                              System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 323, column: 7
                                              deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 324, column: 7
                                              currsigs.addElement(deHumOnZone4_5_6);
                                              active[2]=1;
                                              ends[2]=1;
                                              tdone[2]=1;
                                            }
                                            else {
                                              S6975=1;
                                              if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 327, column: 15
                                                System.out.println("");//sysj\ECS_plant.sysj line: 329, column: 7
                                                System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 330, column: 7
                                                System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 331, column: 7
                                                humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 332, column: 7
                                                currsigs.addElement(humOnZone4_5_6);
                                                active[2]=1;
                                                ends[2]=1;
                                                tdone[2]=1;
                                              }
                                              else {
                                                System.out.println("");//sysj\ECS_plant.sysj line: 336, column: 6
                                                System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 337, column: 6
                                                S5051=10;
                                                active[2]=1;
                                                ends[2]=1;
                                                tdone[2]=1;
                                              }
                                            }
                                          }
                                          else {
                                            S5051=10;
                                            active[2]=1;
                                            ends[2]=1;
                                            tdone[2]=1;
                                          }
                                        }
                                      }
                                    }
                                    else {
                                      S5051=9;
                                      if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 316, column: 7
                                        humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 317, column: 5
                                        humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 318, column: 5
                                        if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 319, column: 8
                                          S6975=0;
                                          System.out.println("");//sysj\ECS_plant.sysj line: 321, column: 7
                                          System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 322, column: 7
                                          System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 323, column: 7
                                          deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 324, column: 7
                                          currsigs.addElement(deHumOnZone4_5_6);
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                        else {
                                          S6975=1;
                                          if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 327, column: 15
                                            System.out.println("");//sysj\ECS_plant.sysj line: 329, column: 7
                                            System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 330, column: 7
                                            System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 331, column: 7
                                            humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 332, column: 7
                                            currsigs.addElement(humOnZone4_5_6);
                                            active[2]=1;
                                            ends[2]=1;
                                            tdone[2]=1;
                                          }
                                          else {
                                            System.out.println("");//sysj\ECS_plant.sysj line: 336, column: 6
                                            System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 337, column: 6
                                            S5051=10;
                                            active[2]=1;
                                            ends[2]=1;
                                            tdone[2]=1;
                                          }
                                        }
                                      }
                                      else {
                                        S5051=10;
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                    }
                                  }
                                }
                              }
                              else {
                                S5051=8;
                                if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 290, column: 7
                                  humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 291, column: 5
                                  humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 292, column: 5
                                  if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 293, column: 8
                                    S6315=0;
                                    System.out.println("");//sysj\ECS_plant.sysj line: 295, column: 7
                                    System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 296, column: 7
                                    System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 297, column: 7
                                    deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 298, column: 7
                                    currsigs.addElement(deHumOnZone2_3);
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                  else {
                                    S6315=1;
                                    if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 301, column: 15
                                      System.out.println("");//sysj\ECS_plant.sysj line: 303, column: 7
                                      System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 304, column: 7
                                      System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 305, column: 7
                                      humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 306, column: 7
                                      currsigs.addElement(humOnZone2_3);
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                    else {
                                      System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 6
                                      System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 311, column: 6
                                      S5051=9;
                                      if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 316, column: 7
                                        humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 317, column: 5
                                        humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 318, column: 5
                                        if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 319, column: 8
                                          S6975=0;
                                          System.out.println("");//sysj\ECS_plant.sysj line: 321, column: 7
                                          System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 322, column: 7
                                          System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 323, column: 7
                                          deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 324, column: 7
                                          currsigs.addElement(deHumOnZone4_5_6);
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                        else {
                                          S6975=1;
                                          if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 327, column: 15
                                            System.out.println("");//sysj\ECS_plant.sysj line: 329, column: 7
                                            System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 330, column: 7
                                            System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 331, column: 7
                                            humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 332, column: 7
                                            currsigs.addElement(humOnZone4_5_6);
                                            active[2]=1;
                                            ends[2]=1;
                                            tdone[2]=1;
                                          }
                                          else {
                                            System.out.println("");//sysj\ECS_plant.sysj line: 336, column: 6
                                            System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 337, column: 6
                                            S5051=10;
                                            active[2]=1;
                                            ends[2]=1;
                                            tdone[2]=1;
                                          }
                                        }
                                      }
                                      else {
                                        S5051=10;
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                    }
                                  }
                                }
                                else {
                                  S5051=9;
                                  if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 316, column: 7
                                    humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 317, column: 5
                                    humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 318, column: 5
                                    if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 319, column: 8
                                      S6975=0;
                                      System.out.println("");//sysj\ECS_plant.sysj line: 321, column: 7
                                      System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 322, column: 7
                                      System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 323, column: 7
                                      deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 324, column: 7
                                      currsigs.addElement(deHumOnZone4_5_6);
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                    else {
                                      S6975=1;
                                      if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 327, column: 15
                                        System.out.println("");//sysj\ECS_plant.sysj line: 329, column: 7
                                        System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 330, column: 7
                                        System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 331, column: 7
                                        humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 332, column: 7
                                        currsigs.addElement(humOnZone4_5_6);
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                      else {
                                        System.out.println("");//sysj\ECS_plant.sysj line: 336, column: 6
                                        System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 337, column: 6
                                        S5051=10;
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                    }
                                  }
                                  else {
                                    S5051=10;
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                }
                              }
                            }
                          }
                        }
                        else {
                          S5051=7;
                          if(zone_thread_2 == 1 || zone_thread_2 == 7){//sysj\ECS_plant.sysj line: 264, column: 7
                            humid17_thread_2 = 0;//sysj\ECS_plant.sysj line: 265, column: 5
                            humid17_thread_2 = (humidZone1_7.getpreval() == null ? null : ((Integer)humidZone1_7.getpreval()));//sysj\ECS_plant.sysj line: 266, column: 5
                            if(humid17_thread_2 > 60){//sysj\ECS_plant.sysj line: 267, column: 8
                              S5975=0;
                              System.out.println("");//sysj\ECS_plant.sysj line: 269, column: 7
                              System.out.println("Room humidity is too high at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 270, column: 7
                              System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 271, column: 7
                              deHumOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 272, column: 7
                              currsigs.addElement(deHumOnZone1_7);
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S5975=1;
                              if(humid17_thread_2 < 30){//sysj\ECS_plant.sysj line: 275, column: 15
                                System.out.println("");//sysj\ECS_plant.sysj line: 277, column: 7
                                System.out.println("Room humidity is too low at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 278, column: 7
                                System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 279, column: 7
                                humOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 280, column: 7
                                currsigs.addElement(humOnZone1_7);
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                              else {
                                System.out.println("");//sysj\ECS_plant.sysj line: 284, column: 6
                                System.out.println("Room humidity is safe at" + humid17_thread_2);//sysj\ECS_plant.sysj line: 285, column: 6
                                S5051=8;
                                if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 290, column: 7
                                  humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 291, column: 5
                                  humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 292, column: 5
                                  if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 293, column: 8
                                    S6315=0;
                                    System.out.println("");//sysj\ECS_plant.sysj line: 295, column: 7
                                    System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 296, column: 7
                                    System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 297, column: 7
                                    deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 298, column: 7
                                    currsigs.addElement(deHumOnZone2_3);
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                  else {
                                    S6315=1;
                                    if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 301, column: 15
                                      System.out.println("");//sysj\ECS_plant.sysj line: 303, column: 7
                                      System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 304, column: 7
                                      System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 305, column: 7
                                      humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 306, column: 7
                                      currsigs.addElement(humOnZone2_3);
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                    else {
                                      System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 6
                                      System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 311, column: 6
                                      S5051=9;
                                      if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 316, column: 7
                                        humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 317, column: 5
                                        humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 318, column: 5
                                        if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 319, column: 8
                                          S6975=0;
                                          System.out.println("");//sysj\ECS_plant.sysj line: 321, column: 7
                                          System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 322, column: 7
                                          System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 323, column: 7
                                          deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 324, column: 7
                                          currsigs.addElement(deHumOnZone4_5_6);
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                        else {
                                          S6975=1;
                                          if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 327, column: 15
                                            System.out.println("");//sysj\ECS_plant.sysj line: 329, column: 7
                                            System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 330, column: 7
                                            System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 331, column: 7
                                            humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 332, column: 7
                                            currsigs.addElement(humOnZone4_5_6);
                                            active[2]=1;
                                            ends[2]=1;
                                            tdone[2]=1;
                                          }
                                          else {
                                            System.out.println("");//sysj\ECS_plant.sysj line: 336, column: 6
                                            System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 337, column: 6
                                            S5051=10;
                                            active[2]=1;
                                            ends[2]=1;
                                            tdone[2]=1;
                                          }
                                        }
                                      }
                                      else {
                                        S5051=10;
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                    }
                                  }
                                }
                                else {
                                  S5051=9;
                                  if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 316, column: 7
                                    humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 317, column: 5
                                    humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 318, column: 5
                                    if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 319, column: 8
                                      S6975=0;
                                      System.out.println("");//sysj\ECS_plant.sysj line: 321, column: 7
                                      System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 322, column: 7
                                      System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 323, column: 7
                                      deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 324, column: 7
                                      currsigs.addElement(deHumOnZone4_5_6);
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                    else {
                                      S6975=1;
                                      if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 327, column: 15
                                        System.out.println("");//sysj\ECS_plant.sysj line: 329, column: 7
                                        System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 330, column: 7
                                        System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 331, column: 7
                                        humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 332, column: 7
                                        currsigs.addElement(humOnZone4_5_6);
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                      else {
                                        System.out.println("");//sysj\ECS_plant.sysj line: 336, column: 6
                                        System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 337, column: 6
                                        S5051=10;
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                    }
                                  }
                                  else {
                                    S5051=10;
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                }
                              }
                            }
                          }
                          else {
                            S5051=8;
                            if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 290, column: 7
                              humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 291, column: 5
                              humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 292, column: 5
                              if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 293, column: 8
                                S6315=0;
                                System.out.println("");//sysj\ECS_plant.sysj line: 295, column: 7
                                System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 296, column: 7
                                System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 297, column: 7
                                deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 298, column: 7
                                currsigs.addElement(deHumOnZone2_3);
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                              else {
                                S6315=1;
                                if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 301, column: 15
                                  System.out.println("");//sysj\ECS_plant.sysj line: 303, column: 7
                                  System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 304, column: 7
                                  System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 305, column: 7
                                  humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 306, column: 7
                                  currsigs.addElement(humOnZone2_3);
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                                else {
                                  System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 6
                                  System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 311, column: 6
                                  S5051=9;
                                  if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 316, column: 7
                                    humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 317, column: 5
                                    humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 318, column: 5
                                    if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 319, column: 8
                                      S6975=0;
                                      System.out.println("");//sysj\ECS_plant.sysj line: 321, column: 7
                                      System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 322, column: 7
                                      System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 323, column: 7
                                      deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 324, column: 7
                                      currsigs.addElement(deHumOnZone4_5_6);
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                    else {
                                      S6975=1;
                                      if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 327, column: 15
                                        System.out.println("");//sysj\ECS_plant.sysj line: 329, column: 7
                                        System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 330, column: 7
                                        System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 331, column: 7
                                        humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 332, column: 7
                                        currsigs.addElement(humOnZone4_5_6);
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                      else {
                                        System.out.println("");//sysj\ECS_plant.sysj line: 336, column: 6
                                        System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 337, column: 6
                                        S5051=10;
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                    }
                                  }
                                  else {
                                    S5051=10;
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                }
                              }
                            }
                            else {
                              S5051=9;
                              if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 316, column: 7
                                humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 317, column: 5
                                humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 318, column: 5
                                if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 319, column: 8
                                  S6975=0;
                                  System.out.println("");//sysj\ECS_plant.sysj line: 321, column: 7
                                  System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 322, column: 7
                                  System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 323, column: 7
                                  deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 324, column: 7
                                  currsigs.addElement(deHumOnZone4_5_6);
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                                else {
                                  S6975=1;
                                  if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 327, column: 15
                                    System.out.println("");//sysj\ECS_plant.sysj line: 329, column: 7
                                    System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 330, column: 7
                                    System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 331, column: 7
                                    humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 332, column: 7
                                    currsigs.addElement(humOnZone4_5_6);
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                  else {
                                    System.out.println("");//sysj\ECS_plant.sysj line: 336, column: 6
                                    System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 337, column: 6
                                    S5051=10;
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                }
                              }
                              else {
                                S5051=10;
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                else {
                  S5051=5;
                  if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 216, column: 7
                    temp23_thread_2 = 0;//sysj\ECS_plant.sysj line: 217, column: 5
                    temp23_thread_2 = (tempZone2_3.getpreval() == null ? null : ((Integer)tempZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 218, column: 5
                    if(temp23_thread_2 > 22){//sysj\ECS_plant.sysj line: 219, column: 8
                      S5695=0;
                      System.out.println("");//sysj\ECS_plant.sysj line: 221, column: 7
                      System.out.println("Room temperature is too high at " + temp23_thread_2);//sysj\ECS_plant.sysj line: 222, column: 7
                      airOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 223, column: 7
                      currsigs.addElement(airOnZone2_3);
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S5695=1;
                      if(temp23_thread_2 < 21){//sysj\ECS_plant.sysj line: 226, column: 15
                        heatOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 228, column: 7
                        currsigs.addElement(heatOnZone2_3);
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
                        System.out.println("");//sysj\ECS_plant.sysj line: 232, column: 6
                        System.out.println("Room temperature is safe at" + temp23_thread_2);//sysj\ECS_plant.sysj line: 233, column: 6
                        S5051=6;
                        if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 239, column: 7
                          temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 240, column: 5
                          temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 241, column: 5
                          if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 242, column: 8
                            S5795=0;
                            System.out.println("");//sysj\ECS_plant.sysj line: 244, column: 7
                            System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 245, column: 7
                            airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 246, column: 7
                            currsigs.addElement(airOnZone4_5_6);
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S5795=1;
                            if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 249, column: 15
                              System.out.println("");//sysj\ECS_plant.sysj line: 251, column: 7
                              System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 252, column: 7
                              heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 253, column: 7
                              currsigs.addElement(heatOnZone4_5_6);
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              System.out.println("");//sysj\ECS_plant.sysj line: 257, column: 6
                              System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 258, column: 6
                              S5051=7;
                              if(zone_thread_2 == 1 || zone_thread_2 == 7){//sysj\ECS_plant.sysj line: 264, column: 7
                                humid17_thread_2 = 0;//sysj\ECS_plant.sysj line: 265, column: 5
                                humid17_thread_2 = (humidZone1_7.getpreval() == null ? null : ((Integer)humidZone1_7.getpreval()));//sysj\ECS_plant.sysj line: 266, column: 5
                                if(humid17_thread_2 > 60){//sysj\ECS_plant.sysj line: 267, column: 8
                                  S5975=0;
                                  System.out.println("");//sysj\ECS_plant.sysj line: 269, column: 7
                                  System.out.println("Room humidity is too high at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 270, column: 7
                                  System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 271, column: 7
                                  deHumOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 272, column: 7
                                  currsigs.addElement(deHumOnZone1_7);
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                                else {
                                  S5975=1;
                                  if(humid17_thread_2 < 30){//sysj\ECS_plant.sysj line: 275, column: 15
                                    System.out.println("");//sysj\ECS_plant.sysj line: 277, column: 7
                                    System.out.println("Room humidity is too low at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 278, column: 7
                                    System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 279, column: 7
                                    humOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 280, column: 7
                                    currsigs.addElement(humOnZone1_7);
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                  else {
                                    System.out.println("");//sysj\ECS_plant.sysj line: 284, column: 6
                                    System.out.println("Room humidity is safe at" + humid17_thread_2);//sysj\ECS_plant.sysj line: 285, column: 6
                                    S5051=8;
                                    if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 290, column: 7
                                      humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 291, column: 5
                                      humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 292, column: 5
                                      if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 293, column: 8
                                        S6315=0;
                                        System.out.println("");//sysj\ECS_plant.sysj line: 295, column: 7
                                        System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 296, column: 7
                                        System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 297, column: 7
                                        deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 298, column: 7
                                        currsigs.addElement(deHumOnZone2_3);
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                      else {
                                        S6315=1;
                                        if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 301, column: 15
                                          System.out.println("");//sysj\ECS_plant.sysj line: 303, column: 7
                                          System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 304, column: 7
                                          System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 305, column: 7
                                          humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 306, column: 7
                                          currsigs.addElement(humOnZone2_3);
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                        else {
                                          System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 6
                                          System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 311, column: 6
                                          S5051=9;
                                          if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 316, column: 7
                                            humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 317, column: 5
                                            humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 318, column: 5
                                            if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 319, column: 8
                                              S6975=0;
                                              System.out.println("");//sysj\ECS_plant.sysj line: 321, column: 7
                                              System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 322, column: 7
                                              System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 323, column: 7
                                              deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 324, column: 7
                                              currsigs.addElement(deHumOnZone4_5_6);
                                              active[2]=1;
                                              ends[2]=1;
                                              tdone[2]=1;
                                            }
                                            else {
                                              S6975=1;
                                              if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 327, column: 15
                                                System.out.println("");//sysj\ECS_plant.sysj line: 329, column: 7
                                                System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 330, column: 7
                                                System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 331, column: 7
                                                humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 332, column: 7
                                                currsigs.addElement(humOnZone4_5_6);
                                                active[2]=1;
                                                ends[2]=1;
                                                tdone[2]=1;
                                              }
                                              else {
                                                System.out.println("");//sysj\ECS_plant.sysj line: 336, column: 6
                                                System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 337, column: 6
                                                S5051=10;
                                                active[2]=1;
                                                ends[2]=1;
                                                tdone[2]=1;
                                              }
                                            }
                                          }
                                          else {
                                            S5051=10;
                                            active[2]=1;
                                            ends[2]=1;
                                            tdone[2]=1;
                                          }
                                        }
                                      }
                                    }
                                    else {
                                      S5051=9;
                                      if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 316, column: 7
                                        humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 317, column: 5
                                        humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 318, column: 5
                                        if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 319, column: 8
                                          S6975=0;
                                          System.out.println("");//sysj\ECS_plant.sysj line: 321, column: 7
                                          System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 322, column: 7
                                          System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 323, column: 7
                                          deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 324, column: 7
                                          currsigs.addElement(deHumOnZone4_5_6);
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                        else {
                                          S6975=1;
                                          if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 327, column: 15
                                            System.out.println("");//sysj\ECS_plant.sysj line: 329, column: 7
                                            System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 330, column: 7
                                            System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 331, column: 7
                                            humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 332, column: 7
                                            currsigs.addElement(humOnZone4_5_6);
                                            active[2]=1;
                                            ends[2]=1;
                                            tdone[2]=1;
                                          }
                                          else {
                                            System.out.println("");//sysj\ECS_plant.sysj line: 336, column: 6
                                            System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 337, column: 6
                                            S5051=10;
                                            active[2]=1;
                                            ends[2]=1;
                                            tdone[2]=1;
                                          }
                                        }
                                      }
                                      else {
                                        S5051=10;
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                    }
                                  }
                                }
                              }
                              else {
                                S5051=8;
                                if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 290, column: 7
                                  humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 291, column: 5
                                  humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 292, column: 5
                                  if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 293, column: 8
                                    S6315=0;
                                    System.out.println("");//sysj\ECS_plant.sysj line: 295, column: 7
                                    System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 296, column: 7
                                    System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 297, column: 7
                                    deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 298, column: 7
                                    currsigs.addElement(deHumOnZone2_3);
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                  else {
                                    S6315=1;
                                    if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 301, column: 15
                                      System.out.println("");//sysj\ECS_plant.sysj line: 303, column: 7
                                      System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 304, column: 7
                                      System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 305, column: 7
                                      humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 306, column: 7
                                      currsigs.addElement(humOnZone2_3);
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                    else {
                                      System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 6
                                      System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 311, column: 6
                                      S5051=9;
                                      if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 316, column: 7
                                        humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 317, column: 5
                                        humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 318, column: 5
                                        if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 319, column: 8
                                          S6975=0;
                                          System.out.println("");//sysj\ECS_plant.sysj line: 321, column: 7
                                          System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 322, column: 7
                                          System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 323, column: 7
                                          deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 324, column: 7
                                          currsigs.addElement(deHumOnZone4_5_6);
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                        else {
                                          S6975=1;
                                          if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 327, column: 15
                                            System.out.println("");//sysj\ECS_plant.sysj line: 329, column: 7
                                            System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 330, column: 7
                                            System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 331, column: 7
                                            humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 332, column: 7
                                            currsigs.addElement(humOnZone4_5_6);
                                            active[2]=1;
                                            ends[2]=1;
                                            tdone[2]=1;
                                          }
                                          else {
                                            System.out.println("");//sysj\ECS_plant.sysj line: 336, column: 6
                                            System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 337, column: 6
                                            S5051=10;
                                            active[2]=1;
                                            ends[2]=1;
                                            tdone[2]=1;
                                          }
                                        }
                                      }
                                      else {
                                        S5051=10;
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                    }
                                  }
                                }
                                else {
                                  S5051=9;
                                  if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 316, column: 7
                                    humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 317, column: 5
                                    humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 318, column: 5
                                    if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 319, column: 8
                                      S6975=0;
                                      System.out.println("");//sysj\ECS_plant.sysj line: 321, column: 7
                                      System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 322, column: 7
                                      System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 323, column: 7
                                      deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 324, column: 7
                                      currsigs.addElement(deHumOnZone4_5_6);
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                    else {
                                      S6975=1;
                                      if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 327, column: 15
                                        System.out.println("");//sysj\ECS_plant.sysj line: 329, column: 7
                                        System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 330, column: 7
                                        System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 331, column: 7
                                        humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 332, column: 7
                                        currsigs.addElement(humOnZone4_5_6);
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                      else {
                                        System.out.println("");//sysj\ECS_plant.sysj line: 336, column: 6
                                        System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 337, column: 6
                                        S5051=10;
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                    }
                                  }
                                  else {
                                    S5051=10;
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                }
                              }
                            }
                          }
                        }
                        else {
                          S5051=7;
                          if(zone_thread_2 == 1 || zone_thread_2 == 7){//sysj\ECS_plant.sysj line: 264, column: 7
                            humid17_thread_2 = 0;//sysj\ECS_plant.sysj line: 265, column: 5
                            humid17_thread_2 = (humidZone1_7.getpreval() == null ? null : ((Integer)humidZone1_7.getpreval()));//sysj\ECS_plant.sysj line: 266, column: 5
                            if(humid17_thread_2 > 60){//sysj\ECS_plant.sysj line: 267, column: 8
                              S5975=0;
                              System.out.println("");//sysj\ECS_plant.sysj line: 269, column: 7
                              System.out.println("Room humidity is too high at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 270, column: 7
                              System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 271, column: 7
                              deHumOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 272, column: 7
                              currsigs.addElement(deHumOnZone1_7);
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S5975=1;
                              if(humid17_thread_2 < 30){//sysj\ECS_plant.sysj line: 275, column: 15
                                System.out.println("");//sysj\ECS_plant.sysj line: 277, column: 7
                                System.out.println("Room humidity is too low at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 278, column: 7
                                System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 279, column: 7
                                humOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 280, column: 7
                                currsigs.addElement(humOnZone1_7);
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                              else {
                                System.out.println("");//sysj\ECS_plant.sysj line: 284, column: 6
                                System.out.println("Room humidity is safe at" + humid17_thread_2);//sysj\ECS_plant.sysj line: 285, column: 6
                                S5051=8;
                                if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 290, column: 7
                                  humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 291, column: 5
                                  humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 292, column: 5
                                  if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 293, column: 8
                                    S6315=0;
                                    System.out.println("");//sysj\ECS_plant.sysj line: 295, column: 7
                                    System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 296, column: 7
                                    System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 297, column: 7
                                    deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 298, column: 7
                                    currsigs.addElement(deHumOnZone2_3);
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                  else {
                                    S6315=1;
                                    if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 301, column: 15
                                      System.out.println("");//sysj\ECS_plant.sysj line: 303, column: 7
                                      System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 304, column: 7
                                      System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 305, column: 7
                                      humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 306, column: 7
                                      currsigs.addElement(humOnZone2_3);
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                    else {
                                      System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 6
                                      System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 311, column: 6
                                      S5051=9;
                                      if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 316, column: 7
                                        humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 317, column: 5
                                        humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 318, column: 5
                                        if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 319, column: 8
                                          S6975=0;
                                          System.out.println("");//sysj\ECS_plant.sysj line: 321, column: 7
                                          System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 322, column: 7
                                          System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 323, column: 7
                                          deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 324, column: 7
                                          currsigs.addElement(deHumOnZone4_5_6);
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                        else {
                                          S6975=1;
                                          if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 327, column: 15
                                            System.out.println("");//sysj\ECS_plant.sysj line: 329, column: 7
                                            System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 330, column: 7
                                            System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 331, column: 7
                                            humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 332, column: 7
                                            currsigs.addElement(humOnZone4_5_6);
                                            active[2]=1;
                                            ends[2]=1;
                                            tdone[2]=1;
                                          }
                                          else {
                                            System.out.println("");//sysj\ECS_plant.sysj line: 336, column: 6
                                            System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 337, column: 6
                                            S5051=10;
                                            active[2]=1;
                                            ends[2]=1;
                                            tdone[2]=1;
                                          }
                                        }
                                      }
                                      else {
                                        S5051=10;
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                    }
                                  }
                                }
                                else {
                                  S5051=9;
                                  if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 316, column: 7
                                    humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 317, column: 5
                                    humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 318, column: 5
                                    if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 319, column: 8
                                      S6975=0;
                                      System.out.println("");//sysj\ECS_plant.sysj line: 321, column: 7
                                      System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 322, column: 7
                                      System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 323, column: 7
                                      deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 324, column: 7
                                      currsigs.addElement(deHumOnZone4_5_6);
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                    else {
                                      S6975=1;
                                      if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 327, column: 15
                                        System.out.println("");//sysj\ECS_plant.sysj line: 329, column: 7
                                        System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 330, column: 7
                                        System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 331, column: 7
                                        humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 332, column: 7
                                        currsigs.addElement(humOnZone4_5_6);
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                      else {
                                        System.out.println("");//sysj\ECS_plant.sysj line: 336, column: 6
                                        System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 337, column: 6
                                        S5051=10;
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                    }
                                  }
                                  else {
                                    S5051=10;
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                }
                              }
                            }
                          }
                          else {
                            S5051=8;
                            if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 290, column: 7
                              humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 291, column: 5
                              humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 292, column: 5
                              if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 293, column: 8
                                S6315=0;
                                System.out.println("");//sysj\ECS_plant.sysj line: 295, column: 7
                                System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 296, column: 7
                                System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 297, column: 7
                                deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 298, column: 7
                                currsigs.addElement(deHumOnZone2_3);
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                              else {
                                S6315=1;
                                if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 301, column: 15
                                  System.out.println("");//sysj\ECS_plant.sysj line: 303, column: 7
                                  System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 304, column: 7
                                  System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 305, column: 7
                                  humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 306, column: 7
                                  currsigs.addElement(humOnZone2_3);
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                                else {
                                  System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 6
                                  System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 311, column: 6
                                  S5051=9;
                                  if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 316, column: 7
                                    humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 317, column: 5
                                    humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 318, column: 5
                                    if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 319, column: 8
                                      S6975=0;
                                      System.out.println("");//sysj\ECS_plant.sysj line: 321, column: 7
                                      System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 322, column: 7
                                      System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 323, column: 7
                                      deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 324, column: 7
                                      currsigs.addElement(deHumOnZone4_5_6);
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                    else {
                                      S6975=1;
                                      if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 327, column: 15
                                        System.out.println("");//sysj\ECS_plant.sysj line: 329, column: 7
                                        System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 330, column: 7
                                        System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 331, column: 7
                                        humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 332, column: 7
                                        currsigs.addElement(humOnZone4_5_6);
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                      else {
                                        System.out.println("");//sysj\ECS_plant.sysj line: 336, column: 6
                                        System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 337, column: 6
                                        S5051=10;
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                    }
                                  }
                                  else {
                                    S5051=10;
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                }
                              }
                            }
                            else {
                              S5051=9;
                              if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 316, column: 7
                                humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 317, column: 5
                                humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 318, column: 5
                                if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 319, column: 8
                                  S6975=0;
                                  System.out.println("");//sysj\ECS_plant.sysj line: 321, column: 7
                                  System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 322, column: 7
                                  System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 323, column: 7
                                  deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 324, column: 7
                                  currsigs.addElement(deHumOnZone4_5_6);
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                                else {
                                  S6975=1;
                                  if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 327, column: 15
                                    System.out.println("");//sysj\ECS_plant.sysj line: 329, column: 7
                                    System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 330, column: 7
                                    System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 331, column: 7
                                    humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 332, column: 7
                                    currsigs.addElement(humOnZone4_5_6);
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                  else {
                                    System.out.println("");//sysj\ECS_plant.sysj line: 336, column: 6
                                    System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 337, column: 6
                                    S5051=10;
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                }
                              }
                              else {
                                S5051=10;
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  else {
                    S5051=6;
                    if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 239, column: 7
                      temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 240, column: 5
                      temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 241, column: 5
                      if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 242, column: 8
                        S5795=0;
                        System.out.println("");//sysj\ECS_plant.sysj line: 244, column: 7
                        System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 245, column: 7
                        airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 246, column: 7
                        currsigs.addElement(airOnZone4_5_6);
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
                        S5795=1;
                        if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 249, column: 15
                          System.out.println("");//sysj\ECS_plant.sysj line: 251, column: 7
                          System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 252, column: 7
                          heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 253, column: 7
                          currsigs.addElement(heatOnZone4_5_6);
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          System.out.println("");//sysj\ECS_plant.sysj line: 257, column: 6
                          System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 258, column: 6
                          S5051=7;
                          if(zone_thread_2 == 1 || zone_thread_2 == 7){//sysj\ECS_plant.sysj line: 264, column: 7
                            humid17_thread_2 = 0;//sysj\ECS_plant.sysj line: 265, column: 5
                            humid17_thread_2 = (humidZone1_7.getpreval() == null ? null : ((Integer)humidZone1_7.getpreval()));//sysj\ECS_plant.sysj line: 266, column: 5
                            if(humid17_thread_2 > 60){//sysj\ECS_plant.sysj line: 267, column: 8
                              S5975=0;
                              System.out.println("");//sysj\ECS_plant.sysj line: 269, column: 7
                              System.out.println("Room humidity is too high at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 270, column: 7
                              System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 271, column: 7
                              deHumOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 272, column: 7
                              currsigs.addElement(deHumOnZone1_7);
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S5975=1;
                              if(humid17_thread_2 < 30){//sysj\ECS_plant.sysj line: 275, column: 15
                                System.out.println("");//sysj\ECS_plant.sysj line: 277, column: 7
                                System.out.println("Room humidity is too low at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 278, column: 7
                                System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 279, column: 7
                                humOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 280, column: 7
                                currsigs.addElement(humOnZone1_7);
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                              else {
                                System.out.println("");//sysj\ECS_plant.sysj line: 284, column: 6
                                System.out.println("Room humidity is safe at" + humid17_thread_2);//sysj\ECS_plant.sysj line: 285, column: 6
                                S5051=8;
                                if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 290, column: 7
                                  humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 291, column: 5
                                  humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 292, column: 5
                                  if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 293, column: 8
                                    S6315=0;
                                    System.out.println("");//sysj\ECS_plant.sysj line: 295, column: 7
                                    System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 296, column: 7
                                    System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 297, column: 7
                                    deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 298, column: 7
                                    currsigs.addElement(deHumOnZone2_3);
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                  else {
                                    S6315=1;
                                    if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 301, column: 15
                                      System.out.println("");//sysj\ECS_plant.sysj line: 303, column: 7
                                      System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 304, column: 7
                                      System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 305, column: 7
                                      humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 306, column: 7
                                      currsigs.addElement(humOnZone2_3);
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                    else {
                                      System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 6
                                      System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 311, column: 6
                                      S5051=9;
                                      if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 316, column: 7
                                        humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 317, column: 5
                                        humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 318, column: 5
                                        if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 319, column: 8
                                          S6975=0;
                                          System.out.println("");//sysj\ECS_plant.sysj line: 321, column: 7
                                          System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 322, column: 7
                                          System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 323, column: 7
                                          deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 324, column: 7
                                          currsigs.addElement(deHumOnZone4_5_6);
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                        else {
                                          S6975=1;
                                          if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 327, column: 15
                                            System.out.println("");//sysj\ECS_plant.sysj line: 329, column: 7
                                            System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 330, column: 7
                                            System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 331, column: 7
                                            humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 332, column: 7
                                            currsigs.addElement(humOnZone4_5_6);
                                            active[2]=1;
                                            ends[2]=1;
                                            tdone[2]=1;
                                          }
                                          else {
                                            System.out.println("");//sysj\ECS_plant.sysj line: 336, column: 6
                                            System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 337, column: 6
                                            S5051=10;
                                            active[2]=1;
                                            ends[2]=1;
                                            tdone[2]=1;
                                          }
                                        }
                                      }
                                      else {
                                        S5051=10;
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                    }
                                  }
                                }
                                else {
                                  S5051=9;
                                  if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 316, column: 7
                                    humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 317, column: 5
                                    humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 318, column: 5
                                    if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 319, column: 8
                                      S6975=0;
                                      System.out.println("");//sysj\ECS_plant.sysj line: 321, column: 7
                                      System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 322, column: 7
                                      System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 323, column: 7
                                      deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 324, column: 7
                                      currsigs.addElement(deHumOnZone4_5_6);
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                    else {
                                      S6975=1;
                                      if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 327, column: 15
                                        System.out.println("");//sysj\ECS_plant.sysj line: 329, column: 7
                                        System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 330, column: 7
                                        System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 331, column: 7
                                        humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 332, column: 7
                                        currsigs.addElement(humOnZone4_5_6);
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                      else {
                                        System.out.println("");//sysj\ECS_plant.sysj line: 336, column: 6
                                        System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 337, column: 6
                                        S5051=10;
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                    }
                                  }
                                  else {
                                    S5051=10;
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                }
                              }
                            }
                          }
                          else {
                            S5051=8;
                            if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 290, column: 7
                              humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 291, column: 5
                              humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 292, column: 5
                              if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 293, column: 8
                                S6315=0;
                                System.out.println("");//sysj\ECS_plant.sysj line: 295, column: 7
                                System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 296, column: 7
                                System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 297, column: 7
                                deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 298, column: 7
                                currsigs.addElement(deHumOnZone2_3);
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                              else {
                                S6315=1;
                                if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 301, column: 15
                                  System.out.println("");//sysj\ECS_plant.sysj line: 303, column: 7
                                  System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 304, column: 7
                                  System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 305, column: 7
                                  humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 306, column: 7
                                  currsigs.addElement(humOnZone2_3);
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                                else {
                                  System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 6
                                  System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 311, column: 6
                                  S5051=9;
                                  if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 316, column: 7
                                    humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 317, column: 5
                                    humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 318, column: 5
                                    if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 319, column: 8
                                      S6975=0;
                                      System.out.println("");//sysj\ECS_plant.sysj line: 321, column: 7
                                      System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 322, column: 7
                                      System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 323, column: 7
                                      deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 324, column: 7
                                      currsigs.addElement(deHumOnZone4_5_6);
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                    else {
                                      S6975=1;
                                      if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 327, column: 15
                                        System.out.println("");//sysj\ECS_plant.sysj line: 329, column: 7
                                        System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 330, column: 7
                                        System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 331, column: 7
                                        humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 332, column: 7
                                        currsigs.addElement(humOnZone4_5_6);
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                      else {
                                        System.out.println("");//sysj\ECS_plant.sysj line: 336, column: 6
                                        System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 337, column: 6
                                        S5051=10;
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                    }
                                  }
                                  else {
                                    S5051=10;
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                }
                              }
                            }
                            else {
                              S5051=9;
                              if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 316, column: 7
                                humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 317, column: 5
                                humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 318, column: 5
                                if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 319, column: 8
                                  S6975=0;
                                  System.out.println("");//sysj\ECS_plant.sysj line: 321, column: 7
                                  System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 322, column: 7
                                  System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 323, column: 7
                                  deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 324, column: 7
                                  currsigs.addElement(deHumOnZone4_5_6);
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                                else {
                                  S6975=1;
                                  if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 327, column: 15
                                    System.out.println("");//sysj\ECS_plant.sysj line: 329, column: 7
                                    System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 330, column: 7
                                    System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 331, column: 7
                                    humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 332, column: 7
                                    currsigs.addElement(humOnZone4_5_6);
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                  else {
                                    System.out.println("");//sysj\ECS_plant.sysj line: 336, column: 6
                                    System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 337, column: 6
                                    S5051=10;
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                }
                              }
                              else {
                                S5051=10;
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                            }
                          }
                        }
                      }
                    }
                    else {
                      S5051=7;
                      if(zone_thread_2 == 1 || zone_thread_2 == 7){//sysj\ECS_plant.sysj line: 264, column: 7
                        humid17_thread_2 = 0;//sysj\ECS_plant.sysj line: 265, column: 5
                        humid17_thread_2 = (humidZone1_7.getpreval() == null ? null : ((Integer)humidZone1_7.getpreval()));//sysj\ECS_plant.sysj line: 266, column: 5
                        if(humid17_thread_2 > 60){//sysj\ECS_plant.sysj line: 267, column: 8
                          S5975=0;
                          System.out.println("");//sysj\ECS_plant.sysj line: 269, column: 7
                          System.out.println("Room humidity is too high at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 270, column: 7
                          System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 271, column: 7
                          deHumOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 272, column: 7
                          currsigs.addElement(deHumOnZone1_7);
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          S5975=1;
                          if(humid17_thread_2 < 30){//sysj\ECS_plant.sysj line: 275, column: 15
                            System.out.println("");//sysj\ECS_plant.sysj line: 277, column: 7
                            System.out.println("Room humidity is too low at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 278, column: 7
                            System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 279, column: 7
                            humOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 280, column: 7
                            currsigs.addElement(humOnZone1_7);
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            System.out.println("");//sysj\ECS_plant.sysj line: 284, column: 6
                            System.out.println("Room humidity is safe at" + humid17_thread_2);//sysj\ECS_plant.sysj line: 285, column: 6
                            S5051=8;
                            if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 290, column: 7
                              humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 291, column: 5
                              humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 292, column: 5
                              if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 293, column: 8
                                S6315=0;
                                System.out.println("");//sysj\ECS_plant.sysj line: 295, column: 7
                                System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 296, column: 7
                                System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 297, column: 7
                                deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 298, column: 7
                                currsigs.addElement(deHumOnZone2_3);
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                              else {
                                S6315=1;
                                if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 301, column: 15
                                  System.out.println("");//sysj\ECS_plant.sysj line: 303, column: 7
                                  System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 304, column: 7
                                  System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 305, column: 7
                                  humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 306, column: 7
                                  currsigs.addElement(humOnZone2_3);
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                                else {
                                  System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 6
                                  System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 311, column: 6
                                  S5051=9;
                                  if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 316, column: 7
                                    humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 317, column: 5
                                    humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 318, column: 5
                                    if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 319, column: 8
                                      S6975=0;
                                      System.out.println("");//sysj\ECS_plant.sysj line: 321, column: 7
                                      System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 322, column: 7
                                      System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 323, column: 7
                                      deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 324, column: 7
                                      currsigs.addElement(deHumOnZone4_5_6);
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                    else {
                                      S6975=1;
                                      if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 327, column: 15
                                        System.out.println("");//sysj\ECS_plant.sysj line: 329, column: 7
                                        System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 330, column: 7
                                        System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 331, column: 7
                                        humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 332, column: 7
                                        currsigs.addElement(humOnZone4_5_6);
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                      else {
                                        System.out.println("");//sysj\ECS_plant.sysj line: 336, column: 6
                                        System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 337, column: 6
                                        S5051=10;
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                    }
                                  }
                                  else {
                                    S5051=10;
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                }
                              }
                            }
                            else {
                              S5051=9;
                              if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 316, column: 7
                                humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 317, column: 5
                                humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 318, column: 5
                                if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 319, column: 8
                                  S6975=0;
                                  System.out.println("");//sysj\ECS_plant.sysj line: 321, column: 7
                                  System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 322, column: 7
                                  System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 323, column: 7
                                  deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 324, column: 7
                                  currsigs.addElement(deHumOnZone4_5_6);
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                                else {
                                  S6975=1;
                                  if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 327, column: 15
                                    System.out.println("");//sysj\ECS_plant.sysj line: 329, column: 7
                                    System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 330, column: 7
                                    System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 331, column: 7
                                    humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 332, column: 7
                                    currsigs.addElement(humOnZone4_5_6);
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                  else {
                                    System.out.println("");//sysj\ECS_plant.sysj line: 336, column: 6
                                    System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 337, column: 6
                                    S5051=10;
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                }
                              }
                              else {
                                S5051=10;
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                            }
                          }
                        }
                      }
                      else {
                        S5051=8;
                        if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 290, column: 7
                          humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 291, column: 5
                          humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 292, column: 5
                          if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 293, column: 8
                            S6315=0;
                            System.out.println("");//sysj\ECS_plant.sysj line: 295, column: 7
                            System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 296, column: 7
                            System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 297, column: 7
                            deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 298, column: 7
                            currsigs.addElement(deHumOnZone2_3);
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S6315=1;
                            if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 301, column: 15
                              System.out.println("");//sysj\ECS_plant.sysj line: 303, column: 7
                              System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 304, column: 7
                              System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 305, column: 7
                              humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 306, column: 7
                              currsigs.addElement(humOnZone2_3);
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 6
                              System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 311, column: 6
                              S5051=9;
                              if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 316, column: 7
                                humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 317, column: 5
                                humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 318, column: 5
                                if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 319, column: 8
                                  S6975=0;
                                  System.out.println("");//sysj\ECS_plant.sysj line: 321, column: 7
                                  System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 322, column: 7
                                  System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 323, column: 7
                                  deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 324, column: 7
                                  currsigs.addElement(deHumOnZone4_5_6);
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                                else {
                                  S6975=1;
                                  if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 327, column: 15
                                    System.out.println("");//sysj\ECS_plant.sysj line: 329, column: 7
                                    System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 330, column: 7
                                    System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 331, column: 7
                                    humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 332, column: 7
                                    currsigs.addElement(humOnZone4_5_6);
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                  else {
                                    System.out.println("");//sysj\ECS_plant.sysj line: 336, column: 6
                                    System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 337, column: 6
                                    S5051=10;
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                }
                              }
                              else {
                                S5051=10;
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                            }
                          }
                        }
                        else {
                          S5051=9;
                          if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 316, column: 7
                            humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 317, column: 5
                            humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 318, column: 5
                            if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 319, column: 8
                              S6975=0;
                              System.out.println("");//sysj\ECS_plant.sysj line: 321, column: 7
                              System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 322, column: 7
                              System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 323, column: 7
                              deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 324, column: 7
                              currsigs.addElement(deHumOnZone4_5_6);
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S6975=1;
                              if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 327, column: 15
                                System.out.println("");//sysj\ECS_plant.sysj line: 329, column: 7
                                System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 330, column: 7
                                System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 331, column: 7
                                humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 332, column: 7
                                currsigs.addElement(humOnZone4_5_6);
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                              else {
                                System.out.println("");//sysj\ECS_plant.sysj line: 336, column: 6
                                System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 337, column: 6
                                S5051=10;
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                            }
                          }
                          else {
                            S5051=10;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            else {
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 3 : 
            switch(S5530){
              case 0 : 
                cleanZone1.setPresent();//sysj\ECS_plant.sysj line: 150, column: 7
                currsigs.addElement(cleanZone1);
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
                break;
              
              case 1 : 
                cleanZone2.setPresent();//sysj\ECS_plant.sysj line: 156, column: 7
                currsigs.addElement(cleanZone2);
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
                break;
              
              case 2 : 
                cleanZone3.setPresent();//sysj\ECS_plant.sysj line: 162, column: 7
                currsigs.addElement(cleanZone3);
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
                break;
              
              case 3 : 
                cleanZone4.setPresent();//sysj\ECS_plant.sysj line: 168, column: 7
                currsigs.addElement(cleanZone4);
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
                break;
              
              case 4 : 
                cleanZone5.setPresent();//sysj\ECS_plant.sysj line: 174, column: 7
                currsigs.addElement(cleanZone5);
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
                break;
              
              case 5 : 
                cleanZone7.setPresent();//sysj\ECS_plant.sysj line: 180, column: 7
                currsigs.addElement(cleanZone7);
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
                break;
              
              case 6 : 
                cleanZone7.setPresent();//sysj\ECS_plant.sysj line: 186, column: 7
                currsigs.addElement(cleanZone7);
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
                break;
              
            }
            break;
          
          case 4 : 
            switch(S5635){
              case 0 : 
                System.out.println("");//sysj\ECS_plant.sysj line: 198, column: 7
                System.out.println("Room temperature is too high at " + temp17_thread_2);//sysj\ECS_plant.sysj line: 199, column: 7
                fanOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 200, column: 7
                currsigs.addElement(fanOnZone1_7);
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
                break;
              
              case 1 : 
                switch(S5634){
                  case 0 : 
                    System.out.println("Room temperature is too low at " + temp17_thread_2);//sysj\ECS_plant.sysj line: 205, column: 7
                    heatOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 206, column: 7
                    currsigs.addElement(heatOnZone1_7);
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                    break;
                  
                  case 1 : 
                    System.out.println("ECS PLANT STARTED AWAITING RUN BUTTON");//sysj\ECS_plant.sysj line: 38, column: 4
                    S5051=0;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                    break;
                  
                }
                break;
              
            }
            break;
          
          case 5 : 
            switch(S5695){
              case 0 : 
                System.out.println("");//sysj\ECS_plant.sysj line: 221, column: 7
                System.out.println("Room temperature is too high at " + temp23_thread_2);//sysj\ECS_plant.sysj line: 222, column: 7
                airOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 223, column: 7
                currsigs.addElement(airOnZone2_3);
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
                break;
              
              case 1 : 
                heatOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 228, column: 7
                currsigs.addElement(heatOnZone2_3);
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
                break;
              
            }
            break;
          
          case 6 : 
            switch(S5795){
              case 0 : 
                System.out.println("");//sysj\ECS_plant.sysj line: 244, column: 7
                System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 245, column: 7
                airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 246, column: 7
                currsigs.addElement(airOnZone4_5_6);
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
                break;
              
              case 1 : 
                System.out.println("");//sysj\ECS_plant.sysj line: 251, column: 7
                System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 252, column: 7
                heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 253, column: 7
                currsigs.addElement(heatOnZone4_5_6);
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
                break;
              
            }
            break;
          
          case 7 : 
            switch(S5975){
              case 0 : 
                System.out.println("");//sysj\ECS_plant.sysj line: 269, column: 7
                System.out.println("Room humidity is too high at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 270, column: 7
                System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 271, column: 7
                deHumOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 272, column: 7
                currsigs.addElement(deHumOnZone1_7);
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
                break;
              
              case 1 : 
                System.out.println("");//sysj\ECS_plant.sysj line: 277, column: 7
                System.out.println("Room humidity is too low at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 278, column: 7
                System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 279, column: 7
                humOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 280, column: 7
                currsigs.addElement(humOnZone1_7);
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
                break;
              
            }
            break;
          
          case 8 : 
            switch(S6315){
              case 0 : 
                System.out.println("");//sysj\ECS_plant.sysj line: 295, column: 7
                System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 296, column: 7
                System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 297, column: 7
                deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 298, column: 7
                currsigs.addElement(deHumOnZone2_3);
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
                break;
              
              case 1 : 
                System.out.println("");//sysj\ECS_plant.sysj line: 303, column: 7
                System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 304, column: 7
                System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 305, column: 7
                humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 306, column: 7
                currsigs.addElement(humOnZone2_3);
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
                break;
              
            }
            break;
          
          case 9 : 
            switch(S6975){
              case 0 : 
                System.out.println("");//sysj\ECS_plant.sysj line: 321, column: 7
                System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 322, column: 7
                System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 323, column: 7
                deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 324, column: 7
                currsigs.addElement(deHumOnZone4_5_6);
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
                break;
              
              case 1 : 
                System.out.println("");//sysj\ECS_plant.sysj line: 329, column: 7
                System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 330, column: 7
                System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 331, column: 7
                humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 332, column: 7
                currsigs.addElement(humOnZone4_5_6);
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
                break;
              
            }
            break;
          
          case 10 : 
            S5051=10;
            System.out.println("ECS PLANT STARTED AWAITING RUN BUTTON");//sysj\ECS_plant.sysj line: 38, column: 4
            S5051=0;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread24924(int [] tdone, int [] ends){
        S14965=1;
    if(cutPowZ7.getprestatus()){//sysj\ECS_plant.sysj line: 412, column: 24
      cutPowZ7_TriggerE.setPresent();//sysj\ECS_plant.sysj line: 412, column: 34
      currsigs.addElement(cutPowZ7_TriggerE);
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
  }

  public void thread24923(int [] tdone, int [] ends){
        S14957=1;
    if(cutPowZ6.getprestatus()){//sysj\ECS_plant.sysj line: 410, column: 24
      cutPowZ6_TriggerE.setPresent();//sysj\ECS_plant.sysj line: 410, column: 34
      currsigs.addElement(cutPowZ6_TriggerE);
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    else {
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread24922(int [] tdone, int [] ends){
        S14949=1;
    if(cutPowZ5.getprestatus()){//sysj\ECS_plant.sysj line: 408, column: 24
      cutPowZ5_TriggerE.setPresent();//sysj\ECS_plant.sysj line: 408, column: 34
      currsigs.addElement(cutPowZ5_TriggerE);
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    else {
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread24921(int [] tdone, int [] ends){
        S14941=1;
    if(cutPowZ4.getprestatus()){//sysj\ECS_plant.sysj line: 406, column: 24
      cutPowZ4_TriggerE.setPresent();//sysj\ECS_plant.sysj line: 406, column: 34
      currsigs.addElement(cutPowZ4_TriggerE);
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    else {
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
  }

  public void thread24920(int [] tdone, int [] ends){
        S14933=1;
    if(cutPowZ3.getprestatus()){//sysj\ECS_plant.sysj line: 404, column: 24
      cutPowZ3_TriggerE.setPresent();//sysj\ECS_plant.sysj line: 404, column: 34
      currsigs.addElement(cutPowZ3_TriggerE);
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
    else {
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
  }

  public void thread24919(int [] tdone, int [] ends){
        S14925=1;
    if(cutPowZ2.getprestatus()){//sysj\ECS_plant.sysj line: 402, column: 24
      cutPowZ2_TriggerE.setPresent();//sysj\ECS_plant.sysj line: 402, column: 34
      currsigs.addElement(cutPowZ2_TriggerE);
      active[31]=1;
      ends[31]=1;
      tdone[31]=1;
    }
    else {
      active[31]=1;
      ends[31]=1;
      tdone[31]=1;
    }
  }

  public void thread24918(int [] tdone, int [] ends){
        S14917=1;
    if(cutPowZ1.getprestatus()){//sysj\ECS_plant.sysj line: 400, column: 24
      cutPowZ1_TriggerE.setPresent();//sysj\ECS_plant.sysj line: 400, column: 34
      currsigs.addElement(cutPowZ1_TriggerE);
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
    else {
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
  }

  public void thread24917(int [] tdone, int [] ends){
        S14909=1;
    if(deHumOnZone4_5_6.getprestatus()){//sysj\ECS_plant.sysj line: 398, column: 24
      deHumOnZone4_5_6TriggerE.setPresent();//sysj\ECS_plant.sysj line: 398, column: 42
      currsigs.addElement(deHumOnZone4_5_6TriggerE);
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
    else {
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
  }

  public void thread24916(int [] tdone, int [] ends){
        S14901=1;
    if(deHumOnZone2_3.getprestatus()){//sysj\ECS_plant.sysj line: 396, column: 24
      deHumOnZone2_3TriggerE.setPresent();//sysj\ECS_plant.sysj line: 396, column: 40
      currsigs.addElement(deHumOnZone2_3TriggerE);
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
    else {
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
  }

  public void thread24915(int [] tdone, int [] ends){
        S14893=1;
    if(deHumOnZone1_7.getprestatus()){//sysj\ECS_plant.sysj line: 394, column: 24
      deHumOnZone1_7TriggerE.setPresent();//sysj\ECS_plant.sysj line: 394, column: 40
      currsigs.addElement(deHumOnZone1_7TriggerE);
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
    else {
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread24914(int [] tdone, int [] ends){
        S14885=1;
    if(humOnZone4_5_6.getprestatus()){//sysj\ECS_plant.sysj line: 392, column: 24
      humOnZone4_5_6TriggerE.setPresent();//sysj\ECS_plant.sysj line: 392, column: 40
      currsigs.addElement(humOnZone4_5_6TriggerE);
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
    else {
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
  }

  public void thread24913(int [] tdone, int [] ends){
        S14877=1;
    if(humOnZone2_3.getprestatus()){//sysj\ECS_plant.sysj line: 390, column: 24
      humOnZone2_3TriggerE.setPresent();//sysj\ECS_plant.sysj line: 390, column: 38
      currsigs.addElement(humOnZone2_3TriggerE);
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    else {
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
  }

  public void thread24912(int [] tdone, int [] ends){
        S14869=1;
    if(humOnZone1_7.getprestatus()){//sysj\ECS_plant.sysj line: 388, column: 24
      humOnZone1_7TriggerE.setPresent();//sysj\ECS_plant.sysj line: 388, column: 38
      currsigs.addElement(humOnZone1_7TriggerE);
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
    else {
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
  }

  public void thread24911(int [] tdone, int [] ends){
        S14861=1;
    if(heatOnZone4_5_6.getprestatus()){//sysj\ECS_plant.sysj line: 386, column: 24
      heatOnZone4_5_6TriggerE.setPresent();//sysj\ECS_plant.sysj line: 386, column: 41
      currsigs.addElement(heatOnZone4_5_6TriggerE);
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
    else {
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
  }

  public void thread24910(int [] tdone, int [] ends){
        S14853=1;
    if(heatOnZone2_3.getprestatus()){//sysj\ECS_plant.sysj line: 384, column: 24
      heatOnZone2_3TriggerE.setPresent();//sysj\ECS_plant.sysj line: 384, column: 39
      currsigs.addElement(heatOnZone2_3TriggerE);
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
    else {
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
  }

  public void thread24909(int [] tdone, int [] ends){
        S14845=1;
    if(airOnZone4_5_6.getprestatus()){//sysj\ECS_plant.sysj line: 382, column: 24
      airOnZone4_5_6TriggerE.setPresent();//sysj\ECS_plant.sysj line: 382, column: 40
      currsigs.addElement(airOnZone4_5_6TriggerE);
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
    else {
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread24908(int [] tdone, int [] ends){
        S14837=1;
    if(airOnZone2_3.getprestatus()){//sysj\ECS_plant.sysj line: 380, column: 24
      airOnZone2_3TriggerE.setPresent();//sysj\ECS_plant.sysj line: 380, column: 38
      currsigs.addElement(airOnZone2_3TriggerE);
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
    else {
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
  }

  public void thread24907(int [] tdone, int [] ends){
        S14829=1;
    if(heatOnZone1_7.getprestatus()){//sysj\ECS_plant.sysj line: 378, column: 24
      heatOnZone1_7TriggerE.setPresent();//sysj\ECS_plant.sysj line: 378, column: 39
      currsigs.addElement(heatOnZone1_7TriggerE);
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
    else {
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
  }

  public void thread24906(int [] tdone, int [] ends){
        S14821=1;
    if(fanOnZone1_7.getprestatus()){//sysj\ECS_plant.sysj line: 376, column: 24
      fanOnZone1_7TriggerE.setPresent();//sysj\ECS_plant.sysj line: 376, column: 38
      currsigs.addElement(fanOnZone1_7TriggerE);
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
    else {
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
  }

  public void thread24905(int [] tdone, int [] ends){
        S14813=1;
    if(cleanZone7.getprestatus()){//sysj\ECS_plant.sysj line: 374, column: 24
      cleanZone7TriggerE.setPresent();//sysj\ECS_plant.sysj line: 374, column: 36
      currsigs.addElement(cleanZone7TriggerE);
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
    else {
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
  }

  public void thread24904(int [] tdone, int [] ends){
        S14805=1;
    if(cleanZone6.getprestatus()){//sysj\ECS_plant.sysj line: 372, column: 24
      cleanZone6TriggerE.setPresent();//sysj\ECS_plant.sysj line: 372, column: 36
      currsigs.addElement(cleanZone6TriggerE);
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
    else {
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread24903(int [] tdone, int [] ends){
        S14797=1;
    if(cleanZone5.getprestatus()){//sysj\ECS_plant.sysj line: 370, column: 24
      cleanZone5TriggerE.setPresent();//sysj\ECS_plant.sysj line: 370, column: 36
      currsigs.addElement(cleanZone5TriggerE);
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
    else {
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread24902(int [] tdone, int [] ends){
        S14789=1;
    if(cleanZone4.getprestatus()){//sysj\ECS_plant.sysj line: 368, column: 24
      cleanZone4TriggerE.setPresent();//sysj\ECS_plant.sysj line: 368, column: 36
      currsigs.addElement(cleanZone4TriggerE);
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
    else {
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
  }

  public void thread24901(int [] tdone, int [] ends){
        S14781=1;
    if(cleanZone3.getprestatus()){//sysj\ECS_plant.sysj line: 366, column: 24
      cleanZone3TriggerE.setPresent();//sysj\ECS_plant.sysj line: 366, column: 36
      currsigs.addElement(cleanZone3TriggerE);
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
    else {
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
  }

  public void thread24900(int [] tdone, int [] ends){
        S14773=1;
    if(cleanZone2.getprestatus()){//sysj\ECS_plant.sysj line: 364, column: 24
      cleanZone2TriggerE.setPresent();//sysj\ECS_plant.sysj line: 364, column: 36
      currsigs.addElement(cleanZone2TriggerE);
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
    else {
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
  }

  public void thread24899(int [] tdone, int [] ends){
        S14765=1;
    if(cleanZone1.getprestatus()){//sysj\ECS_plant.sysj line: 362, column: 24
      cleanZone1TriggerE.setPresent();//sysj\ECS_plant.sysj line: 362, column: 36
      currsigs.addElement(cleanZone1TriggerE);
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
    else {
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread24898(int [] tdone, int [] ends){
        S14757=1;
    if(fireZone7.getprestatus()){//sysj\ECS_plant.sysj line: 360, column: 24
      alarmZone7TriggerE.setPresent();//sysj\ECS_plant.sysj line: 360, column: 35
      currsigs.addElement(alarmZone7TriggerE);
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

  public void thread24897(int [] tdone, int [] ends){
        S14749=1;
    if(fireZone6.getprestatus()){//sysj\ECS_plant.sysj line: 358, column: 24
      alarmZone6TriggerE.setPresent();//sysj\ECS_plant.sysj line: 358, column: 35
      currsigs.addElement(alarmZone6TriggerE);
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    else {
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread24896(int [] tdone, int [] ends){
        S14741=1;
    if(fireZone5.getprestatus()){//sysj\ECS_plant.sysj line: 356, column: 24
      alarmZone5TriggerE.setPresent();//sysj\ECS_plant.sysj line: 356, column: 35
      currsigs.addElement(alarmZone5TriggerE);
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

  public void thread24895(int [] tdone, int [] ends){
        S14733=1;
    if(fireZone4.getprestatus()){//sysj\ECS_plant.sysj line: 354, column: 24
      alarmZone4TriggerE.setPresent();//sysj\ECS_plant.sysj line: 354, column: 35
      currsigs.addElement(alarmZone4TriggerE);
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

  public void thread24894(int [] tdone, int [] ends){
        S14725=1;
    if(fireZone3.getprestatus()){//sysj\ECS_plant.sysj line: 352, column: 24
      alarmZone3TriggerE.setPresent();//sysj\ECS_plant.sysj line: 352, column: 35
      currsigs.addElement(alarmZone3TriggerE);
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

  public void thread24893(int [] tdone, int [] ends){
        S14717=1;
    if(fireZone2.getprestatus()){//sysj\ECS_plant.sysj line: 350, column: 24
      alarmZone2TriggerE.setPresent();//sysj\ECS_plant.sysj line: 350, column: 35
      currsigs.addElement(alarmZone2TriggerE);
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

  public void thread24892(int [] tdone, int [] ends){
        S14709=1;
    if(fireZone1.getprestatus()){//sysj\ECS_plant.sysj line: 348, column: 24
      alarmZone1TriggerE.setPresent();//sysj\ECS_plant.sysj line: 348, column: 35
      currsigs.addElement(alarmZone1TriggerE);
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

  public void thread24891(int [] tdone, int [] ends){
        S14967=1;
    thread24892(tdone,ends);
    thread24893(tdone,ends);
    thread24894(tdone,ends);
    thread24895(tdone,ends);
    thread24896(tdone,ends);
    thread24897(tdone,ends);
    thread24898(tdone,ends);
    thread24899(tdone,ends);
    thread24900(tdone,ends);
    thread24901(tdone,ends);
    thread24902(tdone,ends);
    thread24903(tdone,ends);
    thread24904(tdone,ends);
    thread24905(tdone,ends);
    thread24906(tdone,ends);
    thread24907(tdone,ends);
    thread24908(tdone,ends);
    thread24909(tdone,ends);
    thread24910(tdone,ends);
    thread24911(tdone,ends);
    thread24912(tdone,ends);
    thread24913(tdone,ends);
    thread24914(tdone,ends);
    thread24915(tdone,ends);
    thread24916(tdone,ends);
    thread24917(tdone,ends);
    thread24918(tdone,ends);
    thread24919(tdone,ends);
    thread24920(tdone,ends);
    thread24921(tdone,ends);
    thread24922(tdone,ends);
    thread24923(tdone,ends);
    thread24924(tdone,ends);
    int biggest24925 = 0;
    if(ends[4]>=biggest24925){
      biggest24925=ends[4];
    }
    if(ends[5]>=biggest24925){
      biggest24925=ends[5];
    }
    if(ends[6]>=biggest24925){
      biggest24925=ends[6];
    }
    if(ends[7]>=biggest24925){
      biggest24925=ends[7];
    }
    if(ends[8]>=biggest24925){
      biggest24925=ends[8];
    }
    if(ends[9]>=biggest24925){
      biggest24925=ends[9];
    }
    if(ends[10]>=biggest24925){
      biggest24925=ends[10];
    }
    if(ends[11]>=biggest24925){
      biggest24925=ends[11];
    }
    if(ends[12]>=biggest24925){
      biggest24925=ends[12];
    }
    if(ends[13]>=biggest24925){
      biggest24925=ends[13];
    }
    if(ends[14]>=biggest24925){
      biggest24925=ends[14];
    }
    if(ends[15]>=biggest24925){
      biggest24925=ends[15];
    }
    if(ends[16]>=biggest24925){
      biggest24925=ends[16];
    }
    if(ends[17]>=biggest24925){
      biggest24925=ends[17];
    }
    if(ends[18]>=biggest24925){
      biggest24925=ends[18];
    }
    if(ends[19]>=biggest24925){
      biggest24925=ends[19];
    }
    if(ends[20]>=biggest24925){
      biggest24925=ends[20];
    }
    if(ends[21]>=biggest24925){
      biggest24925=ends[21];
    }
    if(ends[22]>=biggest24925){
      biggest24925=ends[22];
    }
    if(ends[23]>=biggest24925){
      biggest24925=ends[23];
    }
    if(ends[24]>=biggest24925){
      biggest24925=ends[24];
    }
    if(ends[25]>=biggest24925){
      biggest24925=ends[25];
    }
    if(ends[26]>=biggest24925){
      biggest24925=ends[26];
    }
    if(ends[27]>=biggest24925){
      biggest24925=ends[27];
    }
    if(ends[28]>=biggest24925){
      biggest24925=ends[28];
    }
    if(ends[29]>=biggest24925){
      biggest24925=ends[29];
    }
    if(ends[30]>=biggest24925){
      biggest24925=ends[30];
    }
    if(ends[31]>=biggest24925){
      biggest24925=ends[31];
    }
    if(ends[32]>=biggest24925){
      biggest24925=ends[32];
    }
    if(ends[33]>=biggest24925){
      biggest24925=ends[33];
    }
    if(ends[34]>=biggest24925){
      biggest24925=ends[34];
    }
    if(ends[35]>=biggest24925){
      biggest24925=ends[35];
    }
    if(ends[36]>=biggest24925){
      biggest24925=ends[36];
    }
    if(biggest24925 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread24890(int [] tdone, int [] ends){
        S14701=1;
    System.out.println("ECS PLANT STARTED AWAITING RUN BUTTON");//sysj\ECS_plant.sysj line: 38, column: 4
    S5051=0;
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S24888){
        case 0 : 
          S24888=0;
          break RUN;
        
        case 1 : 
          S24888=2;
          S24888=2;
          new Thread(new ECS_GUI()).start();//sysj\ECS_plant.sysj line: 32, column: 2
          thread24890(tdone,ends);
          thread24891(tdone,ends);
          int biggest24926 = 0;
          if(ends[2]>=biggest24926){
            biggest24926=ends[2];
          }
          if(ends[3]>=biggest24926){
            biggest24926=ends[3];
          }
          if(biggest24926 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread24927(tdone,ends);
          thread24928(tdone,ends);
          int biggest24963 = 0;
          if(ends[2]>=biggest24963){
            biggest24963=ends[2];
          }
          if(ends[3]>=biggest24963){
            biggest24963=ends[3];
          }
          if(biggest24963 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest24963 == 0){
            S24888=0;
            active[1]=0;
            ends[1]=0;
            S24888=0;
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
          tempZone1_7.gethook();
          tempZone2_3.gethook();
          tempZone4_5_6.gethook();
          humidZone1_7.gethook();
          humidZone2_3.gethook();
          humidZone4_5_6.gethook();
          lightInt.gethook();
          selectedZone.gethook();
          time.gethook();
          humanZ1.gethook();
          humanZ2.gethook();
          humanZ3.gethook();
          humanZ4.gethook();
          humanZ5.gethook();
          humanZ6.gethook();
          humanZ7.gethook();
          dust.gethook();
          fire.gethook();
          powerOff.gethook();
          roomCleaned.gethook();
          alarmOff.gethook();
          safeOpTemp.gethook();
          safeOpHumid.gethook();
          run.gethook();
          df = true;
        }
        runClockDomain();
      }
      tempZone1_7.setpreclear();
      tempZone2_3.setpreclear();
      tempZone4_5_6.setpreclear();
      humidZone1_7.setpreclear();
      humidZone2_3.setpreclear();
      humidZone4_5_6.setpreclear();
      lightInt.setpreclear();
      selectedZone.setpreclear();
      time.setpreclear();
      humanZ1.setpreclear();
      humanZ2.setpreclear();
      humanZ3.setpreclear();
      humanZ4.setpreclear();
      humanZ5.setpreclear();
      humanZ6.setpreclear();
      humanZ7.setpreclear();
      dust.setpreclear();
      fire.setpreclear();
      powerOff.setpreclear();
      roomCleaned.setpreclear();
      alarmOff.setpreclear();
      safeOpTemp.setpreclear();
      safeOpHumid.setpreclear();
      run.setpreclear();
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
      blindsDownZone1_7.setpreclear();
      blindsDownZone2_3.setpreclear();
      blindsDownZone4_5_6.setpreclear();
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
      alarmZone1TriggerE.setpreclear();
      alarmZone2TriggerE.setpreclear();
      alarmZone3TriggerE.setpreclear();
      alarmZone4TriggerE.setpreclear();
      alarmZone5TriggerE.setpreclear();
      alarmZone6TriggerE.setpreclear();
      alarmZone7TriggerE.setpreclear();
      cleanZone1TriggerE.setpreclear();
      cleanZone2TriggerE.setpreclear();
      cleanZone3TriggerE.setpreclear();
      cleanZone4TriggerE.setpreclear();
      cleanZone5TriggerE.setpreclear();
      cleanZone6TriggerE.setpreclear();
      cleanZone7TriggerE.setpreclear();
      fanOnZone1_7TriggerE.setpreclear();
      heatOnZone1_7TriggerE.setpreclear();
      airOnZone2_3TriggerE.setpreclear();
      airOnZone4_5_6TriggerE.setpreclear();
      heatOnZone2_3TriggerE.setpreclear();
      heatOnZone4_5_6TriggerE.setpreclear();
      humOnZone1_7TriggerE.setpreclear();
      humOnZone2_3TriggerE.setpreclear();
      humOnZone4_5_6TriggerE.setpreclear();
      deHumOnZone1_7TriggerE.setpreclear();
      deHumOnZone2_3TriggerE.setpreclear();
      deHumOnZone4_5_6TriggerE.setpreclear();
      cutPowZ1_TriggerE.setpreclear();
      cutPowZ2_TriggerE.setpreclear();
      cutPowZ3_TriggerE.setpreclear();
      cutPowZ4_TriggerE.setpreclear();
      cutPowZ5_TriggerE.setpreclear();
      cutPowZ6_TriggerE.setpreclear();
      cutPowZ7_TriggerE.setpreclear();
      lightIntZ1Trigger.setpreclear();
      lightIntZ2Trigger.setpreclear();
      lightIntZ3Trigger.setpreclear();
      lightIntZ4Trigger.setpreclear();
      lightIntZ5Trigger.setpreclear();
      lightIntZ6Trigger.setpreclear();
      lightIntZ7Trigger.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = tempZone1_7.getStatus() ? tempZone1_7.setprepresent() : tempZone1_7.setpreclear();
      tempZone1_7.setpreval(tempZone1_7.getValue());
      tempZone1_7.setClear();
      dummyint = tempZone2_3.getStatus() ? tempZone2_3.setprepresent() : tempZone2_3.setpreclear();
      tempZone2_3.setpreval(tempZone2_3.getValue());
      tempZone2_3.setClear();
      dummyint = tempZone4_5_6.getStatus() ? tempZone4_5_6.setprepresent() : tempZone4_5_6.setpreclear();
      tempZone4_5_6.setpreval(tempZone4_5_6.getValue());
      tempZone4_5_6.setClear();
      dummyint = humidZone1_7.getStatus() ? humidZone1_7.setprepresent() : humidZone1_7.setpreclear();
      humidZone1_7.setpreval(humidZone1_7.getValue());
      humidZone1_7.setClear();
      dummyint = humidZone2_3.getStatus() ? humidZone2_3.setprepresent() : humidZone2_3.setpreclear();
      humidZone2_3.setpreval(humidZone2_3.getValue());
      humidZone2_3.setClear();
      dummyint = humidZone4_5_6.getStatus() ? humidZone4_5_6.setprepresent() : humidZone4_5_6.setpreclear();
      humidZone4_5_6.setpreval(humidZone4_5_6.getValue());
      humidZone4_5_6.setClear();
      dummyint = lightInt.getStatus() ? lightInt.setprepresent() : lightInt.setpreclear();
      lightInt.setpreval(lightInt.getValue());
      lightInt.setClear();
      dummyint = selectedZone.getStatus() ? selectedZone.setprepresent() : selectedZone.setpreclear();
      selectedZone.setpreval(selectedZone.getValue());
      selectedZone.setClear();
      dummyint = time.getStatus() ? time.setprepresent() : time.setpreclear();
      time.setpreval(time.getValue());
      time.setClear();
      dummyint = humanZ1.getStatus() ? humanZ1.setprepresent() : humanZ1.setpreclear();
      humanZ1.setpreval(humanZ1.getValue());
      humanZ1.setClear();
      dummyint = humanZ2.getStatus() ? humanZ2.setprepresent() : humanZ2.setpreclear();
      humanZ2.setpreval(humanZ2.getValue());
      humanZ2.setClear();
      dummyint = humanZ3.getStatus() ? humanZ3.setprepresent() : humanZ3.setpreclear();
      humanZ3.setpreval(humanZ3.getValue());
      humanZ3.setClear();
      dummyint = humanZ4.getStatus() ? humanZ4.setprepresent() : humanZ4.setpreclear();
      humanZ4.setpreval(humanZ4.getValue());
      humanZ4.setClear();
      dummyint = humanZ5.getStatus() ? humanZ5.setprepresent() : humanZ5.setpreclear();
      humanZ5.setpreval(humanZ5.getValue());
      humanZ5.setClear();
      dummyint = humanZ6.getStatus() ? humanZ6.setprepresent() : humanZ6.setpreclear();
      humanZ6.setpreval(humanZ6.getValue());
      humanZ6.setClear();
      dummyint = humanZ7.getStatus() ? humanZ7.setprepresent() : humanZ7.setpreclear();
      humanZ7.setpreval(humanZ7.getValue());
      humanZ7.setClear();
      dummyint = dust.getStatus() ? dust.setprepresent() : dust.setpreclear();
      dust.setpreval(dust.getValue());
      dust.setClear();
      dummyint = fire.getStatus() ? fire.setprepresent() : fire.setpreclear();
      fire.setpreval(fire.getValue());
      fire.setClear();
      dummyint = powerOff.getStatus() ? powerOff.setprepresent() : powerOff.setpreclear();
      powerOff.setpreval(powerOff.getValue());
      powerOff.setClear();
      dummyint = roomCleaned.getStatus() ? roomCleaned.setprepresent() : roomCleaned.setpreclear();
      roomCleaned.setpreval(roomCleaned.getValue());
      roomCleaned.setClear();
      dummyint = alarmOff.getStatus() ? alarmOff.setprepresent() : alarmOff.setpreclear();
      alarmOff.setpreval(alarmOff.getValue());
      alarmOff.setClear();
      dummyint = safeOpTemp.getStatus() ? safeOpTemp.setprepresent() : safeOpTemp.setpreclear();
      safeOpTemp.setpreval(safeOpTemp.getValue());
      safeOpTemp.setClear();
      dummyint = safeOpHumid.getStatus() ? safeOpHumid.setprepresent() : safeOpHumid.setpreclear();
      safeOpHumid.setpreval(safeOpHumid.getValue());
      safeOpHumid.setClear();
      dummyint = run.getStatus() ? run.setprepresent() : run.setpreclear();
      run.setpreval(run.getValue());
      run.setClear();
      fireZone1.sethook();
      fireZone1.setClear();
      fireZone2.sethook();
      fireZone2.setClear();
      fireZone3.sethook();
      fireZone3.setClear();
      fireZone4.sethook();
      fireZone4.setClear();
      fireZone5.sethook();
      fireZone5.setClear();
      fireZone6.sethook();
      fireZone6.setClear();
      fireZone7.sethook();
      fireZone7.setClear();
      cleanZone1.sethook();
      cleanZone1.setClear();
      cleanZone2.sethook();
      cleanZone2.setClear();
      cleanZone3.sethook();
      cleanZone3.setClear();
      cleanZone4.sethook();
      cleanZone4.setClear();
      cleanZone5.sethook();
      cleanZone5.setClear();
      cleanZone6.sethook();
      cleanZone6.setClear();
      cleanZone7.sethook();
      cleanZone7.setClear();
      fanOnZone1_7.sethook();
      fanOnZone1_7.setClear();
      heatOnZone1_7.sethook();
      heatOnZone1_7.setClear();
      airOnZone2_3.sethook();
      airOnZone2_3.setClear();
      airOnZone4_5_6.sethook();
      airOnZone4_5_6.setClear();
      heatOnZone2_3.sethook();
      heatOnZone2_3.setClear();
      heatOnZone4_5_6.sethook();
      heatOnZone4_5_6.setClear();
      blindsDownZone1_7.sethook();
      blindsDownZone1_7.setClear();
      blindsDownZone2_3.sethook();
      blindsDownZone2_3.setClear();
      blindsDownZone4_5_6.sethook();
      blindsDownZone4_5_6.setClear();
      humOnZone1_7.sethook();
      humOnZone1_7.setClear();
      humOnZone2_3.sethook();
      humOnZone2_3.setClear();
      humOnZone4_5_6.sethook();
      humOnZone4_5_6.setClear();
      deHumOnZone1_7.sethook();
      deHumOnZone1_7.setClear();
      deHumOnZone2_3.sethook();
      deHumOnZone2_3.setClear();
      deHumOnZone4_5_6.sethook();
      deHumOnZone4_5_6.setClear();
      cutPowZ1.sethook();
      cutPowZ1.setClear();
      cutPowZ2.sethook();
      cutPowZ2.setClear();
      cutPowZ3.sethook();
      cutPowZ3.setClear();
      cutPowZ4.sethook();
      cutPowZ4.setClear();
      cutPowZ5.sethook();
      cutPowZ5.setClear();
      cutPowZ6.sethook();
      cutPowZ6.setClear();
      cutPowZ7.sethook();
      cutPowZ7.setClear();
      powZ1.sethook();
      powZ1.setClear();
      powZ2.sethook();
      powZ2.setClear();
      powZ3.sethook();
      powZ3.setClear();
      powZ4.sethook();
      powZ4.setClear();
      powZ5.sethook();
      powZ5.setClear();
      powZ6.sethook();
      powZ6.setClear();
      powZ7.sethook();
      powZ7.setClear();
      alarmZone1TriggerE.sethook();
      alarmZone1TriggerE.setClear();
      alarmZone2TriggerE.sethook();
      alarmZone2TriggerE.setClear();
      alarmZone3TriggerE.sethook();
      alarmZone3TriggerE.setClear();
      alarmZone4TriggerE.sethook();
      alarmZone4TriggerE.setClear();
      alarmZone5TriggerE.sethook();
      alarmZone5TriggerE.setClear();
      alarmZone6TriggerE.sethook();
      alarmZone6TriggerE.setClear();
      alarmZone7TriggerE.sethook();
      alarmZone7TriggerE.setClear();
      cleanZone1TriggerE.sethook();
      cleanZone1TriggerE.setClear();
      cleanZone2TriggerE.sethook();
      cleanZone2TriggerE.setClear();
      cleanZone3TriggerE.sethook();
      cleanZone3TriggerE.setClear();
      cleanZone4TriggerE.sethook();
      cleanZone4TriggerE.setClear();
      cleanZone5TriggerE.sethook();
      cleanZone5TriggerE.setClear();
      cleanZone6TriggerE.sethook();
      cleanZone6TriggerE.setClear();
      cleanZone7TriggerE.sethook();
      cleanZone7TriggerE.setClear();
      fanOnZone1_7TriggerE.sethook();
      fanOnZone1_7TriggerE.setClear();
      heatOnZone1_7TriggerE.sethook();
      heatOnZone1_7TriggerE.setClear();
      airOnZone2_3TriggerE.sethook();
      airOnZone2_3TriggerE.setClear();
      airOnZone4_5_6TriggerE.sethook();
      airOnZone4_5_6TriggerE.setClear();
      heatOnZone2_3TriggerE.sethook();
      heatOnZone2_3TriggerE.setClear();
      heatOnZone4_5_6TriggerE.sethook();
      heatOnZone4_5_6TriggerE.setClear();
      humOnZone1_7TriggerE.sethook();
      humOnZone1_7TriggerE.setClear();
      humOnZone2_3TriggerE.sethook();
      humOnZone2_3TriggerE.setClear();
      humOnZone4_5_6TriggerE.sethook();
      humOnZone4_5_6TriggerE.setClear();
      deHumOnZone1_7TriggerE.sethook();
      deHumOnZone1_7TriggerE.setClear();
      deHumOnZone2_3TriggerE.sethook();
      deHumOnZone2_3TriggerE.setClear();
      deHumOnZone4_5_6TriggerE.sethook();
      deHumOnZone4_5_6TriggerE.setClear();
      cutPowZ1_TriggerE.sethook();
      cutPowZ1_TriggerE.setClear();
      cutPowZ2_TriggerE.sethook();
      cutPowZ2_TriggerE.setClear();
      cutPowZ3_TriggerE.sethook();
      cutPowZ3_TriggerE.setClear();
      cutPowZ4_TriggerE.sethook();
      cutPowZ4_TriggerE.setClear();
      cutPowZ5_TriggerE.sethook();
      cutPowZ5_TriggerE.setClear();
      cutPowZ6_TriggerE.sethook();
      cutPowZ6_TriggerE.setClear();
      cutPowZ7_TriggerE.sethook();
      cutPowZ7_TriggerE.setClear();
      lightIntZ1Trigger.sethook();
      lightIntZ1Trigger.setClear();
      lightIntZ2Trigger.sethook();
      lightIntZ2Trigger.setClear();
      lightIntZ3Trigger.sethook();
      lightIntZ3Trigger.setClear();
      lightIntZ4Trigger.sethook();
      lightIntZ4Trigger.setClear();
      lightIntZ5Trigger.sethook();
      lightIntZ5Trigger.setClear();
      lightIntZ6Trigger.sethook();
      lightIntZ6Trigger.setClear();
      lightIntZ7Trigger.sethook();
      lightIntZ7Trigger.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        tempZone1_7.gethook();
        tempZone2_3.gethook();
        tempZone4_5_6.gethook();
        humidZone1_7.gethook();
        humidZone2_3.gethook();
        humidZone4_5_6.gethook();
        lightInt.gethook();
        selectedZone.gethook();
        time.gethook();
        humanZ1.gethook();
        humanZ2.gethook();
        humanZ3.gethook();
        humanZ4.gethook();
        humanZ5.gethook();
        humanZ6.gethook();
        humanZ7.gethook();
        dust.gethook();
        fire.gethook();
        powerOff.gethook();
        roomCleaned.gethook();
        alarmOff.gethook();
        safeOpTemp.gethook();
        safeOpHumid.gethook();
        run.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
