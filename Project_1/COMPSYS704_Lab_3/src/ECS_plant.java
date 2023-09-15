import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import run.GUI;//sysj\plant.sysj line: 1, column: 1
import run.POS_GUI;//sysj\plant.sysj line: 2, column: 1
import run.ECS_GUI;//sysj\plant.sysj line: 3, column: 1
import run.ACS_GUI;//sysj\plant.sysj line: 4, column: 1

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
  public Signal fire = new Signal("fire", Signal.INPUT);
  public Signal time = new Signal("time", Signal.INPUT);
  public Signal humanZ1 = new Signal("humanZ1", Signal.INPUT);
  public Signal humanZ2 = new Signal("humanZ2", Signal.INPUT);
  public Signal humanZ3 = new Signal("humanZ3", Signal.INPUT);
  public Signal humanZ4 = new Signal("humanZ4", Signal.INPUT);
  public Signal humanZ5 = new Signal("humanZ5", Signal.INPUT);
  public Signal humanZ6 = new Signal("humanZ6", Signal.INPUT);
  public Signal humanZ7 = new Signal("humanZ7", Signal.INPUT);
  public Signal dust = new Signal("dust", Signal.INPUT);
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
  public Signal cutPow = new Signal("cutPow", Signal.OUTPUT);
  public Signal pow = new Signal("pow", Signal.OUTPUT);
  public Signal fireExt = new Signal("fireExt", Signal.OUTPUT);
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
  public Signal cutPow_TriggerE = new Signal("cutPow_TriggerE", Signal.OUTPUT);
  public Signal fireExtE = new Signal("fireExtE", Signal.OUTPUT);
  public Signal lightIntZ1Trigger = new Signal("lightIntZ1Trigger", Signal.OUTPUT);
  public Signal lightIntZ2Trigger = new Signal("lightIntZ2Trigger", Signal.OUTPUT);
  public Signal lightIntZ3Trigger = new Signal("lightIntZ3Trigger", Signal.OUTPUT);
  public Signal lightIntZ4Trigger = new Signal("lightIntZ4Trigger", Signal.OUTPUT);
  public Signal lightIntZ5Trigger = new Signal("lightIntZ5Trigger", Signal.OUTPUT);
  public Signal lightIntZ6Trigger = new Signal("lightIntZ6Trigger", Signal.OUTPUT);
  public Signal lightIntZ7Trigger = new Signal("lightIntZ7Trigger", Signal.OUTPUT);
  private long __start_thread_13;//sysj\plant.sysj line: 305, column: 25
  private Integer zone_thread_13;//sysj\plant.sysj line: 285, column: 5
  private Integer firePresent_thread_13;//sysj\plant.sysj line: 292, column: 5
  private Integer lightIntensity_thread_13;//sysj\plant.sysj line: 296, column: 5
  private String clock_thread_13;//sysj\plant.sysj line: 300, column: 5
  private Integer temp17_thread_13;//sysj\plant.sysj line: 322, column: 6
  private Integer temp23_thread_13;//sysj\plant.sysj line: 339, column: 6
  private Integer temp456_thread_13;//sysj\plant.sysj line: 356, column: 6
  private int S66882 = 1;
  private int S63099 = 1;
  private int S60815 = 1;
  private int S59676 = 1;
  private int S63277 = 1;
  private int S63107 = 1;
  private int S63115 = 1;
  private int S63123 = 1;
  private int S63131 = 1;
  private int S63139 = 1;
  private int S63147 = 1;
  private int S63155 = 1;
  private int S63163 = 1;
  private int S63171 = 1;
  private int S63179 = 1;
  private int S63187 = 1;
  private int S63195 = 1;
  private int S63203 = 1;
  private int S63211 = 1;
  private int S63219 = 1;
  private int S63227 = 1;
  private int S63235 = 1;
  private int S63243 = 1;
  private int S63251 = 1;
  private int S63259 = 1;
  private int S63267 = 1;
  private int S63275 = 1;
  
  private int[] ends = new int[67];
  private int[] tdone = new int[67];
  
  public void thread69579(int [] tdone, int [] ends){
        switch(S63275){
      case 0 : 
        active[36]=0;
        ends[36]=0;
        tdone[36]=1;
        break;
      
      case 1 : 
        if(cutPow.getprestatus()){//sysj\plant.sysj line: 420, column: 24
          cutPow_TriggerE.setPresent();//sysj\plant.sysj line: 420, column: 32
          currsigs.addElement(cutPow_TriggerE);
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

  public void thread69578(int [] tdone, int [] ends){
        switch(S63267){
      case 0 : 
        active[35]=0;
        ends[35]=0;
        tdone[35]=1;
        break;
      
      case 1 : 
        if(deHumOnZone4_5_6.getprestatus()){//sysj\plant.sysj line: 418, column: 24
          deHumOnZone4_5_6TriggerE.setPresent();//sysj\plant.sysj line: 418, column: 42
          currsigs.addElement(deHumOnZone4_5_6TriggerE);
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

  public void thread69577(int [] tdone, int [] ends){
        switch(S63259){
      case 0 : 
        active[34]=0;
        ends[34]=0;
        tdone[34]=1;
        break;
      
      case 1 : 
        if(deHumOnZone2_3.getprestatus()){//sysj\plant.sysj line: 416, column: 24
          deHumOnZone2_3TriggerE.setPresent();//sysj\plant.sysj line: 416, column: 40
          currsigs.addElement(deHumOnZone2_3TriggerE);
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

  public void thread69576(int [] tdone, int [] ends){
        switch(S63251){
      case 0 : 
        active[33]=0;
        ends[33]=0;
        tdone[33]=1;
        break;
      
      case 1 : 
        if(deHumOnZone1_7.getprestatus()){//sysj\plant.sysj line: 414, column: 24
          deHumOnZone1_7TriggerE.setPresent();//sysj\plant.sysj line: 414, column: 40
          currsigs.addElement(deHumOnZone1_7TriggerE);
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

  public void thread69575(int [] tdone, int [] ends){
        switch(S63243){
      case 0 : 
        active[32]=0;
        ends[32]=0;
        tdone[32]=1;
        break;
      
      case 1 : 
        if(humOnZone4_5_6.getprestatus()){//sysj\plant.sysj line: 412, column: 24
          humOnZone4_5_6TriggerE.setPresent();//sysj\plant.sysj line: 412, column: 40
          currsigs.addElement(humOnZone4_5_6TriggerE);
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

  public void thread69574(int [] tdone, int [] ends){
        switch(S63235){
      case 0 : 
        active[31]=0;
        ends[31]=0;
        tdone[31]=1;
        break;
      
      case 1 : 
        if(humOnZone2_3.getprestatus()){//sysj\plant.sysj line: 410, column: 24
          humOnZone2_3TriggerE.setPresent();//sysj\plant.sysj line: 410, column: 38
          currsigs.addElement(humOnZone2_3TriggerE);
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

  public void thread69573(int [] tdone, int [] ends){
        switch(S63227){
      case 0 : 
        active[30]=0;
        ends[30]=0;
        tdone[30]=1;
        break;
      
      case 1 : 
        if(humOnZone1_7.getprestatus()){//sysj\plant.sysj line: 408, column: 24
          humOnZone1_7TriggerE.setPresent();//sysj\plant.sysj line: 408, column: 38
          currsigs.addElement(humOnZone1_7TriggerE);
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

  public void thread69572(int [] tdone, int [] ends){
        switch(S63219){
      case 0 : 
        active[29]=0;
        ends[29]=0;
        tdone[29]=1;
        break;
      
      case 1 : 
        if(heatOnZone4_5_6.getprestatus()){//sysj\plant.sysj line: 406, column: 24
          heatOnZone4_5_6TriggerE.setPresent();//sysj\plant.sysj line: 406, column: 41
          currsigs.addElement(heatOnZone4_5_6TriggerE);
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

  public void thread69571(int [] tdone, int [] ends){
        switch(S63211){
      case 0 : 
        active[28]=0;
        ends[28]=0;
        tdone[28]=1;
        break;
      
      case 1 : 
        if(heatOnZone2_3.getprestatus()){//sysj\plant.sysj line: 404, column: 24
          heatOnZone2_3TriggerE.setPresent();//sysj\plant.sysj line: 404, column: 39
          currsigs.addElement(heatOnZone2_3TriggerE);
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

  public void thread69570(int [] tdone, int [] ends){
        switch(S63203){
      case 0 : 
        active[27]=0;
        ends[27]=0;
        tdone[27]=1;
        break;
      
      case 1 : 
        if(airOnZone4_5_6.getprestatus()){//sysj\plant.sysj line: 402, column: 24
          airOnZone4_5_6TriggerE.setPresent();//sysj\plant.sysj line: 402, column: 40
          currsigs.addElement(airOnZone4_5_6TriggerE);
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

  public void thread69569(int [] tdone, int [] ends){
        switch(S63195){
      case 0 : 
        active[26]=0;
        ends[26]=0;
        tdone[26]=1;
        break;
      
      case 1 : 
        if(airOnZone2_3.getprestatus()){//sysj\plant.sysj line: 400, column: 24
          airOnZone2_3TriggerE.setPresent();//sysj\plant.sysj line: 400, column: 38
          currsigs.addElement(airOnZone2_3TriggerE);
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

  public void thread69568(int [] tdone, int [] ends){
        switch(S63187){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        if(heatOnZone1_7.getprestatus()){//sysj\plant.sysj line: 398, column: 24
          heatOnZone1_7TriggerE.setPresent();//sysj\plant.sysj line: 398, column: 39
          currsigs.addElement(heatOnZone1_7TriggerE);
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

  public void thread69567(int [] tdone, int [] ends){
        switch(S63179){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        if(fanOnZone1_7.getprestatus()){//sysj\plant.sysj line: 396, column: 24
          fanOnZone1_7TriggerE.setPresent();//sysj\plant.sysj line: 396, column: 38
          currsigs.addElement(fanOnZone1_7TriggerE);
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

  public void thread69566(int [] tdone, int [] ends){
        switch(S63171){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        if(cleanZone7.getprestatus()){//sysj\plant.sysj line: 394, column: 24
          cleanZone7TriggerE.setPresent();//sysj\plant.sysj line: 394, column: 36
          currsigs.addElement(cleanZone7TriggerE);
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

  public void thread69565(int [] tdone, int [] ends){
        switch(S63163){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        if(cleanZone6.getprestatus()){//sysj\plant.sysj line: 392, column: 24
          cleanZone6TriggerE.setPresent();//sysj\plant.sysj line: 392, column: 36
          currsigs.addElement(cleanZone6TriggerE);
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

  public void thread69564(int [] tdone, int [] ends){
        switch(S63155){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        if(cleanZone5.getprestatus()){//sysj\plant.sysj line: 390, column: 24
          cleanZone5TriggerE.setPresent();//sysj\plant.sysj line: 390, column: 36
          currsigs.addElement(cleanZone5TriggerE);
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

  public void thread69563(int [] tdone, int [] ends){
        switch(S63147){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        if(cleanZone4.getprestatus()){//sysj\plant.sysj line: 388, column: 24
          cleanZone4TriggerE.setPresent();//sysj\plant.sysj line: 388, column: 36
          currsigs.addElement(cleanZone4TriggerE);
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

  public void thread69562(int [] tdone, int [] ends){
        switch(S63139){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        if(cleanZone3.getprestatus()){//sysj\plant.sysj line: 386, column: 24
          cleanZone3TriggerE.setPresent();//sysj\plant.sysj line: 386, column: 36
          currsigs.addElement(cleanZone3TriggerE);
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

  public void thread69561(int [] tdone, int [] ends){
        switch(S63131){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        if(cleanZone2.getprestatus()){//sysj\plant.sysj line: 384, column: 24
          cleanZone2TriggerE.setPresent();//sysj\plant.sysj line: 384, column: 36
          currsigs.addElement(cleanZone2TriggerE);
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

  public void thread69560(int [] tdone, int [] ends){
        switch(S63123){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        if(cleanZone1.getprestatus()){//sysj\plant.sysj line: 382, column: 24
          cleanZone1TriggerE.setPresent();//sysj\plant.sysj line: 382, column: 36
          currsigs.addElement(cleanZone1TriggerE);
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

  public void thread69559(int [] tdone, int [] ends){
        switch(S63115){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        if(fireExt.getprestatus()){//sysj\plant.sysj line: 380, column: 24
          fireExtE.setPresent();//sysj\plant.sysj line: 380, column: 33
          currsigs.addElement(fireExtE);
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

  public void thread69558(int [] tdone, int [] ends){
        switch(S63107){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(fireZone1.getprestatus()){//sysj\plant.sysj line: 378, column: 24
          alarmZone1TriggerE.setPresent();//sysj\plant.sysj line: 378, column: 35
          currsigs.addElement(alarmZone1TriggerE);
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

  public void thread69557(int [] tdone, int [] ends){
        switch(S63277){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        thread69558(tdone,ends);
        thread69559(tdone,ends);
        thread69560(tdone,ends);
        thread69561(tdone,ends);
        thread69562(tdone,ends);
        thread69563(tdone,ends);
        thread69564(tdone,ends);
        thread69565(tdone,ends);
        thread69566(tdone,ends);
        thread69567(tdone,ends);
        thread69568(tdone,ends);
        thread69569(tdone,ends);
        thread69570(tdone,ends);
        thread69571(tdone,ends);
        thread69572(tdone,ends);
        thread69573(tdone,ends);
        thread69574(tdone,ends);
        thread69575(tdone,ends);
        thread69576(tdone,ends);
        thread69577(tdone,ends);
        thread69578(tdone,ends);
        thread69579(tdone,ends);
        int biggest69580 = 0;
        if(ends[15]>=biggest69580){
          biggest69580=ends[15];
        }
        if(ends[16]>=biggest69580){
          biggest69580=ends[16];
        }
        if(ends[17]>=biggest69580){
          biggest69580=ends[17];
        }
        if(ends[18]>=biggest69580){
          biggest69580=ends[18];
        }
        if(ends[19]>=biggest69580){
          biggest69580=ends[19];
        }
        if(ends[20]>=biggest69580){
          biggest69580=ends[20];
        }
        if(ends[21]>=biggest69580){
          biggest69580=ends[21];
        }
        if(ends[22]>=biggest69580){
          biggest69580=ends[22];
        }
        if(ends[23]>=biggest69580){
          biggest69580=ends[23];
        }
        if(ends[24]>=biggest69580){
          biggest69580=ends[24];
        }
        if(ends[25]>=biggest69580){
          biggest69580=ends[25];
        }
        if(ends[26]>=biggest69580){
          biggest69580=ends[26];
        }
        if(ends[27]>=biggest69580){
          biggest69580=ends[27];
        }
        if(ends[28]>=biggest69580){
          biggest69580=ends[28];
        }
        if(ends[29]>=biggest69580){
          biggest69580=ends[29];
        }
        if(ends[30]>=biggest69580){
          biggest69580=ends[30];
        }
        if(ends[31]>=biggest69580){
          biggest69580=ends[31];
        }
        if(ends[32]>=biggest69580){
          biggest69580=ends[32];
        }
        if(ends[33]>=biggest69580){
          biggest69580=ends[33];
        }
        if(ends[34]>=biggest69580){
          biggest69580=ends[34];
        }
        if(ends[35]>=biggest69580){
          biggest69580=ends[35];
        }
        if(ends[36]>=biggest69580){
          biggest69580=ends[36];
        }
        if(biggest69580 == 1){
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
        //FINXME code
        if(biggest69580 == 0){
          S63277=0;
          active[14]=0;
          ends[14]=0;
          tdone[14]=1;
        }
        break;
      
    }
  }

  public void thread69556(int [] tdone, int [] ends){
        switch(S63099){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        switch(S60815){
          case 0 : 
            switch(S59676){
              case 0 : 
                if(powerOff.getprestatus()){//sysj\plant.sysj line: 308, column: 12
                  S59676=1;
                  __start_thread_13 = com.systemj.Timer.getMs();//sysj\plant.sysj line: 305, column: 25
                  if(com.systemj.Timer.getMs() - __start_thread_13 >= (2) * 1000){//sysj\plant.sysj line: 305, column: 25
                    ends[13]=2;
                    ;//sysj\plant.sysj line: 305, column: 25
                    System.out.println("Power turned off");//sysj\plant.sysj line: 310, column: 6
                    fireZone1.setPresent();//sysj\plant.sysj line: 311, column: 6
                    currsigs.addElement(fireZone1);
                    S59676=2;
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
                else {
                  active[13]=1;
                  ends[13]=1;
                  tdone[13]=1;
                }
                break;
              
              case 1 : 
                if(com.systemj.Timer.getMs() - __start_thread_13 >= (2) * 1000){//sysj\plant.sysj line: 305, column: 25
                  ends[13]=2;
                  ;//sysj\plant.sysj line: 305, column: 25
                  System.out.println("Power turned off");//sysj\plant.sysj line: 310, column: 6
                  fireZone1.setPresent();//sysj\plant.sysj line: 311, column: 6
                  currsigs.addElement(fireZone1);
                  S59676=2;
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
              
              case 2 : 
                if(alarmOff.getprestatus()){//sysj\plant.sysj line: 312, column: 12
                  S59676=3;
                  __start_thread_13 = com.systemj.Timer.getMs();//sysj\plant.sysj line: 305, column: 25
                  if(com.systemj.Timer.getMs() - __start_thread_13 >= (4) * 1000){//sysj\plant.sysj line: 305, column: 25
                    ends[13]=2;
                    ;//sysj\plant.sysj line: 305, column: 25
                    System.out.println("Alarm off, Fire out");//sysj\plant.sysj line: 314, column: 6
                    if(zone_thread_13 == 1 || zone_thread_13 == 7){//sysj\plant.sysj line: 321, column: 8
                      temp17_thread_13 = 0;//sysj\plant.sysj line: 322, column: 6
                      temp17_thread_13 = (tempZone1_7.getpreval() == null ? null : ((Integer)tempZone1_7.getpreval()));//sysj\plant.sysj line: 323, column: 6
                      if(temp17_thread_13 > 22){//sysj\plant.sysj line: 324, column: 9
                        System.out.println("");//sysj\plant.sysj line: 325, column: 8
                        System.out.println("Room temperature is too high at " + temp17_thread_13);//sysj\plant.sysj line: 326, column: 8
                        fanOnZone1_7.setPresent();//sysj\plant.sysj line: 327, column: 8
                        currsigs.addElement(fanOnZone1_7);
                        if(zone_thread_13 == 2 || zone_thread_13 == 3){//sysj\plant.sysj line: 338, column: 8
                          temp23_thread_13 = 0;//sysj\plant.sysj line: 339, column: 6
                          temp23_thread_13 = (tempZone2_3.getpreval() == null ? null : ((Integer)tempZone2_3.getpreval()));//sysj\plant.sysj line: 340, column: 6
                          if(temp23_thread_13 > 22){//sysj\plant.sysj line: 341, column: 9
                            System.out.println("");//sysj\plant.sysj line: 342, column: 8
                            System.out.println("Room temperature is too high at " + temp23_thread_13);//sysj\plant.sysj line: 343, column: 8
                            airOnZone2_3.setPresent();//sysj\plant.sysj line: 344, column: 8
                            currsigs.addElement(airOnZone2_3);
                            if(zone_thread_13 == 4 || zone_thread_13 == 5 || zone_thread_13 == 6){//sysj\plant.sysj line: 355, column: 8
                              temp456_thread_13 = 0;//sysj\plant.sysj line: 356, column: 6
                              temp456_thread_13 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\plant.sysj line: 357, column: 6
                              if(temp456_thread_13 > 22){//sysj\plant.sysj line: 358, column: 9
                                System.out.println("");//sysj\plant.sysj line: 359, column: 8
                                System.out.println("Room temperature is too high at " + temp456_thread_13);//sysj\plant.sysj line: 360, column: 8
                                airOnZone4_5_6.setPresent();//sysj\plant.sysj line: 361, column: 8
                                currsigs.addElement(airOnZone4_5_6);
                                S60815=1;
                                active[13]=1;
                                ends[13]=1;
                                tdone[13]=1;
                              }
                              else {
                                if(temp456_thread_13 < 21){//sysj\plant.sysj line: 362, column: 16
                                  System.out.println("");//sysj\plant.sysj line: 363, column: 8
                                  System.out.println("Room temperature is too low at " + temp456_thread_13);//sysj\plant.sysj line: 364, column: 8
                                  heatOnZone4_5_6.setPresent();//sysj\plant.sysj line: 365, column: 8
                                  currsigs.addElement(heatOnZone4_5_6);
                                  S60815=1;
                                  active[13]=1;
                                  ends[13]=1;
                                  tdone[13]=1;
                                }
                                else {
                                  System.out.println("");//sysj\plant.sysj line: 367, column: 7
                                  System.out.println("Room temperature is safe at" + temp456_thread_13);//sysj\plant.sysj line: 368, column: 7
                                  S60815=1;
                                  active[13]=1;
                                  ends[13]=1;
                                  tdone[13]=1;
                                }
                              }
                            }
                            else {
                              S60815=1;
                              active[13]=1;
                              ends[13]=1;
                              tdone[13]=1;
                            }
                          }
                          else {
                            if(temp23_thread_13 < 21){//sysj\plant.sysj line: 345, column: 16
                              heatOnZone2_3.setPresent();//sysj\plant.sysj line: 346, column: 8
                              currsigs.addElement(heatOnZone2_3);
                              if(zone_thread_13 == 4 || zone_thread_13 == 5 || zone_thread_13 == 6){//sysj\plant.sysj line: 355, column: 8
                                temp456_thread_13 = 0;//sysj\plant.sysj line: 356, column: 6
                                temp456_thread_13 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\plant.sysj line: 357, column: 6
                                if(temp456_thread_13 > 22){//sysj\plant.sysj line: 358, column: 9
                                  System.out.println("");//sysj\plant.sysj line: 359, column: 8
                                  System.out.println("Room temperature is too high at " + temp456_thread_13);//sysj\plant.sysj line: 360, column: 8
                                  airOnZone4_5_6.setPresent();//sysj\plant.sysj line: 361, column: 8
                                  currsigs.addElement(airOnZone4_5_6);
                                  S60815=1;
                                  active[13]=1;
                                  ends[13]=1;
                                  tdone[13]=1;
                                }
                                else {
                                  if(temp456_thread_13 < 21){//sysj\plant.sysj line: 362, column: 16
                                    System.out.println("");//sysj\plant.sysj line: 363, column: 8
                                    System.out.println("Room temperature is too low at " + temp456_thread_13);//sysj\plant.sysj line: 364, column: 8
                                    heatOnZone4_5_6.setPresent();//sysj\plant.sysj line: 365, column: 8
                                    currsigs.addElement(heatOnZone4_5_6);
                                    S60815=1;
                                    active[13]=1;
                                    ends[13]=1;
                                    tdone[13]=1;
                                  }
                                  else {
                                    System.out.println("");//sysj\plant.sysj line: 367, column: 7
                                    System.out.println("Room temperature is safe at" + temp456_thread_13);//sysj\plant.sysj line: 368, column: 7
                                    S60815=1;
                                    active[13]=1;
                                    ends[13]=1;
                                    tdone[13]=1;
                                  }
                                }
                              }
                              else {
                                S60815=1;
                                active[13]=1;
                                ends[13]=1;
                                tdone[13]=1;
                              }
                            }
                            else {
                              System.out.println("");//sysj\plant.sysj line: 348, column: 7
                              System.out.println("Room temperature is safe at" + temp23_thread_13);//sysj\plant.sysj line: 349, column: 7
                              if(zone_thread_13 == 4 || zone_thread_13 == 5 || zone_thread_13 == 6){//sysj\plant.sysj line: 355, column: 8
                                temp456_thread_13 = 0;//sysj\plant.sysj line: 356, column: 6
                                temp456_thread_13 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\plant.sysj line: 357, column: 6
                                if(temp456_thread_13 > 22){//sysj\plant.sysj line: 358, column: 9
                                  System.out.println("");//sysj\plant.sysj line: 359, column: 8
                                  System.out.println("Room temperature is too high at " + temp456_thread_13);//sysj\plant.sysj line: 360, column: 8
                                  airOnZone4_5_6.setPresent();//sysj\plant.sysj line: 361, column: 8
                                  currsigs.addElement(airOnZone4_5_6);
                                  S60815=1;
                                  active[13]=1;
                                  ends[13]=1;
                                  tdone[13]=1;
                                }
                                else {
                                  if(temp456_thread_13 < 21){//sysj\plant.sysj line: 362, column: 16
                                    System.out.println("");//sysj\plant.sysj line: 363, column: 8
                                    System.out.println("Room temperature is too low at " + temp456_thread_13);//sysj\plant.sysj line: 364, column: 8
                                    heatOnZone4_5_6.setPresent();//sysj\plant.sysj line: 365, column: 8
                                    currsigs.addElement(heatOnZone4_5_6);
                                    S60815=1;
                                    active[13]=1;
                                    ends[13]=1;
                                    tdone[13]=1;
                                  }
                                  else {
                                    System.out.println("");//sysj\plant.sysj line: 367, column: 7
                                    System.out.println("Room temperature is safe at" + temp456_thread_13);//sysj\plant.sysj line: 368, column: 7
                                    S60815=1;
                                    active[13]=1;
                                    ends[13]=1;
                                    tdone[13]=1;
                                  }
                                }
                              }
                              else {
                                S60815=1;
                                active[13]=1;
                                ends[13]=1;
                                tdone[13]=1;
                              }
                            }
                          }
                        }
                        else {
                          if(zone_thread_13 == 4 || zone_thread_13 == 5 || zone_thread_13 == 6){//sysj\plant.sysj line: 355, column: 8
                            temp456_thread_13 = 0;//sysj\plant.sysj line: 356, column: 6
                            temp456_thread_13 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\plant.sysj line: 357, column: 6
                            if(temp456_thread_13 > 22){//sysj\plant.sysj line: 358, column: 9
                              System.out.println("");//sysj\plant.sysj line: 359, column: 8
                              System.out.println("Room temperature is too high at " + temp456_thread_13);//sysj\plant.sysj line: 360, column: 8
                              airOnZone4_5_6.setPresent();//sysj\plant.sysj line: 361, column: 8
                              currsigs.addElement(airOnZone4_5_6);
                              S60815=1;
                              active[13]=1;
                              ends[13]=1;
                              tdone[13]=1;
                            }
                            else {
                              if(temp456_thread_13 < 21){//sysj\plant.sysj line: 362, column: 16
                                System.out.println("");//sysj\plant.sysj line: 363, column: 8
                                System.out.println("Room temperature is too low at " + temp456_thread_13);//sysj\plant.sysj line: 364, column: 8
                                heatOnZone4_5_6.setPresent();//sysj\plant.sysj line: 365, column: 8
                                currsigs.addElement(heatOnZone4_5_6);
                                S60815=1;
                                active[13]=1;
                                ends[13]=1;
                                tdone[13]=1;
                              }
                              else {
                                System.out.println("");//sysj\plant.sysj line: 367, column: 7
                                System.out.println("Room temperature is safe at" + temp456_thread_13);//sysj\plant.sysj line: 368, column: 7
                                S60815=1;
                                active[13]=1;
                                ends[13]=1;
                                tdone[13]=1;
                              }
                            }
                          }
                          else {
                            S60815=1;
                            active[13]=1;
                            ends[13]=1;
                            tdone[13]=1;
                          }
                        }
                      }
                      else {
                        if(temp17_thread_13 < 21){//sysj\plant.sysj line: 328, column: 16
                          System.out.println("Room temperature is too low at " + temp17_thread_13);//sysj\plant.sysj line: 329, column: 8
                          heatOnZone1_7.setPresent();//sysj\plant.sysj line: 330, column: 8
                          currsigs.addElement(heatOnZone1_7);
                          if(zone_thread_13 == 2 || zone_thread_13 == 3){//sysj\plant.sysj line: 338, column: 8
                            temp23_thread_13 = 0;//sysj\plant.sysj line: 339, column: 6
                            temp23_thread_13 = (tempZone2_3.getpreval() == null ? null : ((Integer)tempZone2_3.getpreval()));//sysj\plant.sysj line: 340, column: 6
                            if(temp23_thread_13 > 22){//sysj\plant.sysj line: 341, column: 9
                              System.out.println("");//sysj\plant.sysj line: 342, column: 8
                              System.out.println("Room temperature is too high at " + temp23_thread_13);//sysj\plant.sysj line: 343, column: 8
                              airOnZone2_3.setPresent();//sysj\plant.sysj line: 344, column: 8
                              currsigs.addElement(airOnZone2_3);
                              if(zone_thread_13 == 4 || zone_thread_13 == 5 || zone_thread_13 == 6){//sysj\plant.sysj line: 355, column: 8
                                temp456_thread_13 = 0;//sysj\plant.sysj line: 356, column: 6
                                temp456_thread_13 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\plant.sysj line: 357, column: 6
                                if(temp456_thread_13 > 22){//sysj\plant.sysj line: 358, column: 9
                                  System.out.println("");//sysj\plant.sysj line: 359, column: 8
                                  System.out.println("Room temperature is too high at " + temp456_thread_13);//sysj\plant.sysj line: 360, column: 8
                                  airOnZone4_5_6.setPresent();//sysj\plant.sysj line: 361, column: 8
                                  currsigs.addElement(airOnZone4_5_6);
                                  S60815=1;
                                  active[13]=1;
                                  ends[13]=1;
                                  tdone[13]=1;
                                }
                                else {
                                  if(temp456_thread_13 < 21){//sysj\plant.sysj line: 362, column: 16
                                    System.out.println("");//sysj\plant.sysj line: 363, column: 8
                                    System.out.println("Room temperature is too low at " + temp456_thread_13);//sysj\plant.sysj line: 364, column: 8
                                    heatOnZone4_5_6.setPresent();//sysj\plant.sysj line: 365, column: 8
                                    currsigs.addElement(heatOnZone4_5_6);
                                    S60815=1;
                                    active[13]=1;
                                    ends[13]=1;
                                    tdone[13]=1;
                                  }
                                  else {
                                    System.out.println("");//sysj\plant.sysj line: 367, column: 7
                                    System.out.println("Room temperature is safe at" + temp456_thread_13);//sysj\plant.sysj line: 368, column: 7
                                    S60815=1;
                                    active[13]=1;
                                    ends[13]=1;
                                    tdone[13]=1;
                                  }
                                }
                              }
                              else {
                                S60815=1;
                                active[13]=1;
                                ends[13]=1;
                                tdone[13]=1;
                              }
                            }
                            else {
                              if(temp23_thread_13 < 21){//sysj\plant.sysj line: 345, column: 16
                                heatOnZone2_3.setPresent();//sysj\plant.sysj line: 346, column: 8
                                currsigs.addElement(heatOnZone2_3);
                                if(zone_thread_13 == 4 || zone_thread_13 == 5 || zone_thread_13 == 6){//sysj\plant.sysj line: 355, column: 8
                                  temp456_thread_13 = 0;//sysj\plant.sysj line: 356, column: 6
                                  temp456_thread_13 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\plant.sysj line: 357, column: 6
                                  if(temp456_thread_13 > 22){//sysj\plant.sysj line: 358, column: 9
                                    System.out.println("");//sysj\plant.sysj line: 359, column: 8
                                    System.out.println("Room temperature is too high at " + temp456_thread_13);//sysj\plant.sysj line: 360, column: 8
                                    airOnZone4_5_6.setPresent();//sysj\plant.sysj line: 361, column: 8
                                    currsigs.addElement(airOnZone4_5_6);
                                    S60815=1;
                                    active[13]=1;
                                    ends[13]=1;
                                    tdone[13]=1;
                                  }
                                  else {
                                    if(temp456_thread_13 < 21){//sysj\plant.sysj line: 362, column: 16
                                      System.out.println("");//sysj\plant.sysj line: 363, column: 8
                                      System.out.println("Room temperature is too low at " + temp456_thread_13);//sysj\plant.sysj line: 364, column: 8
                                      heatOnZone4_5_6.setPresent();//sysj\plant.sysj line: 365, column: 8
                                      currsigs.addElement(heatOnZone4_5_6);
                                      S60815=1;
                                      active[13]=1;
                                      ends[13]=1;
                                      tdone[13]=1;
                                    }
                                    else {
                                      System.out.println("");//sysj\plant.sysj line: 367, column: 7
                                      System.out.println("Room temperature is safe at" + temp456_thread_13);//sysj\plant.sysj line: 368, column: 7
                                      S60815=1;
                                      active[13]=1;
                                      ends[13]=1;
                                      tdone[13]=1;
                                    }
                                  }
                                }
                                else {
                                  S60815=1;
                                  active[13]=1;
                                  ends[13]=1;
                                  tdone[13]=1;
                                }
                              }
                              else {
                                System.out.println("");//sysj\plant.sysj line: 348, column: 7
                                System.out.println("Room temperature is safe at" + temp23_thread_13);//sysj\plant.sysj line: 349, column: 7
                                if(zone_thread_13 == 4 || zone_thread_13 == 5 || zone_thread_13 == 6){//sysj\plant.sysj line: 355, column: 8
                                  temp456_thread_13 = 0;//sysj\plant.sysj line: 356, column: 6
                                  temp456_thread_13 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\plant.sysj line: 357, column: 6
                                  if(temp456_thread_13 > 22){//sysj\plant.sysj line: 358, column: 9
                                    System.out.println("");//sysj\plant.sysj line: 359, column: 8
                                    System.out.println("Room temperature is too high at " + temp456_thread_13);//sysj\plant.sysj line: 360, column: 8
                                    airOnZone4_5_6.setPresent();//sysj\plant.sysj line: 361, column: 8
                                    currsigs.addElement(airOnZone4_5_6);
                                    S60815=1;
                                    active[13]=1;
                                    ends[13]=1;
                                    tdone[13]=1;
                                  }
                                  else {
                                    if(temp456_thread_13 < 21){//sysj\plant.sysj line: 362, column: 16
                                      System.out.println("");//sysj\plant.sysj line: 363, column: 8
                                      System.out.println("Room temperature is too low at " + temp456_thread_13);//sysj\plant.sysj line: 364, column: 8
                                      heatOnZone4_5_6.setPresent();//sysj\plant.sysj line: 365, column: 8
                                      currsigs.addElement(heatOnZone4_5_6);
                                      S60815=1;
                                      active[13]=1;
                                      ends[13]=1;
                                      tdone[13]=1;
                                    }
                                    else {
                                      System.out.println("");//sysj\plant.sysj line: 367, column: 7
                                      System.out.println("Room temperature is safe at" + temp456_thread_13);//sysj\plant.sysj line: 368, column: 7
                                      S60815=1;
                                      active[13]=1;
                                      ends[13]=1;
                                      tdone[13]=1;
                                    }
                                  }
                                }
                                else {
                                  S60815=1;
                                  active[13]=1;
                                  ends[13]=1;
                                  tdone[13]=1;
                                }
                              }
                            }
                          }
                          else {
                            if(zone_thread_13 == 4 || zone_thread_13 == 5 || zone_thread_13 == 6){//sysj\plant.sysj line: 355, column: 8
                              temp456_thread_13 = 0;//sysj\plant.sysj line: 356, column: 6
                              temp456_thread_13 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\plant.sysj line: 357, column: 6
                              if(temp456_thread_13 > 22){//sysj\plant.sysj line: 358, column: 9
                                System.out.println("");//sysj\plant.sysj line: 359, column: 8
                                System.out.println("Room temperature is too high at " + temp456_thread_13);//sysj\plant.sysj line: 360, column: 8
                                airOnZone4_5_6.setPresent();//sysj\plant.sysj line: 361, column: 8
                                currsigs.addElement(airOnZone4_5_6);
                                S60815=1;
                                active[13]=1;
                                ends[13]=1;
                                tdone[13]=1;
                              }
                              else {
                                if(temp456_thread_13 < 21){//sysj\plant.sysj line: 362, column: 16
                                  System.out.println("");//sysj\plant.sysj line: 363, column: 8
                                  System.out.println("Room temperature is too low at " + temp456_thread_13);//sysj\plant.sysj line: 364, column: 8
                                  heatOnZone4_5_6.setPresent();//sysj\plant.sysj line: 365, column: 8
                                  currsigs.addElement(heatOnZone4_5_6);
                                  S60815=1;
                                  active[13]=1;
                                  ends[13]=1;
                                  tdone[13]=1;
                                }
                                else {
                                  System.out.println("");//sysj\plant.sysj line: 367, column: 7
                                  System.out.println("Room temperature is safe at" + temp456_thread_13);//sysj\plant.sysj line: 368, column: 7
                                  S60815=1;
                                  active[13]=1;
                                  ends[13]=1;
                                  tdone[13]=1;
                                }
                              }
                            }
                            else {
                              S60815=1;
                              active[13]=1;
                              ends[13]=1;
                              tdone[13]=1;
                            }
                          }
                        }
                        else {
                          System.out.println("");//sysj\plant.sysj line: 332, column: 7
                          System.out.println("Room temperature is safe at" + temp17_thread_13);//sysj\plant.sysj line: 333, column: 7
                          if(zone_thread_13 == 2 || zone_thread_13 == 3){//sysj\plant.sysj line: 338, column: 8
                            temp23_thread_13 = 0;//sysj\plant.sysj line: 339, column: 6
                            temp23_thread_13 = (tempZone2_3.getpreval() == null ? null : ((Integer)tempZone2_3.getpreval()));//sysj\plant.sysj line: 340, column: 6
                            if(temp23_thread_13 > 22){//sysj\plant.sysj line: 341, column: 9
                              System.out.println("");//sysj\plant.sysj line: 342, column: 8
                              System.out.println("Room temperature is too high at " + temp23_thread_13);//sysj\plant.sysj line: 343, column: 8
                              airOnZone2_3.setPresent();//sysj\plant.sysj line: 344, column: 8
                              currsigs.addElement(airOnZone2_3);
                              if(zone_thread_13 == 4 || zone_thread_13 == 5 || zone_thread_13 == 6){//sysj\plant.sysj line: 355, column: 8
                                temp456_thread_13 = 0;//sysj\plant.sysj line: 356, column: 6
                                temp456_thread_13 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\plant.sysj line: 357, column: 6
                                if(temp456_thread_13 > 22){//sysj\plant.sysj line: 358, column: 9
                                  System.out.println("");//sysj\plant.sysj line: 359, column: 8
                                  System.out.println("Room temperature is too high at " + temp456_thread_13);//sysj\plant.sysj line: 360, column: 8
                                  airOnZone4_5_6.setPresent();//sysj\plant.sysj line: 361, column: 8
                                  currsigs.addElement(airOnZone4_5_6);
                                  S60815=1;
                                  active[13]=1;
                                  ends[13]=1;
                                  tdone[13]=1;
                                }
                                else {
                                  if(temp456_thread_13 < 21){//sysj\plant.sysj line: 362, column: 16
                                    System.out.println("");//sysj\plant.sysj line: 363, column: 8
                                    System.out.println("Room temperature is too low at " + temp456_thread_13);//sysj\plant.sysj line: 364, column: 8
                                    heatOnZone4_5_6.setPresent();//sysj\plant.sysj line: 365, column: 8
                                    currsigs.addElement(heatOnZone4_5_6);
                                    S60815=1;
                                    active[13]=1;
                                    ends[13]=1;
                                    tdone[13]=1;
                                  }
                                  else {
                                    System.out.println("");//sysj\plant.sysj line: 367, column: 7
                                    System.out.println("Room temperature is safe at" + temp456_thread_13);//sysj\plant.sysj line: 368, column: 7
                                    S60815=1;
                                    active[13]=1;
                                    ends[13]=1;
                                    tdone[13]=1;
                                  }
                                }
                              }
                              else {
                                S60815=1;
                                active[13]=1;
                                ends[13]=1;
                                tdone[13]=1;
                              }
                            }
                            else {
                              if(temp23_thread_13 < 21){//sysj\plant.sysj line: 345, column: 16
                                heatOnZone2_3.setPresent();//sysj\plant.sysj line: 346, column: 8
                                currsigs.addElement(heatOnZone2_3);
                                if(zone_thread_13 == 4 || zone_thread_13 == 5 || zone_thread_13 == 6){//sysj\plant.sysj line: 355, column: 8
                                  temp456_thread_13 = 0;//sysj\plant.sysj line: 356, column: 6
                                  temp456_thread_13 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\plant.sysj line: 357, column: 6
                                  if(temp456_thread_13 > 22){//sysj\plant.sysj line: 358, column: 9
                                    System.out.println("");//sysj\plant.sysj line: 359, column: 8
                                    System.out.println("Room temperature is too high at " + temp456_thread_13);//sysj\plant.sysj line: 360, column: 8
                                    airOnZone4_5_6.setPresent();//sysj\plant.sysj line: 361, column: 8
                                    currsigs.addElement(airOnZone4_5_6);
                                    S60815=1;
                                    active[13]=1;
                                    ends[13]=1;
                                    tdone[13]=1;
                                  }
                                  else {
                                    if(temp456_thread_13 < 21){//sysj\plant.sysj line: 362, column: 16
                                      System.out.println("");//sysj\plant.sysj line: 363, column: 8
                                      System.out.println("Room temperature is too low at " + temp456_thread_13);//sysj\plant.sysj line: 364, column: 8
                                      heatOnZone4_5_6.setPresent();//sysj\plant.sysj line: 365, column: 8
                                      currsigs.addElement(heatOnZone4_5_6);
                                      S60815=1;
                                      active[13]=1;
                                      ends[13]=1;
                                      tdone[13]=1;
                                    }
                                    else {
                                      System.out.println("");//sysj\plant.sysj line: 367, column: 7
                                      System.out.println("Room temperature is safe at" + temp456_thread_13);//sysj\plant.sysj line: 368, column: 7
                                      S60815=1;
                                      active[13]=1;
                                      ends[13]=1;
                                      tdone[13]=1;
                                    }
                                  }
                                }
                                else {
                                  S60815=1;
                                  active[13]=1;
                                  ends[13]=1;
                                  tdone[13]=1;
                                }
                              }
                              else {
                                System.out.println("");//sysj\plant.sysj line: 348, column: 7
                                System.out.println("Room temperature is safe at" + temp23_thread_13);//sysj\plant.sysj line: 349, column: 7
                                if(zone_thread_13 == 4 || zone_thread_13 == 5 || zone_thread_13 == 6){//sysj\plant.sysj line: 355, column: 8
                                  temp456_thread_13 = 0;//sysj\plant.sysj line: 356, column: 6
                                  temp456_thread_13 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\plant.sysj line: 357, column: 6
                                  if(temp456_thread_13 > 22){//sysj\plant.sysj line: 358, column: 9
                                    System.out.println("");//sysj\plant.sysj line: 359, column: 8
                                    System.out.println("Room temperature is too high at " + temp456_thread_13);//sysj\plant.sysj line: 360, column: 8
                                    airOnZone4_5_6.setPresent();//sysj\plant.sysj line: 361, column: 8
                                    currsigs.addElement(airOnZone4_5_6);
                                    S60815=1;
                                    active[13]=1;
                                    ends[13]=1;
                                    tdone[13]=1;
                                  }
                                  else {
                                    if(temp456_thread_13 < 21){//sysj\plant.sysj line: 362, column: 16
                                      System.out.println("");//sysj\plant.sysj line: 363, column: 8
                                      System.out.println("Room temperature is too low at " + temp456_thread_13);//sysj\plant.sysj line: 364, column: 8
                                      heatOnZone4_5_6.setPresent();//sysj\plant.sysj line: 365, column: 8
                                      currsigs.addElement(heatOnZone4_5_6);
                                      S60815=1;
                                      active[13]=1;
                                      ends[13]=1;
                                      tdone[13]=1;
                                    }
                                    else {
                                      System.out.println("");//sysj\plant.sysj line: 367, column: 7
                                      System.out.println("Room temperature is safe at" + temp456_thread_13);//sysj\plant.sysj line: 368, column: 7
                                      S60815=1;
                                      active[13]=1;
                                      ends[13]=1;
                                      tdone[13]=1;
                                    }
                                  }
                                }
                                else {
                                  S60815=1;
                                  active[13]=1;
                                  ends[13]=1;
                                  tdone[13]=1;
                                }
                              }
                            }
                          }
                          else {
                            if(zone_thread_13 == 4 || zone_thread_13 == 5 || zone_thread_13 == 6){//sysj\plant.sysj line: 355, column: 8
                              temp456_thread_13 = 0;//sysj\plant.sysj line: 356, column: 6
                              temp456_thread_13 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\plant.sysj line: 357, column: 6
                              if(temp456_thread_13 > 22){//sysj\plant.sysj line: 358, column: 9
                                System.out.println("");//sysj\plant.sysj line: 359, column: 8
                                System.out.println("Room temperature is too high at " + temp456_thread_13);//sysj\plant.sysj line: 360, column: 8
                                airOnZone4_5_6.setPresent();//sysj\plant.sysj line: 361, column: 8
                                currsigs.addElement(airOnZone4_5_6);
                                S60815=1;
                                active[13]=1;
                                ends[13]=1;
                                tdone[13]=1;
                              }
                              else {
                                if(temp456_thread_13 < 21){//sysj\plant.sysj line: 362, column: 16
                                  System.out.println("");//sysj\plant.sysj line: 363, column: 8
                                  System.out.println("Room temperature is too low at " + temp456_thread_13);//sysj\plant.sysj line: 364, column: 8
                                  heatOnZone4_5_6.setPresent();//sysj\plant.sysj line: 365, column: 8
                                  currsigs.addElement(heatOnZone4_5_6);
                                  S60815=1;
                                  active[13]=1;
                                  ends[13]=1;
                                  tdone[13]=1;
                                }
                                else {
                                  System.out.println("");//sysj\plant.sysj line: 367, column: 7
                                  System.out.println("Room temperature is safe at" + temp456_thread_13);//sysj\plant.sysj line: 368, column: 7
                                  S60815=1;
                                  active[13]=1;
                                  ends[13]=1;
                                  tdone[13]=1;
                                }
                              }
                            }
                            else {
                              S60815=1;
                              active[13]=1;
                              ends[13]=1;
                              tdone[13]=1;
                            }
                          }
                        }
                      }
                    }
                    else {
                      if(zone_thread_13 == 2 || zone_thread_13 == 3){//sysj\plant.sysj line: 338, column: 8
                        temp23_thread_13 = 0;//sysj\plant.sysj line: 339, column: 6
                        temp23_thread_13 = (tempZone2_3.getpreval() == null ? null : ((Integer)tempZone2_3.getpreval()));//sysj\plant.sysj line: 340, column: 6
                        if(temp23_thread_13 > 22){//sysj\plant.sysj line: 341, column: 9
                          System.out.println("");//sysj\plant.sysj line: 342, column: 8
                          System.out.println("Room temperature is too high at " + temp23_thread_13);//sysj\plant.sysj line: 343, column: 8
                          airOnZone2_3.setPresent();//sysj\plant.sysj line: 344, column: 8
                          currsigs.addElement(airOnZone2_3);
                          if(zone_thread_13 == 4 || zone_thread_13 == 5 || zone_thread_13 == 6){//sysj\plant.sysj line: 355, column: 8
                            temp456_thread_13 = 0;//sysj\plant.sysj line: 356, column: 6
                            temp456_thread_13 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\plant.sysj line: 357, column: 6
                            if(temp456_thread_13 > 22){//sysj\plant.sysj line: 358, column: 9
                              System.out.println("");//sysj\plant.sysj line: 359, column: 8
                              System.out.println("Room temperature is too high at " + temp456_thread_13);//sysj\plant.sysj line: 360, column: 8
                              airOnZone4_5_6.setPresent();//sysj\plant.sysj line: 361, column: 8
                              currsigs.addElement(airOnZone4_5_6);
                              S60815=1;
                              active[13]=1;
                              ends[13]=1;
                              tdone[13]=1;
                            }
                            else {
                              if(temp456_thread_13 < 21){//sysj\plant.sysj line: 362, column: 16
                                System.out.println("");//sysj\plant.sysj line: 363, column: 8
                                System.out.println("Room temperature is too low at " + temp456_thread_13);//sysj\plant.sysj line: 364, column: 8
                                heatOnZone4_5_6.setPresent();//sysj\plant.sysj line: 365, column: 8
                                currsigs.addElement(heatOnZone4_5_6);
                                S60815=1;
                                active[13]=1;
                                ends[13]=1;
                                tdone[13]=1;
                              }
                              else {
                                System.out.println("");//sysj\plant.sysj line: 367, column: 7
                                System.out.println("Room temperature is safe at" + temp456_thread_13);//sysj\plant.sysj line: 368, column: 7
                                S60815=1;
                                active[13]=1;
                                ends[13]=1;
                                tdone[13]=1;
                              }
                            }
                          }
                          else {
                            S60815=1;
                            active[13]=1;
                            ends[13]=1;
                            tdone[13]=1;
                          }
                        }
                        else {
                          if(temp23_thread_13 < 21){//sysj\plant.sysj line: 345, column: 16
                            heatOnZone2_3.setPresent();//sysj\plant.sysj line: 346, column: 8
                            currsigs.addElement(heatOnZone2_3);
                            if(zone_thread_13 == 4 || zone_thread_13 == 5 || zone_thread_13 == 6){//sysj\plant.sysj line: 355, column: 8
                              temp456_thread_13 = 0;//sysj\plant.sysj line: 356, column: 6
                              temp456_thread_13 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\plant.sysj line: 357, column: 6
                              if(temp456_thread_13 > 22){//sysj\plant.sysj line: 358, column: 9
                                System.out.println("");//sysj\plant.sysj line: 359, column: 8
                                System.out.println("Room temperature is too high at " + temp456_thread_13);//sysj\plant.sysj line: 360, column: 8
                                airOnZone4_5_6.setPresent();//sysj\plant.sysj line: 361, column: 8
                                currsigs.addElement(airOnZone4_5_6);
                                S60815=1;
                                active[13]=1;
                                ends[13]=1;
                                tdone[13]=1;
                              }
                              else {
                                if(temp456_thread_13 < 21){//sysj\plant.sysj line: 362, column: 16
                                  System.out.println("");//sysj\plant.sysj line: 363, column: 8
                                  System.out.println("Room temperature is too low at " + temp456_thread_13);//sysj\plant.sysj line: 364, column: 8
                                  heatOnZone4_5_6.setPresent();//sysj\plant.sysj line: 365, column: 8
                                  currsigs.addElement(heatOnZone4_5_6);
                                  S60815=1;
                                  active[13]=1;
                                  ends[13]=1;
                                  tdone[13]=1;
                                }
                                else {
                                  System.out.println("");//sysj\plant.sysj line: 367, column: 7
                                  System.out.println("Room temperature is safe at" + temp456_thread_13);//sysj\plant.sysj line: 368, column: 7
                                  S60815=1;
                                  active[13]=1;
                                  ends[13]=1;
                                  tdone[13]=1;
                                }
                              }
                            }
                            else {
                              S60815=1;
                              active[13]=1;
                              ends[13]=1;
                              tdone[13]=1;
                            }
                          }
                          else {
                            System.out.println("");//sysj\plant.sysj line: 348, column: 7
                            System.out.println("Room temperature is safe at" + temp23_thread_13);//sysj\plant.sysj line: 349, column: 7
                            if(zone_thread_13 == 4 || zone_thread_13 == 5 || zone_thread_13 == 6){//sysj\plant.sysj line: 355, column: 8
                              temp456_thread_13 = 0;//sysj\plant.sysj line: 356, column: 6
                              temp456_thread_13 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\plant.sysj line: 357, column: 6
                              if(temp456_thread_13 > 22){//sysj\plant.sysj line: 358, column: 9
                                System.out.println("");//sysj\plant.sysj line: 359, column: 8
                                System.out.println("Room temperature is too high at " + temp456_thread_13);//sysj\plant.sysj line: 360, column: 8
                                airOnZone4_5_6.setPresent();//sysj\plant.sysj line: 361, column: 8
                                currsigs.addElement(airOnZone4_5_6);
                                S60815=1;
                                active[13]=1;
                                ends[13]=1;
                                tdone[13]=1;
                              }
                              else {
                                if(temp456_thread_13 < 21){//sysj\plant.sysj line: 362, column: 16
                                  System.out.println("");//sysj\plant.sysj line: 363, column: 8
                                  System.out.println("Room temperature is too low at " + temp456_thread_13);//sysj\plant.sysj line: 364, column: 8
                                  heatOnZone4_5_6.setPresent();//sysj\plant.sysj line: 365, column: 8
                                  currsigs.addElement(heatOnZone4_5_6);
                                  S60815=1;
                                  active[13]=1;
                                  ends[13]=1;
                                  tdone[13]=1;
                                }
                                else {
                                  System.out.println("");//sysj\plant.sysj line: 367, column: 7
                                  System.out.println("Room temperature is safe at" + temp456_thread_13);//sysj\plant.sysj line: 368, column: 7
                                  S60815=1;
                                  active[13]=1;
                                  ends[13]=1;
                                  tdone[13]=1;
                                }
                              }
                            }
                            else {
                              S60815=1;
                              active[13]=1;
                              ends[13]=1;
                              tdone[13]=1;
                            }
                          }
                        }
                      }
                      else {
                        if(zone_thread_13 == 4 || zone_thread_13 == 5 || zone_thread_13 == 6){//sysj\plant.sysj line: 355, column: 8
                          temp456_thread_13 = 0;//sysj\plant.sysj line: 356, column: 6
                          temp456_thread_13 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\plant.sysj line: 357, column: 6
                          if(temp456_thread_13 > 22){//sysj\plant.sysj line: 358, column: 9
                            System.out.println("");//sysj\plant.sysj line: 359, column: 8
                            System.out.println("Room temperature is too high at " + temp456_thread_13);//sysj\plant.sysj line: 360, column: 8
                            airOnZone4_5_6.setPresent();//sysj\plant.sysj line: 361, column: 8
                            currsigs.addElement(airOnZone4_5_6);
                            S60815=1;
                            active[13]=1;
                            ends[13]=1;
                            tdone[13]=1;
                          }
                          else {
                            if(temp456_thread_13 < 21){//sysj\plant.sysj line: 362, column: 16
                              System.out.println("");//sysj\plant.sysj line: 363, column: 8
                              System.out.println("Room temperature is too low at " + temp456_thread_13);//sysj\plant.sysj line: 364, column: 8
                              heatOnZone4_5_6.setPresent();//sysj\plant.sysj line: 365, column: 8
                              currsigs.addElement(heatOnZone4_5_6);
                              S60815=1;
                              active[13]=1;
                              ends[13]=1;
                              tdone[13]=1;
                            }
                            else {
                              System.out.println("");//sysj\plant.sysj line: 367, column: 7
                              System.out.println("Room temperature is safe at" + temp456_thread_13);//sysj\plant.sysj line: 368, column: 7
                              S60815=1;
                              active[13]=1;
                              ends[13]=1;
                              tdone[13]=1;
                            }
                          }
                        }
                        else {
                          S60815=1;
                          active[13]=1;
                          ends[13]=1;
                          tdone[13]=1;
                        }
                      }
                    }
                  }
                  else {
                    active[13]=1;
                    ends[13]=1;
                    tdone[13]=1;
                  }
                }
                else {
                  active[13]=1;
                  ends[13]=1;
                  tdone[13]=1;
                }
                break;
              
              case 3 : 
                if(com.systemj.Timer.getMs() - __start_thread_13 >= (4) * 1000){//sysj\plant.sysj line: 305, column: 25
                  ends[13]=2;
                  ;//sysj\plant.sysj line: 305, column: 25
                  System.out.println("Alarm off, Fire out");//sysj\plant.sysj line: 314, column: 6
                  if(zone_thread_13 == 1 || zone_thread_13 == 7){//sysj\plant.sysj line: 321, column: 8
                    temp17_thread_13 = 0;//sysj\plant.sysj line: 322, column: 6
                    temp17_thread_13 = (tempZone1_7.getpreval() == null ? null : ((Integer)tempZone1_7.getpreval()));//sysj\plant.sysj line: 323, column: 6
                    if(temp17_thread_13 > 22){//sysj\plant.sysj line: 324, column: 9
                      System.out.println("");//sysj\plant.sysj line: 325, column: 8
                      System.out.println("Room temperature is too high at " + temp17_thread_13);//sysj\plant.sysj line: 326, column: 8
                      fanOnZone1_7.setPresent();//sysj\plant.sysj line: 327, column: 8
                      currsigs.addElement(fanOnZone1_7);
                      if(zone_thread_13 == 2 || zone_thread_13 == 3){//sysj\plant.sysj line: 338, column: 8
                        temp23_thread_13 = 0;//sysj\plant.sysj line: 339, column: 6
                        temp23_thread_13 = (tempZone2_3.getpreval() == null ? null : ((Integer)tempZone2_3.getpreval()));//sysj\plant.sysj line: 340, column: 6
                        if(temp23_thread_13 > 22){//sysj\plant.sysj line: 341, column: 9
                          System.out.println("");//sysj\plant.sysj line: 342, column: 8
                          System.out.println("Room temperature is too high at " + temp23_thread_13);//sysj\plant.sysj line: 343, column: 8
                          airOnZone2_3.setPresent();//sysj\plant.sysj line: 344, column: 8
                          currsigs.addElement(airOnZone2_3);
                          if(zone_thread_13 == 4 || zone_thread_13 == 5 || zone_thread_13 == 6){//sysj\plant.sysj line: 355, column: 8
                            temp456_thread_13 = 0;//sysj\plant.sysj line: 356, column: 6
                            temp456_thread_13 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\plant.sysj line: 357, column: 6
                            if(temp456_thread_13 > 22){//sysj\plant.sysj line: 358, column: 9
                              System.out.println("");//sysj\plant.sysj line: 359, column: 8
                              System.out.println("Room temperature is too high at " + temp456_thread_13);//sysj\plant.sysj line: 360, column: 8
                              airOnZone4_5_6.setPresent();//sysj\plant.sysj line: 361, column: 8
                              currsigs.addElement(airOnZone4_5_6);
                              S60815=1;
                              active[13]=1;
                              ends[13]=1;
                              tdone[13]=1;
                            }
                            else {
                              if(temp456_thread_13 < 21){//sysj\plant.sysj line: 362, column: 16
                                System.out.println("");//sysj\plant.sysj line: 363, column: 8
                                System.out.println("Room temperature is too low at " + temp456_thread_13);//sysj\plant.sysj line: 364, column: 8
                                heatOnZone4_5_6.setPresent();//sysj\plant.sysj line: 365, column: 8
                                currsigs.addElement(heatOnZone4_5_6);
                                S60815=1;
                                active[13]=1;
                                ends[13]=1;
                                tdone[13]=1;
                              }
                              else {
                                System.out.println("");//sysj\plant.sysj line: 367, column: 7
                                System.out.println("Room temperature is safe at" + temp456_thread_13);//sysj\plant.sysj line: 368, column: 7
                                S60815=1;
                                active[13]=1;
                                ends[13]=1;
                                tdone[13]=1;
                              }
                            }
                          }
                          else {
                            S60815=1;
                            active[13]=1;
                            ends[13]=1;
                            tdone[13]=1;
                          }
                        }
                        else {
                          if(temp23_thread_13 < 21){//sysj\plant.sysj line: 345, column: 16
                            heatOnZone2_3.setPresent();//sysj\plant.sysj line: 346, column: 8
                            currsigs.addElement(heatOnZone2_3);
                            if(zone_thread_13 == 4 || zone_thread_13 == 5 || zone_thread_13 == 6){//sysj\plant.sysj line: 355, column: 8
                              temp456_thread_13 = 0;//sysj\plant.sysj line: 356, column: 6
                              temp456_thread_13 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\plant.sysj line: 357, column: 6
                              if(temp456_thread_13 > 22){//sysj\plant.sysj line: 358, column: 9
                                System.out.println("");//sysj\plant.sysj line: 359, column: 8
                                System.out.println("Room temperature is too high at " + temp456_thread_13);//sysj\plant.sysj line: 360, column: 8
                                airOnZone4_5_6.setPresent();//sysj\plant.sysj line: 361, column: 8
                                currsigs.addElement(airOnZone4_5_6);
                                S60815=1;
                                active[13]=1;
                                ends[13]=1;
                                tdone[13]=1;
                              }
                              else {
                                if(temp456_thread_13 < 21){//sysj\plant.sysj line: 362, column: 16
                                  System.out.println("");//sysj\plant.sysj line: 363, column: 8
                                  System.out.println("Room temperature is too low at " + temp456_thread_13);//sysj\plant.sysj line: 364, column: 8
                                  heatOnZone4_5_6.setPresent();//sysj\plant.sysj line: 365, column: 8
                                  currsigs.addElement(heatOnZone4_5_6);
                                  S60815=1;
                                  active[13]=1;
                                  ends[13]=1;
                                  tdone[13]=1;
                                }
                                else {
                                  System.out.println("");//sysj\plant.sysj line: 367, column: 7
                                  System.out.println("Room temperature is safe at" + temp456_thread_13);//sysj\plant.sysj line: 368, column: 7
                                  S60815=1;
                                  active[13]=1;
                                  ends[13]=1;
                                  tdone[13]=1;
                                }
                              }
                            }
                            else {
                              S60815=1;
                              active[13]=1;
                              ends[13]=1;
                              tdone[13]=1;
                            }
                          }
                          else {
                            System.out.println("");//sysj\plant.sysj line: 348, column: 7
                            System.out.println("Room temperature is safe at" + temp23_thread_13);//sysj\plant.sysj line: 349, column: 7
                            if(zone_thread_13 == 4 || zone_thread_13 == 5 || zone_thread_13 == 6){//sysj\plant.sysj line: 355, column: 8
                              temp456_thread_13 = 0;//sysj\plant.sysj line: 356, column: 6
                              temp456_thread_13 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\plant.sysj line: 357, column: 6
                              if(temp456_thread_13 > 22){//sysj\plant.sysj line: 358, column: 9
                                System.out.println("");//sysj\plant.sysj line: 359, column: 8
                                System.out.println("Room temperature is too high at " + temp456_thread_13);//sysj\plant.sysj line: 360, column: 8
                                airOnZone4_5_6.setPresent();//sysj\plant.sysj line: 361, column: 8
                                currsigs.addElement(airOnZone4_5_6);
                                S60815=1;
                                active[13]=1;
                                ends[13]=1;
                                tdone[13]=1;
                              }
                              else {
                                if(temp456_thread_13 < 21){//sysj\plant.sysj line: 362, column: 16
                                  System.out.println("");//sysj\plant.sysj line: 363, column: 8
                                  System.out.println("Room temperature is too low at " + temp456_thread_13);//sysj\plant.sysj line: 364, column: 8
                                  heatOnZone4_5_6.setPresent();//sysj\plant.sysj line: 365, column: 8
                                  currsigs.addElement(heatOnZone4_5_6);
                                  S60815=1;
                                  active[13]=1;
                                  ends[13]=1;
                                  tdone[13]=1;
                                }
                                else {
                                  System.out.println("");//sysj\plant.sysj line: 367, column: 7
                                  System.out.println("Room temperature is safe at" + temp456_thread_13);//sysj\plant.sysj line: 368, column: 7
                                  S60815=1;
                                  active[13]=1;
                                  ends[13]=1;
                                  tdone[13]=1;
                                }
                              }
                            }
                            else {
                              S60815=1;
                              active[13]=1;
                              ends[13]=1;
                              tdone[13]=1;
                            }
                          }
                        }
                      }
                      else {
                        if(zone_thread_13 == 4 || zone_thread_13 == 5 || zone_thread_13 == 6){//sysj\plant.sysj line: 355, column: 8
                          temp456_thread_13 = 0;//sysj\plant.sysj line: 356, column: 6
                          temp456_thread_13 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\plant.sysj line: 357, column: 6
                          if(temp456_thread_13 > 22){//sysj\plant.sysj line: 358, column: 9
                            System.out.println("");//sysj\plant.sysj line: 359, column: 8
                            System.out.println("Room temperature is too high at " + temp456_thread_13);//sysj\plant.sysj line: 360, column: 8
                            airOnZone4_5_6.setPresent();//sysj\plant.sysj line: 361, column: 8
                            currsigs.addElement(airOnZone4_5_6);
                            S60815=1;
                            active[13]=1;
                            ends[13]=1;
                            tdone[13]=1;
                          }
                          else {
                            if(temp456_thread_13 < 21){//sysj\plant.sysj line: 362, column: 16
                              System.out.println("");//sysj\plant.sysj line: 363, column: 8
                              System.out.println("Room temperature is too low at " + temp456_thread_13);//sysj\plant.sysj line: 364, column: 8
                              heatOnZone4_5_6.setPresent();//sysj\plant.sysj line: 365, column: 8
                              currsigs.addElement(heatOnZone4_5_6);
                              S60815=1;
                              active[13]=1;
                              ends[13]=1;
                              tdone[13]=1;
                            }
                            else {
                              System.out.println("");//sysj\plant.sysj line: 367, column: 7
                              System.out.println("Room temperature is safe at" + temp456_thread_13);//sysj\plant.sysj line: 368, column: 7
                              S60815=1;
                              active[13]=1;
                              ends[13]=1;
                              tdone[13]=1;
                            }
                          }
                        }
                        else {
                          S60815=1;
                          active[13]=1;
                          ends[13]=1;
                          tdone[13]=1;
                        }
                      }
                    }
                    else {
                      if(temp17_thread_13 < 21){//sysj\plant.sysj line: 328, column: 16
                        System.out.println("Room temperature is too low at " + temp17_thread_13);//sysj\plant.sysj line: 329, column: 8
                        heatOnZone1_7.setPresent();//sysj\plant.sysj line: 330, column: 8
                        currsigs.addElement(heatOnZone1_7);
                        if(zone_thread_13 == 2 || zone_thread_13 == 3){//sysj\plant.sysj line: 338, column: 8
                          temp23_thread_13 = 0;//sysj\plant.sysj line: 339, column: 6
                          temp23_thread_13 = (tempZone2_3.getpreval() == null ? null : ((Integer)tempZone2_3.getpreval()));//sysj\plant.sysj line: 340, column: 6
                          if(temp23_thread_13 > 22){//sysj\plant.sysj line: 341, column: 9
                            System.out.println("");//sysj\plant.sysj line: 342, column: 8
                            System.out.println("Room temperature is too high at " + temp23_thread_13);//sysj\plant.sysj line: 343, column: 8
                            airOnZone2_3.setPresent();//sysj\plant.sysj line: 344, column: 8
                            currsigs.addElement(airOnZone2_3);
                            if(zone_thread_13 == 4 || zone_thread_13 == 5 || zone_thread_13 == 6){//sysj\plant.sysj line: 355, column: 8
                              temp456_thread_13 = 0;//sysj\plant.sysj line: 356, column: 6
                              temp456_thread_13 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\plant.sysj line: 357, column: 6
                              if(temp456_thread_13 > 22){//sysj\plant.sysj line: 358, column: 9
                                System.out.println("");//sysj\plant.sysj line: 359, column: 8
                                System.out.println("Room temperature is too high at " + temp456_thread_13);//sysj\plant.sysj line: 360, column: 8
                                airOnZone4_5_6.setPresent();//sysj\plant.sysj line: 361, column: 8
                                currsigs.addElement(airOnZone4_5_6);
                                S60815=1;
                                active[13]=1;
                                ends[13]=1;
                                tdone[13]=1;
                              }
                              else {
                                if(temp456_thread_13 < 21){//sysj\plant.sysj line: 362, column: 16
                                  System.out.println("");//sysj\plant.sysj line: 363, column: 8
                                  System.out.println("Room temperature is too low at " + temp456_thread_13);//sysj\plant.sysj line: 364, column: 8
                                  heatOnZone4_5_6.setPresent();//sysj\plant.sysj line: 365, column: 8
                                  currsigs.addElement(heatOnZone4_5_6);
                                  S60815=1;
                                  active[13]=1;
                                  ends[13]=1;
                                  tdone[13]=1;
                                }
                                else {
                                  System.out.println("");//sysj\plant.sysj line: 367, column: 7
                                  System.out.println("Room temperature is safe at" + temp456_thread_13);//sysj\plant.sysj line: 368, column: 7
                                  S60815=1;
                                  active[13]=1;
                                  ends[13]=1;
                                  tdone[13]=1;
                                }
                              }
                            }
                            else {
                              S60815=1;
                              active[13]=1;
                              ends[13]=1;
                              tdone[13]=1;
                            }
                          }
                          else {
                            if(temp23_thread_13 < 21){//sysj\plant.sysj line: 345, column: 16
                              heatOnZone2_3.setPresent();//sysj\plant.sysj line: 346, column: 8
                              currsigs.addElement(heatOnZone2_3);
                              if(zone_thread_13 == 4 || zone_thread_13 == 5 || zone_thread_13 == 6){//sysj\plant.sysj line: 355, column: 8
                                temp456_thread_13 = 0;//sysj\plant.sysj line: 356, column: 6
                                temp456_thread_13 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\plant.sysj line: 357, column: 6
                                if(temp456_thread_13 > 22){//sysj\plant.sysj line: 358, column: 9
                                  System.out.println("");//sysj\plant.sysj line: 359, column: 8
                                  System.out.println("Room temperature is too high at " + temp456_thread_13);//sysj\plant.sysj line: 360, column: 8
                                  airOnZone4_5_6.setPresent();//sysj\plant.sysj line: 361, column: 8
                                  currsigs.addElement(airOnZone4_5_6);
                                  S60815=1;
                                  active[13]=1;
                                  ends[13]=1;
                                  tdone[13]=1;
                                }
                                else {
                                  if(temp456_thread_13 < 21){//sysj\plant.sysj line: 362, column: 16
                                    System.out.println("");//sysj\plant.sysj line: 363, column: 8
                                    System.out.println("Room temperature is too low at " + temp456_thread_13);//sysj\plant.sysj line: 364, column: 8
                                    heatOnZone4_5_6.setPresent();//sysj\plant.sysj line: 365, column: 8
                                    currsigs.addElement(heatOnZone4_5_6);
                                    S60815=1;
                                    active[13]=1;
                                    ends[13]=1;
                                    tdone[13]=1;
                                  }
                                  else {
                                    System.out.println("");//sysj\plant.sysj line: 367, column: 7
                                    System.out.println("Room temperature is safe at" + temp456_thread_13);//sysj\plant.sysj line: 368, column: 7
                                    S60815=1;
                                    active[13]=1;
                                    ends[13]=1;
                                    tdone[13]=1;
                                  }
                                }
                              }
                              else {
                                S60815=1;
                                active[13]=1;
                                ends[13]=1;
                                tdone[13]=1;
                              }
                            }
                            else {
                              System.out.println("");//sysj\plant.sysj line: 348, column: 7
                              System.out.println("Room temperature is safe at" + temp23_thread_13);//sysj\plant.sysj line: 349, column: 7
                              if(zone_thread_13 == 4 || zone_thread_13 == 5 || zone_thread_13 == 6){//sysj\plant.sysj line: 355, column: 8
                                temp456_thread_13 = 0;//sysj\plant.sysj line: 356, column: 6
                                temp456_thread_13 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\plant.sysj line: 357, column: 6
                                if(temp456_thread_13 > 22){//sysj\plant.sysj line: 358, column: 9
                                  System.out.println("");//sysj\plant.sysj line: 359, column: 8
                                  System.out.println("Room temperature is too high at " + temp456_thread_13);//sysj\plant.sysj line: 360, column: 8
                                  airOnZone4_5_6.setPresent();//sysj\plant.sysj line: 361, column: 8
                                  currsigs.addElement(airOnZone4_5_6);
                                  S60815=1;
                                  active[13]=1;
                                  ends[13]=1;
                                  tdone[13]=1;
                                }
                                else {
                                  if(temp456_thread_13 < 21){//sysj\plant.sysj line: 362, column: 16
                                    System.out.println("");//sysj\plant.sysj line: 363, column: 8
                                    System.out.println("Room temperature is too low at " + temp456_thread_13);//sysj\plant.sysj line: 364, column: 8
                                    heatOnZone4_5_6.setPresent();//sysj\plant.sysj line: 365, column: 8
                                    currsigs.addElement(heatOnZone4_5_6);
                                    S60815=1;
                                    active[13]=1;
                                    ends[13]=1;
                                    tdone[13]=1;
                                  }
                                  else {
                                    System.out.println("");//sysj\plant.sysj line: 367, column: 7
                                    System.out.println("Room temperature is safe at" + temp456_thread_13);//sysj\plant.sysj line: 368, column: 7
                                    S60815=1;
                                    active[13]=1;
                                    ends[13]=1;
                                    tdone[13]=1;
                                  }
                                }
                              }
                              else {
                                S60815=1;
                                active[13]=1;
                                ends[13]=1;
                                tdone[13]=1;
                              }
                            }
                          }
                        }
                        else {
                          if(zone_thread_13 == 4 || zone_thread_13 == 5 || zone_thread_13 == 6){//sysj\plant.sysj line: 355, column: 8
                            temp456_thread_13 = 0;//sysj\plant.sysj line: 356, column: 6
                            temp456_thread_13 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\plant.sysj line: 357, column: 6
                            if(temp456_thread_13 > 22){//sysj\plant.sysj line: 358, column: 9
                              System.out.println("");//sysj\plant.sysj line: 359, column: 8
                              System.out.println("Room temperature is too high at " + temp456_thread_13);//sysj\plant.sysj line: 360, column: 8
                              airOnZone4_5_6.setPresent();//sysj\plant.sysj line: 361, column: 8
                              currsigs.addElement(airOnZone4_5_6);
                              S60815=1;
                              active[13]=1;
                              ends[13]=1;
                              tdone[13]=1;
                            }
                            else {
                              if(temp456_thread_13 < 21){//sysj\plant.sysj line: 362, column: 16
                                System.out.println("");//sysj\plant.sysj line: 363, column: 8
                                System.out.println("Room temperature is too low at " + temp456_thread_13);//sysj\plant.sysj line: 364, column: 8
                                heatOnZone4_5_6.setPresent();//sysj\plant.sysj line: 365, column: 8
                                currsigs.addElement(heatOnZone4_5_6);
                                S60815=1;
                                active[13]=1;
                                ends[13]=1;
                                tdone[13]=1;
                              }
                              else {
                                System.out.println("");//sysj\plant.sysj line: 367, column: 7
                                System.out.println("Room temperature is safe at" + temp456_thread_13);//sysj\plant.sysj line: 368, column: 7
                                S60815=1;
                                active[13]=1;
                                ends[13]=1;
                                tdone[13]=1;
                              }
                            }
                          }
                          else {
                            S60815=1;
                            active[13]=1;
                            ends[13]=1;
                            tdone[13]=1;
                          }
                        }
                      }
                      else {
                        System.out.println("");//sysj\plant.sysj line: 332, column: 7
                        System.out.println("Room temperature is safe at" + temp17_thread_13);//sysj\plant.sysj line: 333, column: 7
                        if(zone_thread_13 == 2 || zone_thread_13 == 3){//sysj\plant.sysj line: 338, column: 8
                          temp23_thread_13 = 0;//sysj\plant.sysj line: 339, column: 6
                          temp23_thread_13 = (tempZone2_3.getpreval() == null ? null : ((Integer)tempZone2_3.getpreval()));//sysj\plant.sysj line: 340, column: 6
                          if(temp23_thread_13 > 22){//sysj\plant.sysj line: 341, column: 9
                            System.out.println("");//sysj\plant.sysj line: 342, column: 8
                            System.out.println("Room temperature is too high at " + temp23_thread_13);//sysj\plant.sysj line: 343, column: 8
                            airOnZone2_3.setPresent();//sysj\plant.sysj line: 344, column: 8
                            currsigs.addElement(airOnZone2_3);
                            if(zone_thread_13 == 4 || zone_thread_13 == 5 || zone_thread_13 == 6){//sysj\plant.sysj line: 355, column: 8
                              temp456_thread_13 = 0;//sysj\plant.sysj line: 356, column: 6
                              temp456_thread_13 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\plant.sysj line: 357, column: 6
                              if(temp456_thread_13 > 22){//sysj\plant.sysj line: 358, column: 9
                                System.out.println("");//sysj\plant.sysj line: 359, column: 8
                                System.out.println("Room temperature is too high at " + temp456_thread_13);//sysj\plant.sysj line: 360, column: 8
                                airOnZone4_5_6.setPresent();//sysj\plant.sysj line: 361, column: 8
                                currsigs.addElement(airOnZone4_5_6);
                                S60815=1;
                                active[13]=1;
                                ends[13]=1;
                                tdone[13]=1;
                              }
                              else {
                                if(temp456_thread_13 < 21){//sysj\plant.sysj line: 362, column: 16
                                  System.out.println("");//sysj\plant.sysj line: 363, column: 8
                                  System.out.println("Room temperature is too low at " + temp456_thread_13);//sysj\plant.sysj line: 364, column: 8
                                  heatOnZone4_5_6.setPresent();//sysj\plant.sysj line: 365, column: 8
                                  currsigs.addElement(heatOnZone4_5_6);
                                  S60815=1;
                                  active[13]=1;
                                  ends[13]=1;
                                  tdone[13]=1;
                                }
                                else {
                                  System.out.println("");//sysj\plant.sysj line: 367, column: 7
                                  System.out.println("Room temperature is safe at" + temp456_thread_13);//sysj\plant.sysj line: 368, column: 7
                                  S60815=1;
                                  active[13]=1;
                                  ends[13]=1;
                                  tdone[13]=1;
                                }
                              }
                            }
                            else {
                              S60815=1;
                              active[13]=1;
                              ends[13]=1;
                              tdone[13]=1;
                            }
                          }
                          else {
                            if(temp23_thread_13 < 21){//sysj\plant.sysj line: 345, column: 16
                              heatOnZone2_3.setPresent();//sysj\plant.sysj line: 346, column: 8
                              currsigs.addElement(heatOnZone2_3);
                              if(zone_thread_13 == 4 || zone_thread_13 == 5 || zone_thread_13 == 6){//sysj\plant.sysj line: 355, column: 8
                                temp456_thread_13 = 0;//sysj\plant.sysj line: 356, column: 6
                                temp456_thread_13 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\plant.sysj line: 357, column: 6
                                if(temp456_thread_13 > 22){//sysj\plant.sysj line: 358, column: 9
                                  System.out.println("");//sysj\plant.sysj line: 359, column: 8
                                  System.out.println("Room temperature is too high at " + temp456_thread_13);//sysj\plant.sysj line: 360, column: 8
                                  airOnZone4_5_6.setPresent();//sysj\plant.sysj line: 361, column: 8
                                  currsigs.addElement(airOnZone4_5_6);
                                  S60815=1;
                                  active[13]=1;
                                  ends[13]=1;
                                  tdone[13]=1;
                                }
                                else {
                                  if(temp456_thread_13 < 21){//sysj\plant.sysj line: 362, column: 16
                                    System.out.println("");//sysj\plant.sysj line: 363, column: 8
                                    System.out.println("Room temperature is too low at " + temp456_thread_13);//sysj\plant.sysj line: 364, column: 8
                                    heatOnZone4_5_6.setPresent();//sysj\plant.sysj line: 365, column: 8
                                    currsigs.addElement(heatOnZone4_5_6);
                                    S60815=1;
                                    active[13]=1;
                                    ends[13]=1;
                                    tdone[13]=1;
                                  }
                                  else {
                                    System.out.println("");//sysj\plant.sysj line: 367, column: 7
                                    System.out.println("Room temperature is safe at" + temp456_thread_13);//sysj\plant.sysj line: 368, column: 7
                                    S60815=1;
                                    active[13]=1;
                                    ends[13]=1;
                                    tdone[13]=1;
                                  }
                                }
                              }
                              else {
                                S60815=1;
                                active[13]=1;
                                ends[13]=1;
                                tdone[13]=1;
                              }
                            }
                            else {
                              System.out.println("");//sysj\plant.sysj line: 348, column: 7
                              System.out.println("Room temperature is safe at" + temp23_thread_13);//sysj\plant.sysj line: 349, column: 7
                              if(zone_thread_13 == 4 || zone_thread_13 == 5 || zone_thread_13 == 6){//sysj\plant.sysj line: 355, column: 8
                                temp456_thread_13 = 0;//sysj\plant.sysj line: 356, column: 6
                                temp456_thread_13 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\plant.sysj line: 357, column: 6
                                if(temp456_thread_13 > 22){//sysj\plant.sysj line: 358, column: 9
                                  System.out.println("");//sysj\plant.sysj line: 359, column: 8
                                  System.out.println("Room temperature is too high at " + temp456_thread_13);//sysj\plant.sysj line: 360, column: 8
                                  airOnZone4_5_6.setPresent();//sysj\plant.sysj line: 361, column: 8
                                  currsigs.addElement(airOnZone4_5_6);
                                  S60815=1;
                                  active[13]=1;
                                  ends[13]=1;
                                  tdone[13]=1;
                                }
                                else {
                                  if(temp456_thread_13 < 21){//sysj\plant.sysj line: 362, column: 16
                                    System.out.println("");//sysj\plant.sysj line: 363, column: 8
                                    System.out.println("Room temperature is too low at " + temp456_thread_13);//sysj\plant.sysj line: 364, column: 8
                                    heatOnZone4_5_6.setPresent();//sysj\plant.sysj line: 365, column: 8
                                    currsigs.addElement(heatOnZone4_5_6);
                                    S60815=1;
                                    active[13]=1;
                                    ends[13]=1;
                                    tdone[13]=1;
                                  }
                                  else {
                                    System.out.println("");//sysj\plant.sysj line: 367, column: 7
                                    System.out.println("Room temperature is safe at" + temp456_thread_13);//sysj\plant.sysj line: 368, column: 7
                                    S60815=1;
                                    active[13]=1;
                                    ends[13]=1;
                                    tdone[13]=1;
                                  }
                                }
                              }
                              else {
                                S60815=1;
                                active[13]=1;
                                ends[13]=1;
                                tdone[13]=1;
                              }
                            }
                          }
                        }
                        else {
                          if(zone_thread_13 == 4 || zone_thread_13 == 5 || zone_thread_13 == 6){//sysj\plant.sysj line: 355, column: 8
                            temp456_thread_13 = 0;//sysj\plant.sysj line: 356, column: 6
                            temp456_thread_13 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\plant.sysj line: 357, column: 6
                            if(temp456_thread_13 > 22){//sysj\plant.sysj line: 358, column: 9
                              System.out.println("");//sysj\plant.sysj line: 359, column: 8
                              System.out.println("Room temperature is too high at " + temp456_thread_13);//sysj\plant.sysj line: 360, column: 8
                              airOnZone4_5_6.setPresent();//sysj\plant.sysj line: 361, column: 8
                              currsigs.addElement(airOnZone4_5_6);
                              S60815=1;
                              active[13]=1;
                              ends[13]=1;
                              tdone[13]=1;
                            }
                            else {
                              if(temp456_thread_13 < 21){//sysj\plant.sysj line: 362, column: 16
                                System.out.println("");//sysj\plant.sysj line: 363, column: 8
                                System.out.println("Room temperature is too low at " + temp456_thread_13);//sysj\plant.sysj line: 364, column: 8
                                heatOnZone4_5_6.setPresent();//sysj\plant.sysj line: 365, column: 8
                                currsigs.addElement(heatOnZone4_5_6);
                                S60815=1;
                                active[13]=1;
                                ends[13]=1;
                                tdone[13]=1;
                              }
                              else {
                                System.out.println("");//sysj\plant.sysj line: 367, column: 7
                                System.out.println("Room temperature is safe at" + temp456_thread_13);//sysj\plant.sysj line: 368, column: 7
                                S60815=1;
                                active[13]=1;
                                ends[13]=1;
                                tdone[13]=1;
                              }
                            }
                          }
                          else {
                            S60815=1;
                            active[13]=1;
                            ends[13]=1;
                            tdone[13]=1;
                          }
                        }
                      }
                    }
                  }
                  else {
                    if(zone_thread_13 == 2 || zone_thread_13 == 3){//sysj\plant.sysj line: 338, column: 8
                      temp23_thread_13 = 0;//sysj\plant.sysj line: 339, column: 6
                      temp23_thread_13 = (tempZone2_3.getpreval() == null ? null : ((Integer)tempZone2_3.getpreval()));//sysj\plant.sysj line: 340, column: 6
                      if(temp23_thread_13 > 22){//sysj\plant.sysj line: 341, column: 9
                        System.out.println("");//sysj\plant.sysj line: 342, column: 8
                        System.out.println("Room temperature is too high at " + temp23_thread_13);//sysj\plant.sysj line: 343, column: 8
                        airOnZone2_3.setPresent();//sysj\plant.sysj line: 344, column: 8
                        currsigs.addElement(airOnZone2_3);
                        if(zone_thread_13 == 4 || zone_thread_13 == 5 || zone_thread_13 == 6){//sysj\plant.sysj line: 355, column: 8
                          temp456_thread_13 = 0;//sysj\plant.sysj line: 356, column: 6
                          temp456_thread_13 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\plant.sysj line: 357, column: 6
                          if(temp456_thread_13 > 22){//sysj\plant.sysj line: 358, column: 9
                            System.out.println("");//sysj\plant.sysj line: 359, column: 8
                            System.out.println("Room temperature is too high at " + temp456_thread_13);//sysj\plant.sysj line: 360, column: 8
                            airOnZone4_5_6.setPresent();//sysj\plant.sysj line: 361, column: 8
                            currsigs.addElement(airOnZone4_5_6);
                            S60815=1;
                            active[13]=1;
                            ends[13]=1;
                            tdone[13]=1;
                          }
                          else {
                            if(temp456_thread_13 < 21){//sysj\plant.sysj line: 362, column: 16
                              System.out.println("");//sysj\plant.sysj line: 363, column: 8
                              System.out.println("Room temperature is too low at " + temp456_thread_13);//sysj\plant.sysj line: 364, column: 8
                              heatOnZone4_5_6.setPresent();//sysj\plant.sysj line: 365, column: 8
                              currsigs.addElement(heatOnZone4_5_6);
                              S60815=1;
                              active[13]=1;
                              ends[13]=1;
                              tdone[13]=1;
                            }
                            else {
                              System.out.println("");//sysj\plant.sysj line: 367, column: 7
                              System.out.println("Room temperature is safe at" + temp456_thread_13);//sysj\plant.sysj line: 368, column: 7
                              S60815=1;
                              active[13]=1;
                              ends[13]=1;
                              tdone[13]=1;
                            }
                          }
                        }
                        else {
                          S60815=1;
                          active[13]=1;
                          ends[13]=1;
                          tdone[13]=1;
                        }
                      }
                      else {
                        if(temp23_thread_13 < 21){//sysj\plant.sysj line: 345, column: 16
                          heatOnZone2_3.setPresent();//sysj\plant.sysj line: 346, column: 8
                          currsigs.addElement(heatOnZone2_3);
                          if(zone_thread_13 == 4 || zone_thread_13 == 5 || zone_thread_13 == 6){//sysj\plant.sysj line: 355, column: 8
                            temp456_thread_13 = 0;//sysj\plant.sysj line: 356, column: 6
                            temp456_thread_13 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\plant.sysj line: 357, column: 6
                            if(temp456_thread_13 > 22){//sysj\plant.sysj line: 358, column: 9
                              System.out.println("");//sysj\plant.sysj line: 359, column: 8
                              System.out.println("Room temperature is too high at " + temp456_thread_13);//sysj\plant.sysj line: 360, column: 8
                              airOnZone4_5_6.setPresent();//sysj\plant.sysj line: 361, column: 8
                              currsigs.addElement(airOnZone4_5_6);
                              S60815=1;
                              active[13]=1;
                              ends[13]=1;
                              tdone[13]=1;
                            }
                            else {
                              if(temp456_thread_13 < 21){//sysj\plant.sysj line: 362, column: 16
                                System.out.println("");//sysj\plant.sysj line: 363, column: 8
                                System.out.println("Room temperature is too low at " + temp456_thread_13);//sysj\plant.sysj line: 364, column: 8
                                heatOnZone4_5_6.setPresent();//sysj\plant.sysj line: 365, column: 8
                                currsigs.addElement(heatOnZone4_5_6);
                                S60815=1;
                                active[13]=1;
                                ends[13]=1;
                                tdone[13]=1;
                              }
                              else {
                                System.out.println("");//sysj\plant.sysj line: 367, column: 7
                                System.out.println("Room temperature is safe at" + temp456_thread_13);//sysj\plant.sysj line: 368, column: 7
                                S60815=1;
                                active[13]=1;
                                ends[13]=1;
                                tdone[13]=1;
                              }
                            }
                          }
                          else {
                            S60815=1;
                            active[13]=1;
                            ends[13]=1;
                            tdone[13]=1;
                          }
                        }
                        else {
                          System.out.println("");//sysj\plant.sysj line: 348, column: 7
                          System.out.println("Room temperature is safe at" + temp23_thread_13);//sysj\plant.sysj line: 349, column: 7
                          if(zone_thread_13 == 4 || zone_thread_13 == 5 || zone_thread_13 == 6){//sysj\plant.sysj line: 355, column: 8
                            temp456_thread_13 = 0;//sysj\plant.sysj line: 356, column: 6
                            temp456_thread_13 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\plant.sysj line: 357, column: 6
                            if(temp456_thread_13 > 22){//sysj\plant.sysj line: 358, column: 9
                              System.out.println("");//sysj\plant.sysj line: 359, column: 8
                              System.out.println("Room temperature is too high at " + temp456_thread_13);//sysj\plant.sysj line: 360, column: 8
                              airOnZone4_5_6.setPresent();//sysj\plant.sysj line: 361, column: 8
                              currsigs.addElement(airOnZone4_5_6);
                              S60815=1;
                              active[13]=1;
                              ends[13]=1;
                              tdone[13]=1;
                            }
                            else {
                              if(temp456_thread_13 < 21){//sysj\plant.sysj line: 362, column: 16
                                System.out.println("");//sysj\plant.sysj line: 363, column: 8
                                System.out.println("Room temperature is too low at " + temp456_thread_13);//sysj\plant.sysj line: 364, column: 8
                                heatOnZone4_5_6.setPresent();//sysj\plant.sysj line: 365, column: 8
                                currsigs.addElement(heatOnZone4_5_6);
                                S60815=1;
                                active[13]=1;
                                ends[13]=1;
                                tdone[13]=1;
                              }
                              else {
                                System.out.println("");//sysj\plant.sysj line: 367, column: 7
                                System.out.println("Room temperature is safe at" + temp456_thread_13);//sysj\plant.sysj line: 368, column: 7
                                S60815=1;
                                active[13]=1;
                                ends[13]=1;
                                tdone[13]=1;
                              }
                            }
                          }
                          else {
                            S60815=1;
                            active[13]=1;
                            ends[13]=1;
                            tdone[13]=1;
                          }
                        }
                      }
                    }
                    else {
                      if(zone_thread_13 == 4 || zone_thread_13 == 5 || zone_thread_13 == 6){//sysj\plant.sysj line: 355, column: 8
                        temp456_thread_13 = 0;//sysj\plant.sysj line: 356, column: 6
                        temp456_thread_13 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\plant.sysj line: 357, column: 6
                        if(temp456_thread_13 > 22){//sysj\plant.sysj line: 358, column: 9
                          System.out.println("");//sysj\plant.sysj line: 359, column: 8
                          System.out.println("Room temperature is too high at " + temp456_thread_13);//sysj\plant.sysj line: 360, column: 8
                          airOnZone4_5_6.setPresent();//sysj\plant.sysj line: 361, column: 8
                          currsigs.addElement(airOnZone4_5_6);
                          S60815=1;
                          active[13]=1;
                          ends[13]=1;
                          tdone[13]=1;
                        }
                        else {
                          if(temp456_thread_13 < 21){//sysj\plant.sysj line: 362, column: 16
                            System.out.println("");//sysj\plant.sysj line: 363, column: 8
                            System.out.println("Room temperature is too low at " + temp456_thread_13);//sysj\plant.sysj line: 364, column: 8
                            heatOnZone4_5_6.setPresent();//sysj\plant.sysj line: 365, column: 8
                            currsigs.addElement(heatOnZone4_5_6);
                            S60815=1;
                            active[13]=1;
                            ends[13]=1;
                            tdone[13]=1;
                          }
                          else {
                            System.out.println("");//sysj\plant.sysj line: 367, column: 7
                            System.out.println("Room temperature is safe at" + temp456_thread_13);//sysj\plant.sysj line: 368, column: 7
                            S60815=1;
                            active[13]=1;
                            ends[13]=1;
                            tdone[13]=1;
                          }
                        }
                      }
                      else {
                        S60815=1;
                        active[13]=1;
                        ends[13]=1;
                        tdone[13]=1;
                      }
                    }
                  }
                }
                else {
                  active[13]=1;
                  ends[13]=1;
                  tdone[13]=1;
                }
                break;
              
            }
            break;
          
          case 1 : 
            S60815=1;
            S60815=0;
            if(run.getprestatus()){//sysj\plant.sysj line: 282, column: 12
              zone_thread_13 = 0;//sysj\plant.sysj line: 285, column: 5
              zone_thread_13 = (selectedZone.getpreval() == null ? null : ((Integer)selectedZone.getpreval()));//sysj\plant.sysj line: 286, column: 5
              System.out.println("");//sysj\plant.sysj line: 288, column: 5
              System.out.println("Plant knows zone selected is: " + zone_thread_13);//sysj\plant.sysj line: 289, column: 5
              firePresent_thread_13 = 0;//sysj\plant.sysj line: 292, column: 5
              firePresent_thread_13 = (fire.getpreval() == null ? null : ((Integer)fire.getpreval()));//sysj\plant.sysj line: 293, column: 5
              lightIntensity_thread_13 = 0;//sysj\plant.sysj line: 296, column: 5
              lightIntensity_thread_13 = (lightInt.getpreval() == null ? null : ((Integer)lightInt.getpreval()));//sysj\plant.sysj line: 297, column: 5
              clock_thread_13 = "";//sysj\plant.sysj line: 300, column: 5
              clock_thread_13 = (time.getpreval() == null ? null : ((String)time.getpreval()));//sysj\plant.sysj line: 301, column: 5
              if(firePresent_thread_13 == 1){//sysj\plant.sysj line: 305, column: 8
                System.out.println("THERE IS A FIRE IN ZONE " + zone_thread_13 + " SEND EVACUATION SIGNAL TO ACS");//sysj\plant.sysj line: 306, column: 6
                cutPow.setPresent();//sysj\plant.sysj line: 307, column: 6
                currsigs.addElement(cutPow);
                S59676=0;
                active[13]=1;
                ends[13]=1;
                tdone[13]=1;
              }
              else {
                if(zone_thread_13 == 1 || zone_thread_13 == 7){//sysj\plant.sysj line: 321, column: 8
                  temp17_thread_13 = 0;//sysj\plant.sysj line: 322, column: 6
                  temp17_thread_13 = (tempZone1_7.getpreval() == null ? null : ((Integer)tempZone1_7.getpreval()));//sysj\plant.sysj line: 323, column: 6
                  if(temp17_thread_13 > 22){//sysj\plant.sysj line: 324, column: 9
                    System.out.println("");//sysj\plant.sysj line: 325, column: 8
                    System.out.println("Room temperature is too high at " + temp17_thread_13);//sysj\plant.sysj line: 326, column: 8
                    fanOnZone1_7.setPresent();//sysj\plant.sysj line: 327, column: 8
                    currsigs.addElement(fanOnZone1_7);
                    if(zone_thread_13 == 2 || zone_thread_13 == 3){//sysj\plant.sysj line: 338, column: 8
                      temp23_thread_13 = 0;//sysj\plant.sysj line: 339, column: 6
                      temp23_thread_13 = (tempZone2_3.getpreval() == null ? null : ((Integer)tempZone2_3.getpreval()));//sysj\plant.sysj line: 340, column: 6
                      if(temp23_thread_13 > 22){//sysj\plant.sysj line: 341, column: 9
                        System.out.println("");//sysj\plant.sysj line: 342, column: 8
                        System.out.println("Room temperature is too high at " + temp23_thread_13);//sysj\plant.sysj line: 343, column: 8
                        airOnZone2_3.setPresent();//sysj\plant.sysj line: 344, column: 8
                        currsigs.addElement(airOnZone2_3);
                        if(zone_thread_13 == 4 || zone_thread_13 == 5 || zone_thread_13 == 6){//sysj\plant.sysj line: 355, column: 8
                          temp456_thread_13 = 0;//sysj\plant.sysj line: 356, column: 6
                          temp456_thread_13 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\plant.sysj line: 357, column: 6
                          if(temp456_thread_13 > 22){//sysj\plant.sysj line: 358, column: 9
                            System.out.println("");//sysj\plant.sysj line: 359, column: 8
                            System.out.println("Room temperature is too high at " + temp456_thread_13);//sysj\plant.sysj line: 360, column: 8
                            airOnZone4_5_6.setPresent();//sysj\plant.sysj line: 361, column: 8
                            currsigs.addElement(airOnZone4_5_6);
                            S60815=1;
                            active[13]=1;
                            ends[13]=1;
                            tdone[13]=1;
                          }
                          else {
                            if(temp456_thread_13 < 21){//sysj\plant.sysj line: 362, column: 16
                              System.out.println("");//sysj\plant.sysj line: 363, column: 8
                              System.out.println("Room temperature is too low at " + temp456_thread_13);//sysj\plant.sysj line: 364, column: 8
                              heatOnZone4_5_6.setPresent();//sysj\plant.sysj line: 365, column: 8
                              currsigs.addElement(heatOnZone4_5_6);
                              S60815=1;
                              active[13]=1;
                              ends[13]=1;
                              tdone[13]=1;
                            }
                            else {
                              System.out.println("");//sysj\plant.sysj line: 367, column: 7
                              System.out.println("Room temperature is safe at" + temp456_thread_13);//sysj\plant.sysj line: 368, column: 7
                              S60815=1;
                              active[13]=1;
                              ends[13]=1;
                              tdone[13]=1;
                            }
                          }
                        }
                        else {
                          S60815=1;
                          active[13]=1;
                          ends[13]=1;
                          tdone[13]=1;
                        }
                      }
                      else {
                        if(temp23_thread_13 < 21){//sysj\plant.sysj line: 345, column: 16
                          heatOnZone2_3.setPresent();//sysj\plant.sysj line: 346, column: 8
                          currsigs.addElement(heatOnZone2_3);
                          if(zone_thread_13 == 4 || zone_thread_13 == 5 || zone_thread_13 == 6){//sysj\plant.sysj line: 355, column: 8
                            temp456_thread_13 = 0;//sysj\plant.sysj line: 356, column: 6
                            temp456_thread_13 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\plant.sysj line: 357, column: 6
                            if(temp456_thread_13 > 22){//sysj\plant.sysj line: 358, column: 9
                              System.out.println("");//sysj\plant.sysj line: 359, column: 8
                              System.out.println("Room temperature is too high at " + temp456_thread_13);//sysj\plant.sysj line: 360, column: 8
                              airOnZone4_5_6.setPresent();//sysj\plant.sysj line: 361, column: 8
                              currsigs.addElement(airOnZone4_5_6);
                              S60815=1;
                              active[13]=1;
                              ends[13]=1;
                              tdone[13]=1;
                            }
                            else {
                              if(temp456_thread_13 < 21){//sysj\plant.sysj line: 362, column: 16
                                System.out.println("");//sysj\plant.sysj line: 363, column: 8
                                System.out.println("Room temperature is too low at " + temp456_thread_13);//sysj\plant.sysj line: 364, column: 8
                                heatOnZone4_5_6.setPresent();//sysj\plant.sysj line: 365, column: 8
                                currsigs.addElement(heatOnZone4_5_6);
                                S60815=1;
                                active[13]=1;
                                ends[13]=1;
                                tdone[13]=1;
                              }
                              else {
                                System.out.println("");//sysj\plant.sysj line: 367, column: 7
                                System.out.println("Room temperature is safe at" + temp456_thread_13);//sysj\plant.sysj line: 368, column: 7
                                S60815=1;
                                active[13]=1;
                                ends[13]=1;
                                tdone[13]=1;
                              }
                            }
                          }
                          else {
                            S60815=1;
                            active[13]=1;
                            ends[13]=1;
                            tdone[13]=1;
                          }
                        }
                        else {
                          System.out.println("");//sysj\plant.sysj line: 348, column: 7
                          System.out.println("Room temperature is safe at" + temp23_thread_13);//sysj\plant.sysj line: 349, column: 7
                          if(zone_thread_13 == 4 || zone_thread_13 == 5 || zone_thread_13 == 6){//sysj\plant.sysj line: 355, column: 8
                            temp456_thread_13 = 0;//sysj\plant.sysj line: 356, column: 6
                            temp456_thread_13 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\plant.sysj line: 357, column: 6
                            if(temp456_thread_13 > 22){//sysj\plant.sysj line: 358, column: 9
                              System.out.println("");//sysj\plant.sysj line: 359, column: 8
                              System.out.println("Room temperature is too high at " + temp456_thread_13);//sysj\plant.sysj line: 360, column: 8
                              airOnZone4_5_6.setPresent();//sysj\plant.sysj line: 361, column: 8
                              currsigs.addElement(airOnZone4_5_6);
                              S60815=1;
                              active[13]=1;
                              ends[13]=1;
                              tdone[13]=1;
                            }
                            else {
                              if(temp456_thread_13 < 21){//sysj\plant.sysj line: 362, column: 16
                                System.out.println("");//sysj\plant.sysj line: 363, column: 8
                                System.out.println("Room temperature is too low at " + temp456_thread_13);//sysj\plant.sysj line: 364, column: 8
                                heatOnZone4_5_6.setPresent();//sysj\plant.sysj line: 365, column: 8
                                currsigs.addElement(heatOnZone4_5_6);
                                S60815=1;
                                active[13]=1;
                                ends[13]=1;
                                tdone[13]=1;
                              }
                              else {
                                System.out.println("");//sysj\plant.sysj line: 367, column: 7
                                System.out.println("Room temperature is safe at" + temp456_thread_13);//sysj\plant.sysj line: 368, column: 7
                                S60815=1;
                                active[13]=1;
                                ends[13]=1;
                                tdone[13]=1;
                              }
                            }
                          }
                          else {
                            S60815=1;
                            active[13]=1;
                            ends[13]=1;
                            tdone[13]=1;
                          }
                        }
                      }
                    }
                    else {
                      if(zone_thread_13 == 4 || zone_thread_13 == 5 || zone_thread_13 == 6){//sysj\plant.sysj line: 355, column: 8
                        temp456_thread_13 = 0;//sysj\plant.sysj line: 356, column: 6
                        temp456_thread_13 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\plant.sysj line: 357, column: 6
                        if(temp456_thread_13 > 22){//sysj\plant.sysj line: 358, column: 9
                          System.out.println("");//sysj\plant.sysj line: 359, column: 8
                          System.out.println("Room temperature is too high at " + temp456_thread_13);//sysj\plant.sysj line: 360, column: 8
                          airOnZone4_5_6.setPresent();//sysj\plant.sysj line: 361, column: 8
                          currsigs.addElement(airOnZone4_5_6);
                          S60815=1;
                          active[13]=1;
                          ends[13]=1;
                          tdone[13]=1;
                        }
                        else {
                          if(temp456_thread_13 < 21){//sysj\plant.sysj line: 362, column: 16
                            System.out.println("");//sysj\plant.sysj line: 363, column: 8
                            System.out.println("Room temperature is too low at " + temp456_thread_13);//sysj\plant.sysj line: 364, column: 8
                            heatOnZone4_5_6.setPresent();//sysj\plant.sysj line: 365, column: 8
                            currsigs.addElement(heatOnZone4_5_6);
                            S60815=1;
                            active[13]=1;
                            ends[13]=1;
                            tdone[13]=1;
                          }
                          else {
                            System.out.println("");//sysj\plant.sysj line: 367, column: 7
                            System.out.println("Room temperature is safe at" + temp456_thread_13);//sysj\plant.sysj line: 368, column: 7
                            S60815=1;
                            active[13]=1;
                            ends[13]=1;
                            tdone[13]=1;
                          }
                        }
                      }
                      else {
                        S60815=1;
                        active[13]=1;
                        ends[13]=1;
                        tdone[13]=1;
                      }
                    }
                  }
                  else {
                    if(temp17_thread_13 < 21){//sysj\plant.sysj line: 328, column: 16
                      System.out.println("Room temperature is too low at " + temp17_thread_13);//sysj\plant.sysj line: 329, column: 8
                      heatOnZone1_7.setPresent();//sysj\plant.sysj line: 330, column: 8
                      currsigs.addElement(heatOnZone1_7);
                      if(zone_thread_13 == 2 || zone_thread_13 == 3){//sysj\plant.sysj line: 338, column: 8
                        temp23_thread_13 = 0;//sysj\plant.sysj line: 339, column: 6
                        temp23_thread_13 = (tempZone2_3.getpreval() == null ? null : ((Integer)tempZone2_3.getpreval()));//sysj\plant.sysj line: 340, column: 6
                        if(temp23_thread_13 > 22){//sysj\plant.sysj line: 341, column: 9
                          System.out.println("");//sysj\plant.sysj line: 342, column: 8
                          System.out.println("Room temperature is too high at " + temp23_thread_13);//sysj\plant.sysj line: 343, column: 8
                          airOnZone2_3.setPresent();//sysj\plant.sysj line: 344, column: 8
                          currsigs.addElement(airOnZone2_3);
                          if(zone_thread_13 == 4 || zone_thread_13 == 5 || zone_thread_13 == 6){//sysj\plant.sysj line: 355, column: 8
                            temp456_thread_13 = 0;//sysj\plant.sysj line: 356, column: 6
                            temp456_thread_13 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\plant.sysj line: 357, column: 6
                            if(temp456_thread_13 > 22){//sysj\plant.sysj line: 358, column: 9
                              System.out.println("");//sysj\plant.sysj line: 359, column: 8
                              System.out.println("Room temperature is too high at " + temp456_thread_13);//sysj\plant.sysj line: 360, column: 8
                              airOnZone4_5_6.setPresent();//sysj\plant.sysj line: 361, column: 8
                              currsigs.addElement(airOnZone4_5_6);
                              S60815=1;
                              active[13]=1;
                              ends[13]=1;
                              tdone[13]=1;
                            }
                            else {
                              if(temp456_thread_13 < 21){//sysj\plant.sysj line: 362, column: 16
                                System.out.println("");//sysj\plant.sysj line: 363, column: 8
                                System.out.println("Room temperature is too low at " + temp456_thread_13);//sysj\plant.sysj line: 364, column: 8
                                heatOnZone4_5_6.setPresent();//sysj\plant.sysj line: 365, column: 8
                                currsigs.addElement(heatOnZone4_5_6);
                                S60815=1;
                                active[13]=1;
                                ends[13]=1;
                                tdone[13]=1;
                              }
                              else {
                                System.out.println("");//sysj\plant.sysj line: 367, column: 7
                                System.out.println("Room temperature is safe at" + temp456_thread_13);//sysj\plant.sysj line: 368, column: 7
                                S60815=1;
                                active[13]=1;
                                ends[13]=1;
                                tdone[13]=1;
                              }
                            }
                          }
                          else {
                            S60815=1;
                            active[13]=1;
                            ends[13]=1;
                            tdone[13]=1;
                          }
                        }
                        else {
                          if(temp23_thread_13 < 21){//sysj\plant.sysj line: 345, column: 16
                            heatOnZone2_3.setPresent();//sysj\plant.sysj line: 346, column: 8
                            currsigs.addElement(heatOnZone2_3);
                            if(zone_thread_13 == 4 || zone_thread_13 == 5 || zone_thread_13 == 6){//sysj\plant.sysj line: 355, column: 8
                              temp456_thread_13 = 0;//sysj\plant.sysj line: 356, column: 6
                              temp456_thread_13 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\plant.sysj line: 357, column: 6
                              if(temp456_thread_13 > 22){//sysj\plant.sysj line: 358, column: 9
                                System.out.println("");//sysj\plant.sysj line: 359, column: 8
                                System.out.println("Room temperature is too high at " + temp456_thread_13);//sysj\plant.sysj line: 360, column: 8
                                airOnZone4_5_6.setPresent();//sysj\plant.sysj line: 361, column: 8
                                currsigs.addElement(airOnZone4_5_6);
                                S60815=1;
                                active[13]=1;
                                ends[13]=1;
                                tdone[13]=1;
                              }
                              else {
                                if(temp456_thread_13 < 21){//sysj\plant.sysj line: 362, column: 16
                                  System.out.println("");//sysj\plant.sysj line: 363, column: 8
                                  System.out.println("Room temperature is too low at " + temp456_thread_13);//sysj\plant.sysj line: 364, column: 8
                                  heatOnZone4_5_6.setPresent();//sysj\plant.sysj line: 365, column: 8
                                  currsigs.addElement(heatOnZone4_5_6);
                                  S60815=1;
                                  active[13]=1;
                                  ends[13]=1;
                                  tdone[13]=1;
                                }
                                else {
                                  System.out.println("");//sysj\plant.sysj line: 367, column: 7
                                  System.out.println("Room temperature is safe at" + temp456_thread_13);//sysj\plant.sysj line: 368, column: 7
                                  S60815=1;
                                  active[13]=1;
                                  ends[13]=1;
                                  tdone[13]=1;
                                }
                              }
                            }
                            else {
                              S60815=1;
                              active[13]=1;
                              ends[13]=1;
                              tdone[13]=1;
                            }
                          }
                          else {
                            System.out.println("");//sysj\plant.sysj line: 348, column: 7
                            System.out.println("Room temperature is safe at" + temp23_thread_13);//sysj\plant.sysj line: 349, column: 7
                            if(zone_thread_13 == 4 || zone_thread_13 == 5 || zone_thread_13 == 6){//sysj\plant.sysj line: 355, column: 8
                              temp456_thread_13 = 0;//sysj\plant.sysj line: 356, column: 6
                              temp456_thread_13 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\plant.sysj line: 357, column: 6
                              if(temp456_thread_13 > 22){//sysj\plant.sysj line: 358, column: 9
                                System.out.println("");//sysj\plant.sysj line: 359, column: 8
                                System.out.println("Room temperature is too high at " + temp456_thread_13);//sysj\plant.sysj line: 360, column: 8
                                airOnZone4_5_6.setPresent();//sysj\plant.sysj line: 361, column: 8
                                currsigs.addElement(airOnZone4_5_6);
                                S60815=1;
                                active[13]=1;
                                ends[13]=1;
                                tdone[13]=1;
                              }
                              else {
                                if(temp456_thread_13 < 21){//sysj\plant.sysj line: 362, column: 16
                                  System.out.println("");//sysj\plant.sysj line: 363, column: 8
                                  System.out.println("Room temperature is too low at " + temp456_thread_13);//sysj\plant.sysj line: 364, column: 8
                                  heatOnZone4_5_6.setPresent();//sysj\plant.sysj line: 365, column: 8
                                  currsigs.addElement(heatOnZone4_5_6);
                                  S60815=1;
                                  active[13]=1;
                                  ends[13]=1;
                                  tdone[13]=1;
                                }
                                else {
                                  System.out.println("");//sysj\plant.sysj line: 367, column: 7
                                  System.out.println("Room temperature is safe at" + temp456_thread_13);//sysj\plant.sysj line: 368, column: 7
                                  S60815=1;
                                  active[13]=1;
                                  ends[13]=1;
                                  tdone[13]=1;
                                }
                              }
                            }
                            else {
                              S60815=1;
                              active[13]=1;
                              ends[13]=1;
                              tdone[13]=1;
                            }
                          }
                        }
                      }
                      else {
                        if(zone_thread_13 == 4 || zone_thread_13 == 5 || zone_thread_13 == 6){//sysj\plant.sysj line: 355, column: 8
                          temp456_thread_13 = 0;//sysj\plant.sysj line: 356, column: 6
                          temp456_thread_13 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\plant.sysj line: 357, column: 6
                          if(temp456_thread_13 > 22){//sysj\plant.sysj line: 358, column: 9
                            System.out.println("");//sysj\plant.sysj line: 359, column: 8
                            System.out.println("Room temperature is too high at " + temp456_thread_13);//sysj\plant.sysj line: 360, column: 8
                            airOnZone4_5_6.setPresent();//sysj\plant.sysj line: 361, column: 8
                            currsigs.addElement(airOnZone4_5_6);
                            S60815=1;
                            active[13]=1;
                            ends[13]=1;
                            tdone[13]=1;
                          }
                          else {
                            if(temp456_thread_13 < 21){//sysj\plant.sysj line: 362, column: 16
                              System.out.println("");//sysj\plant.sysj line: 363, column: 8
                              System.out.println("Room temperature is too low at " + temp456_thread_13);//sysj\plant.sysj line: 364, column: 8
                              heatOnZone4_5_6.setPresent();//sysj\plant.sysj line: 365, column: 8
                              currsigs.addElement(heatOnZone4_5_6);
                              S60815=1;
                              active[13]=1;
                              ends[13]=1;
                              tdone[13]=1;
                            }
                            else {
                              System.out.println("");//sysj\plant.sysj line: 367, column: 7
                              System.out.println("Room temperature is safe at" + temp456_thread_13);//sysj\plant.sysj line: 368, column: 7
                              S60815=1;
                              active[13]=1;
                              ends[13]=1;
                              tdone[13]=1;
                            }
                          }
                        }
                        else {
                          S60815=1;
                          active[13]=1;
                          ends[13]=1;
                          tdone[13]=1;
                        }
                      }
                    }
                    else {
                      System.out.println("");//sysj\plant.sysj line: 332, column: 7
                      System.out.println("Room temperature is safe at" + temp17_thread_13);//sysj\plant.sysj line: 333, column: 7
                      if(zone_thread_13 == 2 || zone_thread_13 == 3){//sysj\plant.sysj line: 338, column: 8
                        temp23_thread_13 = 0;//sysj\plant.sysj line: 339, column: 6
                        temp23_thread_13 = (tempZone2_3.getpreval() == null ? null : ((Integer)tempZone2_3.getpreval()));//sysj\plant.sysj line: 340, column: 6
                        if(temp23_thread_13 > 22){//sysj\plant.sysj line: 341, column: 9
                          System.out.println("");//sysj\plant.sysj line: 342, column: 8
                          System.out.println("Room temperature is too high at " + temp23_thread_13);//sysj\plant.sysj line: 343, column: 8
                          airOnZone2_3.setPresent();//sysj\plant.sysj line: 344, column: 8
                          currsigs.addElement(airOnZone2_3);
                          if(zone_thread_13 == 4 || zone_thread_13 == 5 || zone_thread_13 == 6){//sysj\plant.sysj line: 355, column: 8
                            temp456_thread_13 = 0;//sysj\plant.sysj line: 356, column: 6
                            temp456_thread_13 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\plant.sysj line: 357, column: 6
                            if(temp456_thread_13 > 22){//sysj\plant.sysj line: 358, column: 9
                              System.out.println("");//sysj\plant.sysj line: 359, column: 8
                              System.out.println("Room temperature is too high at " + temp456_thread_13);//sysj\plant.sysj line: 360, column: 8
                              airOnZone4_5_6.setPresent();//sysj\plant.sysj line: 361, column: 8
                              currsigs.addElement(airOnZone4_5_6);
                              S60815=1;
                              active[13]=1;
                              ends[13]=1;
                              tdone[13]=1;
                            }
                            else {
                              if(temp456_thread_13 < 21){//sysj\plant.sysj line: 362, column: 16
                                System.out.println("");//sysj\plant.sysj line: 363, column: 8
                                System.out.println("Room temperature is too low at " + temp456_thread_13);//sysj\plant.sysj line: 364, column: 8
                                heatOnZone4_5_6.setPresent();//sysj\plant.sysj line: 365, column: 8
                                currsigs.addElement(heatOnZone4_5_6);
                                S60815=1;
                                active[13]=1;
                                ends[13]=1;
                                tdone[13]=1;
                              }
                              else {
                                System.out.println("");//sysj\plant.sysj line: 367, column: 7
                                System.out.println("Room temperature is safe at" + temp456_thread_13);//sysj\plant.sysj line: 368, column: 7
                                S60815=1;
                                active[13]=1;
                                ends[13]=1;
                                tdone[13]=1;
                              }
                            }
                          }
                          else {
                            S60815=1;
                            active[13]=1;
                            ends[13]=1;
                            tdone[13]=1;
                          }
                        }
                        else {
                          if(temp23_thread_13 < 21){//sysj\plant.sysj line: 345, column: 16
                            heatOnZone2_3.setPresent();//sysj\plant.sysj line: 346, column: 8
                            currsigs.addElement(heatOnZone2_3);
                            if(zone_thread_13 == 4 || zone_thread_13 == 5 || zone_thread_13 == 6){//sysj\plant.sysj line: 355, column: 8
                              temp456_thread_13 = 0;//sysj\plant.sysj line: 356, column: 6
                              temp456_thread_13 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\plant.sysj line: 357, column: 6
                              if(temp456_thread_13 > 22){//sysj\plant.sysj line: 358, column: 9
                                System.out.println("");//sysj\plant.sysj line: 359, column: 8
                                System.out.println("Room temperature is too high at " + temp456_thread_13);//sysj\plant.sysj line: 360, column: 8
                                airOnZone4_5_6.setPresent();//sysj\plant.sysj line: 361, column: 8
                                currsigs.addElement(airOnZone4_5_6);
                                S60815=1;
                                active[13]=1;
                                ends[13]=1;
                                tdone[13]=1;
                              }
                              else {
                                if(temp456_thread_13 < 21){//sysj\plant.sysj line: 362, column: 16
                                  System.out.println("");//sysj\plant.sysj line: 363, column: 8
                                  System.out.println("Room temperature is too low at " + temp456_thread_13);//sysj\plant.sysj line: 364, column: 8
                                  heatOnZone4_5_6.setPresent();//sysj\plant.sysj line: 365, column: 8
                                  currsigs.addElement(heatOnZone4_5_6);
                                  S60815=1;
                                  active[13]=1;
                                  ends[13]=1;
                                  tdone[13]=1;
                                }
                                else {
                                  System.out.println("");//sysj\plant.sysj line: 367, column: 7
                                  System.out.println("Room temperature is safe at" + temp456_thread_13);//sysj\plant.sysj line: 368, column: 7
                                  S60815=1;
                                  active[13]=1;
                                  ends[13]=1;
                                  tdone[13]=1;
                                }
                              }
                            }
                            else {
                              S60815=1;
                              active[13]=1;
                              ends[13]=1;
                              tdone[13]=1;
                            }
                          }
                          else {
                            System.out.println("");//sysj\plant.sysj line: 348, column: 7
                            System.out.println("Room temperature is safe at" + temp23_thread_13);//sysj\plant.sysj line: 349, column: 7
                            if(zone_thread_13 == 4 || zone_thread_13 == 5 || zone_thread_13 == 6){//sysj\plant.sysj line: 355, column: 8
                              temp456_thread_13 = 0;//sysj\plant.sysj line: 356, column: 6
                              temp456_thread_13 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\plant.sysj line: 357, column: 6
                              if(temp456_thread_13 > 22){//sysj\plant.sysj line: 358, column: 9
                                System.out.println("");//sysj\plant.sysj line: 359, column: 8
                                System.out.println("Room temperature is too high at " + temp456_thread_13);//sysj\plant.sysj line: 360, column: 8
                                airOnZone4_5_6.setPresent();//sysj\plant.sysj line: 361, column: 8
                                currsigs.addElement(airOnZone4_5_6);
                                S60815=1;
                                active[13]=1;
                                ends[13]=1;
                                tdone[13]=1;
                              }
                              else {
                                if(temp456_thread_13 < 21){//sysj\plant.sysj line: 362, column: 16
                                  System.out.println("");//sysj\plant.sysj line: 363, column: 8
                                  System.out.println("Room temperature is too low at " + temp456_thread_13);//sysj\plant.sysj line: 364, column: 8
                                  heatOnZone4_5_6.setPresent();//sysj\plant.sysj line: 365, column: 8
                                  currsigs.addElement(heatOnZone4_5_6);
                                  S60815=1;
                                  active[13]=1;
                                  ends[13]=1;
                                  tdone[13]=1;
                                }
                                else {
                                  System.out.println("");//sysj\plant.sysj line: 367, column: 7
                                  System.out.println("Room temperature is safe at" + temp456_thread_13);//sysj\plant.sysj line: 368, column: 7
                                  S60815=1;
                                  active[13]=1;
                                  ends[13]=1;
                                  tdone[13]=1;
                                }
                              }
                            }
                            else {
                              S60815=1;
                              active[13]=1;
                              ends[13]=1;
                              tdone[13]=1;
                            }
                          }
                        }
                      }
                      else {
                        if(zone_thread_13 == 4 || zone_thread_13 == 5 || zone_thread_13 == 6){//sysj\plant.sysj line: 355, column: 8
                          temp456_thread_13 = 0;//sysj\plant.sysj line: 356, column: 6
                          temp456_thread_13 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\plant.sysj line: 357, column: 6
                          if(temp456_thread_13 > 22){//sysj\plant.sysj line: 358, column: 9
                            System.out.println("");//sysj\plant.sysj line: 359, column: 8
                            System.out.println("Room temperature is too high at " + temp456_thread_13);//sysj\plant.sysj line: 360, column: 8
                            airOnZone4_5_6.setPresent();//sysj\plant.sysj line: 361, column: 8
                            currsigs.addElement(airOnZone4_5_6);
                            S60815=1;
                            active[13]=1;
                            ends[13]=1;
                            tdone[13]=1;
                          }
                          else {
                            if(temp456_thread_13 < 21){//sysj\plant.sysj line: 362, column: 16
                              System.out.println("");//sysj\plant.sysj line: 363, column: 8
                              System.out.println("Room temperature is too low at " + temp456_thread_13);//sysj\plant.sysj line: 364, column: 8
                              heatOnZone4_5_6.setPresent();//sysj\plant.sysj line: 365, column: 8
                              currsigs.addElement(heatOnZone4_5_6);
                              S60815=1;
                              active[13]=1;
                              ends[13]=1;
                              tdone[13]=1;
                            }
                            else {
                              System.out.println("");//sysj\plant.sysj line: 367, column: 7
                              System.out.println("Room temperature is safe at" + temp456_thread_13);//sysj\plant.sysj line: 368, column: 7
                              S60815=1;
                              active[13]=1;
                              ends[13]=1;
                              tdone[13]=1;
                            }
                          }
                        }
                        else {
                          S60815=1;
                          active[13]=1;
                          ends[13]=1;
                          tdone[13]=1;
                        }
                      }
                    }
                  }
                }
                else {
                  if(zone_thread_13 == 2 || zone_thread_13 == 3){//sysj\plant.sysj line: 338, column: 8
                    temp23_thread_13 = 0;//sysj\plant.sysj line: 339, column: 6
                    temp23_thread_13 = (tempZone2_3.getpreval() == null ? null : ((Integer)tempZone2_3.getpreval()));//sysj\plant.sysj line: 340, column: 6
                    if(temp23_thread_13 > 22){//sysj\plant.sysj line: 341, column: 9
                      System.out.println("");//sysj\plant.sysj line: 342, column: 8
                      System.out.println("Room temperature is too high at " + temp23_thread_13);//sysj\plant.sysj line: 343, column: 8
                      airOnZone2_3.setPresent();//sysj\plant.sysj line: 344, column: 8
                      currsigs.addElement(airOnZone2_3);
                      if(zone_thread_13 == 4 || zone_thread_13 == 5 || zone_thread_13 == 6){//sysj\plant.sysj line: 355, column: 8
                        temp456_thread_13 = 0;//sysj\plant.sysj line: 356, column: 6
                        temp456_thread_13 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\plant.sysj line: 357, column: 6
                        if(temp456_thread_13 > 22){//sysj\plant.sysj line: 358, column: 9
                          System.out.println("");//sysj\plant.sysj line: 359, column: 8
                          System.out.println("Room temperature is too high at " + temp456_thread_13);//sysj\plant.sysj line: 360, column: 8
                          airOnZone4_5_6.setPresent();//sysj\plant.sysj line: 361, column: 8
                          currsigs.addElement(airOnZone4_5_6);
                          S60815=1;
                          active[13]=1;
                          ends[13]=1;
                          tdone[13]=1;
                        }
                        else {
                          if(temp456_thread_13 < 21){//sysj\plant.sysj line: 362, column: 16
                            System.out.println("");//sysj\plant.sysj line: 363, column: 8
                            System.out.println("Room temperature is too low at " + temp456_thread_13);//sysj\plant.sysj line: 364, column: 8
                            heatOnZone4_5_6.setPresent();//sysj\plant.sysj line: 365, column: 8
                            currsigs.addElement(heatOnZone4_5_6);
                            S60815=1;
                            active[13]=1;
                            ends[13]=1;
                            tdone[13]=1;
                          }
                          else {
                            System.out.println("");//sysj\plant.sysj line: 367, column: 7
                            System.out.println("Room temperature is safe at" + temp456_thread_13);//sysj\plant.sysj line: 368, column: 7
                            S60815=1;
                            active[13]=1;
                            ends[13]=1;
                            tdone[13]=1;
                          }
                        }
                      }
                      else {
                        S60815=1;
                        active[13]=1;
                        ends[13]=1;
                        tdone[13]=1;
                      }
                    }
                    else {
                      if(temp23_thread_13 < 21){//sysj\plant.sysj line: 345, column: 16
                        heatOnZone2_3.setPresent();//sysj\plant.sysj line: 346, column: 8
                        currsigs.addElement(heatOnZone2_3);
                        if(zone_thread_13 == 4 || zone_thread_13 == 5 || zone_thread_13 == 6){//sysj\plant.sysj line: 355, column: 8
                          temp456_thread_13 = 0;//sysj\plant.sysj line: 356, column: 6
                          temp456_thread_13 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\plant.sysj line: 357, column: 6
                          if(temp456_thread_13 > 22){//sysj\plant.sysj line: 358, column: 9
                            System.out.println("");//sysj\plant.sysj line: 359, column: 8
                            System.out.println("Room temperature is too high at " + temp456_thread_13);//sysj\plant.sysj line: 360, column: 8
                            airOnZone4_5_6.setPresent();//sysj\plant.sysj line: 361, column: 8
                            currsigs.addElement(airOnZone4_5_6);
                            S60815=1;
                            active[13]=1;
                            ends[13]=1;
                            tdone[13]=1;
                          }
                          else {
                            if(temp456_thread_13 < 21){//sysj\plant.sysj line: 362, column: 16
                              System.out.println("");//sysj\plant.sysj line: 363, column: 8
                              System.out.println("Room temperature is too low at " + temp456_thread_13);//sysj\plant.sysj line: 364, column: 8
                              heatOnZone4_5_6.setPresent();//sysj\plant.sysj line: 365, column: 8
                              currsigs.addElement(heatOnZone4_5_6);
                              S60815=1;
                              active[13]=1;
                              ends[13]=1;
                              tdone[13]=1;
                            }
                            else {
                              System.out.println("");//sysj\plant.sysj line: 367, column: 7
                              System.out.println("Room temperature is safe at" + temp456_thread_13);//sysj\plant.sysj line: 368, column: 7
                              S60815=1;
                              active[13]=1;
                              ends[13]=1;
                              tdone[13]=1;
                            }
                          }
                        }
                        else {
                          S60815=1;
                          active[13]=1;
                          ends[13]=1;
                          tdone[13]=1;
                        }
                      }
                      else {
                        System.out.println("");//sysj\plant.sysj line: 348, column: 7
                        System.out.println("Room temperature is safe at" + temp23_thread_13);//sysj\plant.sysj line: 349, column: 7
                        if(zone_thread_13 == 4 || zone_thread_13 == 5 || zone_thread_13 == 6){//sysj\plant.sysj line: 355, column: 8
                          temp456_thread_13 = 0;//sysj\plant.sysj line: 356, column: 6
                          temp456_thread_13 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\plant.sysj line: 357, column: 6
                          if(temp456_thread_13 > 22){//sysj\plant.sysj line: 358, column: 9
                            System.out.println("");//sysj\plant.sysj line: 359, column: 8
                            System.out.println("Room temperature is too high at " + temp456_thread_13);//sysj\plant.sysj line: 360, column: 8
                            airOnZone4_5_6.setPresent();//sysj\plant.sysj line: 361, column: 8
                            currsigs.addElement(airOnZone4_5_6);
                            S60815=1;
                            active[13]=1;
                            ends[13]=1;
                            tdone[13]=1;
                          }
                          else {
                            if(temp456_thread_13 < 21){//sysj\plant.sysj line: 362, column: 16
                              System.out.println("");//sysj\plant.sysj line: 363, column: 8
                              System.out.println("Room temperature is too low at " + temp456_thread_13);//sysj\plant.sysj line: 364, column: 8
                              heatOnZone4_5_6.setPresent();//sysj\plant.sysj line: 365, column: 8
                              currsigs.addElement(heatOnZone4_5_6);
                              S60815=1;
                              active[13]=1;
                              ends[13]=1;
                              tdone[13]=1;
                            }
                            else {
                              System.out.println("");//sysj\plant.sysj line: 367, column: 7
                              System.out.println("Room temperature is safe at" + temp456_thread_13);//sysj\plant.sysj line: 368, column: 7
                              S60815=1;
                              active[13]=1;
                              ends[13]=1;
                              tdone[13]=1;
                            }
                          }
                        }
                        else {
                          S60815=1;
                          active[13]=1;
                          ends[13]=1;
                          tdone[13]=1;
                        }
                      }
                    }
                  }
                  else {
                    if(zone_thread_13 == 4 || zone_thread_13 == 5 || zone_thread_13 == 6){//sysj\plant.sysj line: 355, column: 8
                      temp456_thread_13 = 0;//sysj\plant.sysj line: 356, column: 6
                      temp456_thread_13 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\plant.sysj line: 357, column: 6
                      if(temp456_thread_13 > 22){//sysj\plant.sysj line: 358, column: 9
                        System.out.println("");//sysj\plant.sysj line: 359, column: 8
                        System.out.println("Room temperature is too high at " + temp456_thread_13);//sysj\plant.sysj line: 360, column: 8
                        airOnZone4_5_6.setPresent();//sysj\plant.sysj line: 361, column: 8
                        currsigs.addElement(airOnZone4_5_6);
                        S60815=1;
                        active[13]=1;
                        ends[13]=1;
                        tdone[13]=1;
                      }
                      else {
                        if(temp456_thread_13 < 21){//sysj\plant.sysj line: 362, column: 16
                          System.out.println("");//sysj\plant.sysj line: 363, column: 8
                          System.out.println("Room temperature is too low at " + temp456_thread_13);//sysj\plant.sysj line: 364, column: 8
                          heatOnZone4_5_6.setPresent();//sysj\plant.sysj line: 365, column: 8
                          currsigs.addElement(heatOnZone4_5_6);
                          S60815=1;
                          active[13]=1;
                          ends[13]=1;
                          tdone[13]=1;
                        }
                        else {
                          System.out.println("");//sysj\plant.sysj line: 367, column: 7
                          System.out.println("Room temperature is safe at" + temp456_thread_13);//sysj\plant.sysj line: 368, column: 7
                          S60815=1;
                          active[13]=1;
                          ends[13]=1;
                          tdone[13]=1;
                        }
                      }
                    }
                    else {
                      S60815=1;
                      active[13]=1;
                      ends[13]=1;
                      tdone[13]=1;
                    }
                  }
                }
              }
            }
            else {
              S60815=1;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread69553(int [] tdone, int [] ends){
        S63275=1;
    if(cutPow.getprestatus()){//sysj\plant.sysj line: 420, column: 24
      cutPow_TriggerE.setPresent();//sysj\plant.sysj line: 420, column: 32
      currsigs.addElement(cutPow_TriggerE);
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

  public void thread69552(int [] tdone, int [] ends){
        S63267=1;
    if(deHumOnZone4_5_6.getprestatus()){//sysj\plant.sysj line: 418, column: 24
      deHumOnZone4_5_6TriggerE.setPresent();//sysj\plant.sysj line: 418, column: 42
      currsigs.addElement(deHumOnZone4_5_6TriggerE);
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

  public void thread69551(int [] tdone, int [] ends){
        S63259=1;
    if(deHumOnZone2_3.getprestatus()){//sysj\plant.sysj line: 416, column: 24
      deHumOnZone2_3TriggerE.setPresent();//sysj\plant.sysj line: 416, column: 40
      currsigs.addElement(deHumOnZone2_3TriggerE);
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

  public void thread69550(int [] tdone, int [] ends){
        S63251=1;
    if(deHumOnZone1_7.getprestatus()){//sysj\plant.sysj line: 414, column: 24
      deHumOnZone1_7TriggerE.setPresent();//sysj\plant.sysj line: 414, column: 40
      currsigs.addElement(deHumOnZone1_7TriggerE);
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

  public void thread69549(int [] tdone, int [] ends){
        S63243=1;
    if(humOnZone4_5_6.getprestatus()){//sysj\plant.sysj line: 412, column: 24
      humOnZone4_5_6TriggerE.setPresent();//sysj\plant.sysj line: 412, column: 40
      currsigs.addElement(humOnZone4_5_6TriggerE);
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

  public void thread69548(int [] tdone, int [] ends){
        S63235=1;
    if(humOnZone2_3.getprestatus()){//sysj\plant.sysj line: 410, column: 24
      humOnZone2_3TriggerE.setPresent();//sysj\plant.sysj line: 410, column: 38
      currsigs.addElement(humOnZone2_3TriggerE);
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

  public void thread69547(int [] tdone, int [] ends){
        S63227=1;
    if(humOnZone1_7.getprestatus()){//sysj\plant.sysj line: 408, column: 24
      humOnZone1_7TriggerE.setPresent();//sysj\plant.sysj line: 408, column: 38
      currsigs.addElement(humOnZone1_7TriggerE);
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

  public void thread69546(int [] tdone, int [] ends){
        S63219=1;
    if(heatOnZone4_5_6.getprestatus()){//sysj\plant.sysj line: 406, column: 24
      heatOnZone4_5_6TriggerE.setPresent();//sysj\plant.sysj line: 406, column: 41
      currsigs.addElement(heatOnZone4_5_6TriggerE);
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

  public void thread69545(int [] tdone, int [] ends){
        S63211=1;
    if(heatOnZone2_3.getprestatus()){//sysj\plant.sysj line: 404, column: 24
      heatOnZone2_3TriggerE.setPresent();//sysj\plant.sysj line: 404, column: 39
      currsigs.addElement(heatOnZone2_3TriggerE);
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

  public void thread69544(int [] tdone, int [] ends){
        S63203=1;
    if(airOnZone4_5_6.getprestatus()){//sysj\plant.sysj line: 402, column: 24
      airOnZone4_5_6TriggerE.setPresent();//sysj\plant.sysj line: 402, column: 40
      currsigs.addElement(airOnZone4_5_6TriggerE);
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

  public void thread69543(int [] tdone, int [] ends){
        S63195=1;
    if(airOnZone2_3.getprestatus()){//sysj\plant.sysj line: 400, column: 24
      airOnZone2_3TriggerE.setPresent();//sysj\plant.sysj line: 400, column: 38
      currsigs.addElement(airOnZone2_3TriggerE);
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

  public void thread69542(int [] tdone, int [] ends){
        S63187=1;
    if(heatOnZone1_7.getprestatus()){//sysj\plant.sysj line: 398, column: 24
      heatOnZone1_7TriggerE.setPresent();//sysj\plant.sysj line: 398, column: 39
      currsigs.addElement(heatOnZone1_7TriggerE);
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

  public void thread69541(int [] tdone, int [] ends){
        S63179=1;
    if(fanOnZone1_7.getprestatus()){//sysj\plant.sysj line: 396, column: 24
      fanOnZone1_7TriggerE.setPresent();//sysj\plant.sysj line: 396, column: 38
      currsigs.addElement(fanOnZone1_7TriggerE);
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

  public void thread69540(int [] tdone, int [] ends){
        S63171=1;
    if(cleanZone7.getprestatus()){//sysj\plant.sysj line: 394, column: 24
      cleanZone7TriggerE.setPresent();//sysj\plant.sysj line: 394, column: 36
      currsigs.addElement(cleanZone7TriggerE);
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

  public void thread69539(int [] tdone, int [] ends){
        S63163=1;
    if(cleanZone6.getprestatus()){//sysj\plant.sysj line: 392, column: 24
      cleanZone6TriggerE.setPresent();//sysj\plant.sysj line: 392, column: 36
      currsigs.addElement(cleanZone6TriggerE);
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

  public void thread69538(int [] tdone, int [] ends){
        S63155=1;
    if(cleanZone5.getprestatus()){//sysj\plant.sysj line: 390, column: 24
      cleanZone5TriggerE.setPresent();//sysj\plant.sysj line: 390, column: 36
      currsigs.addElement(cleanZone5TriggerE);
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

  public void thread69537(int [] tdone, int [] ends){
        S63147=1;
    if(cleanZone4.getprestatus()){//sysj\plant.sysj line: 388, column: 24
      cleanZone4TriggerE.setPresent();//sysj\plant.sysj line: 388, column: 36
      currsigs.addElement(cleanZone4TriggerE);
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

  public void thread69536(int [] tdone, int [] ends){
        S63139=1;
    if(cleanZone3.getprestatus()){//sysj\plant.sysj line: 386, column: 24
      cleanZone3TriggerE.setPresent();//sysj\plant.sysj line: 386, column: 36
      currsigs.addElement(cleanZone3TriggerE);
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

  public void thread69535(int [] tdone, int [] ends){
        S63131=1;
    if(cleanZone2.getprestatus()){//sysj\plant.sysj line: 384, column: 24
      cleanZone2TriggerE.setPresent();//sysj\plant.sysj line: 384, column: 36
      currsigs.addElement(cleanZone2TriggerE);
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

  public void thread69534(int [] tdone, int [] ends){
        S63123=1;
    if(cleanZone1.getprestatus()){//sysj\plant.sysj line: 382, column: 24
      cleanZone1TriggerE.setPresent();//sysj\plant.sysj line: 382, column: 36
      currsigs.addElement(cleanZone1TriggerE);
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

  public void thread69533(int [] tdone, int [] ends){
        S63115=1;
    if(fireExt.getprestatus()){//sysj\plant.sysj line: 380, column: 24
      fireExtE.setPresent();//sysj\plant.sysj line: 380, column: 33
      currsigs.addElement(fireExtE);
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

  public void thread69532(int [] tdone, int [] ends){
        S63107=1;
    if(fireZone1.getprestatus()){//sysj\plant.sysj line: 378, column: 24
      alarmZone1TriggerE.setPresent();//sysj\plant.sysj line: 378, column: 35
      currsigs.addElement(alarmZone1TriggerE);
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

  public void thread69531(int [] tdone, int [] ends){
        S63277=1;
    thread69532(tdone,ends);
    thread69533(tdone,ends);
    thread69534(tdone,ends);
    thread69535(tdone,ends);
    thread69536(tdone,ends);
    thread69537(tdone,ends);
    thread69538(tdone,ends);
    thread69539(tdone,ends);
    thread69540(tdone,ends);
    thread69541(tdone,ends);
    thread69542(tdone,ends);
    thread69543(tdone,ends);
    thread69544(tdone,ends);
    thread69545(tdone,ends);
    thread69546(tdone,ends);
    thread69547(tdone,ends);
    thread69548(tdone,ends);
    thread69549(tdone,ends);
    thread69550(tdone,ends);
    thread69551(tdone,ends);
    thread69552(tdone,ends);
    thread69553(tdone,ends);
    int biggest69554 = 0;
    if(ends[15]>=biggest69554){
      biggest69554=ends[15];
    }
    if(ends[16]>=biggest69554){
      biggest69554=ends[16];
    }
    if(ends[17]>=biggest69554){
      biggest69554=ends[17];
    }
    if(ends[18]>=biggest69554){
      biggest69554=ends[18];
    }
    if(ends[19]>=biggest69554){
      biggest69554=ends[19];
    }
    if(ends[20]>=biggest69554){
      biggest69554=ends[20];
    }
    if(ends[21]>=biggest69554){
      biggest69554=ends[21];
    }
    if(ends[22]>=biggest69554){
      biggest69554=ends[22];
    }
    if(ends[23]>=biggest69554){
      biggest69554=ends[23];
    }
    if(ends[24]>=biggest69554){
      biggest69554=ends[24];
    }
    if(ends[25]>=biggest69554){
      biggest69554=ends[25];
    }
    if(ends[26]>=biggest69554){
      biggest69554=ends[26];
    }
    if(ends[27]>=biggest69554){
      biggest69554=ends[27];
    }
    if(ends[28]>=biggest69554){
      biggest69554=ends[28];
    }
    if(ends[29]>=biggest69554){
      biggest69554=ends[29];
    }
    if(ends[30]>=biggest69554){
      biggest69554=ends[30];
    }
    if(ends[31]>=biggest69554){
      biggest69554=ends[31];
    }
    if(ends[32]>=biggest69554){
      biggest69554=ends[32];
    }
    if(ends[33]>=biggest69554){
      biggest69554=ends[33];
    }
    if(ends[34]>=biggest69554){
      biggest69554=ends[34];
    }
    if(ends[35]>=biggest69554){
      biggest69554=ends[35];
    }
    if(ends[36]>=biggest69554){
      biggest69554=ends[36];
    }
    if(biggest69554 == 1){
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
  }

  public void thread69530(int [] tdone, int [] ends){
        S63099=1;
    S60815=0;
    if(run.getprestatus()){//sysj\plant.sysj line: 282, column: 12
      zone_thread_13 = 0;//sysj\plant.sysj line: 285, column: 5
      zone_thread_13 = (selectedZone.getpreval() == null ? null : ((Integer)selectedZone.getpreval()));//sysj\plant.sysj line: 286, column: 5
      System.out.println("");//sysj\plant.sysj line: 288, column: 5
      System.out.println("Plant knows zone selected is: " + zone_thread_13);//sysj\plant.sysj line: 289, column: 5
      firePresent_thread_13 = 0;//sysj\plant.sysj line: 292, column: 5
      firePresent_thread_13 = (fire.getpreval() == null ? null : ((Integer)fire.getpreval()));//sysj\plant.sysj line: 293, column: 5
      lightIntensity_thread_13 = 0;//sysj\plant.sysj line: 296, column: 5
      lightIntensity_thread_13 = (lightInt.getpreval() == null ? null : ((Integer)lightInt.getpreval()));//sysj\plant.sysj line: 297, column: 5
      clock_thread_13 = "";//sysj\plant.sysj line: 300, column: 5
      clock_thread_13 = (time.getpreval() == null ? null : ((String)time.getpreval()));//sysj\plant.sysj line: 301, column: 5
      if(firePresent_thread_13 == 1){//sysj\plant.sysj line: 305, column: 8
        System.out.println("THERE IS A FIRE IN ZONE " + zone_thread_13 + " SEND EVACUATION SIGNAL TO ACS");//sysj\plant.sysj line: 306, column: 6
        cutPow.setPresent();//sysj\plant.sysj line: 307, column: 6
        currsigs.addElement(cutPow);
        S59676=0;
        active[13]=1;
        ends[13]=1;
        tdone[13]=1;
      }
      else {
        if(zone_thread_13 == 1 || zone_thread_13 == 7){//sysj\plant.sysj line: 321, column: 8
          temp17_thread_13 = 0;//sysj\plant.sysj line: 322, column: 6
          temp17_thread_13 = (tempZone1_7.getpreval() == null ? null : ((Integer)tempZone1_7.getpreval()));//sysj\plant.sysj line: 323, column: 6
          if(temp17_thread_13 > 22){//sysj\plant.sysj line: 324, column: 9
            System.out.println("");//sysj\plant.sysj line: 325, column: 8
            System.out.println("Room temperature is too high at " + temp17_thread_13);//sysj\plant.sysj line: 326, column: 8
            fanOnZone1_7.setPresent();//sysj\plant.sysj line: 327, column: 8
            currsigs.addElement(fanOnZone1_7);
            if(zone_thread_13 == 2 || zone_thread_13 == 3){//sysj\plant.sysj line: 338, column: 8
              temp23_thread_13 = 0;//sysj\plant.sysj line: 339, column: 6
              temp23_thread_13 = (tempZone2_3.getpreval() == null ? null : ((Integer)tempZone2_3.getpreval()));//sysj\plant.sysj line: 340, column: 6
              if(temp23_thread_13 > 22){//sysj\plant.sysj line: 341, column: 9
                System.out.println("");//sysj\plant.sysj line: 342, column: 8
                System.out.println("Room temperature is too high at " + temp23_thread_13);//sysj\plant.sysj line: 343, column: 8
                airOnZone2_3.setPresent();//sysj\plant.sysj line: 344, column: 8
                currsigs.addElement(airOnZone2_3);
                if(zone_thread_13 == 4 || zone_thread_13 == 5 || zone_thread_13 == 6){//sysj\plant.sysj line: 355, column: 8
                  temp456_thread_13 = 0;//sysj\plant.sysj line: 356, column: 6
                  temp456_thread_13 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\plant.sysj line: 357, column: 6
                  if(temp456_thread_13 > 22){//sysj\plant.sysj line: 358, column: 9
                    System.out.println("");//sysj\plant.sysj line: 359, column: 8
                    System.out.println("Room temperature is too high at " + temp456_thread_13);//sysj\plant.sysj line: 360, column: 8
                    airOnZone4_5_6.setPresent();//sysj\plant.sysj line: 361, column: 8
                    currsigs.addElement(airOnZone4_5_6);
                    S60815=1;
                    active[13]=1;
                    ends[13]=1;
                    tdone[13]=1;
                  }
                  else {
                    if(temp456_thread_13 < 21){//sysj\plant.sysj line: 362, column: 16
                      System.out.println("");//sysj\plant.sysj line: 363, column: 8
                      System.out.println("Room temperature is too low at " + temp456_thread_13);//sysj\plant.sysj line: 364, column: 8
                      heatOnZone4_5_6.setPresent();//sysj\plant.sysj line: 365, column: 8
                      currsigs.addElement(heatOnZone4_5_6);
                      S60815=1;
                      active[13]=1;
                      ends[13]=1;
                      tdone[13]=1;
                    }
                    else {
                      System.out.println("");//sysj\plant.sysj line: 367, column: 7
                      System.out.println("Room temperature is safe at" + temp456_thread_13);//sysj\plant.sysj line: 368, column: 7
                      S60815=1;
                      active[13]=1;
                      ends[13]=1;
                      tdone[13]=1;
                    }
                  }
                }
                else {
                  S60815=1;
                  active[13]=1;
                  ends[13]=1;
                  tdone[13]=1;
                }
              }
              else {
                if(temp23_thread_13 < 21){//sysj\plant.sysj line: 345, column: 16
                  heatOnZone2_3.setPresent();//sysj\plant.sysj line: 346, column: 8
                  currsigs.addElement(heatOnZone2_3);
                  if(zone_thread_13 == 4 || zone_thread_13 == 5 || zone_thread_13 == 6){//sysj\plant.sysj line: 355, column: 8
                    temp456_thread_13 = 0;//sysj\plant.sysj line: 356, column: 6
                    temp456_thread_13 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\plant.sysj line: 357, column: 6
                    if(temp456_thread_13 > 22){//sysj\plant.sysj line: 358, column: 9
                      System.out.println("");//sysj\plant.sysj line: 359, column: 8
                      System.out.println("Room temperature is too high at " + temp456_thread_13);//sysj\plant.sysj line: 360, column: 8
                      airOnZone4_5_6.setPresent();//sysj\plant.sysj line: 361, column: 8
                      currsigs.addElement(airOnZone4_5_6);
                      S60815=1;
                      active[13]=1;
                      ends[13]=1;
                      tdone[13]=1;
                    }
                    else {
                      if(temp456_thread_13 < 21){//sysj\plant.sysj line: 362, column: 16
                        System.out.println("");//sysj\plant.sysj line: 363, column: 8
                        System.out.println("Room temperature is too low at " + temp456_thread_13);//sysj\plant.sysj line: 364, column: 8
                        heatOnZone4_5_6.setPresent();//sysj\plant.sysj line: 365, column: 8
                        currsigs.addElement(heatOnZone4_5_6);
                        S60815=1;
                        active[13]=1;
                        ends[13]=1;
                        tdone[13]=1;
                      }
                      else {
                        System.out.println("");//sysj\plant.sysj line: 367, column: 7
                        System.out.println("Room temperature is safe at" + temp456_thread_13);//sysj\plant.sysj line: 368, column: 7
                        S60815=1;
                        active[13]=1;
                        ends[13]=1;
                        tdone[13]=1;
                      }
                    }
                  }
                  else {
                    S60815=1;
                    active[13]=1;
                    ends[13]=1;
                    tdone[13]=1;
                  }
                }
                else {
                  System.out.println("");//sysj\plant.sysj line: 348, column: 7
                  System.out.println("Room temperature is safe at" + temp23_thread_13);//sysj\plant.sysj line: 349, column: 7
                  if(zone_thread_13 == 4 || zone_thread_13 == 5 || zone_thread_13 == 6){//sysj\plant.sysj line: 355, column: 8
                    temp456_thread_13 = 0;//sysj\plant.sysj line: 356, column: 6
                    temp456_thread_13 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\plant.sysj line: 357, column: 6
                    if(temp456_thread_13 > 22){//sysj\plant.sysj line: 358, column: 9
                      System.out.println("");//sysj\plant.sysj line: 359, column: 8
                      System.out.println("Room temperature is too high at " + temp456_thread_13);//sysj\plant.sysj line: 360, column: 8
                      airOnZone4_5_6.setPresent();//sysj\plant.sysj line: 361, column: 8
                      currsigs.addElement(airOnZone4_5_6);
                      S60815=1;
                      active[13]=1;
                      ends[13]=1;
                      tdone[13]=1;
                    }
                    else {
                      if(temp456_thread_13 < 21){//sysj\plant.sysj line: 362, column: 16
                        System.out.println("");//sysj\plant.sysj line: 363, column: 8
                        System.out.println("Room temperature is too low at " + temp456_thread_13);//sysj\plant.sysj line: 364, column: 8
                        heatOnZone4_5_6.setPresent();//sysj\plant.sysj line: 365, column: 8
                        currsigs.addElement(heatOnZone4_5_6);
                        S60815=1;
                        active[13]=1;
                        ends[13]=1;
                        tdone[13]=1;
                      }
                      else {
                        System.out.println("");//sysj\plant.sysj line: 367, column: 7
                        System.out.println("Room temperature is safe at" + temp456_thread_13);//sysj\plant.sysj line: 368, column: 7
                        S60815=1;
                        active[13]=1;
                        ends[13]=1;
                        tdone[13]=1;
                      }
                    }
                  }
                  else {
                    S60815=1;
                    active[13]=1;
                    ends[13]=1;
                    tdone[13]=1;
                  }
                }
              }
            }
            else {
              if(zone_thread_13 == 4 || zone_thread_13 == 5 || zone_thread_13 == 6){//sysj\plant.sysj line: 355, column: 8
                temp456_thread_13 = 0;//sysj\plant.sysj line: 356, column: 6
                temp456_thread_13 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\plant.sysj line: 357, column: 6
                if(temp456_thread_13 > 22){//sysj\plant.sysj line: 358, column: 9
                  System.out.println("");//sysj\plant.sysj line: 359, column: 8
                  System.out.println("Room temperature is too high at " + temp456_thread_13);//sysj\plant.sysj line: 360, column: 8
                  airOnZone4_5_6.setPresent();//sysj\plant.sysj line: 361, column: 8
                  currsigs.addElement(airOnZone4_5_6);
                  S60815=1;
                  active[13]=1;
                  ends[13]=1;
                  tdone[13]=1;
                }
                else {
                  if(temp456_thread_13 < 21){//sysj\plant.sysj line: 362, column: 16
                    System.out.println("");//sysj\plant.sysj line: 363, column: 8
                    System.out.println("Room temperature is too low at " + temp456_thread_13);//sysj\plant.sysj line: 364, column: 8
                    heatOnZone4_5_6.setPresent();//sysj\plant.sysj line: 365, column: 8
                    currsigs.addElement(heatOnZone4_5_6);
                    S60815=1;
                    active[13]=1;
                    ends[13]=1;
                    tdone[13]=1;
                  }
                  else {
                    System.out.println("");//sysj\plant.sysj line: 367, column: 7
                    System.out.println("Room temperature is safe at" + temp456_thread_13);//sysj\plant.sysj line: 368, column: 7
                    S60815=1;
                    active[13]=1;
                    ends[13]=1;
                    tdone[13]=1;
                  }
                }
              }
              else {
                S60815=1;
                active[13]=1;
                ends[13]=1;
                tdone[13]=1;
              }
            }
          }
          else {
            if(temp17_thread_13 < 21){//sysj\plant.sysj line: 328, column: 16
              System.out.println("Room temperature is too low at " + temp17_thread_13);//sysj\plant.sysj line: 329, column: 8
              heatOnZone1_7.setPresent();//sysj\plant.sysj line: 330, column: 8
              currsigs.addElement(heatOnZone1_7);
              if(zone_thread_13 == 2 || zone_thread_13 == 3){//sysj\plant.sysj line: 338, column: 8
                temp23_thread_13 = 0;//sysj\plant.sysj line: 339, column: 6
                temp23_thread_13 = (tempZone2_3.getpreval() == null ? null : ((Integer)tempZone2_3.getpreval()));//sysj\plant.sysj line: 340, column: 6
                if(temp23_thread_13 > 22){//sysj\plant.sysj line: 341, column: 9
                  System.out.println("");//sysj\plant.sysj line: 342, column: 8
                  System.out.println("Room temperature is too high at " + temp23_thread_13);//sysj\plant.sysj line: 343, column: 8
                  airOnZone2_3.setPresent();//sysj\plant.sysj line: 344, column: 8
                  currsigs.addElement(airOnZone2_3);
                  if(zone_thread_13 == 4 || zone_thread_13 == 5 || zone_thread_13 == 6){//sysj\plant.sysj line: 355, column: 8
                    temp456_thread_13 = 0;//sysj\plant.sysj line: 356, column: 6
                    temp456_thread_13 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\plant.sysj line: 357, column: 6
                    if(temp456_thread_13 > 22){//sysj\plant.sysj line: 358, column: 9
                      System.out.println("");//sysj\plant.sysj line: 359, column: 8
                      System.out.println("Room temperature is too high at " + temp456_thread_13);//sysj\plant.sysj line: 360, column: 8
                      airOnZone4_5_6.setPresent();//sysj\plant.sysj line: 361, column: 8
                      currsigs.addElement(airOnZone4_5_6);
                      S60815=1;
                      active[13]=1;
                      ends[13]=1;
                      tdone[13]=1;
                    }
                    else {
                      if(temp456_thread_13 < 21){//sysj\plant.sysj line: 362, column: 16
                        System.out.println("");//sysj\plant.sysj line: 363, column: 8
                        System.out.println("Room temperature is too low at " + temp456_thread_13);//sysj\plant.sysj line: 364, column: 8
                        heatOnZone4_5_6.setPresent();//sysj\plant.sysj line: 365, column: 8
                        currsigs.addElement(heatOnZone4_5_6);
                        S60815=1;
                        active[13]=1;
                        ends[13]=1;
                        tdone[13]=1;
                      }
                      else {
                        System.out.println("");//sysj\plant.sysj line: 367, column: 7
                        System.out.println("Room temperature is safe at" + temp456_thread_13);//sysj\plant.sysj line: 368, column: 7
                        S60815=1;
                        active[13]=1;
                        ends[13]=1;
                        tdone[13]=1;
                      }
                    }
                  }
                  else {
                    S60815=1;
                    active[13]=1;
                    ends[13]=1;
                    tdone[13]=1;
                  }
                }
                else {
                  if(temp23_thread_13 < 21){//sysj\plant.sysj line: 345, column: 16
                    heatOnZone2_3.setPresent();//sysj\plant.sysj line: 346, column: 8
                    currsigs.addElement(heatOnZone2_3);
                    if(zone_thread_13 == 4 || zone_thread_13 == 5 || zone_thread_13 == 6){//sysj\plant.sysj line: 355, column: 8
                      temp456_thread_13 = 0;//sysj\plant.sysj line: 356, column: 6
                      temp456_thread_13 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\plant.sysj line: 357, column: 6
                      if(temp456_thread_13 > 22){//sysj\plant.sysj line: 358, column: 9
                        System.out.println("");//sysj\plant.sysj line: 359, column: 8
                        System.out.println("Room temperature is too high at " + temp456_thread_13);//sysj\plant.sysj line: 360, column: 8
                        airOnZone4_5_6.setPresent();//sysj\plant.sysj line: 361, column: 8
                        currsigs.addElement(airOnZone4_5_6);
                        S60815=1;
                        active[13]=1;
                        ends[13]=1;
                        tdone[13]=1;
                      }
                      else {
                        if(temp456_thread_13 < 21){//sysj\plant.sysj line: 362, column: 16
                          System.out.println("");//sysj\plant.sysj line: 363, column: 8
                          System.out.println("Room temperature is too low at " + temp456_thread_13);//sysj\plant.sysj line: 364, column: 8
                          heatOnZone4_5_6.setPresent();//sysj\plant.sysj line: 365, column: 8
                          currsigs.addElement(heatOnZone4_5_6);
                          S60815=1;
                          active[13]=1;
                          ends[13]=1;
                          tdone[13]=1;
                        }
                        else {
                          System.out.println("");//sysj\plant.sysj line: 367, column: 7
                          System.out.println("Room temperature is safe at" + temp456_thread_13);//sysj\plant.sysj line: 368, column: 7
                          S60815=1;
                          active[13]=1;
                          ends[13]=1;
                          tdone[13]=1;
                        }
                      }
                    }
                    else {
                      S60815=1;
                      active[13]=1;
                      ends[13]=1;
                      tdone[13]=1;
                    }
                  }
                  else {
                    System.out.println("");//sysj\plant.sysj line: 348, column: 7
                    System.out.println("Room temperature is safe at" + temp23_thread_13);//sysj\plant.sysj line: 349, column: 7
                    if(zone_thread_13 == 4 || zone_thread_13 == 5 || zone_thread_13 == 6){//sysj\plant.sysj line: 355, column: 8
                      temp456_thread_13 = 0;//sysj\plant.sysj line: 356, column: 6
                      temp456_thread_13 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\plant.sysj line: 357, column: 6
                      if(temp456_thread_13 > 22){//sysj\plant.sysj line: 358, column: 9
                        System.out.println("");//sysj\plant.sysj line: 359, column: 8
                        System.out.println("Room temperature is too high at " + temp456_thread_13);//sysj\plant.sysj line: 360, column: 8
                        airOnZone4_5_6.setPresent();//sysj\plant.sysj line: 361, column: 8
                        currsigs.addElement(airOnZone4_5_6);
                        S60815=1;
                        active[13]=1;
                        ends[13]=1;
                        tdone[13]=1;
                      }
                      else {
                        if(temp456_thread_13 < 21){//sysj\plant.sysj line: 362, column: 16
                          System.out.println("");//sysj\plant.sysj line: 363, column: 8
                          System.out.println("Room temperature is too low at " + temp456_thread_13);//sysj\plant.sysj line: 364, column: 8
                          heatOnZone4_5_6.setPresent();//sysj\plant.sysj line: 365, column: 8
                          currsigs.addElement(heatOnZone4_5_6);
                          S60815=1;
                          active[13]=1;
                          ends[13]=1;
                          tdone[13]=1;
                        }
                        else {
                          System.out.println("");//sysj\plant.sysj line: 367, column: 7
                          System.out.println("Room temperature is safe at" + temp456_thread_13);//sysj\plant.sysj line: 368, column: 7
                          S60815=1;
                          active[13]=1;
                          ends[13]=1;
                          tdone[13]=1;
                        }
                      }
                    }
                    else {
                      S60815=1;
                      active[13]=1;
                      ends[13]=1;
                      tdone[13]=1;
                    }
                  }
                }
              }
              else {
                if(zone_thread_13 == 4 || zone_thread_13 == 5 || zone_thread_13 == 6){//sysj\plant.sysj line: 355, column: 8
                  temp456_thread_13 = 0;//sysj\plant.sysj line: 356, column: 6
                  temp456_thread_13 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\plant.sysj line: 357, column: 6
                  if(temp456_thread_13 > 22){//sysj\plant.sysj line: 358, column: 9
                    System.out.println("");//sysj\plant.sysj line: 359, column: 8
                    System.out.println("Room temperature is too high at " + temp456_thread_13);//sysj\plant.sysj line: 360, column: 8
                    airOnZone4_5_6.setPresent();//sysj\plant.sysj line: 361, column: 8
                    currsigs.addElement(airOnZone4_5_6);
                    S60815=1;
                    active[13]=1;
                    ends[13]=1;
                    tdone[13]=1;
                  }
                  else {
                    if(temp456_thread_13 < 21){//sysj\plant.sysj line: 362, column: 16
                      System.out.println("");//sysj\plant.sysj line: 363, column: 8
                      System.out.println("Room temperature is too low at " + temp456_thread_13);//sysj\plant.sysj line: 364, column: 8
                      heatOnZone4_5_6.setPresent();//sysj\plant.sysj line: 365, column: 8
                      currsigs.addElement(heatOnZone4_5_6);
                      S60815=1;
                      active[13]=1;
                      ends[13]=1;
                      tdone[13]=1;
                    }
                    else {
                      System.out.println("");//sysj\plant.sysj line: 367, column: 7
                      System.out.println("Room temperature is safe at" + temp456_thread_13);//sysj\plant.sysj line: 368, column: 7
                      S60815=1;
                      active[13]=1;
                      ends[13]=1;
                      tdone[13]=1;
                    }
                  }
                }
                else {
                  S60815=1;
                  active[13]=1;
                  ends[13]=1;
                  tdone[13]=1;
                }
              }
            }
            else {
              System.out.println("");//sysj\plant.sysj line: 332, column: 7
              System.out.println("Room temperature is safe at" + temp17_thread_13);//sysj\plant.sysj line: 333, column: 7
              if(zone_thread_13 == 2 || zone_thread_13 == 3){//sysj\plant.sysj line: 338, column: 8
                temp23_thread_13 = 0;//sysj\plant.sysj line: 339, column: 6
                temp23_thread_13 = (tempZone2_3.getpreval() == null ? null : ((Integer)tempZone2_3.getpreval()));//sysj\plant.sysj line: 340, column: 6
                if(temp23_thread_13 > 22){//sysj\plant.sysj line: 341, column: 9
                  System.out.println("");//sysj\plant.sysj line: 342, column: 8
                  System.out.println("Room temperature is too high at " + temp23_thread_13);//sysj\plant.sysj line: 343, column: 8
                  airOnZone2_3.setPresent();//sysj\plant.sysj line: 344, column: 8
                  currsigs.addElement(airOnZone2_3);
                  if(zone_thread_13 == 4 || zone_thread_13 == 5 || zone_thread_13 == 6){//sysj\plant.sysj line: 355, column: 8
                    temp456_thread_13 = 0;//sysj\plant.sysj line: 356, column: 6
                    temp456_thread_13 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\plant.sysj line: 357, column: 6
                    if(temp456_thread_13 > 22){//sysj\plant.sysj line: 358, column: 9
                      System.out.println("");//sysj\plant.sysj line: 359, column: 8
                      System.out.println("Room temperature is too high at " + temp456_thread_13);//sysj\plant.sysj line: 360, column: 8
                      airOnZone4_5_6.setPresent();//sysj\plant.sysj line: 361, column: 8
                      currsigs.addElement(airOnZone4_5_6);
                      S60815=1;
                      active[13]=1;
                      ends[13]=1;
                      tdone[13]=1;
                    }
                    else {
                      if(temp456_thread_13 < 21){//sysj\plant.sysj line: 362, column: 16
                        System.out.println("");//sysj\plant.sysj line: 363, column: 8
                        System.out.println("Room temperature is too low at " + temp456_thread_13);//sysj\plant.sysj line: 364, column: 8
                        heatOnZone4_5_6.setPresent();//sysj\plant.sysj line: 365, column: 8
                        currsigs.addElement(heatOnZone4_5_6);
                        S60815=1;
                        active[13]=1;
                        ends[13]=1;
                        tdone[13]=1;
                      }
                      else {
                        System.out.println("");//sysj\plant.sysj line: 367, column: 7
                        System.out.println("Room temperature is safe at" + temp456_thread_13);//sysj\plant.sysj line: 368, column: 7
                        S60815=1;
                        active[13]=1;
                        ends[13]=1;
                        tdone[13]=1;
                      }
                    }
                  }
                  else {
                    S60815=1;
                    active[13]=1;
                    ends[13]=1;
                    tdone[13]=1;
                  }
                }
                else {
                  if(temp23_thread_13 < 21){//sysj\plant.sysj line: 345, column: 16
                    heatOnZone2_3.setPresent();//sysj\plant.sysj line: 346, column: 8
                    currsigs.addElement(heatOnZone2_3);
                    if(zone_thread_13 == 4 || zone_thread_13 == 5 || zone_thread_13 == 6){//sysj\plant.sysj line: 355, column: 8
                      temp456_thread_13 = 0;//sysj\plant.sysj line: 356, column: 6
                      temp456_thread_13 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\plant.sysj line: 357, column: 6
                      if(temp456_thread_13 > 22){//sysj\plant.sysj line: 358, column: 9
                        System.out.println("");//sysj\plant.sysj line: 359, column: 8
                        System.out.println("Room temperature is too high at " + temp456_thread_13);//sysj\plant.sysj line: 360, column: 8
                        airOnZone4_5_6.setPresent();//sysj\plant.sysj line: 361, column: 8
                        currsigs.addElement(airOnZone4_5_6);
                        S60815=1;
                        active[13]=1;
                        ends[13]=1;
                        tdone[13]=1;
                      }
                      else {
                        if(temp456_thread_13 < 21){//sysj\plant.sysj line: 362, column: 16
                          System.out.println("");//sysj\plant.sysj line: 363, column: 8
                          System.out.println("Room temperature is too low at " + temp456_thread_13);//sysj\plant.sysj line: 364, column: 8
                          heatOnZone4_5_6.setPresent();//sysj\plant.sysj line: 365, column: 8
                          currsigs.addElement(heatOnZone4_5_6);
                          S60815=1;
                          active[13]=1;
                          ends[13]=1;
                          tdone[13]=1;
                        }
                        else {
                          System.out.println("");//sysj\plant.sysj line: 367, column: 7
                          System.out.println("Room temperature is safe at" + temp456_thread_13);//sysj\plant.sysj line: 368, column: 7
                          S60815=1;
                          active[13]=1;
                          ends[13]=1;
                          tdone[13]=1;
                        }
                      }
                    }
                    else {
                      S60815=1;
                      active[13]=1;
                      ends[13]=1;
                      tdone[13]=1;
                    }
                  }
                  else {
                    System.out.println("");//sysj\plant.sysj line: 348, column: 7
                    System.out.println("Room temperature is safe at" + temp23_thread_13);//sysj\plant.sysj line: 349, column: 7
                    if(zone_thread_13 == 4 || zone_thread_13 == 5 || zone_thread_13 == 6){//sysj\plant.sysj line: 355, column: 8
                      temp456_thread_13 = 0;//sysj\plant.sysj line: 356, column: 6
                      temp456_thread_13 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\plant.sysj line: 357, column: 6
                      if(temp456_thread_13 > 22){//sysj\plant.sysj line: 358, column: 9
                        System.out.println("");//sysj\plant.sysj line: 359, column: 8
                        System.out.println("Room temperature is too high at " + temp456_thread_13);//sysj\plant.sysj line: 360, column: 8
                        airOnZone4_5_6.setPresent();//sysj\plant.sysj line: 361, column: 8
                        currsigs.addElement(airOnZone4_5_6);
                        S60815=1;
                        active[13]=1;
                        ends[13]=1;
                        tdone[13]=1;
                      }
                      else {
                        if(temp456_thread_13 < 21){//sysj\plant.sysj line: 362, column: 16
                          System.out.println("");//sysj\plant.sysj line: 363, column: 8
                          System.out.println("Room temperature is too low at " + temp456_thread_13);//sysj\plant.sysj line: 364, column: 8
                          heatOnZone4_5_6.setPresent();//sysj\plant.sysj line: 365, column: 8
                          currsigs.addElement(heatOnZone4_5_6);
                          S60815=1;
                          active[13]=1;
                          ends[13]=1;
                          tdone[13]=1;
                        }
                        else {
                          System.out.println("");//sysj\plant.sysj line: 367, column: 7
                          System.out.println("Room temperature is safe at" + temp456_thread_13);//sysj\plant.sysj line: 368, column: 7
                          S60815=1;
                          active[13]=1;
                          ends[13]=1;
                          tdone[13]=1;
                        }
                      }
                    }
                    else {
                      S60815=1;
                      active[13]=1;
                      ends[13]=1;
                      tdone[13]=1;
                    }
                  }
                }
              }
              else {
                if(zone_thread_13 == 4 || zone_thread_13 == 5 || zone_thread_13 == 6){//sysj\plant.sysj line: 355, column: 8
                  temp456_thread_13 = 0;//sysj\plant.sysj line: 356, column: 6
                  temp456_thread_13 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\plant.sysj line: 357, column: 6
                  if(temp456_thread_13 > 22){//sysj\plant.sysj line: 358, column: 9
                    System.out.println("");//sysj\plant.sysj line: 359, column: 8
                    System.out.println("Room temperature is too high at " + temp456_thread_13);//sysj\plant.sysj line: 360, column: 8
                    airOnZone4_5_6.setPresent();//sysj\plant.sysj line: 361, column: 8
                    currsigs.addElement(airOnZone4_5_6);
                    S60815=1;
                    active[13]=1;
                    ends[13]=1;
                    tdone[13]=1;
                  }
                  else {
                    if(temp456_thread_13 < 21){//sysj\plant.sysj line: 362, column: 16
                      System.out.println("");//sysj\plant.sysj line: 363, column: 8
                      System.out.println("Room temperature is too low at " + temp456_thread_13);//sysj\plant.sysj line: 364, column: 8
                      heatOnZone4_5_6.setPresent();//sysj\plant.sysj line: 365, column: 8
                      currsigs.addElement(heatOnZone4_5_6);
                      S60815=1;
                      active[13]=1;
                      ends[13]=1;
                      tdone[13]=1;
                    }
                    else {
                      System.out.println("");//sysj\plant.sysj line: 367, column: 7
                      System.out.println("Room temperature is safe at" + temp456_thread_13);//sysj\plant.sysj line: 368, column: 7
                      S60815=1;
                      active[13]=1;
                      ends[13]=1;
                      tdone[13]=1;
                    }
                  }
                }
                else {
                  S60815=1;
                  active[13]=1;
                  ends[13]=1;
                  tdone[13]=1;
                }
              }
            }
          }
        }
        else {
          if(zone_thread_13 == 2 || zone_thread_13 == 3){//sysj\plant.sysj line: 338, column: 8
            temp23_thread_13 = 0;//sysj\plant.sysj line: 339, column: 6
            temp23_thread_13 = (tempZone2_3.getpreval() == null ? null : ((Integer)tempZone2_3.getpreval()));//sysj\plant.sysj line: 340, column: 6
            if(temp23_thread_13 > 22){//sysj\plant.sysj line: 341, column: 9
              System.out.println("");//sysj\plant.sysj line: 342, column: 8
              System.out.println("Room temperature is too high at " + temp23_thread_13);//sysj\plant.sysj line: 343, column: 8
              airOnZone2_3.setPresent();//sysj\plant.sysj line: 344, column: 8
              currsigs.addElement(airOnZone2_3);
              if(zone_thread_13 == 4 || zone_thread_13 == 5 || zone_thread_13 == 6){//sysj\plant.sysj line: 355, column: 8
                temp456_thread_13 = 0;//sysj\plant.sysj line: 356, column: 6
                temp456_thread_13 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\plant.sysj line: 357, column: 6
                if(temp456_thread_13 > 22){//sysj\plant.sysj line: 358, column: 9
                  System.out.println("");//sysj\plant.sysj line: 359, column: 8
                  System.out.println("Room temperature is too high at " + temp456_thread_13);//sysj\plant.sysj line: 360, column: 8
                  airOnZone4_5_6.setPresent();//sysj\plant.sysj line: 361, column: 8
                  currsigs.addElement(airOnZone4_5_6);
                  S60815=1;
                  active[13]=1;
                  ends[13]=1;
                  tdone[13]=1;
                }
                else {
                  if(temp456_thread_13 < 21){//sysj\plant.sysj line: 362, column: 16
                    System.out.println("");//sysj\plant.sysj line: 363, column: 8
                    System.out.println("Room temperature is too low at " + temp456_thread_13);//sysj\plant.sysj line: 364, column: 8
                    heatOnZone4_5_6.setPresent();//sysj\plant.sysj line: 365, column: 8
                    currsigs.addElement(heatOnZone4_5_6);
                    S60815=1;
                    active[13]=1;
                    ends[13]=1;
                    tdone[13]=1;
                  }
                  else {
                    System.out.println("");//sysj\plant.sysj line: 367, column: 7
                    System.out.println("Room temperature is safe at" + temp456_thread_13);//sysj\plant.sysj line: 368, column: 7
                    S60815=1;
                    active[13]=1;
                    ends[13]=1;
                    tdone[13]=1;
                  }
                }
              }
              else {
                S60815=1;
                active[13]=1;
                ends[13]=1;
                tdone[13]=1;
              }
            }
            else {
              if(temp23_thread_13 < 21){//sysj\plant.sysj line: 345, column: 16
                heatOnZone2_3.setPresent();//sysj\plant.sysj line: 346, column: 8
                currsigs.addElement(heatOnZone2_3);
                if(zone_thread_13 == 4 || zone_thread_13 == 5 || zone_thread_13 == 6){//sysj\plant.sysj line: 355, column: 8
                  temp456_thread_13 = 0;//sysj\plant.sysj line: 356, column: 6
                  temp456_thread_13 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\plant.sysj line: 357, column: 6
                  if(temp456_thread_13 > 22){//sysj\plant.sysj line: 358, column: 9
                    System.out.println("");//sysj\plant.sysj line: 359, column: 8
                    System.out.println("Room temperature is too high at " + temp456_thread_13);//sysj\plant.sysj line: 360, column: 8
                    airOnZone4_5_6.setPresent();//sysj\plant.sysj line: 361, column: 8
                    currsigs.addElement(airOnZone4_5_6);
                    S60815=1;
                    active[13]=1;
                    ends[13]=1;
                    tdone[13]=1;
                  }
                  else {
                    if(temp456_thread_13 < 21){//sysj\plant.sysj line: 362, column: 16
                      System.out.println("");//sysj\plant.sysj line: 363, column: 8
                      System.out.println("Room temperature is too low at " + temp456_thread_13);//sysj\plant.sysj line: 364, column: 8
                      heatOnZone4_5_6.setPresent();//sysj\plant.sysj line: 365, column: 8
                      currsigs.addElement(heatOnZone4_5_6);
                      S60815=1;
                      active[13]=1;
                      ends[13]=1;
                      tdone[13]=1;
                    }
                    else {
                      System.out.println("");//sysj\plant.sysj line: 367, column: 7
                      System.out.println("Room temperature is safe at" + temp456_thread_13);//sysj\plant.sysj line: 368, column: 7
                      S60815=1;
                      active[13]=1;
                      ends[13]=1;
                      tdone[13]=1;
                    }
                  }
                }
                else {
                  S60815=1;
                  active[13]=1;
                  ends[13]=1;
                  tdone[13]=1;
                }
              }
              else {
                System.out.println("");//sysj\plant.sysj line: 348, column: 7
                System.out.println("Room temperature is safe at" + temp23_thread_13);//sysj\plant.sysj line: 349, column: 7
                if(zone_thread_13 == 4 || zone_thread_13 == 5 || zone_thread_13 == 6){//sysj\plant.sysj line: 355, column: 8
                  temp456_thread_13 = 0;//sysj\plant.sysj line: 356, column: 6
                  temp456_thread_13 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\plant.sysj line: 357, column: 6
                  if(temp456_thread_13 > 22){//sysj\plant.sysj line: 358, column: 9
                    System.out.println("");//sysj\plant.sysj line: 359, column: 8
                    System.out.println("Room temperature is too high at " + temp456_thread_13);//sysj\plant.sysj line: 360, column: 8
                    airOnZone4_5_6.setPresent();//sysj\plant.sysj line: 361, column: 8
                    currsigs.addElement(airOnZone4_5_6);
                    S60815=1;
                    active[13]=1;
                    ends[13]=1;
                    tdone[13]=1;
                  }
                  else {
                    if(temp456_thread_13 < 21){//sysj\plant.sysj line: 362, column: 16
                      System.out.println("");//sysj\plant.sysj line: 363, column: 8
                      System.out.println("Room temperature is too low at " + temp456_thread_13);//sysj\plant.sysj line: 364, column: 8
                      heatOnZone4_5_6.setPresent();//sysj\plant.sysj line: 365, column: 8
                      currsigs.addElement(heatOnZone4_5_6);
                      S60815=1;
                      active[13]=1;
                      ends[13]=1;
                      tdone[13]=1;
                    }
                    else {
                      System.out.println("");//sysj\plant.sysj line: 367, column: 7
                      System.out.println("Room temperature is safe at" + temp456_thread_13);//sysj\plant.sysj line: 368, column: 7
                      S60815=1;
                      active[13]=1;
                      ends[13]=1;
                      tdone[13]=1;
                    }
                  }
                }
                else {
                  S60815=1;
                  active[13]=1;
                  ends[13]=1;
                  tdone[13]=1;
                }
              }
            }
          }
          else {
            if(zone_thread_13 == 4 || zone_thread_13 == 5 || zone_thread_13 == 6){//sysj\plant.sysj line: 355, column: 8
              temp456_thread_13 = 0;//sysj\plant.sysj line: 356, column: 6
              temp456_thread_13 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\plant.sysj line: 357, column: 6
              if(temp456_thread_13 > 22){//sysj\plant.sysj line: 358, column: 9
                System.out.println("");//sysj\plant.sysj line: 359, column: 8
                System.out.println("Room temperature is too high at " + temp456_thread_13);//sysj\plant.sysj line: 360, column: 8
                airOnZone4_5_6.setPresent();//sysj\plant.sysj line: 361, column: 8
                currsigs.addElement(airOnZone4_5_6);
                S60815=1;
                active[13]=1;
                ends[13]=1;
                tdone[13]=1;
              }
              else {
                if(temp456_thread_13 < 21){//sysj\plant.sysj line: 362, column: 16
                  System.out.println("");//sysj\plant.sysj line: 363, column: 8
                  System.out.println("Room temperature is too low at " + temp456_thread_13);//sysj\plant.sysj line: 364, column: 8
                  heatOnZone4_5_6.setPresent();//sysj\plant.sysj line: 365, column: 8
                  currsigs.addElement(heatOnZone4_5_6);
                  S60815=1;
                  active[13]=1;
                  ends[13]=1;
                  tdone[13]=1;
                }
                else {
                  System.out.println("");//sysj\plant.sysj line: 367, column: 7
                  System.out.println("Room temperature is safe at" + temp456_thread_13);//sysj\plant.sysj line: 368, column: 7
                  S60815=1;
                  active[13]=1;
                  ends[13]=1;
                  tdone[13]=1;
                }
              }
            }
            else {
              S60815=1;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
          }
        }
      }
    }
    else {
      S60815=1;
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S66882){
        case 0 : 
          S66882=0;
          break RUN;
        
        case 1 : 
          S66882=2;
          S66882=2;
          new Thread(new ECS_GUI()).start();//sysj\plant.sysj line: 275, column: 2
          thread69530(tdone,ends);
          thread69531(tdone,ends);
          int biggest69555 = 0;
          if(ends[13]>=biggest69555){
            biggest69555=ends[13];
          }
          if(ends[14]>=biggest69555){
            biggest69555=ends[14];
          }
          if(biggest69555 == 1){
            active[12]=1;
            ends[12]=1;
            break RUN;
          }
        
        case 2 : 
          thread69556(tdone,ends);
          thread69557(tdone,ends);
          int biggest69581 = 0;
          if(ends[13]>=biggest69581){
            biggest69581=ends[13];
          }
          if(ends[14]>=biggest69581){
            biggest69581=ends[14];
          }
          if(biggest69581 == 1){
            active[12]=1;
            ends[12]=1;
            break RUN;
          }
          //FINXME code
          if(biggest69581 == 0){
            S66882=0;
            active[12]=0;
            ends[12]=0;
            S66882=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[12] != 0){
      int index = 12;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[12]!=0 || suspended[12]!=0 || active[12]!=1);
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
          fire.gethook();
          time.gethook();
          humanZ1.gethook();
          humanZ2.gethook();
          humanZ3.gethook();
          humanZ4.gethook();
          humanZ5.gethook();
          humanZ6.gethook();
          humanZ7.gethook();
          dust.gethook();
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
      fire.setpreclear();
      time.setpreclear();
      humanZ1.setpreclear();
      humanZ2.setpreclear();
      humanZ3.setpreclear();
      humanZ4.setpreclear();
      humanZ5.setpreclear();
      humanZ6.setpreclear();
      humanZ7.setpreclear();
      dust.setpreclear();
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
      cutPow.setpreclear();
      pow.setpreclear();
      fireExt.setpreclear();
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
      cutPow_TriggerE.setpreclear();
      fireExtE.setpreclear();
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
      dummyint = fire.getStatus() ? fire.setprepresent() : fire.setpreclear();
      fire.setpreval(fire.getValue());
      fire.setClear();
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
      cutPow.sethook();
      cutPow.setClear();
      pow.sethook();
      pow.setClear();
      fireExt.sethook();
      fireExt.setClear();
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
      cutPow_TriggerE.sethook();
      cutPow_TriggerE.setClear();
      fireExtE.sethook();
      fireExtE.setClear();
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
      if(paused[12]!=0 || suspended[12]!=0 || active[12]!=1);
      else{
        tempZone1_7.gethook();
        tempZone2_3.gethook();
        tempZone4_5_6.gethook();
        humidZone1_7.gethook();
        humidZone2_3.gethook();
        humidZone4_5_6.gethook();
        lightInt.gethook();
        selectedZone.gethook();
        fire.gethook();
        time.gethook();
        humanZ1.gethook();
        humanZ2.gethook();
        humanZ3.gethook();
        humanZ4.gethook();
        humanZ5.gethook();
        humanZ6.gethook();
        humanZ7.gethook();
        dust.gethook();
        powerOff.gethook();
        roomCleaned.gethook();
        alarmOff.gethook();
        safeOpTemp.gethook();
        safeOpHumid.gethook();
        run.gethook();
      }
      runFinisher();
      if(active[12] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
