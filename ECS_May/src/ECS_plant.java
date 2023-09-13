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
  public Signal lightIntZ1 = new Signal("lightIntZ1", Signal.INPUT);
  public Signal lightIntZ2 = new Signal("lightIntZ2", Signal.INPUT);
  public Signal lightIntZ3 = new Signal("lightIntZ3", Signal.INPUT);
  public Signal lightIntZ4 = new Signal("lightIntZ4", Signal.INPUT);
  public Signal lightIntZ5 = new Signal("lightIntZ5", Signal.INPUT);
  public Signal lightIntZ6 = new Signal("lightIntZ6", Signal.INPUT);
  public Signal lightIntZ7 = new Signal("lightIntZ7", Signal.INPUT);
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
  private Integer zone_thread_2;//sysj\ECS_plant.sysj line: 40, column: 4
  private String clock_thread_2;//sysj\ECS_plant.sysj line: 44, column: 4
  private Integer temp17_thread_2;//sysj\ECS_plant.sysj line: 183, column: 5
  private Integer temp23_thread_2;//sysj\ECS_plant.sysj line: 206, column: 5
  private Integer temp456_thread_2;//sysj\ECS_plant.sysj line: 229, column: 5
  private Integer humid17_thread_2;//sysj\ECS_plant.sysj line: 254, column: 5
  private Integer humid23_thread_2;//sysj\ECS_plant.sysj line: 280, column: 5
  private Integer humid456_thread_2;//sysj\ECS_plant.sysj line: 306, column: 5
  private int S19805 = 1;
  private int S9733 = 1;
  private int S85 = 1;
  private int S135 = 1;
  private int S90 = 1;
  private int S103 = 1;
  private int S140 = 1;
  private int S176 = 1;
  private int S212 = 1;
  private int S248 = 1;
  private int S284 = 1;
  private int S564 = 1;
  private int S669 = 1;
  private int S668 = 1;
  private int S729 = 1;
  private int S829 = 1;
  private int S1009 = 1;
  private int S1349 = 1;
  private int S2009 = 1;
  private int S9943 = 1;
  private int S9741 = 1;
  private int S9749 = 1;
  private int S9757 = 1;
  private int S9765 = 1;
  private int S9773 = 1;
  private int S9781 = 1;
  private int S9789 = 1;
  private int S9797 = 1;
  private int S9805 = 1;
  private int S9813 = 1;
  private int S9821 = 1;
  private int S9829 = 1;
  private int S9837 = 1;
  private int S9845 = 1;
  private int S9853 = 1;
  private int S9861 = 1;
  private int S9869 = 1;
  private int S9877 = 1;
  private int S9885 = 1;
  private int S9893 = 1;
  private int S9901 = 1;
  private int S9909 = 1;
  private int S9917 = 1;
  private int S9925 = 1;
  private int S9933 = 1;
  private int S9941 = 1;
  
  private int[] ends = new int[30];
  private int[] tdone = new int[30];
  
  public void thread19864(int [] tdone, int [] ends){
        switch(S9941){
      case 0 : 
        active[29]=0;
        ends[29]=0;
        tdone[29]=1;
        break;
      
      case 1 : 
        if(deHumOnZone4_5_6.getprestatus()){//sysj\ECS_plant.sysj line: 387, column: 24
          deHumOnZone4_5_6TriggerE.setPresent();//sysj\ECS_plant.sysj line: 387, column: 42
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

  public void thread19863(int [] tdone, int [] ends){
        switch(S9933){
      case 0 : 
        active[28]=0;
        ends[28]=0;
        tdone[28]=1;
        break;
      
      case 1 : 
        if(deHumOnZone2_3.getprestatus()){//sysj\ECS_plant.sysj line: 385, column: 24
          deHumOnZone2_3TriggerE.setPresent();//sysj\ECS_plant.sysj line: 385, column: 40
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

  public void thread19862(int [] tdone, int [] ends){
        switch(S9925){
      case 0 : 
        active[27]=0;
        ends[27]=0;
        tdone[27]=1;
        break;
      
      case 1 : 
        if(deHumOnZone1_7.getprestatus()){//sysj\ECS_plant.sysj line: 383, column: 24
          deHumOnZone1_7TriggerE.setPresent();//sysj\ECS_plant.sysj line: 383, column: 40
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

  public void thread19861(int [] tdone, int [] ends){
        switch(S9917){
      case 0 : 
        active[26]=0;
        ends[26]=0;
        tdone[26]=1;
        break;
      
      case 1 : 
        if(humOnZone4_5_6.getprestatus()){//sysj\ECS_plant.sysj line: 381, column: 24
          humOnZone4_5_6TriggerE.setPresent();//sysj\ECS_plant.sysj line: 381, column: 40
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

  public void thread19860(int [] tdone, int [] ends){
        switch(S9909){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        if(humOnZone2_3.getprestatus()){//sysj\ECS_plant.sysj line: 379, column: 24
          humOnZone2_3TriggerE.setPresent();//sysj\ECS_plant.sysj line: 379, column: 38
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

  public void thread19859(int [] tdone, int [] ends){
        switch(S9901){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        if(humOnZone1_7.getprestatus()){//sysj\ECS_plant.sysj line: 377, column: 24
          humOnZone1_7TriggerE.setPresent();//sysj\ECS_plant.sysj line: 377, column: 38
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

  public void thread19858(int [] tdone, int [] ends){
        switch(S9893){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        if(heatOnZone4_5_6.getprestatus()){//sysj\ECS_plant.sysj line: 375, column: 24
          heatOnZone4_5_6TriggerE.setPresent();//sysj\ECS_plant.sysj line: 375, column: 41
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

  public void thread19857(int [] tdone, int [] ends){
        switch(S9885){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        if(heatOnZone2_3.getprestatus()){//sysj\ECS_plant.sysj line: 373, column: 24
          heatOnZone2_3TriggerE.setPresent();//sysj\ECS_plant.sysj line: 373, column: 39
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

  public void thread19856(int [] tdone, int [] ends){
        switch(S9877){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        if(airOnZone4_5_6.getprestatus()){//sysj\ECS_plant.sysj line: 371, column: 24
          airOnZone4_5_6TriggerE.setPresent();//sysj\ECS_plant.sysj line: 371, column: 40
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

  public void thread19855(int [] tdone, int [] ends){
        switch(S9869){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        if(airOnZone2_3.getprestatus()){//sysj\ECS_plant.sysj line: 369, column: 24
          airOnZone2_3TriggerE.setPresent();//sysj\ECS_plant.sysj line: 369, column: 38
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

  public void thread19854(int [] tdone, int [] ends){
        switch(S9861){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        if(heatOnZone1_7.getprestatus()){//sysj\ECS_plant.sysj line: 367, column: 24
          heatOnZone1_7TriggerE.setPresent();//sysj\ECS_plant.sysj line: 367, column: 39
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

  public void thread19853(int [] tdone, int [] ends){
        switch(S9853){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        if(fanOnZone1_7.getprestatus()){//sysj\ECS_plant.sysj line: 365, column: 24
          fanOnZone1_7TriggerE.setPresent();//sysj\ECS_plant.sysj line: 365, column: 38
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

  public void thread19852(int [] tdone, int [] ends){
        switch(S9845){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        if(cleanZone7.getprestatus()){//sysj\ECS_plant.sysj line: 363, column: 24
          cleanZone7TriggerE.setPresent();//sysj\ECS_plant.sysj line: 363, column: 36
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

  public void thread19851(int [] tdone, int [] ends){
        switch(S9837){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        if(cleanZone6.getprestatus()){//sysj\ECS_plant.sysj line: 361, column: 24
          cleanZone6TriggerE.setPresent();//sysj\ECS_plant.sysj line: 361, column: 36
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

  public void thread19850(int [] tdone, int [] ends){
        switch(S9829){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(cleanZone5.getprestatus()){//sysj\ECS_plant.sysj line: 359, column: 24
          cleanZone5TriggerE.setPresent();//sysj\ECS_plant.sysj line: 359, column: 36
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

  public void thread19849(int [] tdone, int [] ends){
        switch(S9821){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(cleanZone4.getprestatus()){//sysj\ECS_plant.sysj line: 357, column: 24
          cleanZone4TriggerE.setPresent();//sysj\ECS_plant.sysj line: 357, column: 36
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

  public void thread19848(int [] tdone, int [] ends){
        switch(S9813){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(cleanZone3.getprestatus()){//sysj\ECS_plant.sysj line: 355, column: 24
          cleanZone3TriggerE.setPresent();//sysj\ECS_plant.sysj line: 355, column: 36
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

  public void thread19847(int [] tdone, int [] ends){
        switch(S9805){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(cleanZone2.getprestatus()){//sysj\ECS_plant.sysj line: 353, column: 24
          cleanZone2TriggerE.setPresent();//sysj\ECS_plant.sysj line: 353, column: 36
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

  public void thread19846(int [] tdone, int [] ends){
        switch(S9797){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(cleanZone1.getprestatus()){//sysj\ECS_plant.sysj line: 351, column: 24
          cleanZone1TriggerE.setPresent();//sysj\ECS_plant.sysj line: 351, column: 36
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

  public void thread19845(int [] tdone, int [] ends){
        switch(S9789){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(fireZone7.getprestatus()){//sysj\ECS_plant.sysj line: 349, column: 24
          alarmZone7TriggerE.setPresent();//sysj\ECS_plant.sysj line: 349, column: 35
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

  public void thread19844(int [] tdone, int [] ends){
        switch(S9781){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(fireZone6.getprestatus()){//sysj\ECS_plant.sysj line: 347, column: 24
          alarmZone6TriggerE.setPresent();//sysj\ECS_plant.sysj line: 347, column: 35
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

  public void thread19843(int [] tdone, int [] ends){
        switch(S9773){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(fireZone5.getprestatus()){//sysj\ECS_plant.sysj line: 345, column: 24
          alarmZone5TriggerE.setPresent();//sysj\ECS_plant.sysj line: 345, column: 35
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

  public void thread19842(int [] tdone, int [] ends){
        switch(S9765){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(fireZone4.getprestatus()){//sysj\ECS_plant.sysj line: 343, column: 24
          alarmZone4TriggerE.setPresent();//sysj\ECS_plant.sysj line: 343, column: 35
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

  public void thread19841(int [] tdone, int [] ends){
        switch(S9757){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(fireZone3.getprestatus()){//sysj\ECS_plant.sysj line: 341, column: 24
          alarmZone3TriggerE.setPresent();//sysj\ECS_plant.sysj line: 341, column: 35
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

  public void thread19840(int [] tdone, int [] ends){
        switch(S9749){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(fireZone2.getprestatus()){//sysj\ECS_plant.sysj line: 339, column: 24
          alarmZone2TriggerE.setPresent();//sysj\ECS_plant.sysj line: 339, column: 35
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

  public void thread19839(int [] tdone, int [] ends){
        switch(S9741){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        if(fireZone1.getprestatus()){//sysj\ECS_plant.sysj line: 337, column: 24
          alarmZone1TriggerE.setPresent();//sysj\ECS_plant.sysj line: 337, column: 35
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

  public void thread19838(int [] tdone, int [] ends){
        switch(S9943){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        thread19839(tdone,ends);
        thread19840(tdone,ends);
        thread19841(tdone,ends);
        thread19842(tdone,ends);
        thread19843(tdone,ends);
        thread19844(tdone,ends);
        thread19845(tdone,ends);
        thread19846(tdone,ends);
        thread19847(tdone,ends);
        thread19848(tdone,ends);
        thread19849(tdone,ends);
        thread19850(tdone,ends);
        thread19851(tdone,ends);
        thread19852(tdone,ends);
        thread19853(tdone,ends);
        thread19854(tdone,ends);
        thread19855(tdone,ends);
        thread19856(tdone,ends);
        thread19857(tdone,ends);
        thread19858(tdone,ends);
        thread19859(tdone,ends);
        thread19860(tdone,ends);
        thread19861(tdone,ends);
        thread19862(tdone,ends);
        thread19863(tdone,ends);
        thread19864(tdone,ends);
        int biggest19865 = 0;
        if(ends[4]>=biggest19865){
          biggest19865=ends[4];
        }
        if(ends[5]>=biggest19865){
          biggest19865=ends[5];
        }
        if(ends[6]>=biggest19865){
          biggest19865=ends[6];
        }
        if(ends[7]>=biggest19865){
          biggest19865=ends[7];
        }
        if(ends[8]>=biggest19865){
          biggest19865=ends[8];
        }
        if(ends[9]>=biggest19865){
          biggest19865=ends[9];
        }
        if(ends[10]>=biggest19865){
          biggest19865=ends[10];
        }
        if(ends[11]>=biggest19865){
          biggest19865=ends[11];
        }
        if(ends[12]>=biggest19865){
          biggest19865=ends[12];
        }
        if(ends[13]>=biggest19865){
          biggest19865=ends[13];
        }
        if(ends[14]>=biggest19865){
          biggest19865=ends[14];
        }
        if(ends[15]>=biggest19865){
          biggest19865=ends[15];
        }
        if(ends[16]>=biggest19865){
          biggest19865=ends[16];
        }
        if(ends[17]>=biggest19865){
          biggest19865=ends[17];
        }
        if(ends[18]>=biggest19865){
          biggest19865=ends[18];
        }
        if(ends[19]>=biggest19865){
          biggest19865=ends[19];
        }
        if(ends[20]>=biggest19865){
          biggest19865=ends[20];
        }
        if(ends[21]>=biggest19865){
          biggest19865=ends[21];
        }
        if(ends[22]>=biggest19865){
          biggest19865=ends[22];
        }
        if(ends[23]>=biggest19865){
          biggest19865=ends[23];
        }
        if(ends[24]>=biggest19865){
          biggest19865=ends[24];
        }
        if(ends[25]>=biggest19865){
          biggest19865=ends[25];
        }
        if(ends[26]>=biggest19865){
          biggest19865=ends[26];
        }
        if(ends[27]>=biggest19865){
          biggest19865=ends[27];
        }
        if(ends[28]>=biggest19865){
          biggest19865=ends[28];
        }
        if(ends[29]>=biggest19865){
          biggest19865=ends[29];
        }
        if(biggest19865 == 1){
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        //FINXME code
        if(biggest19865 == 0){
          S9943=0;
          active[3]=0;
          ends[3]=0;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread19837(int [] tdone, int [] ends){
        switch(S9733){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S85){
          case 0 : 
            if(run.getprestatus()){//sysj\ECS_plant.sysj line: 37, column: 10
              zone_thread_2 = 0;//sysj\ECS_plant.sysj line: 40, column: 4
              zone_thread_2 = (selectedZone.getpreval() == null ? null : ((Integer)selectedZone.getpreval()));//sysj\ECS_plant.sysj line: 41, column: 4
              clock_thread_2 = "";//sysj\ECS_plant.sysj line: 44, column: 4
              clock_thread_2 = (time.getpreval() == null ? null : ((String)time.getpreval()));//sysj\ECS_plant.sysj line: 45, column: 4
              S85=1;
              S135=0;
              if(zone_thread_2 == 1){//sysj\ECS_plant.sysj line: 50, column: 8
                S90=0;
                cutPowZ1.setPresent();//sysj\ECS_plant.sysj line: 52, column: 7
                currsigs.addElement(cutPowZ1);
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                S135=1;
                if(zone_thread_2 == 2){//sysj\ECS_plant.sysj line: 63, column: 8
                  S103=0;
                  cutPowZ2.setPresent();//sysj\ECS_plant.sysj line: 65, column: 7
                  currsigs.addElement(cutPowZ2);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S135=2;
                  if(zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 74, column: 8
                    S140=0;
                    cutPowZ3.setPresent();//sysj\ECS_plant.sysj line: 76, column: 7
                    currsigs.addElement(cutPowZ3);
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S135=3;
                    if(zone_thread_2 == 4){//sysj\ECS_plant.sysj line: 85, column: 8
                      S176=0;
                      cutPowZ4.setPresent();//sysj\ECS_plant.sysj line: 87, column: 7
                      currsigs.addElement(cutPowZ4);
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S135=4;
                      if(zone_thread_2 == 5){//sysj\ECS_plant.sysj line: 96, column: 8
                        S212=0;
                        cutPowZ5.setPresent();//sysj\ECS_plant.sysj line: 98, column: 7
                        currsigs.addElement(cutPowZ5);
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
                        S135=5;
                        if(zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 107, column: 8
                          S248=0;
                          cutPowZ6.setPresent();//sysj\ECS_plant.sysj line: 109, column: 7
                          currsigs.addElement(cutPowZ6);
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          S135=6;
                          if(zone_thread_2 == 7){//sysj\ECS_plant.sysj line: 118, column: 8
                            S284=0;
                            cutPowZ7.setPresent();//sysj\ECS_plant.sysj line: 120, column: 7
                            currsigs.addElement(cutPowZ7);
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S85=2;
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
          
          case 1 : 
            if(fire.getprestatus()){//sysj\ECS_plant.sysj line: 49, column: 10
              S85=2;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              switch(S135){
                case 0 : 
                  switch(S90){
                    case 0 : 
                      cutPowZ1.setPresent();//sysj\ECS_plant.sysj line: 52, column: 7
                      currsigs.addElement(cutPowZ1);
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                      break;
                    
                    case 1 : 
                      if(powerOff.getprestatus()){//sysj\ECS_plant.sysj line: 55, column: 12
                        S90=2;
                        fireZone1.setPresent();//sysj\ECS_plant.sysj line: 57, column: 7
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
                      fireZone1.setPresent();//sysj\ECS_plant.sysj line: 57, column: 7
                      currsigs.addElement(fireZone1);
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                      break;
                    
                    case 3 : 
                      if(alarmOff.getprestatus()){//sysj\ECS_plant.sysj line: 60, column: 12
                        System.out.println("Fire Out");//sysj\ECS_plant.sysj line: 61, column: 6
                        S135=1;
                        if(zone_thread_2 == 2){//sysj\ECS_plant.sysj line: 63, column: 8
                          S103=0;
                          cutPowZ2.setPresent();//sysj\ECS_plant.sysj line: 65, column: 7
                          currsigs.addElement(cutPowZ2);
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          S135=2;
                          if(zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 74, column: 8
                            S140=0;
                            cutPowZ3.setPresent();//sysj\ECS_plant.sysj line: 76, column: 7
                            currsigs.addElement(cutPowZ3);
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S135=3;
                            if(zone_thread_2 == 4){//sysj\ECS_plant.sysj line: 85, column: 8
                              S176=0;
                              cutPowZ4.setPresent();//sysj\ECS_plant.sysj line: 87, column: 7
                              currsigs.addElement(cutPowZ4);
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S135=4;
                              if(zone_thread_2 == 5){//sysj\ECS_plant.sysj line: 96, column: 8
                                S212=0;
                                cutPowZ5.setPresent();//sysj\ECS_plant.sysj line: 98, column: 7
                                currsigs.addElement(cutPowZ5);
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                              else {
                                S135=5;
                                if(zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 107, column: 8
                                  S248=0;
                                  cutPowZ6.setPresent();//sysj\ECS_plant.sysj line: 109, column: 7
                                  currsigs.addElement(cutPowZ6);
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                                else {
                                  S135=6;
                                  if(zone_thread_2 == 7){//sysj\ECS_plant.sysj line: 118, column: 8
                                    S284=0;
                                    cutPowZ7.setPresent();//sysj\ECS_plant.sysj line: 120, column: 7
                                    currsigs.addElement(cutPowZ7);
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                  else {
                                    S85=2;
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
                  switch(S103){
                    case 0 : 
                      cutPowZ2.setPresent();//sysj\ECS_plant.sysj line: 65, column: 7
                      currsigs.addElement(cutPowZ2);
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                      break;
                    
                    case 1 : 
                      if(powerOff.getprestatus()){//sysj\ECS_plant.sysj line: 68, column: 12
                        S103=2;
                        fireZone2.setPresent();//sysj\ECS_plant.sysj line: 70, column: 7
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
                      fireZone2.setPresent();//sysj\ECS_plant.sysj line: 70, column: 7
                      currsigs.addElement(fireZone2);
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                      break;
                    
                  }
                  break;
                
                case 2 : 
                  switch(S140){
                    case 0 : 
                      cutPowZ3.setPresent();//sysj\ECS_plant.sysj line: 76, column: 7
                      currsigs.addElement(cutPowZ3);
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                      break;
                    
                    case 1 : 
                      if(powerOff.getprestatus()){//sysj\ECS_plant.sysj line: 79, column: 12
                        S140=2;
                        fireZone3.setPresent();//sysj\ECS_plant.sysj line: 81, column: 7
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
                      fireZone3.setPresent();//sysj\ECS_plant.sysj line: 81, column: 7
                      currsigs.addElement(fireZone3);
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                      break;
                    
                  }
                  break;
                
                case 3 : 
                  switch(S176){
                    case 0 : 
                      cutPowZ4.setPresent();//sysj\ECS_plant.sysj line: 87, column: 7
                      currsigs.addElement(cutPowZ4);
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                      break;
                    
                    case 1 : 
                      if(powerOff.getprestatus()){//sysj\ECS_plant.sysj line: 90, column: 12
                        S176=2;
                        fireZone4.setPresent();//sysj\ECS_plant.sysj line: 92, column: 7
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
                      fireZone4.setPresent();//sysj\ECS_plant.sysj line: 92, column: 7
                      currsigs.addElement(fireZone4);
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                      break;
                    
                  }
                  break;
                
                case 4 : 
                  switch(S212){
                    case 0 : 
                      cutPowZ5.setPresent();//sysj\ECS_plant.sysj line: 98, column: 7
                      currsigs.addElement(cutPowZ5);
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                      break;
                    
                    case 1 : 
                      if(powerOff.getprestatus()){//sysj\ECS_plant.sysj line: 101, column: 12
                        S212=2;
                        fireZone5.setPresent();//sysj\ECS_plant.sysj line: 103, column: 7
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
                      fireZone5.setPresent();//sysj\ECS_plant.sysj line: 103, column: 7
                      currsigs.addElement(fireZone5);
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                      break;
                    
                  }
                  break;
                
                case 5 : 
                  switch(S248){
                    case 0 : 
                      cutPowZ6.setPresent();//sysj\ECS_plant.sysj line: 109, column: 7
                      currsigs.addElement(cutPowZ6);
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                      break;
                    
                    case 1 : 
                      if(powerOff.getprestatus()){//sysj\ECS_plant.sysj line: 112, column: 12
                        S248=2;
                        fireZone7.setPresent();//sysj\ECS_plant.sysj line: 114, column: 7
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
                      fireZone7.setPresent();//sysj\ECS_plant.sysj line: 114, column: 7
                      currsigs.addElement(fireZone7);
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                      break;
                    
                  }
                  break;
                
                case 6 : 
                  switch(S284){
                    case 0 : 
                      cutPowZ7.setPresent();//sysj\ECS_plant.sysj line: 120, column: 7
                      currsigs.addElement(cutPowZ7);
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                      break;
                    
                    case 1 : 
                      if(powerOff.getprestatus()){//sysj\ECS_plant.sysj line: 123, column: 12
                        S284=2;
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
                
              }
            }
            break;
          
          case 2 : 
            if(run.getprestatus()){//sysj\ECS_plant.sysj line: 132, column: 10
              S85=3;
              S564=0;
              if(zone_thread_2 == 1){//sysj\ECS_plant.sysj line: 137, column: 8
                cleanZone1.setPresent();//sysj\ECS_plant.sysj line: 139, column: 7
                currsigs.addElement(cleanZone1);
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                S564=1;
                if(zone_thread_2 == 2){//sysj\ECS_plant.sysj line: 143, column: 8
                  cleanZone2.setPresent();//sysj\ECS_plant.sysj line: 145, column: 7
                  currsigs.addElement(cleanZone2);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S564=2;
                  if(zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 149, column: 8
                    cleanZone3.setPresent();//sysj\ECS_plant.sysj line: 151, column: 7
                    currsigs.addElement(cleanZone3);
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S564=3;
                    if(zone_thread_2 == 4){//sysj\ECS_plant.sysj line: 155, column: 8
                      cleanZone4.setPresent();//sysj\ECS_plant.sysj line: 157, column: 7
                      currsigs.addElement(cleanZone4);
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S564=4;
                      if(zone_thread_2 == 5){//sysj\ECS_plant.sysj line: 161, column: 8
                        cleanZone5.setPresent();//sysj\ECS_plant.sysj line: 163, column: 7
                        currsigs.addElement(cleanZone5);
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
                        S564=5;
                        if(zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 167, column: 8
                          cleanZone7.setPresent();//sysj\ECS_plant.sysj line: 169, column: 7
                          currsigs.addElement(cleanZone7);
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          S564=6;
                          if(zone_thread_2 == 7){//sysj\ECS_plant.sysj line: 173, column: 8
                            cleanZone7.setPresent();//sysj\ECS_plant.sysj line: 175, column: 7
                            currsigs.addElement(cleanZone7);
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S85=4;
                            if(zone_thread_2 == 1 || zone_thread_2 == 7){//sysj\ECS_plant.sysj line: 182, column: 7
                              temp17_thread_2 = 0;//sysj\ECS_plant.sysj line: 183, column: 5
                              temp17_thread_2 = (tempZone1_7.getpreval() == null ? null : ((Integer)tempZone1_7.getpreval()));//sysj\ECS_plant.sysj line: 184, column: 5
                              if(temp17_thread_2 > 22){//sysj\ECS_plant.sysj line: 185, column: 8
                                S669=0;
                                System.out.println("");//sysj\ECS_plant.sysj line: 187, column: 7
                                System.out.println("Room temperature is too high at " + temp17_thread_2);//sysj\ECS_plant.sysj line: 188, column: 7
                                fanOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 189, column: 7
                                currsigs.addElement(fanOnZone1_7);
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                              else {
                                S669=1;
                                if(temp17_thread_2 < 21){//sysj\ECS_plant.sysj line: 192, column: 15
                                  S668=0;
                                  System.out.println("Room temperature is too low at " + temp17_thread_2);//sysj\ECS_plant.sysj line: 194, column: 7
                                  heatOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 195, column: 7
                                  currsigs.addElement(heatOnZone1_7);
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                                else {
                                  S668=1;
                                  System.out.println("");//sysj\ECS_plant.sysj line: 199, column: 6
                                  System.out.println("Room temperature is safe at" + temp17_thread_2);//sysj\ECS_plant.sysj line: 200, column: 6
                                  S85=5;
                                  if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 205, column: 7
                                    temp23_thread_2 = 0;//sysj\ECS_plant.sysj line: 206, column: 5
                                    temp23_thread_2 = (tempZone2_3.getpreval() == null ? null : ((Integer)tempZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 207, column: 5
                                    if(temp23_thread_2 > 22){//sysj\ECS_plant.sysj line: 208, column: 8
                                      S729=0;
                                      System.out.println("");//sysj\ECS_plant.sysj line: 210, column: 7
                                      System.out.println("Room temperature is too high at " + temp23_thread_2);//sysj\ECS_plant.sysj line: 211, column: 7
                                      airOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 212, column: 7
                                      currsigs.addElement(airOnZone2_3);
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                    else {
                                      S729=1;
                                      if(temp23_thread_2 < 21){//sysj\ECS_plant.sysj line: 215, column: 15
                                        heatOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 217, column: 7
                                        currsigs.addElement(heatOnZone2_3);
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                      else {
                                        System.out.println("");//sysj\ECS_plant.sysj line: 221, column: 6
                                        System.out.println("Room temperature is safe at" + temp23_thread_2);//sysj\ECS_plant.sysj line: 222, column: 6
                                        S85=6;
                                        if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 228, column: 7
                                          temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 229, column: 5
                                          temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 230, column: 5
                                          if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 231, column: 8
                                            S829=0;
                                            System.out.println("");//sysj\ECS_plant.sysj line: 233, column: 7
                                            System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 234, column: 7
                                            airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 235, column: 7
                                            currsigs.addElement(airOnZone4_5_6);
                                            active[2]=1;
                                            ends[2]=1;
                                            tdone[2]=1;
                                          }
                                          else {
                                            S829=1;
                                            if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 238, column: 15
                                              System.out.println("");//sysj\ECS_plant.sysj line: 240, column: 7
                                              System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 241, column: 7
                                              heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 242, column: 7
                                              currsigs.addElement(heatOnZone4_5_6);
                                              active[2]=1;
                                              ends[2]=1;
                                              tdone[2]=1;
                                            }
                                            else {
                                              System.out.println("");//sysj\ECS_plant.sysj line: 246, column: 6
                                              System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 247, column: 6
                                              S85=7;
                                              if(zone_thread_2 == 1 || zone_thread_2 == 7){//sysj\ECS_plant.sysj line: 253, column: 7
                                                humid17_thread_2 = 0;//sysj\ECS_plant.sysj line: 254, column: 5
                                                humid17_thread_2 = (humidZone1_7.getpreval() == null ? null : ((Integer)humidZone1_7.getpreval()));//sysj\ECS_plant.sysj line: 255, column: 5
                                                if(humid17_thread_2 > 60){//sysj\ECS_plant.sysj line: 256, column: 8
                                                  S1009=0;
                                                  System.out.println("");//sysj\ECS_plant.sysj line: 258, column: 7
                                                  System.out.println("Room humidity is too high at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 259, column: 7
                                                  System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 260, column: 7
                                                  deHumOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 261, column: 7
                                                  currsigs.addElement(deHumOnZone1_7);
                                                  active[2]=1;
                                                  ends[2]=1;
                                                  tdone[2]=1;
                                                }
                                                else {
                                                  S1009=1;
                                                  if(humid17_thread_2 < 30){//sysj\ECS_plant.sysj line: 264, column: 15
                                                    System.out.println("");//sysj\ECS_plant.sysj line: 266, column: 7
                                                    System.out.println("Room humidity is too low at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 267, column: 7
                                                    System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 268, column: 7
                                                    humOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 269, column: 7
                                                    currsigs.addElement(humOnZone1_7);
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                  else {
                                                    System.out.println("");//sysj\ECS_plant.sysj line: 273, column: 6
                                                    System.out.println("Room humidity is safe at" + humid17_thread_2);//sysj\ECS_plant.sysj line: 274, column: 6
                                                    S85=8;
                                                    if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 279, column: 7
                                                      humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 280, column: 5
                                                      humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 281, column: 5
                                                      if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 282, column: 8
                                                        S1349=0;
                                                        System.out.println("");//sysj\ECS_plant.sysj line: 284, column: 7
                                                        System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 285, column: 7
                                                        System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 286, column: 7
                                                        deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 287, column: 7
                                                        currsigs.addElement(deHumOnZone2_3);
                                                        active[2]=1;
                                                        ends[2]=1;
                                                        tdone[2]=1;
                                                      }
                                                      else {
                                                        S1349=1;
                                                        if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 290, column: 15
                                                          System.out.println("");//sysj\ECS_plant.sysj line: 292, column: 7
                                                          System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 293, column: 7
                                                          System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 294, column: 7
                                                          humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 295, column: 7
                                                          currsigs.addElement(humOnZone2_3);
                                                          active[2]=1;
                                                          ends[2]=1;
                                                          tdone[2]=1;
                                                        }
                                                        else {
                                                          System.out.println("");//sysj\ECS_plant.sysj line: 299, column: 6
                                                          System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 300, column: 6
                                                          S85=9;
                                                          if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 305, column: 7
                                                            humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 306, column: 5
                                                            humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 307, column: 5
                                                            if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 308, column: 8
                                                              S2009=0;
                                                              System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 7
                                                              System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 311, column: 7
                                                              System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 312, column: 7
                                                              deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 313, column: 7
                                                              currsigs.addElement(deHumOnZone4_5_6);
                                                              active[2]=1;
                                                              ends[2]=1;
                                                              tdone[2]=1;
                                                            }
                                                            else {
                                                              S2009=1;
                                                              if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 316, column: 15
                                                                System.out.println("");//sysj\ECS_plant.sysj line: 318, column: 7
                                                                System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 319, column: 7
                                                                System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 320, column: 7
                                                                humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 321, column: 7
                                                                currsigs.addElement(humOnZone4_5_6);
                                                                active[2]=1;
                                                                ends[2]=1;
                                                                tdone[2]=1;
                                                              }
                                                              else {
                                                                System.out.println("");//sysj\ECS_plant.sysj line: 325, column: 6
                                                                System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 326, column: 6
                                                                S85=10;
                                                                active[2]=1;
                                                                ends[2]=1;
                                                                tdone[2]=1;
                                                              }
                                                            }
                                                          }
                                                          else {
                                                            S85=10;
                                                            active[2]=1;
                                                            ends[2]=1;
                                                            tdone[2]=1;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    else {
                                                      S85=9;
                                                      if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 305, column: 7
                                                        humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 306, column: 5
                                                        humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 307, column: 5
                                                        if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 308, column: 8
                                                          S2009=0;
                                                          System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 7
                                                          System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 311, column: 7
                                                          System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 312, column: 7
                                                          deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 313, column: 7
                                                          currsigs.addElement(deHumOnZone4_5_6);
                                                          active[2]=1;
                                                          ends[2]=1;
                                                          tdone[2]=1;
                                                        }
                                                        else {
                                                          S2009=1;
                                                          if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 316, column: 15
                                                            System.out.println("");//sysj\ECS_plant.sysj line: 318, column: 7
                                                            System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 319, column: 7
                                                            System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 320, column: 7
                                                            humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 321, column: 7
                                                            currsigs.addElement(humOnZone4_5_6);
                                                            active[2]=1;
                                                            ends[2]=1;
                                                            tdone[2]=1;
                                                          }
                                                          else {
                                                            System.out.println("");//sysj\ECS_plant.sysj line: 325, column: 6
                                                            System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 326, column: 6
                                                            S85=10;
                                                            active[2]=1;
                                                            ends[2]=1;
                                                            tdone[2]=1;
                                                          }
                                                        }
                                                      }
                                                      else {
                                                        S85=10;
                                                        active[2]=1;
                                                        ends[2]=1;
                                                        tdone[2]=1;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              else {
                                                S85=8;
                                                if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 279, column: 7
                                                  humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 280, column: 5
                                                  humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 281, column: 5
                                                  if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 282, column: 8
                                                    S1349=0;
                                                    System.out.println("");//sysj\ECS_plant.sysj line: 284, column: 7
                                                    System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 285, column: 7
                                                    System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 286, column: 7
                                                    deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 287, column: 7
                                                    currsigs.addElement(deHumOnZone2_3);
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                  else {
                                                    S1349=1;
                                                    if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 290, column: 15
                                                      System.out.println("");//sysj\ECS_plant.sysj line: 292, column: 7
                                                      System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 293, column: 7
                                                      System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 294, column: 7
                                                      humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 295, column: 7
                                                      currsigs.addElement(humOnZone2_3);
                                                      active[2]=1;
                                                      ends[2]=1;
                                                      tdone[2]=1;
                                                    }
                                                    else {
                                                      System.out.println("");//sysj\ECS_plant.sysj line: 299, column: 6
                                                      System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 300, column: 6
                                                      S85=9;
                                                      if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 305, column: 7
                                                        humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 306, column: 5
                                                        humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 307, column: 5
                                                        if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 308, column: 8
                                                          S2009=0;
                                                          System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 7
                                                          System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 311, column: 7
                                                          System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 312, column: 7
                                                          deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 313, column: 7
                                                          currsigs.addElement(deHumOnZone4_5_6);
                                                          active[2]=1;
                                                          ends[2]=1;
                                                          tdone[2]=1;
                                                        }
                                                        else {
                                                          S2009=1;
                                                          if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 316, column: 15
                                                            System.out.println("");//sysj\ECS_plant.sysj line: 318, column: 7
                                                            System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 319, column: 7
                                                            System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 320, column: 7
                                                            humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 321, column: 7
                                                            currsigs.addElement(humOnZone4_5_6);
                                                            active[2]=1;
                                                            ends[2]=1;
                                                            tdone[2]=1;
                                                          }
                                                          else {
                                                            System.out.println("");//sysj\ECS_plant.sysj line: 325, column: 6
                                                            System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 326, column: 6
                                                            S85=10;
                                                            active[2]=1;
                                                            ends[2]=1;
                                                            tdone[2]=1;
                                                          }
                                                        }
                                                      }
                                                      else {
                                                        S85=10;
                                                        active[2]=1;
                                                        ends[2]=1;
                                                        tdone[2]=1;
                                                      }
                                                    }
                                                  }
                                                }
                                                else {
                                                  S85=9;
                                                  if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 305, column: 7
                                                    humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 306, column: 5
                                                    humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 307, column: 5
                                                    if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 308, column: 8
                                                      S2009=0;
                                                      System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 7
                                                      System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 311, column: 7
                                                      System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 312, column: 7
                                                      deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 313, column: 7
                                                      currsigs.addElement(deHumOnZone4_5_6);
                                                      active[2]=1;
                                                      ends[2]=1;
                                                      tdone[2]=1;
                                                    }
                                                    else {
                                                      S2009=1;
                                                      if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 316, column: 15
                                                        System.out.println("");//sysj\ECS_plant.sysj line: 318, column: 7
                                                        System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 319, column: 7
                                                        System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 320, column: 7
                                                        humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 321, column: 7
                                                        currsigs.addElement(humOnZone4_5_6);
                                                        active[2]=1;
                                                        ends[2]=1;
                                                        tdone[2]=1;
                                                      }
                                                      else {
                                                        System.out.println("");//sysj\ECS_plant.sysj line: 325, column: 6
                                                        System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 326, column: 6
                                                        S85=10;
                                                        active[2]=1;
                                                        ends[2]=1;
                                                        tdone[2]=1;
                                                      }
                                                    }
                                                  }
                                                  else {
                                                    S85=10;
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
                                          S85=7;
                                          if(zone_thread_2 == 1 || zone_thread_2 == 7){//sysj\ECS_plant.sysj line: 253, column: 7
                                            humid17_thread_2 = 0;//sysj\ECS_plant.sysj line: 254, column: 5
                                            humid17_thread_2 = (humidZone1_7.getpreval() == null ? null : ((Integer)humidZone1_7.getpreval()));//sysj\ECS_plant.sysj line: 255, column: 5
                                            if(humid17_thread_2 > 60){//sysj\ECS_plant.sysj line: 256, column: 8
                                              S1009=0;
                                              System.out.println("");//sysj\ECS_plant.sysj line: 258, column: 7
                                              System.out.println("Room humidity is too high at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 259, column: 7
                                              System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 260, column: 7
                                              deHumOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 261, column: 7
                                              currsigs.addElement(deHumOnZone1_7);
                                              active[2]=1;
                                              ends[2]=1;
                                              tdone[2]=1;
                                            }
                                            else {
                                              S1009=1;
                                              if(humid17_thread_2 < 30){//sysj\ECS_plant.sysj line: 264, column: 15
                                                System.out.println("");//sysj\ECS_plant.sysj line: 266, column: 7
                                                System.out.println("Room humidity is too low at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 267, column: 7
                                                System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 268, column: 7
                                                humOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 269, column: 7
                                                currsigs.addElement(humOnZone1_7);
                                                active[2]=1;
                                                ends[2]=1;
                                                tdone[2]=1;
                                              }
                                              else {
                                                System.out.println("");//sysj\ECS_plant.sysj line: 273, column: 6
                                                System.out.println("Room humidity is safe at" + humid17_thread_2);//sysj\ECS_plant.sysj line: 274, column: 6
                                                S85=8;
                                                if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 279, column: 7
                                                  humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 280, column: 5
                                                  humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 281, column: 5
                                                  if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 282, column: 8
                                                    S1349=0;
                                                    System.out.println("");//sysj\ECS_plant.sysj line: 284, column: 7
                                                    System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 285, column: 7
                                                    System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 286, column: 7
                                                    deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 287, column: 7
                                                    currsigs.addElement(deHumOnZone2_3);
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                  else {
                                                    S1349=1;
                                                    if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 290, column: 15
                                                      System.out.println("");//sysj\ECS_plant.sysj line: 292, column: 7
                                                      System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 293, column: 7
                                                      System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 294, column: 7
                                                      humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 295, column: 7
                                                      currsigs.addElement(humOnZone2_3);
                                                      active[2]=1;
                                                      ends[2]=1;
                                                      tdone[2]=1;
                                                    }
                                                    else {
                                                      System.out.println("");//sysj\ECS_plant.sysj line: 299, column: 6
                                                      System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 300, column: 6
                                                      S85=9;
                                                      if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 305, column: 7
                                                        humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 306, column: 5
                                                        humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 307, column: 5
                                                        if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 308, column: 8
                                                          S2009=0;
                                                          System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 7
                                                          System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 311, column: 7
                                                          System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 312, column: 7
                                                          deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 313, column: 7
                                                          currsigs.addElement(deHumOnZone4_5_6);
                                                          active[2]=1;
                                                          ends[2]=1;
                                                          tdone[2]=1;
                                                        }
                                                        else {
                                                          S2009=1;
                                                          if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 316, column: 15
                                                            System.out.println("");//sysj\ECS_plant.sysj line: 318, column: 7
                                                            System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 319, column: 7
                                                            System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 320, column: 7
                                                            humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 321, column: 7
                                                            currsigs.addElement(humOnZone4_5_6);
                                                            active[2]=1;
                                                            ends[2]=1;
                                                            tdone[2]=1;
                                                          }
                                                          else {
                                                            System.out.println("");//sysj\ECS_plant.sysj line: 325, column: 6
                                                            System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 326, column: 6
                                                            S85=10;
                                                            active[2]=1;
                                                            ends[2]=1;
                                                            tdone[2]=1;
                                                          }
                                                        }
                                                      }
                                                      else {
                                                        S85=10;
                                                        active[2]=1;
                                                        ends[2]=1;
                                                        tdone[2]=1;
                                                      }
                                                    }
                                                  }
                                                }
                                                else {
                                                  S85=9;
                                                  if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 305, column: 7
                                                    humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 306, column: 5
                                                    humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 307, column: 5
                                                    if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 308, column: 8
                                                      S2009=0;
                                                      System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 7
                                                      System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 311, column: 7
                                                      System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 312, column: 7
                                                      deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 313, column: 7
                                                      currsigs.addElement(deHumOnZone4_5_6);
                                                      active[2]=1;
                                                      ends[2]=1;
                                                      tdone[2]=1;
                                                    }
                                                    else {
                                                      S2009=1;
                                                      if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 316, column: 15
                                                        System.out.println("");//sysj\ECS_plant.sysj line: 318, column: 7
                                                        System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 319, column: 7
                                                        System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 320, column: 7
                                                        humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 321, column: 7
                                                        currsigs.addElement(humOnZone4_5_6);
                                                        active[2]=1;
                                                        ends[2]=1;
                                                        tdone[2]=1;
                                                      }
                                                      else {
                                                        System.out.println("");//sysj\ECS_plant.sysj line: 325, column: 6
                                                        System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 326, column: 6
                                                        S85=10;
                                                        active[2]=1;
                                                        ends[2]=1;
                                                        tdone[2]=1;
                                                      }
                                                    }
                                                  }
                                                  else {
                                                    S85=10;
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          else {
                                            S85=8;
                                            if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 279, column: 7
                                              humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 280, column: 5
                                              humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 281, column: 5
                                              if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 282, column: 8
                                                S1349=0;
                                                System.out.println("");//sysj\ECS_plant.sysj line: 284, column: 7
                                                System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 285, column: 7
                                                System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 286, column: 7
                                                deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 287, column: 7
                                                currsigs.addElement(deHumOnZone2_3);
                                                active[2]=1;
                                                ends[2]=1;
                                                tdone[2]=1;
                                              }
                                              else {
                                                S1349=1;
                                                if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 290, column: 15
                                                  System.out.println("");//sysj\ECS_plant.sysj line: 292, column: 7
                                                  System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 293, column: 7
                                                  System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 294, column: 7
                                                  humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 295, column: 7
                                                  currsigs.addElement(humOnZone2_3);
                                                  active[2]=1;
                                                  ends[2]=1;
                                                  tdone[2]=1;
                                                }
                                                else {
                                                  System.out.println("");//sysj\ECS_plant.sysj line: 299, column: 6
                                                  System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 300, column: 6
                                                  S85=9;
                                                  if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 305, column: 7
                                                    humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 306, column: 5
                                                    humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 307, column: 5
                                                    if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 308, column: 8
                                                      S2009=0;
                                                      System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 7
                                                      System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 311, column: 7
                                                      System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 312, column: 7
                                                      deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 313, column: 7
                                                      currsigs.addElement(deHumOnZone4_5_6);
                                                      active[2]=1;
                                                      ends[2]=1;
                                                      tdone[2]=1;
                                                    }
                                                    else {
                                                      S2009=1;
                                                      if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 316, column: 15
                                                        System.out.println("");//sysj\ECS_plant.sysj line: 318, column: 7
                                                        System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 319, column: 7
                                                        System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 320, column: 7
                                                        humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 321, column: 7
                                                        currsigs.addElement(humOnZone4_5_6);
                                                        active[2]=1;
                                                        ends[2]=1;
                                                        tdone[2]=1;
                                                      }
                                                      else {
                                                        System.out.println("");//sysj\ECS_plant.sysj line: 325, column: 6
                                                        System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 326, column: 6
                                                        S85=10;
                                                        active[2]=1;
                                                        ends[2]=1;
                                                        tdone[2]=1;
                                                      }
                                                    }
                                                  }
                                                  else {
                                                    S85=10;
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                }
                                              }
                                            }
                                            else {
                                              S85=9;
                                              if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 305, column: 7
                                                humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 306, column: 5
                                                humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 307, column: 5
                                                if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 308, column: 8
                                                  S2009=0;
                                                  System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 7
                                                  System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 311, column: 7
                                                  System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 312, column: 7
                                                  deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 313, column: 7
                                                  currsigs.addElement(deHumOnZone4_5_6);
                                                  active[2]=1;
                                                  ends[2]=1;
                                                  tdone[2]=1;
                                                }
                                                else {
                                                  S2009=1;
                                                  if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 316, column: 15
                                                    System.out.println("");//sysj\ECS_plant.sysj line: 318, column: 7
                                                    System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 319, column: 7
                                                    System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 320, column: 7
                                                    humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 321, column: 7
                                                    currsigs.addElement(humOnZone4_5_6);
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                  else {
                                                    System.out.println("");//sysj\ECS_plant.sysj line: 325, column: 6
                                                    System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 326, column: 6
                                                    S85=10;
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                }
                                              }
                                              else {
                                                S85=10;
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
                                    S85=6;
                                    if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 228, column: 7
                                      temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 229, column: 5
                                      temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 230, column: 5
                                      if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 231, column: 8
                                        S829=0;
                                        System.out.println("");//sysj\ECS_plant.sysj line: 233, column: 7
                                        System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 234, column: 7
                                        airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 235, column: 7
                                        currsigs.addElement(airOnZone4_5_6);
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                      else {
                                        S829=1;
                                        if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 238, column: 15
                                          System.out.println("");//sysj\ECS_plant.sysj line: 240, column: 7
                                          System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 241, column: 7
                                          heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 242, column: 7
                                          currsigs.addElement(heatOnZone4_5_6);
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                        else {
                                          System.out.println("");//sysj\ECS_plant.sysj line: 246, column: 6
                                          System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 247, column: 6
                                          S85=7;
                                          if(zone_thread_2 == 1 || zone_thread_2 == 7){//sysj\ECS_plant.sysj line: 253, column: 7
                                            humid17_thread_2 = 0;//sysj\ECS_plant.sysj line: 254, column: 5
                                            humid17_thread_2 = (humidZone1_7.getpreval() == null ? null : ((Integer)humidZone1_7.getpreval()));//sysj\ECS_plant.sysj line: 255, column: 5
                                            if(humid17_thread_2 > 60){//sysj\ECS_plant.sysj line: 256, column: 8
                                              S1009=0;
                                              System.out.println("");//sysj\ECS_plant.sysj line: 258, column: 7
                                              System.out.println("Room humidity is too high at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 259, column: 7
                                              System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 260, column: 7
                                              deHumOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 261, column: 7
                                              currsigs.addElement(deHumOnZone1_7);
                                              active[2]=1;
                                              ends[2]=1;
                                              tdone[2]=1;
                                            }
                                            else {
                                              S1009=1;
                                              if(humid17_thread_2 < 30){//sysj\ECS_plant.sysj line: 264, column: 15
                                                System.out.println("");//sysj\ECS_plant.sysj line: 266, column: 7
                                                System.out.println("Room humidity is too low at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 267, column: 7
                                                System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 268, column: 7
                                                humOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 269, column: 7
                                                currsigs.addElement(humOnZone1_7);
                                                active[2]=1;
                                                ends[2]=1;
                                                tdone[2]=1;
                                              }
                                              else {
                                                System.out.println("");//sysj\ECS_plant.sysj line: 273, column: 6
                                                System.out.println("Room humidity is safe at" + humid17_thread_2);//sysj\ECS_plant.sysj line: 274, column: 6
                                                S85=8;
                                                if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 279, column: 7
                                                  humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 280, column: 5
                                                  humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 281, column: 5
                                                  if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 282, column: 8
                                                    S1349=0;
                                                    System.out.println("");//sysj\ECS_plant.sysj line: 284, column: 7
                                                    System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 285, column: 7
                                                    System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 286, column: 7
                                                    deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 287, column: 7
                                                    currsigs.addElement(deHumOnZone2_3);
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                  else {
                                                    S1349=1;
                                                    if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 290, column: 15
                                                      System.out.println("");//sysj\ECS_plant.sysj line: 292, column: 7
                                                      System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 293, column: 7
                                                      System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 294, column: 7
                                                      humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 295, column: 7
                                                      currsigs.addElement(humOnZone2_3);
                                                      active[2]=1;
                                                      ends[2]=1;
                                                      tdone[2]=1;
                                                    }
                                                    else {
                                                      System.out.println("");//sysj\ECS_plant.sysj line: 299, column: 6
                                                      System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 300, column: 6
                                                      S85=9;
                                                      if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 305, column: 7
                                                        humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 306, column: 5
                                                        humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 307, column: 5
                                                        if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 308, column: 8
                                                          S2009=0;
                                                          System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 7
                                                          System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 311, column: 7
                                                          System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 312, column: 7
                                                          deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 313, column: 7
                                                          currsigs.addElement(deHumOnZone4_5_6);
                                                          active[2]=1;
                                                          ends[2]=1;
                                                          tdone[2]=1;
                                                        }
                                                        else {
                                                          S2009=1;
                                                          if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 316, column: 15
                                                            System.out.println("");//sysj\ECS_plant.sysj line: 318, column: 7
                                                            System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 319, column: 7
                                                            System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 320, column: 7
                                                            humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 321, column: 7
                                                            currsigs.addElement(humOnZone4_5_6);
                                                            active[2]=1;
                                                            ends[2]=1;
                                                            tdone[2]=1;
                                                          }
                                                          else {
                                                            System.out.println("");//sysj\ECS_plant.sysj line: 325, column: 6
                                                            System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 326, column: 6
                                                            S85=10;
                                                            active[2]=1;
                                                            ends[2]=1;
                                                            tdone[2]=1;
                                                          }
                                                        }
                                                      }
                                                      else {
                                                        S85=10;
                                                        active[2]=1;
                                                        ends[2]=1;
                                                        tdone[2]=1;
                                                      }
                                                    }
                                                  }
                                                }
                                                else {
                                                  S85=9;
                                                  if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 305, column: 7
                                                    humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 306, column: 5
                                                    humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 307, column: 5
                                                    if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 308, column: 8
                                                      S2009=0;
                                                      System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 7
                                                      System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 311, column: 7
                                                      System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 312, column: 7
                                                      deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 313, column: 7
                                                      currsigs.addElement(deHumOnZone4_5_6);
                                                      active[2]=1;
                                                      ends[2]=1;
                                                      tdone[2]=1;
                                                    }
                                                    else {
                                                      S2009=1;
                                                      if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 316, column: 15
                                                        System.out.println("");//sysj\ECS_plant.sysj line: 318, column: 7
                                                        System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 319, column: 7
                                                        System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 320, column: 7
                                                        humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 321, column: 7
                                                        currsigs.addElement(humOnZone4_5_6);
                                                        active[2]=1;
                                                        ends[2]=1;
                                                        tdone[2]=1;
                                                      }
                                                      else {
                                                        System.out.println("");//sysj\ECS_plant.sysj line: 325, column: 6
                                                        System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 326, column: 6
                                                        S85=10;
                                                        active[2]=1;
                                                        ends[2]=1;
                                                        tdone[2]=1;
                                                      }
                                                    }
                                                  }
                                                  else {
                                                    S85=10;
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          else {
                                            S85=8;
                                            if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 279, column: 7
                                              humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 280, column: 5
                                              humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 281, column: 5
                                              if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 282, column: 8
                                                S1349=0;
                                                System.out.println("");//sysj\ECS_plant.sysj line: 284, column: 7
                                                System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 285, column: 7
                                                System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 286, column: 7
                                                deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 287, column: 7
                                                currsigs.addElement(deHumOnZone2_3);
                                                active[2]=1;
                                                ends[2]=1;
                                                tdone[2]=1;
                                              }
                                              else {
                                                S1349=1;
                                                if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 290, column: 15
                                                  System.out.println("");//sysj\ECS_plant.sysj line: 292, column: 7
                                                  System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 293, column: 7
                                                  System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 294, column: 7
                                                  humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 295, column: 7
                                                  currsigs.addElement(humOnZone2_3);
                                                  active[2]=1;
                                                  ends[2]=1;
                                                  tdone[2]=1;
                                                }
                                                else {
                                                  System.out.println("");//sysj\ECS_plant.sysj line: 299, column: 6
                                                  System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 300, column: 6
                                                  S85=9;
                                                  if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 305, column: 7
                                                    humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 306, column: 5
                                                    humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 307, column: 5
                                                    if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 308, column: 8
                                                      S2009=0;
                                                      System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 7
                                                      System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 311, column: 7
                                                      System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 312, column: 7
                                                      deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 313, column: 7
                                                      currsigs.addElement(deHumOnZone4_5_6);
                                                      active[2]=1;
                                                      ends[2]=1;
                                                      tdone[2]=1;
                                                    }
                                                    else {
                                                      S2009=1;
                                                      if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 316, column: 15
                                                        System.out.println("");//sysj\ECS_plant.sysj line: 318, column: 7
                                                        System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 319, column: 7
                                                        System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 320, column: 7
                                                        humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 321, column: 7
                                                        currsigs.addElement(humOnZone4_5_6);
                                                        active[2]=1;
                                                        ends[2]=1;
                                                        tdone[2]=1;
                                                      }
                                                      else {
                                                        System.out.println("");//sysj\ECS_plant.sysj line: 325, column: 6
                                                        System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 326, column: 6
                                                        S85=10;
                                                        active[2]=1;
                                                        ends[2]=1;
                                                        tdone[2]=1;
                                                      }
                                                    }
                                                  }
                                                  else {
                                                    S85=10;
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                }
                                              }
                                            }
                                            else {
                                              S85=9;
                                              if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 305, column: 7
                                                humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 306, column: 5
                                                humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 307, column: 5
                                                if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 308, column: 8
                                                  S2009=0;
                                                  System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 7
                                                  System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 311, column: 7
                                                  System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 312, column: 7
                                                  deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 313, column: 7
                                                  currsigs.addElement(deHumOnZone4_5_6);
                                                  active[2]=1;
                                                  ends[2]=1;
                                                  tdone[2]=1;
                                                }
                                                else {
                                                  S2009=1;
                                                  if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 316, column: 15
                                                    System.out.println("");//sysj\ECS_plant.sysj line: 318, column: 7
                                                    System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 319, column: 7
                                                    System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 320, column: 7
                                                    humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 321, column: 7
                                                    currsigs.addElement(humOnZone4_5_6);
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                  else {
                                                    System.out.println("");//sysj\ECS_plant.sysj line: 325, column: 6
                                                    System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 326, column: 6
                                                    S85=10;
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                }
                                              }
                                              else {
                                                S85=10;
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
                                      S85=7;
                                      if(zone_thread_2 == 1 || zone_thread_2 == 7){//sysj\ECS_plant.sysj line: 253, column: 7
                                        humid17_thread_2 = 0;//sysj\ECS_plant.sysj line: 254, column: 5
                                        humid17_thread_2 = (humidZone1_7.getpreval() == null ? null : ((Integer)humidZone1_7.getpreval()));//sysj\ECS_plant.sysj line: 255, column: 5
                                        if(humid17_thread_2 > 60){//sysj\ECS_plant.sysj line: 256, column: 8
                                          S1009=0;
                                          System.out.println("");//sysj\ECS_plant.sysj line: 258, column: 7
                                          System.out.println("Room humidity is too high at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 259, column: 7
                                          System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 260, column: 7
                                          deHumOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 261, column: 7
                                          currsigs.addElement(deHumOnZone1_7);
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                        else {
                                          S1009=1;
                                          if(humid17_thread_2 < 30){//sysj\ECS_plant.sysj line: 264, column: 15
                                            System.out.println("");//sysj\ECS_plant.sysj line: 266, column: 7
                                            System.out.println("Room humidity is too low at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 267, column: 7
                                            System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 268, column: 7
                                            humOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 269, column: 7
                                            currsigs.addElement(humOnZone1_7);
                                            active[2]=1;
                                            ends[2]=1;
                                            tdone[2]=1;
                                          }
                                          else {
                                            System.out.println("");//sysj\ECS_plant.sysj line: 273, column: 6
                                            System.out.println("Room humidity is safe at" + humid17_thread_2);//sysj\ECS_plant.sysj line: 274, column: 6
                                            S85=8;
                                            if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 279, column: 7
                                              humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 280, column: 5
                                              humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 281, column: 5
                                              if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 282, column: 8
                                                S1349=0;
                                                System.out.println("");//sysj\ECS_plant.sysj line: 284, column: 7
                                                System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 285, column: 7
                                                System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 286, column: 7
                                                deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 287, column: 7
                                                currsigs.addElement(deHumOnZone2_3);
                                                active[2]=1;
                                                ends[2]=1;
                                                tdone[2]=1;
                                              }
                                              else {
                                                S1349=1;
                                                if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 290, column: 15
                                                  System.out.println("");//sysj\ECS_plant.sysj line: 292, column: 7
                                                  System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 293, column: 7
                                                  System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 294, column: 7
                                                  humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 295, column: 7
                                                  currsigs.addElement(humOnZone2_3);
                                                  active[2]=1;
                                                  ends[2]=1;
                                                  tdone[2]=1;
                                                }
                                                else {
                                                  System.out.println("");//sysj\ECS_plant.sysj line: 299, column: 6
                                                  System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 300, column: 6
                                                  S85=9;
                                                  if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 305, column: 7
                                                    humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 306, column: 5
                                                    humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 307, column: 5
                                                    if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 308, column: 8
                                                      S2009=0;
                                                      System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 7
                                                      System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 311, column: 7
                                                      System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 312, column: 7
                                                      deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 313, column: 7
                                                      currsigs.addElement(deHumOnZone4_5_6);
                                                      active[2]=1;
                                                      ends[2]=1;
                                                      tdone[2]=1;
                                                    }
                                                    else {
                                                      S2009=1;
                                                      if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 316, column: 15
                                                        System.out.println("");//sysj\ECS_plant.sysj line: 318, column: 7
                                                        System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 319, column: 7
                                                        System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 320, column: 7
                                                        humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 321, column: 7
                                                        currsigs.addElement(humOnZone4_5_6);
                                                        active[2]=1;
                                                        ends[2]=1;
                                                        tdone[2]=1;
                                                      }
                                                      else {
                                                        System.out.println("");//sysj\ECS_plant.sysj line: 325, column: 6
                                                        System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 326, column: 6
                                                        S85=10;
                                                        active[2]=1;
                                                        ends[2]=1;
                                                        tdone[2]=1;
                                                      }
                                                    }
                                                  }
                                                  else {
                                                    S85=10;
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                }
                                              }
                                            }
                                            else {
                                              S85=9;
                                              if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 305, column: 7
                                                humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 306, column: 5
                                                humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 307, column: 5
                                                if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 308, column: 8
                                                  S2009=0;
                                                  System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 7
                                                  System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 311, column: 7
                                                  System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 312, column: 7
                                                  deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 313, column: 7
                                                  currsigs.addElement(deHumOnZone4_5_6);
                                                  active[2]=1;
                                                  ends[2]=1;
                                                  tdone[2]=1;
                                                }
                                                else {
                                                  S2009=1;
                                                  if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 316, column: 15
                                                    System.out.println("");//sysj\ECS_plant.sysj line: 318, column: 7
                                                    System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 319, column: 7
                                                    System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 320, column: 7
                                                    humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 321, column: 7
                                                    currsigs.addElement(humOnZone4_5_6);
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                  else {
                                                    System.out.println("");//sysj\ECS_plant.sysj line: 325, column: 6
                                                    System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 326, column: 6
                                                    S85=10;
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                }
                                              }
                                              else {
                                                S85=10;
                                                active[2]=1;
                                                ends[2]=1;
                                                tdone[2]=1;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      else {
                                        S85=8;
                                        if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 279, column: 7
                                          humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 280, column: 5
                                          humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 281, column: 5
                                          if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 282, column: 8
                                            S1349=0;
                                            System.out.println("");//sysj\ECS_plant.sysj line: 284, column: 7
                                            System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 285, column: 7
                                            System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 286, column: 7
                                            deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 287, column: 7
                                            currsigs.addElement(deHumOnZone2_3);
                                            active[2]=1;
                                            ends[2]=1;
                                            tdone[2]=1;
                                          }
                                          else {
                                            S1349=1;
                                            if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 290, column: 15
                                              System.out.println("");//sysj\ECS_plant.sysj line: 292, column: 7
                                              System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 293, column: 7
                                              System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 294, column: 7
                                              humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 295, column: 7
                                              currsigs.addElement(humOnZone2_3);
                                              active[2]=1;
                                              ends[2]=1;
                                              tdone[2]=1;
                                            }
                                            else {
                                              System.out.println("");//sysj\ECS_plant.sysj line: 299, column: 6
                                              System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 300, column: 6
                                              S85=9;
                                              if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 305, column: 7
                                                humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 306, column: 5
                                                humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 307, column: 5
                                                if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 308, column: 8
                                                  S2009=0;
                                                  System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 7
                                                  System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 311, column: 7
                                                  System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 312, column: 7
                                                  deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 313, column: 7
                                                  currsigs.addElement(deHumOnZone4_5_6);
                                                  active[2]=1;
                                                  ends[2]=1;
                                                  tdone[2]=1;
                                                }
                                                else {
                                                  S2009=1;
                                                  if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 316, column: 15
                                                    System.out.println("");//sysj\ECS_plant.sysj line: 318, column: 7
                                                    System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 319, column: 7
                                                    System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 320, column: 7
                                                    humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 321, column: 7
                                                    currsigs.addElement(humOnZone4_5_6);
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                  else {
                                                    System.out.println("");//sysj\ECS_plant.sysj line: 325, column: 6
                                                    System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 326, column: 6
                                                    S85=10;
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                }
                                              }
                                              else {
                                                S85=10;
                                                active[2]=1;
                                                ends[2]=1;
                                                tdone[2]=1;
                                              }
                                            }
                                          }
                                        }
                                        else {
                                          S85=9;
                                          if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 305, column: 7
                                            humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 306, column: 5
                                            humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 307, column: 5
                                            if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 308, column: 8
                                              S2009=0;
                                              System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 7
                                              System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 311, column: 7
                                              System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 312, column: 7
                                              deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 313, column: 7
                                              currsigs.addElement(deHumOnZone4_5_6);
                                              active[2]=1;
                                              ends[2]=1;
                                              tdone[2]=1;
                                            }
                                            else {
                                              S2009=1;
                                              if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 316, column: 15
                                                System.out.println("");//sysj\ECS_plant.sysj line: 318, column: 7
                                                System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 319, column: 7
                                                System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 320, column: 7
                                                humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 321, column: 7
                                                currsigs.addElement(humOnZone4_5_6);
                                                active[2]=1;
                                                ends[2]=1;
                                                tdone[2]=1;
                                              }
                                              else {
                                                System.out.println("");//sysj\ECS_plant.sysj line: 325, column: 6
                                                System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 326, column: 6
                                                S85=10;
                                                active[2]=1;
                                                ends[2]=1;
                                                tdone[2]=1;
                                              }
                                            }
                                          }
                                          else {
                                            S85=10;
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
                              S85=5;
                              if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 205, column: 7
                                temp23_thread_2 = 0;//sysj\ECS_plant.sysj line: 206, column: 5
                                temp23_thread_2 = (tempZone2_3.getpreval() == null ? null : ((Integer)tempZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 207, column: 5
                                if(temp23_thread_2 > 22){//sysj\ECS_plant.sysj line: 208, column: 8
                                  S729=0;
                                  System.out.println("");//sysj\ECS_plant.sysj line: 210, column: 7
                                  System.out.println("Room temperature is too high at " + temp23_thread_2);//sysj\ECS_plant.sysj line: 211, column: 7
                                  airOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 212, column: 7
                                  currsigs.addElement(airOnZone2_3);
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                                else {
                                  S729=1;
                                  if(temp23_thread_2 < 21){//sysj\ECS_plant.sysj line: 215, column: 15
                                    heatOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 217, column: 7
                                    currsigs.addElement(heatOnZone2_3);
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                  else {
                                    System.out.println("");//sysj\ECS_plant.sysj line: 221, column: 6
                                    System.out.println("Room temperature is safe at" + temp23_thread_2);//sysj\ECS_plant.sysj line: 222, column: 6
                                    S85=6;
                                    if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 228, column: 7
                                      temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 229, column: 5
                                      temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 230, column: 5
                                      if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 231, column: 8
                                        S829=0;
                                        System.out.println("");//sysj\ECS_plant.sysj line: 233, column: 7
                                        System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 234, column: 7
                                        airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 235, column: 7
                                        currsigs.addElement(airOnZone4_5_6);
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                      else {
                                        S829=1;
                                        if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 238, column: 15
                                          System.out.println("");//sysj\ECS_plant.sysj line: 240, column: 7
                                          System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 241, column: 7
                                          heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 242, column: 7
                                          currsigs.addElement(heatOnZone4_5_6);
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                        else {
                                          System.out.println("");//sysj\ECS_plant.sysj line: 246, column: 6
                                          System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 247, column: 6
                                          S85=7;
                                          if(zone_thread_2 == 1 || zone_thread_2 == 7){//sysj\ECS_plant.sysj line: 253, column: 7
                                            humid17_thread_2 = 0;//sysj\ECS_plant.sysj line: 254, column: 5
                                            humid17_thread_2 = (humidZone1_7.getpreval() == null ? null : ((Integer)humidZone1_7.getpreval()));//sysj\ECS_plant.sysj line: 255, column: 5
                                            if(humid17_thread_2 > 60){//sysj\ECS_plant.sysj line: 256, column: 8
                                              S1009=0;
                                              System.out.println("");//sysj\ECS_plant.sysj line: 258, column: 7
                                              System.out.println("Room humidity is too high at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 259, column: 7
                                              System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 260, column: 7
                                              deHumOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 261, column: 7
                                              currsigs.addElement(deHumOnZone1_7);
                                              active[2]=1;
                                              ends[2]=1;
                                              tdone[2]=1;
                                            }
                                            else {
                                              S1009=1;
                                              if(humid17_thread_2 < 30){//sysj\ECS_plant.sysj line: 264, column: 15
                                                System.out.println("");//sysj\ECS_plant.sysj line: 266, column: 7
                                                System.out.println("Room humidity is too low at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 267, column: 7
                                                System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 268, column: 7
                                                humOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 269, column: 7
                                                currsigs.addElement(humOnZone1_7);
                                                active[2]=1;
                                                ends[2]=1;
                                                tdone[2]=1;
                                              }
                                              else {
                                                System.out.println("");//sysj\ECS_plant.sysj line: 273, column: 6
                                                System.out.println("Room humidity is safe at" + humid17_thread_2);//sysj\ECS_plant.sysj line: 274, column: 6
                                                S85=8;
                                                if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 279, column: 7
                                                  humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 280, column: 5
                                                  humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 281, column: 5
                                                  if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 282, column: 8
                                                    S1349=0;
                                                    System.out.println("");//sysj\ECS_plant.sysj line: 284, column: 7
                                                    System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 285, column: 7
                                                    System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 286, column: 7
                                                    deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 287, column: 7
                                                    currsigs.addElement(deHumOnZone2_3);
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                  else {
                                                    S1349=1;
                                                    if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 290, column: 15
                                                      System.out.println("");//sysj\ECS_plant.sysj line: 292, column: 7
                                                      System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 293, column: 7
                                                      System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 294, column: 7
                                                      humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 295, column: 7
                                                      currsigs.addElement(humOnZone2_3);
                                                      active[2]=1;
                                                      ends[2]=1;
                                                      tdone[2]=1;
                                                    }
                                                    else {
                                                      System.out.println("");//sysj\ECS_plant.sysj line: 299, column: 6
                                                      System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 300, column: 6
                                                      S85=9;
                                                      if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 305, column: 7
                                                        humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 306, column: 5
                                                        humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 307, column: 5
                                                        if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 308, column: 8
                                                          S2009=0;
                                                          System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 7
                                                          System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 311, column: 7
                                                          System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 312, column: 7
                                                          deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 313, column: 7
                                                          currsigs.addElement(deHumOnZone4_5_6);
                                                          active[2]=1;
                                                          ends[2]=1;
                                                          tdone[2]=1;
                                                        }
                                                        else {
                                                          S2009=1;
                                                          if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 316, column: 15
                                                            System.out.println("");//sysj\ECS_plant.sysj line: 318, column: 7
                                                            System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 319, column: 7
                                                            System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 320, column: 7
                                                            humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 321, column: 7
                                                            currsigs.addElement(humOnZone4_5_6);
                                                            active[2]=1;
                                                            ends[2]=1;
                                                            tdone[2]=1;
                                                          }
                                                          else {
                                                            System.out.println("");//sysj\ECS_plant.sysj line: 325, column: 6
                                                            System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 326, column: 6
                                                            S85=10;
                                                            active[2]=1;
                                                            ends[2]=1;
                                                            tdone[2]=1;
                                                          }
                                                        }
                                                      }
                                                      else {
                                                        S85=10;
                                                        active[2]=1;
                                                        ends[2]=1;
                                                        tdone[2]=1;
                                                      }
                                                    }
                                                  }
                                                }
                                                else {
                                                  S85=9;
                                                  if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 305, column: 7
                                                    humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 306, column: 5
                                                    humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 307, column: 5
                                                    if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 308, column: 8
                                                      S2009=0;
                                                      System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 7
                                                      System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 311, column: 7
                                                      System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 312, column: 7
                                                      deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 313, column: 7
                                                      currsigs.addElement(deHumOnZone4_5_6);
                                                      active[2]=1;
                                                      ends[2]=1;
                                                      tdone[2]=1;
                                                    }
                                                    else {
                                                      S2009=1;
                                                      if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 316, column: 15
                                                        System.out.println("");//sysj\ECS_plant.sysj line: 318, column: 7
                                                        System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 319, column: 7
                                                        System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 320, column: 7
                                                        humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 321, column: 7
                                                        currsigs.addElement(humOnZone4_5_6);
                                                        active[2]=1;
                                                        ends[2]=1;
                                                        tdone[2]=1;
                                                      }
                                                      else {
                                                        System.out.println("");//sysj\ECS_plant.sysj line: 325, column: 6
                                                        System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 326, column: 6
                                                        S85=10;
                                                        active[2]=1;
                                                        ends[2]=1;
                                                        tdone[2]=1;
                                                      }
                                                    }
                                                  }
                                                  else {
                                                    S85=10;
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          else {
                                            S85=8;
                                            if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 279, column: 7
                                              humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 280, column: 5
                                              humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 281, column: 5
                                              if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 282, column: 8
                                                S1349=0;
                                                System.out.println("");//sysj\ECS_plant.sysj line: 284, column: 7
                                                System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 285, column: 7
                                                System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 286, column: 7
                                                deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 287, column: 7
                                                currsigs.addElement(deHumOnZone2_3);
                                                active[2]=1;
                                                ends[2]=1;
                                                tdone[2]=1;
                                              }
                                              else {
                                                S1349=1;
                                                if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 290, column: 15
                                                  System.out.println("");//sysj\ECS_plant.sysj line: 292, column: 7
                                                  System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 293, column: 7
                                                  System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 294, column: 7
                                                  humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 295, column: 7
                                                  currsigs.addElement(humOnZone2_3);
                                                  active[2]=1;
                                                  ends[2]=1;
                                                  tdone[2]=1;
                                                }
                                                else {
                                                  System.out.println("");//sysj\ECS_plant.sysj line: 299, column: 6
                                                  System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 300, column: 6
                                                  S85=9;
                                                  if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 305, column: 7
                                                    humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 306, column: 5
                                                    humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 307, column: 5
                                                    if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 308, column: 8
                                                      S2009=0;
                                                      System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 7
                                                      System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 311, column: 7
                                                      System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 312, column: 7
                                                      deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 313, column: 7
                                                      currsigs.addElement(deHumOnZone4_5_6);
                                                      active[2]=1;
                                                      ends[2]=1;
                                                      tdone[2]=1;
                                                    }
                                                    else {
                                                      S2009=1;
                                                      if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 316, column: 15
                                                        System.out.println("");//sysj\ECS_plant.sysj line: 318, column: 7
                                                        System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 319, column: 7
                                                        System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 320, column: 7
                                                        humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 321, column: 7
                                                        currsigs.addElement(humOnZone4_5_6);
                                                        active[2]=1;
                                                        ends[2]=1;
                                                        tdone[2]=1;
                                                      }
                                                      else {
                                                        System.out.println("");//sysj\ECS_plant.sysj line: 325, column: 6
                                                        System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 326, column: 6
                                                        S85=10;
                                                        active[2]=1;
                                                        ends[2]=1;
                                                        tdone[2]=1;
                                                      }
                                                    }
                                                  }
                                                  else {
                                                    S85=10;
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                }
                                              }
                                            }
                                            else {
                                              S85=9;
                                              if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 305, column: 7
                                                humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 306, column: 5
                                                humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 307, column: 5
                                                if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 308, column: 8
                                                  S2009=0;
                                                  System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 7
                                                  System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 311, column: 7
                                                  System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 312, column: 7
                                                  deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 313, column: 7
                                                  currsigs.addElement(deHumOnZone4_5_6);
                                                  active[2]=1;
                                                  ends[2]=1;
                                                  tdone[2]=1;
                                                }
                                                else {
                                                  S2009=1;
                                                  if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 316, column: 15
                                                    System.out.println("");//sysj\ECS_plant.sysj line: 318, column: 7
                                                    System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 319, column: 7
                                                    System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 320, column: 7
                                                    humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 321, column: 7
                                                    currsigs.addElement(humOnZone4_5_6);
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                  else {
                                                    System.out.println("");//sysj\ECS_plant.sysj line: 325, column: 6
                                                    System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 326, column: 6
                                                    S85=10;
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                }
                                              }
                                              else {
                                                S85=10;
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
                                      S85=7;
                                      if(zone_thread_2 == 1 || zone_thread_2 == 7){//sysj\ECS_plant.sysj line: 253, column: 7
                                        humid17_thread_2 = 0;//sysj\ECS_plant.sysj line: 254, column: 5
                                        humid17_thread_2 = (humidZone1_7.getpreval() == null ? null : ((Integer)humidZone1_7.getpreval()));//sysj\ECS_plant.sysj line: 255, column: 5
                                        if(humid17_thread_2 > 60){//sysj\ECS_plant.sysj line: 256, column: 8
                                          S1009=0;
                                          System.out.println("");//sysj\ECS_plant.sysj line: 258, column: 7
                                          System.out.println("Room humidity is too high at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 259, column: 7
                                          System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 260, column: 7
                                          deHumOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 261, column: 7
                                          currsigs.addElement(deHumOnZone1_7);
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                        else {
                                          S1009=1;
                                          if(humid17_thread_2 < 30){//sysj\ECS_plant.sysj line: 264, column: 15
                                            System.out.println("");//sysj\ECS_plant.sysj line: 266, column: 7
                                            System.out.println("Room humidity is too low at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 267, column: 7
                                            System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 268, column: 7
                                            humOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 269, column: 7
                                            currsigs.addElement(humOnZone1_7);
                                            active[2]=1;
                                            ends[2]=1;
                                            tdone[2]=1;
                                          }
                                          else {
                                            System.out.println("");//sysj\ECS_plant.sysj line: 273, column: 6
                                            System.out.println("Room humidity is safe at" + humid17_thread_2);//sysj\ECS_plant.sysj line: 274, column: 6
                                            S85=8;
                                            if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 279, column: 7
                                              humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 280, column: 5
                                              humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 281, column: 5
                                              if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 282, column: 8
                                                S1349=0;
                                                System.out.println("");//sysj\ECS_plant.sysj line: 284, column: 7
                                                System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 285, column: 7
                                                System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 286, column: 7
                                                deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 287, column: 7
                                                currsigs.addElement(deHumOnZone2_3);
                                                active[2]=1;
                                                ends[2]=1;
                                                tdone[2]=1;
                                              }
                                              else {
                                                S1349=1;
                                                if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 290, column: 15
                                                  System.out.println("");//sysj\ECS_plant.sysj line: 292, column: 7
                                                  System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 293, column: 7
                                                  System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 294, column: 7
                                                  humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 295, column: 7
                                                  currsigs.addElement(humOnZone2_3);
                                                  active[2]=1;
                                                  ends[2]=1;
                                                  tdone[2]=1;
                                                }
                                                else {
                                                  System.out.println("");//sysj\ECS_plant.sysj line: 299, column: 6
                                                  System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 300, column: 6
                                                  S85=9;
                                                  if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 305, column: 7
                                                    humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 306, column: 5
                                                    humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 307, column: 5
                                                    if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 308, column: 8
                                                      S2009=0;
                                                      System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 7
                                                      System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 311, column: 7
                                                      System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 312, column: 7
                                                      deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 313, column: 7
                                                      currsigs.addElement(deHumOnZone4_5_6);
                                                      active[2]=1;
                                                      ends[2]=1;
                                                      tdone[2]=1;
                                                    }
                                                    else {
                                                      S2009=1;
                                                      if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 316, column: 15
                                                        System.out.println("");//sysj\ECS_plant.sysj line: 318, column: 7
                                                        System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 319, column: 7
                                                        System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 320, column: 7
                                                        humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 321, column: 7
                                                        currsigs.addElement(humOnZone4_5_6);
                                                        active[2]=1;
                                                        ends[2]=1;
                                                        tdone[2]=1;
                                                      }
                                                      else {
                                                        System.out.println("");//sysj\ECS_plant.sysj line: 325, column: 6
                                                        System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 326, column: 6
                                                        S85=10;
                                                        active[2]=1;
                                                        ends[2]=1;
                                                        tdone[2]=1;
                                                      }
                                                    }
                                                  }
                                                  else {
                                                    S85=10;
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                }
                                              }
                                            }
                                            else {
                                              S85=9;
                                              if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 305, column: 7
                                                humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 306, column: 5
                                                humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 307, column: 5
                                                if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 308, column: 8
                                                  S2009=0;
                                                  System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 7
                                                  System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 311, column: 7
                                                  System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 312, column: 7
                                                  deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 313, column: 7
                                                  currsigs.addElement(deHumOnZone4_5_6);
                                                  active[2]=1;
                                                  ends[2]=1;
                                                  tdone[2]=1;
                                                }
                                                else {
                                                  S2009=1;
                                                  if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 316, column: 15
                                                    System.out.println("");//sysj\ECS_plant.sysj line: 318, column: 7
                                                    System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 319, column: 7
                                                    System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 320, column: 7
                                                    humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 321, column: 7
                                                    currsigs.addElement(humOnZone4_5_6);
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                  else {
                                                    System.out.println("");//sysj\ECS_plant.sysj line: 325, column: 6
                                                    System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 326, column: 6
                                                    S85=10;
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                }
                                              }
                                              else {
                                                S85=10;
                                                active[2]=1;
                                                ends[2]=1;
                                                tdone[2]=1;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      else {
                                        S85=8;
                                        if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 279, column: 7
                                          humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 280, column: 5
                                          humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 281, column: 5
                                          if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 282, column: 8
                                            S1349=0;
                                            System.out.println("");//sysj\ECS_plant.sysj line: 284, column: 7
                                            System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 285, column: 7
                                            System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 286, column: 7
                                            deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 287, column: 7
                                            currsigs.addElement(deHumOnZone2_3);
                                            active[2]=1;
                                            ends[2]=1;
                                            tdone[2]=1;
                                          }
                                          else {
                                            S1349=1;
                                            if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 290, column: 15
                                              System.out.println("");//sysj\ECS_plant.sysj line: 292, column: 7
                                              System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 293, column: 7
                                              System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 294, column: 7
                                              humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 295, column: 7
                                              currsigs.addElement(humOnZone2_3);
                                              active[2]=1;
                                              ends[2]=1;
                                              tdone[2]=1;
                                            }
                                            else {
                                              System.out.println("");//sysj\ECS_plant.sysj line: 299, column: 6
                                              System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 300, column: 6
                                              S85=9;
                                              if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 305, column: 7
                                                humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 306, column: 5
                                                humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 307, column: 5
                                                if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 308, column: 8
                                                  S2009=0;
                                                  System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 7
                                                  System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 311, column: 7
                                                  System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 312, column: 7
                                                  deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 313, column: 7
                                                  currsigs.addElement(deHumOnZone4_5_6);
                                                  active[2]=1;
                                                  ends[2]=1;
                                                  tdone[2]=1;
                                                }
                                                else {
                                                  S2009=1;
                                                  if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 316, column: 15
                                                    System.out.println("");//sysj\ECS_plant.sysj line: 318, column: 7
                                                    System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 319, column: 7
                                                    System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 320, column: 7
                                                    humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 321, column: 7
                                                    currsigs.addElement(humOnZone4_5_6);
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                  else {
                                                    System.out.println("");//sysj\ECS_plant.sysj line: 325, column: 6
                                                    System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 326, column: 6
                                                    S85=10;
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                }
                                              }
                                              else {
                                                S85=10;
                                                active[2]=1;
                                                ends[2]=1;
                                                tdone[2]=1;
                                              }
                                            }
                                          }
                                        }
                                        else {
                                          S85=9;
                                          if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 305, column: 7
                                            humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 306, column: 5
                                            humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 307, column: 5
                                            if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 308, column: 8
                                              S2009=0;
                                              System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 7
                                              System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 311, column: 7
                                              System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 312, column: 7
                                              deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 313, column: 7
                                              currsigs.addElement(deHumOnZone4_5_6);
                                              active[2]=1;
                                              ends[2]=1;
                                              tdone[2]=1;
                                            }
                                            else {
                                              S2009=1;
                                              if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 316, column: 15
                                                System.out.println("");//sysj\ECS_plant.sysj line: 318, column: 7
                                                System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 319, column: 7
                                                System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 320, column: 7
                                                humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 321, column: 7
                                                currsigs.addElement(humOnZone4_5_6);
                                                active[2]=1;
                                                ends[2]=1;
                                                tdone[2]=1;
                                              }
                                              else {
                                                System.out.println("");//sysj\ECS_plant.sysj line: 325, column: 6
                                                System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 326, column: 6
                                                S85=10;
                                                active[2]=1;
                                                ends[2]=1;
                                                tdone[2]=1;
                                              }
                                            }
                                          }
                                          else {
                                            S85=10;
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
                                S85=6;
                                if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 228, column: 7
                                  temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 229, column: 5
                                  temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 230, column: 5
                                  if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 231, column: 8
                                    S829=0;
                                    System.out.println("");//sysj\ECS_plant.sysj line: 233, column: 7
                                    System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 234, column: 7
                                    airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 235, column: 7
                                    currsigs.addElement(airOnZone4_5_6);
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                  else {
                                    S829=1;
                                    if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 238, column: 15
                                      System.out.println("");//sysj\ECS_plant.sysj line: 240, column: 7
                                      System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 241, column: 7
                                      heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 242, column: 7
                                      currsigs.addElement(heatOnZone4_5_6);
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                    else {
                                      System.out.println("");//sysj\ECS_plant.sysj line: 246, column: 6
                                      System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 247, column: 6
                                      S85=7;
                                      if(zone_thread_2 == 1 || zone_thread_2 == 7){//sysj\ECS_plant.sysj line: 253, column: 7
                                        humid17_thread_2 = 0;//sysj\ECS_plant.sysj line: 254, column: 5
                                        humid17_thread_2 = (humidZone1_7.getpreval() == null ? null : ((Integer)humidZone1_7.getpreval()));//sysj\ECS_plant.sysj line: 255, column: 5
                                        if(humid17_thread_2 > 60){//sysj\ECS_plant.sysj line: 256, column: 8
                                          S1009=0;
                                          System.out.println("");//sysj\ECS_plant.sysj line: 258, column: 7
                                          System.out.println("Room humidity is too high at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 259, column: 7
                                          System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 260, column: 7
                                          deHumOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 261, column: 7
                                          currsigs.addElement(deHumOnZone1_7);
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                        else {
                                          S1009=1;
                                          if(humid17_thread_2 < 30){//sysj\ECS_plant.sysj line: 264, column: 15
                                            System.out.println("");//sysj\ECS_plant.sysj line: 266, column: 7
                                            System.out.println("Room humidity is too low at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 267, column: 7
                                            System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 268, column: 7
                                            humOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 269, column: 7
                                            currsigs.addElement(humOnZone1_7);
                                            active[2]=1;
                                            ends[2]=1;
                                            tdone[2]=1;
                                          }
                                          else {
                                            System.out.println("");//sysj\ECS_plant.sysj line: 273, column: 6
                                            System.out.println("Room humidity is safe at" + humid17_thread_2);//sysj\ECS_plant.sysj line: 274, column: 6
                                            S85=8;
                                            if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 279, column: 7
                                              humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 280, column: 5
                                              humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 281, column: 5
                                              if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 282, column: 8
                                                S1349=0;
                                                System.out.println("");//sysj\ECS_plant.sysj line: 284, column: 7
                                                System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 285, column: 7
                                                System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 286, column: 7
                                                deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 287, column: 7
                                                currsigs.addElement(deHumOnZone2_3);
                                                active[2]=1;
                                                ends[2]=1;
                                                tdone[2]=1;
                                              }
                                              else {
                                                S1349=1;
                                                if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 290, column: 15
                                                  System.out.println("");//sysj\ECS_plant.sysj line: 292, column: 7
                                                  System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 293, column: 7
                                                  System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 294, column: 7
                                                  humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 295, column: 7
                                                  currsigs.addElement(humOnZone2_3);
                                                  active[2]=1;
                                                  ends[2]=1;
                                                  tdone[2]=1;
                                                }
                                                else {
                                                  System.out.println("");//sysj\ECS_plant.sysj line: 299, column: 6
                                                  System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 300, column: 6
                                                  S85=9;
                                                  if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 305, column: 7
                                                    humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 306, column: 5
                                                    humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 307, column: 5
                                                    if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 308, column: 8
                                                      S2009=0;
                                                      System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 7
                                                      System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 311, column: 7
                                                      System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 312, column: 7
                                                      deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 313, column: 7
                                                      currsigs.addElement(deHumOnZone4_5_6);
                                                      active[2]=1;
                                                      ends[2]=1;
                                                      tdone[2]=1;
                                                    }
                                                    else {
                                                      S2009=1;
                                                      if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 316, column: 15
                                                        System.out.println("");//sysj\ECS_plant.sysj line: 318, column: 7
                                                        System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 319, column: 7
                                                        System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 320, column: 7
                                                        humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 321, column: 7
                                                        currsigs.addElement(humOnZone4_5_6);
                                                        active[2]=1;
                                                        ends[2]=1;
                                                        tdone[2]=1;
                                                      }
                                                      else {
                                                        System.out.println("");//sysj\ECS_plant.sysj line: 325, column: 6
                                                        System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 326, column: 6
                                                        S85=10;
                                                        active[2]=1;
                                                        ends[2]=1;
                                                        tdone[2]=1;
                                                      }
                                                    }
                                                  }
                                                  else {
                                                    S85=10;
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                }
                                              }
                                            }
                                            else {
                                              S85=9;
                                              if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 305, column: 7
                                                humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 306, column: 5
                                                humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 307, column: 5
                                                if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 308, column: 8
                                                  S2009=0;
                                                  System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 7
                                                  System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 311, column: 7
                                                  System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 312, column: 7
                                                  deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 313, column: 7
                                                  currsigs.addElement(deHumOnZone4_5_6);
                                                  active[2]=1;
                                                  ends[2]=1;
                                                  tdone[2]=1;
                                                }
                                                else {
                                                  S2009=1;
                                                  if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 316, column: 15
                                                    System.out.println("");//sysj\ECS_plant.sysj line: 318, column: 7
                                                    System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 319, column: 7
                                                    System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 320, column: 7
                                                    humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 321, column: 7
                                                    currsigs.addElement(humOnZone4_5_6);
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                  else {
                                                    System.out.println("");//sysj\ECS_plant.sysj line: 325, column: 6
                                                    System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 326, column: 6
                                                    S85=10;
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                }
                                              }
                                              else {
                                                S85=10;
                                                active[2]=1;
                                                ends[2]=1;
                                                tdone[2]=1;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      else {
                                        S85=8;
                                        if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 279, column: 7
                                          humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 280, column: 5
                                          humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 281, column: 5
                                          if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 282, column: 8
                                            S1349=0;
                                            System.out.println("");//sysj\ECS_plant.sysj line: 284, column: 7
                                            System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 285, column: 7
                                            System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 286, column: 7
                                            deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 287, column: 7
                                            currsigs.addElement(deHumOnZone2_3);
                                            active[2]=1;
                                            ends[2]=1;
                                            tdone[2]=1;
                                          }
                                          else {
                                            S1349=1;
                                            if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 290, column: 15
                                              System.out.println("");//sysj\ECS_plant.sysj line: 292, column: 7
                                              System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 293, column: 7
                                              System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 294, column: 7
                                              humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 295, column: 7
                                              currsigs.addElement(humOnZone2_3);
                                              active[2]=1;
                                              ends[2]=1;
                                              tdone[2]=1;
                                            }
                                            else {
                                              System.out.println("");//sysj\ECS_plant.sysj line: 299, column: 6
                                              System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 300, column: 6
                                              S85=9;
                                              if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 305, column: 7
                                                humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 306, column: 5
                                                humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 307, column: 5
                                                if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 308, column: 8
                                                  S2009=0;
                                                  System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 7
                                                  System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 311, column: 7
                                                  System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 312, column: 7
                                                  deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 313, column: 7
                                                  currsigs.addElement(deHumOnZone4_5_6);
                                                  active[2]=1;
                                                  ends[2]=1;
                                                  tdone[2]=1;
                                                }
                                                else {
                                                  S2009=1;
                                                  if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 316, column: 15
                                                    System.out.println("");//sysj\ECS_plant.sysj line: 318, column: 7
                                                    System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 319, column: 7
                                                    System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 320, column: 7
                                                    humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 321, column: 7
                                                    currsigs.addElement(humOnZone4_5_6);
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                  else {
                                                    System.out.println("");//sysj\ECS_plant.sysj line: 325, column: 6
                                                    System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 326, column: 6
                                                    S85=10;
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                }
                                              }
                                              else {
                                                S85=10;
                                                active[2]=1;
                                                ends[2]=1;
                                                tdone[2]=1;
                                              }
                                            }
                                          }
                                        }
                                        else {
                                          S85=9;
                                          if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 305, column: 7
                                            humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 306, column: 5
                                            humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 307, column: 5
                                            if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 308, column: 8
                                              S2009=0;
                                              System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 7
                                              System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 311, column: 7
                                              System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 312, column: 7
                                              deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 313, column: 7
                                              currsigs.addElement(deHumOnZone4_5_6);
                                              active[2]=1;
                                              ends[2]=1;
                                              tdone[2]=1;
                                            }
                                            else {
                                              S2009=1;
                                              if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 316, column: 15
                                                System.out.println("");//sysj\ECS_plant.sysj line: 318, column: 7
                                                System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 319, column: 7
                                                System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 320, column: 7
                                                humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 321, column: 7
                                                currsigs.addElement(humOnZone4_5_6);
                                                active[2]=1;
                                                ends[2]=1;
                                                tdone[2]=1;
                                              }
                                              else {
                                                System.out.println("");//sysj\ECS_plant.sysj line: 325, column: 6
                                                System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 326, column: 6
                                                S85=10;
                                                active[2]=1;
                                                ends[2]=1;
                                                tdone[2]=1;
                                              }
                                            }
                                          }
                                          else {
                                            S85=10;
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
                                  S85=7;
                                  if(zone_thread_2 == 1 || zone_thread_2 == 7){//sysj\ECS_plant.sysj line: 253, column: 7
                                    humid17_thread_2 = 0;//sysj\ECS_plant.sysj line: 254, column: 5
                                    humid17_thread_2 = (humidZone1_7.getpreval() == null ? null : ((Integer)humidZone1_7.getpreval()));//sysj\ECS_plant.sysj line: 255, column: 5
                                    if(humid17_thread_2 > 60){//sysj\ECS_plant.sysj line: 256, column: 8
                                      S1009=0;
                                      System.out.println("");//sysj\ECS_plant.sysj line: 258, column: 7
                                      System.out.println("Room humidity is too high at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 259, column: 7
                                      System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 260, column: 7
                                      deHumOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 261, column: 7
                                      currsigs.addElement(deHumOnZone1_7);
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                    else {
                                      S1009=1;
                                      if(humid17_thread_2 < 30){//sysj\ECS_plant.sysj line: 264, column: 15
                                        System.out.println("");//sysj\ECS_plant.sysj line: 266, column: 7
                                        System.out.println("Room humidity is too low at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 267, column: 7
                                        System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 268, column: 7
                                        humOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 269, column: 7
                                        currsigs.addElement(humOnZone1_7);
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                      else {
                                        System.out.println("");//sysj\ECS_plant.sysj line: 273, column: 6
                                        System.out.println("Room humidity is safe at" + humid17_thread_2);//sysj\ECS_plant.sysj line: 274, column: 6
                                        S85=8;
                                        if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 279, column: 7
                                          humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 280, column: 5
                                          humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 281, column: 5
                                          if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 282, column: 8
                                            S1349=0;
                                            System.out.println("");//sysj\ECS_plant.sysj line: 284, column: 7
                                            System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 285, column: 7
                                            System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 286, column: 7
                                            deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 287, column: 7
                                            currsigs.addElement(deHumOnZone2_3);
                                            active[2]=1;
                                            ends[2]=1;
                                            tdone[2]=1;
                                          }
                                          else {
                                            S1349=1;
                                            if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 290, column: 15
                                              System.out.println("");//sysj\ECS_plant.sysj line: 292, column: 7
                                              System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 293, column: 7
                                              System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 294, column: 7
                                              humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 295, column: 7
                                              currsigs.addElement(humOnZone2_3);
                                              active[2]=1;
                                              ends[2]=1;
                                              tdone[2]=1;
                                            }
                                            else {
                                              System.out.println("");//sysj\ECS_plant.sysj line: 299, column: 6
                                              System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 300, column: 6
                                              S85=9;
                                              if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 305, column: 7
                                                humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 306, column: 5
                                                humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 307, column: 5
                                                if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 308, column: 8
                                                  S2009=0;
                                                  System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 7
                                                  System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 311, column: 7
                                                  System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 312, column: 7
                                                  deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 313, column: 7
                                                  currsigs.addElement(deHumOnZone4_5_6);
                                                  active[2]=1;
                                                  ends[2]=1;
                                                  tdone[2]=1;
                                                }
                                                else {
                                                  S2009=1;
                                                  if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 316, column: 15
                                                    System.out.println("");//sysj\ECS_plant.sysj line: 318, column: 7
                                                    System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 319, column: 7
                                                    System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 320, column: 7
                                                    humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 321, column: 7
                                                    currsigs.addElement(humOnZone4_5_6);
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                  else {
                                                    System.out.println("");//sysj\ECS_plant.sysj line: 325, column: 6
                                                    System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 326, column: 6
                                                    S85=10;
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                }
                                              }
                                              else {
                                                S85=10;
                                                active[2]=1;
                                                ends[2]=1;
                                                tdone[2]=1;
                                              }
                                            }
                                          }
                                        }
                                        else {
                                          S85=9;
                                          if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 305, column: 7
                                            humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 306, column: 5
                                            humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 307, column: 5
                                            if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 308, column: 8
                                              S2009=0;
                                              System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 7
                                              System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 311, column: 7
                                              System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 312, column: 7
                                              deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 313, column: 7
                                              currsigs.addElement(deHumOnZone4_5_6);
                                              active[2]=1;
                                              ends[2]=1;
                                              tdone[2]=1;
                                            }
                                            else {
                                              S2009=1;
                                              if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 316, column: 15
                                                System.out.println("");//sysj\ECS_plant.sysj line: 318, column: 7
                                                System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 319, column: 7
                                                System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 320, column: 7
                                                humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 321, column: 7
                                                currsigs.addElement(humOnZone4_5_6);
                                                active[2]=1;
                                                ends[2]=1;
                                                tdone[2]=1;
                                              }
                                              else {
                                                System.out.println("");//sysj\ECS_plant.sysj line: 325, column: 6
                                                System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 326, column: 6
                                                S85=10;
                                                active[2]=1;
                                                ends[2]=1;
                                                tdone[2]=1;
                                              }
                                            }
                                          }
                                          else {
                                            S85=10;
                                            active[2]=1;
                                            ends[2]=1;
                                            tdone[2]=1;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  else {
                                    S85=8;
                                    if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 279, column: 7
                                      humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 280, column: 5
                                      humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 281, column: 5
                                      if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 282, column: 8
                                        S1349=0;
                                        System.out.println("");//sysj\ECS_plant.sysj line: 284, column: 7
                                        System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 285, column: 7
                                        System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 286, column: 7
                                        deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 287, column: 7
                                        currsigs.addElement(deHumOnZone2_3);
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                      else {
                                        S1349=1;
                                        if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 290, column: 15
                                          System.out.println("");//sysj\ECS_plant.sysj line: 292, column: 7
                                          System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 293, column: 7
                                          System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 294, column: 7
                                          humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 295, column: 7
                                          currsigs.addElement(humOnZone2_3);
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                        else {
                                          System.out.println("");//sysj\ECS_plant.sysj line: 299, column: 6
                                          System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 300, column: 6
                                          S85=9;
                                          if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 305, column: 7
                                            humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 306, column: 5
                                            humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 307, column: 5
                                            if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 308, column: 8
                                              S2009=0;
                                              System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 7
                                              System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 311, column: 7
                                              System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 312, column: 7
                                              deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 313, column: 7
                                              currsigs.addElement(deHumOnZone4_5_6);
                                              active[2]=1;
                                              ends[2]=1;
                                              tdone[2]=1;
                                            }
                                            else {
                                              S2009=1;
                                              if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 316, column: 15
                                                System.out.println("");//sysj\ECS_plant.sysj line: 318, column: 7
                                                System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 319, column: 7
                                                System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 320, column: 7
                                                humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 321, column: 7
                                                currsigs.addElement(humOnZone4_5_6);
                                                active[2]=1;
                                                ends[2]=1;
                                                tdone[2]=1;
                                              }
                                              else {
                                                System.out.println("");//sysj\ECS_plant.sysj line: 325, column: 6
                                                System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 326, column: 6
                                                S85=10;
                                                active[2]=1;
                                                ends[2]=1;
                                                tdone[2]=1;
                                              }
                                            }
                                          }
                                          else {
                                            S85=10;
                                            active[2]=1;
                                            ends[2]=1;
                                            tdone[2]=1;
                                          }
                                        }
                                      }
                                    }
                                    else {
                                      S85=9;
                                      if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 305, column: 7
                                        humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 306, column: 5
                                        humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 307, column: 5
                                        if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 308, column: 8
                                          S2009=0;
                                          System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 7
                                          System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 311, column: 7
                                          System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 312, column: 7
                                          deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 313, column: 7
                                          currsigs.addElement(deHumOnZone4_5_6);
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                        else {
                                          S2009=1;
                                          if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 316, column: 15
                                            System.out.println("");//sysj\ECS_plant.sysj line: 318, column: 7
                                            System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 319, column: 7
                                            System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 320, column: 7
                                            humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 321, column: 7
                                            currsigs.addElement(humOnZone4_5_6);
                                            active[2]=1;
                                            ends[2]=1;
                                            tdone[2]=1;
                                          }
                                          else {
                                            System.out.println("");//sysj\ECS_plant.sysj line: 325, column: 6
                                            System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 326, column: 6
                                            S85=10;
                                            active[2]=1;
                                            ends[2]=1;
                                            tdone[2]=1;
                                          }
                                        }
                                      }
                                      else {
                                        S85=10;
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
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 3 : 
            if(dust.getprestatus()){//sysj\ECS_plant.sysj line: 135, column: 10
              S85=4;
              if(zone_thread_2 == 1 || zone_thread_2 == 7){//sysj\ECS_plant.sysj line: 182, column: 7
                temp17_thread_2 = 0;//sysj\ECS_plant.sysj line: 183, column: 5
                temp17_thread_2 = (tempZone1_7.getpreval() == null ? null : ((Integer)tempZone1_7.getpreval()));//sysj\ECS_plant.sysj line: 184, column: 5
                if(temp17_thread_2 > 22){//sysj\ECS_plant.sysj line: 185, column: 8
                  S669=0;
                  System.out.println("");//sysj\ECS_plant.sysj line: 187, column: 7
                  System.out.println("Room temperature is too high at " + temp17_thread_2);//sysj\ECS_plant.sysj line: 188, column: 7
                  fanOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 189, column: 7
                  currsigs.addElement(fanOnZone1_7);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S669=1;
                  if(temp17_thread_2 < 21){//sysj\ECS_plant.sysj line: 192, column: 15
                    S668=0;
                    System.out.println("Room temperature is too low at " + temp17_thread_2);//sysj\ECS_plant.sysj line: 194, column: 7
                    heatOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 195, column: 7
                    currsigs.addElement(heatOnZone1_7);
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S668=1;
                    System.out.println("");//sysj\ECS_plant.sysj line: 199, column: 6
                    System.out.println("Room temperature is safe at" + temp17_thread_2);//sysj\ECS_plant.sysj line: 200, column: 6
                    S85=5;
                    if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 205, column: 7
                      temp23_thread_2 = 0;//sysj\ECS_plant.sysj line: 206, column: 5
                      temp23_thread_2 = (tempZone2_3.getpreval() == null ? null : ((Integer)tempZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 207, column: 5
                      if(temp23_thread_2 > 22){//sysj\ECS_plant.sysj line: 208, column: 8
                        S729=0;
                        System.out.println("");//sysj\ECS_plant.sysj line: 210, column: 7
                        System.out.println("Room temperature is too high at " + temp23_thread_2);//sysj\ECS_plant.sysj line: 211, column: 7
                        airOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 212, column: 7
                        currsigs.addElement(airOnZone2_3);
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
                        S729=1;
                        if(temp23_thread_2 < 21){//sysj\ECS_plant.sysj line: 215, column: 15
                          heatOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 217, column: 7
                          currsigs.addElement(heatOnZone2_3);
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          System.out.println("");//sysj\ECS_plant.sysj line: 221, column: 6
                          System.out.println("Room temperature is safe at" + temp23_thread_2);//sysj\ECS_plant.sysj line: 222, column: 6
                          S85=6;
                          if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 228, column: 7
                            temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 229, column: 5
                            temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 230, column: 5
                            if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 231, column: 8
                              S829=0;
                              System.out.println("");//sysj\ECS_plant.sysj line: 233, column: 7
                              System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 234, column: 7
                              airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 235, column: 7
                              currsigs.addElement(airOnZone4_5_6);
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S829=1;
                              if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 238, column: 15
                                System.out.println("");//sysj\ECS_plant.sysj line: 240, column: 7
                                System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 241, column: 7
                                heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 242, column: 7
                                currsigs.addElement(heatOnZone4_5_6);
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                              else {
                                System.out.println("");//sysj\ECS_plant.sysj line: 246, column: 6
                                System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 247, column: 6
                                S85=7;
                                if(zone_thread_2 == 1 || zone_thread_2 == 7){//sysj\ECS_plant.sysj line: 253, column: 7
                                  humid17_thread_2 = 0;//sysj\ECS_plant.sysj line: 254, column: 5
                                  humid17_thread_2 = (humidZone1_7.getpreval() == null ? null : ((Integer)humidZone1_7.getpreval()));//sysj\ECS_plant.sysj line: 255, column: 5
                                  if(humid17_thread_2 > 60){//sysj\ECS_plant.sysj line: 256, column: 8
                                    S1009=0;
                                    System.out.println("");//sysj\ECS_plant.sysj line: 258, column: 7
                                    System.out.println("Room humidity is too high at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 259, column: 7
                                    System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 260, column: 7
                                    deHumOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 261, column: 7
                                    currsigs.addElement(deHumOnZone1_7);
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                  else {
                                    S1009=1;
                                    if(humid17_thread_2 < 30){//sysj\ECS_plant.sysj line: 264, column: 15
                                      System.out.println("");//sysj\ECS_plant.sysj line: 266, column: 7
                                      System.out.println("Room humidity is too low at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 267, column: 7
                                      System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 268, column: 7
                                      humOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 269, column: 7
                                      currsigs.addElement(humOnZone1_7);
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                    else {
                                      System.out.println("");//sysj\ECS_plant.sysj line: 273, column: 6
                                      System.out.println("Room humidity is safe at" + humid17_thread_2);//sysj\ECS_plant.sysj line: 274, column: 6
                                      S85=8;
                                      if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 279, column: 7
                                        humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 280, column: 5
                                        humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 281, column: 5
                                        if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 282, column: 8
                                          S1349=0;
                                          System.out.println("");//sysj\ECS_plant.sysj line: 284, column: 7
                                          System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 285, column: 7
                                          System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 286, column: 7
                                          deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 287, column: 7
                                          currsigs.addElement(deHumOnZone2_3);
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                        else {
                                          S1349=1;
                                          if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 290, column: 15
                                            System.out.println("");//sysj\ECS_plant.sysj line: 292, column: 7
                                            System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 293, column: 7
                                            System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 294, column: 7
                                            humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 295, column: 7
                                            currsigs.addElement(humOnZone2_3);
                                            active[2]=1;
                                            ends[2]=1;
                                            tdone[2]=1;
                                          }
                                          else {
                                            System.out.println("");//sysj\ECS_plant.sysj line: 299, column: 6
                                            System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 300, column: 6
                                            S85=9;
                                            if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 305, column: 7
                                              humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 306, column: 5
                                              humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 307, column: 5
                                              if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 308, column: 8
                                                S2009=0;
                                                System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 7
                                                System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 311, column: 7
                                                System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 312, column: 7
                                                deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 313, column: 7
                                                currsigs.addElement(deHumOnZone4_5_6);
                                                active[2]=1;
                                                ends[2]=1;
                                                tdone[2]=1;
                                              }
                                              else {
                                                S2009=1;
                                                if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 316, column: 15
                                                  System.out.println("");//sysj\ECS_plant.sysj line: 318, column: 7
                                                  System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 319, column: 7
                                                  System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 320, column: 7
                                                  humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 321, column: 7
                                                  currsigs.addElement(humOnZone4_5_6);
                                                  active[2]=1;
                                                  ends[2]=1;
                                                  tdone[2]=1;
                                                }
                                                else {
                                                  System.out.println("");//sysj\ECS_plant.sysj line: 325, column: 6
                                                  System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 326, column: 6
                                                  S85=10;
                                                  active[2]=1;
                                                  ends[2]=1;
                                                  tdone[2]=1;
                                                }
                                              }
                                            }
                                            else {
                                              S85=10;
                                              active[2]=1;
                                              ends[2]=1;
                                              tdone[2]=1;
                                            }
                                          }
                                        }
                                      }
                                      else {
                                        S85=9;
                                        if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 305, column: 7
                                          humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 306, column: 5
                                          humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 307, column: 5
                                          if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 308, column: 8
                                            S2009=0;
                                            System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 7
                                            System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 311, column: 7
                                            System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 312, column: 7
                                            deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 313, column: 7
                                            currsigs.addElement(deHumOnZone4_5_6);
                                            active[2]=1;
                                            ends[2]=1;
                                            tdone[2]=1;
                                          }
                                          else {
                                            S2009=1;
                                            if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 316, column: 15
                                              System.out.println("");//sysj\ECS_plant.sysj line: 318, column: 7
                                              System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 319, column: 7
                                              System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 320, column: 7
                                              humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 321, column: 7
                                              currsigs.addElement(humOnZone4_5_6);
                                              active[2]=1;
                                              ends[2]=1;
                                              tdone[2]=1;
                                            }
                                            else {
                                              System.out.println("");//sysj\ECS_plant.sysj line: 325, column: 6
                                              System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 326, column: 6
                                              S85=10;
                                              active[2]=1;
                                              ends[2]=1;
                                              tdone[2]=1;
                                            }
                                          }
                                        }
                                        else {
                                          S85=10;
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                      }
                                    }
                                  }
                                }
                                else {
                                  S85=8;
                                  if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 279, column: 7
                                    humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 280, column: 5
                                    humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 281, column: 5
                                    if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 282, column: 8
                                      S1349=0;
                                      System.out.println("");//sysj\ECS_plant.sysj line: 284, column: 7
                                      System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 285, column: 7
                                      System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 286, column: 7
                                      deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 287, column: 7
                                      currsigs.addElement(deHumOnZone2_3);
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                    else {
                                      S1349=1;
                                      if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 290, column: 15
                                        System.out.println("");//sysj\ECS_plant.sysj line: 292, column: 7
                                        System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 293, column: 7
                                        System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 294, column: 7
                                        humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 295, column: 7
                                        currsigs.addElement(humOnZone2_3);
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                      else {
                                        System.out.println("");//sysj\ECS_plant.sysj line: 299, column: 6
                                        System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 300, column: 6
                                        S85=9;
                                        if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 305, column: 7
                                          humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 306, column: 5
                                          humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 307, column: 5
                                          if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 308, column: 8
                                            S2009=0;
                                            System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 7
                                            System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 311, column: 7
                                            System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 312, column: 7
                                            deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 313, column: 7
                                            currsigs.addElement(deHumOnZone4_5_6);
                                            active[2]=1;
                                            ends[2]=1;
                                            tdone[2]=1;
                                          }
                                          else {
                                            S2009=1;
                                            if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 316, column: 15
                                              System.out.println("");//sysj\ECS_plant.sysj line: 318, column: 7
                                              System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 319, column: 7
                                              System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 320, column: 7
                                              humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 321, column: 7
                                              currsigs.addElement(humOnZone4_5_6);
                                              active[2]=1;
                                              ends[2]=1;
                                              tdone[2]=1;
                                            }
                                            else {
                                              System.out.println("");//sysj\ECS_plant.sysj line: 325, column: 6
                                              System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 326, column: 6
                                              S85=10;
                                              active[2]=1;
                                              ends[2]=1;
                                              tdone[2]=1;
                                            }
                                          }
                                        }
                                        else {
                                          S85=10;
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                      }
                                    }
                                  }
                                  else {
                                    S85=9;
                                    if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 305, column: 7
                                      humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 306, column: 5
                                      humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 307, column: 5
                                      if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 308, column: 8
                                        S2009=0;
                                        System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 7
                                        System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 311, column: 7
                                        System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 312, column: 7
                                        deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 313, column: 7
                                        currsigs.addElement(deHumOnZone4_5_6);
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                      else {
                                        S2009=1;
                                        if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 316, column: 15
                                          System.out.println("");//sysj\ECS_plant.sysj line: 318, column: 7
                                          System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 319, column: 7
                                          System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 320, column: 7
                                          humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 321, column: 7
                                          currsigs.addElement(humOnZone4_5_6);
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                        else {
                                          System.out.println("");//sysj\ECS_plant.sysj line: 325, column: 6
                                          System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 326, column: 6
                                          S85=10;
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                      }
                                    }
                                    else {
                                      S85=10;
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
                            S85=7;
                            if(zone_thread_2 == 1 || zone_thread_2 == 7){//sysj\ECS_plant.sysj line: 253, column: 7
                              humid17_thread_2 = 0;//sysj\ECS_plant.sysj line: 254, column: 5
                              humid17_thread_2 = (humidZone1_7.getpreval() == null ? null : ((Integer)humidZone1_7.getpreval()));//sysj\ECS_plant.sysj line: 255, column: 5
                              if(humid17_thread_2 > 60){//sysj\ECS_plant.sysj line: 256, column: 8
                                S1009=0;
                                System.out.println("");//sysj\ECS_plant.sysj line: 258, column: 7
                                System.out.println("Room humidity is too high at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 259, column: 7
                                System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 260, column: 7
                                deHumOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 261, column: 7
                                currsigs.addElement(deHumOnZone1_7);
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                              else {
                                S1009=1;
                                if(humid17_thread_2 < 30){//sysj\ECS_plant.sysj line: 264, column: 15
                                  System.out.println("");//sysj\ECS_plant.sysj line: 266, column: 7
                                  System.out.println("Room humidity is too low at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 267, column: 7
                                  System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 268, column: 7
                                  humOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 269, column: 7
                                  currsigs.addElement(humOnZone1_7);
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                                else {
                                  System.out.println("");//sysj\ECS_plant.sysj line: 273, column: 6
                                  System.out.println("Room humidity is safe at" + humid17_thread_2);//sysj\ECS_plant.sysj line: 274, column: 6
                                  S85=8;
                                  if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 279, column: 7
                                    humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 280, column: 5
                                    humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 281, column: 5
                                    if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 282, column: 8
                                      S1349=0;
                                      System.out.println("");//sysj\ECS_plant.sysj line: 284, column: 7
                                      System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 285, column: 7
                                      System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 286, column: 7
                                      deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 287, column: 7
                                      currsigs.addElement(deHumOnZone2_3);
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                    else {
                                      S1349=1;
                                      if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 290, column: 15
                                        System.out.println("");//sysj\ECS_plant.sysj line: 292, column: 7
                                        System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 293, column: 7
                                        System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 294, column: 7
                                        humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 295, column: 7
                                        currsigs.addElement(humOnZone2_3);
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                      else {
                                        System.out.println("");//sysj\ECS_plant.sysj line: 299, column: 6
                                        System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 300, column: 6
                                        S85=9;
                                        if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 305, column: 7
                                          humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 306, column: 5
                                          humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 307, column: 5
                                          if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 308, column: 8
                                            S2009=0;
                                            System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 7
                                            System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 311, column: 7
                                            System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 312, column: 7
                                            deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 313, column: 7
                                            currsigs.addElement(deHumOnZone4_5_6);
                                            active[2]=1;
                                            ends[2]=1;
                                            tdone[2]=1;
                                          }
                                          else {
                                            S2009=1;
                                            if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 316, column: 15
                                              System.out.println("");//sysj\ECS_plant.sysj line: 318, column: 7
                                              System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 319, column: 7
                                              System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 320, column: 7
                                              humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 321, column: 7
                                              currsigs.addElement(humOnZone4_5_6);
                                              active[2]=1;
                                              ends[2]=1;
                                              tdone[2]=1;
                                            }
                                            else {
                                              System.out.println("");//sysj\ECS_plant.sysj line: 325, column: 6
                                              System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 326, column: 6
                                              S85=10;
                                              active[2]=1;
                                              ends[2]=1;
                                              tdone[2]=1;
                                            }
                                          }
                                        }
                                        else {
                                          S85=10;
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                      }
                                    }
                                  }
                                  else {
                                    S85=9;
                                    if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 305, column: 7
                                      humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 306, column: 5
                                      humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 307, column: 5
                                      if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 308, column: 8
                                        S2009=0;
                                        System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 7
                                        System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 311, column: 7
                                        System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 312, column: 7
                                        deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 313, column: 7
                                        currsigs.addElement(deHumOnZone4_5_6);
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                      else {
                                        S2009=1;
                                        if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 316, column: 15
                                          System.out.println("");//sysj\ECS_plant.sysj line: 318, column: 7
                                          System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 319, column: 7
                                          System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 320, column: 7
                                          humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 321, column: 7
                                          currsigs.addElement(humOnZone4_5_6);
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                        else {
                                          System.out.println("");//sysj\ECS_plant.sysj line: 325, column: 6
                                          System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 326, column: 6
                                          S85=10;
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                      }
                                    }
                                    else {
                                      S85=10;
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                  }
                                }
                              }
                            }
                            else {
                              S85=8;
                              if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 279, column: 7
                                humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 280, column: 5
                                humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 281, column: 5
                                if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 282, column: 8
                                  S1349=0;
                                  System.out.println("");//sysj\ECS_plant.sysj line: 284, column: 7
                                  System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 285, column: 7
                                  System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 286, column: 7
                                  deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 287, column: 7
                                  currsigs.addElement(deHumOnZone2_3);
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                                else {
                                  S1349=1;
                                  if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 290, column: 15
                                    System.out.println("");//sysj\ECS_plant.sysj line: 292, column: 7
                                    System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 293, column: 7
                                    System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 294, column: 7
                                    humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 295, column: 7
                                    currsigs.addElement(humOnZone2_3);
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                  else {
                                    System.out.println("");//sysj\ECS_plant.sysj line: 299, column: 6
                                    System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 300, column: 6
                                    S85=9;
                                    if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 305, column: 7
                                      humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 306, column: 5
                                      humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 307, column: 5
                                      if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 308, column: 8
                                        S2009=0;
                                        System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 7
                                        System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 311, column: 7
                                        System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 312, column: 7
                                        deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 313, column: 7
                                        currsigs.addElement(deHumOnZone4_5_6);
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                      else {
                                        S2009=1;
                                        if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 316, column: 15
                                          System.out.println("");//sysj\ECS_plant.sysj line: 318, column: 7
                                          System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 319, column: 7
                                          System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 320, column: 7
                                          humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 321, column: 7
                                          currsigs.addElement(humOnZone4_5_6);
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                        else {
                                          System.out.println("");//sysj\ECS_plant.sysj line: 325, column: 6
                                          System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 326, column: 6
                                          S85=10;
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                      }
                                    }
                                    else {
                                      S85=10;
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                  }
                                }
                              }
                              else {
                                S85=9;
                                if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 305, column: 7
                                  humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 306, column: 5
                                  humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 307, column: 5
                                  if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 308, column: 8
                                    S2009=0;
                                    System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 7
                                    System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 311, column: 7
                                    System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 312, column: 7
                                    deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 313, column: 7
                                    currsigs.addElement(deHumOnZone4_5_6);
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                  else {
                                    S2009=1;
                                    if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 316, column: 15
                                      System.out.println("");//sysj\ECS_plant.sysj line: 318, column: 7
                                      System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 319, column: 7
                                      System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 320, column: 7
                                      humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 321, column: 7
                                      currsigs.addElement(humOnZone4_5_6);
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                    else {
                                      System.out.println("");//sysj\ECS_plant.sysj line: 325, column: 6
                                      System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 326, column: 6
                                      S85=10;
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                  }
                                }
                                else {
                                  S85=10;
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
                      S85=6;
                      if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 228, column: 7
                        temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 229, column: 5
                        temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 230, column: 5
                        if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 231, column: 8
                          S829=0;
                          System.out.println("");//sysj\ECS_plant.sysj line: 233, column: 7
                          System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 234, column: 7
                          airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 235, column: 7
                          currsigs.addElement(airOnZone4_5_6);
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          S829=1;
                          if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 238, column: 15
                            System.out.println("");//sysj\ECS_plant.sysj line: 240, column: 7
                            System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 241, column: 7
                            heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 242, column: 7
                            currsigs.addElement(heatOnZone4_5_6);
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            System.out.println("");//sysj\ECS_plant.sysj line: 246, column: 6
                            System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 247, column: 6
                            S85=7;
                            if(zone_thread_2 == 1 || zone_thread_2 == 7){//sysj\ECS_plant.sysj line: 253, column: 7
                              humid17_thread_2 = 0;//sysj\ECS_plant.sysj line: 254, column: 5
                              humid17_thread_2 = (humidZone1_7.getpreval() == null ? null : ((Integer)humidZone1_7.getpreval()));//sysj\ECS_plant.sysj line: 255, column: 5
                              if(humid17_thread_2 > 60){//sysj\ECS_plant.sysj line: 256, column: 8
                                S1009=0;
                                System.out.println("");//sysj\ECS_plant.sysj line: 258, column: 7
                                System.out.println("Room humidity is too high at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 259, column: 7
                                System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 260, column: 7
                                deHumOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 261, column: 7
                                currsigs.addElement(deHumOnZone1_7);
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                              else {
                                S1009=1;
                                if(humid17_thread_2 < 30){//sysj\ECS_plant.sysj line: 264, column: 15
                                  System.out.println("");//sysj\ECS_plant.sysj line: 266, column: 7
                                  System.out.println("Room humidity is too low at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 267, column: 7
                                  System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 268, column: 7
                                  humOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 269, column: 7
                                  currsigs.addElement(humOnZone1_7);
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                                else {
                                  System.out.println("");//sysj\ECS_plant.sysj line: 273, column: 6
                                  System.out.println("Room humidity is safe at" + humid17_thread_2);//sysj\ECS_plant.sysj line: 274, column: 6
                                  S85=8;
                                  if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 279, column: 7
                                    humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 280, column: 5
                                    humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 281, column: 5
                                    if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 282, column: 8
                                      S1349=0;
                                      System.out.println("");//sysj\ECS_plant.sysj line: 284, column: 7
                                      System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 285, column: 7
                                      System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 286, column: 7
                                      deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 287, column: 7
                                      currsigs.addElement(deHumOnZone2_3);
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                    else {
                                      S1349=1;
                                      if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 290, column: 15
                                        System.out.println("");//sysj\ECS_plant.sysj line: 292, column: 7
                                        System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 293, column: 7
                                        System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 294, column: 7
                                        humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 295, column: 7
                                        currsigs.addElement(humOnZone2_3);
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                      else {
                                        System.out.println("");//sysj\ECS_plant.sysj line: 299, column: 6
                                        System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 300, column: 6
                                        S85=9;
                                        if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 305, column: 7
                                          humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 306, column: 5
                                          humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 307, column: 5
                                          if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 308, column: 8
                                            S2009=0;
                                            System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 7
                                            System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 311, column: 7
                                            System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 312, column: 7
                                            deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 313, column: 7
                                            currsigs.addElement(deHumOnZone4_5_6);
                                            active[2]=1;
                                            ends[2]=1;
                                            tdone[2]=1;
                                          }
                                          else {
                                            S2009=1;
                                            if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 316, column: 15
                                              System.out.println("");//sysj\ECS_plant.sysj line: 318, column: 7
                                              System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 319, column: 7
                                              System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 320, column: 7
                                              humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 321, column: 7
                                              currsigs.addElement(humOnZone4_5_6);
                                              active[2]=1;
                                              ends[2]=1;
                                              tdone[2]=1;
                                            }
                                            else {
                                              System.out.println("");//sysj\ECS_plant.sysj line: 325, column: 6
                                              System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 326, column: 6
                                              S85=10;
                                              active[2]=1;
                                              ends[2]=1;
                                              tdone[2]=1;
                                            }
                                          }
                                        }
                                        else {
                                          S85=10;
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                      }
                                    }
                                  }
                                  else {
                                    S85=9;
                                    if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 305, column: 7
                                      humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 306, column: 5
                                      humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 307, column: 5
                                      if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 308, column: 8
                                        S2009=0;
                                        System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 7
                                        System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 311, column: 7
                                        System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 312, column: 7
                                        deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 313, column: 7
                                        currsigs.addElement(deHumOnZone4_5_6);
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                      else {
                                        S2009=1;
                                        if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 316, column: 15
                                          System.out.println("");//sysj\ECS_plant.sysj line: 318, column: 7
                                          System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 319, column: 7
                                          System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 320, column: 7
                                          humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 321, column: 7
                                          currsigs.addElement(humOnZone4_5_6);
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                        else {
                                          System.out.println("");//sysj\ECS_plant.sysj line: 325, column: 6
                                          System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 326, column: 6
                                          S85=10;
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                      }
                                    }
                                    else {
                                      S85=10;
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                  }
                                }
                              }
                            }
                            else {
                              S85=8;
                              if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 279, column: 7
                                humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 280, column: 5
                                humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 281, column: 5
                                if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 282, column: 8
                                  S1349=0;
                                  System.out.println("");//sysj\ECS_plant.sysj line: 284, column: 7
                                  System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 285, column: 7
                                  System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 286, column: 7
                                  deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 287, column: 7
                                  currsigs.addElement(deHumOnZone2_3);
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                                else {
                                  S1349=1;
                                  if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 290, column: 15
                                    System.out.println("");//sysj\ECS_plant.sysj line: 292, column: 7
                                    System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 293, column: 7
                                    System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 294, column: 7
                                    humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 295, column: 7
                                    currsigs.addElement(humOnZone2_3);
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                  else {
                                    System.out.println("");//sysj\ECS_plant.sysj line: 299, column: 6
                                    System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 300, column: 6
                                    S85=9;
                                    if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 305, column: 7
                                      humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 306, column: 5
                                      humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 307, column: 5
                                      if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 308, column: 8
                                        S2009=0;
                                        System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 7
                                        System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 311, column: 7
                                        System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 312, column: 7
                                        deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 313, column: 7
                                        currsigs.addElement(deHumOnZone4_5_6);
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                      else {
                                        S2009=1;
                                        if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 316, column: 15
                                          System.out.println("");//sysj\ECS_plant.sysj line: 318, column: 7
                                          System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 319, column: 7
                                          System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 320, column: 7
                                          humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 321, column: 7
                                          currsigs.addElement(humOnZone4_5_6);
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                        else {
                                          System.out.println("");//sysj\ECS_plant.sysj line: 325, column: 6
                                          System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 326, column: 6
                                          S85=10;
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                      }
                                    }
                                    else {
                                      S85=10;
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                  }
                                }
                              }
                              else {
                                S85=9;
                                if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 305, column: 7
                                  humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 306, column: 5
                                  humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 307, column: 5
                                  if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 308, column: 8
                                    S2009=0;
                                    System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 7
                                    System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 311, column: 7
                                    System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 312, column: 7
                                    deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 313, column: 7
                                    currsigs.addElement(deHumOnZone4_5_6);
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                  else {
                                    S2009=1;
                                    if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 316, column: 15
                                      System.out.println("");//sysj\ECS_plant.sysj line: 318, column: 7
                                      System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 319, column: 7
                                      System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 320, column: 7
                                      humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 321, column: 7
                                      currsigs.addElement(humOnZone4_5_6);
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                    else {
                                      System.out.println("");//sysj\ECS_plant.sysj line: 325, column: 6
                                      System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 326, column: 6
                                      S85=10;
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                  }
                                }
                                else {
                                  S85=10;
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
                        S85=7;
                        if(zone_thread_2 == 1 || zone_thread_2 == 7){//sysj\ECS_plant.sysj line: 253, column: 7
                          humid17_thread_2 = 0;//sysj\ECS_plant.sysj line: 254, column: 5
                          humid17_thread_2 = (humidZone1_7.getpreval() == null ? null : ((Integer)humidZone1_7.getpreval()));//sysj\ECS_plant.sysj line: 255, column: 5
                          if(humid17_thread_2 > 60){//sysj\ECS_plant.sysj line: 256, column: 8
                            S1009=0;
                            System.out.println("");//sysj\ECS_plant.sysj line: 258, column: 7
                            System.out.println("Room humidity is too high at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 259, column: 7
                            System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 260, column: 7
                            deHumOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 261, column: 7
                            currsigs.addElement(deHumOnZone1_7);
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S1009=1;
                            if(humid17_thread_2 < 30){//sysj\ECS_plant.sysj line: 264, column: 15
                              System.out.println("");//sysj\ECS_plant.sysj line: 266, column: 7
                              System.out.println("Room humidity is too low at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 267, column: 7
                              System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 268, column: 7
                              humOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 269, column: 7
                              currsigs.addElement(humOnZone1_7);
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              System.out.println("");//sysj\ECS_plant.sysj line: 273, column: 6
                              System.out.println("Room humidity is safe at" + humid17_thread_2);//sysj\ECS_plant.sysj line: 274, column: 6
                              S85=8;
                              if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 279, column: 7
                                humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 280, column: 5
                                humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 281, column: 5
                                if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 282, column: 8
                                  S1349=0;
                                  System.out.println("");//sysj\ECS_plant.sysj line: 284, column: 7
                                  System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 285, column: 7
                                  System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 286, column: 7
                                  deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 287, column: 7
                                  currsigs.addElement(deHumOnZone2_3);
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                                else {
                                  S1349=1;
                                  if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 290, column: 15
                                    System.out.println("");//sysj\ECS_plant.sysj line: 292, column: 7
                                    System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 293, column: 7
                                    System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 294, column: 7
                                    humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 295, column: 7
                                    currsigs.addElement(humOnZone2_3);
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                  else {
                                    System.out.println("");//sysj\ECS_plant.sysj line: 299, column: 6
                                    System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 300, column: 6
                                    S85=9;
                                    if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 305, column: 7
                                      humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 306, column: 5
                                      humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 307, column: 5
                                      if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 308, column: 8
                                        S2009=0;
                                        System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 7
                                        System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 311, column: 7
                                        System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 312, column: 7
                                        deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 313, column: 7
                                        currsigs.addElement(deHumOnZone4_5_6);
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                      else {
                                        S2009=1;
                                        if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 316, column: 15
                                          System.out.println("");//sysj\ECS_plant.sysj line: 318, column: 7
                                          System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 319, column: 7
                                          System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 320, column: 7
                                          humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 321, column: 7
                                          currsigs.addElement(humOnZone4_5_6);
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                        else {
                                          System.out.println("");//sysj\ECS_plant.sysj line: 325, column: 6
                                          System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 326, column: 6
                                          S85=10;
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                      }
                                    }
                                    else {
                                      S85=10;
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                  }
                                }
                              }
                              else {
                                S85=9;
                                if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 305, column: 7
                                  humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 306, column: 5
                                  humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 307, column: 5
                                  if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 308, column: 8
                                    S2009=0;
                                    System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 7
                                    System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 311, column: 7
                                    System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 312, column: 7
                                    deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 313, column: 7
                                    currsigs.addElement(deHumOnZone4_5_6);
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                  else {
                                    S2009=1;
                                    if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 316, column: 15
                                      System.out.println("");//sysj\ECS_plant.sysj line: 318, column: 7
                                      System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 319, column: 7
                                      System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 320, column: 7
                                      humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 321, column: 7
                                      currsigs.addElement(humOnZone4_5_6);
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                    else {
                                      System.out.println("");//sysj\ECS_plant.sysj line: 325, column: 6
                                      System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 326, column: 6
                                      S85=10;
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                  }
                                }
                                else {
                                  S85=10;
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                              }
                            }
                          }
                        }
                        else {
                          S85=8;
                          if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 279, column: 7
                            humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 280, column: 5
                            humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 281, column: 5
                            if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 282, column: 8
                              S1349=0;
                              System.out.println("");//sysj\ECS_plant.sysj line: 284, column: 7
                              System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 285, column: 7
                              System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 286, column: 7
                              deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 287, column: 7
                              currsigs.addElement(deHumOnZone2_3);
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S1349=1;
                              if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 290, column: 15
                                System.out.println("");//sysj\ECS_plant.sysj line: 292, column: 7
                                System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 293, column: 7
                                System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 294, column: 7
                                humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 295, column: 7
                                currsigs.addElement(humOnZone2_3);
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                              else {
                                System.out.println("");//sysj\ECS_plant.sysj line: 299, column: 6
                                System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 300, column: 6
                                S85=9;
                                if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 305, column: 7
                                  humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 306, column: 5
                                  humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 307, column: 5
                                  if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 308, column: 8
                                    S2009=0;
                                    System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 7
                                    System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 311, column: 7
                                    System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 312, column: 7
                                    deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 313, column: 7
                                    currsigs.addElement(deHumOnZone4_5_6);
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                  else {
                                    S2009=1;
                                    if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 316, column: 15
                                      System.out.println("");//sysj\ECS_plant.sysj line: 318, column: 7
                                      System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 319, column: 7
                                      System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 320, column: 7
                                      humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 321, column: 7
                                      currsigs.addElement(humOnZone4_5_6);
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                    else {
                                      System.out.println("");//sysj\ECS_plant.sysj line: 325, column: 6
                                      System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 326, column: 6
                                      S85=10;
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                  }
                                }
                                else {
                                  S85=10;
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                              }
                            }
                          }
                          else {
                            S85=9;
                            if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 305, column: 7
                              humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 306, column: 5
                              humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 307, column: 5
                              if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 308, column: 8
                                S2009=0;
                                System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 7
                                System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 311, column: 7
                                System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 312, column: 7
                                deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 313, column: 7
                                currsigs.addElement(deHumOnZone4_5_6);
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                              else {
                                S2009=1;
                                if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 316, column: 15
                                  System.out.println("");//sysj\ECS_plant.sysj line: 318, column: 7
                                  System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 319, column: 7
                                  System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 320, column: 7
                                  humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 321, column: 7
                                  currsigs.addElement(humOnZone4_5_6);
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                                else {
                                  System.out.println("");//sysj\ECS_plant.sysj line: 325, column: 6
                                  System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 326, column: 6
                                  S85=10;
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                              }
                            }
                            else {
                              S85=10;
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
                S85=5;
                if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 205, column: 7
                  temp23_thread_2 = 0;//sysj\ECS_plant.sysj line: 206, column: 5
                  temp23_thread_2 = (tempZone2_3.getpreval() == null ? null : ((Integer)tempZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 207, column: 5
                  if(temp23_thread_2 > 22){//sysj\ECS_plant.sysj line: 208, column: 8
                    S729=0;
                    System.out.println("");//sysj\ECS_plant.sysj line: 210, column: 7
                    System.out.println("Room temperature is too high at " + temp23_thread_2);//sysj\ECS_plant.sysj line: 211, column: 7
                    airOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 212, column: 7
                    currsigs.addElement(airOnZone2_3);
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S729=1;
                    if(temp23_thread_2 < 21){//sysj\ECS_plant.sysj line: 215, column: 15
                      heatOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 217, column: 7
                      currsigs.addElement(heatOnZone2_3);
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      System.out.println("");//sysj\ECS_plant.sysj line: 221, column: 6
                      System.out.println("Room temperature is safe at" + temp23_thread_2);//sysj\ECS_plant.sysj line: 222, column: 6
                      S85=6;
                      if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 228, column: 7
                        temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 229, column: 5
                        temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 230, column: 5
                        if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 231, column: 8
                          S829=0;
                          System.out.println("");//sysj\ECS_plant.sysj line: 233, column: 7
                          System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 234, column: 7
                          airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 235, column: 7
                          currsigs.addElement(airOnZone4_5_6);
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          S829=1;
                          if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 238, column: 15
                            System.out.println("");//sysj\ECS_plant.sysj line: 240, column: 7
                            System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 241, column: 7
                            heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 242, column: 7
                            currsigs.addElement(heatOnZone4_5_6);
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            System.out.println("");//sysj\ECS_plant.sysj line: 246, column: 6
                            System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 247, column: 6
                            S85=7;
                            if(zone_thread_2 == 1 || zone_thread_2 == 7){//sysj\ECS_plant.sysj line: 253, column: 7
                              humid17_thread_2 = 0;//sysj\ECS_plant.sysj line: 254, column: 5
                              humid17_thread_2 = (humidZone1_7.getpreval() == null ? null : ((Integer)humidZone1_7.getpreval()));//sysj\ECS_plant.sysj line: 255, column: 5
                              if(humid17_thread_2 > 60){//sysj\ECS_plant.sysj line: 256, column: 8
                                S1009=0;
                                System.out.println("");//sysj\ECS_plant.sysj line: 258, column: 7
                                System.out.println("Room humidity is too high at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 259, column: 7
                                System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 260, column: 7
                                deHumOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 261, column: 7
                                currsigs.addElement(deHumOnZone1_7);
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                              else {
                                S1009=1;
                                if(humid17_thread_2 < 30){//sysj\ECS_plant.sysj line: 264, column: 15
                                  System.out.println("");//sysj\ECS_plant.sysj line: 266, column: 7
                                  System.out.println("Room humidity is too low at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 267, column: 7
                                  System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 268, column: 7
                                  humOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 269, column: 7
                                  currsigs.addElement(humOnZone1_7);
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                                else {
                                  System.out.println("");//sysj\ECS_plant.sysj line: 273, column: 6
                                  System.out.println("Room humidity is safe at" + humid17_thread_2);//sysj\ECS_plant.sysj line: 274, column: 6
                                  S85=8;
                                  if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 279, column: 7
                                    humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 280, column: 5
                                    humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 281, column: 5
                                    if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 282, column: 8
                                      S1349=0;
                                      System.out.println("");//sysj\ECS_plant.sysj line: 284, column: 7
                                      System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 285, column: 7
                                      System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 286, column: 7
                                      deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 287, column: 7
                                      currsigs.addElement(deHumOnZone2_3);
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                    else {
                                      S1349=1;
                                      if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 290, column: 15
                                        System.out.println("");//sysj\ECS_plant.sysj line: 292, column: 7
                                        System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 293, column: 7
                                        System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 294, column: 7
                                        humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 295, column: 7
                                        currsigs.addElement(humOnZone2_3);
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                      else {
                                        System.out.println("");//sysj\ECS_plant.sysj line: 299, column: 6
                                        System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 300, column: 6
                                        S85=9;
                                        if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 305, column: 7
                                          humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 306, column: 5
                                          humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 307, column: 5
                                          if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 308, column: 8
                                            S2009=0;
                                            System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 7
                                            System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 311, column: 7
                                            System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 312, column: 7
                                            deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 313, column: 7
                                            currsigs.addElement(deHumOnZone4_5_6);
                                            active[2]=1;
                                            ends[2]=1;
                                            tdone[2]=1;
                                          }
                                          else {
                                            S2009=1;
                                            if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 316, column: 15
                                              System.out.println("");//sysj\ECS_plant.sysj line: 318, column: 7
                                              System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 319, column: 7
                                              System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 320, column: 7
                                              humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 321, column: 7
                                              currsigs.addElement(humOnZone4_5_6);
                                              active[2]=1;
                                              ends[2]=1;
                                              tdone[2]=1;
                                            }
                                            else {
                                              System.out.println("");//sysj\ECS_plant.sysj line: 325, column: 6
                                              System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 326, column: 6
                                              S85=10;
                                              active[2]=1;
                                              ends[2]=1;
                                              tdone[2]=1;
                                            }
                                          }
                                        }
                                        else {
                                          S85=10;
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                      }
                                    }
                                  }
                                  else {
                                    S85=9;
                                    if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 305, column: 7
                                      humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 306, column: 5
                                      humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 307, column: 5
                                      if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 308, column: 8
                                        S2009=0;
                                        System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 7
                                        System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 311, column: 7
                                        System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 312, column: 7
                                        deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 313, column: 7
                                        currsigs.addElement(deHumOnZone4_5_6);
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                      else {
                                        S2009=1;
                                        if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 316, column: 15
                                          System.out.println("");//sysj\ECS_plant.sysj line: 318, column: 7
                                          System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 319, column: 7
                                          System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 320, column: 7
                                          humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 321, column: 7
                                          currsigs.addElement(humOnZone4_5_6);
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                        else {
                                          System.out.println("");//sysj\ECS_plant.sysj line: 325, column: 6
                                          System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 326, column: 6
                                          S85=10;
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                      }
                                    }
                                    else {
                                      S85=10;
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                  }
                                }
                              }
                            }
                            else {
                              S85=8;
                              if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 279, column: 7
                                humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 280, column: 5
                                humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 281, column: 5
                                if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 282, column: 8
                                  S1349=0;
                                  System.out.println("");//sysj\ECS_plant.sysj line: 284, column: 7
                                  System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 285, column: 7
                                  System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 286, column: 7
                                  deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 287, column: 7
                                  currsigs.addElement(deHumOnZone2_3);
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                                else {
                                  S1349=1;
                                  if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 290, column: 15
                                    System.out.println("");//sysj\ECS_plant.sysj line: 292, column: 7
                                    System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 293, column: 7
                                    System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 294, column: 7
                                    humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 295, column: 7
                                    currsigs.addElement(humOnZone2_3);
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                  else {
                                    System.out.println("");//sysj\ECS_plant.sysj line: 299, column: 6
                                    System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 300, column: 6
                                    S85=9;
                                    if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 305, column: 7
                                      humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 306, column: 5
                                      humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 307, column: 5
                                      if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 308, column: 8
                                        S2009=0;
                                        System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 7
                                        System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 311, column: 7
                                        System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 312, column: 7
                                        deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 313, column: 7
                                        currsigs.addElement(deHumOnZone4_5_6);
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                      else {
                                        S2009=1;
                                        if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 316, column: 15
                                          System.out.println("");//sysj\ECS_plant.sysj line: 318, column: 7
                                          System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 319, column: 7
                                          System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 320, column: 7
                                          humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 321, column: 7
                                          currsigs.addElement(humOnZone4_5_6);
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                        else {
                                          System.out.println("");//sysj\ECS_plant.sysj line: 325, column: 6
                                          System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 326, column: 6
                                          S85=10;
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                      }
                                    }
                                    else {
                                      S85=10;
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                  }
                                }
                              }
                              else {
                                S85=9;
                                if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 305, column: 7
                                  humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 306, column: 5
                                  humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 307, column: 5
                                  if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 308, column: 8
                                    S2009=0;
                                    System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 7
                                    System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 311, column: 7
                                    System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 312, column: 7
                                    deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 313, column: 7
                                    currsigs.addElement(deHumOnZone4_5_6);
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                  else {
                                    S2009=1;
                                    if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 316, column: 15
                                      System.out.println("");//sysj\ECS_plant.sysj line: 318, column: 7
                                      System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 319, column: 7
                                      System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 320, column: 7
                                      humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 321, column: 7
                                      currsigs.addElement(humOnZone4_5_6);
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                    else {
                                      System.out.println("");//sysj\ECS_plant.sysj line: 325, column: 6
                                      System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 326, column: 6
                                      S85=10;
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                  }
                                }
                                else {
                                  S85=10;
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
                        S85=7;
                        if(zone_thread_2 == 1 || zone_thread_2 == 7){//sysj\ECS_plant.sysj line: 253, column: 7
                          humid17_thread_2 = 0;//sysj\ECS_plant.sysj line: 254, column: 5
                          humid17_thread_2 = (humidZone1_7.getpreval() == null ? null : ((Integer)humidZone1_7.getpreval()));//sysj\ECS_plant.sysj line: 255, column: 5
                          if(humid17_thread_2 > 60){//sysj\ECS_plant.sysj line: 256, column: 8
                            S1009=0;
                            System.out.println("");//sysj\ECS_plant.sysj line: 258, column: 7
                            System.out.println("Room humidity is too high at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 259, column: 7
                            System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 260, column: 7
                            deHumOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 261, column: 7
                            currsigs.addElement(deHumOnZone1_7);
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S1009=1;
                            if(humid17_thread_2 < 30){//sysj\ECS_plant.sysj line: 264, column: 15
                              System.out.println("");//sysj\ECS_plant.sysj line: 266, column: 7
                              System.out.println("Room humidity is too low at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 267, column: 7
                              System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 268, column: 7
                              humOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 269, column: 7
                              currsigs.addElement(humOnZone1_7);
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              System.out.println("");//sysj\ECS_plant.sysj line: 273, column: 6
                              System.out.println("Room humidity is safe at" + humid17_thread_2);//sysj\ECS_plant.sysj line: 274, column: 6
                              S85=8;
                              if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 279, column: 7
                                humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 280, column: 5
                                humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 281, column: 5
                                if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 282, column: 8
                                  S1349=0;
                                  System.out.println("");//sysj\ECS_plant.sysj line: 284, column: 7
                                  System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 285, column: 7
                                  System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 286, column: 7
                                  deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 287, column: 7
                                  currsigs.addElement(deHumOnZone2_3);
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                                else {
                                  S1349=1;
                                  if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 290, column: 15
                                    System.out.println("");//sysj\ECS_plant.sysj line: 292, column: 7
                                    System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 293, column: 7
                                    System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 294, column: 7
                                    humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 295, column: 7
                                    currsigs.addElement(humOnZone2_3);
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                  else {
                                    System.out.println("");//sysj\ECS_plant.sysj line: 299, column: 6
                                    System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 300, column: 6
                                    S85=9;
                                    if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 305, column: 7
                                      humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 306, column: 5
                                      humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 307, column: 5
                                      if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 308, column: 8
                                        S2009=0;
                                        System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 7
                                        System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 311, column: 7
                                        System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 312, column: 7
                                        deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 313, column: 7
                                        currsigs.addElement(deHumOnZone4_5_6);
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                      else {
                                        S2009=1;
                                        if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 316, column: 15
                                          System.out.println("");//sysj\ECS_plant.sysj line: 318, column: 7
                                          System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 319, column: 7
                                          System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 320, column: 7
                                          humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 321, column: 7
                                          currsigs.addElement(humOnZone4_5_6);
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                        else {
                                          System.out.println("");//sysj\ECS_plant.sysj line: 325, column: 6
                                          System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 326, column: 6
                                          S85=10;
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                      }
                                    }
                                    else {
                                      S85=10;
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                  }
                                }
                              }
                              else {
                                S85=9;
                                if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 305, column: 7
                                  humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 306, column: 5
                                  humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 307, column: 5
                                  if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 308, column: 8
                                    S2009=0;
                                    System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 7
                                    System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 311, column: 7
                                    System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 312, column: 7
                                    deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 313, column: 7
                                    currsigs.addElement(deHumOnZone4_5_6);
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                  else {
                                    S2009=1;
                                    if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 316, column: 15
                                      System.out.println("");//sysj\ECS_plant.sysj line: 318, column: 7
                                      System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 319, column: 7
                                      System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 320, column: 7
                                      humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 321, column: 7
                                      currsigs.addElement(humOnZone4_5_6);
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                    else {
                                      System.out.println("");//sysj\ECS_plant.sysj line: 325, column: 6
                                      System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 326, column: 6
                                      S85=10;
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                  }
                                }
                                else {
                                  S85=10;
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                              }
                            }
                          }
                        }
                        else {
                          S85=8;
                          if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 279, column: 7
                            humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 280, column: 5
                            humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 281, column: 5
                            if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 282, column: 8
                              S1349=0;
                              System.out.println("");//sysj\ECS_plant.sysj line: 284, column: 7
                              System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 285, column: 7
                              System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 286, column: 7
                              deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 287, column: 7
                              currsigs.addElement(deHumOnZone2_3);
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S1349=1;
                              if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 290, column: 15
                                System.out.println("");//sysj\ECS_plant.sysj line: 292, column: 7
                                System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 293, column: 7
                                System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 294, column: 7
                                humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 295, column: 7
                                currsigs.addElement(humOnZone2_3);
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                              else {
                                System.out.println("");//sysj\ECS_plant.sysj line: 299, column: 6
                                System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 300, column: 6
                                S85=9;
                                if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 305, column: 7
                                  humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 306, column: 5
                                  humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 307, column: 5
                                  if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 308, column: 8
                                    S2009=0;
                                    System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 7
                                    System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 311, column: 7
                                    System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 312, column: 7
                                    deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 313, column: 7
                                    currsigs.addElement(deHumOnZone4_5_6);
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                  else {
                                    S2009=1;
                                    if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 316, column: 15
                                      System.out.println("");//sysj\ECS_plant.sysj line: 318, column: 7
                                      System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 319, column: 7
                                      System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 320, column: 7
                                      humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 321, column: 7
                                      currsigs.addElement(humOnZone4_5_6);
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                    else {
                                      System.out.println("");//sysj\ECS_plant.sysj line: 325, column: 6
                                      System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 326, column: 6
                                      S85=10;
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                  }
                                }
                                else {
                                  S85=10;
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                              }
                            }
                          }
                          else {
                            S85=9;
                            if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 305, column: 7
                              humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 306, column: 5
                              humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 307, column: 5
                              if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 308, column: 8
                                S2009=0;
                                System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 7
                                System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 311, column: 7
                                System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 312, column: 7
                                deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 313, column: 7
                                currsigs.addElement(deHumOnZone4_5_6);
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                              else {
                                S2009=1;
                                if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 316, column: 15
                                  System.out.println("");//sysj\ECS_plant.sysj line: 318, column: 7
                                  System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 319, column: 7
                                  System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 320, column: 7
                                  humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 321, column: 7
                                  currsigs.addElement(humOnZone4_5_6);
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                                else {
                                  System.out.println("");//sysj\ECS_plant.sysj line: 325, column: 6
                                  System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 326, column: 6
                                  S85=10;
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                              }
                            }
                            else {
                              S85=10;
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
                  S85=6;
                  if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 228, column: 7
                    temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 229, column: 5
                    temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 230, column: 5
                    if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 231, column: 8
                      S829=0;
                      System.out.println("");//sysj\ECS_plant.sysj line: 233, column: 7
                      System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 234, column: 7
                      airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 235, column: 7
                      currsigs.addElement(airOnZone4_5_6);
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S829=1;
                      if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 238, column: 15
                        System.out.println("");//sysj\ECS_plant.sysj line: 240, column: 7
                        System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 241, column: 7
                        heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 242, column: 7
                        currsigs.addElement(heatOnZone4_5_6);
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
                        System.out.println("");//sysj\ECS_plant.sysj line: 246, column: 6
                        System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 247, column: 6
                        S85=7;
                        if(zone_thread_2 == 1 || zone_thread_2 == 7){//sysj\ECS_plant.sysj line: 253, column: 7
                          humid17_thread_2 = 0;//sysj\ECS_plant.sysj line: 254, column: 5
                          humid17_thread_2 = (humidZone1_7.getpreval() == null ? null : ((Integer)humidZone1_7.getpreval()));//sysj\ECS_plant.sysj line: 255, column: 5
                          if(humid17_thread_2 > 60){//sysj\ECS_plant.sysj line: 256, column: 8
                            S1009=0;
                            System.out.println("");//sysj\ECS_plant.sysj line: 258, column: 7
                            System.out.println("Room humidity is too high at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 259, column: 7
                            System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 260, column: 7
                            deHumOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 261, column: 7
                            currsigs.addElement(deHumOnZone1_7);
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S1009=1;
                            if(humid17_thread_2 < 30){//sysj\ECS_plant.sysj line: 264, column: 15
                              System.out.println("");//sysj\ECS_plant.sysj line: 266, column: 7
                              System.out.println("Room humidity is too low at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 267, column: 7
                              System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 268, column: 7
                              humOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 269, column: 7
                              currsigs.addElement(humOnZone1_7);
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              System.out.println("");//sysj\ECS_plant.sysj line: 273, column: 6
                              System.out.println("Room humidity is safe at" + humid17_thread_2);//sysj\ECS_plant.sysj line: 274, column: 6
                              S85=8;
                              if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 279, column: 7
                                humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 280, column: 5
                                humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 281, column: 5
                                if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 282, column: 8
                                  S1349=0;
                                  System.out.println("");//sysj\ECS_plant.sysj line: 284, column: 7
                                  System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 285, column: 7
                                  System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 286, column: 7
                                  deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 287, column: 7
                                  currsigs.addElement(deHumOnZone2_3);
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                                else {
                                  S1349=1;
                                  if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 290, column: 15
                                    System.out.println("");//sysj\ECS_plant.sysj line: 292, column: 7
                                    System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 293, column: 7
                                    System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 294, column: 7
                                    humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 295, column: 7
                                    currsigs.addElement(humOnZone2_3);
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                  else {
                                    System.out.println("");//sysj\ECS_plant.sysj line: 299, column: 6
                                    System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 300, column: 6
                                    S85=9;
                                    if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 305, column: 7
                                      humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 306, column: 5
                                      humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 307, column: 5
                                      if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 308, column: 8
                                        S2009=0;
                                        System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 7
                                        System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 311, column: 7
                                        System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 312, column: 7
                                        deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 313, column: 7
                                        currsigs.addElement(deHumOnZone4_5_6);
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                      else {
                                        S2009=1;
                                        if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 316, column: 15
                                          System.out.println("");//sysj\ECS_plant.sysj line: 318, column: 7
                                          System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 319, column: 7
                                          System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 320, column: 7
                                          humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 321, column: 7
                                          currsigs.addElement(humOnZone4_5_6);
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                        else {
                                          System.out.println("");//sysj\ECS_plant.sysj line: 325, column: 6
                                          System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 326, column: 6
                                          S85=10;
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                      }
                                    }
                                    else {
                                      S85=10;
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                  }
                                }
                              }
                              else {
                                S85=9;
                                if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 305, column: 7
                                  humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 306, column: 5
                                  humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 307, column: 5
                                  if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 308, column: 8
                                    S2009=0;
                                    System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 7
                                    System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 311, column: 7
                                    System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 312, column: 7
                                    deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 313, column: 7
                                    currsigs.addElement(deHumOnZone4_5_6);
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                  else {
                                    S2009=1;
                                    if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 316, column: 15
                                      System.out.println("");//sysj\ECS_plant.sysj line: 318, column: 7
                                      System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 319, column: 7
                                      System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 320, column: 7
                                      humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 321, column: 7
                                      currsigs.addElement(humOnZone4_5_6);
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                    else {
                                      System.out.println("");//sysj\ECS_plant.sysj line: 325, column: 6
                                      System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 326, column: 6
                                      S85=10;
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                  }
                                }
                                else {
                                  S85=10;
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                              }
                            }
                          }
                        }
                        else {
                          S85=8;
                          if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 279, column: 7
                            humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 280, column: 5
                            humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 281, column: 5
                            if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 282, column: 8
                              S1349=0;
                              System.out.println("");//sysj\ECS_plant.sysj line: 284, column: 7
                              System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 285, column: 7
                              System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 286, column: 7
                              deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 287, column: 7
                              currsigs.addElement(deHumOnZone2_3);
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S1349=1;
                              if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 290, column: 15
                                System.out.println("");//sysj\ECS_plant.sysj line: 292, column: 7
                                System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 293, column: 7
                                System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 294, column: 7
                                humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 295, column: 7
                                currsigs.addElement(humOnZone2_3);
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                              else {
                                System.out.println("");//sysj\ECS_plant.sysj line: 299, column: 6
                                System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 300, column: 6
                                S85=9;
                                if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 305, column: 7
                                  humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 306, column: 5
                                  humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 307, column: 5
                                  if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 308, column: 8
                                    S2009=0;
                                    System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 7
                                    System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 311, column: 7
                                    System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 312, column: 7
                                    deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 313, column: 7
                                    currsigs.addElement(deHumOnZone4_5_6);
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                  else {
                                    S2009=1;
                                    if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 316, column: 15
                                      System.out.println("");//sysj\ECS_plant.sysj line: 318, column: 7
                                      System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 319, column: 7
                                      System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 320, column: 7
                                      humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 321, column: 7
                                      currsigs.addElement(humOnZone4_5_6);
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                    else {
                                      System.out.println("");//sysj\ECS_plant.sysj line: 325, column: 6
                                      System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 326, column: 6
                                      S85=10;
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                  }
                                }
                                else {
                                  S85=10;
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                              }
                            }
                          }
                          else {
                            S85=9;
                            if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 305, column: 7
                              humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 306, column: 5
                              humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 307, column: 5
                              if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 308, column: 8
                                S2009=0;
                                System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 7
                                System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 311, column: 7
                                System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 312, column: 7
                                deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 313, column: 7
                                currsigs.addElement(deHumOnZone4_5_6);
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                              else {
                                S2009=1;
                                if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 316, column: 15
                                  System.out.println("");//sysj\ECS_plant.sysj line: 318, column: 7
                                  System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 319, column: 7
                                  System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 320, column: 7
                                  humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 321, column: 7
                                  currsigs.addElement(humOnZone4_5_6);
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                                else {
                                  System.out.println("");//sysj\ECS_plant.sysj line: 325, column: 6
                                  System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 326, column: 6
                                  S85=10;
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                              }
                            }
                            else {
                              S85=10;
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
                    S85=7;
                    if(zone_thread_2 == 1 || zone_thread_2 == 7){//sysj\ECS_plant.sysj line: 253, column: 7
                      humid17_thread_2 = 0;//sysj\ECS_plant.sysj line: 254, column: 5
                      humid17_thread_2 = (humidZone1_7.getpreval() == null ? null : ((Integer)humidZone1_7.getpreval()));//sysj\ECS_plant.sysj line: 255, column: 5
                      if(humid17_thread_2 > 60){//sysj\ECS_plant.sysj line: 256, column: 8
                        S1009=0;
                        System.out.println("");//sysj\ECS_plant.sysj line: 258, column: 7
                        System.out.println("Room humidity is too high at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 259, column: 7
                        System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 260, column: 7
                        deHumOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 261, column: 7
                        currsigs.addElement(deHumOnZone1_7);
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
                        S1009=1;
                        if(humid17_thread_2 < 30){//sysj\ECS_plant.sysj line: 264, column: 15
                          System.out.println("");//sysj\ECS_plant.sysj line: 266, column: 7
                          System.out.println("Room humidity is too low at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 267, column: 7
                          System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 268, column: 7
                          humOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 269, column: 7
                          currsigs.addElement(humOnZone1_7);
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          System.out.println("");//sysj\ECS_plant.sysj line: 273, column: 6
                          System.out.println("Room humidity is safe at" + humid17_thread_2);//sysj\ECS_plant.sysj line: 274, column: 6
                          S85=8;
                          if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 279, column: 7
                            humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 280, column: 5
                            humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 281, column: 5
                            if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 282, column: 8
                              S1349=0;
                              System.out.println("");//sysj\ECS_plant.sysj line: 284, column: 7
                              System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 285, column: 7
                              System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 286, column: 7
                              deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 287, column: 7
                              currsigs.addElement(deHumOnZone2_3);
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S1349=1;
                              if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 290, column: 15
                                System.out.println("");//sysj\ECS_plant.sysj line: 292, column: 7
                                System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 293, column: 7
                                System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 294, column: 7
                                humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 295, column: 7
                                currsigs.addElement(humOnZone2_3);
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                              else {
                                System.out.println("");//sysj\ECS_plant.sysj line: 299, column: 6
                                System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 300, column: 6
                                S85=9;
                                if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 305, column: 7
                                  humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 306, column: 5
                                  humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 307, column: 5
                                  if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 308, column: 8
                                    S2009=0;
                                    System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 7
                                    System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 311, column: 7
                                    System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 312, column: 7
                                    deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 313, column: 7
                                    currsigs.addElement(deHumOnZone4_5_6);
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                  else {
                                    S2009=1;
                                    if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 316, column: 15
                                      System.out.println("");//sysj\ECS_plant.sysj line: 318, column: 7
                                      System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 319, column: 7
                                      System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 320, column: 7
                                      humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 321, column: 7
                                      currsigs.addElement(humOnZone4_5_6);
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                    else {
                                      System.out.println("");//sysj\ECS_plant.sysj line: 325, column: 6
                                      System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 326, column: 6
                                      S85=10;
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                  }
                                }
                                else {
                                  S85=10;
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                              }
                            }
                          }
                          else {
                            S85=9;
                            if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 305, column: 7
                              humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 306, column: 5
                              humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 307, column: 5
                              if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 308, column: 8
                                S2009=0;
                                System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 7
                                System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 311, column: 7
                                System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 312, column: 7
                                deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 313, column: 7
                                currsigs.addElement(deHumOnZone4_5_6);
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                              else {
                                S2009=1;
                                if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 316, column: 15
                                  System.out.println("");//sysj\ECS_plant.sysj line: 318, column: 7
                                  System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 319, column: 7
                                  System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 320, column: 7
                                  humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 321, column: 7
                                  currsigs.addElement(humOnZone4_5_6);
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                                else {
                                  System.out.println("");//sysj\ECS_plant.sysj line: 325, column: 6
                                  System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 326, column: 6
                                  S85=10;
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                              }
                            }
                            else {
                              S85=10;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                        }
                      }
                    }
                    else {
                      S85=8;
                      if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 279, column: 7
                        humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 280, column: 5
                        humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 281, column: 5
                        if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 282, column: 8
                          S1349=0;
                          System.out.println("");//sysj\ECS_plant.sysj line: 284, column: 7
                          System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 285, column: 7
                          System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 286, column: 7
                          deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 287, column: 7
                          currsigs.addElement(deHumOnZone2_3);
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          S1349=1;
                          if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 290, column: 15
                            System.out.println("");//sysj\ECS_plant.sysj line: 292, column: 7
                            System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 293, column: 7
                            System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 294, column: 7
                            humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 295, column: 7
                            currsigs.addElement(humOnZone2_3);
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            System.out.println("");//sysj\ECS_plant.sysj line: 299, column: 6
                            System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 300, column: 6
                            S85=9;
                            if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 305, column: 7
                              humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 306, column: 5
                              humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 307, column: 5
                              if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 308, column: 8
                                S2009=0;
                                System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 7
                                System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 311, column: 7
                                System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 312, column: 7
                                deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 313, column: 7
                                currsigs.addElement(deHumOnZone4_5_6);
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                              else {
                                S2009=1;
                                if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 316, column: 15
                                  System.out.println("");//sysj\ECS_plant.sysj line: 318, column: 7
                                  System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 319, column: 7
                                  System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 320, column: 7
                                  humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 321, column: 7
                                  currsigs.addElement(humOnZone4_5_6);
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                                else {
                                  System.out.println("");//sysj\ECS_plant.sysj line: 325, column: 6
                                  System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 326, column: 6
                                  S85=10;
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                              }
                            }
                            else {
                              S85=10;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                        }
                      }
                      else {
                        S85=9;
                        if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 305, column: 7
                          humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 306, column: 5
                          humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 307, column: 5
                          if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 308, column: 8
                            S2009=0;
                            System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 7
                            System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 311, column: 7
                            System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 312, column: 7
                            deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 313, column: 7
                            currsigs.addElement(deHumOnZone4_5_6);
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S2009=1;
                            if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 316, column: 15
                              System.out.println("");//sysj\ECS_plant.sysj line: 318, column: 7
                              System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 319, column: 7
                              System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 320, column: 7
                              humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 321, column: 7
                              currsigs.addElement(humOnZone4_5_6);
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              System.out.println("");//sysj\ECS_plant.sysj line: 325, column: 6
                              System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 326, column: 6
                              S85=10;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                        }
                        else {
                          S85=10;
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
              switch(S564){
                case 0 : 
                  cleanZone1.setPresent();//sysj\ECS_plant.sysj line: 139, column: 7
                  currsigs.addElement(cleanZone1);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                  break;
                
                case 1 : 
                  cleanZone2.setPresent();//sysj\ECS_plant.sysj line: 145, column: 7
                  currsigs.addElement(cleanZone2);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                  break;
                
                case 2 : 
                  cleanZone3.setPresent();//sysj\ECS_plant.sysj line: 151, column: 7
                  currsigs.addElement(cleanZone3);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                  break;
                
                case 3 : 
                  cleanZone4.setPresent();//sysj\ECS_plant.sysj line: 157, column: 7
                  currsigs.addElement(cleanZone4);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                  break;
                
                case 4 : 
                  cleanZone5.setPresent();//sysj\ECS_plant.sysj line: 163, column: 7
                  currsigs.addElement(cleanZone5);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                  break;
                
                case 5 : 
                  cleanZone7.setPresent();//sysj\ECS_plant.sysj line: 169, column: 7
                  currsigs.addElement(cleanZone7);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                  break;
                
                case 6 : 
                  cleanZone7.setPresent();//sysj\ECS_plant.sysj line: 175, column: 7
                  currsigs.addElement(cleanZone7);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                  break;
                
              }
            }
            break;
          
          case 4 : 
            switch(S669){
              case 0 : 
                System.out.println("");//sysj\ECS_plant.sysj line: 187, column: 7
                System.out.println("Room temperature is too high at " + temp17_thread_2);//sysj\ECS_plant.sysj line: 188, column: 7
                fanOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 189, column: 7
                currsigs.addElement(fanOnZone1_7);
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
                break;
              
              case 1 : 
                switch(S668){
                  case 0 : 
                    System.out.println("Room temperature is too low at " + temp17_thread_2);//sysj\ECS_plant.sysj line: 194, column: 7
                    heatOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 195, column: 7
                    currsigs.addElement(heatOnZone1_7);
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                    break;
                  
                  case 1 : 
                    S85=0;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                    break;
                  
                }
                break;
              
            }
            break;
          
          case 5 : 
            switch(S729){
              case 0 : 
                System.out.println("");//sysj\ECS_plant.sysj line: 210, column: 7
                System.out.println("Room temperature is too high at " + temp23_thread_2);//sysj\ECS_plant.sysj line: 211, column: 7
                airOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 212, column: 7
                currsigs.addElement(airOnZone2_3);
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
                break;
              
              case 1 : 
                heatOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 217, column: 7
                currsigs.addElement(heatOnZone2_3);
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
                break;
              
            }
            break;
          
          case 6 : 
            switch(S829){
              case 0 : 
                System.out.println("");//sysj\ECS_plant.sysj line: 233, column: 7
                System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 234, column: 7
                airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 235, column: 7
                currsigs.addElement(airOnZone4_5_6);
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
                break;
              
              case 1 : 
                System.out.println("");//sysj\ECS_plant.sysj line: 240, column: 7
                System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 241, column: 7
                heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 242, column: 7
                currsigs.addElement(heatOnZone4_5_6);
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
                break;
              
            }
            break;
          
          case 7 : 
            switch(S1009){
              case 0 : 
                System.out.println("");//sysj\ECS_plant.sysj line: 258, column: 7
                System.out.println("Room humidity is too high at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 259, column: 7
                System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 260, column: 7
                deHumOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 261, column: 7
                currsigs.addElement(deHumOnZone1_7);
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
                break;
              
              case 1 : 
                System.out.println("");//sysj\ECS_plant.sysj line: 266, column: 7
                System.out.println("Room humidity is too low at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 267, column: 7
                System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 268, column: 7
                humOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 269, column: 7
                currsigs.addElement(humOnZone1_7);
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
                break;
              
            }
            break;
          
          case 8 : 
            switch(S1349){
              case 0 : 
                System.out.println("");//sysj\ECS_plant.sysj line: 284, column: 7
                System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 285, column: 7
                System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 286, column: 7
                deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 287, column: 7
                currsigs.addElement(deHumOnZone2_3);
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
                break;
              
              case 1 : 
                System.out.println("");//sysj\ECS_plant.sysj line: 292, column: 7
                System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 293, column: 7
                System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 294, column: 7
                humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 295, column: 7
                currsigs.addElement(humOnZone2_3);
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
                break;
              
            }
            break;
          
          case 9 : 
            switch(S2009){
              case 0 : 
                System.out.println("");//sysj\ECS_plant.sysj line: 310, column: 7
                System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 311, column: 7
                System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 312, column: 7
                deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 313, column: 7
                currsigs.addElement(deHumOnZone4_5_6);
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
                break;
              
              case 1 : 
                System.out.println("");//sysj\ECS_plant.sysj line: 318, column: 7
                System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 319, column: 7
                System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 320, column: 7
                humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 321, column: 7
                currsigs.addElement(humOnZone4_5_6);
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
                break;
              
            }
            break;
          
          case 10 : 
            S85=10;
            S85=0;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread19834(int [] tdone, int [] ends){
        S9941=1;
    if(deHumOnZone4_5_6.getprestatus()){//sysj\ECS_plant.sysj line: 387, column: 24
      deHumOnZone4_5_6TriggerE.setPresent();//sysj\ECS_plant.sysj line: 387, column: 42
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

  public void thread19833(int [] tdone, int [] ends){
        S9933=1;
    if(deHumOnZone2_3.getprestatus()){//sysj\ECS_plant.sysj line: 385, column: 24
      deHumOnZone2_3TriggerE.setPresent();//sysj\ECS_plant.sysj line: 385, column: 40
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

  public void thread19832(int [] tdone, int [] ends){
        S9925=1;
    if(deHumOnZone1_7.getprestatus()){//sysj\ECS_plant.sysj line: 383, column: 24
      deHumOnZone1_7TriggerE.setPresent();//sysj\ECS_plant.sysj line: 383, column: 40
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

  public void thread19831(int [] tdone, int [] ends){
        S9917=1;
    if(humOnZone4_5_6.getprestatus()){//sysj\ECS_plant.sysj line: 381, column: 24
      humOnZone4_5_6TriggerE.setPresent();//sysj\ECS_plant.sysj line: 381, column: 40
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

  public void thread19830(int [] tdone, int [] ends){
        S9909=1;
    if(humOnZone2_3.getprestatus()){//sysj\ECS_plant.sysj line: 379, column: 24
      humOnZone2_3TriggerE.setPresent();//sysj\ECS_plant.sysj line: 379, column: 38
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

  public void thread19829(int [] tdone, int [] ends){
        S9901=1;
    if(humOnZone1_7.getprestatus()){//sysj\ECS_plant.sysj line: 377, column: 24
      humOnZone1_7TriggerE.setPresent();//sysj\ECS_plant.sysj line: 377, column: 38
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

  public void thread19828(int [] tdone, int [] ends){
        S9893=1;
    if(heatOnZone4_5_6.getprestatus()){//sysj\ECS_plant.sysj line: 375, column: 24
      heatOnZone4_5_6TriggerE.setPresent();//sysj\ECS_plant.sysj line: 375, column: 41
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

  public void thread19827(int [] tdone, int [] ends){
        S9885=1;
    if(heatOnZone2_3.getprestatus()){//sysj\ECS_plant.sysj line: 373, column: 24
      heatOnZone2_3TriggerE.setPresent();//sysj\ECS_plant.sysj line: 373, column: 39
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

  public void thread19826(int [] tdone, int [] ends){
        S9877=1;
    if(airOnZone4_5_6.getprestatus()){//sysj\ECS_plant.sysj line: 371, column: 24
      airOnZone4_5_6TriggerE.setPresent();//sysj\ECS_plant.sysj line: 371, column: 40
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

  public void thread19825(int [] tdone, int [] ends){
        S9869=1;
    if(airOnZone2_3.getprestatus()){//sysj\ECS_plant.sysj line: 369, column: 24
      airOnZone2_3TriggerE.setPresent();//sysj\ECS_plant.sysj line: 369, column: 38
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

  public void thread19824(int [] tdone, int [] ends){
        S9861=1;
    if(heatOnZone1_7.getprestatus()){//sysj\ECS_plant.sysj line: 367, column: 24
      heatOnZone1_7TriggerE.setPresent();//sysj\ECS_plant.sysj line: 367, column: 39
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

  public void thread19823(int [] tdone, int [] ends){
        S9853=1;
    if(fanOnZone1_7.getprestatus()){//sysj\ECS_plant.sysj line: 365, column: 24
      fanOnZone1_7TriggerE.setPresent();//sysj\ECS_plant.sysj line: 365, column: 38
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

  public void thread19822(int [] tdone, int [] ends){
        S9845=1;
    if(cleanZone7.getprestatus()){//sysj\ECS_plant.sysj line: 363, column: 24
      cleanZone7TriggerE.setPresent();//sysj\ECS_plant.sysj line: 363, column: 36
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

  public void thread19821(int [] tdone, int [] ends){
        S9837=1;
    if(cleanZone6.getprestatus()){//sysj\ECS_plant.sysj line: 361, column: 24
      cleanZone6TriggerE.setPresent();//sysj\ECS_plant.sysj line: 361, column: 36
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

  public void thread19820(int [] tdone, int [] ends){
        S9829=1;
    if(cleanZone5.getprestatus()){//sysj\ECS_plant.sysj line: 359, column: 24
      cleanZone5TriggerE.setPresent();//sysj\ECS_plant.sysj line: 359, column: 36
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

  public void thread19819(int [] tdone, int [] ends){
        S9821=1;
    if(cleanZone4.getprestatus()){//sysj\ECS_plant.sysj line: 357, column: 24
      cleanZone4TriggerE.setPresent();//sysj\ECS_plant.sysj line: 357, column: 36
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

  public void thread19818(int [] tdone, int [] ends){
        S9813=1;
    if(cleanZone3.getprestatus()){//sysj\ECS_plant.sysj line: 355, column: 24
      cleanZone3TriggerE.setPresent();//sysj\ECS_plant.sysj line: 355, column: 36
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

  public void thread19817(int [] tdone, int [] ends){
        S9805=1;
    if(cleanZone2.getprestatus()){//sysj\ECS_plant.sysj line: 353, column: 24
      cleanZone2TriggerE.setPresent();//sysj\ECS_plant.sysj line: 353, column: 36
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

  public void thread19816(int [] tdone, int [] ends){
        S9797=1;
    if(cleanZone1.getprestatus()){//sysj\ECS_plant.sysj line: 351, column: 24
      cleanZone1TriggerE.setPresent();//sysj\ECS_plant.sysj line: 351, column: 36
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

  public void thread19815(int [] tdone, int [] ends){
        S9789=1;
    if(fireZone7.getprestatus()){//sysj\ECS_plant.sysj line: 349, column: 24
      alarmZone7TriggerE.setPresent();//sysj\ECS_plant.sysj line: 349, column: 35
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

  public void thread19814(int [] tdone, int [] ends){
        S9781=1;
    if(fireZone6.getprestatus()){//sysj\ECS_plant.sysj line: 347, column: 24
      alarmZone6TriggerE.setPresent();//sysj\ECS_plant.sysj line: 347, column: 35
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

  public void thread19813(int [] tdone, int [] ends){
        S9773=1;
    if(fireZone5.getprestatus()){//sysj\ECS_plant.sysj line: 345, column: 24
      alarmZone5TriggerE.setPresent();//sysj\ECS_plant.sysj line: 345, column: 35
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

  public void thread19812(int [] tdone, int [] ends){
        S9765=1;
    if(fireZone4.getprestatus()){//sysj\ECS_plant.sysj line: 343, column: 24
      alarmZone4TriggerE.setPresent();//sysj\ECS_plant.sysj line: 343, column: 35
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

  public void thread19811(int [] tdone, int [] ends){
        S9757=1;
    if(fireZone3.getprestatus()){//sysj\ECS_plant.sysj line: 341, column: 24
      alarmZone3TriggerE.setPresent();//sysj\ECS_plant.sysj line: 341, column: 35
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

  public void thread19810(int [] tdone, int [] ends){
        S9749=1;
    if(fireZone2.getprestatus()){//sysj\ECS_plant.sysj line: 339, column: 24
      alarmZone2TriggerE.setPresent();//sysj\ECS_plant.sysj line: 339, column: 35
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

  public void thread19809(int [] tdone, int [] ends){
        S9741=1;
    if(fireZone1.getprestatus()){//sysj\ECS_plant.sysj line: 337, column: 24
      alarmZone1TriggerE.setPresent();//sysj\ECS_plant.sysj line: 337, column: 35
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

  public void thread19808(int [] tdone, int [] ends){
        S9943=1;
    thread19809(tdone,ends);
    thread19810(tdone,ends);
    thread19811(tdone,ends);
    thread19812(tdone,ends);
    thread19813(tdone,ends);
    thread19814(tdone,ends);
    thread19815(tdone,ends);
    thread19816(tdone,ends);
    thread19817(tdone,ends);
    thread19818(tdone,ends);
    thread19819(tdone,ends);
    thread19820(tdone,ends);
    thread19821(tdone,ends);
    thread19822(tdone,ends);
    thread19823(tdone,ends);
    thread19824(tdone,ends);
    thread19825(tdone,ends);
    thread19826(tdone,ends);
    thread19827(tdone,ends);
    thread19828(tdone,ends);
    thread19829(tdone,ends);
    thread19830(tdone,ends);
    thread19831(tdone,ends);
    thread19832(tdone,ends);
    thread19833(tdone,ends);
    thread19834(tdone,ends);
    int biggest19835 = 0;
    if(ends[4]>=biggest19835){
      biggest19835=ends[4];
    }
    if(ends[5]>=biggest19835){
      biggest19835=ends[5];
    }
    if(ends[6]>=biggest19835){
      biggest19835=ends[6];
    }
    if(ends[7]>=biggest19835){
      biggest19835=ends[7];
    }
    if(ends[8]>=biggest19835){
      biggest19835=ends[8];
    }
    if(ends[9]>=biggest19835){
      biggest19835=ends[9];
    }
    if(ends[10]>=biggest19835){
      biggest19835=ends[10];
    }
    if(ends[11]>=biggest19835){
      biggest19835=ends[11];
    }
    if(ends[12]>=biggest19835){
      biggest19835=ends[12];
    }
    if(ends[13]>=biggest19835){
      biggest19835=ends[13];
    }
    if(ends[14]>=biggest19835){
      biggest19835=ends[14];
    }
    if(ends[15]>=biggest19835){
      biggest19835=ends[15];
    }
    if(ends[16]>=biggest19835){
      biggest19835=ends[16];
    }
    if(ends[17]>=biggest19835){
      biggest19835=ends[17];
    }
    if(ends[18]>=biggest19835){
      biggest19835=ends[18];
    }
    if(ends[19]>=biggest19835){
      biggest19835=ends[19];
    }
    if(ends[20]>=biggest19835){
      biggest19835=ends[20];
    }
    if(ends[21]>=biggest19835){
      biggest19835=ends[21];
    }
    if(ends[22]>=biggest19835){
      biggest19835=ends[22];
    }
    if(ends[23]>=biggest19835){
      biggest19835=ends[23];
    }
    if(ends[24]>=biggest19835){
      biggest19835=ends[24];
    }
    if(ends[25]>=biggest19835){
      biggest19835=ends[25];
    }
    if(ends[26]>=biggest19835){
      biggest19835=ends[26];
    }
    if(ends[27]>=biggest19835){
      biggest19835=ends[27];
    }
    if(ends[28]>=biggest19835){
      biggest19835=ends[28];
    }
    if(ends[29]>=biggest19835){
      biggest19835=ends[29];
    }
    if(biggest19835 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread19807(int [] tdone, int [] ends){
        S9733=1;
    S85=0;
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
      switch(S19805){
        case 0 : 
          S19805=0;
          break RUN;
        
        case 1 : 
          S19805=2;
          S19805=2;
          new Thread(new ECS_GUI()).start();//sysj\ECS_plant.sysj line: 31, column: 2
          thread19807(tdone,ends);
          thread19808(tdone,ends);
          int biggest19836 = 0;
          if(ends[2]>=biggest19836){
            biggest19836=ends[2];
          }
          if(ends[3]>=biggest19836){
            biggest19836=ends[3];
          }
          if(biggest19836 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread19837(tdone,ends);
          thread19838(tdone,ends);
          int biggest19866 = 0;
          if(ends[2]>=biggest19866){
            biggest19866=ends[2];
          }
          if(ends[3]>=biggest19866){
            biggest19866=ends[3];
          }
          if(biggest19866 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest19866 == 0){
            S19805=0;
            active[1]=0;
            ends[1]=0;
            S19805=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
          lightIntZ1.gethook();
          lightIntZ2.gethook();
          lightIntZ3.gethook();
          lightIntZ4.gethook();
          lightIntZ5.gethook();
          lightIntZ6.gethook();
          lightIntZ7.gethook();
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
      lightIntZ1.setpreclear();
      lightIntZ2.setpreclear();
      lightIntZ3.setpreclear();
      lightIntZ4.setpreclear();
      lightIntZ5.setpreclear();
      lightIntZ6.setpreclear();
      lightIntZ7.setpreclear();
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
      dummyint = lightIntZ1.getStatus() ? lightIntZ1.setprepresent() : lightIntZ1.setpreclear();
      lightIntZ1.setpreval(lightIntZ1.getValue());
      lightIntZ1.setClear();
      dummyint = lightIntZ2.getStatus() ? lightIntZ2.setprepresent() : lightIntZ2.setpreclear();
      lightIntZ2.setpreval(lightIntZ2.getValue());
      lightIntZ2.setClear();
      dummyint = lightIntZ3.getStatus() ? lightIntZ3.setprepresent() : lightIntZ3.setpreclear();
      lightIntZ3.setpreval(lightIntZ3.getValue());
      lightIntZ3.setClear();
      dummyint = lightIntZ4.getStatus() ? lightIntZ4.setprepresent() : lightIntZ4.setpreclear();
      lightIntZ4.setpreval(lightIntZ4.getValue());
      lightIntZ4.setClear();
      dummyint = lightIntZ5.getStatus() ? lightIntZ5.setprepresent() : lightIntZ5.setpreclear();
      lightIntZ5.setpreval(lightIntZ5.getValue());
      lightIntZ5.setClear();
      dummyint = lightIntZ6.getStatus() ? lightIntZ6.setprepresent() : lightIntZ6.setpreclear();
      lightIntZ6.setpreval(lightIntZ6.getValue());
      lightIntZ6.setClear();
      dummyint = lightIntZ7.getStatus() ? lightIntZ7.setprepresent() : lightIntZ7.setpreclear();
      lightIntZ7.setpreval(lightIntZ7.getValue());
      lightIntZ7.setClear();
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
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        tempZone1_7.gethook();
        tempZone2_3.gethook();
        tempZone4_5_6.gethook();
        humidZone1_7.gethook();
        humidZone2_3.gethook();
        humidZone4_5_6.gethook();
        lightIntZ1.gethook();
        lightIntZ2.gethook();
        lightIntZ3.gethook();
        lightIntZ4.gethook();
        lightIntZ5.gethook();
        lightIntZ6.gethook();
        lightIntZ7.gethook();
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
