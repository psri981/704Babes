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
  private Integer zone_thread_2;//sysj\ECS_plant.sysj line: 41, column: 4
  private Integer lightIntensity_thread_2;//sysj\ECS_plant.sysj line: 45, column: 4
  private String clock_thread_2;//sysj\ECS_plant.sysj line: 49, column: 4
  private Integer temp17_thread_2;//sysj\ECS_plant.sysj line: 188, column: 5
  private Integer temp23_thread_2;//sysj\ECS_plant.sysj line: 211, column: 5
  private Integer temp456_thread_2;//sysj\ECS_plant.sysj line: 234, column: 5
  private Integer humid17_thread_2;//sysj\ECS_plant.sysj line: 259, column: 5
  private Integer humid23_thread_2;//sysj\ECS_plant.sysj line: 285, column: 5
  private Integer humid456_thread_2;//sysj\ECS_plant.sysj line: 311, column: 5
  private int S21465 = 1;
  private int S11281 = 1;
  private int S1633 = 1;
  private int S1683 = 1;
  private int S1638 = 1;
  private int S1651 = 1;
  private int S1688 = 1;
  private int S1724 = 1;
  private int S1760 = 1;
  private int S1796 = 1;
  private int S1832 = 1;
  private int S2112 = 1;
  private int S2217 = 1;
  private int S2216 = 1;
  private int S2277 = 1;
  private int S2377 = 1;
  private int S2557 = 1;
  private int S2897 = 1;
  private int S3557 = 1;
  private int S11547 = 1;
  private int S11289 = 1;
  private int S11297 = 1;
  private int S11305 = 1;
  private int S11313 = 1;
  private int S11321 = 1;
  private int S11329 = 1;
  private int S11337 = 1;
  private int S11345 = 1;
  private int S11353 = 1;
  private int S11361 = 1;
  private int S11369 = 1;
  private int S11377 = 1;
  private int S11385 = 1;
  private int S11393 = 1;
  private int S11401 = 1;
  private int S11409 = 1;
  private int S11417 = 1;
  private int S11425 = 1;
  private int S11433 = 1;
  private int S11441 = 1;
  private int S11449 = 1;
  private int S11457 = 1;
  private int S11465 = 1;
  private int S11473 = 1;
  private int S11481 = 1;
  private int S11489 = 1;
  private int S11497 = 1;
  private int S11505 = 1;
  private int S11513 = 1;
  private int S11521 = 1;
  private int S11529 = 1;
  private int S11537 = 1;
  private int S11545 = 1;
  
  private int[] ends = new int[37];
  private int[] tdone = new int[37];
  
  public void thread21538(int [] tdone, int [] ends){
        switch(S11545){
      case 0 : 
        active[36]=0;
        ends[36]=0;
        tdone[36]=1;
        break;
      
      case 1 : 
        if(cutPowZ7.getprestatus()){//sysj\ECS_plant.sysj line: 406, column: 24
          cutPowZ7_TriggerE.setPresent();//sysj\ECS_plant.sysj line: 406, column: 34
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

  public void thread21537(int [] tdone, int [] ends){
        switch(S11537){
      case 0 : 
        active[35]=0;
        ends[35]=0;
        tdone[35]=1;
        break;
      
      case 1 : 
        if(cutPowZ6.getprestatus()){//sysj\ECS_plant.sysj line: 404, column: 24
          cutPowZ6_TriggerE.setPresent();//sysj\ECS_plant.sysj line: 404, column: 34
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

  public void thread21536(int [] tdone, int [] ends){
        switch(S11529){
      case 0 : 
        active[34]=0;
        ends[34]=0;
        tdone[34]=1;
        break;
      
      case 1 : 
        if(cutPowZ5.getprestatus()){//sysj\ECS_plant.sysj line: 402, column: 24
          cutPowZ5_TriggerE.setPresent();//sysj\ECS_plant.sysj line: 402, column: 34
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

  public void thread21535(int [] tdone, int [] ends){
        switch(S11521){
      case 0 : 
        active[33]=0;
        ends[33]=0;
        tdone[33]=1;
        break;
      
      case 1 : 
        if(cutPowZ4.getprestatus()){//sysj\ECS_plant.sysj line: 400, column: 24
          cutPowZ4_TriggerE.setPresent();//sysj\ECS_plant.sysj line: 400, column: 34
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

  public void thread21534(int [] tdone, int [] ends){
        switch(S11513){
      case 0 : 
        active[32]=0;
        ends[32]=0;
        tdone[32]=1;
        break;
      
      case 1 : 
        if(cutPowZ3.getprestatus()){//sysj\ECS_plant.sysj line: 398, column: 24
          cutPowZ3_TriggerE.setPresent();//sysj\ECS_plant.sysj line: 398, column: 34
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

  public void thread21533(int [] tdone, int [] ends){
        switch(S11505){
      case 0 : 
        active[31]=0;
        ends[31]=0;
        tdone[31]=1;
        break;
      
      case 1 : 
        if(cutPowZ2.getprestatus()){//sysj\ECS_plant.sysj line: 396, column: 24
          cutPowZ2_TriggerE.setPresent();//sysj\ECS_plant.sysj line: 396, column: 34
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

  public void thread21532(int [] tdone, int [] ends){
        switch(S11497){
      case 0 : 
        active[30]=0;
        ends[30]=0;
        tdone[30]=1;
        break;
      
      case 1 : 
        if(cutPowZ1.getprestatus()){//sysj\ECS_plant.sysj line: 394, column: 24
          cutPowZ1_TriggerE.setPresent();//sysj\ECS_plant.sysj line: 394, column: 34
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

  public void thread21531(int [] tdone, int [] ends){
        switch(S11489){
      case 0 : 
        active[29]=0;
        ends[29]=0;
        tdone[29]=1;
        break;
      
      case 1 : 
        if(deHumOnZone4_5_6.getprestatus()){//sysj\ECS_plant.sysj line: 392, column: 24
          deHumOnZone4_5_6TriggerE.setPresent();//sysj\ECS_plant.sysj line: 392, column: 42
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

  public void thread21530(int [] tdone, int [] ends){
        switch(S11481){
      case 0 : 
        active[28]=0;
        ends[28]=0;
        tdone[28]=1;
        break;
      
      case 1 : 
        if(deHumOnZone2_3.getprestatus()){//sysj\ECS_plant.sysj line: 390, column: 24
          deHumOnZone2_3TriggerE.setPresent();//sysj\ECS_plant.sysj line: 390, column: 40
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

  public void thread21529(int [] tdone, int [] ends){
        switch(S11473){
      case 0 : 
        active[27]=0;
        ends[27]=0;
        tdone[27]=1;
        break;
      
      case 1 : 
        if(deHumOnZone1_7.getprestatus()){//sysj\ECS_plant.sysj line: 388, column: 24
          deHumOnZone1_7TriggerE.setPresent();//sysj\ECS_plant.sysj line: 388, column: 40
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

  public void thread21528(int [] tdone, int [] ends){
        switch(S11465){
      case 0 : 
        active[26]=0;
        ends[26]=0;
        tdone[26]=1;
        break;
      
      case 1 : 
        if(humOnZone4_5_6.getprestatus()){//sysj\ECS_plant.sysj line: 386, column: 24
          humOnZone4_5_6TriggerE.setPresent();//sysj\ECS_plant.sysj line: 386, column: 40
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

  public void thread21527(int [] tdone, int [] ends){
        switch(S11457){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        if(humOnZone2_3.getprestatus()){//sysj\ECS_plant.sysj line: 384, column: 24
          humOnZone2_3TriggerE.setPresent();//sysj\ECS_plant.sysj line: 384, column: 38
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

  public void thread21526(int [] tdone, int [] ends){
        switch(S11449){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        if(humOnZone1_7.getprestatus()){//sysj\ECS_plant.sysj line: 382, column: 24
          humOnZone1_7TriggerE.setPresent();//sysj\ECS_plant.sysj line: 382, column: 38
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

  public void thread21525(int [] tdone, int [] ends){
        switch(S11441){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        if(heatOnZone4_5_6.getprestatus()){//sysj\ECS_plant.sysj line: 380, column: 24
          heatOnZone4_5_6TriggerE.setPresent();//sysj\ECS_plant.sysj line: 380, column: 41
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

  public void thread21524(int [] tdone, int [] ends){
        switch(S11433){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        if(heatOnZone2_3.getprestatus()){//sysj\ECS_plant.sysj line: 378, column: 24
          heatOnZone2_3TriggerE.setPresent();//sysj\ECS_plant.sysj line: 378, column: 39
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

  public void thread21523(int [] tdone, int [] ends){
        switch(S11425){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        if(airOnZone4_5_6.getprestatus()){//sysj\ECS_plant.sysj line: 376, column: 24
          airOnZone4_5_6TriggerE.setPresent();//sysj\ECS_plant.sysj line: 376, column: 40
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

  public void thread21522(int [] tdone, int [] ends){
        switch(S11417){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        if(airOnZone2_3.getprestatus()){//sysj\ECS_plant.sysj line: 374, column: 24
          airOnZone2_3TriggerE.setPresent();//sysj\ECS_plant.sysj line: 374, column: 38
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

  public void thread21521(int [] tdone, int [] ends){
        switch(S11409){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        if(heatOnZone1_7.getprestatus()){//sysj\ECS_plant.sysj line: 372, column: 24
          heatOnZone1_7TriggerE.setPresent();//sysj\ECS_plant.sysj line: 372, column: 39
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

  public void thread21520(int [] tdone, int [] ends){
        switch(S11401){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        if(fanOnZone1_7.getprestatus()){//sysj\ECS_plant.sysj line: 370, column: 24
          fanOnZone1_7TriggerE.setPresent();//sysj\ECS_plant.sysj line: 370, column: 38
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

  public void thread21519(int [] tdone, int [] ends){
        switch(S11393){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        if(cleanZone7.getprestatus()){//sysj\ECS_plant.sysj line: 368, column: 24
          cleanZone7TriggerE.setPresent();//sysj\ECS_plant.sysj line: 368, column: 36
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

  public void thread21518(int [] tdone, int [] ends){
        switch(S11385){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        if(cleanZone6.getprestatus()){//sysj\ECS_plant.sysj line: 366, column: 24
          cleanZone6TriggerE.setPresent();//sysj\ECS_plant.sysj line: 366, column: 36
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

  public void thread21517(int [] tdone, int [] ends){
        switch(S11377){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(cleanZone5.getprestatus()){//sysj\ECS_plant.sysj line: 364, column: 24
          cleanZone5TriggerE.setPresent();//sysj\ECS_plant.sysj line: 364, column: 36
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

  public void thread21516(int [] tdone, int [] ends){
        switch(S11369){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(cleanZone4.getprestatus()){//sysj\ECS_plant.sysj line: 362, column: 24
          cleanZone4TriggerE.setPresent();//sysj\ECS_plant.sysj line: 362, column: 36
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

  public void thread21515(int [] tdone, int [] ends){
        switch(S11361){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(cleanZone3.getprestatus()){//sysj\ECS_plant.sysj line: 360, column: 24
          cleanZone3TriggerE.setPresent();//sysj\ECS_plant.sysj line: 360, column: 36
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

  public void thread21514(int [] tdone, int [] ends){
        switch(S11353){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(cleanZone2.getprestatus()){//sysj\ECS_plant.sysj line: 358, column: 24
          cleanZone2TriggerE.setPresent();//sysj\ECS_plant.sysj line: 358, column: 36
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

  public void thread21513(int [] tdone, int [] ends){
        switch(S11345){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(cleanZone1.getprestatus()){//sysj\ECS_plant.sysj line: 356, column: 24
          cleanZone1TriggerE.setPresent();//sysj\ECS_plant.sysj line: 356, column: 36
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

  public void thread21512(int [] tdone, int [] ends){
        switch(S11337){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(fireZone7.getprestatus()){//sysj\ECS_plant.sysj line: 354, column: 24
          alarmZone7TriggerE.setPresent();//sysj\ECS_plant.sysj line: 354, column: 35
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

  public void thread21511(int [] tdone, int [] ends){
        switch(S11329){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(fireZone6.getprestatus()){//sysj\ECS_plant.sysj line: 352, column: 24
          alarmZone6TriggerE.setPresent();//sysj\ECS_plant.sysj line: 352, column: 35
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

  public void thread21510(int [] tdone, int [] ends){
        switch(S11321){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(fireZone5.getprestatus()){//sysj\ECS_plant.sysj line: 350, column: 24
          alarmZone5TriggerE.setPresent();//sysj\ECS_plant.sysj line: 350, column: 35
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

  public void thread21509(int [] tdone, int [] ends){
        switch(S11313){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(fireZone4.getprestatus()){//sysj\ECS_plant.sysj line: 348, column: 24
          alarmZone4TriggerE.setPresent();//sysj\ECS_plant.sysj line: 348, column: 35
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

  public void thread21508(int [] tdone, int [] ends){
        switch(S11305){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(fireZone3.getprestatus()){//sysj\ECS_plant.sysj line: 346, column: 24
          alarmZone3TriggerE.setPresent();//sysj\ECS_plant.sysj line: 346, column: 35
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

  public void thread21507(int [] tdone, int [] ends){
        switch(S11297){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(fireZone2.getprestatus()){//sysj\ECS_plant.sysj line: 344, column: 24
          alarmZone2TriggerE.setPresent();//sysj\ECS_plant.sysj line: 344, column: 35
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

  public void thread21506(int [] tdone, int [] ends){
        switch(S11289){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        if(fireZone1.getprestatus()){//sysj\ECS_plant.sysj line: 342, column: 24
          alarmZone1TriggerE.setPresent();//sysj\ECS_plant.sysj line: 342, column: 35
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

  public void thread21505(int [] tdone, int [] ends){
        switch(S11547){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        thread21506(tdone,ends);
        thread21507(tdone,ends);
        thread21508(tdone,ends);
        thread21509(tdone,ends);
        thread21510(tdone,ends);
        thread21511(tdone,ends);
        thread21512(tdone,ends);
        thread21513(tdone,ends);
        thread21514(tdone,ends);
        thread21515(tdone,ends);
        thread21516(tdone,ends);
        thread21517(tdone,ends);
        thread21518(tdone,ends);
        thread21519(tdone,ends);
        thread21520(tdone,ends);
        thread21521(tdone,ends);
        thread21522(tdone,ends);
        thread21523(tdone,ends);
        thread21524(tdone,ends);
        thread21525(tdone,ends);
        thread21526(tdone,ends);
        thread21527(tdone,ends);
        thread21528(tdone,ends);
        thread21529(tdone,ends);
        thread21530(tdone,ends);
        thread21531(tdone,ends);
        thread21532(tdone,ends);
        thread21533(tdone,ends);
        thread21534(tdone,ends);
        thread21535(tdone,ends);
        thread21536(tdone,ends);
        thread21537(tdone,ends);
        thread21538(tdone,ends);
        int biggest21539 = 0;
        if(ends[4]>=biggest21539){
          biggest21539=ends[4];
        }
        if(ends[5]>=biggest21539){
          biggest21539=ends[5];
        }
        if(ends[6]>=biggest21539){
          biggest21539=ends[6];
        }
        if(ends[7]>=biggest21539){
          biggest21539=ends[7];
        }
        if(ends[8]>=biggest21539){
          biggest21539=ends[8];
        }
        if(ends[9]>=biggest21539){
          biggest21539=ends[9];
        }
        if(ends[10]>=biggest21539){
          biggest21539=ends[10];
        }
        if(ends[11]>=biggest21539){
          biggest21539=ends[11];
        }
        if(ends[12]>=biggest21539){
          biggest21539=ends[12];
        }
        if(ends[13]>=biggest21539){
          biggest21539=ends[13];
        }
        if(ends[14]>=biggest21539){
          biggest21539=ends[14];
        }
        if(ends[15]>=biggest21539){
          biggest21539=ends[15];
        }
        if(ends[16]>=biggest21539){
          biggest21539=ends[16];
        }
        if(ends[17]>=biggest21539){
          biggest21539=ends[17];
        }
        if(ends[18]>=biggest21539){
          biggest21539=ends[18];
        }
        if(ends[19]>=biggest21539){
          biggest21539=ends[19];
        }
        if(ends[20]>=biggest21539){
          biggest21539=ends[20];
        }
        if(ends[21]>=biggest21539){
          biggest21539=ends[21];
        }
        if(ends[22]>=biggest21539){
          biggest21539=ends[22];
        }
        if(ends[23]>=biggest21539){
          biggest21539=ends[23];
        }
        if(ends[24]>=biggest21539){
          biggest21539=ends[24];
        }
        if(ends[25]>=biggest21539){
          biggest21539=ends[25];
        }
        if(ends[26]>=biggest21539){
          biggest21539=ends[26];
        }
        if(ends[27]>=biggest21539){
          biggest21539=ends[27];
        }
        if(ends[28]>=biggest21539){
          biggest21539=ends[28];
        }
        if(ends[29]>=biggest21539){
          biggest21539=ends[29];
        }
        if(ends[30]>=biggest21539){
          biggest21539=ends[30];
        }
        if(ends[31]>=biggest21539){
          biggest21539=ends[31];
        }
        if(ends[32]>=biggest21539){
          biggest21539=ends[32];
        }
        if(ends[33]>=biggest21539){
          biggest21539=ends[33];
        }
        if(ends[34]>=biggest21539){
          biggest21539=ends[34];
        }
        if(ends[35]>=biggest21539){
          biggest21539=ends[35];
        }
        if(ends[36]>=biggest21539){
          biggest21539=ends[36];
        }
        if(biggest21539 == 1){
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        //FINXME code
        if(biggest21539 == 0){
          S11547=0;
          active[3]=0;
          ends[3]=0;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread21504(int [] tdone, int [] ends){
        switch(S11281){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S1633){
          case 0 : 
            if(run.getprestatus()){//sysj\ECS_plant.sysj line: 38, column: 10
              zone_thread_2 = 0;//sysj\ECS_plant.sysj line: 41, column: 4
              zone_thread_2 = (selectedZone.getpreval() == null ? null : ((Integer)selectedZone.getpreval()));//sysj\ECS_plant.sysj line: 42, column: 4
              lightIntensity_thread_2 = 0;//sysj\ECS_plant.sysj line: 45, column: 4
              lightIntensity_thread_2 = (lightInt.getpreval() == null ? null : ((Integer)lightInt.getpreval()));//sysj\ECS_plant.sysj line: 46, column: 4
              clock_thread_2 = "";//sysj\ECS_plant.sysj line: 49, column: 4
              clock_thread_2 = (time.getpreval() == null ? null : ((String)time.getpreval()));//sysj\ECS_plant.sysj line: 50, column: 4
              S1633=1;
              S1683=0;
              if(zone_thread_2 == 1){//sysj\ECS_plant.sysj line: 55, column: 8
                S1638=0;
                cutPowZ1.setPresent();//sysj\ECS_plant.sysj line: 57, column: 7
                currsigs.addElement(cutPowZ1);
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                S1683=1;
                if(zone_thread_2 == 2){//sysj\ECS_plant.sysj line: 68, column: 8
                  S1651=0;
                  cutPowZ2.setPresent();//sysj\ECS_plant.sysj line: 70, column: 7
                  currsigs.addElement(cutPowZ2);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S1683=2;
                  if(zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 79, column: 8
                    S1688=0;
                    cutPowZ3.setPresent();//sysj\ECS_plant.sysj line: 81, column: 7
                    currsigs.addElement(cutPowZ3);
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S1683=3;
                    if(zone_thread_2 == 4){//sysj\ECS_plant.sysj line: 90, column: 8
                      S1724=0;
                      cutPowZ4.setPresent();//sysj\ECS_plant.sysj line: 92, column: 7
                      currsigs.addElement(cutPowZ4);
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S1683=4;
                      if(zone_thread_2 == 5){//sysj\ECS_plant.sysj line: 101, column: 8
                        S1760=0;
                        cutPowZ5.setPresent();//sysj\ECS_plant.sysj line: 103, column: 7
                        currsigs.addElement(cutPowZ5);
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
                        S1683=5;
                        if(zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 112, column: 8
                          S1796=0;
                          cutPowZ6.setPresent();//sysj\ECS_plant.sysj line: 114, column: 7
                          currsigs.addElement(cutPowZ6);
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          S1683=6;
                          if(zone_thread_2 == 7){//sysj\ECS_plant.sysj line: 123, column: 8
                            S1832=0;
                            cutPowZ7.setPresent();//sysj\ECS_plant.sysj line: 125, column: 7
                            currsigs.addElement(cutPowZ7);
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S1633=2;
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
            if(fire.getprestatus()){//sysj\ECS_plant.sysj line: 54, column: 10
              S1633=2;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              switch(S1683){
                case 0 : 
                  switch(S1638){
                    case 0 : 
                      cutPowZ1.setPresent();//sysj\ECS_plant.sysj line: 57, column: 7
                      currsigs.addElement(cutPowZ1);
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                      break;
                    
                    case 1 : 
                      if(powerOff.getprestatus()){//sysj\ECS_plant.sysj line: 60, column: 12
                        S1638=2;
                        fireZone1.setPresent();//sysj\ECS_plant.sysj line: 62, column: 7
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
                      fireZone1.setPresent();//sysj\ECS_plant.sysj line: 62, column: 7
                      currsigs.addElement(fireZone1);
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                      break;
                    
                    case 3 : 
                      if(alarmOff.getprestatus()){//sysj\ECS_plant.sysj line: 65, column: 12
                        System.out.println("Fire Out");//sysj\ECS_plant.sysj line: 66, column: 6
                        S1683=1;
                        if(zone_thread_2 == 2){//sysj\ECS_plant.sysj line: 68, column: 8
                          S1651=0;
                          cutPowZ2.setPresent();//sysj\ECS_plant.sysj line: 70, column: 7
                          currsigs.addElement(cutPowZ2);
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          S1683=2;
                          if(zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 79, column: 8
                            S1688=0;
                            cutPowZ3.setPresent();//sysj\ECS_plant.sysj line: 81, column: 7
                            currsigs.addElement(cutPowZ3);
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S1683=3;
                            if(zone_thread_2 == 4){//sysj\ECS_plant.sysj line: 90, column: 8
                              S1724=0;
                              cutPowZ4.setPresent();//sysj\ECS_plant.sysj line: 92, column: 7
                              currsigs.addElement(cutPowZ4);
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S1683=4;
                              if(zone_thread_2 == 5){//sysj\ECS_plant.sysj line: 101, column: 8
                                S1760=0;
                                cutPowZ5.setPresent();//sysj\ECS_plant.sysj line: 103, column: 7
                                currsigs.addElement(cutPowZ5);
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                              else {
                                S1683=5;
                                if(zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 112, column: 8
                                  S1796=0;
                                  cutPowZ6.setPresent();//sysj\ECS_plant.sysj line: 114, column: 7
                                  currsigs.addElement(cutPowZ6);
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                                else {
                                  S1683=6;
                                  if(zone_thread_2 == 7){//sysj\ECS_plant.sysj line: 123, column: 8
                                    S1832=0;
                                    cutPowZ7.setPresent();//sysj\ECS_plant.sysj line: 125, column: 7
                                    currsigs.addElement(cutPowZ7);
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                  else {
                                    S1633=2;
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
                  switch(S1651){
                    case 0 : 
                      cutPowZ2.setPresent();//sysj\ECS_plant.sysj line: 70, column: 7
                      currsigs.addElement(cutPowZ2);
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                      break;
                    
                    case 1 : 
                      if(powerOff.getprestatus()){//sysj\ECS_plant.sysj line: 73, column: 12
                        S1651=2;
                        fireZone2.setPresent();//sysj\ECS_plant.sysj line: 75, column: 7
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
                      fireZone2.setPresent();//sysj\ECS_plant.sysj line: 75, column: 7
                      currsigs.addElement(fireZone2);
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                      break;
                    
                  }
                  break;
                
                case 2 : 
                  switch(S1688){
                    case 0 : 
                      cutPowZ3.setPresent();//sysj\ECS_plant.sysj line: 81, column: 7
                      currsigs.addElement(cutPowZ3);
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                      break;
                    
                    case 1 : 
                      if(powerOff.getprestatus()){//sysj\ECS_plant.sysj line: 84, column: 12
                        S1688=2;
                        fireZone3.setPresent();//sysj\ECS_plant.sysj line: 86, column: 7
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
                      fireZone3.setPresent();//sysj\ECS_plant.sysj line: 86, column: 7
                      currsigs.addElement(fireZone3);
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                      break;
                    
                  }
                  break;
                
                case 3 : 
                  switch(S1724){
                    case 0 : 
                      cutPowZ4.setPresent();//sysj\ECS_plant.sysj line: 92, column: 7
                      currsigs.addElement(cutPowZ4);
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                      break;
                    
                    case 1 : 
                      if(powerOff.getprestatus()){//sysj\ECS_plant.sysj line: 95, column: 12
                        S1724=2;
                        fireZone4.setPresent();//sysj\ECS_plant.sysj line: 97, column: 7
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
                      fireZone4.setPresent();//sysj\ECS_plant.sysj line: 97, column: 7
                      currsigs.addElement(fireZone4);
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                      break;
                    
                  }
                  break;
                
                case 4 : 
                  switch(S1760){
                    case 0 : 
                      cutPowZ5.setPresent();//sysj\ECS_plant.sysj line: 103, column: 7
                      currsigs.addElement(cutPowZ5);
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                      break;
                    
                    case 1 : 
                      if(powerOff.getprestatus()){//sysj\ECS_plant.sysj line: 106, column: 12
                        S1760=2;
                        fireZone5.setPresent();//sysj\ECS_plant.sysj line: 108, column: 7
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
                      fireZone5.setPresent();//sysj\ECS_plant.sysj line: 108, column: 7
                      currsigs.addElement(fireZone5);
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                      break;
                    
                  }
                  break;
                
                case 5 : 
                  switch(S1796){
                    case 0 : 
                      cutPowZ6.setPresent();//sysj\ECS_plant.sysj line: 114, column: 7
                      currsigs.addElement(cutPowZ6);
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                      break;
                    
                    case 1 : 
                      if(powerOff.getprestatus()){//sysj\ECS_plant.sysj line: 117, column: 12
                        S1796=2;
                        fireZone7.setPresent();//sysj\ECS_plant.sysj line: 119, column: 7
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
                      fireZone7.setPresent();//sysj\ECS_plant.sysj line: 119, column: 7
                      currsigs.addElement(fireZone7);
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                      break;
                    
                  }
                  break;
                
                case 6 : 
                  switch(S1832){
                    case 0 : 
                      cutPowZ7.setPresent();//sysj\ECS_plant.sysj line: 125, column: 7
                      currsigs.addElement(cutPowZ7);
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                      break;
                    
                    case 1 : 
                      if(powerOff.getprestatus()){//sysj\ECS_plant.sysj line: 128, column: 12
                        S1832=2;
                        fireZone7.setPresent();//sysj\ECS_plant.sysj line: 130, column: 7
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
                      fireZone7.setPresent();//sysj\ECS_plant.sysj line: 130, column: 7
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
            if(run.getprestatus()){//sysj\ECS_plant.sysj line: 137, column: 10
              S1633=3;
              S2112=0;
              if(zone_thread_2 == 1){//sysj\ECS_plant.sysj line: 142, column: 8
                cleanZone1.setPresent();//sysj\ECS_plant.sysj line: 144, column: 7
                currsigs.addElement(cleanZone1);
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                S2112=1;
                if(zone_thread_2 == 2){//sysj\ECS_plant.sysj line: 148, column: 8
                  cleanZone2.setPresent();//sysj\ECS_plant.sysj line: 150, column: 7
                  currsigs.addElement(cleanZone2);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S2112=2;
                  if(zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 154, column: 8
                    cleanZone3.setPresent();//sysj\ECS_plant.sysj line: 156, column: 7
                    currsigs.addElement(cleanZone3);
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S2112=3;
                    if(zone_thread_2 == 4){//sysj\ECS_plant.sysj line: 160, column: 8
                      cleanZone4.setPresent();//sysj\ECS_plant.sysj line: 162, column: 7
                      currsigs.addElement(cleanZone4);
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S2112=4;
                      if(zone_thread_2 == 5){//sysj\ECS_plant.sysj line: 166, column: 8
                        cleanZone5.setPresent();//sysj\ECS_plant.sysj line: 168, column: 7
                        currsigs.addElement(cleanZone5);
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
                        S2112=5;
                        if(zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 172, column: 8
                          cleanZone7.setPresent();//sysj\ECS_plant.sysj line: 174, column: 7
                          currsigs.addElement(cleanZone7);
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          S2112=6;
                          if(zone_thread_2 == 7){//sysj\ECS_plant.sysj line: 178, column: 8
                            cleanZone7.setPresent();//sysj\ECS_plant.sysj line: 180, column: 7
                            currsigs.addElement(cleanZone7);
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S1633=4;
                            if(zone_thread_2 == 1 || zone_thread_2 == 7){//sysj\ECS_plant.sysj line: 187, column: 7
                              temp17_thread_2 = 0;//sysj\ECS_plant.sysj line: 188, column: 5
                              temp17_thread_2 = (tempZone1_7.getpreval() == null ? null : ((Integer)tempZone1_7.getpreval()));//sysj\ECS_plant.sysj line: 189, column: 5
                              if(temp17_thread_2 > 22){//sysj\ECS_plant.sysj line: 190, column: 8
                                S2217=0;
                                System.out.println("");//sysj\ECS_plant.sysj line: 192, column: 7
                                System.out.println("Room temperature is too high at " + temp17_thread_2);//sysj\ECS_plant.sysj line: 193, column: 7
                                fanOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 194, column: 7
                                currsigs.addElement(fanOnZone1_7);
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                              else {
                                S2217=1;
                                if(temp17_thread_2 < 21){//sysj\ECS_plant.sysj line: 197, column: 15
                                  S2216=0;
                                  System.out.println("Room temperature is too low at " + temp17_thread_2);//sysj\ECS_plant.sysj line: 199, column: 7
                                  heatOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 200, column: 7
                                  currsigs.addElement(heatOnZone1_7);
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                                else {
                                  S2216=1;
                                  System.out.println("");//sysj\ECS_plant.sysj line: 204, column: 6
                                  System.out.println("Room temperature is safe at" + temp17_thread_2);//sysj\ECS_plant.sysj line: 205, column: 6
                                  S1633=5;
                                  if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 210, column: 7
                                    temp23_thread_2 = 0;//sysj\ECS_plant.sysj line: 211, column: 5
                                    temp23_thread_2 = (tempZone2_3.getpreval() == null ? null : ((Integer)tempZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 212, column: 5
                                    if(temp23_thread_2 > 22){//sysj\ECS_plant.sysj line: 213, column: 8
                                      S2277=0;
                                      System.out.println("");//sysj\ECS_plant.sysj line: 215, column: 7
                                      System.out.println("Room temperature is too high at " + temp23_thread_2);//sysj\ECS_plant.sysj line: 216, column: 7
                                      airOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 217, column: 7
                                      currsigs.addElement(airOnZone2_3);
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                    else {
                                      S2277=1;
                                      if(temp23_thread_2 < 21){//sysj\ECS_plant.sysj line: 220, column: 15
                                        heatOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 222, column: 7
                                        currsigs.addElement(heatOnZone2_3);
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                      else {
                                        System.out.println("");//sysj\ECS_plant.sysj line: 226, column: 6
                                        System.out.println("Room temperature is safe at" + temp23_thread_2);//sysj\ECS_plant.sysj line: 227, column: 6
                                        S1633=6;
                                        if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 233, column: 7
                                          temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 234, column: 5
                                          temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 235, column: 5
                                          if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 236, column: 8
                                            S2377=0;
                                            System.out.println("");//sysj\ECS_plant.sysj line: 238, column: 7
                                            System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 239, column: 7
                                            airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 240, column: 7
                                            currsigs.addElement(airOnZone4_5_6);
                                            active[2]=1;
                                            ends[2]=1;
                                            tdone[2]=1;
                                          }
                                          else {
                                            S2377=1;
                                            if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 243, column: 15
                                              System.out.println("");//sysj\ECS_plant.sysj line: 245, column: 7
                                              System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 246, column: 7
                                              heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 247, column: 7
                                              currsigs.addElement(heatOnZone4_5_6);
                                              active[2]=1;
                                              ends[2]=1;
                                              tdone[2]=1;
                                            }
                                            else {
                                              System.out.println("");//sysj\ECS_plant.sysj line: 251, column: 6
                                              System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 252, column: 6
                                              S1633=7;
                                              if(zone_thread_2 == 1 || zone_thread_2 == 7){//sysj\ECS_plant.sysj line: 258, column: 7
                                                humid17_thread_2 = 0;//sysj\ECS_plant.sysj line: 259, column: 5
                                                humid17_thread_2 = (humidZone1_7.getpreval() == null ? null : ((Integer)humidZone1_7.getpreval()));//sysj\ECS_plant.sysj line: 260, column: 5
                                                if(humid17_thread_2 > 60){//sysj\ECS_plant.sysj line: 261, column: 8
                                                  S2557=0;
                                                  System.out.println("");//sysj\ECS_plant.sysj line: 263, column: 7
                                                  System.out.println("Room humidity is too high at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 264, column: 7
                                                  System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 265, column: 7
                                                  deHumOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 266, column: 7
                                                  currsigs.addElement(deHumOnZone1_7);
                                                  active[2]=1;
                                                  ends[2]=1;
                                                  tdone[2]=1;
                                                }
                                                else {
                                                  S2557=1;
                                                  if(humid17_thread_2 < 30){//sysj\ECS_plant.sysj line: 269, column: 15
                                                    System.out.println("");//sysj\ECS_plant.sysj line: 271, column: 7
                                                    System.out.println("Room humidity is too low at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 272, column: 7
                                                    System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 273, column: 7
                                                    humOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 274, column: 7
                                                    currsigs.addElement(humOnZone1_7);
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                  else {
                                                    System.out.println("");//sysj\ECS_plant.sysj line: 278, column: 6
                                                    System.out.println("Room humidity is safe at" + humid17_thread_2);//sysj\ECS_plant.sysj line: 279, column: 6
                                                    S1633=8;
                                                    if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 284, column: 7
                                                      humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 285, column: 5
                                                      humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 286, column: 5
                                                      if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 287, column: 8
                                                        S2897=0;
                                                        System.out.println("");//sysj\ECS_plant.sysj line: 289, column: 7
                                                        System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 290, column: 7
                                                        System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 291, column: 7
                                                        deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 292, column: 7
                                                        currsigs.addElement(deHumOnZone2_3);
                                                        active[2]=1;
                                                        ends[2]=1;
                                                        tdone[2]=1;
                                                      }
                                                      else {
                                                        S2897=1;
                                                        if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 295, column: 15
                                                          System.out.println("");//sysj\ECS_plant.sysj line: 297, column: 7
                                                          System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 298, column: 7
                                                          System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 299, column: 7
                                                          humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 300, column: 7
                                                          currsigs.addElement(humOnZone2_3);
                                                          active[2]=1;
                                                          ends[2]=1;
                                                          tdone[2]=1;
                                                        }
                                                        else {
                                                          System.out.println("");//sysj\ECS_plant.sysj line: 304, column: 6
                                                          System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 305, column: 6
                                                          S1633=9;
                                                          if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 310, column: 7
                                                            humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 311, column: 5
                                                            humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 312, column: 5
                                                            if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 313, column: 8
                                                              S3557=0;
                                                              System.out.println("");//sysj\ECS_plant.sysj line: 315, column: 7
                                                              System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 316, column: 7
                                                              System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 317, column: 7
                                                              deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 318, column: 7
                                                              currsigs.addElement(deHumOnZone4_5_6);
                                                              active[2]=1;
                                                              ends[2]=1;
                                                              tdone[2]=1;
                                                            }
                                                            else {
                                                              S3557=1;
                                                              if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 321, column: 15
                                                                System.out.println("");//sysj\ECS_plant.sysj line: 323, column: 7
                                                                System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 324, column: 7
                                                                System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 325, column: 7
                                                                humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 326, column: 7
                                                                currsigs.addElement(humOnZone4_5_6);
                                                                active[2]=1;
                                                                ends[2]=1;
                                                                tdone[2]=1;
                                                              }
                                                              else {
                                                                System.out.println("");//sysj\ECS_plant.sysj line: 330, column: 6
                                                                System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 331, column: 6
                                                                S1633=10;
                                                                active[2]=1;
                                                                ends[2]=1;
                                                                tdone[2]=1;
                                                              }
                                                            }
                                                          }
                                                          else {
                                                            S1633=10;
                                                            active[2]=1;
                                                            ends[2]=1;
                                                            tdone[2]=1;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    else {
                                                      S1633=9;
                                                      if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 310, column: 7
                                                        humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 311, column: 5
                                                        humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 312, column: 5
                                                        if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 313, column: 8
                                                          S3557=0;
                                                          System.out.println("");//sysj\ECS_plant.sysj line: 315, column: 7
                                                          System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 316, column: 7
                                                          System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 317, column: 7
                                                          deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 318, column: 7
                                                          currsigs.addElement(deHumOnZone4_5_6);
                                                          active[2]=1;
                                                          ends[2]=1;
                                                          tdone[2]=1;
                                                        }
                                                        else {
                                                          S3557=1;
                                                          if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 321, column: 15
                                                            System.out.println("");//sysj\ECS_plant.sysj line: 323, column: 7
                                                            System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 324, column: 7
                                                            System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 325, column: 7
                                                            humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 326, column: 7
                                                            currsigs.addElement(humOnZone4_5_6);
                                                            active[2]=1;
                                                            ends[2]=1;
                                                            tdone[2]=1;
                                                          }
                                                          else {
                                                            System.out.println("");//sysj\ECS_plant.sysj line: 330, column: 6
                                                            System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 331, column: 6
                                                            S1633=10;
                                                            active[2]=1;
                                                            ends[2]=1;
                                                            tdone[2]=1;
                                                          }
                                                        }
                                                      }
                                                      else {
                                                        S1633=10;
                                                        active[2]=1;
                                                        ends[2]=1;
                                                        tdone[2]=1;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              else {
                                                S1633=8;
                                                if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 284, column: 7
                                                  humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 285, column: 5
                                                  humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 286, column: 5
                                                  if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 287, column: 8
                                                    S2897=0;
                                                    System.out.println("");//sysj\ECS_plant.sysj line: 289, column: 7
                                                    System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 290, column: 7
                                                    System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 291, column: 7
                                                    deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 292, column: 7
                                                    currsigs.addElement(deHumOnZone2_3);
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                  else {
                                                    S2897=1;
                                                    if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 295, column: 15
                                                      System.out.println("");//sysj\ECS_plant.sysj line: 297, column: 7
                                                      System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 298, column: 7
                                                      System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 299, column: 7
                                                      humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 300, column: 7
                                                      currsigs.addElement(humOnZone2_3);
                                                      active[2]=1;
                                                      ends[2]=1;
                                                      tdone[2]=1;
                                                    }
                                                    else {
                                                      System.out.println("");//sysj\ECS_plant.sysj line: 304, column: 6
                                                      System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 305, column: 6
                                                      S1633=9;
                                                      if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 310, column: 7
                                                        humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 311, column: 5
                                                        humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 312, column: 5
                                                        if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 313, column: 8
                                                          S3557=0;
                                                          System.out.println("");//sysj\ECS_plant.sysj line: 315, column: 7
                                                          System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 316, column: 7
                                                          System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 317, column: 7
                                                          deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 318, column: 7
                                                          currsigs.addElement(deHumOnZone4_5_6);
                                                          active[2]=1;
                                                          ends[2]=1;
                                                          tdone[2]=1;
                                                        }
                                                        else {
                                                          S3557=1;
                                                          if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 321, column: 15
                                                            System.out.println("");//sysj\ECS_plant.sysj line: 323, column: 7
                                                            System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 324, column: 7
                                                            System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 325, column: 7
                                                            humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 326, column: 7
                                                            currsigs.addElement(humOnZone4_5_6);
                                                            active[2]=1;
                                                            ends[2]=1;
                                                            tdone[2]=1;
                                                          }
                                                          else {
                                                            System.out.println("");//sysj\ECS_plant.sysj line: 330, column: 6
                                                            System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 331, column: 6
                                                            S1633=10;
                                                            active[2]=1;
                                                            ends[2]=1;
                                                            tdone[2]=1;
                                                          }
                                                        }
                                                      }
                                                      else {
                                                        S1633=10;
                                                        active[2]=1;
                                                        ends[2]=1;
                                                        tdone[2]=1;
                                                      }
                                                    }
                                                  }
                                                }
                                                else {
                                                  S1633=9;
                                                  if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 310, column: 7
                                                    humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 311, column: 5
                                                    humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 312, column: 5
                                                    if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 313, column: 8
                                                      S3557=0;
                                                      System.out.println("");//sysj\ECS_plant.sysj line: 315, column: 7
                                                      System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 316, column: 7
                                                      System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 317, column: 7
                                                      deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 318, column: 7
                                                      currsigs.addElement(deHumOnZone4_5_6);
                                                      active[2]=1;
                                                      ends[2]=1;
                                                      tdone[2]=1;
                                                    }
                                                    else {
                                                      S3557=1;
                                                      if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 321, column: 15
                                                        System.out.println("");//sysj\ECS_plant.sysj line: 323, column: 7
                                                        System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 324, column: 7
                                                        System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 325, column: 7
                                                        humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 326, column: 7
                                                        currsigs.addElement(humOnZone4_5_6);
                                                        active[2]=1;
                                                        ends[2]=1;
                                                        tdone[2]=1;
                                                      }
                                                      else {
                                                        System.out.println("");//sysj\ECS_plant.sysj line: 330, column: 6
                                                        System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 331, column: 6
                                                        S1633=10;
                                                        active[2]=1;
                                                        ends[2]=1;
                                                        tdone[2]=1;
                                                      }
                                                    }
                                                  }
                                                  else {
                                                    S1633=10;
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
                                          S1633=7;
                                          if(zone_thread_2 == 1 || zone_thread_2 == 7){//sysj\ECS_plant.sysj line: 258, column: 7
                                            humid17_thread_2 = 0;//sysj\ECS_plant.sysj line: 259, column: 5
                                            humid17_thread_2 = (humidZone1_7.getpreval() == null ? null : ((Integer)humidZone1_7.getpreval()));//sysj\ECS_plant.sysj line: 260, column: 5
                                            if(humid17_thread_2 > 60){//sysj\ECS_plant.sysj line: 261, column: 8
                                              S2557=0;
                                              System.out.println("");//sysj\ECS_plant.sysj line: 263, column: 7
                                              System.out.println("Room humidity is too high at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 264, column: 7
                                              System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 265, column: 7
                                              deHumOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 266, column: 7
                                              currsigs.addElement(deHumOnZone1_7);
                                              active[2]=1;
                                              ends[2]=1;
                                              tdone[2]=1;
                                            }
                                            else {
                                              S2557=1;
                                              if(humid17_thread_2 < 30){//sysj\ECS_plant.sysj line: 269, column: 15
                                                System.out.println("");//sysj\ECS_plant.sysj line: 271, column: 7
                                                System.out.println("Room humidity is too low at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 272, column: 7
                                                System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 273, column: 7
                                                humOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 274, column: 7
                                                currsigs.addElement(humOnZone1_7);
                                                active[2]=1;
                                                ends[2]=1;
                                                tdone[2]=1;
                                              }
                                              else {
                                                System.out.println("");//sysj\ECS_plant.sysj line: 278, column: 6
                                                System.out.println("Room humidity is safe at" + humid17_thread_2);//sysj\ECS_plant.sysj line: 279, column: 6
                                                S1633=8;
                                                if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 284, column: 7
                                                  humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 285, column: 5
                                                  humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 286, column: 5
                                                  if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 287, column: 8
                                                    S2897=0;
                                                    System.out.println("");//sysj\ECS_plant.sysj line: 289, column: 7
                                                    System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 290, column: 7
                                                    System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 291, column: 7
                                                    deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 292, column: 7
                                                    currsigs.addElement(deHumOnZone2_3);
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                  else {
                                                    S2897=1;
                                                    if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 295, column: 15
                                                      System.out.println("");//sysj\ECS_plant.sysj line: 297, column: 7
                                                      System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 298, column: 7
                                                      System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 299, column: 7
                                                      humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 300, column: 7
                                                      currsigs.addElement(humOnZone2_3);
                                                      active[2]=1;
                                                      ends[2]=1;
                                                      tdone[2]=1;
                                                    }
                                                    else {
                                                      System.out.println("");//sysj\ECS_plant.sysj line: 304, column: 6
                                                      System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 305, column: 6
                                                      S1633=9;
                                                      if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 310, column: 7
                                                        humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 311, column: 5
                                                        humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 312, column: 5
                                                        if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 313, column: 8
                                                          S3557=0;
                                                          System.out.println("");//sysj\ECS_plant.sysj line: 315, column: 7
                                                          System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 316, column: 7
                                                          System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 317, column: 7
                                                          deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 318, column: 7
                                                          currsigs.addElement(deHumOnZone4_5_6);
                                                          active[2]=1;
                                                          ends[2]=1;
                                                          tdone[2]=1;
                                                        }
                                                        else {
                                                          S3557=1;
                                                          if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 321, column: 15
                                                            System.out.println("");//sysj\ECS_plant.sysj line: 323, column: 7
                                                            System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 324, column: 7
                                                            System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 325, column: 7
                                                            humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 326, column: 7
                                                            currsigs.addElement(humOnZone4_5_6);
                                                            active[2]=1;
                                                            ends[2]=1;
                                                            tdone[2]=1;
                                                          }
                                                          else {
                                                            System.out.println("");//sysj\ECS_plant.sysj line: 330, column: 6
                                                            System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 331, column: 6
                                                            S1633=10;
                                                            active[2]=1;
                                                            ends[2]=1;
                                                            tdone[2]=1;
                                                          }
                                                        }
                                                      }
                                                      else {
                                                        S1633=10;
                                                        active[2]=1;
                                                        ends[2]=1;
                                                        tdone[2]=1;
                                                      }
                                                    }
                                                  }
                                                }
                                                else {
                                                  S1633=9;
                                                  if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 310, column: 7
                                                    humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 311, column: 5
                                                    humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 312, column: 5
                                                    if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 313, column: 8
                                                      S3557=0;
                                                      System.out.println("");//sysj\ECS_plant.sysj line: 315, column: 7
                                                      System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 316, column: 7
                                                      System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 317, column: 7
                                                      deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 318, column: 7
                                                      currsigs.addElement(deHumOnZone4_5_6);
                                                      active[2]=1;
                                                      ends[2]=1;
                                                      tdone[2]=1;
                                                    }
                                                    else {
                                                      S3557=1;
                                                      if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 321, column: 15
                                                        System.out.println("");//sysj\ECS_plant.sysj line: 323, column: 7
                                                        System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 324, column: 7
                                                        System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 325, column: 7
                                                        humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 326, column: 7
                                                        currsigs.addElement(humOnZone4_5_6);
                                                        active[2]=1;
                                                        ends[2]=1;
                                                        tdone[2]=1;
                                                      }
                                                      else {
                                                        System.out.println("");//sysj\ECS_plant.sysj line: 330, column: 6
                                                        System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 331, column: 6
                                                        S1633=10;
                                                        active[2]=1;
                                                        ends[2]=1;
                                                        tdone[2]=1;
                                                      }
                                                    }
                                                  }
                                                  else {
                                                    S1633=10;
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          else {
                                            S1633=8;
                                            if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 284, column: 7
                                              humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 285, column: 5
                                              humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 286, column: 5
                                              if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 287, column: 8
                                                S2897=0;
                                                System.out.println("");//sysj\ECS_plant.sysj line: 289, column: 7
                                                System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 290, column: 7
                                                System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 291, column: 7
                                                deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 292, column: 7
                                                currsigs.addElement(deHumOnZone2_3);
                                                active[2]=1;
                                                ends[2]=1;
                                                tdone[2]=1;
                                              }
                                              else {
                                                S2897=1;
                                                if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 295, column: 15
                                                  System.out.println("");//sysj\ECS_plant.sysj line: 297, column: 7
                                                  System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 298, column: 7
                                                  System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 299, column: 7
                                                  humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 300, column: 7
                                                  currsigs.addElement(humOnZone2_3);
                                                  active[2]=1;
                                                  ends[2]=1;
                                                  tdone[2]=1;
                                                }
                                                else {
                                                  System.out.println("");//sysj\ECS_plant.sysj line: 304, column: 6
                                                  System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 305, column: 6
                                                  S1633=9;
                                                  if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 310, column: 7
                                                    humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 311, column: 5
                                                    humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 312, column: 5
                                                    if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 313, column: 8
                                                      S3557=0;
                                                      System.out.println("");//sysj\ECS_plant.sysj line: 315, column: 7
                                                      System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 316, column: 7
                                                      System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 317, column: 7
                                                      deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 318, column: 7
                                                      currsigs.addElement(deHumOnZone4_5_6);
                                                      active[2]=1;
                                                      ends[2]=1;
                                                      tdone[2]=1;
                                                    }
                                                    else {
                                                      S3557=1;
                                                      if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 321, column: 15
                                                        System.out.println("");//sysj\ECS_plant.sysj line: 323, column: 7
                                                        System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 324, column: 7
                                                        System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 325, column: 7
                                                        humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 326, column: 7
                                                        currsigs.addElement(humOnZone4_5_6);
                                                        active[2]=1;
                                                        ends[2]=1;
                                                        tdone[2]=1;
                                                      }
                                                      else {
                                                        System.out.println("");//sysj\ECS_plant.sysj line: 330, column: 6
                                                        System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 331, column: 6
                                                        S1633=10;
                                                        active[2]=1;
                                                        ends[2]=1;
                                                        tdone[2]=1;
                                                      }
                                                    }
                                                  }
                                                  else {
                                                    S1633=10;
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                }
                                              }
                                            }
                                            else {
                                              S1633=9;
                                              if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 310, column: 7
                                                humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 311, column: 5
                                                humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 312, column: 5
                                                if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 313, column: 8
                                                  S3557=0;
                                                  System.out.println("");//sysj\ECS_plant.sysj line: 315, column: 7
                                                  System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 316, column: 7
                                                  System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 317, column: 7
                                                  deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 318, column: 7
                                                  currsigs.addElement(deHumOnZone4_5_6);
                                                  active[2]=1;
                                                  ends[2]=1;
                                                  tdone[2]=1;
                                                }
                                                else {
                                                  S3557=1;
                                                  if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 321, column: 15
                                                    System.out.println("");//sysj\ECS_plant.sysj line: 323, column: 7
                                                    System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 324, column: 7
                                                    System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 325, column: 7
                                                    humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 326, column: 7
                                                    currsigs.addElement(humOnZone4_5_6);
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                  else {
                                                    System.out.println("");//sysj\ECS_plant.sysj line: 330, column: 6
                                                    System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 331, column: 6
                                                    S1633=10;
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                }
                                              }
                                              else {
                                                S1633=10;
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
                                    S1633=6;
                                    if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 233, column: 7
                                      temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 234, column: 5
                                      temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 235, column: 5
                                      if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 236, column: 8
                                        S2377=0;
                                        System.out.println("");//sysj\ECS_plant.sysj line: 238, column: 7
                                        System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 239, column: 7
                                        airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 240, column: 7
                                        currsigs.addElement(airOnZone4_5_6);
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                      else {
                                        S2377=1;
                                        if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 243, column: 15
                                          System.out.println("");//sysj\ECS_plant.sysj line: 245, column: 7
                                          System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 246, column: 7
                                          heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 247, column: 7
                                          currsigs.addElement(heatOnZone4_5_6);
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                        else {
                                          System.out.println("");//sysj\ECS_plant.sysj line: 251, column: 6
                                          System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 252, column: 6
                                          S1633=7;
                                          if(zone_thread_2 == 1 || zone_thread_2 == 7){//sysj\ECS_plant.sysj line: 258, column: 7
                                            humid17_thread_2 = 0;//sysj\ECS_plant.sysj line: 259, column: 5
                                            humid17_thread_2 = (humidZone1_7.getpreval() == null ? null : ((Integer)humidZone1_7.getpreval()));//sysj\ECS_plant.sysj line: 260, column: 5
                                            if(humid17_thread_2 > 60){//sysj\ECS_plant.sysj line: 261, column: 8
                                              S2557=0;
                                              System.out.println("");//sysj\ECS_plant.sysj line: 263, column: 7
                                              System.out.println("Room humidity is too high at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 264, column: 7
                                              System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 265, column: 7
                                              deHumOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 266, column: 7
                                              currsigs.addElement(deHumOnZone1_7);
                                              active[2]=1;
                                              ends[2]=1;
                                              tdone[2]=1;
                                            }
                                            else {
                                              S2557=1;
                                              if(humid17_thread_2 < 30){//sysj\ECS_plant.sysj line: 269, column: 15
                                                System.out.println("");//sysj\ECS_plant.sysj line: 271, column: 7
                                                System.out.println("Room humidity is too low at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 272, column: 7
                                                System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 273, column: 7
                                                humOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 274, column: 7
                                                currsigs.addElement(humOnZone1_7);
                                                active[2]=1;
                                                ends[2]=1;
                                                tdone[2]=1;
                                              }
                                              else {
                                                System.out.println("");//sysj\ECS_plant.sysj line: 278, column: 6
                                                System.out.println("Room humidity is safe at" + humid17_thread_2);//sysj\ECS_plant.sysj line: 279, column: 6
                                                S1633=8;
                                                if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 284, column: 7
                                                  humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 285, column: 5
                                                  humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 286, column: 5
                                                  if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 287, column: 8
                                                    S2897=0;
                                                    System.out.println("");//sysj\ECS_plant.sysj line: 289, column: 7
                                                    System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 290, column: 7
                                                    System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 291, column: 7
                                                    deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 292, column: 7
                                                    currsigs.addElement(deHumOnZone2_3);
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                  else {
                                                    S2897=1;
                                                    if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 295, column: 15
                                                      System.out.println("");//sysj\ECS_plant.sysj line: 297, column: 7
                                                      System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 298, column: 7
                                                      System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 299, column: 7
                                                      humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 300, column: 7
                                                      currsigs.addElement(humOnZone2_3);
                                                      active[2]=1;
                                                      ends[2]=1;
                                                      tdone[2]=1;
                                                    }
                                                    else {
                                                      System.out.println("");//sysj\ECS_plant.sysj line: 304, column: 6
                                                      System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 305, column: 6
                                                      S1633=9;
                                                      if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 310, column: 7
                                                        humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 311, column: 5
                                                        humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 312, column: 5
                                                        if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 313, column: 8
                                                          S3557=0;
                                                          System.out.println("");//sysj\ECS_plant.sysj line: 315, column: 7
                                                          System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 316, column: 7
                                                          System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 317, column: 7
                                                          deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 318, column: 7
                                                          currsigs.addElement(deHumOnZone4_5_6);
                                                          active[2]=1;
                                                          ends[2]=1;
                                                          tdone[2]=1;
                                                        }
                                                        else {
                                                          S3557=1;
                                                          if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 321, column: 15
                                                            System.out.println("");//sysj\ECS_plant.sysj line: 323, column: 7
                                                            System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 324, column: 7
                                                            System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 325, column: 7
                                                            humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 326, column: 7
                                                            currsigs.addElement(humOnZone4_5_6);
                                                            active[2]=1;
                                                            ends[2]=1;
                                                            tdone[2]=1;
                                                          }
                                                          else {
                                                            System.out.println("");//sysj\ECS_plant.sysj line: 330, column: 6
                                                            System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 331, column: 6
                                                            S1633=10;
                                                            active[2]=1;
                                                            ends[2]=1;
                                                            tdone[2]=1;
                                                          }
                                                        }
                                                      }
                                                      else {
                                                        S1633=10;
                                                        active[2]=1;
                                                        ends[2]=1;
                                                        tdone[2]=1;
                                                      }
                                                    }
                                                  }
                                                }
                                                else {
                                                  S1633=9;
                                                  if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 310, column: 7
                                                    humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 311, column: 5
                                                    humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 312, column: 5
                                                    if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 313, column: 8
                                                      S3557=0;
                                                      System.out.println("");//sysj\ECS_plant.sysj line: 315, column: 7
                                                      System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 316, column: 7
                                                      System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 317, column: 7
                                                      deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 318, column: 7
                                                      currsigs.addElement(deHumOnZone4_5_6);
                                                      active[2]=1;
                                                      ends[2]=1;
                                                      tdone[2]=1;
                                                    }
                                                    else {
                                                      S3557=1;
                                                      if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 321, column: 15
                                                        System.out.println("");//sysj\ECS_plant.sysj line: 323, column: 7
                                                        System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 324, column: 7
                                                        System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 325, column: 7
                                                        humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 326, column: 7
                                                        currsigs.addElement(humOnZone4_5_6);
                                                        active[2]=1;
                                                        ends[2]=1;
                                                        tdone[2]=1;
                                                      }
                                                      else {
                                                        System.out.println("");//sysj\ECS_plant.sysj line: 330, column: 6
                                                        System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 331, column: 6
                                                        S1633=10;
                                                        active[2]=1;
                                                        ends[2]=1;
                                                        tdone[2]=1;
                                                      }
                                                    }
                                                  }
                                                  else {
                                                    S1633=10;
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          else {
                                            S1633=8;
                                            if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 284, column: 7
                                              humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 285, column: 5
                                              humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 286, column: 5
                                              if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 287, column: 8
                                                S2897=0;
                                                System.out.println("");//sysj\ECS_plant.sysj line: 289, column: 7
                                                System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 290, column: 7
                                                System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 291, column: 7
                                                deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 292, column: 7
                                                currsigs.addElement(deHumOnZone2_3);
                                                active[2]=1;
                                                ends[2]=1;
                                                tdone[2]=1;
                                              }
                                              else {
                                                S2897=1;
                                                if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 295, column: 15
                                                  System.out.println("");//sysj\ECS_plant.sysj line: 297, column: 7
                                                  System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 298, column: 7
                                                  System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 299, column: 7
                                                  humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 300, column: 7
                                                  currsigs.addElement(humOnZone2_3);
                                                  active[2]=1;
                                                  ends[2]=1;
                                                  tdone[2]=1;
                                                }
                                                else {
                                                  System.out.println("");//sysj\ECS_plant.sysj line: 304, column: 6
                                                  System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 305, column: 6
                                                  S1633=9;
                                                  if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 310, column: 7
                                                    humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 311, column: 5
                                                    humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 312, column: 5
                                                    if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 313, column: 8
                                                      S3557=0;
                                                      System.out.println("");//sysj\ECS_plant.sysj line: 315, column: 7
                                                      System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 316, column: 7
                                                      System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 317, column: 7
                                                      deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 318, column: 7
                                                      currsigs.addElement(deHumOnZone4_5_6);
                                                      active[2]=1;
                                                      ends[2]=1;
                                                      tdone[2]=1;
                                                    }
                                                    else {
                                                      S3557=1;
                                                      if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 321, column: 15
                                                        System.out.println("");//sysj\ECS_plant.sysj line: 323, column: 7
                                                        System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 324, column: 7
                                                        System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 325, column: 7
                                                        humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 326, column: 7
                                                        currsigs.addElement(humOnZone4_5_6);
                                                        active[2]=1;
                                                        ends[2]=1;
                                                        tdone[2]=1;
                                                      }
                                                      else {
                                                        System.out.println("");//sysj\ECS_plant.sysj line: 330, column: 6
                                                        System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 331, column: 6
                                                        S1633=10;
                                                        active[2]=1;
                                                        ends[2]=1;
                                                        tdone[2]=1;
                                                      }
                                                    }
                                                  }
                                                  else {
                                                    S1633=10;
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                }
                                              }
                                            }
                                            else {
                                              S1633=9;
                                              if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 310, column: 7
                                                humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 311, column: 5
                                                humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 312, column: 5
                                                if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 313, column: 8
                                                  S3557=0;
                                                  System.out.println("");//sysj\ECS_plant.sysj line: 315, column: 7
                                                  System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 316, column: 7
                                                  System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 317, column: 7
                                                  deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 318, column: 7
                                                  currsigs.addElement(deHumOnZone4_5_6);
                                                  active[2]=1;
                                                  ends[2]=1;
                                                  tdone[2]=1;
                                                }
                                                else {
                                                  S3557=1;
                                                  if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 321, column: 15
                                                    System.out.println("");//sysj\ECS_plant.sysj line: 323, column: 7
                                                    System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 324, column: 7
                                                    System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 325, column: 7
                                                    humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 326, column: 7
                                                    currsigs.addElement(humOnZone4_5_6);
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                  else {
                                                    System.out.println("");//sysj\ECS_plant.sysj line: 330, column: 6
                                                    System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 331, column: 6
                                                    S1633=10;
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                }
                                              }
                                              else {
                                                S1633=10;
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
                                      S1633=7;
                                      if(zone_thread_2 == 1 || zone_thread_2 == 7){//sysj\ECS_plant.sysj line: 258, column: 7
                                        humid17_thread_2 = 0;//sysj\ECS_plant.sysj line: 259, column: 5
                                        humid17_thread_2 = (humidZone1_7.getpreval() == null ? null : ((Integer)humidZone1_7.getpreval()));//sysj\ECS_plant.sysj line: 260, column: 5
                                        if(humid17_thread_2 > 60){//sysj\ECS_plant.sysj line: 261, column: 8
                                          S2557=0;
                                          System.out.println("");//sysj\ECS_plant.sysj line: 263, column: 7
                                          System.out.println("Room humidity is too high at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 264, column: 7
                                          System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 265, column: 7
                                          deHumOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 266, column: 7
                                          currsigs.addElement(deHumOnZone1_7);
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                        else {
                                          S2557=1;
                                          if(humid17_thread_2 < 30){//sysj\ECS_plant.sysj line: 269, column: 15
                                            System.out.println("");//sysj\ECS_plant.sysj line: 271, column: 7
                                            System.out.println("Room humidity is too low at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 272, column: 7
                                            System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 273, column: 7
                                            humOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 274, column: 7
                                            currsigs.addElement(humOnZone1_7);
                                            active[2]=1;
                                            ends[2]=1;
                                            tdone[2]=1;
                                          }
                                          else {
                                            System.out.println("");//sysj\ECS_plant.sysj line: 278, column: 6
                                            System.out.println("Room humidity is safe at" + humid17_thread_2);//sysj\ECS_plant.sysj line: 279, column: 6
                                            S1633=8;
                                            if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 284, column: 7
                                              humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 285, column: 5
                                              humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 286, column: 5
                                              if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 287, column: 8
                                                S2897=0;
                                                System.out.println("");//sysj\ECS_plant.sysj line: 289, column: 7
                                                System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 290, column: 7
                                                System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 291, column: 7
                                                deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 292, column: 7
                                                currsigs.addElement(deHumOnZone2_3);
                                                active[2]=1;
                                                ends[2]=1;
                                                tdone[2]=1;
                                              }
                                              else {
                                                S2897=1;
                                                if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 295, column: 15
                                                  System.out.println("");//sysj\ECS_plant.sysj line: 297, column: 7
                                                  System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 298, column: 7
                                                  System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 299, column: 7
                                                  humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 300, column: 7
                                                  currsigs.addElement(humOnZone2_3);
                                                  active[2]=1;
                                                  ends[2]=1;
                                                  tdone[2]=1;
                                                }
                                                else {
                                                  System.out.println("");//sysj\ECS_plant.sysj line: 304, column: 6
                                                  System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 305, column: 6
                                                  S1633=9;
                                                  if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 310, column: 7
                                                    humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 311, column: 5
                                                    humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 312, column: 5
                                                    if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 313, column: 8
                                                      S3557=0;
                                                      System.out.println("");//sysj\ECS_plant.sysj line: 315, column: 7
                                                      System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 316, column: 7
                                                      System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 317, column: 7
                                                      deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 318, column: 7
                                                      currsigs.addElement(deHumOnZone4_5_6);
                                                      active[2]=1;
                                                      ends[2]=1;
                                                      tdone[2]=1;
                                                    }
                                                    else {
                                                      S3557=1;
                                                      if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 321, column: 15
                                                        System.out.println("");//sysj\ECS_plant.sysj line: 323, column: 7
                                                        System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 324, column: 7
                                                        System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 325, column: 7
                                                        humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 326, column: 7
                                                        currsigs.addElement(humOnZone4_5_6);
                                                        active[2]=1;
                                                        ends[2]=1;
                                                        tdone[2]=1;
                                                      }
                                                      else {
                                                        System.out.println("");//sysj\ECS_plant.sysj line: 330, column: 6
                                                        System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 331, column: 6
                                                        S1633=10;
                                                        active[2]=1;
                                                        ends[2]=1;
                                                        tdone[2]=1;
                                                      }
                                                    }
                                                  }
                                                  else {
                                                    S1633=10;
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                }
                                              }
                                            }
                                            else {
                                              S1633=9;
                                              if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 310, column: 7
                                                humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 311, column: 5
                                                humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 312, column: 5
                                                if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 313, column: 8
                                                  S3557=0;
                                                  System.out.println("");//sysj\ECS_plant.sysj line: 315, column: 7
                                                  System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 316, column: 7
                                                  System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 317, column: 7
                                                  deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 318, column: 7
                                                  currsigs.addElement(deHumOnZone4_5_6);
                                                  active[2]=1;
                                                  ends[2]=1;
                                                  tdone[2]=1;
                                                }
                                                else {
                                                  S3557=1;
                                                  if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 321, column: 15
                                                    System.out.println("");//sysj\ECS_plant.sysj line: 323, column: 7
                                                    System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 324, column: 7
                                                    System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 325, column: 7
                                                    humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 326, column: 7
                                                    currsigs.addElement(humOnZone4_5_6);
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                  else {
                                                    System.out.println("");//sysj\ECS_plant.sysj line: 330, column: 6
                                                    System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 331, column: 6
                                                    S1633=10;
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                }
                                              }
                                              else {
                                                S1633=10;
                                                active[2]=1;
                                                ends[2]=1;
                                                tdone[2]=1;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      else {
                                        S1633=8;
                                        if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 284, column: 7
                                          humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 285, column: 5
                                          humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 286, column: 5
                                          if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 287, column: 8
                                            S2897=0;
                                            System.out.println("");//sysj\ECS_plant.sysj line: 289, column: 7
                                            System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 290, column: 7
                                            System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 291, column: 7
                                            deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 292, column: 7
                                            currsigs.addElement(deHumOnZone2_3);
                                            active[2]=1;
                                            ends[2]=1;
                                            tdone[2]=1;
                                          }
                                          else {
                                            S2897=1;
                                            if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 295, column: 15
                                              System.out.println("");//sysj\ECS_plant.sysj line: 297, column: 7
                                              System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 298, column: 7
                                              System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 299, column: 7
                                              humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 300, column: 7
                                              currsigs.addElement(humOnZone2_3);
                                              active[2]=1;
                                              ends[2]=1;
                                              tdone[2]=1;
                                            }
                                            else {
                                              System.out.println("");//sysj\ECS_plant.sysj line: 304, column: 6
                                              System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 305, column: 6
                                              S1633=9;
                                              if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 310, column: 7
                                                humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 311, column: 5
                                                humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 312, column: 5
                                                if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 313, column: 8
                                                  S3557=0;
                                                  System.out.println("");//sysj\ECS_plant.sysj line: 315, column: 7
                                                  System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 316, column: 7
                                                  System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 317, column: 7
                                                  deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 318, column: 7
                                                  currsigs.addElement(deHumOnZone4_5_6);
                                                  active[2]=1;
                                                  ends[2]=1;
                                                  tdone[2]=1;
                                                }
                                                else {
                                                  S3557=1;
                                                  if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 321, column: 15
                                                    System.out.println("");//sysj\ECS_plant.sysj line: 323, column: 7
                                                    System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 324, column: 7
                                                    System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 325, column: 7
                                                    humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 326, column: 7
                                                    currsigs.addElement(humOnZone4_5_6);
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                  else {
                                                    System.out.println("");//sysj\ECS_plant.sysj line: 330, column: 6
                                                    System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 331, column: 6
                                                    S1633=10;
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                }
                                              }
                                              else {
                                                S1633=10;
                                                active[2]=1;
                                                ends[2]=1;
                                                tdone[2]=1;
                                              }
                                            }
                                          }
                                        }
                                        else {
                                          S1633=9;
                                          if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 310, column: 7
                                            humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 311, column: 5
                                            humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 312, column: 5
                                            if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 313, column: 8
                                              S3557=0;
                                              System.out.println("");//sysj\ECS_plant.sysj line: 315, column: 7
                                              System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 316, column: 7
                                              System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 317, column: 7
                                              deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 318, column: 7
                                              currsigs.addElement(deHumOnZone4_5_6);
                                              active[2]=1;
                                              ends[2]=1;
                                              tdone[2]=1;
                                            }
                                            else {
                                              S3557=1;
                                              if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 321, column: 15
                                                System.out.println("");//sysj\ECS_plant.sysj line: 323, column: 7
                                                System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 324, column: 7
                                                System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 325, column: 7
                                                humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 326, column: 7
                                                currsigs.addElement(humOnZone4_5_6);
                                                active[2]=1;
                                                ends[2]=1;
                                                tdone[2]=1;
                                              }
                                              else {
                                                System.out.println("");//sysj\ECS_plant.sysj line: 330, column: 6
                                                System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 331, column: 6
                                                S1633=10;
                                                active[2]=1;
                                                ends[2]=1;
                                                tdone[2]=1;
                                              }
                                            }
                                          }
                                          else {
                                            S1633=10;
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
                              S1633=5;
                              if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 210, column: 7
                                temp23_thread_2 = 0;//sysj\ECS_plant.sysj line: 211, column: 5
                                temp23_thread_2 = (tempZone2_3.getpreval() == null ? null : ((Integer)tempZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 212, column: 5
                                if(temp23_thread_2 > 22){//sysj\ECS_plant.sysj line: 213, column: 8
                                  S2277=0;
                                  System.out.println("");//sysj\ECS_plant.sysj line: 215, column: 7
                                  System.out.println("Room temperature is too high at " + temp23_thread_2);//sysj\ECS_plant.sysj line: 216, column: 7
                                  airOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 217, column: 7
                                  currsigs.addElement(airOnZone2_3);
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                                else {
                                  S2277=1;
                                  if(temp23_thread_2 < 21){//sysj\ECS_plant.sysj line: 220, column: 15
                                    heatOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 222, column: 7
                                    currsigs.addElement(heatOnZone2_3);
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                  else {
                                    System.out.println("");//sysj\ECS_plant.sysj line: 226, column: 6
                                    System.out.println("Room temperature is safe at" + temp23_thread_2);//sysj\ECS_plant.sysj line: 227, column: 6
                                    S1633=6;
                                    if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 233, column: 7
                                      temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 234, column: 5
                                      temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 235, column: 5
                                      if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 236, column: 8
                                        S2377=0;
                                        System.out.println("");//sysj\ECS_plant.sysj line: 238, column: 7
                                        System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 239, column: 7
                                        airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 240, column: 7
                                        currsigs.addElement(airOnZone4_5_6);
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                      else {
                                        S2377=1;
                                        if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 243, column: 15
                                          System.out.println("");//sysj\ECS_plant.sysj line: 245, column: 7
                                          System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 246, column: 7
                                          heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 247, column: 7
                                          currsigs.addElement(heatOnZone4_5_6);
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                        else {
                                          System.out.println("");//sysj\ECS_plant.sysj line: 251, column: 6
                                          System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 252, column: 6
                                          S1633=7;
                                          if(zone_thread_2 == 1 || zone_thread_2 == 7){//sysj\ECS_plant.sysj line: 258, column: 7
                                            humid17_thread_2 = 0;//sysj\ECS_plant.sysj line: 259, column: 5
                                            humid17_thread_2 = (humidZone1_7.getpreval() == null ? null : ((Integer)humidZone1_7.getpreval()));//sysj\ECS_plant.sysj line: 260, column: 5
                                            if(humid17_thread_2 > 60){//sysj\ECS_plant.sysj line: 261, column: 8
                                              S2557=0;
                                              System.out.println("");//sysj\ECS_plant.sysj line: 263, column: 7
                                              System.out.println("Room humidity is too high at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 264, column: 7
                                              System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 265, column: 7
                                              deHumOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 266, column: 7
                                              currsigs.addElement(deHumOnZone1_7);
                                              active[2]=1;
                                              ends[2]=1;
                                              tdone[2]=1;
                                            }
                                            else {
                                              S2557=1;
                                              if(humid17_thread_2 < 30){//sysj\ECS_plant.sysj line: 269, column: 15
                                                System.out.println("");//sysj\ECS_plant.sysj line: 271, column: 7
                                                System.out.println("Room humidity is too low at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 272, column: 7
                                                System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 273, column: 7
                                                humOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 274, column: 7
                                                currsigs.addElement(humOnZone1_7);
                                                active[2]=1;
                                                ends[2]=1;
                                                tdone[2]=1;
                                              }
                                              else {
                                                System.out.println("");//sysj\ECS_plant.sysj line: 278, column: 6
                                                System.out.println("Room humidity is safe at" + humid17_thread_2);//sysj\ECS_plant.sysj line: 279, column: 6
                                                S1633=8;
                                                if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 284, column: 7
                                                  humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 285, column: 5
                                                  humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 286, column: 5
                                                  if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 287, column: 8
                                                    S2897=0;
                                                    System.out.println("");//sysj\ECS_plant.sysj line: 289, column: 7
                                                    System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 290, column: 7
                                                    System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 291, column: 7
                                                    deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 292, column: 7
                                                    currsigs.addElement(deHumOnZone2_3);
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                  else {
                                                    S2897=1;
                                                    if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 295, column: 15
                                                      System.out.println("");//sysj\ECS_plant.sysj line: 297, column: 7
                                                      System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 298, column: 7
                                                      System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 299, column: 7
                                                      humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 300, column: 7
                                                      currsigs.addElement(humOnZone2_3);
                                                      active[2]=1;
                                                      ends[2]=1;
                                                      tdone[2]=1;
                                                    }
                                                    else {
                                                      System.out.println("");//sysj\ECS_plant.sysj line: 304, column: 6
                                                      System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 305, column: 6
                                                      S1633=9;
                                                      if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 310, column: 7
                                                        humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 311, column: 5
                                                        humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 312, column: 5
                                                        if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 313, column: 8
                                                          S3557=0;
                                                          System.out.println("");//sysj\ECS_plant.sysj line: 315, column: 7
                                                          System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 316, column: 7
                                                          System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 317, column: 7
                                                          deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 318, column: 7
                                                          currsigs.addElement(deHumOnZone4_5_6);
                                                          active[2]=1;
                                                          ends[2]=1;
                                                          tdone[2]=1;
                                                        }
                                                        else {
                                                          S3557=1;
                                                          if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 321, column: 15
                                                            System.out.println("");//sysj\ECS_plant.sysj line: 323, column: 7
                                                            System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 324, column: 7
                                                            System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 325, column: 7
                                                            humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 326, column: 7
                                                            currsigs.addElement(humOnZone4_5_6);
                                                            active[2]=1;
                                                            ends[2]=1;
                                                            tdone[2]=1;
                                                          }
                                                          else {
                                                            System.out.println("");//sysj\ECS_plant.sysj line: 330, column: 6
                                                            System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 331, column: 6
                                                            S1633=10;
                                                            active[2]=1;
                                                            ends[2]=1;
                                                            tdone[2]=1;
                                                          }
                                                        }
                                                      }
                                                      else {
                                                        S1633=10;
                                                        active[2]=1;
                                                        ends[2]=1;
                                                        tdone[2]=1;
                                                      }
                                                    }
                                                  }
                                                }
                                                else {
                                                  S1633=9;
                                                  if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 310, column: 7
                                                    humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 311, column: 5
                                                    humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 312, column: 5
                                                    if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 313, column: 8
                                                      S3557=0;
                                                      System.out.println("");//sysj\ECS_plant.sysj line: 315, column: 7
                                                      System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 316, column: 7
                                                      System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 317, column: 7
                                                      deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 318, column: 7
                                                      currsigs.addElement(deHumOnZone4_5_6);
                                                      active[2]=1;
                                                      ends[2]=1;
                                                      tdone[2]=1;
                                                    }
                                                    else {
                                                      S3557=1;
                                                      if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 321, column: 15
                                                        System.out.println("");//sysj\ECS_plant.sysj line: 323, column: 7
                                                        System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 324, column: 7
                                                        System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 325, column: 7
                                                        humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 326, column: 7
                                                        currsigs.addElement(humOnZone4_5_6);
                                                        active[2]=1;
                                                        ends[2]=1;
                                                        tdone[2]=1;
                                                      }
                                                      else {
                                                        System.out.println("");//sysj\ECS_plant.sysj line: 330, column: 6
                                                        System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 331, column: 6
                                                        S1633=10;
                                                        active[2]=1;
                                                        ends[2]=1;
                                                        tdone[2]=1;
                                                      }
                                                    }
                                                  }
                                                  else {
                                                    S1633=10;
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          else {
                                            S1633=8;
                                            if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 284, column: 7
                                              humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 285, column: 5
                                              humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 286, column: 5
                                              if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 287, column: 8
                                                S2897=0;
                                                System.out.println("");//sysj\ECS_plant.sysj line: 289, column: 7
                                                System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 290, column: 7
                                                System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 291, column: 7
                                                deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 292, column: 7
                                                currsigs.addElement(deHumOnZone2_3);
                                                active[2]=1;
                                                ends[2]=1;
                                                tdone[2]=1;
                                              }
                                              else {
                                                S2897=1;
                                                if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 295, column: 15
                                                  System.out.println("");//sysj\ECS_plant.sysj line: 297, column: 7
                                                  System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 298, column: 7
                                                  System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 299, column: 7
                                                  humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 300, column: 7
                                                  currsigs.addElement(humOnZone2_3);
                                                  active[2]=1;
                                                  ends[2]=1;
                                                  tdone[2]=1;
                                                }
                                                else {
                                                  System.out.println("");//sysj\ECS_plant.sysj line: 304, column: 6
                                                  System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 305, column: 6
                                                  S1633=9;
                                                  if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 310, column: 7
                                                    humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 311, column: 5
                                                    humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 312, column: 5
                                                    if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 313, column: 8
                                                      S3557=0;
                                                      System.out.println("");//sysj\ECS_plant.sysj line: 315, column: 7
                                                      System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 316, column: 7
                                                      System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 317, column: 7
                                                      deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 318, column: 7
                                                      currsigs.addElement(deHumOnZone4_5_6);
                                                      active[2]=1;
                                                      ends[2]=1;
                                                      tdone[2]=1;
                                                    }
                                                    else {
                                                      S3557=1;
                                                      if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 321, column: 15
                                                        System.out.println("");//sysj\ECS_plant.sysj line: 323, column: 7
                                                        System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 324, column: 7
                                                        System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 325, column: 7
                                                        humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 326, column: 7
                                                        currsigs.addElement(humOnZone4_5_6);
                                                        active[2]=1;
                                                        ends[2]=1;
                                                        tdone[2]=1;
                                                      }
                                                      else {
                                                        System.out.println("");//sysj\ECS_plant.sysj line: 330, column: 6
                                                        System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 331, column: 6
                                                        S1633=10;
                                                        active[2]=1;
                                                        ends[2]=1;
                                                        tdone[2]=1;
                                                      }
                                                    }
                                                  }
                                                  else {
                                                    S1633=10;
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                }
                                              }
                                            }
                                            else {
                                              S1633=9;
                                              if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 310, column: 7
                                                humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 311, column: 5
                                                humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 312, column: 5
                                                if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 313, column: 8
                                                  S3557=0;
                                                  System.out.println("");//sysj\ECS_plant.sysj line: 315, column: 7
                                                  System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 316, column: 7
                                                  System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 317, column: 7
                                                  deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 318, column: 7
                                                  currsigs.addElement(deHumOnZone4_5_6);
                                                  active[2]=1;
                                                  ends[2]=1;
                                                  tdone[2]=1;
                                                }
                                                else {
                                                  S3557=1;
                                                  if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 321, column: 15
                                                    System.out.println("");//sysj\ECS_plant.sysj line: 323, column: 7
                                                    System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 324, column: 7
                                                    System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 325, column: 7
                                                    humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 326, column: 7
                                                    currsigs.addElement(humOnZone4_5_6);
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                  else {
                                                    System.out.println("");//sysj\ECS_plant.sysj line: 330, column: 6
                                                    System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 331, column: 6
                                                    S1633=10;
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                }
                                              }
                                              else {
                                                S1633=10;
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
                                      S1633=7;
                                      if(zone_thread_2 == 1 || zone_thread_2 == 7){//sysj\ECS_plant.sysj line: 258, column: 7
                                        humid17_thread_2 = 0;//sysj\ECS_plant.sysj line: 259, column: 5
                                        humid17_thread_2 = (humidZone1_7.getpreval() == null ? null : ((Integer)humidZone1_7.getpreval()));//sysj\ECS_plant.sysj line: 260, column: 5
                                        if(humid17_thread_2 > 60){//sysj\ECS_plant.sysj line: 261, column: 8
                                          S2557=0;
                                          System.out.println("");//sysj\ECS_plant.sysj line: 263, column: 7
                                          System.out.println("Room humidity is too high at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 264, column: 7
                                          System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 265, column: 7
                                          deHumOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 266, column: 7
                                          currsigs.addElement(deHumOnZone1_7);
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                        else {
                                          S2557=1;
                                          if(humid17_thread_2 < 30){//sysj\ECS_plant.sysj line: 269, column: 15
                                            System.out.println("");//sysj\ECS_plant.sysj line: 271, column: 7
                                            System.out.println("Room humidity is too low at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 272, column: 7
                                            System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 273, column: 7
                                            humOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 274, column: 7
                                            currsigs.addElement(humOnZone1_7);
                                            active[2]=1;
                                            ends[2]=1;
                                            tdone[2]=1;
                                          }
                                          else {
                                            System.out.println("");//sysj\ECS_plant.sysj line: 278, column: 6
                                            System.out.println("Room humidity is safe at" + humid17_thread_2);//sysj\ECS_plant.sysj line: 279, column: 6
                                            S1633=8;
                                            if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 284, column: 7
                                              humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 285, column: 5
                                              humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 286, column: 5
                                              if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 287, column: 8
                                                S2897=0;
                                                System.out.println("");//sysj\ECS_plant.sysj line: 289, column: 7
                                                System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 290, column: 7
                                                System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 291, column: 7
                                                deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 292, column: 7
                                                currsigs.addElement(deHumOnZone2_3);
                                                active[2]=1;
                                                ends[2]=1;
                                                tdone[2]=1;
                                              }
                                              else {
                                                S2897=1;
                                                if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 295, column: 15
                                                  System.out.println("");//sysj\ECS_plant.sysj line: 297, column: 7
                                                  System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 298, column: 7
                                                  System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 299, column: 7
                                                  humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 300, column: 7
                                                  currsigs.addElement(humOnZone2_3);
                                                  active[2]=1;
                                                  ends[2]=1;
                                                  tdone[2]=1;
                                                }
                                                else {
                                                  System.out.println("");//sysj\ECS_plant.sysj line: 304, column: 6
                                                  System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 305, column: 6
                                                  S1633=9;
                                                  if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 310, column: 7
                                                    humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 311, column: 5
                                                    humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 312, column: 5
                                                    if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 313, column: 8
                                                      S3557=0;
                                                      System.out.println("");//sysj\ECS_plant.sysj line: 315, column: 7
                                                      System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 316, column: 7
                                                      System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 317, column: 7
                                                      deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 318, column: 7
                                                      currsigs.addElement(deHumOnZone4_5_6);
                                                      active[2]=1;
                                                      ends[2]=1;
                                                      tdone[2]=1;
                                                    }
                                                    else {
                                                      S3557=1;
                                                      if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 321, column: 15
                                                        System.out.println("");//sysj\ECS_plant.sysj line: 323, column: 7
                                                        System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 324, column: 7
                                                        System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 325, column: 7
                                                        humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 326, column: 7
                                                        currsigs.addElement(humOnZone4_5_6);
                                                        active[2]=1;
                                                        ends[2]=1;
                                                        tdone[2]=1;
                                                      }
                                                      else {
                                                        System.out.println("");//sysj\ECS_plant.sysj line: 330, column: 6
                                                        System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 331, column: 6
                                                        S1633=10;
                                                        active[2]=1;
                                                        ends[2]=1;
                                                        tdone[2]=1;
                                                      }
                                                    }
                                                  }
                                                  else {
                                                    S1633=10;
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                }
                                              }
                                            }
                                            else {
                                              S1633=9;
                                              if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 310, column: 7
                                                humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 311, column: 5
                                                humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 312, column: 5
                                                if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 313, column: 8
                                                  S3557=0;
                                                  System.out.println("");//sysj\ECS_plant.sysj line: 315, column: 7
                                                  System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 316, column: 7
                                                  System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 317, column: 7
                                                  deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 318, column: 7
                                                  currsigs.addElement(deHumOnZone4_5_6);
                                                  active[2]=1;
                                                  ends[2]=1;
                                                  tdone[2]=1;
                                                }
                                                else {
                                                  S3557=1;
                                                  if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 321, column: 15
                                                    System.out.println("");//sysj\ECS_plant.sysj line: 323, column: 7
                                                    System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 324, column: 7
                                                    System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 325, column: 7
                                                    humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 326, column: 7
                                                    currsigs.addElement(humOnZone4_5_6);
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                  else {
                                                    System.out.println("");//sysj\ECS_plant.sysj line: 330, column: 6
                                                    System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 331, column: 6
                                                    S1633=10;
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                }
                                              }
                                              else {
                                                S1633=10;
                                                active[2]=1;
                                                ends[2]=1;
                                                tdone[2]=1;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      else {
                                        S1633=8;
                                        if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 284, column: 7
                                          humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 285, column: 5
                                          humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 286, column: 5
                                          if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 287, column: 8
                                            S2897=0;
                                            System.out.println("");//sysj\ECS_plant.sysj line: 289, column: 7
                                            System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 290, column: 7
                                            System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 291, column: 7
                                            deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 292, column: 7
                                            currsigs.addElement(deHumOnZone2_3);
                                            active[2]=1;
                                            ends[2]=1;
                                            tdone[2]=1;
                                          }
                                          else {
                                            S2897=1;
                                            if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 295, column: 15
                                              System.out.println("");//sysj\ECS_plant.sysj line: 297, column: 7
                                              System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 298, column: 7
                                              System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 299, column: 7
                                              humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 300, column: 7
                                              currsigs.addElement(humOnZone2_3);
                                              active[2]=1;
                                              ends[2]=1;
                                              tdone[2]=1;
                                            }
                                            else {
                                              System.out.println("");//sysj\ECS_plant.sysj line: 304, column: 6
                                              System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 305, column: 6
                                              S1633=9;
                                              if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 310, column: 7
                                                humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 311, column: 5
                                                humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 312, column: 5
                                                if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 313, column: 8
                                                  S3557=0;
                                                  System.out.println("");//sysj\ECS_plant.sysj line: 315, column: 7
                                                  System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 316, column: 7
                                                  System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 317, column: 7
                                                  deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 318, column: 7
                                                  currsigs.addElement(deHumOnZone4_5_6);
                                                  active[2]=1;
                                                  ends[2]=1;
                                                  tdone[2]=1;
                                                }
                                                else {
                                                  S3557=1;
                                                  if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 321, column: 15
                                                    System.out.println("");//sysj\ECS_plant.sysj line: 323, column: 7
                                                    System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 324, column: 7
                                                    System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 325, column: 7
                                                    humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 326, column: 7
                                                    currsigs.addElement(humOnZone4_5_6);
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                  else {
                                                    System.out.println("");//sysj\ECS_plant.sysj line: 330, column: 6
                                                    System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 331, column: 6
                                                    S1633=10;
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                }
                                              }
                                              else {
                                                S1633=10;
                                                active[2]=1;
                                                ends[2]=1;
                                                tdone[2]=1;
                                              }
                                            }
                                          }
                                        }
                                        else {
                                          S1633=9;
                                          if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 310, column: 7
                                            humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 311, column: 5
                                            humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 312, column: 5
                                            if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 313, column: 8
                                              S3557=0;
                                              System.out.println("");//sysj\ECS_plant.sysj line: 315, column: 7
                                              System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 316, column: 7
                                              System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 317, column: 7
                                              deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 318, column: 7
                                              currsigs.addElement(deHumOnZone4_5_6);
                                              active[2]=1;
                                              ends[2]=1;
                                              tdone[2]=1;
                                            }
                                            else {
                                              S3557=1;
                                              if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 321, column: 15
                                                System.out.println("");//sysj\ECS_plant.sysj line: 323, column: 7
                                                System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 324, column: 7
                                                System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 325, column: 7
                                                humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 326, column: 7
                                                currsigs.addElement(humOnZone4_5_6);
                                                active[2]=1;
                                                ends[2]=1;
                                                tdone[2]=1;
                                              }
                                              else {
                                                System.out.println("");//sysj\ECS_plant.sysj line: 330, column: 6
                                                System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 331, column: 6
                                                S1633=10;
                                                active[2]=1;
                                                ends[2]=1;
                                                tdone[2]=1;
                                              }
                                            }
                                          }
                                          else {
                                            S1633=10;
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
                                S1633=6;
                                if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 233, column: 7
                                  temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 234, column: 5
                                  temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 235, column: 5
                                  if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 236, column: 8
                                    S2377=0;
                                    System.out.println("");//sysj\ECS_plant.sysj line: 238, column: 7
                                    System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 239, column: 7
                                    airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 240, column: 7
                                    currsigs.addElement(airOnZone4_5_6);
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                  else {
                                    S2377=1;
                                    if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 243, column: 15
                                      System.out.println("");//sysj\ECS_plant.sysj line: 245, column: 7
                                      System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 246, column: 7
                                      heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 247, column: 7
                                      currsigs.addElement(heatOnZone4_5_6);
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                    else {
                                      System.out.println("");//sysj\ECS_plant.sysj line: 251, column: 6
                                      System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 252, column: 6
                                      S1633=7;
                                      if(zone_thread_2 == 1 || zone_thread_2 == 7){//sysj\ECS_plant.sysj line: 258, column: 7
                                        humid17_thread_2 = 0;//sysj\ECS_plant.sysj line: 259, column: 5
                                        humid17_thread_2 = (humidZone1_7.getpreval() == null ? null : ((Integer)humidZone1_7.getpreval()));//sysj\ECS_plant.sysj line: 260, column: 5
                                        if(humid17_thread_2 > 60){//sysj\ECS_plant.sysj line: 261, column: 8
                                          S2557=0;
                                          System.out.println("");//sysj\ECS_plant.sysj line: 263, column: 7
                                          System.out.println("Room humidity is too high at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 264, column: 7
                                          System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 265, column: 7
                                          deHumOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 266, column: 7
                                          currsigs.addElement(deHumOnZone1_7);
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                        else {
                                          S2557=1;
                                          if(humid17_thread_2 < 30){//sysj\ECS_plant.sysj line: 269, column: 15
                                            System.out.println("");//sysj\ECS_plant.sysj line: 271, column: 7
                                            System.out.println("Room humidity is too low at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 272, column: 7
                                            System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 273, column: 7
                                            humOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 274, column: 7
                                            currsigs.addElement(humOnZone1_7);
                                            active[2]=1;
                                            ends[2]=1;
                                            tdone[2]=1;
                                          }
                                          else {
                                            System.out.println("");//sysj\ECS_plant.sysj line: 278, column: 6
                                            System.out.println("Room humidity is safe at" + humid17_thread_2);//sysj\ECS_plant.sysj line: 279, column: 6
                                            S1633=8;
                                            if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 284, column: 7
                                              humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 285, column: 5
                                              humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 286, column: 5
                                              if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 287, column: 8
                                                S2897=0;
                                                System.out.println("");//sysj\ECS_plant.sysj line: 289, column: 7
                                                System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 290, column: 7
                                                System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 291, column: 7
                                                deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 292, column: 7
                                                currsigs.addElement(deHumOnZone2_3);
                                                active[2]=1;
                                                ends[2]=1;
                                                tdone[2]=1;
                                              }
                                              else {
                                                S2897=1;
                                                if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 295, column: 15
                                                  System.out.println("");//sysj\ECS_plant.sysj line: 297, column: 7
                                                  System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 298, column: 7
                                                  System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 299, column: 7
                                                  humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 300, column: 7
                                                  currsigs.addElement(humOnZone2_3);
                                                  active[2]=1;
                                                  ends[2]=1;
                                                  tdone[2]=1;
                                                }
                                                else {
                                                  System.out.println("");//sysj\ECS_plant.sysj line: 304, column: 6
                                                  System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 305, column: 6
                                                  S1633=9;
                                                  if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 310, column: 7
                                                    humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 311, column: 5
                                                    humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 312, column: 5
                                                    if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 313, column: 8
                                                      S3557=0;
                                                      System.out.println("");//sysj\ECS_plant.sysj line: 315, column: 7
                                                      System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 316, column: 7
                                                      System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 317, column: 7
                                                      deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 318, column: 7
                                                      currsigs.addElement(deHumOnZone4_5_6);
                                                      active[2]=1;
                                                      ends[2]=1;
                                                      tdone[2]=1;
                                                    }
                                                    else {
                                                      S3557=1;
                                                      if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 321, column: 15
                                                        System.out.println("");//sysj\ECS_plant.sysj line: 323, column: 7
                                                        System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 324, column: 7
                                                        System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 325, column: 7
                                                        humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 326, column: 7
                                                        currsigs.addElement(humOnZone4_5_6);
                                                        active[2]=1;
                                                        ends[2]=1;
                                                        tdone[2]=1;
                                                      }
                                                      else {
                                                        System.out.println("");//sysj\ECS_plant.sysj line: 330, column: 6
                                                        System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 331, column: 6
                                                        S1633=10;
                                                        active[2]=1;
                                                        ends[2]=1;
                                                        tdone[2]=1;
                                                      }
                                                    }
                                                  }
                                                  else {
                                                    S1633=10;
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                }
                                              }
                                            }
                                            else {
                                              S1633=9;
                                              if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 310, column: 7
                                                humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 311, column: 5
                                                humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 312, column: 5
                                                if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 313, column: 8
                                                  S3557=0;
                                                  System.out.println("");//sysj\ECS_plant.sysj line: 315, column: 7
                                                  System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 316, column: 7
                                                  System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 317, column: 7
                                                  deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 318, column: 7
                                                  currsigs.addElement(deHumOnZone4_5_6);
                                                  active[2]=1;
                                                  ends[2]=1;
                                                  tdone[2]=1;
                                                }
                                                else {
                                                  S3557=1;
                                                  if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 321, column: 15
                                                    System.out.println("");//sysj\ECS_plant.sysj line: 323, column: 7
                                                    System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 324, column: 7
                                                    System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 325, column: 7
                                                    humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 326, column: 7
                                                    currsigs.addElement(humOnZone4_5_6);
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                  else {
                                                    System.out.println("");//sysj\ECS_plant.sysj line: 330, column: 6
                                                    System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 331, column: 6
                                                    S1633=10;
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                }
                                              }
                                              else {
                                                S1633=10;
                                                active[2]=1;
                                                ends[2]=1;
                                                tdone[2]=1;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      else {
                                        S1633=8;
                                        if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 284, column: 7
                                          humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 285, column: 5
                                          humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 286, column: 5
                                          if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 287, column: 8
                                            S2897=0;
                                            System.out.println("");//sysj\ECS_plant.sysj line: 289, column: 7
                                            System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 290, column: 7
                                            System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 291, column: 7
                                            deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 292, column: 7
                                            currsigs.addElement(deHumOnZone2_3);
                                            active[2]=1;
                                            ends[2]=1;
                                            tdone[2]=1;
                                          }
                                          else {
                                            S2897=1;
                                            if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 295, column: 15
                                              System.out.println("");//sysj\ECS_plant.sysj line: 297, column: 7
                                              System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 298, column: 7
                                              System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 299, column: 7
                                              humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 300, column: 7
                                              currsigs.addElement(humOnZone2_3);
                                              active[2]=1;
                                              ends[2]=1;
                                              tdone[2]=1;
                                            }
                                            else {
                                              System.out.println("");//sysj\ECS_plant.sysj line: 304, column: 6
                                              System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 305, column: 6
                                              S1633=9;
                                              if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 310, column: 7
                                                humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 311, column: 5
                                                humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 312, column: 5
                                                if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 313, column: 8
                                                  S3557=0;
                                                  System.out.println("");//sysj\ECS_plant.sysj line: 315, column: 7
                                                  System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 316, column: 7
                                                  System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 317, column: 7
                                                  deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 318, column: 7
                                                  currsigs.addElement(deHumOnZone4_5_6);
                                                  active[2]=1;
                                                  ends[2]=1;
                                                  tdone[2]=1;
                                                }
                                                else {
                                                  S3557=1;
                                                  if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 321, column: 15
                                                    System.out.println("");//sysj\ECS_plant.sysj line: 323, column: 7
                                                    System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 324, column: 7
                                                    System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 325, column: 7
                                                    humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 326, column: 7
                                                    currsigs.addElement(humOnZone4_5_6);
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                  else {
                                                    System.out.println("");//sysj\ECS_plant.sysj line: 330, column: 6
                                                    System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 331, column: 6
                                                    S1633=10;
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                }
                                              }
                                              else {
                                                S1633=10;
                                                active[2]=1;
                                                ends[2]=1;
                                                tdone[2]=1;
                                              }
                                            }
                                          }
                                        }
                                        else {
                                          S1633=9;
                                          if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 310, column: 7
                                            humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 311, column: 5
                                            humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 312, column: 5
                                            if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 313, column: 8
                                              S3557=0;
                                              System.out.println("");//sysj\ECS_plant.sysj line: 315, column: 7
                                              System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 316, column: 7
                                              System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 317, column: 7
                                              deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 318, column: 7
                                              currsigs.addElement(deHumOnZone4_5_6);
                                              active[2]=1;
                                              ends[2]=1;
                                              tdone[2]=1;
                                            }
                                            else {
                                              S3557=1;
                                              if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 321, column: 15
                                                System.out.println("");//sysj\ECS_plant.sysj line: 323, column: 7
                                                System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 324, column: 7
                                                System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 325, column: 7
                                                humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 326, column: 7
                                                currsigs.addElement(humOnZone4_5_6);
                                                active[2]=1;
                                                ends[2]=1;
                                                tdone[2]=1;
                                              }
                                              else {
                                                System.out.println("");//sysj\ECS_plant.sysj line: 330, column: 6
                                                System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 331, column: 6
                                                S1633=10;
                                                active[2]=1;
                                                ends[2]=1;
                                                tdone[2]=1;
                                              }
                                            }
                                          }
                                          else {
                                            S1633=10;
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
                                  S1633=7;
                                  if(zone_thread_2 == 1 || zone_thread_2 == 7){//sysj\ECS_plant.sysj line: 258, column: 7
                                    humid17_thread_2 = 0;//sysj\ECS_plant.sysj line: 259, column: 5
                                    humid17_thread_2 = (humidZone1_7.getpreval() == null ? null : ((Integer)humidZone1_7.getpreval()));//sysj\ECS_plant.sysj line: 260, column: 5
                                    if(humid17_thread_2 > 60){//sysj\ECS_plant.sysj line: 261, column: 8
                                      S2557=0;
                                      System.out.println("");//sysj\ECS_plant.sysj line: 263, column: 7
                                      System.out.println("Room humidity is too high at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 264, column: 7
                                      System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 265, column: 7
                                      deHumOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 266, column: 7
                                      currsigs.addElement(deHumOnZone1_7);
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                    else {
                                      S2557=1;
                                      if(humid17_thread_2 < 30){//sysj\ECS_plant.sysj line: 269, column: 15
                                        System.out.println("");//sysj\ECS_plant.sysj line: 271, column: 7
                                        System.out.println("Room humidity is too low at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 272, column: 7
                                        System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 273, column: 7
                                        humOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 274, column: 7
                                        currsigs.addElement(humOnZone1_7);
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                      else {
                                        System.out.println("");//sysj\ECS_plant.sysj line: 278, column: 6
                                        System.out.println("Room humidity is safe at" + humid17_thread_2);//sysj\ECS_plant.sysj line: 279, column: 6
                                        S1633=8;
                                        if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 284, column: 7
                                          humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 285, column: 5
                                          humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 286, column: 5
                                          if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 287, column: 8
                                            S2897=0;
                                            System.out.println("");//sysj\ECS_plant.sysj line: 289, column: 7
                                            System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 290, column: 7
                                            System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 291, column: 7
                                            deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 292, column: 7
                                            currsigs.addElement(deHumOnZone2_3);
                                            active[2]=1;
                                            ends[2]=1;
                                            tdone[2]=1;
                                          }
                                          else {
                                            S2897=1;
                                            if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 295, column: 15
                                              System.out.println("");//sysj\ECS_plant.sysj line: 297, column: 7
                                              System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 298, column: 7
                                              System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 299, column: 7
                                              humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 300, column: 7
                                              currsigs.addElement(humOnZone2_3);
                                              active[2]=1;
                                              ends[2]=1;
                                              tdone[2]=1;
                                            }
                                            else {
                                              System.out.println("");//sysj\ECS_plant.sysj line: 304, column: 6
                                              System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 305, column: 6
                                              S1633=9;
                                              if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 310, column: 7
                                                humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 311, column: 5
                                                humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 312, column: 5
                                                if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 313, column: 8
                                                  S3557=0;
                                                  System.out.println("");//sysj\ECS_plant.sysj line: 315, column: 7
                                                  System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 316, column: 7
                                                  System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 317, column: 7
                                                  deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 318, column: 7
                                                  currsigs.addElement(deHumOnZone4_5_6);
                                                  active[2]=1;
                                                  ends[2]=1;
                                                  tdone[2]=1;
                                                }
                                                else {
                                                  S3557=1;
                                                  if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 321, column: 15
                                                    System.out.println("");//sysj\ECS_plant.sysj line: 323, column: 7
                                                    System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 324, column: 7
                                                    System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 325, column: 7
                                                    humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 326, column: 7
                                                    currsigs.addElement(humOnZone4_5_6);
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                  else {
                                                    System.out.println("");//sysj\ECS_plant.sysj line: 330, column: 6
                                                    System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 331, column: 6
                                                    S1633=10;
                                                    active[2]=1;
                                                    ends[2]=1;
                                                    tdone[2]=1;
                                                  }
                                                }
                                              }
                                              else {
                                                S1633=10;
                                                active[2]=1;
                                                ends[2]=1;
                                                tdone[2]=1;
                                              }
                                            }
                                          }
                                        }
                                        else {
                                          S1633=9;
                                          if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 310, column: 7
                                            humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 311, column: 5
                                            humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 312, column: 5
                                            if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 313, column: 8
                                              S3557=0;
                                              System.out.println("");//sysj\ECS_plant.sysj line: 315, column: 7
                                              System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 316, column: 7
                                              System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 317, column: 7
                                              deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 318, column: 7
                                              currsigs.addElement(deHumOnZone4_5_6);
                                              active[2]=1;
                                              ends[2]=1;
                                              tdone[2]=1;
                                            }
                                            else {
                                              S3557=1;
                                              if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 321, column: 15
                                                System.out.println("");//sysj\ECS_plant.sysj line: 323, column: 7
                                                System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 324, column: 7
                                                System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 325, column: 7
                                                humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 326, column: 7
                                                currsigs.addElement(humOnZone4_5_6);
                                                active[2]=1;
                                                ends[2]=1;
                                                tdone[2]=1;
                                              }
                                              else {
                                                System.out.println("");//sysj\ECS_plant.sysj line: 330, column: 6
                                                System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 331, column: 6
                                                S1633=10;
                                                active[2]=1;
                                                ends[2]=1;
                                                tdone[2]=1;
                                              }
                                            }
                                          }
                                          else {
                                            S1633=10;
                                            active[2]=1;
                                            ends[2]=1;
                                            tdone[2]=1;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  else {
                                    S1633=8;
                                    if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 284, column: 7
                                      humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 285, column: 5
                                      humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 286, column: 5
                                      if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 287, column: 8
                                        S2897=0;
                                        System.out.println("");//sysj\ECS_plant.sysj line: 289, column: 7
                                        System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 290, column: 7
                                        System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 291, column: 7
                                        deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 292, column: 7
                                        currsigs.addElement(deHumOnZone2_3);
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                      else {
                                        S2897=1;
                                        if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 295, column: 15
                                          System.out.println("");//sysj\ECS_plant.sysj line: 297, column: 7
                                          System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 298, column: 7
                                          System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 299, column: 7
                                          humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 300, column: 7
                                          currsigs.addElement(humOnZone2_3);
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                        else {
                                          System.out.println("");//sysj\ECS_plant.sysj line: 304, column: 6
                                          System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 305, column: 6
                                          S1633=9;
                                          if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 310, column: 7
                                            humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 311, column: 5
                                            humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 312, column: 5
                                            if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 313, column: 8
                                              S3557=0;
                                              System.out.println("");//sysj\ECS_plant.sysj line: 315, column: 7
                                              System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 316, column: 7
                                              System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 317, column: 7
                                              deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 318, column: 7
                                              currsigs.addElement(deHumOnZone4_5_6);
                                              active[2]=1;
                                              ends[2]=1;
                                              tdone[2]=1;
                                            }
                                            else {
                                              S3557=1;
                                              if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 321, column: 15
                                                System.out.println("");//sysj\ECS_plant.sysj line: 323, column: 7
                                                System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 324, column: 7
                                                System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 325, column: 7
                                                humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 326, column: 7
                                                currsigs.addElement(humOnZone4_5_6);
                                                active[2]=1;
                                                ends[2]=1;
                                                tdone[2]=1;
                                              }
                                              else {
                                                System.out.println("");//sysj\ECS_plant.sysj line: 330, column: 6
                                                System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 331, column: 6
                                                S1633=10;
                                                active[2]=1;
                                                ends[2]=1;
                                                tdone[2]=1;
                                              }
                                            }
                                          }
                                          else {
                                            S1633=10;
                                            active[2]=1;
                                            ends[2]=1;
                                            tdone[2]=1;
                                          }
                                        }
                                      }
                                    }
                                    else {
                                      S1633=9;
                                      if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 310, column: 7
                                        humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 311, column: 5
                                        humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 312, column: 5
                                        if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 313, column: 8
                                          S3557=0;
                                          System.out.println("");//sysj\ECS_plant.sysj line: 315, column: 7
                                          System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 316, column: 7
                                          System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 317, column: 7
                                          deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 318, column: 7
                                          currsigs.addElement(deHumOnZone4_5_6);
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                        else {
                                          S3557=1;
                                          if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 321, column: 15
                                            System.out.println("");//sysj\ECS_plant.sysj line: 323, column: 7
                                            System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 324, column: 7
                                            System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 325, column: 7
                                            humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 326, column: 7
                                            currsigs.addElement(humOnZone4_5_6);
                                            active[2]=1;
                                            ends[2]=1;
                                            tdone[2]=1;
                                          }
                                          else {
                                            System.out.println("");//sysj\ECS_plant.sysj line: 330, column: 6
                                            System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 331, column: 6
                                            S1633=10;
                                            active[2]=1;
                                            ends[2]=1;
                                            tdone[2]=1;
                                          }
                                        }
                                      }
                                      else {
                                        S1633=10;
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
            if(dust.getprestatus()){//sysj\ECS_plant.sysj line: 140, column: 10
              S1633=4;
              if(zone_thread_2 == 1 || zone_thread_2 == 7){//sysj\ECS_plant.sysj line: 187, column: 7
                temp17_thread_2 = 0;//sysj\ECS_plant.sysj line: 188, column: 5
                temp17_thread_2 = (tempZone1_7.getpreval() == null ? null : ((Integer)tempZone1_7.getpreval()));//sysj\ECS_plant.sysj line: 189, column: 5
                if(temp17_thread_2 > 22){//sysj\ECS_plant.sysj line: 190, column: 8
                  S2217=0;
                  System.out.println("");//sysj\ECS_plant.sysj line: 192, column: 7
                  System.out.println("Room temperature is too high at " + temp17_thread_2);//sysj\ECS_plant.sysj line: 193, column: 7
                  fanOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 194, column: 7
                  currsigs.addElement(fanOnZone1_7);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S2217=1;
                  if(temp17_thread_2 < 21){//sysj\ECS_plant.sysj line: 197, column: 15
                    S2216=0;
                    System.out.println("Room temperature is too low at " + temp17_thread_2);//sysj\ECS_plant.sysj line: 199, column: 7
                    heatOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 200, column: 7
                    currsigs.addElement(heatOnZone1_7);
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S2216=1;
                    System.out.println("");//sysj\ECS_plant.sysj line: 204, column: 6
                    System.out.println("Room temperature is safe at" + temp17_thread_2);//sysj\ECS_plant.sysj line: 205, column: 6
                    S1633=5;
                    if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 210, column: 7
                      temp23_thread_2 = 0;//sysj\ECS_plant.sysj line: 211, column: 5
                      temp23_thread_2 = (tempZone2_3.getpreval() == null ? null : ((Integer)tempZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 212, column: 5
                      if(temp23_thread_2 > 22){//sysj\ECS_plant.sysj line: 213, column: 8
                        S2277=0;
                        System.out.println("");//sysj\ECS_plant.sysj line: 215, column: 7
                        System.out.println("Room temperature is too high at " + temp23_thread_2);//sysj\ECS_plant.sysj line: 216, column: 7
                        airOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 217, column: 7
                        currsigs.addElement(airOnZone2_3);
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
                        S2277=1;
                        if(temp23_thread_2 < 21){//sysj\ECS_plant.sysj line: 220, column: 15
                          heatOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 222, column: 7
                          currsigs.addElement(heatOnZone2_3);
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          System.out.println("");//sysj\ECS_plant.sysj line: 226, column: 6
                          System.out.println("Room temperature is safe at" + temp23_thread_2);//sysj\ECS_plant.sysj line: 227, column: 6
                          S1633=6;
                          if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 233, column: 7
                            temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 234, column: 5
                            temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 235, column: 5
                            if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 236, column: 8
                              S2377=0;
                              System.out.println("");//sysj\ECS_plant.sysj line: 238, column: 7
                              System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 239, column: 7
                              airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 240, column: 7
                              currsigs.addElement(airOnZone4_5_6);
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S2377=1;
                              if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 243, column: 15
                                System.out.println("");//sysj\ECS_plant.sysj line: 245, column: 7
                                System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 246, column: 7
                                heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 247, column: 7
                                currsigs.addElement(heatOnZone4_5_6);
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                              else {
                                System.out.println("");//sysj\ECS_plant.sysj line: 251, column: 6
                                System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 252, column: 6
                                S1633=7;
                                if(zone_thread_2 == 1 || zone_thread_2 == 7){//sysj\ECS_plant.sysj line: 258, column: 7
                                  humid17_thread_2 = 0;//sysj\ECS_plant.sysj line: 259, column: 5
                                  humid17_thread_2 = (humidZone1_7.getpreval() == null ? null : ((Integer)humidZone1_7.getpreval()));//sysj\ECS_plant.sysj line: 260, column: 5
                                  if(humid17_thread_2 > 60){//sysj\ECS_plant.sysj line: 261, column: 8
                                    S2557=0;
                                    System.out.println("");//sysj\ECS_plant.sysj line: 263, column: 7
                                    System.out.println("Room humidity is too high at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 264, column: 7
                                    System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 265, column: 7
                                    deHumOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 266, column: 7
                                    currsigs.addElement(deHumOnZone1_7);
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                  else {
                                    S2557=1;
                                    if(humid17_thread_2 < 30){//sysj\ECS_plant.sysj line: 269, column: 15
                                      System.out.println("");//sysj\ECS_plant.sysj line: 271, column: 7
                                      System.out.println("Room humidity is too low at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 272, column: 7
                                      System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 273, column: 7
                                      humOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 274, column: 7
                                      currsigs.addElement(humOnZone1_7);
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                    else {
                                      System.out.println("");//sysj\ECS_plant.sysj line: 278, column: 6
                                      System.out.println("Room humidity is safe at" + humid17_thread_2);//sysj\ECS_plant.sysj line: 279, column: 6
                                      S1633=8;
                                      if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 284, column: 7
                                        humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 285, column: 5
                                        humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 286, column: 5
                                        if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 287, column: 8
                                          S2897=0;
                                          System.out.println("");//sysj\ECS_plant.sysj line: 289, column: 7
                                          System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 290, column: 7
                                          System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 291, column: 7
                                          deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 292, column: 7
                                          currsigs.addElement(deHumOnZone2_3);
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                        else {
                                          S2897=1;
                                          if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 295, column: 15
                                            System.out.println("");//sysj\ECS_plant.sysj line: 297, column: 7
                                            System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 298, column: 7
                                            System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 299, column: 7
                                            humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 300, column: 7
                                            currsigs.addElement(humOnZone2_3);
                                            active[2]=1;
                                            ends[2]=1;
                                            tdone[2]=1;
                                          }
                                          else {
                                            System.out.println("");//sysj\ECS_plant.sysj line: 304, column: 6
                                            System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 305, column: 6
                                            S1633=9;
                                            if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 310, column: 7
                                              humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 311, column: 5
                                              humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 312, column: 5
                                              if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 313, column: 8
                                                S3557=0;
                                                System.out.println("");//sysj\ECS_plant.sysj line: 315, column: 7
                                                System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 316, column: 7
                                                System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 317, column: 7
                                                deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 318, column: 7
                                                currsigs.addElement(deHumOnZone4_5_6);
                                                active[2]=1;
                                                ends[2]=1;
                                                tdone[2]=1;
                                              }
                                              else {
                                                S3557=1;
                                                if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 321, column: 15
                                                  System.out.println("");//sysj\ECS_plant.sysj line: 323, column: 7
                                                  System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 324, column: 7
                                                  System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 325, column: 7
                                                  humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 326, column: 7
                                                  currsigs.addElement(humOnZone4_5_6);
                                                  active[2]=1;
                                                  ends[2]=1;
                                                  tdone[2]=1;
                                                }
                                                else {
                                                  System.out.println("");//sysj\ECS_plant.sysj line: 330, column: 6
                                                  System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 331, column: 6
                                                  S1633=10;
                                                  active[2]=1;
                                                  ends[2]=1;
                                                  tdone[2]=1;
                                                }
                                              }
                                            }
                                            else {
                                              S1633=10;
                                              active[2]=1;
                                              ends[2]=1;
                                              tdone[2]=1;
                                            }
                                          }
                                        }
                                      }
                                      else {
                                        S1633=9;
                                        if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 310, column: 7
                                          humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 311, column: 5
                                          humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 312, column: 5
                                          if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 313, column: 8
                                            S3557=0;
                                            System.out.println("");//sysj\ECS_plant.sysj line: 315, column: 7
                                            System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 316, column: 7
                                            System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 317, column: 7
                                            deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 318, column: 7
                                            currsigs.addElement(deHumOnZone4_5_6);
                                            active[2]=1;
                                            ends[2]=1;
                                            tdone[2]=1;
                                          }
                                          else {
                                            S3557=1;
                                            if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 321, column: 15
                                              System.out.println("");//sysj\ECS_plant.sysj line: 323, column: 7
                                              System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 324, column: 7
                                              System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 325, column: 7
                                              humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 326, column: 7
                                              currsigs.addElement(humOnZone4_5_6);
                                              active[2]=1;
                                              ends[2]=1;
                                              tdone[2]=1;
                                            }
                                            else {
                                              System.out.println("");//sysj\ECS_plant.sysj line: 330, column: 6
                                              System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 331, column: 6
                                              S1633=10;
                                              active[2]=1;
                                              ends[2]=1;
                                              tdone[2]=1;
                                            }
                                          }
                                        }
                                        else {
                                          S1633=10;
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                      }
                                    }
                                  }
                                }
                                else {
                                  S1633=8;
                                  if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 284, column: 7
                                    humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 285, column: 5
                                    humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 286, column: 5
                                    if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 287, column: 8
                                      S2897=0;
                                      System.out.println("");//sysj\ECS_plant.sysj line: 289, column: 7
                                      System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 290, column: 7
                                      System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 291, column: 7
                                      deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 292, column: 7
                                      currsigs.addElement(deHumOnZone2_3);
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                    else {
                                      S2897=1;
                                      if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 295, column: 15
                                        System.out.println("");//sysj\ECS_plant.sysj line: 297, column: 7
                                        System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 298, column: 7
                                        System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 299, column: 7
                                        humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 300, column: 7
                                        currsigs.addElement(humOnZone2_3);
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                      else {
                                        System.out.println("");//sysj\ECS_plant.sysj line: 304, column: 6
                                        System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 305, column: 6
                                        S1633=9;
                                        if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 310, column: 7
                                          humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 311, column: 5
                                          humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 312, column: 5
                                          if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 313, column: 8
                                            S3557=0;
                                            System.out.println("");//sysj\ECS_plant.sysj line: 315, column: 7
                                            System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 316, column: 7
                                            System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 317, column: 7
                                            deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 318, column: 7
                                            currsigs.addElement(deHumOnZone4_5_6);
                                            active[2]=1;
                                            ends[2]=1;
                                            tdone[2]=1;
                                          }
                                          else {
                                            S3557=1;
                                            if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 321, column: 15
                                              System.out.println("");//sysj\ECS_plant.sysj line: 323, column: 7
                                              System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 324, column: 7
                                              System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 325, column: 7
                                              humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 326, column: 7
                                              currsigs.addElement(humOnZone4_5_6);
                                              active[2]=1;
                                              ends[2]=1;
                                              tdone[2]=1;
                                            }
                                            else {
                                              System.out.println("");//sysj\ECS_plant.sysj line: 330, column: 6
                                              System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 331, column: 6
                                              S1633=10;
                                              active[2]=1;
                                              ends[2]=1;
                                              tdone[2]=1;
                                            }
                                          }
                                        }
                                        else {
                                          S1633=10;
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                      }
                                    }
                                  }
                                  else {
                                    S1633=9;
                                    if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 310, column: 7
                                      humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 311, column: 5
                                      humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 312, column: 5
                                      if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 313, column: 8
                                        S3557=0;
                                        System.out.println("");//sysj\ECS_plant.sysj line: 315, column: 7
                                        System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 316, column: 7
                                        System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 317, column: 7
                                        deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 318, column: 7
                                        currsigs.addElement(deHumOnZone4_5_6);
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                      else {
                                        S3557=1;
                                        if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 321, column: 15
                                          System.out.println("");//sysj\ECS_plant.sysj line: 323, column: 7
                                          System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 324, column: 7
                                          System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 325, column: 7
                                          humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 326, column: 7
                                          currsigs.addElement(humOnZone4_5_6);
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                        else {
                                          System.out.println("");//sysj\ECS_plant.sysj line: 330, column: 6
                                          System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 331, column: 6
                                          S1633=10;
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                      }
                                    }
                                    else {
                                      S1633=10;
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
                            S1633=7;
                            if(zone_thread_2 == 1 || zone_thread_2 == 7){//sysj\ECS_plant.sysj line: 258, column: 7
                              humid17_thread_2 = 0;//sysj\ECS_plant.sysj line: 259, column: 5
                              humid17_thread_2 = (humidZone1_7.getpreval() == null ? null : ((Integer)humidZone1_7.getpreval()));//sysj\ECS_plant.sysj line: 260, column: 5
                              if(humid17_thread_2 > 60){//sysj\ECS_plant.sysj line: 261, column: 8
                                S2557=0;
                                System.out.println("");//sysj\ECS_plant.sysj line: 263, column: 7
                                System.out.println("Room humidity is too high at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 264, column: 7
                                System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 265, column: 7
                                deHumOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 266, column: 7
                                currsigs.addElement(deHumOnZone1_7);
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                              else {
                                S2557=1;
                                if(humid17_thread_2 < 30){//sysj\ECS_plant.sysj line: 269, column: 15
                                  System.out.println("");//sysj\ECS_plant.sysj line: 271, column: 7
                                  System.out.println("Room humidity is too low at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 272, column: 7
                                  System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 273, column: 7
                                  humOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 274, column: 7
                                  currsigs.addElement(humOnZone1_7);
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                                else {
                                  System.out.println("");//sysj\ECS_plant.sysj line: 278, column: 6
                                  System.out.println("Room humidity is safe at" + humid17_thread_2);//sysj\ECS_plant.sysj line: 279, column: 6
                                  S1633=8;
                                  if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 284, column: 7
                                    humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 285, column: 5
                                    humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 286, column: 5
                                    if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 287, column: 8
                                      S2897=0;
                                      System.out.println("");//sysj\ECS_plant.sysj line: 289, column: 7
                                      System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 290, column: 7
                                      System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 291, column: 7
                                      deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 292, column: 7
                                      currsigs.addElement(deHumOnZone2_3);
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                    else {
                                      S2897=1;
                                      if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 295, column: 15
                                        System.out.println("");//sysj\ECS_plant.sysj line: 297, column: 7
                                        System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 298, column: 7
                                        System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 299, column: 7
                                        humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 300, column: 7
                                        currsigs.addElement(humOnZone2_3);
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                      else {
                                        System.out.println("");//sysj\ECS_plant.sysj line: 304, column: 6
                                        System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 305, column: 6
                                        S1633=9;
                                        if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 310, column: 7
                                          humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 311, column: 5
                                          humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 312, column: 5
                                          if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 313, column: 8
                                            S3557=0;
                                            System.out.println("");//sysj\ECS_plant.sysj line: 315, column: 7
                                            System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 316, column: 7
                                            System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 317, column: 7
                                            deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 318, column: 7
                                            currsigs.addElement(deHumOnZone4_5_6);
                                            active[2]=1;
                                            ends[2]=1;
                                            tdone[2]=1;
                                          }
                                          else {
                                            S3557=1;
                                            if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 321, column: 15
                                              System.out.println("");//sysj\ECS_plant.sysj line: 323, column: 7
                                              System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 324, column: 7
                                              System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 325, column: 7
                                              humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 326, column: 7
                                              currsigs.addElement(humOnZone4_5_6);
                                              active[2]=1;
                                              ends[2]=1;
                                              tdone[2]=1;
                                            }
                                            else {
                                              System.out.println("");//sysj\ECS_plant.sysj line: 330, column: 6
                                              System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 331, column: 6
                                              S1633=10;
                                              active[2]=1;
                                              ends[2]=1;
                                              tdone[2]=1;
                                            }
                                          }
                                        }
                                        else {
                                          S1633=10;
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                      }
                                    }
                                  }
                                  else {
                                    S1633=9;
                                    if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 310, column: 7
                                      humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 311, column: 5
                                      humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 312, column: 5
                                      if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 313, column: 8
                                        S3557=0;
                                        System.out.println("");//sysj\ECS_plant.sysj line: 315, column: 7
                                        System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 316, column: 7
                                        System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 317, column: 7
                                        deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 318, column: 7
                                        currsigs.addElement(deHumOnZone4_5_6);
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                      else {
                                        S3557=1;
                                        if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 321, column: 15
                                          System.out.println("");//sysj\ECS_plant.sysj line: 323, column: 7
                                          System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 324, column: 7
                                          System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 325, column: 7
                                          humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 326, column: 7
                                          currsigs.addElement(humOnZone4_5_6);
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                        else {
                                          System.out.println("");//sysj\ECS_plant.sysj line: 330, column: 6
                                          System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 331, column: 6
                                          S1633=10;
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                      }
                                    }
                                    else {
                                      S1633=10;
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                  }
                                }
                              }
                            }
                            else {
                              S1633=8;
                              if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 284, column: 7
                                humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 285, column: 5
                                humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 286, column: 5
                                if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 287, column: 8
                                  S2897=0;
                                  System.out.println("");//sysj\ECS_plant.sysj line: 289, column: 7
                                  System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 290, column: 7
                                  System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 291, column: 7
                                  deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 292, column: 7
                                  currsigs.addElement(deHumOnZone2_3);
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                                else {
                                  S2897=1;
                                  if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 295, column: 15
                                    System.out.println("");//sysj\ECS_plant.sysj line: 297, column: 7
                                    System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 298, column: 7
                                    System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 299, column: 7
                                    humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 300, column: 7
                                    currsigs.addElement(humOnZone2_3);
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                  else {
                                    System.out.println("");//sysj\ECS_plant.sysj line: 304, column: 6
                                    System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 305, column: 6
                                    S1633=9;
                                    if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 310, column: 7
                                      humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 311, column: 5
                                      humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 312, column: 5
                                      if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 313, column: 8
                                        S3557=0;
                                        System.out.println("");//sysj\ECS_plant.sysj line: 315, column: 7
                                        System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 316, column: 7
                                        System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 317, column: 7
                                        deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 318, column: 7
                                        currsigs.addElement(deHumOnZone4_5_6);
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                      else {
                                        S3557=1;
                                        if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 321, column: 15
                                          System.out.println("");//sysj\ECS_plant.sysj line: 323, column: 7
                                          System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 324, column: 7
                                          System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 325, column: 7
                                          humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 326, column: 7
                                          currsigs.addElement(humOnZone4_5_6);
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                        else {
                                          System.out.println("");//sysj\ECS_plant.sysj line: 330, column: 6
                                          System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 331, column: 6
                                          S1633=10;
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                      }
                                    }
                                    else {
                                      S1633=10;
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                  }
                                }
                              }
                              else {
                                S1633=9;
                                if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 310, column: 7
                                  humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 311, column: 5
                                  humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 312, column: 5
                                  if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 313, column: 8
                                    S3557=0;
                                    System.out.println("");//sysj\ECS_plant.sysj line: 315, column: 7
                                    System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 316, column: 7
                                    System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 317, column: 7
                                    deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 318, column: 7
                                    currsigs.addElement(deHumOnZone4_5_6);
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                  else {
                                    S3557=1;
                                    if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 321, column: 15
                                      System.out.println("");//sysj\ECS_plant.sysj line: 323, column: 7
                                      System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 324, column: 7
                                      System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 325, column: 7
                                      humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 326, column: 7
                                      currsigs.addElement(humOnZone4_5_6);
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                    else {
                                      System.out.println("");//sysj\ECS_plant.sysj line: 330, column: 6
                                      System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 331, column: 6
                                      S1633=10;
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                  }
                                }
                                else {
                                  S1633=10;
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
                      S1633=6;
                      if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 233, column: 7
                        temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 234, column: 5
                        temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 235, column: 5
                        if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 236, column: 8
                          S2377=0;
                          System.out.println("");//sysj\ECS_plant.sysj line: 238, column: 7
                          System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 239, column: 7
                          airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 240, column: 7
                          currsigs.addElement(airOnZone4_5_6);
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          S2377=1;
                          if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 243, column: 15
                            System.out.println("");//sysj\ECS_plant.sysj line: 245, column: 7
                            System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 246, column: 7
                            heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 247, column: 7
                            currsigs.addElement(heatOnZone4_5_6);
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            System.out.println("");//sysj\ECS_plant.sysj line: 251, column: 6
                            System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 252, column: 6
                            S1633=7;
                            if(zone_thread_2 == 1 || zone_thread_2 == 7){//sysj\ECS_plant.sysj line: 258, column: 7
                              humid17_thread_2 = 0;//sysj\ECS_plant.sysj line: 259, column: 5
                              humid17_thread_2 = (humidZone1_7.getpreval() == null ? null : ((Integer)humidZone1_7.getpreval()));//sysj\ECS_plant.sysj line: 260, column: 5
                              if(humid17_thread_2 > 60){//sysj\ECS_plant.sysj line: 261, column: 8
                                S2557=0;
                                System.out.println("");//sysj\ECS_plant.sysj line: 263, column: 7
                                System.out.println("Room humidity is too high at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 264, column: 7
                                System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 265, column: 7
                                deHumOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 266, column: 7
                                currsigs.addElement(deHumOnZone1_7);
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                              else {
                                S2557=1;
                                if(humid17_thread_2 < 30){//sysj\ECS_plant.sysj line: 269, column: 15
                                  System.out.println("");//sysj\ECS_plant.sysj line: 271, column: 7
                                  System.out.println("Room humidity is too low at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 272, column: 7
                                  System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 273, column: 7
                                  humOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 274, column: 7
                                  currsigs.addElement(humOnZone1_7);
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                                else {
                                  System.out.println("");//sysj\ECS_plant.sysj line: 278, column: 6
                                  System.out.println("Room humidity is safe at" + humid17_thread_2);//sysj\ECS_plant.sysj line: 279, column: 6
                                  S1633=8;
                                  if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 284, column: 7
                                    humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 285, column: 5
                                    humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 286, column: 5
                                    if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 287, column: 8
                                      S2897=0;
                                      System.out.println("");//sysj\ECS_plant.sysj line: 289, column: 7
                                      System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 290, column: 7
                                      System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 291, column: 7
                                      deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 292, column: 7
                                      currsigs.addElement(deHumOnZone2_3);
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                    else {
                                      S2897=1;
                                      if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 295, column: 15
                                        System.out.println("");//sysj\ECS_plant.sysj line: 297, column: 7
                                        System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 298, column: 7
                                        System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 299, column: 7
                                        humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 300, column: 7
                                        currsigs.addElement(humOnZone2_3);
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                      else {
                                        System.out.println("");//sysj\ECS_plant.sysj line: 304, column: 6
                                        System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 305, column: 6
                                        S1633=9;
                                        if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 310, column: 7
                                          humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 311, column: 5
                                          humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 312, column: 5
                                          if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 313, column: 8
                                            S3557=0;
                                            System.out.println("");//sysj\ECS_plant.sysj line: 315, column: 7
                                            System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 316, column: 7
                                            System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 317, column: 7
                                            deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 318, column: 7
                                            currsigs.addElement(deHumOnZone4_5_6);
                                            active[2]=1;
                                            ends[2]=1;
                                            tdone[2]=1;
                                          }
                                          else {
                                            S3557=1;
                                            if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 321, column: 15
                                              System.out.println("");//sysj\ECS_plant.sysj line: 323, column: 7
                                              System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 324, column: 7
                                              System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 325, column: 7
                                              humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 326, column: 7
                                              currsigs.addElement(humOnZone4_5_6);
                                              active[2]=1;
                                              ends[2]=1;
                                              tdone[2]=1;
                                            }
                                            else {
                                              System.out.println("");//sysj\ECS_plant.sysj line: 330, column: 6
                                              System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 331, column: 6
                                              S1633=10;
                                              active[2]=1;
                                              ends[2]=1;
                                              tdone[2]=1;
                                            }
                                          }
                                        }
                                        else {
                                          S1633=10;
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                      }
                                    }
                                  }
                                  else {
                                    S1633=9;
                                    if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 310, column: 7
                                      humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 311, column: 5
                                      humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 312, column: 5
                                      if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 313, column: 8
                                        S3557=0;
                                        System.out.println("");//sysj\ECS_plant.sysj line: 315, column: 7
                                        System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 316, column: 7
                                        System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 317, column: 7
                                        deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 318, column: 7
                                        currsigs.addElement(deHumOnZone4_5_6);
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                      else {
                                        S3557=1;
                                        if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 321, column: 15
                                          System.out.println("");//sysj\ECS_plant.sysj line: 323, column: 7
                                          System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 324, column: 7
                                          System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 325, column: 7
                                          humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 326, column: 7
                                          currsigs.addElement(humOnZone4_5_6);
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                        else {
                                          System.out.println("");//sysj\ECS_plant.sysj line: 330, column: 6
                                          System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 331, column: 6
                                          S1633=10;
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                      }
                                    }
                                    else {
                                      S1633=10;
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                  }
                                }
                              }
                            }
                            else {
                              S1633=8;
                              if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 284, column: 7
                                humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 285, column: 5
                                humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 286, column: 5
                                if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 287, column: 8
                                  S2897=0;
                                  System.out.println("");//sysj\ECS_plant.sysj line: 289, column: 7
                                  System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 290, column: 7
                                  System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 291, column: 7
                                  deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 292, column: 7
                                  currsigs.addElement(deHumOnZone2_3);
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                                else {
                                  S2897=1;
                                  if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 295, column: 15
                                    System.out.println("");//sysj\ECS_plant.sysj line: 297, column: 7
                                    System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 298, column: 7
                                    System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 299, column: 7
                                    humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 300, column: 7
                                    currsigs.addElement(humOnZone2_3);
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                  else {
                                    System.out.println("");//sysj\ECS_plant.sysj line: 304, column: 6
                                    System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 305, column: 6
                                    S1633=9;
                                    if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 310, column: 7
                                      humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 311, column: 5
                                      humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 312, column: 5
                                      if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 313, column: 8
                                        S3557=0;
                                        System.out.println("");//sysj\ECS_plant.sysj line: 315, column: 7
                                        System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 316, column: 7
                                        System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 317, column: 7
                                        deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 318, column: 7
                                        currsigs.addElement(deHumOnZone4_5_6);
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                      else {
                                        S3557=1;
                                        if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 321, column: 15
                                          System.out.println("");//sysj\ECS_plant.sysj line: 323, column: 7
                                          System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 324, column: 7
                                          System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 325, column: 7
                                          humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 326, column: 7
                                          currsigs.addElement(humOnZone4_5_6);
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                        else {
                                          System.out.println("");//sysj\ECS_plant.sysj line: 330, column: 6
                                          System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 331, column: 6
                                          S1633=10;
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                      }
                                    }
                                    else {
                                      S1633=10;
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                  }
                                }
                              }
                              else {
                                S1633=9;
                                if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 310, column: 7
                                  humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 311, column: 5
                                  humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 312, column: 5
                                  if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 313, column: 8
                                    S3557=0;
                                    System.out.println("");//sysj\ECS_plant.sysj line: 315, column: 7
                                    System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 316, column: 7
                                    System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 317, column: 7
                                    deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 318, column: 7
                                    currsigs.addElement(deHumOnZone4_5_6);
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                  else {
                                    S3557=1;
                                    if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 321, column: 15
                                      System.out.println("");//sysj\ECS_plant.sysj line: 323, column: 7
                                      System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 324, column: 7
                                      System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 325, column: 7
                                      humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 326, column: 7
                                      currsigs.addElement(humOnZone4_5_6);
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                    else {
                                      System.out.println("");//sysj\ECS_plant.sysj line: 330, column: 6
                                      System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 331, column: 6
                                      S1633=10;
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                  }
                                }
                                else {
                                  S1633=10;
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
                        S1633=7;
                        if(zone_thread_2 == 1 || zone_thread_2 == 7){//sysj\ECS_plant.sysj line: 258, column: 7
                          humid17_thread_2 = 0;//sysj\ECS_plant.sysj line: 259, column: 5
                          humid17_thread_2 = (humidZone1_7.getpreval() == null ? null : ((Integer)humidZone1_7.getpreval()));//sysj\ECS_plant.sysj line: 260, column: 5
                          if(humid17_thread_2 > 60){//sysj\ECS_plant.sysj line: 261, column: 8
                            S2557=0;
                            System.out.println("");//sysj\ECS_plant.sysj line: 263, column: 7
                            System.out.println("Room humidity is too high at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 264, column: 7
                            System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 265, column: 7
                            deHumOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 266, column: 7
                            currsigs.addElement(deHumOnZone1_7);
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S2557=1;
                            if(humid17_thread_2 < 30){//sysj\ECS_plant.sysj line: 269, column: 15
                              System.out.println("");//sysj\ECS_plant.sysj line: 271, column: 7
                              System.out.println("Room humidity is too low at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 272, column: 7
                              System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 273, column: 7
                              humOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 274, column: 7
                              currsigs.addElement(humOnZone1_7);
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              System.out.println("");//sysj\ECS_plant.sysj line: 278, column: 6
                              System.out.println("Room humidity is safe at" + humid17_thread_2);//sysj\ECS_plant.sysj line: 279, column: 6
                              S1633=8;
                              if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 284, column: 7
                                humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 285, column: 5
                                humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 286, column: 5
                                if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 287, column: 8
                                  S2897=0;
                                  System.out.println("");//sysj\ECS_plant.sysj line: 289, column: 7
                                  System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 290, column: 7
                                  System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 291, column: 7
                                  deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 292, column: 7
                                  currsigs.addElement(deHumOnZone2_3);
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                                else {
                                  S2897=1;
                                  if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 295, column: 15
                                    System.out.println("");//sysj\ECS_plant.sysj line: 297, column: 7
                                    System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 298, column: 7
                                    System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 299, column: 7
                                    humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 300, column: 7
                                    currsigs.addElement(humOnZone2_3);
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                  else {
                                    System.out.println("");//sysj\ECS_plant.sysj line: 304, column: 6
                                    System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 305, column: 6
                                    S1633=9;
                                    if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 310, column: 7
                                      humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 311, column: 5
                                      humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 312, column: 5
                                      if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 313, column: 8
                                        S3557=0;
                                        System.out.println("");//sysj\ECS_plant.sysj line: 315, column: 7
                                        System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 316, column: 7
                                        System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 317, column: 7
                                        deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 318, column: 7
                                        currsigs.addElement(deHumOnZone4_5_6);
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                      else {
                                        S3557=1;
                                        if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 321, column: 15
                                          System.out.println("");//sysj\ECS_plant.sysj line: 323, column: 7
                                          System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 324, column: 7
                                          System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 325, column: 7
                                          humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 326, column: 7
                                          currsigs.addElement(humOnZone4_5_6);
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                        else {
                                          System.out.println("");//sysj\ECS_plant.sysj line: 330, column: 6
                                          System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 331, column: 6
                                          S1633=10;
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                      }
                                    }
                                    else {
                                      S1633=10;
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                  }
                                }
                              }
                              else {
                                S1633=9;
                                if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 310, column: 7
                                  humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 311, column: 5
                                  humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 312, column: 5
                                  if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 313, column: 8
                                    S3557=0;
                                    System.out.println("");//sysj\ECS_plant.sysj line: 315, column: 7
                                    System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 316, column: 7
                                    System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 317, column: 7
                                    deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 318, column: 7
                                    currsigs.addElement(deHumOnZone4_5_6);
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                  else {
                                    S3557=1;
                                    if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 321, column: 15
                                      System.out.println("");//sysj\ECS_plant.sysj line: 323, column: 7
                                      System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 324, column: 7
                                      System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 325, column: 7
                                      humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 326, column: 7
                                      currsigs.addElement(humOnZone4_5_6);
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                    else {
                                      System.out.println("");//sysj\ECS_plant.sysj line: 330, column: 6
                                      System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 331, column: 6
                                      S1633=10;
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                  }
                                }
                                else {
                                  S1633=10;
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                              }
                            }
                          }
                        }
                        else {
                          S1633=8;
                          if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 284, column: 7
                            humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 285, column: 5
                            humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 286, column: 5
                            if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 287, column: 8
                              S2897=0;
                              System.out.println("");//sysj\ECS_plant.sysj line: 289, column: 7
                              System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 290, column: 7
                              System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 291, column: 7
                              deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 292, column: 7
                              currsigs.addElement(deHumOnZone2_3);
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S2897=1;
                              if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 295, column: 15
                                System.out.println("");//sysj\ECS_plant.sysj line: 297, column: 7
                                System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 298, column: 7
                                System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 299, column: 7
                                humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 300, column: 7
                                currsigs.addElement(humOnZone2_3);
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                              else {
                                System.out.println("");//sysj\ECS_plant.sysj line: 304, column: 6
                                System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 305, column: 6
                                S1633=9;
                                if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 310, column: 7
                                  humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 311, column: 5
                                  humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 312, column: 5
                                  if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 313, column: 8
                                    S3557=0;
                                    System.out.println("");//sysj\ECS_plant.sysj line: 315, column: 7
                                    System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 316, column: 7
                                    System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 317, column: 7
                                    deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 318, column: 7
                                    currsigs.addElement(deHumOnZone4_5_6);
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                  else {
                                    S3557=1;
                                    if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 321, column: 15
                                      System.out.println("");//sysj\ECS_plant.sysj line: 323, column: 7
                                      System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 324, column: 7
                                      System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 325, column: 7
                                      humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 326, column: 7
                                      currsigs.addElement(humOnZone4_5_6);
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                    else {
                                      System.out.println("");//sysj\ECS_plant.sysj line: 330, column: 6
                                      System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 331, column: 6
                                      S1633=10;
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                  }
                                }
                                else {
                                  S1633=10;
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                              }
                            }
                          }
                          else {
                            S1633=9;
                            if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 310, column: 7
                              humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 311, column: 5
                              humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 312, column: 5
                              if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 313, column: 8
                                S3557=0;
                                System.out.println("");//sysj\ECS_plant.sysj line: 315, column: 7
                                System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 316, column: 7
                                System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 317, column: 7
                                deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 318, column: 7
                                currsigs.addElement(deHumOnZone4_5_6);
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                              else {
                                S3557=1;
                                if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 321, column: 15
                                  System.out.println("");//sysj\ECS_plant.sysj line: 323, column: 7
                                  System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 324, column: 7
                                  System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 325, column: 7
                                  humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 326, column: 7
                                  currsigs.addElement(humOnZone4_5_6);
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                                else {
                                  System.out.println("");//sysj\ECS_plant.sysj line: 330, column: 6
                                  System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 331, column: 6
                                  S1633=10;
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                              }
                            }
                            else {
                              S1633=10;
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
                S1633=5;
                if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 210, column: 7
                  temp23_thread_2 = 0;//sysj\ECS_plant.sysj line: 211, column: 5
                  temp23_thread_2 = (tempZone2_3.getpreval() == null ? null : ((Integer)tempZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 212, column: 5
                  if(temp23_thread_2 > 22){//sysj\ECS_plant.sysj line: 213, column: 8
                    S2277=0;
                    System.out.println("");//sysj\ECS_plant.sysj line: 215, column: 7
                    System.out.println("Room temperature is too high at " + temp23_thread_2);//sysj\ECS_plant.sysj line: 216, column: 7
                    airOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 217, column: 7
                    currsigs.addElement(airOnZone2_3);
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S2277=1;
                    if(temp23_thread_2 < 21){//sysj\ECS_plant.sysj line: 220, column: 15
                      heatOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 222, column: 7
                      currsigs.addElement(heatOnZone2_3);
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      System.out.println("");//sysj\ECS_plant.sysj line: 226, column: 6
                      System.out.println("Room temperature is safe at" + temp23_thread_2);//sysj\ECS_plant.sysj line: 227, column: 6
                      S1633=6;
                      if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 233, column: 7
                        temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 234, column: 5
                        temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 235, column: 5
                        if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 236, column: 8
                          S2377=0;
                          System.out.println("");//sysj\ECS_plant.sysj line: 238, column: 7
                          System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 239, column: 7
                          airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 240, column: 7
                          currsigs.addElement(airOnZone4_5_6);
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          S2377=1;
                          if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 243, column: 15
                            System.out.println("");//sysj\ECS_plant.sysj line: 245, column: 7
                            System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 246, column: 7
                            heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 247, column: 7
                            currsigs.addElement(heatOnZone4_5_6);
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            System.out.println("");//sysj\ECS_plant.sysj line: 251, column: 6
                            System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 252, column: 6
                            S1633=7;
                            if(zone_thread_2 == 1 || zone_thread_2 == 7){//sysj\ECS_plant.sysj line: 258, column: 7
                              humid17_thread_2 = 0;//sysj\ECS_plant.sysj line: 259, column: 5
                              humid17_thread_2 = (humidZone1_7.getpreval() == null ? null : ((Integer)humidZone1_7.getpreval()));//sysj\ECS_plant.sysj line: 260, column: 5
                              if(humid17_thread_2 > 60){//sysj\ECS_plant.sysj line: 261, column: 8
                                S2557=0;
                                System.out.println("");//sysj\ECS_plant.sysj line: 263, column: 7
                                System.out.println("Room humidity is too high at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 264, column: 7
                                System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 265, column: 7
                                deHumOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 266, column: 7
                                currsigs.addElement(deHumOnZone1_7);
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                              else {
                                S2557=1;
                                if(humid17_thread_2 < 30){//sysj\ECS_plant.sysj line: 269, column: 15
                                  System.out.println("");//sysj\ECS_plant.sysj line: 271, column: 7
                                  System.out.println("Room humidity is too low at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 272, column: 7
                                  System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 273, column: 7
                                  humOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 274, column: 7
                                  currsigs.addElement(humOnZone1_7);
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                                else {
                                  System.out.println("");//sysj\ECS_plant.sysj line: 278, column: 6
                                  System.out.println("Room humidity is safe at" + humid17_thread_2);//sysj\ECS_plant.sysj line: 279, column: 6
                                  S1633=8;
                                  if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 284, column: 7
                                    humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 285, column: 5
                                    humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 286, column: 5
                                    if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 287, column: 8
                                      S2897=0;
                                      System.out.println("");//sysj\ECS_plant.sysj line: 289, column: 7
                                      System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 290, column: 7
                                      System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 291, column: 7
                                      deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 292, column: 7
                                      currsigs.addElement(deHumOnZone2_3);
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                    else {
                                      S2897=1;
                                      if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 295, column: 15
                                        System.out.println("");//sysj\ECS_plant.sysj line: 297, column: 7
                                        System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 298, column: 7
                                        System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 299, column: 7
                                        humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 300, column: 7
                                        currsigs.addElement(humOnZone2_3);
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                      else {
                                        System.out.println("");//sysj\ECS_plant.sysj line: 304, column: 6
                                        System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 305, column: 6
                                        S1633=9;
                                        if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 310, column: 7
                                          humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 311, column: 5
                                          humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 312, column: 5
                                          if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 313, column: 8
                                            S3557=0;
                                            System.out.println("");//sysj\ECS_plant.sysj line: 315, column: 7
                                            System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 316, column: 7
                                            System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 317, column: 7
                                            deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 318, column: 7
                                            currsigs.addElement(deHumOnZone4_5_6);
                                            active[2]=1;
                                            ends[2]=1;
                                            tdone[2]=1;
                                          }
                                          else {
                                            S3557=1;
                                            if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 321, column: 15
                                              System.out.println("");//sysj\ECS_plant.sysj line: 323, column: 7
                                              System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 324, column: 7
                                              System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 325, column: 7
                                              humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 326, column: 7
                                              currsigs.addElement(humOnZone4_5_6);
                                              active[2]=1;
                                              ends[2]=1;
                                              tdone[2]=1;
                                            }
                                            else {
                                              System.out.println("");//sysj\ECS_plant.sysj line: 330, column: 6
                                              System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 331, column: 6
                                              S1633=10;
                                              active[2]=1;
                                              ends[2]=1;
                                              tdone[2]=1;
                                            }
                                          }
                                        }
                                        else {
                                          S1633=10;
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                      }
                                    }
                                  }
                                  else {
                                    S1633=9;
                                    if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 310, column: 7
                                      humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 311, column: 5
                                      humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 312, column: 5
                                      if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 313, column: 8
                                        S3557=0;
                                        System.out.println("");//sysj\ECS_plant.sysj line: 315, column: 7
                                        System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 316, column: 7
                                        System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 317, column: 7
                                        deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 318, column: 7
                                        currsigs.addElement(deHumOnZone4_5_6);
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                      else {
                                        S3557=1;
                                        if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 321, column: 15
                                          System.out.println("");//sysj\ECS_plant.sysj line: 323, column: 7
                                          System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 324, column: 7
                                          System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 325, column: 7
                                          humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 326, column: 7
                                          currsigs.addElement(humOnZone4_5_6);
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                        else {
                                          System.out.println("");//sysj\ECS_plant.sysj line: 330, column: 6
                                          System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 331, column: 6
                                          S1633=10;
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                      }
                                    }
                                    else {
                                      S1633=10;
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                  }
                                }
                              }
                            }
                            else {
                              S1633=8;
                              if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 284, column: 7
                                humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 285, column: 5
                                humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 286, column: 5
                                if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 287, column: 8
                                  S2897=0;
                                  System.out.println("");//sysj\ECS_plant.sysj line: 289, column: 7
                                  System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 290, column: 7
                                  System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 291, column: 7
                                  deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 292, column: 7
                                  currsigs.addElement(deHumOnZone2_3);
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                                else {
                                  S2897=1;
                                  if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 295, column: 15
                                    System.out.println("");//sysj\ECS_plant.sysj line: 297, column: 7
                                    System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 298, column: 7
                                    System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 299, column: 7
                                    humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 300, column: 7
                                    currsigs.addElement(humOnZone2_3);
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                  else {
                                    System.out.println("");//sysj\ECS_plant.sysj line: 304, column: 6
                                    System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 305, column: 6
                                    S1633=9;
                                    if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 310, column: 7
                                      humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 311, column: 5
                                      humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 312, column: 5
                                      if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 313, column: 8
                                        S3557=0;
                                        System.out.println("");//sysj\ECS_plant.sysj line: 315, column: 7
                                        System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 316, column: 7
                                        System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 317, column: 7
                                        deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 318, column: 7
                                        currsigs.addElement(deHumOnZone4_5_6);
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                      else {
                                        S3557=1;
                                        if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 321, column: 15
                                          System.out.println("");//sysj\ECS_plant.sysj line: 323, column: 7
                                          System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 324, column: 7
                                          System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 325, column: 7
                                          humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 326, column: 7
                                          currsigs.addElement(humOnZone4_5_6);
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                        else {
                                          System.out.println("");//sysj\ECS_plant.sysj line: 330, column: 6
                                          System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 331, column: 6
                                          S1633=10;
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                      }
                                    }
                                    else {
                                      S1633=10;
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                  }
                                }
                              }
                              else {
                                S1633=9;
                                if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 310, column: 7
                                  humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 311, column: 5
                                  humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 312, column: 5
                                  if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 313, column: 8
                                    S3557=0;
                                    System.out.println("");//sysj\ECS_plant.sysj line: 315, column: 7
                                    System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 316, column: 7
                                    System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 317, column: 7
                                    deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 318, column: 7
                                    currsigs.addElement(deHumOnZone4_5_6);
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                  else {
                                    S3557=1;
                                    if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 321, column: 15
                                      System.out.println("");//sysj\ECS_plant.sysj line: 323, column: 7
                                      System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 324, column: 7
                                      System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 325, column: 7
                                      humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 326, column: 7
                                      currsigs.addElement(humOnZone4_5_6);
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                    else {
                                      System.out.println("");//sysj\ECS_plant.sysj line: 330, column: 6
                                      System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 331, column: 6
                                      S1633=10;
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                  }
                                }
                                else {
                                  S1633=10;
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
                        S1633=7;
                        if(zone_thread_2 == 1 || zone_thread_2 == 7){//sysj\ECS_plant.sysj line: 258, column: 7
                          humid17_thread_2 = 0;//sysj\ECS_plant.sysj line: 259, column: 5
                          humid17_thread_2 = (humidZone1_7.getpreval() == null ? null : ((Integer)humidZone1_7.getpreval()));//sysj\ECS_plant.sysj line: 260, column: 5
                          if(humid17_thread_2 > 60){//sysj\ECS_plant.sysj line: 261, column: 8
                            S2557=0;
                            System.out.println("");//sysj\ECS_plant.sysj line: 263, column: 7
                            System.out.println("Room humidity is too high at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 264, column: 7
                            System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 265, column: 7
                            deHumOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 266, column: 7
                            currsigs.addElement(deHumOnZone1_7);
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S2557=1;
                            if(humid17_thread_2 < 30){//sysj\ECS_plant.sysj line: 269, column: 15
                              System.out.println("");//sysj\ECS_plant.sysj line: 271, column: 7
                              System.out.println("Room humidity is too low at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 272, column: 7
                              System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 273, column: 7
                              humOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 274, column: 7
                              currsigs.addElement(humOnZone1_7);
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              System.out.println("");//sysj\ECS_plant.sysj line: 278, column: 6
                              System.out.println("Room humidity is safe at" + humid17_thread_2);//sysj\ECS_plant.sysj line: 279, column: 6
                              S1633=8;
                              if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 284, column: 7
                                humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 285, column: 5
                                humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 286, column: 5
                                if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 287, column: 8
                                  S2897=0;
                                  System.out.println("");//sysj\ECS_plant.sysj line: 289, column: 7
                                  System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 290, column: 7
                                  System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 291, column: 7
                                  deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 292, column: 7
                                  currsigs.addElement(deHumOnZone2_3);
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                                else {
                                  S2897=1;
                                  if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 295, column: 15
                                    System.out.println("");//sysj\ECS_plant.sysj line: 297, column: 7
                                    System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 298, column: 7
                                    System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 299, column: 7
                                    humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 300, column: 7
                                    currsigs.addElement(humOnZone2_3);
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                  else {
                                    System.out.println("");//sysj\ECS_plant.sysj line: 304, column: 6
                                    System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 305, column: 6
                                    S1633=9;
                                    if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 310, column: 7
                                      humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 311, column: 5
                                      humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 312, column: 5
                                      if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 313, column: 8
                                        S3557=0;
                                        System.out.println("");//sysj\ECS_plant.sysj line: 315, column: 7
                                        System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 316, column: 7
                                        System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 317, column: 7
                                        deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 318, column: 7
                                        currsigs.addElement(deHumOnZone4_5_6);
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                      else {
                                        S3557=1;
                                        if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 321, column: 15
                                          System.out.println("");//sysj\ECS_plant.sysj line: 323, column: 7
                                          System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 324, column: 7
                                          System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 325, column: 7
                                          humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 326, column: 7
                                          currsigs.addElement(humOnZone4_5_6);
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                        else {
                                          System.out.println("");//sysj\ECS_plant.sysj line: 330, column: 6
                                          System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 331, column: 6
                                          S1633=10;
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                      }
                                    }
                                    else {
                                      S1633=10;
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                  }
                                }
                              }
                              else {
                                S1633=9;
                                if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 310, column: 7
                                  humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 311, column: 5
                                  humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 312, column: 5
                                  if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 313, column: 8
                                    S3557=0;
                                    System.out.println("");//sysj\ECS_plant.sysj line: 315, column: 7
                                    System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 316, column: 7
                                    System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 317, column: 7
                                    deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 318, column: 7
                                    currsigs.addElement(deHumOnZone4_5_6);
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                  else {
                                    S3557=1;
                                    if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 321, column: 15
                                      System.out.println("");//sysj\ECS_plant.sysj line: 323, column: 7
                                      System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 324, column: 7
                                      System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 325, column: 7
                                      humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 326, column: 7
                                      currsigs.addElement(humOnZone4_5_6);
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                    else {
                                      System.out.println("");//sysj\ECS_plant.sysj line: 330, column: 6
                                      System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 331, column: 6
                                      S1633=10;
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                  }
                                }
                                else {
                                  S1633=10;
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                              }
                            }
                          }
                        }
                        else {
                          S1633=8;
                          if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 284, column: 7
                            humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 285, column: 5
                            humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 286, column: 5
                            if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 287, column: 8
                              S2897=0;
                              System.out.println("");//sysj\ECS_plant.sysj line: 289, column: 7
                              System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 290, column: 7
                              System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 291, column: 7
                              deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 292, column: 7
                              currsigs.addElement(deHumOnZone2_3);
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S2897=1;
                              if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 295, column: 15
                                System.out.println("");//sysj\ECS_plant.sysj line: 297, column: 7
                                System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 298, column: 7
                                System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 299, column: 7
                                humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 300, column: 7
                                currsigs.addElement(humOnZone2_3);
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                              else {
                                System.out.println("");//sysj\ECS_plant.sysj line: 304, column: 6
                                System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 305, column: 6
                                S1633=9;
                                if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 310, column: 7
                                  humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 311, column: 5
                                  humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 312, column: 5
                                  if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 313, column: 8
                                    S3557=0;
                                    System.out.println("");//sysj\ECS_plant.sysj line: 315, column: 7
                                    System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 316, column: 7
                                    System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 317, column: 7
                                    deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 318, column: 7
                                    currsigs.addElement(deHumOnZone4_5_6);
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                  else {
                                    S3557=1;
                                    if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 321, column: 15
                                      System.out.println("");//sysj\ECS_plant.sysj line: 323, column: 7
                                      System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 324, column: 7
                                      System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 325, column: 7
                                      humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 326, column: 7
                                      currsigs.addElement(humOnZone4_5_6);
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                    else {
                                      System.out.println("");//sysj\ECS_plant.sysj line: 330, column: 6
                                      System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 331, column: 6
                                      S1633=10;
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                  }
                                }
                                else {
                                  S1633=10;
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                              }
                            }
                          }
                          else {
                            S1633=9;
                            if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 310, column: 7
                              humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 311, column: 5
                              humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 312, column: 5
                              if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 313, column: 8
                                S3557=0;
                                System.out.println("");//sysj\ECS_plant.sysj line: 315, column: 7
                                System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 316, column: 7
                                System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 317, column: 7
                                deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 318, column: 7
                                currsigs.addElement(deHumOnZone4_5_6);
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                              else {
                                S3557=1;
                                if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 321, column: 15
                                  System.out.println("");//sysj\ECS_plant.sysj line: 323, column: 7
                                  System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 324, column: 7
                                  System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 325, column: 7
                                  humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 326, column: 7
                                  currsigs.addElement(humOnZone4_5_6);
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                                else {
                                  System.out.println("");//sysj\ECS_plant.sysj line: 330, column: 6
                                  System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 331, column: 6
                                  S1633=10;
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                              }
                            }
                            else {
                              S1633=10;
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
                  S1633=6;
                  if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 233, column: 7
                    temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 234, column: 5
                    temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 235, column: 5
                    if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 236, column: 8
                      S2377=0;
                      System.out.println("");//sysj\ECS_plant.sysj line: 238, column: 7
                      System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 239, column: 7
                      airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 240, column: 7
                      currsigs.addElement(airOnZone4_5_6);
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S2377=1;
                      if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 243, column: 15
                        System.out.println("");//sysj\ECS_plant.sysj line: 245, column: 7
                        System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 246, column: 7
                        heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 247, column: 7
                        currsigs.addElement(heatOnZone4_5_6);
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
                        System.out.println("");//sysj\ECS_plant.sysj line: 251, column: 6
                        System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 252, column: 6
                        S1633=7;
                        if(zone_thread_2 == 1 || zone_thread_2 == 7){//sysj\ECS_plant.sysj line: 258, column: 7
                          humid17_thread_2 = 0;//sysj\ECS_plant.sysj line: 259, column: 5
                          humid17_thread_2 = (humidZone1_7.getpreval() == null ? null : ((Integer)humidZone1_7.getpreval()));//sysj\ECS_plant.sysj line: 260, column: 5
                          if(humid17_thread_2 > 60){//sysj\ECS_plant.sysj line: 261, column: 8
                            S2557=0;
                            System.out.println("");//sysj\ECS_plant.sysj line: 263, column: 7
                            System.out.println("Room humidity is too high at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 264, column: 7
                            System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 265, column: 7
                            deHumOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 266, column: 7
                            currsigs.addElement(deHumOnZone1_7);
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S2557=1;
                            if(humid17_thread_2 < 30){//sysj\ECS_plant.sysj line: 269, column: 15
                              System.out.println("");//sysj\ECS_plant.sysj line: 271, column: 7
                              System.out.println("Room humidity is too low at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 272, column: 7
                              System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 273, column: 7
                              humOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 274, column: 7
                              currsigs.addElement(humOnZone1_7);
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              System.out.println("");//sysj\ECS_plant.sysj line: 278, column: 6
                              System.out.println("Room humidity is safe at" + humid17_thread_2);//sysj\ECS_plant.sysj line: 279, column: 6
                              S1633=8;
                              if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 284, column: 7
                                humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 285, column: 5
                                humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 286, column: 5
                                if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 287, column: 8
                                  S2897=0;
                                  System.out.println("");//sysj\ECS_plant.sysj line: 289, column: 7
                                  System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 290, column: 7
                                  System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 291, column: 7
                                  deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 292, column: 7
                                  currsigs.addElement(deHumOnZone2_3);
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                                else {
                                  S2897=1;
                                  if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 295, column: 15
                                    System.out.println("");//sysj\ECS_plant.sysj line: 297, column: 7
                                    System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 298, column: 7
                                    System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 299, column: 7
                                    humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 300, column: 7
                                    currsigs.addElement(humOnZone2_3);
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                  else {
                                    System.out.println("");//sysj\ECS_plant.sysj line: 304, column: 6
                                    System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 305, column: 6
                                    S1633=9;
                                    if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 310, column: 7
                                      humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 311, column: 5
                                      humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 312, column: 5
                                      if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 313, column: 8
                                        S3557=0;
                                        System.out.println("");//sysj\ECS_plant.sysj line: 315, column: 7
                                        System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 316, column: 7
                                        System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 317, column: 7
                                        deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 318, column: 7
                                        currsigs.addElement(deHumOnZone4_5_6);
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                      else {
                                        S3557=1;
                                        if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 321, column: 15
                                          System.out.println("");//sysj\ECS_plant.sysj line: 323, column: 7
                                          System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 324, column: 7
                                          System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 325, column: 7
                                          humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 326, column: 7
                                          currsigs.addElement(humOnZone4_5_6);
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                        else {
                                          System.out.println("");//sysj\ECS_plant.sysj line: 330, column: 6
                                          System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 331, column: 6
                                          S1633=10;
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                      }
                                    }
                                    else {
                                      S1633=10;
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                  }
                                }
                              }
                              else {
                                S1633=9;
                                if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 310, column: 7
                                  humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 311, column: 5
                                  humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 312, column: 5
                                  if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 313, column: 8
                                    S3557=0;
                                    System.out.println("");//sysj\ECS_plant.sysj line: 315, column: 7
                                    System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 316, column: 7
                                    System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 317, column: 7
                                    deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 318, column: 7
                                    currsigs.addElement(deHumOnZone4_5_6);
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                  else {
                                    S3557=1;
                                    if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 321, column: 15
                                      System.out.println("");//sysj\ECS_plant.sysj line: 323, column: 7
                                      System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 324, column: 7
                                      System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 325, column: 7
                                      humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 326, column: 7
                                      currsigs.addElement(humOnZone4_5_6);
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                    else {
                                      System.out.println("");//sysj\ECS_plant.sysj line: 330, column: 6
                                      System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 331, column: 6
                                      S1633=10;
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                  }
                                }
                                else {
                                  S1633=10;
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                              }
                            }
                          }
                        }
                        else {
                          S1633=8;
                          if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 284, column: 7
                            humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 285, column: 5
                            humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 286, column: 5
                            if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 287, column: 8
                              S2897=0;
                              System.out.println("");//sysj\ECS_plant.sysj line: 289, column: 7
                              System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 290, column: 7
                              System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 291, column: 7
                              deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 292, column: 7
                              currsigs.addElement(deHumOnZone2_3);
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S2897=1;
                              if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 295, column: 15
                                System.out.println("");//sysj\ECS_plant.sysj line: 297, column: 7
                                System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 298, column: 7
                                System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 299, column: 7
                                humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 300, column: 7
                                currsigs.addElement(humOnZone2_3);
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                              else {
                                System.out.println("");//sysj\ECS_plant.sysj line: 304, column: 6
                                System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 305, column: 6
                                S1633=9;
                                if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 310, column: 7
                                  humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 311, column: 5
                                  humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 312, column: 5
                                  if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 313, column: 8
                                    S3557=0;
                                    System.out.println("");//sysj\ECS_plant.sysj line: 315, column: 7
                                    System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 316, column: 7
                                    System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 317, column: 7
                                    deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 318, column: 7
                                    currsigs.addElement(deHumOnZone4_5_6);
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                  else {
                                    S3557=1;
                                    if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 321, column: 15
                                      System.out.println("");//sysj\ECS_plant.sysj line: 323, column: 7
                                      System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 324, column: 7
                                      System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 325, column: 7
                                      humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 326, column: 7
                                      currsigs.addElement(humOnZone4_5_6);
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                    else {
                                      System.out.println("");//sysj\ECS_plant.sysj line: 330, column: 6
                                      System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 331, column: 6
                                      S1633=10;
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                  }
                                }
                                else {
                                  S1633=10;
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                              }
                            }
                          }
                          else {
                            S1633=9;
                            if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 310, column: 7
                              humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 311, column: 5
                              humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 312, column: 5
                              if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 313, column: 8
                                S3557=0;
                                System.out.println("");//sysj\ECS_plant.sysj line: 315, column: 7
                                System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 316, column: 7
                                System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 317, column: 7
                                deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 318, column: 7
                                currsigs.addElement(deHumOnZone4_5_6);
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                              else {
                                S3557=1;
                                if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 321, column: 15
                                  System.out.println("");//sysj\ECS_plant.sysj line: 323, column: 7
                                  System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 324, column: 7
                                  System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 325, column: 7
                                  humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 326, column: 7
                                  currsigs.addElement(humOnZone4_5_6);
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                                else {
                                  System.out.println("");//sysj\ECS_plant.sysj line: 330, column: 6
                                  System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 331, column: 6
                                  S1633=10;
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                              }
                            }
                            else {
                              S1633=10;
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
                    S1633=7;
                    if(zone_thread_2 == 1 || zone_thread_2 == 7){//sysj\ECS_plant.sysj line: 258, column: 7
                      humid17_thread_2 = 0;//sysj\ECS_plant.sysj line: 259, column: 5
                      humid17_thread_2 = (humidZone1_7.getpreval() == null ? null : ((Integer)humidZone1_7.getpreval()));//sysj\ECS_plant.sysj line: 260, column: 5
                      if(humid17_thread_2 > 60){//sysj\ECS_plant.sysj line: 261, column: 8
                        S2557=0;
                        System.out.println("");//sysj\ECS_plant.sysj line: 263, column: 7
                        System.out.println("Room humidity is too high at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 264, column: 7
                        System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 265, column: 7
                        deHumOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 266, column: 7
                        currsigs.addElement(deHumOnZone1_7);
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
                        S2557=1;
                        if(humid17_thread_2 < 30){//sysj\ECS_plant.sysj line: 269, column: 15
                          System.out.println("");//sysj\ECS_plant.sysj line: 271, column: 7
                          System.out.println("Room humidity is too low at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 272, column: 7
                          System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 273, column: 7
                          humOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 274, column: 7
                          currsigs.addElement(humOnZone1_7);
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          System.out.println("");//sysj\ECS_plant.sysj line: 278, column: 6
                          System.out.println("Room humidity is safe at" + humid17_thread_2);//sysj\ECS_plant.sysj line: 279, column: 6
                          S1633=8;
                          if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 284, column: 7
                            humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 285, column: 5
                            humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 286, column: 5
                            if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 287, column: 8
                              S2897=0;
                              System.out.println("");//sysj\ECS_plant.sysj line: 289, column: 7
                              System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 290, column: 7
                              System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 291, column: 7
                              deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 292, column: 7
                              currsigs.addElement(deHumOnZone2_3);
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S2897=1;
                              if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 295, column: 15
                                System.out.println("");//sysj\ECS_plant.sysj line: 297, column: 7
                                System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 298, column: 7
                                System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 299, column: 7
                                humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 300, column: 7
                                currsigs.addElement(humOnZone2_3);
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                              else {
                                System.out.println("");//sysj\ECS_plant.sysj line: 304, column: 6
                                System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 305, column: 6
                                S1633=9;
                                if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 310, column: 7
                                  humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 311, column: 5
                                  humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 312, column: 5
                                  if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 313, column: 8
                                    S3557=0;
                                    System.out.println("");//sysj\ECS_plant.sysj line: 315, column: 7
                                    System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 316, column: 7
                                    System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 317, column: 7
                                    deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 318, column: 7
                                    currsigs.addElement(deHumOnZone4_5_6);
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                  else {
                                    S3557=1;
                                    if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 321, column: 15
                                      System.out.println("");//sysj\ECS_plant.sysj line: 323, column: 7
                                      System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 324, column: 7
                                      System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 325, column: 7
                                      humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 326, column: 7
                                      currsigs.addElement(humOnZone4_5_6);
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                    else {
                                      System.out.println("");//sysj\ECS_plant.sysj line: 330, column: 6
                                      System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 331, column: 6
                                      S1633=10;
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                  }
                                }
                                else {
                                  S1633=10;
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                              }
                            }
                          }
                          else {
                            S1633=9;
                            if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 310, column: 7
                              humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 311, column: 5
                              humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 312, column: 5
                              if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 313, column: 8
                                S3557=0;
                                System.out.println("");//sysj\ECS_plant.sysj line: 315, column: 7
                                System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 316, column: 7
                                System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 317, column: 7
                                deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 318, column: 7
                                currsigs.addElement(deHumOnZone4_5_6);
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                              else {
                                S3557=1;
                                if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 321, column: 15
                                  System.out.println("");//sysj\ECS_plant.sysj line: 323, column: 7
                                  System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 324, column: 7
                                  System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 325, column: 7
                                  humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 326, column: 7
                                  currsigs.addElement(humOnZone4_5_6);
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                                else {
                                  System.out.println("");//sysj\ECS_plant.sysj line: 330, column: 6
                                  System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 331, column: 6
                                  S1633=10;
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                              }
                            }
                            else {
                              S1633=10;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                        }
                      }
                    }
                    else {
                      S1633=8;
                      if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 284, column: 7
                        humid23_thread_2 = 0;//sysj\ECS_plant.sysj line: 285, column: 5
                        humid23_thread_2 = (humidZone2_3.getpreval() == null ? null : ((Integer)humidZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 286, column: 5
                        if(humid23_thread_2 > 60){//sysj\ECS_plant.sysj line: 287, column: 8
                          S2897=0;
                          System.out.println("");//sysj\ECS_plant.sysj line: 289, column: 7
                          System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 290, column: 7
                          System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 291, column: 7
                          deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 292, column: 7
                          currsigs.addElement(deHumOnZone2_3);
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          S2897=1;
                          if(humid23_thread_2 < 30){//sysj\ECS_plant.sysj line: 295, column: 15
                            System.out.println("");//sysj\ECS_plant.sysj line: 297, column: 7
                            System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 298, column: 7
                            System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 299, column: 7
                            humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 300, column: 7
                            currsigs.addElement(humOnZone2_3);
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            System.out.println("");//sysj\ECS_plant.sysj line: 304, column: 6
                            System.out.println("Room humidity is safe at" + humid23_thread_2);//sysj\ECS_plant.sysj line: 305, column: 6
                            S1633=9;
                            if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 310, column: 7
                              humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 311, column: 5
                              humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 312, column: 5
                              if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 313, column: 8
                                S3557=0;
                                System.out.println("");//sysj\ECS_plant.sysj line: 315, column: 7
                                System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 316, column: 7
                                System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 317, column: 7
                                deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 318, column: 7
                                currsigs.addElement(deHumOnZone4_5_6);
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                              else {
                                S3557=1;
                                if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 321, column: 15
                                  System.out.println("");//sysj\ECS_plant.sysj line: 323, column: 7
                                  System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 324, column: 7
                                  System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 325, column: 7
                                  humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 326, column: 7
                                  currsigs.addElement(humOnZone4_5_6);
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                                else {
                                  System.out.println("");//sysj\ECS_plant.sysj line: 330, column: 6
                                  System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 331, column: 6
                                  S1633=10;
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                              }
                            }
                            else {
                              S1633=10;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                        }
                      }
                      else {
                        S1633=9;
                        if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 310, column: 7
                          humid456_thread_2 = 0;//sysj\ECS_plant.sysj line: 311, column: 5
                          humid456_thread_2 = (humidZone4_5_6.getpreval() == null ? null : ((Integer)humidZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 312, column: 5
                          if(humid456_thread_2 > 60){//sysj\ECS_plant.sysj line: 313, column: 8
                            S3557=0;
                            System.out.println("");//sysj\ECS_plant.sysj line: 315, column: 7
                            System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 316, column: 7
                            System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 317, column: 7
                            deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 318, column: 7
                            currsigs.addElement(deHumOnZone4_5_6);
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S3557=1;
                            if(humid456_thread_2 < 30){//sysj\ECS_plant.sysj line: 321, column: 15
                              System.out.println("");//sysj\ECS_plant.sysj line: 323, column: 7
                              System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 324, column: 7
                              System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 325, column: 7
                              humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 326, column: 7
                              currsigs.addElement(humOnZone4_5_6);
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              System.out.println("");//sysj\ECS_plant.sysj line: 330, column: 6
                              System.out.println("Room humidity is safe at" + humid456_thread_2);//sysj\ECS_plant.sysj line: 331, column: 6
                              S1633=10;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                        }
                        else {
                          S1633=10;
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
              switch(S2112){
                case 0 : 
                  cleanZone1.setPresent();//sysj\ECS_plant.sysj line: 144, column: 7
                  currsigs.addElement(cleanZone1);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                  break;
                
                case 1 : 
                  cleanZone2.setPresent();//sysj\ECS_plant.sysj line: 150, column: 7
                  currsigs.addElement(cleanZone2);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                  break;
                
                case 2 : 
                  cleanZone3.setPresent();//sysj\ECS_plant.sysj line: 156, column: 7
                  currsigs.addElement(cleanZone3);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                  break;
                
                case 3 : 
                  cleanZone4.setPresent();//sysj\ECS_plant.sysj line: 162, column: 7
                  currsigs.addElement(cleanZone4);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                  break;
                
                case 4 : 
                  cleanZone5.setPresent();//sysj\ECS_plant.sysj line: 168, column: 7
                  currsigs.addElement(cleanZone5);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                  break;
                
                case 5 : 
                  cleanZone7.setPresent();//sysj\ECS_plant.sysj line: 174, column: 7
                  currsigs.addElement(cleanZone7);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                  break;
                
                case 6 : 
                  cleanZone7.setPresent();//sysj\ECS_plant.sysj line: 180, column: 7
                  currsigs.addElement(cleanZone7);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                  break;
                
              }
            }
            break;
          
          case 4 : 
            switch(S2217){
              case 0 : 
                System.out.println("");//sysj\ECS_plant.sysj line: 192, column: 7
                System.out.println("Room temperature is too high at " + temp17_thread_2);//sysj\ECS_plant.sysj line: 193, column: 7
                fanOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 194, column: 7
                currsigs.addElement(fanOnZone1_7);
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
                break;
              
              case 1 : 
                switch(S2216){
                  case 0 : 
                    System.out.println("Room temperature is too low at " + temp17_thread_2);//sysj\ECS_plant.sysj line: 199, column: 7
                    heatOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 200, column: 7
                    currsigs.addElement(heatOnZone1_7);
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                    break;
                  
                  case 1 : 
                    S1633=0;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                    break;
                  
                }
                break;
              
            }
            break;
          
          case 5 : 
            switch(S2277){
              case 0 : 
                System.out.println("");//sysj\ECS_plant.sysj line: 215, column: 7
                System.out.println("Room temperature is too high at " + temp23_thread_2);//sysj\ECS_plant.sysj line: 216, column: 7
                airOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 217, column: 7
                currsigs.addElement(airOnZone2_3);
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
                break;
              
              case 1 : 
                heatOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 222, column: 7
                currsigs.addElement(heatOnZone2_3);
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
                break;
              
            }
            break;
          
          case 6 : 
            switch(S2377){
              case 0 : 
                System.out.println("");//sysj\ECS_plant.sysj line: 238, column: 7
                System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 239, column: 7
                airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 240, column: 7
                currsigs.addElement(airOnZone4_5_6);
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
                break;
              
              case 1 : 
                System.out.println("");//sysj\ECS_plant.sysj line: 245, column: 7
                System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 246, column: 7
                heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 247, column: 7
                currsigs.addElement(heatOnZone4_5_6);
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
                break;
              
            }
            break;
          
          case 7 : 
            switch(S2557){
              case 0 : 
                System.out.println("");//sysj\ECS_plant.sysj line: 263, column: 7
                System.out.println("Room humidity is too high at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 264, column: 7
                System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 265, column: 7
                deHumOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 266, column: 7
                currsigs.addElement(deHumOnZone1_7);
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
                break;
              
              case 1 : 
                System.out.println("");//sysj\ECS_plant.sysj line: 271, column: 7
                System.out.println("Room humidity is too low at " + humid17_thread_2);//sysj\ECS_plant.sysj line: 272, column: 7
                System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 273, column: 7
                humOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 274, column: 7
                currsigs.addElement(humOnZone1_7);
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
                break;
              
            }
            break;
          
          case 8 : 
            switch(S2897){
              case 0 : 
                System.out.println("");//sysj\ECS_plant.sysj line: 289, column: 7
                System.out.println("Room humidity is too high at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 290, column: 7
                System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 291, column: 7
                deHumOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 292, column: 7
                currsigs.addElement(deHumOnZone2_3);
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
                break;
              
              case 1 : 
                System.out.println("");//sysj\ECS_plant.sysj line: 297, column: 7
                System.out.println("Room humidity is too low at " + humid23_thread_2);//sysj\ECS_plant.sysj line: 298, column: 7
                System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 299, column: 7
                humOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 300, column: 7
                currsigs.addElement(humOnZone2_3);
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
                break;
              
            }
            break;
          
          case 9 : 
            switch(S3557){
              case 0 : 
                System.out.println("");//sysj\ECS_plant.sysj line: 315, column: 7
                System.out.println("Room humidity is too high at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 316, column: 7
                System.out.println("Turning off humidifier");//sysj\ECS_plant.sysj line: 317, column: 7
                deHumOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 318, column: 7
                currsigs.addElement(deHumOnZone4_5_6);
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
                break;
              
              case 1 : 
                System.out.println("");//sysj\ECS_plant.sysj line: 323, column: 7
                System.out.println("Room humidity is too low at " + humid456_thread_2);//sysj\ECS_plant.sysj line: 324, column: 7
                System.out.println("Turning on humidifier");//sysj\ECS_plant.sysj line: 325, column: 7
                humOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 326, column: 7
                currsigs.addElement(humOnZone4_5_6);
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
                break;
              
            }
            break;
          
          case 10 : 
            S1633=10;
            S1633=0;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread21501(int [] tdone, int [] ends){
        S11545=1;
    if(cutPowZ7.getprestatus()){//sysj\ECS_plant.sysj line: 406, column: 24
      cutPowZ7_TriggerE.setPresent();//sysj\ECS_plant.sysj line: 406, column: 34
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

  public void thread21500(int [] tdone, int [] ends){
        S11537=1;
    if(cutPowZ6.getprestatus()){//sysj\ECS_plant.sysj line: 404, column: 24
      cutPowZ6_TriggerE.setPresent();//sysj\ECS_plant.sysj line: 404, column: 34
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

  public void thread21499(int [] tdone, int [] ends){
        S11529=1;
    if(cutPowZ5.getprestatus()){//sysj\ECS_plant.sysj line: 402, column: 24
      cutPowZ5_TriggerE.setPresent();//sysj\ECS_plant.sysj line: 402, column: 34
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

  public void thread21498(int [] tdone, int [] ends){
        S11521=1;
    if(cutPowZ4.getprestatus()){//sysj\ECS_plant.sysj line: 400, column: 24
      cutPowZ4_TriggerE.setPresent();//sysj\ECS_plant.sysj line: 400, column: 34
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

  public void thread21497(int [] tdone, int [] ends){
        S11513=1;
    if(cutPowZ3.getprestatus()){//sysj\ECS_plant.sysj line: 398, column: 24
      cutPowZ3_TriggerE.setPresent();//sysj\ECS_plant.sysj line: 398, column: 34
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

  public void thread21496(int [] tdone, int [] ends){
        S11505=1;
    if(cutPowZ2.getprestatus()){//sysj\ECS_plant.sysj line: 396, column: 24
      cutPowZ2_TriggerE.setPresent();//sysj\ECS_plant.sysj line: 396, column: 34
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

  public void thread21495(int [] tdone, int [] ends){
        S11497=1;
    if(cutPowZ1.getprestatus()){//sysj\ECS_plant.sysj line: 394, column: 24
      cutPowZ1_TriggerE.setPresent();//sysj\ECS_plant.sysj line: 394, column: 34
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

  public void thread21494(int [] tdone, int [] ends){
        S11489=1;
    if(deHumOnZone4_5_6.getprestatus()){//sysj\ECS_plant.sysj line: 392, column: 24
      deHumOnZone4_5_6TriggerE.setPresent();//sysj\ECS_plant.sysj line: 392, column: 42
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

  public void thread21493(int [] tdone, int [] ends){
        S11481=1;
    if(deHumOnZone2_3.getprestatus()){//sysj\ECS_plant.sysj line: 390, column: 24
      deHumOnZone2_3TriggerE.setPresent();//sysj\ECS_plant.sysj line: 390, column: 40
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

  public void thread21492(int [] tdone, int [] ends){
        S11473=1;
    if(deHumOnZone1_7.getprestatus()){//sysj\ECS_plant.sysj line: 388, column: 24
      deHumOnZone1_7TriggerE.setPresent();//sysj\ECS_plant.sysj line: 388, column: 40
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

  public void thread21491(int [] tdone, int [] ends){
        S11465=1;
    if(humOnZone4_5_6.getprestatus()){//sysj\ECS_plant.sysj line: 386, column: 24
      humOnZone4_5_6TriggerE.setPresent();//sysj\ECS_plant.sysj line: 386, column: 40
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

  public void thread21490(int [] tdone, int [] ends){
        S11457=1;
    if(humOnZone2_3.getprestatus()){//sysj\ECS_plant.sysj line: 384, column: 24
      humOnZone2_3TriggerE.setPresent();//sysj\ECS_plant.sysj line: 384, column: 38
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

  public void thread21489(int [] tdone, int [] ends){
        S11449=1;
    if(humOnZone1_7.getprestatus()){//sysj\ECS_plant.sysj line: 382, column: 24
      humOnZone1_7TriggerE.setPresent();//sysj\ECS_plant.sysj line: 382, column: 38
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

  public void thread21488(int [] tdone, int [] ends){
        S11441=1;
    if(heatOnZone4_5_6.getprestatus()){//sysj\ECS_plant.sysj line: 380, column: 24
      heatOnZone4_5_6TriggerE.setPresent();//sysj\ECS_plant.sysj line: 380, column: 41
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

  public void thread21487(int [] tdone, int [] ends){
        S11433=1;
    if(heatOnZone2_3.getprestatus()){//sysj\ECS_plant.sysj line: 378, column: 24
      heatOnZone2_3TriggerE.setPresent();//sysj\ECS_plant.sysj line: 378, column: 39
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

  public void thread21486(int [] tdone, int [] ends){
        S11425=1;
    if(airOnZone4_5_6.getprestatus()){//sysj\ECS_plant.sysj line: 376, column: 24
      airOnZone4_5_6TriggerE.setPresent();//sysj\ECS_plant.sysj line: 376, column: 40
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

  public void thread21485(int [] tdone, int [] ends){
        S11417=1;
    if(airOnZone2_3.getprestatus()){//sysj\ECS_plant.sysj line: 374, column: 24
      airOnZone2_3TriggerE.setPresent();//sysj\ECS_plant.sysj line: 374, column: 38
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

  public void thread21484(int [] tdone, int [] ends){
        S11409=1;
    if(heatOnZone1_7.getprestatus()){//sysj\ECS_plant.sysj line: 372, column: 24
      heatOnZone1_7TriggerE.setPresent();//sysj\ECS_plant.sysj line: 372, column: 39
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

  public void thread21483(int [] tdone, int [] ends){
        S11401=1;
    if(fanOnZone1_7.getprestatus()){//sysj\ECS_plant.sysj line: 370, column: 24
      fanOnZone1_7TriggerE.setPresent();//sysj\ECS_plant.sysj line: 370, column: 38
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

  public void thread21482(int [] tdone, int [] ends){
        S11393=1;
    if(cleanZone7.getprestatus()){//sysj\ECS_plant.sysj line: 368, column: 24
      cleanZone7TriggerE.setPresent();//sysj\ECS_plant.sysj line: 368, column: 36
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

  public void thread21481(int [] tdone, int [] ends){
        S11385=1;
    if(cleanZone6.getprestatus()){//sysj\ECS_plant.sysj line: 366, column: 24
      cleanZone6TriggerE.setPresent();//sysj\ECS_plant.sysj line: 366, column: 36
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

  public void thread21480(int [] tdone, int [] ends){
        S11377=1;
    if(cleanZone5.getprestatus()){//sysj\ECS_plant.sysj line: 364, column: 24
      cleanZone5TriggerE.setPresent();//sysj\ECS_plant.sysj line: 364, column: 36
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

  public void thread21479(int [] tdone, int [] ends){
        S11369=1;
    if(cleanZone4.getprestatus()){//sysj\ECS_plant.sysj line: 362, column: 24
      cleanZone4TriggerE.setPresent();//sysj\ECS_plant.sysj line: 362, column: 36
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

  public void thread21478(int [] tdone, int [] ends){
        S11361=1;
    if(cleanZone3.getprestatus()){//sysj\ECS_plant.sysj line: 360, column: 24
      cleanZone3TriggerE.setPresent();//sysj\ECS_plant.sysj line: 360, column: 36
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

  public void thread21477(int [] tdone, int [] ends){
        S11353=1;
    if(cleanZone2.getprestatus()){//sysj\ECS_plant.sysj line: 358, column: 24
      cleanZone2TriggerE.setPresent();//sysj\ECS_plant.sysj line: 358, column: 36
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

  public void thread21476(int [] tdone, int [] ends){
        S11345=1;
    if(cleanZone1.getprestatus()){//sysj\ECS_plant.sysj line: 356, column: 24
      cleanZone1TriggerE.setPresent();//sysj\ECS_plant.sysj line: 356, column: 36
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

  public void thread21475(int [] tdone, int [] ends){
        S11337=1;
    if(fireZone7.getprestatus()){//sysj\ECS_plant.sysj line: 354, column: 24
      alarmZone7TriggerE.setPresent();//sysj\ECS_plant.sysj line: 354, column: 35
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

  public void thread21474(int [] tdone, int [] ends){
        S11329=1;
    if(fireZone6.getprestatus()){//sysj\ECS_plant.sysj line: 352, column: 24
      alarmZone6TriggerE.setPresent();//sysj\ECS_plant.sysj line: 352, column: 35
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

  public void thread21473(int [] tdone, int [] ends){
        S11321=1;
    if(fireZone5.getprestatus()){//sysj\ECS_plant.sysj line: 350, column: 24
      alarmZone5TriggerE.setPresent();//sysj\ECS_plant.sysj line: 350, column: 35
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

  public void thread21472(int [] tdone, int [] ends){
        S11313=1;
    if(fireZone4.getprestatus()){//sysj\ECS_plant.sysj line: 348, column: 24
      alarmZone4TriggerE.setPresent();//sysj\ECS_plant.sysj line: 348, column: 35
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

  public void thread21471(int [] tdone, int [] ends){
        S11305=1;
    if(fireZone3.getprestatus()){//sysj\ECS_plant.sysj line: 346, column: 24
      alarmZone3TriggerE.setPresent();//sysj\ECS_plant.sysj line: 346, column: 35
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

  public void thread21470(int [] tdone, int [] ends){
        S11297=1;
    if(fireZone2.getprestatus()){//sysj\ECS_plant.sysj line: 344, column: 24
      alarmZone2TriggerE.setPresent();//sysj\ECS_plant.sysj line: 344, column: 35
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

  public void thread21469(int [] tdone, int [] ends){
        S11289=1;
    if(fireZone1.getprestatus()){//sysj\ECS_plant.sysj line: 342, column: 24
      alarmZone1TriggerE.setPresent();//sysj\ECS_plant.sysj line: 342, column: 35
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

  public void thread21468(int [] tdone, int [] ends){
        S11547=1;
    thread21469(tdone,ends);
    thread21470(tdone,ends);
    thread21471(tdone,ends);
    thread21472(tdone,ends);
    thread21473(tdone,ends);
    thread21474(tdone,ends);
    thread21475(tdone,ends);
    thread21476(tdone,ends);
    thread21477(tdone,ends);
    thread21478(tdone,ends);
    thread21479(tdone,ends);
    thread21480(tdone,ends);
    thread21481(tdone,ends);
    thread21482(tdone,ends);
    thread21483(tdone,ends);
    thread21484(tdone,ends);
    thread21485(tdone,ends);
    thread21486(tdone,ends);
    thread21487(tdone,ends);
    thread21488(tdone,ends);
    thread21489(tdone,ends);
    thread21490(tdone,ends);
    thread21491(tdone,ends);
    thread21492(tdone,ends);
    thread21493(tdone,ends);
    thread21494(tdone,ends);
    thread21495(tdone,ends);
    thread21496(tdone,ends);
    thread21497(tdone,ends);
    thread21498(tdone,ends);
    thread21499(tdone,ends);
    thread21500(tdone,ends);
    thread21501(tdone,ends);
    int biggest21502 = 0;
    if(ends[4]>=biggest21502){
      biggest21502=ends[4];
    }
    if(ends[5]>=biggest21502){
      biggest21502=ends[5];
    }
    if(ends[6]>=biggest21502){
      biggest21502=ends[6];
    }
    if(ends[7]>=biggest21502){
      biggest21502=ends[7];
    }
    if(ends[8]>=biggest21502){
      biggest21502=ends[8];
    }
    if(ends[9]>=biggest21502){
      biggest21502=ends[9];
    }
    if(ends[10]>=biggest21502){
      biggest21502=ends[10];
    }
    if(ends[11]>=biggest21502){
      biggest21502=ends[11];
    }
    if(ends[12]>=biggest21502){
      biggest21502=ends[12];
    }
    if(ends[13]>=biggest21502){
      biggest21502=ends[13];
    }
    if(ends[14]>=biggest21502){
      biggest21502=ends[14];
    }
    if(ends[15]>=biggest21502){
      biggest21502=ends[15];
    }
    if(ends[16]>=biggest21502){
      biggest21502=ends[16];
    }
    if(ends[17]>=biggest21502){
      biggest21502=ends[17];
    }
    if(ends[18]>=biggest21502){
      biggest21502=ends[18];
    }
    if(ends[19]>=biggest21502){
      biggest21502=ends[19];
    }
    if(ends[20]>=biggest21502){
      biggest21502=ends[20];
    }
    if(ends[21]>=biggest21502){
      biggest21502=ends[21];
    }
    if(ends[22]>=biggest21502){
      biggest21502=ends[22];
    }
    if(ends[23]>=biggest21502){
      biggest21502=ends[23];
    }
    if(ends[24]>=biggest21502){
      biggest21502=ends[24];
    }
    if(ends[25]>=biggest21502){
      biggest21502=ends[25];
    }
    if(ends[26]>=biggest21502){
      biggest21502=ends[26];
    }
    if(ends[27]>=biggest21502){
      biggest21502=ends[27];
    }
    if(ends[28]>=biggest21502){
      biggest21502=ends[28];
    }
    if(ends[29]>=biggest21502){
      biggest21502=ends[29];
    }
    if(ends[30]>=biggest21502){
      biggest21502=ends[30];
    }
    if(ends[31]>=biggest21502){
      biggest21502=ends[31];
    }
    if(ends[32]>=biggest21502){
      biggest21502=ends[32];
    }
    if(ends[33]>=biggest21502){
      biggest21502=ends[33];
    }
    if(ends[34]>=biggest21502){
      biggest21502=ends[34];
    }
    if(ends[35]>=biggest21502){
      biggest21502=ends[35];
    }
    if(ends[36]>=biggest21502){
      biggest21502=ends[36];
    }
    if(biggest21502 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread21467(int [] tdone, int [] ends){
        S11281=1;
    S1633=0;
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
      switch(S21465){
        case 0 : 
          S21465=0;
          break RUN;
        
        case 1 : 
          S21465=2;
          S21465=2;
          new Thread(new ECS_GUI()).start();//sysj\ECS_plant.sysj line: 32, column: 2
          thread21467(tdone,ends);
          thread21468(tdone,ends);
          int biggest21503 = 0;
          if(ends[2]>=biggest21503){
            biggest21503=ends[2];
          }
          if(ends[3]>=biggest21503){
            biggest21503=ends[3];
          }
          if(biggest21503 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread21504(tdone,ends);
          thread21505(tdone,ends);
          int biggest21540 = 0;
          if(ends[2]>=biggest21540){
            biggest21540=ends[2];
          }
          if(ends[3]>=biggest21540){
            biggest21540=ends[3];
          }
          if(biggest21540 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest21540 == 0){
            S21465=0;
            active[1]=0;
            ends[1]=0;
            S21465=0;
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
