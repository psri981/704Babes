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
  private long __start_thread_2;//sysj\ECS_plant.sysj line: 63, column: 25
  private Integer zone_thread_2;//sysj\ECS_plant.sysj line: 43, column: 5
  private Integer firePresent_thread_2;//sysj\ECS_plant.sysj line: 50, column: 5
  private Integer lightIntensity_thread_2;//sysj\ECS_plant.sysj line: 54, column: 5
  private String clock_thread_2;//sysj\ECS_plant.sysj line: 58, column: 5
  private Integer temp17_thread_2;//sysj\ECS_plant.sysj line: 80, column: 6
  private Integer temp23_thread_2;//sysj\ECS_plant.sysj line: 97, column: 6
  private Integer temp456_thread_2;//sysj\ECS_plant.sysj line: 114, column: 6
  private int S7423 = 1;
  private int S3640 = 1;
  private int S1356 = 1;
  private int S217 = 1;
  private int S221 = 1;
  private int S3818 = 1;
  private int S3648 = 1;
  private int S3656 = 1;
  private int S3664 = 1;
  private int S3672 = 1;
  private int S3680 = 1;
  private int S3688 = 1;
  private int S3696 = 1;
  private int S3704 = 1;
  private int S3712 = 1;
  private int S3720 = 1;
  private int S3728 = 1;
  private int S3736 = 1;
  private int S3744 = 1;
  private int S3752 = 1;
  private int S3760 = 1;
  private int S3768 = 1;
  private int S3776 = 1;
  private int S3784 = 1;
  private int S3792 = 1;
  private int S3800 = 1;
  private int S3808 = 1;
  private int S3816 = 1;
  
  private int[] ends = new int[26];
  private int[] tdone = new int[26];
  
  public void thread7474(int [] tdone, int [] ends){
        switch(S3816){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        if(cutPow.getprestatus()){//sysj\ECS_plant.sysj line: 178, column: 24
          cutPow_TriggerE.setPresent();//sysj\ECS_plant.sysj line: 178, column: 32
          currsigs.addElement(cutPow_TriggerE);
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

  public void thread7473(int [] tdone, int [] ends){
        switch(S3808){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        if(deHumOnZone4_5_6.getprestatus()){//sysj\ECS_plant.sysj line: 176, column: 24
          deHumOnZone4_5_6TriggerE.setPresent();//sysj\ECS_plant.sysj line: 176, column: 42
          currsigs.addElement(deHumOnZone4_5_6TriggerE);
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

  public void thread7472(int [] tdone, int [] ends){
        switch(S3800){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        if(deHumOnZone2_3.getprestatus()){//sysj\ECS_plant.sysj line: 174, column: 24
          deHumOnZone2_3TriggerE.setPresent();//sysj\ECS_plant.sysj line: 174, column: 40
          currsigs.addElement(deHumOnZone2_3TriggerE);
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

  public void thread7471(int [] tdone, int [] ends){
        switch(S3792){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        if(deHumOnZone1_7.getprestatus()){//sysj\ECS_plant.sysj line: 172, column: 24
          deHumOnZone1_7TriggerE.setPresent();//sysj\ECS_plant.sysj line: 172, column: 40
          currsigs.addElement(deHumOnZone1_7TriggerE);
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

  public void thread7470(int [] tdone, int [] ends){
        switch(S3784){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        if(humOnZone4_5_6.getprestatus()){//sysj\ECS_plant.sysj line: 170, column: 24
          humOnZone4_5_6TriggerE.setPresent();//sysj\ECS_plant.sysj line: 170, column: 40
          currsigs.addElement(humOnZone4_5_6TriggerE);
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

  public void thread7469(int [] tdone, int [] ends){
        switch(S3776){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        if(humOnZone2_3.getprestatus()){//sysj\ECS_plant.sysj line: 168, column: 24
          humOnZone2_3TriggerE.setPresent();//sysj\ECS_plant.sysj line: 168, column: 38
          currsigs.addElement(humOnZone2_3TriggerE);
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

  public void thread7468(int [] tdone, int [] ends){
        switch(S3768){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        if(humOnZone1_7.getprestatus()){//sysj\ECS_plant.sysj line: 166, column: 24
          humOnZone1_7TriggerE.setPresent();//sysj\ECS_plant.sysj line: 166, column: 38
          currsigs.addElement(humOnZone1_7TriggerE);
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

  public void thread7467(int [] tdone, int [] ends){
        switch(S3760){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        if(heatOnZone4_5_6.getprestatus()){//sysj\ECS_plant.sysj line: 164, column: 24
          heatOnZone4_5_6TriggerE.setPresent();//sysj\ECS_plant.sysj line: 164, column: 41
          currsigs.addElement(heatOnZone4_5_6TriggerE);
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

  public void thread7466(int [] tdone, int [] ends){
        switch(S3752){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        if(heatOnZone2_3.getprestatus()){//sysj\ECS_plant.sysj line: 162, column: 24
          heatOnZone2_3TriggerE.setPresent();//sysj\ECS_plant.sysj line: 162, column: 39
          currsigs.addElement(heatOnZone2_3TriggerE);
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

  public void thread7465(int [] tdone, int [] ends){
        switch(S3744){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        if(airOnZone4_5_6.getprestatus()){//sysj\ECS_plant.sysj line: 160, column: 24
          airOnZone4_5_6TriggerE.setPresent();//sysj\ECS_plant.sysj line: 160, column: 40
          currsigs.addElement(airOnZone4_5_6TriggerE);
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

  public void thread7464(int [] tdone, int [] ends){
        switch(S3736){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(airOnZone2_3.getprestatus()){//sysj\ECS_plant.sysj line: 158, column: 24
          airOnZone2_3TriggerE.setPresent();//sysj\ECS_plant.sysj line: 158, column: 38
          currsigs.addElement(airOnZone2_3TriggerE);
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

  public void thread7463(int [] tdone, int [] ends){
        switch(S3728){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(heatOnZone1_7.getprestatus()){//sysj\ECS_plant.sysj line: 156, column: 24
          heatOnZone1_7TriggerE.setPresent();//sysj\ECS_plant.sysj line: 156, column: 39
          currsigs.addElement(heatOnZone1_7TriggerE);
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

  public void thread7462(int [] tdone, int [] ends){
        switch(S3720){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(fanOnZone1_7.getprestatus()){//sysj\ECS_plant.sysj line: 154, column: 24
          fanOnZone1_7TriggerE.setPresent();//sysj\ECS_plant.sysj line: 154, column: 38
          currsigs.addElement(fanOnZone1_7TriggerE);
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

  public void thread7461(int [] tdone, int [] ends){
        switch(S3712){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(cleanZone7.getprestatus()){//sysj\ECS_plant.sysj line: 152, column: 24
          cleanZone7TriggerE.setPresent();//sysj\ECS_plant.sysj line: 152, column: 36
          currsigs.addElement(cleanZone7TriggerE);
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

  public void thread7460(int [] tdone, int [] ends){
        switch(S3704){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(cleanZone6.getprestatus()){//sysj\ECS_plant.sysj line: 150, column: 24
          cleanZone6TriggerE.setPresent();//sysj\ECS_plant.sysj line: 150, column: 36
          currsigs.addElement(cleanZone6TriggerE);
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

  public void thread7459(int [] tdone, int [] ends){
        switch(S3696){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(cleanZone5.getprestatus()){//sysj\ECS_plant.sysj line: 148, column: 24
          cleanZone5TriggerE.setPresent();//sysj\ECS_plant.sysj line: 148, column: 36
          currsigs.addElement(cleanZone5TriggerE);
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

  public void thread7458(int [] tdone, int [] ends){
        switch(S3688){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(cleanZone4.getprestatus()){//sysj\ECS_plant.sysj line: 146, column: 24
          cleanZone4TriggerE.setPresent();//sysj\ECS_plant.sysj line: 146, column: 36
          currsigs.addElement(cleanZone4TriggerE);
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

  public void thread7457(int [] tdone, int [] ends){
        switch(S3680){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(cleanZone3.getprestatus()){//sysj\ECS_plant.sysj line: 144, column: 24
          cleanZone3TriggerE.setPresent();//sysj\ECS_plant.sysj line: 144, column: 36
          currsigs.addElement(cleanZone3TriggerE);
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

  public void thread7456(int [] tdone, int [] ends){
        switch(S3672){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(cleanZone2.getprestatus()){//sysj\ECS_plant.sysj line: 142, column: 24
          cleanZone2TriggerE.setPresent();//sysj\ECS_plant.sysj line: 142, column: 36
          currsigs.addElement(cleanZone2TriggerE);
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

  public void thread7455(int [] tdone, int [] ends){
        switch(S3664){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(cleanZone1.getprestatus()){//sysj\ECS_plant.sysj line: 140, column: 24
          cleanZone1TriggerE.setPresent();//sysj\ECS_plant.sysj line: 140, column: 36
          currsigs.addElement(cleanZone1TriggerE);
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

  public void thread7454(int [] tdone, int [] ends){
        switch(S3656){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(fireExt.getprestatus()){//sysj\ECS_plant.sysj line: 138, column: 24
          fireExtE.setPresent();//sysj\ECS_plant.sysj line: 138, column: 33
          currsigs.addElement(fireExtE);
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

  public void thread7453(int [] tdone, int [] ends){
        switch(S3648){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        if(fireZone1.getprestatus()){//sysj\ECS_plant.sysj line: 136, column: 24
          alarmZone1TriggerE.setPresent();//sysj\ECS_plant.sysj line: 136, column: 35
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

  public void thread7452(int [] tdone, int [] ends){
        switch(S3818){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        thread7453(tdone,ends);
        thread7454(tdone,ends);
        thread7455(tdone,ends);
        thread7456(tdone,ends);
        thread7457(tdone,ends);
        thread7458(tdone,ends);
        thread7459(tdone,ends);
        thread7460(tdone,ends);
        thread7461(tdone,ends);
        thread7462(tdone,ends);
        thread7463(tdone,ends);
        thread7464(tdone,ends);
        thread7465(tdone,ends);
        thread7466(tdone,ends);
        thread7467(tdone,ends);
        thread7468(tdone,ends);
        thread7469(tdone,ends);
        thread7470(tdone,ends);
        thread7471(tdone,ends);
        thread7472(tdone,ends);
        thread7473(tdone,ends);
        thread7474(tdone,ends);
        int biggest7475 = 0;
        if(ends[4]>=biggest7475){
          biggest7475=ends[4];
        }
        if(ends[5]>=biggest7475){
          biggest7475=ends[5];
        }
        if(ends[6]>=biggest7475){
          biggest7475=ends[6];
        }
        if(ends[7]>=biggest7475){
          biggest7475=ends[7];
        }
        if(ends[8]>=biggest7475){
          biggest7475=ends[8];
        }
        if(ends[9]>=biggest7475){
          biggest7475=ends[9];
        }
        if(ends[10]>=biggest7475){
          biggest7475=ends[10];
        }
        if(ends[11]>=biggest7475){
          biggest7475=ends[11];
        }
        if(ends[12]>=biggest7475){
          biggest7475=ends[12];
        }
        if(ends[13]>=biggest7475){
          biggest7475=ends[13];
        }
        if(ends[14]>=biggest7475){
          biggest7475=ends[14];
        }
        if(ends[15]>=biggest7475){
          biggest7475=ends[15];
        }
        if(ends[16]>=biggest7475){
          biggest7475=ends[16];
        }
        if(ends[17]>=biggest7475){
          biggest7475=ends[17];
        }
        if(ends[18]>=biggest7475){
          biggest7475=ends[18];
        }
        if(ends[19]>=biggest7475){
          biggest7475=ends[19];
        }
        if(ends[20]>=biggest7475){
          biggest7475=ends[20];
        }
        if(ends[21]>=biggest7475){
          biggest7475=ends[21];
        }
        if(ends[22]>=biggest7475){
          biggest7475=ends[22];
        }
        if(ends[23]>=biggest7475){
          biggest7475=ends[23];
        }
        if(ends[24]>=biggest7475){
          biggest7475=ends[24];
        }
        if(ends[25]>=biggest7475){
          biggest7475=ends[25];
        }
        if(biggest7475 == 1){
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        //FINXME code
        if(biggest7475 == 0){
          S3818=0;
          active[3]=0;
          ends[3]=0;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread7451(int [] tdone, int [] ends){
        switch(S3640){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S1356){
          case 0 : 
            switch(S217){
              case 0 : 
                if(powerOff.getprestatus()){//sysj\ECS_plant.sysj line: 66, column: 12
                  S217=1;
                  __start_thread_2 = com.systemj.Timer.getMs();//sysj\ECS_plant.sysj line: 63, column: 25
                  S221=0;
                  if(com.systemj.Timer.getMs() - __start_thread_2 >= (2) * 1000){//sysj\ECS_plant.sysj line: 63, column: 25
                    ends[2]=2;
                    ;//sysj\ECS_plant.sysj line: 63, column: 25
                    System.out.println("Power turned off");//sysj\ECS_plant.sysj line: 68, column: 6
                    fireZone1.setPresent();//sysj\ECS_plant.sysj line: 69, column: 6
                    currsigs.addElement(fireZone1);
                    S217=2;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S221=1;
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
                switch(S221){
                  case 0 : 
                    S221=0;
                    if(com.systemj.Timer.getMs() - __start_thread_2 >= (2) * 1000){//sysj\ECS_plant.sysj line: 63, column: 25
                      ends[2]=2;
                      ;//sysj\ECS_plant.sysj line: 63, column: 25
                      System.out.println("Power turned off");//sysj\ECS_plant.sysj line: 68, column: 6
                      fireZone1.setPresent();//sysj\ECS_plant.sysj line: 69, column: 6
                      currsigs.addElement(fireZone1);
                      S217=2;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S221=1;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    break;
                  
                  case 1 : 
                    S221=1;
                    S221=0;
                    if(com.systemj.Timer.getMs() - __start_thread_2 >= (2) * 1000){//sysj\ECS_plant.sysj line: 63, column: 25
                      ends[2]=2;
                      ;//sysj\ECS_plant.sysj line: 63, column: 25
                      System.out.println("Power turned off");//sysj\ECS_plant.sysj line: 68, column: 6
                      fireZone1.setPresent();//sysj\ECS_plant.sysj line: 69, column: 6
                      currsigs.addElement(fireZone1);
                      S217=2;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S221=1;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    break;
                  
                }
                break;
              
              case 2 : 
                if(alarmOff.getprestatus()){//sysj\ECS_plant.sysj line: 70, column: 12
                  S217=3;
                  __start_thread_2 = com.systemj.Timer.getMs();//sysj\ECS_plant.sysj line: 63, column: 25
                  if(com.systemj.Timer.getMs() - __start_thread_2 >= (4) * 1000){//sysj\ECS_plant.sysj line: 63, column: 25
                    ends[2]=2;
                    ;//sysj\ECS_plant.sysj line: 63, column: 25
                    System.out.println("Alarm off, Fire out");//sysj\ECS_plant.sysj line: 72, column: 6
                    if(zone_thread_2 == 1 || zone_thread_2 == 7){//sysj\ECS_plant.sysj line: 79, column: 8
                      temp17_thread_2 = 0;//sysj\ECS_plant.sysj line: 80, column: 6
                      temp17_thread_2 = (tempZone1_7.getpreval() == null ? null : ((Integer)tempZone1_7.getpreval()));//sysj\ECS_plant.sysj line: 81, column: 6
                      if(temp17_thread_2 > 22){//sysj\ECS_plant.sysj line: 82, column: 9
                        System.out.println("");//sysj\ECS_plant.sysj line: 83, column: 8
                        System.out.println("Room temperature is too high at " + temp17_thread_2);//sysj\ECS_plant.sysj line: 84, column: 8
                        fanOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 85, column: 8
                        currsigs.addElement(fanOnZone1_7);
                        if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 96, column: 8
                          temp23_thread_2 = 0;//sysj\ECS_plant.sysj line: 97, column: 6
                          temp23_thread_2 = (tempZone2_3.getpreval() == null ? null : ((Integer)tempZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 98, column: 6
                          if(temp23_thread_2 > 22){//sysj\ECS_plant.sysj line: 99, column: 9
                            System.out.println("");//sysj\ECS_plant.sysj line: 100, column: 8
                            System.out.println("Room temperature is too high at " + temp23_thread_2);//sysj\ECS_plant.sysj line: 101, column: 8
                            airOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 102, column: 8
                            currsigs.addElement(airOnZone2_3);
                            if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 113, column: 8
                              temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 114, column: 6
                              temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 115, column: 6
                              if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 116, column: 9
                                System.out.println("");//sysj\ECS_plant.sysj line: 117, column: 8
                                System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 118, column: 8
                                airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 119, column: 8
                                currsigs.addElement(airOnZone4_5_6);
                                S1356=1;
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                              else {
                                if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 120, column: 16
                                  System.out.println("");//sysj\ECS_plant.sysj line: 121, column: 8
                                  System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 122, column: 8
                                  heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 123, column: 8
                                  currsigs.addElement(heatOnZone4_5_6);
                                  S1356=1;
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                                else {
                                  System.out.println("");//sysj\ECS_plant.sysj line: 125, column: 7
                                  System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 126, column: 7
                                  S1356=1;
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                              }
                            }
                            else {
                              S1356=1;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                          else {
                            if(temp23_thread_2 < 21){//sysj\ECS_plant.sysj line: 103, column: 16
                              heatOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 104, column: 8
                              currsigs.addElement(heatOnZone2_3);
                              if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 113, column: 8
                                temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 114, column: 6
                                temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 115, column: 6
                                if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 116, column: 9
                                  System.out.println("");//sysj\ECS_plant.sysj line: 117, column: 8
                                  System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 118, column: 8
                                  airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 119, column: 8
                                  currsigs.addElement(airOnZone4_5_6);
                                  S1356=1;
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                                else {
                                  if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 120, column: 16
                                    System.out.println("");//sysj\ECS_plant.sysj line: 121, column: 8
                                    System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 122, column: 8
                                    heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 123, column: 8
                                    currsigs.addElement(heatOnZone4_5_6);
                                    S1356=1;
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                  else {
                                    System.out.println("");//sysj\ECS_plant.sysj line: 125, column: 7
                                    System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 126, column: 7
                                    S1356=1;
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                }
                              }
                              else {
                                S1356=1;
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                            }
                            else {
                              System.out.println("");//sysj\ECS_plant.sysj line: 106, column: 7
                              System.out.println("Room temperature is safe at" + temp23_thread_2);//sysj\ECS_plant.sysj line: 107, column: 7
                              if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 113, column: 8
                                temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 114, column: 6
                                temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 115, column: 6
                                if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 116, column: 9
                                  System.out.println("");//sysj\ECS_plant.sysj line: 117, column: 8
                                  System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 118, column: 8
                                  airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 119, column: 8
                                  currsigs.addElement(airOnZone4_5_6);
                                  S1356=1;
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                                else {
                                  if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 120, column: 16
                                    System.out.println("");//sysj\ECS_plant.sysj line: 121, column: 8
                                    System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 122, column: 8
                                    heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 123, column: 8
                                    currsigs.addElement(heatOnZone4_5_6);
                                    S1356=1;
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                  else {
                                    System.out.println("");//sysj\ECS_plant.sysj line: 125, column: 7
                                    System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 126, column: 7
                                    S1356=1;
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                }
                              }
                              else {
                                S1356=1;
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                            }
                          }
                        }
                        else {
                          if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 113, column: 8
                            temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 114, column: 6
                            temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 115, column: 6
                            if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 116, column: 9
                              System.out.println("");//sysj\ECS_plant.sysj line: 117, column: 8
                              System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 118, column: 8
                              airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 119, column: 8
                              currsigs.addElement(airOnZone4_5_6);
                              S1356=1;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 120, column: 16
                                System.out.println("");//sysj\ECS_plant.sysj line: 121, column: 8
                                System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 122, column: 8
                                heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 123, column: 8
                                currsigs.addElement(heatOnZone4_5_6);
                                S1356=1;
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                              else {
                                System.out.println("");//sysj\ECS_plant.sysj line: 125, column: 7
                                System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 126, column: 7
                                S1356=1;
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                            }
                          }
                          else {
                            S1356=1;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                      }
                      else {
                        if(temp17_thread_2 < 21){//sysj\ECS_plant.sysj line: 86, column: 16
                          System.out.println("Room temperature is too low at " + temp17_thread_2);//sysj\ECS_plant.sysj line: 87, column: 8
                          heatOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 88, column: 8
                          currsigs.addElement(heatOnZone1_7);
                          if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 96, column: 8
                            temp23_thread_2 = 0;//sysj\ECS_plant.sysj line: 97, column: 6
                            temp23_thread_2 = (tempZone2_3.getpreval() == null ? null : ((Integer)tempZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 98, column: 6
                            if(temp23_thread_2 > 22){//sysj\ECS_plant.sysj line: 99, column: 9
                              System.out.println("");//sysj\ECS_plant.sysj line: 100, column: 8
                              System.out.println("Room temperature is too high at " + temp23_thread_2);//sysj\ECS_plant.sysj line: 101, column: 8
                              airOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 102, column: 8
                              currsigs.addElement(airOnZone2_3);
                              if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 113, column: 8
                                temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 114, column: 6
                                temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 115, column: 6
                                if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 116, column: 9
                                  System.out.println("");//sysj\ECS_plant.sysj line: 117, column: 8
                                  System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 118, column: 8
                                  airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 119, column: 8
                                  currsigs.addElement(airOnZone4_5_6);
                                  S1356=1;
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                                else {
                                  if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 120, column: 16
                                    System.out.println("");//sysj\ECS_plant.sysj line: 121, column: 8
                                    System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 122, column: 8
                                    heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 123, column: 8
                                    currsigs.addElement(heatOnZone4_5_6);
                                    S1356=1;
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                  else {
                                    System.out.println("");//sysj\ECS_plant.sysj line: 125, column: 7
                                    System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 126, column: 7
                                    S1356=1;
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                }
                              }
                              else {
                                S1356=1;
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                            }
                            else {
                              if(temp23_thread_2 < 21){//sysj\ECS_plant.sysj line: 103, column: 16
                                heatOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 104, column: 8
                                currsigs.addElement(heatOnZone2_3);
                                if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 113, column: 8
                                  temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 114, column: 6
                                  temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 115, column: 6
                                  if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 116, column: 9
                                    System.out.println("");//sysj\ECS_plant.sysj line: 117, column: 8
                                    System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 118, column: 8
                                    airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 119, column: 8
                                    currsigs.addElement(airOnZone4_5_6);
                                    S1356=1;
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                  else {
                                    if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 120, column: 16
                                      System.out.println("");//sysj\ECS_plant.sysj line: 121, column: 8
                                      System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 122, column: 8
                                      heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 123, column: 8
                                      currsigs.addElement(heatOnZone4_5_6);
                                      S1356=1;
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                    else {
                                      System.out.println("");//sysj\ECS_plant.sysj line: 125, column: 7
                                      System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 126, column: 7
                                      S1356=1;
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                  }
                                }
                                else {
                                  S1356=1;
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                              }
                              else {
                                System.out.println("");//sysj\ECS_plant.sysj line: 106, column: 7
                                System.out.println("Room temperature is safe at" + temp23_thread_2);//sysj\ECS_plant.sysj line: 107, column: 7
                                if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 113, column: 8
                                  temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 114, column: 6
                                  temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 115, column: 6
                                  if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 116, column: 9
                                    System.out.println("");//sysj\ECS_plant.sysj line: 117, column: 8
                                    System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 118, column: 8
                                    airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 119, column: 8
                                    currsigs.addElement(airOnZone4_5_6);
                                    S1356=1;
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                  else {
                                    if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 120, column: 16
                                      System.out.println("");//sysj\ECS_plant.sysj line: 121, column: 8
                                      System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 122, column: 8
                                      heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 123, column: 8
                                      currsigs.addElement(heatOnZone4_5_6);
                                      S1356=1;
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                    else {
                                      System.out.println("");//sysj\ECS_plant.sysj line: 125, column: 7
                                      System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 126, column: 7
                                      S1356=1;
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                  }
                                }
                                else {
                                  S1356=1;
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                              }
                            }
                          }
                          else {
                            if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 113, column: 8
                              temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 114, column: 6
                              temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 115, column: 6
                              if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 116, column: 9
                                System.out.println("");//sysj\ECS_plant.sysj line: 117, column: 8
                                System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 118, column: 8
                                airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 119, column: 8
                                currsigs.addElement(airOnZone4_5_6);
                                S1356=1;
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                              else {
                                if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 120, column: 16
                                  System.out.println("");//sysj\ECS_plant.sysj line: 121, column: 8
                                  System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 122, column: 8
                                  heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 123, column: 8
                                  currsigs.addElement(heatOnZone4_5_6);
                                  S1356=1;
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                                else {
                                  System.out.println("");//sysj\ECS_plant.sysj line: 125, column: 7
                                  System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 126, column: 7
                                  S1356=1;
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                              }
                            }
                            else {
                              S1356=1;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                        }
                        else {
                          System.out.println("");//sysj\ECS_plant.sysj line: 90, column: 7
                          System.out.println("Room temperature is safe at" + temp17_thread_2);//sysj\ECS_plant.sysj line: 91, column: 7
                          if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 96, column: 8
                            temp23_thread_2 = 0;//sysj\ECS_plant.sysj line: 97, column: 6
                            temp23_thread_2 = (tempZone2_3.getpreval() == null ? null : ((Integer)tempZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 98, column: 6
                            if(temp23_thread_2 > 22){//sysj\ECS_plant.sysj line: 99, column: 9
                              System.out.println("");//sysj\ECS_plant.sysj line: 100, column: 8
                              System.out.println("Room temperature is too high at " + temp23_thread_2);//sysj\ECS_plant.sysj line: 101, column: 8
                              airOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 102, column: 8
                              currsigs.addElement(airOnZone2_3);
                              if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 113, column: 8
                                temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 114, column: 6
                                temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 115, column: 6
                                if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 116, column: 9
                                  System.out.println("");//sysj\ECS_plant.sysj line: 117, column: 8
                                  System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 118, column: 8
                                  airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 119, column: 8
                                  currsigs.addElement(airOnZone4_5_6);
                                  S1356=1;
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                                else {
                                  if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 120, column: 16
                                    System.out.println("");//sysj\ECS_plant.sysj line: 121, column: 8
                                    System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 122, column: 8
                                    heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 123, column: 8
                                    currsigs.addElement(heatOnZone4_5_6);
                                    S1356=1;
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                  else {
                                    System.out.println("");//sysj\ECS_plant.sysj line: 125, column: 7
                                    System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 126, column: 7
                                    S1356=1;
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                }
                              }
                              else {
                                S1356=1;
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                            }
                            else {
                              if(temp23_thread_2 < 21){//sysj\ECS_plant.sysj line: 103, column: 16
                                heatOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 104, column: 8
                                currsigs.addElement(heatOnZone2_3);
                                if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 113, column: 8
                                  temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 114, column: 6
                                  temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 115, column: 6
                                  if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 116, column: 9
                                    System.out.println("");//sysj\ECS_plant.sysj line: 117, column: 8
                                    System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 118, column: 8
                                    airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 119, column: 8
                                    currsigs.addElement(airOnZone4_5_6);
                                    S1356=1;
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                  else {
                                    if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 120, column: 16
                                      System.out.println("");//sysj\ECS_plant.sysj line: 121, column: 8
                                      System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 122, column: 8
                                      heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 123, column: 8
                                      currsigs.addElement(heatOnZone4_5_6);
                                      S1356=1;
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                    else {
                                      System.out.println("");//sysj\ECS_plant.sysj line: 125, column: 7
                                      System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 126, column: 7
                                      S1356=1;
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                  }
                                }
                                else {
                                  S1356=1;
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                              }
                              else {
                                System.out.println("");//sysj\ECS_plant.sysj line: 106, column: 7
                                System.out.println("Room temperature is safe at" + temp23_thread_2);//sysj\ECS_plant.sysj line: 107, column: 7
                                if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 113, column: 8
                                  temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 114, column: 6
                                  temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 115, column: 6
                                  if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 116, column: 9
                                    System.out.println("");//sysj\ECS_plant.sysj line: 117, column: 8
                                    System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 118, column: 8
                                    airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 119, column: 8
                                    currsigs.addElement(airOnZone4_5_6);
                                    S1356=1;
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                  else {
                                    if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 120, column: 16
                                      System.out.println("");//sysj\ECS_plant.sysj line: 121, column: 8
                                      System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 122, column: 8
                                      heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 123, column: 8
                                      currsigs.addElement(heatOnZone4_5_6);
                                      S1356=1;
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                    else {
                                      System.out.println("");//sysj\ECS_plant.sysj line: 125, column: 7
                                      System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 126, column: 7
                                      S1356=1;
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                  }
                                }
                                else {
                                  S1356=1;
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                              }
                            }
                          }
                          else {
                            if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 113, column: 8
                              temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 114, column: 6
                              temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 115, column: 6
                              if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 116, column: 9
                                System.out.println("");//sysj\ECS_plant.sysj line: 117, column: 8
                                System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 118, column: 8
                                airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 119, column: 8
                                currsigs.addElement(airOnZone4_5_6);
                                S1356=1;
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                              else {
                                if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 120, column: 16
                                  System.out.println("");//sysj\ECS_plant.sysj line: 121, column: 8
                                  System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 122, column: 8
                                  heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 123, column: 8
                                  currsigs.addElement(heatOnZone4_5_6);
                                  S1356=1;
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                                else {
                                  System.out.println("");//sysj\ECS_plant.sysj line: 125, column: 7
                                  System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 126, column: 7
                                  S1356=1;
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                              }
                            }
                            else {
                              S1356=1;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                        }
                      }
                    }
                    else {
                      if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 96, column: 8
                        temp23_thread_2 = 0;//sysj\ECS_plant.sysj line: 97, column: 6
                        temp23_thread_2 = (tempZone2_3.getpreval() == null ? null : ((Integer)tempZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 98, column: 6
                        if(temp23_thread_2 > 22){//sysj\ECS_plant.sysj line: 99, column: 9
                          System.out.println("");//sysj\ECS_plant.sysj line: 100, column: 8
                          System.out.println("Room temperature is too high at " + temp23_thread_2);//sysj\ECS_plant.sysj line: 101, column: 8
                          airOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 102, column: 8
                          currsigs.addElement(airOnZone2_3);
                          if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 113, column: 8
                            temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 114, column: 6
                            temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 115, column: 6
                            if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 116, column: 9
                              System.out.println("");//sysj\ECS_plant.sysj line: 117, column: 8
                              System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 118, column: 8
                              airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 119, column: 8
                              currsigs.addElement(airOnZone4_5_6);
                              S1356=1;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 120, column: 16
                                System.out.println("");//sysj\ECS_plant.sysj line: 121, column: 8
                                System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 122, column: 8
                                heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 123, column: 8
                                currsigs.addElement(heatOnZone4_5_6);
                                S1356=1;
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                              else {
                                System.out.println("");//sysj\ECS_plant.sysj line: 125, column: 7
                                System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 126, column: 7
                                S1356=1;
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                            }
                          }
                          else {
                            S1356=1;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                        else {
                          if(temp23_thread_2 < 21){//sysj\ECS_plant.sysj line: 103, column: 16
                            heatOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 104, column: 8
                            currsigs.addElement(heatOnZone2_3);
                            if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 113, column: 8
                              temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 114, column: 6
                              temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 115, column: 6
                              if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 116, column: 9
                                System.out.println("");//sysj\ECS_plant.sysj line: 117, column: 8
                                System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 118, column: 8
                                airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 119, column: 8
                                currsigs.addElement(airOnZone4_5_6);
                                S1356=1;
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                              else {
                                if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 120, column: 16
                                  System.out.println("");//sysj\ECS_plant.sysj line: 121, column: 8
                                  System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 122, column: 8
                                  heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 123, column: 8
                                  currsigs.addElement(heatOnZone4_5_6);
                                  S1356=1;
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                                else {
                                  System.out.println("");//sysj\ECS_plant.sysj line: 125, column: 7
                                  System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 126, column: 7
                                  S1356=1;
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                              }
                            }
                            else {
                              S1356=1;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                          else {
                            System.out.println("");//sysj\ECS_plant.sysj line: 106, column: 7
                            System.out.println("Room temperature is safe at" + temp23_thread_2);//sysj\ECS_plant.sysj line: 107, column: 7
                            if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 113, column: 8
                              temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 114, column: 6
                              temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 115, column: 6
                              if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 116, column: 9
                                System.out.println("");//sysj\ECS_plant.sysj line: 117, column: 8
                                System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 118, column: 8
                                airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 119, column: 8
                                currsigs.addElement(airOnZone4_5_6);
                                S1356=1;
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                              else {
                                if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 120, column: 16
                                  System.out.println("");//sysj\ECS_plant.sysj line: 121, column: 8
                                  System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 122, column: 8
                                  heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 123, column: 8
                                  currsigs.addElement(heatOnZone4_5_6);
                                  S1356=1;
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                                else {
                                  System.out.println("");//sysj\ECS_plant.sysj line: 125, column: 7
                                  System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 126, column: 7
                                  S1356=1;
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                              }
                            }
                            else {
                              S1356=1;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                        }
                      }
                      else {
                        if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 113, column: 8
                          temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 114, column: 6
                          temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 115, column: 6
                          if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 116, column: 9
                            System.out.println("");//sysj\ECS_plant.sysj line: 117, column: 8
                            System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 118, column: 8
                            airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 119, column: 8
                            currsigs.addElement(airOnZone4_5_6);
                            S1356=1;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 120, column: 16
                              System.out.println("");//sysj\ECS_plant.sysj line: 121, column: 8
                              System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 122, column: 8
                              heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 123, column: 8
                              currsigs.addElement(heatOnZone4_5_6);
                              S1356=1;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              System.out.println("");//sysj\ECS_plant.sysj line: 125, column: 7
                              System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 126, column: 7
                              S1356=1;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                        }
                        else {
                          S1356=1;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
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
              
              case 3 : 
                if(com.systemj.Timer.getMs() - __start_thread_2 >= (4) * 1000){//sysj\ECS_plant.sysj line: 63, column: 25
                  ends[2]=2;
                  ;//sysj\ECS_plant.sysj line: 63, column: 25
                  System.out.println("Alarm off, Fire out");//sysj\ECS_plant.sysj line: 72, column: 6
                  if(zone_thread_2 == 1 || zone_thread_2 == 7){//sysj\ECS_plant.sysj line: 79, column: 8
                    temp17_thread_2 = 0;//sysj\ECS_plant.sysj line: 80, column: 6
                    temp17_thread_2 = (tempZone1_7.getpreval() == null ? null : ((Integer)tempZone1_7.getpreval()));//sysj\ECS_plant.sysj line: 81, column: 6
                    if(temp17_thread_2 > 22){//sysj\ECS_plant.sysj line: 82, column: 9
                      System.out.println("");//sysj\ECS_plant.sysj line: 83, column: 8
                      System.out.println("Room temperature is too high at " + temp17_thread_2);//sysj\ECS_plant.sysj line: 84, column: 8
                      fanOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 85, column: 8
                      currsigs.addElement(fanOnZone1_7);
                      if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 96, column: 8
                        temp23_thread_2 = 0;//sysj\ECS_plant.sysj line: 97, column: 6
                        temp23_thread_2 = (tempZone2_3.getpreval() == null ? null : ((Integer)tempZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 98, column: 6
                        if(temp23_thread_2 > 22){//sysj\ECS_plant.sysj line: 99, column: 9
                          System.out.println("");//sysj\ECS_plant.sysj line: 100, column: 8
                          System.out.println("Room temperature is too high at " + temp23_thread_2);//sysj\ECS_plant.sysj line: 101, column: 8
                          airOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 102, column: 8
                          currsigs.addElement(airOnZone2_3);
                          if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 113, column: 8
                            temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 114, column: 6
                            temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 115, column: 6
                            if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 116, column: 9
                              System.out.println("");//sysj\ECS_plant.sysj line: 117, column: 8
                              System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 118, column: 8
                              airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 119, column: 8
                              currsigs.addElement(airOnZone4_5_6);
                              S1356=1;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 120, column: 16
                                System.out.println("");//sysj\ECS_plant.sysj line: 121, column: 8
                                System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 122, column: 8
                                heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 123, column: 8
                                currsigs.addElement(heatOnZone4_5_6);
                                S1356=1;
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                              else {
                                System.out.println("");//sysj\ECS_plant.sysj line: 125, column: 7
                                System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 126, column: 7
                                S1356=1;
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                            }
                          }
                          else {
                            S1356=1;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                        else {
                          if(temp23_thread_2 < 21){//sysj\ECS_plant.sysj line: 103, column: 16
                            heatOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 104, column: 8
                            currsigs.addElement(heatOnZone2_3);
                            if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 113, column: 8
                              temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 114, column: 6
                              temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 115, column: 6
                              if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 116, column: 9
                                System.out.println("");//sysj\ECS_plant.sysj line: 117, column: 8
                                System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 118, column: 8
                                airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 119, column: 8
                                currsigs.addElement(airOnZone4_5_6);
                                S1356=1;
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                              else {
                                if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 120, column: 16
                                  System.out.println("");//sysj\ECS_plant.sysj line: 121, column: 8
                                  System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 122, column: 8
                                  heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 123, column: 8
                                  currsigs.addElement(heatOnZone4_5_6);
                                  S1356=1;
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                                else {
                                  System.out.println("");//sysj\ECS_plant.sysj line: 125, column: 7
                                  System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 126, column: 7
                                  S1356=1;
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                              }
                            }
                            else {
                              S1356=1;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                          else {
                            System.out.println("");//sysj\ECS_plant.sysj line: 106, column: 7
                            System.out.println("Room temperature is safe at" + temp23_thread_2);//sysj\ECS_plant.sysj line: 107, column: 7
                            if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 113, column: 8
                              temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 114, column: 6
                              temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 115, column: 6
                              if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 116, column: 9
                                System.out.println("");//sysj\ECS_plant.sysj line: 117, column: 8
                                System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 118, column: 8
                                airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 119, column: 8
                                currsigs.addElement(airOnZone4_5_6);
                                S1356=1;
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                              else {
                                if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 120, column: 16
                                  System.out.println("");//sysj\ECS_plant.sysj line: 121, column: 8
                                  System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 122, column: 8
                                  heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 123, column: 8
                                  currsigs.addElement(heatOnZone4_5_6);
                                  S1356=1;
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                                else {
                                  System.out.println("");//sysj\ECS_plant.sysj line: 125, column: 7
                                  System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 126, column: 7
                                  S1356=1;
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                              }
                            }
                            else {
                              S1356=1;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                        }
                      }
                      else {
                        if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 113, column: 8
                          temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 114, column: 6
                          temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 115, column: 6
                          if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 116, column: 9
                            System.out.println("");//sysj\ECS_plant.sysj line: 117, column: 8
                            System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 118, column: 8
                            airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 119, column: 8
                            currsigs.addElement(airOnZone4_5_6);
                            S1356=1;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 120, column: 16
                              System.out.println("");//sysj\ECS_plant.sysj line: 121, column: 8
                              System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 122, column: 8
                              heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 123, column: 8
                              currsigs.addElement(heatOnZone4_5_6);
                              S1356=1;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              System.out.println("");//sysj\ECS_plant.sysj line: 125, column: 7
                              System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 126, column: 7
                              S1356=1;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                        }
                        else {
                          S1356=1;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                      }
                    }
                    else {
                      if(temp17_thread_2 < 21){//sysj\ECS_plant.sysj line: 86, column: 16
                        System.out.println("Room temperature is too low at " + temp17_thread_2);//sysj\ECS_plant.sysj line: 87, column: 8
                        heatOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 88, column: 8
                        currsigs.addElement(heatOnZone1_7);
                        if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 96, column: 8
                          temp23_thread_2 = 0;//sysj\ECS_plant.sysj line: 97, column: 6
                          temp23_thread_2 = (tempZone2_3.getpreval() == null ? null : ((Integer)tempZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 98, column: 6
                          if(temp23_thread_2 > 22){//sysj\ECS_plant.sysj line: 99, column: 9
                            System.out.println("");//sysj\ECS_plant.sysj line: 100, column: 8
                            System.out.println("Room temperature is too high at " + temp23_thread_2);//sysj\ECS_plant.sysj line: 101, column: 8
                            airOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 102, column: 8
                            currsigs.addElement(airOnZone2_3);
                            if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 113, column: 8
                              temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 114, column: 6
                              temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 115, column: 6
                              if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 116, column: 9
                                System.out.println("");//sysj\ECS_plant.sysj line: 117, column: 8
                                System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 118, column: 8
                                airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 119, column: 8
                                currsigs.addElement(airOnZone4_5_6);
                                S1356=1;
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                              else {
                                if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 120, column: 16
                                  System.out.println("");//sysj\ECS_plant.sysj line: 121, column: 8
                                  System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 122, column: 8
                                  heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 123, column: 8
                                  currsigs.addElement(heatOnZone4_5_6);
                                  S1356=1;
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                                else {
                                  System.out.println("");//sysj\ECS_plant.sysj line: 125, column: 7
                                  System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 126, column: 7
                                  S1356=1;
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                              }
                            }
                            else {
                              S1356=1;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                          else {
                            if(temp23_thread_2 < 21){//sysj\ECS_plant.sysj line: 103, column: 16
                              heatOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 104, column: 8
                              currsigs.addElement(heatOnZone2_3);
                              if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 113, column: 8
                                temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 114, column: 6
                                temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 115, column: 6
                                if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 116, column: 9
                                  System.out.println("");//sysj\ECS_plant.sysj line: 117, column: 8
                                  System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 118, column: 8
                                  airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 119, column: 8
                                  currsigs.addElement(airOnZone4_5_6);
                                  S1356=1;
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                                else {
                                  if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 120, column: 16
                                    System.out.println("");//sysj\ECS_plant.sysj line: 121, column: 8
                                    System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 122, column: 8
                                    heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 123, column: 8
                                    currsigs.addElement(heatOnZone4_5_6);
                                    S1356=1;
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                  else {
                                    System.out.println("");//sysj\ECS_plant.sysj line: 125, column: 7
                                    System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 126, column: 7
                                    S1356=1;
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                }
                              }
                              else {
                                S1356=1;
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                            }
                            else {
                              System.out.println("");//sysj\ECS_plant.sysj line: 106, column: 7
                              System.out.println("Room temperature is safe at" + temp23_thread_2);//sysj\ECS_plant.sysj line: 107, column: 7
                              if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 113, column: 8
                                temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 114, column: 6
                                temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 115, column: 6
                                if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 116, column: 9
                                  System.out.println("");//sysj\ECS_plant.sysj line: 117, column: 8
                                  System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 118, column: 8
                                  airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 119, column: 8
                                  currsigs.addElement(airOnZone4_5_6);
                                  S1356=1;
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                                else {
                                  if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 120, column: 16
                                    System.out.println("");//sysj\ECS_plant.sysj line: 121, column: 8
                                    System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 122, column: 8
                                    heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 123, column: 8
                                    currsigs.addElement(heatOnZone4_5_6);
                                    S1356=1;
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                  else {
                                    System.out.println("");//sysj\ECS_plant.sysj line: 125, column: 7
                                    System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 126, column: 7
                                    S1356=1;
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                }
                              }
                              else {
                                S1356=1;
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                            }
                          }
                        }
                        else {
                          if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 113, column: 8
                            temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 114, column: 6
                            temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 115, column: 6
                            if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 116, column: 9
                              System.out.println("");//sysj\ECS_plant.sysj line: 117, column: 8
                              System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 118, column: 8
                              airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 119, column: 8
                              currsigs.addElement(airOnZone4_5_6);
                              S1356=1;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 120, column: 16
                                System.out.println("");//sysj\ECS_plant.sysj line: 121, column: 8
                                System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 122, column: 8
                                heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 123, column: 8
                                currsigs.addElement(heatOnZone4_5_6);
                                S1356=1;
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                              else {
                                System.out.println("");//sysj\ECS_plant.sysj line: 125, column: 7
                                System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 126, column: 7
                                S1356=1;
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                            }
                          }
                          else {
                            S1356=1;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                      }
                      else {
                        System.out.println("");//sysj\ECS_plant.sysj line: 90, column: 7
                        System.out.println("Room temperature is safe at" + temp17_thread_2);//sysj\ECS_plant.sysj line: 91, column: 7
                        if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 96, column: 8
                          temp23_thread_2 = 0;//sysj\ECS_plant.sysj line: 97, column: 6
                          temp23_thread_2 = (tempZone2_3.getpreval() == null ? null : ((Integer)tempZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 98, column: 6
                          if(temp23_thread_2 > 22){//sysj\ECS_plant.sysj line: 99, column: 9
                            System.out.println("");//sysj\ECS_plant.sysj line: 100, column: 8
                            System.out.println("Room temperature is too high at " + temp23_thread_2);//sysj\ECS_plant.sysj line: 101, column: 8
                            airOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 102, column: 8
                            currsigs.addElement(airOnZone2_3);
                            if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 113, column: 8
                              temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 114, column: 6
                              temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 115, column: 6
                              if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 116, column: 9
                                System.out.println("");//sysj\ECS_plant.sysj line: 117, column: 8
                                System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 118, column: 8
                                airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 119, column: 8
                                currsigs.addElement(airOnZone4_5_6);
                                S1356=1;
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                              else {
                                if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 120, column: 16
                                  System.out.println("");//sysj\ECS_plant.sysj line: 121, column: 8
                                  System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 122, column: 8
                                  heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 123, column: 8
                                  currsigs.addElement(heatOnZone4_5_6);
                                  S1356=1;
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                                else {
                                  System.out.println("");//sysj\ECS_plant.sysj line: 125, column: 7
                                  System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 126, column: 7
                                  S1356=1;
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                              }
                            }
                            else {
                              S1356=1;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                          else {
                            if(temp23_thread_2 < 21){//sysj\ECS_plant.sysj line: 103, column: 16
                              heatOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 104, column: 8
                              currsigs.addElement(heatOnZone2_3);
                              if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 113, column: 8
                                temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 114, column: 6
                                temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 115, column: 6
                                if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 116, column: 9
                                  System.out.println("");//sysj\ECS_plant.sysj line: 117, column: 8
                                  System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 118, column: 8
                                  airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 119, column: 8
                                  currsigs.addElement(airOnZone4_5_6);
                                  S1356=1;
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                                else {
                                  if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 120, column: 16
                                    System.out.println("");//sysj\ECS_plant.sysj line: 121, column: 8
                                    System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 122, column: 8
                                    heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 123, column: 8
                                    currsigs.addElement(heatOnZone4_5_6);
                                    S1356=1;
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                  else {
                                    System.out.println("");//sysj\ECS_plant.sysj line: 125, column: 7
                                    System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 126, column: 7
                                    S1356=1;
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                }
                              }
                              else {
                                S1356=1;
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                            }
                            else {
                              System.out.println("");//sysj\ECS_plant.sysj line: 106, column: 7
                              System.out.println("Room temperature is safe at" + temp23_thread_2);//sysj\ECS_plant.sysj line: 107, column: 7
                              if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 113, column: 8
                                temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 114, column: 6
                                temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 115, column: 6
                                if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 116, column: 9
                                  System.out.println("");//sysj\ECS_plant.sysj line: 117, column: 8
                                  System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 118, column: 8
                                  airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 119, column: 8
                                  currsigs.addElement(airOnZone4_5_6);
                                  S1356=1;
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                                else {
                                  if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 120, column: 16
                                    System.out.println("");//sysj\ECS_plant.sysj line: 121, column: 8
                                    System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 122, column: 8
                                    heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 123, column: 8
                                    currsigs.addElement(heatOnZone4_5_6);
                                    S1356=1;
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                  else {
                                    System.out.println("");//sysj\ECS_plant.sysj line: 125, column: 7
                                    System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 126, column: 7
                                    S1356=1;
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                }
                              }
                              else {
                                S1356=1;
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                            }
                          }
                        }
                        else {
                          if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 113, column: 8
                            temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 114, column: 6
                            temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 115, column: 6
                            if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 116, column: 9
                              System.out.println("");//sysj\ECS_plant.sysj line: 117, column: 8
                              System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 118, column: 8
                              airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 119, column: 8
                              currsigs.addElement(airOnZone4_5_6);
                              S1356=1;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 120, column: 16
                                System.out.println("");//sysj\ECS_plant.sysj line: 121, column: 8
                                System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 122, column: 8
                                heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 123, column: 8
                                currsigs.addElement(heatOnZone4_5_6);
                                S1356=1;
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                              else {
                                System.out.println("");//sysj\ECS_plant.sysj line: 125, column: 7
                                System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 126, column: 7
                                S1356=1;
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                            }
                          }
                          else {
                            S1356=1;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                      }
                    }
                  }
                  else {
                    if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 96, column: 8
                      temp23_thread_2 = 0;//sysj\ECS_plant.sysj line: 97, column: 6
                      temp23_thread_2 = (tempZone2_3.getpreval() == null ? null : ((Integer)tempZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 98, column: 6
                      if(temp23_thread_2 > 22){//sysj\ECS_plant.sysj line: 99, column: 9
                        System.out.println("");//sysj\ECS_plant.sysj line: 100, column: 8
                        System.out.println("Room temperature is too high at " + temp23_thread_2);//sysj\ECS_plant.sysj line: 101, column: 8
                        airOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 102, column: 8
                        currsigs.addElement(airOnZone2_3);
                        if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 113, column: 8
                          temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 114, column: 6
                          temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 115, column: 6
                          if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 116, column: 9
                            System.out.println("");//sysj\ECS_plant.sysj line: 117, column: 8
                            System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 118, column: 8
                            airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 119, column: 8
                            currsigs.addElement(airOnZone4_5_6);
                            S1356=1;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 120, column: 16
                              System.out.println("");//sysj\ECS_plant.sysj line: 121, column: 8
                              System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 122, column: 8
                              heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 123, column: 8
                              currsigs.addElement(heatOnZone4_5_6);
                              S1356=1;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              System.out.println("");//sysj\ECS_plant.sysj line: 125, column: 7
                              System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 126, column: 7
                              S1356=1;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                        }
                        else {
                          S1356=1;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                      }
                      else {
                        if(temp23_thread_2 < 21){//sysj\ECS_plant.sysj line: 103, column: 16
                          heatOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 104, column: 8
                          currsigs.addElement(heatOnZone2_3);
                          if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 113, column: 8
                            temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 114, column: 6
                            temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 115, column: 6
                            if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 116, column: 9
                              System.out.println("");//sysj\ECS_plant.sysj line: 117, column: 8
                              System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 118, column: 8
                              airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 119, column: 8
                              currsigs.addElement(airOnZone4_5_6);
                              S1356=1;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 120, column: 16
                                System.out.println("");//sysj\ECS_plant.sysj line: 121, column: 8
                                System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 122, column: 8
                                heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 123, column: 8
                                currsigs.addElement(heatOnZone4_5_6);
                                S1356=1;
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                              else {
                                System.out.println("");//sysj\ECS_plant.sysj line: 125, column: 7
                                System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 126, column: 7
                                S1356=1;
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                            }
                          }
                          else {
                            S1356=1;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                        else {
                          System.out.println("");//sysj\ECS_plant.sysj line: 106, column: 7
                          System.out.println("Room temperature is safe at" + temp23_thread_2);//sysj\ECS_plant.sysj line: 107, column: 7
                          if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 113, column: 8
                            temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 114, column: 6
                            temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 115, column: 6
                            if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 116, column: 9
                              System.out.println("");//sysj\ECS_plant.sysj line: 117, column: 8
                              System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 118, column: 8
                              airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 119, column: 8
                              currsigs.addElement(airOnZone4_5_6);
                              S1356=1;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 120, column: 16
                                System.out.println("");//sysj\ECS_plant.sysj line: 121, column: 8
                                System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 122, column: 8
                                heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 123, column: 8
                                currsigs.addElement(heatOnZone4_5_6);
                                S1356=1;
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                              else {
                                System.out.println("");//sysj\ECS_plant.sysj line: 125, column: 7
                                System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 126, column: 7
                                S1356=1;
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                            }
                          }
                          else {
                            S1356=1;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                      }
                    }
                    else {
                      if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 113, column: 8
                        temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 114, column: 6
                        temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 115, column: 6
                        if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 116, column: 9
                          System.out.println("");//sysj\ECS_plant.sysj line: 117, column: 8
                          System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 118, column: 8
                          airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 119, column: 8
                          currsigs.addElement(airOnZone4_5_6);
                          S1356=1;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 120, column: 16
                            System.out.println("");//sysj\ECS_plant.sysj line: 121, column: 8
                            System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 122, column: 8
                            heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 123, column: 8
                            currsigs.addElement(heatOnZone4_5_6);
                            S1356=1;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            System.out.println("");//sysj\ECS_plant.sysj line: 125, column: 7
                            System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 126, column: 7
                            S1356=1;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                      }
                      else {
                        S1356=1;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
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
            S1356=1;
            S1356=0;
            if(run.getprestatus()){//sysj\ECS_plant.sysj line: 40, column: 12
              zone_thread_2 = 0;//sysj\ECS_plant.sysj line: 43, column: 5
              zone_thread_2 = (selectedZone.getpreval() == null ? null : ((Integer)selectedZone.getpreval()));//sysj\ECS_plant.sysj line: 44, column: 5
              System.out.println("");//sysj\ECS_plant.sysj line: 46, column: 5
              System.out.println("Plant knows zone selected is: " + zone_thread_2);//sysj\ECS_plant.sysj line: 47, column: 5
              firePresent_thread_2 = 0;//sysj\ECS_plant.sysj line: 50, column: 5
              firePresent_thread_2 = (fire.getpreval() == null ? null : ((Integer)fire.getpreval()));//sysj\ECS_plant.sysj line: 51, column: 5
              lightIntensity_thread_2 = 0;//sysj\ECS_plant.sysj line: 54, column: 5
              lightIntensity_thread_2 = (lightInt.getpreval() == null ? null : ((Integer)lightInt.getpreval()));//sysj\ECS_plant.sysj line: 55, column: 5
              clock_thread_2 = "";//sysj\ECS_plant.sysj line: 58, column: 5
              clock_thread_2 = (time.getpreval() == null ? null : ((String)time.getpreval()));//sysj\ECS_plant.sysj line: 59, column: 5
              if(firePresent_thread_2 == 1){//sysj\ECS_plant.sysj line: 63, column: 8
                System.out.println("THERE IS A FIRE IN ZONE " + zone_thread_2 + " SEND EVACUATION SIGNAL TO ACS");//sysj\ECS_plant.sysj line: 64, column: 6
                cutPow.setPresent();//sysj\ECS_plant.sysj line: 65, column: 6
                currsigs.addElement(cutPow);
                S217=0;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                if(zone_thread_2 == 1 || zone_thread_2 == 7){//sysj\ECS_plant.sysj line: 79, column: 8
                  temp17_thread_2 = 0;//sysj\ECS_plant.sysj line: 80, column: 6
                  temp17_thread_2 = (tempZone1_7.getpreval() == null ? null : ((Integer)tempZone1_7.getpreval()));//sysj\ECS_plant.sysj line: 81, column: 6
                  if(temp17_thread_2 > 22){//sysj\ECS_plant.sysj line: 82, column: 9
                    System.out.println("");//sysj\ECS_plant.sysj line: 83, column: 8
                    System.out.println("Room temperature is too high at " + temp17_thread_2);//sysj\ECS_plant.sysj line: 84, column: 8
                    fanOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 85, column: 8
                    currsigs.addElement(fanOnZone1_7);
                    if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 96, column: 8
                      temp23_thread_2 = 0;//sysj\ECS_plant.sysj line: 97, column: 6
                      temp23_thread_2 = (tempZone2_3.getpreval() == null ? null : ((Integer)tempZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 98, column: 6
                      if(temp23_thread_2 > 22){//sysj\ECS_plant.sysj line: 99, column: 9
                        System.out.println("");//sysj\ECS_plant.sysj line: 100, column: 8
                        System.out.println("Room temperature is too high at " + temp23_thread_2);//sysj\ECS_plant.sysj line: 101, column: 8
                        airOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 102, column: 8
                        currsigs.addElement(airOnZone2_3);
                        if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 113, column: 8
                          temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 114, column: 6
                          temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 115, column: 6
                          if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 116, column: 9
                            System.out.println("");//sysj\ECS_plant.sysj line: 117, column: 8
                            System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 118, column: 8
                            airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 119, column: 8
                            currsigs.addElement(airOnZone4_5_6);
                            S1356=1;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 120, column: 16
                              System.out.println("");//sysj\ECS_plant.sysj line: 121, column: 8
                              System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 122, column: 8
                              heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 123, column: 8
                              currsigs.addElement(heatOnZone4_5_6);
                              S1356=1;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              System.out.println("");//sysj\ECS_plant.sysj line: 125, column: 7
                              System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 126, column: 7
                              S1356=1;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                        }
                        else {
                          S1356=1;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                      }
                      else {
                        if(temp23_thread_2 < 21){//sysj\ECS_plant.sysj line: 103, column: 16
                          heatOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 104, column: 8
                          currsigs.addElement(heatOnZone2_3);
                          if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 113, column: 8
                            temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 114, column: 6
                            temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 115, column: 6
                            if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 116, column: 9
                              System.out.println("");//sysj\ECS_plant.sysj line: 117, column: 8
                              System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 118, column: 8
                              airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 119, column: 8
                              currsigs.addElement(airOnZone4_5_6);
                              S1356=1;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 120, column: 16
                                System.out.println("");//sysj\ECS_plant.sysj line: 121, column: 8
                                System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 122, column: 8
                                heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 123, column: 8
                                currsigs.addElement(heatOnZone4_5_6);
                                S1356=1;
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                              else {
                                System.out.println("");//sysj\ECS_plant.sysj line: 125, column: 7
                                System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 126, column: 7
                                S1356=1;
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                            }
                          }
                          else {
                            S1356=1;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                        else {
                          System.out.println("");//sysj\ECS_plant.sysj line: 106, column: 7
                          System.out.println("Room temperature is safe at" + temp23_thread_2);//sysj\ECS_plant.sysj line: 107, column: 7
                          if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 113, column: 8
                            temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 114, column: 6
                            temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 115, column: 6
                            if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 116, column: 9
                              System.out.println("");//sysj\ECS_plant.sysj line: 117, column: 8
                              System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 118, column: 8
                              airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 119, column: 8
                              currsigs.addElement(airOnZone4_5_6);
                              S1356=1;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 120, column: 16
                                System.out.println("");//sysj\ECS_plant.sysj line: 121, column: 8
                                System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 122, column: 8
                                heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 123, column: 8
                                currsigs.addElement(heatOnZone4_5_6);
                                S1356=1;
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                              else {
                                System.out.println("");//sysj\ECS_plant.sysj line: 125, column: 7
                                System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 126, column: 7
                                S1356=1;
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                            }
                          }
                          else {
                            S1356=1;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                      }
                    }
                    else {
                      if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 113, column: 8
                        temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 114, column: 6
                        temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 115, column: 6
                        if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 116, column: 9
                          System.out.println("");//sysj\ECS_plant.sysj line: 117, column: 8
                          System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 118, column: 8
                          airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 119, column: 8
                          currsigs.addElement(airOnZone4_5_6);
                          S1356=1;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 120, column: 16
                            System.out.println("");//sysj\ECS_plant.sysj line: 121, column: 8
                            System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 122, column: 8
                            heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 123, column: 8
                            currsigs.addElement(heatOnZone4_5_6);
                            S1356=1;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            System.out.println("");//sysj\ECS_plant.sysj line: 125, column: 7
                            System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 126, column: 7
                            S1356=1;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                      }
                      else {
                        S1356=1;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                    }
                  }
                  else {
                    if(temp17_thread_2 < 21){//sysj\ECS_plant.sysj line: 86, column: 16
                      System.out.println("Room temperature is too low at " + temp17_thread_2);//sysj\ECS_plant.sysj line: 87, column: 8
                      heatOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 88, column: 8
                      currsigs.addElement(heatOnZone1_7);
                      if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 96, column: 8
                        temp23_thread_2 = 0;//sysj\ECS_plant.sysj line: 97, column: 6
                        temp23_thread_2 = (tempZone2_3.getpreval() == null ? null : ((Integer)tempZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 98, column: 6
                        if(temp23_thread_2 > 22){//sysj\ECS_plant.sysj line: 99, column: 9
                          System.out.println("");//sysj\ECS_plant.sysj line: 100, column: 8
                          System.out.println("Room temperature is too high at " + temp23_thread_2);//sysj\ECS_plant.sysj line: 101, column: 8
                          airOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 102, column: 8
                          currsigs.addElement(airOnZone2_3);
                          if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 113, column: 8
                            temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 114, column: 6
                            temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 115, column: 6
                            if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 116, column: 9
                              System.out.println("");//sysj\ECS_plant.sysj line: 117, column: 8
                              System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 118, column: 8
                              airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 119, column: 8
                              currsigs.addElement(airOnZone4_5_6);
                              S1356=1;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 120, column: 16
                                System.out.println("");//sysj\ECS_plant.sysj line: 121, column: 8
                                System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 122, column: 8
                                heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 123, column: 8
                                currsigs.addElement(heatOnZone4_5_6);
                                S1356=1;
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                              else {
                                System.out.println("");//sysj\ECS_plant.sysj line: 125, column: 7
                                System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 126, column: 7
                                S1356=1;
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                            }
                          }
                          else {
                            S1356=1;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                        else {
                          if(temp23_thread_2 < 21){//sysj\ECS_plant.sysj line: 103, column: 16
                            heatOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 104, column: 8
                            currsigs.addElement(heatOnZone2_3);
                            if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 113, column: 8
                              temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 114, column: 6
                              temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 115, column: 6
                              if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 116, column: 9
                                System.out.println("");//sysj\ECS_plant.sysj line: 117, column: 8
                                System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 118, column: 8
                                airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 119, column: 8
                                currsigs.addElement(airOnZone4_5_6);
                                S1356=1;
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                              else {
                                if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 120, column: 16
                                  System.out.println("");//sysj\ECS_plant.sysj line: 121, column: 8
                                  System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 122, column: 8
                                  heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 123, column: 8
                                  currsigs.addElement(heatOnZone4_5_6);
                                  S1356=1;
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                                else {
                                  System.out.println("");//sysj\ECS_plant.sysj line: 125, column: 7
                                  System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 126, column: 7
                                  S1356=1;
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                              }
                            }
                            else {
                              S1356=1;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                          else {
                            System.out.println("");//sysj\ECS_plant.sysj line: 106, column: 7
                            System.out.println("Room temperature is safe at" + temp23_thread_2);//sysj\ECS_plant.sysj line: 107, column: 7
                            if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 113, column: 8
                              temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 114, column: 6
                              temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 115, column: 6
                              if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 116, column: 9
                                System.out.println("");//sysj\ECS_plant.sysj line: 117, column: 8
                                System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 118, column: 8
                                airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 119, column: 8
                                currsigs.addElement(airOnZone4_5_6);
                                S1356=1;
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                              else {
                                if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 120, column: 16
                                  System.out.println("");//sysj\ECS_plant.sysj line: 121, column: 8
                                  System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 122, column: 8
                                  heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 123, column: 8
                                  currsigs.addElement(heatOnZone4_5_6);
                                  S1356=1;
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                                else {
                                  System.out.println("");//sysj\ECS_plant.sysj line: 125, column: 7
                                  System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 126, column: 7
                                  S1356=1;
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                              }
                            }
                            else {
                              S1356=1;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                        }
                      }
                      else {
                        if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 113, column: 8
                          temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 114, column: 6
                          temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 115, column: 6
                          if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 116, column: 9
                            System.out.println("");//sysj\ECS_plant.sysj line: 117, column: 8
                            System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 118, column: 8
                            airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 119, column: 8
                            currsigs.addElement(airOnZone4_5_6);
                            S1356=1;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 120, column: 16
                              System.out.println("");//sysj\ECS_plant.sysj line: 121, column: 8
                              System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 122, column: 8
                              heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 123, column: 8
                              currsigs.addElement(heatOnZone4_5_6);
                              S1356=1;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              System.out.println("");//sysj\ECS_plant.sysj line: 125, column: 7
                              System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 126, column: 7
                              S1356=1;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                        }
                        else {
                          S1356=1;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                      }
                    }
                    else {
                      System.out.println("");//sysj\ECS_plant.sysj line: 90, column: 7
                      System.out.println("Room temperature is safe at" + temp17_thread_2);//sysj\ECS_plant.sysj line: 91, column: 7
                      if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 96, column: 8
                        temp23_thread_2 = 0;//sysj\ECS_plant.sysj line: 97, column: 6
                        temp23_thread_2 = (tempZone2_3.getpreval() == null ? null : ((Integer)tempZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 98, column: 6
                        if(temp23_thread_2 > 22){//sysj\ECS_plant.sysj line: 99, column: 9
                          System.out.println("");//sysj\ECS_plant.sysj line: 100, column: 8
                          System.out.println("Room temperature is too high at " + temp23_thread_2);//sysj\ECS_plant.sysj line: 101, column: 8
                          airOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 102, column: 8
                          currsigs.addElement(airOnZone2_3);
                          if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 113, column: 8
                            temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 114, column: 6
                            temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 115, column: 6
                            if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 116, column: 9
                              System.out.println("");//sysj\ECS_plant.sysj line: 117, column: 8
                              System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 118, column: 8
                              airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 119, column: 8
                              currsigs.addElement(airOnZone4_5_6);
                              S1356=1;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 120, column: 16
                                System.out.println("");//sysj\ECS_plant.sysj line: 121, column: 8
                                System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 122, column: 8
                                heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 123, column: 8
                                currsigs.addElement(heatOnZone4_5_6);
                                S1356=1;
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                              else {
                                System.out.println("");//sysj\ECS_plant.sysj line: 125, column: 7
                                System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 126, column: 7
                                S1356=1;
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                            }
                          }
                          else {
                            S1356=1;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                        else {
                          if(temp23_thread_2 < 21){//sysj\ECS_plant.sysj line: 103, column: 16
                            heatOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 104, column: 8
                            currsigs.addElement(heatOnZone2_3);
                            if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 113, column: 8
                              temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 114, column: 6
                              temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 115, column: 6
                              if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 116, column: 9
                                System.out.println("");//sysj\ECS_plant.sysj line: 117, column: 8
                                System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 118, column: 8
                                airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 119, column: 8
                                currsigs.addElement(airOnZone4_5_6);
                                S1356=1;
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                              else {
                                if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 120, column: 16
                                  System.out.println("");//sysj\ECS_plant.sysj line: 121, column: 8
                                  System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 122, column: 8
                                  heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 123, column: 8
                                  currsigs.addElement(heatOnZone4_5_6);
                                  S1356=1;
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                                else {
                                  System.out.println("");//sysj\ECS_plant.sysj line: 125, column: 7
                                  System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 126, column: 7
                                  S1356=1;
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                              }
                            }
                            else {
                              S1356=1;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                          else {
                            System.out.println("");//sysj\ECS_plant.sysj line: 106, column: 7
                            System.out.println("Room temperature is safe at" + temp23_thread_2);//sysj\ECS_plant.sysj line: 107, column: 7
                            if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 113, column: 8
                              temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 114, column: 6
                              temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 115, column: 6
                              if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 116, column: 9
                                System.out.println("");//sysj\ECS_plant.sysj line: 117, column: 8
                                System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 118, column: 8
                                airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 119, column: 8
                                currsigs.addElement(airOnZone4_5_6);
                                S1356=1;
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                              else {
                                if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 120, column: 16
                                  System.out.println("");//sysj\ECS_plant.sysj line: 121, column: 8
                                  System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 122, column: 8
                                  heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 123, column: 8
                                  currsigs.addElement(heatOnZone4_5_6);
                                  S1356=1;
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                                else {
                                  System.out.println("");//sysj\ECS_plant.sysj line: 125, column: 7
                                  System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 126, column: 7
                                  S1356=1;
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                              }
                            }
                            else {
                              S1356=1;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                        }
                      }
                      else {
                        if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 113, column: 8
                          temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 114, column: 6
                          temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 115, column: 6
                          if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 116, column: 9
                            System.out.println("");//sysj\ECS_plant.sysj line: 117, column: 8
                            System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 118, column: 8
                            airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 119, column: 8
                            currsigs.addElement(airOnZone4_5_6);
                            S1356=1;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 120, column: 16
                              System.out.println("");//sysj\ECS_plant.sysj line: 121, column: 8
                              System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 122, column: 8
                              heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 123, column: 8
                              currsigs.addElement(heatOnZone4_5_6);
                              S1356=1;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              System.out.println("");//sysj\ECS_plant.sysj line: 125, column: 7
                              System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 126, column: 7
                              S1356=1;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                        }
                        else {
                          S1356=1;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                      }
                    }
                  }
                }
                else {
                  if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 96, column: 8
                    temp23_thread_2 = 0;//sysj\ECS_plant.sysj line: 97, column: 6
                    temp23_thread_2 = (tempZone2_3.getpreval() == null ? null : ((Integer)tempZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 98, column: 6
                    if(temp23_thread_2 > 22){//sysj\ECS_plant.sysj line: 99, column: 9
                      System.out.println("");//sysj\ECS_plant.sysj line: 100, column: 8
                      System.out.println("Room temperature is too high at " + temp23_thread_2);//sysj\ECS_plant.sysj line: 101, column: 8
                      airOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 102, column: 8
                      currsigs.addElement(airOnZone2_3);
                      if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 113, column: 8
                        temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 114, column: 6
                        temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 115, column: 6
                        if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 116, column: 9
                          System.out.println("");//sysj\ECS_plant.sysj line: 117, column: 8
                          System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 118, column: 8
                          airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 119, column: 8
                          currsigs.addElement(airOnZone4_5_6);
                          S1356=1;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 120, column: 16
                            System.out.println("");//sysj\ECS_plant.sysj line: 121, column: 8
                            System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 122, column: 8
                            heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 123, column: 8
                            currsigs.addElement(heatOnZone4_5_6);
                            S1356=1;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            System.out.println("");//sysj\ECS_plant.sysj line: 125, column: 7
                            System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 126, column: 7
                            S1356=1;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                      }
                      else {
                        S1356=1;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                    }
                    else {
                      if(temp23_thread_2 < 21){//sysj\ECS_plant.sysj line: 103, column: 16
                        heatOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 104, column: 8
                        currsigs.addElement(heatOnZone2_3);
                        if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 113, column: 8
                          temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 114, column: 6
                          temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 115, column: 6
                          if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 116, column: 9
                            System.out.println("");//sysj\ECS_plant.sysj line: 117, column: 8
                            System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 118, column: 8
                            airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 119, column: 8
                            currsigs.addElement(airOnZone4_5_6);
                            S1356=1;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 120, column: 16
                              System.out.println("");//sysj\ECS_plant.sysj line: 121, column: 8
                              System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 122, column: 8
                              heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 123, column: 8
                              currsigs.addElement(heatOnZone4_5_6);
                              S1356=1;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              System.out.println("");//sysj\ECS_plant.sysj line: 125, column: 7
                              System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 126, column: 7
                              S1356=1;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                        }
                        else {
                          S1356=1;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                      }
                      else {
                        System.out.println("");//sysj\ECS_plant.sysj line: 106, column: 7
                        System.out.println("Room temperature is safe at" + temp23_thread_2);//sysj\ECS_plant.sysj line: 107, column: 7
                        if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 113, column: 8
                          temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 114, column: 6
                          temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 115, column: 6
                          if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 116, column: 9
                            System.out.println("");//sysj\ECS_plant.sysj line: 117, column: 8
                            System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 118, column: 8
                            airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 119, column: 8
                            currsigs.addElement(airOnZone4_5_6);
                            S1356=1;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 120, column: 16
                              System.out.println("");//sysj\ECS_plant.sysj line: 121, column: 8
                              System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 122, column: 8
                              heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 123, column: 8
                              currsigs.addElement(heatOnZone4_5_6);
                              S1356=1;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              System.out.println("");//sysj\ECS_plant.sysj line: 125, column: 7
                              System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 126, column: 7
                              S1356=1;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                        }
                        else {
                          S1356=1;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                      }
                    }
                  }
                  else {
                    if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 113, column: 8
                      temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 114, column: 6
                      temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 115, column: 6
                      if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 116, column: 9
                        System.out.println("");//sysj\ECS_plant.sysj line: 117, column: 8
                        System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 118, column: 8
                        airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 119, column: 8
                        currsigs.addElement(airOnZone4_5_6);
                        S1356=1;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
                        if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 120, column: 16
                          System.out.println("");//sysj\ECS_plant.sysj line: 121, column: 8
                          System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 122, column: 8
                          heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 123, column: 8
                          currsigs.addElement(heatOnZone4_5_6);
                          S1356=1;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          System.out.println("");//sysj\ECS_plant.sysj line: 125, column: 7
                          System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 126, column: 7
                          S1356=1;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                      }
                    }
                    else {
                      S1356=1;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                }
              }
            }
            else {
              S1356=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread7448(int [] tdone, int [] ends){
        S3816=1;
    if(cutPow.getprestatus()){//sysj\ECS_plant.sysj line: 178, column: 24
      cutPow_TriggerE.setPresent();//sysj\ECS_plant.sysj line: 178, column: 32
      currsigs.addElement(cutPow_TriggerE);
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

  public void thread7447(int [] tdone, int [] ends){
        S3808=1;
    if(deHumOnZone4_5_6.getprestatus()){//sysj\ECS_plant.sysj line: 176, column: 24
      deHumOnZone4_5_6TriggerE.setPresent();//sysj\ECS_plant.sysj line: 176, column: 42
      currsigs.addElement(deHumOnZone4_5_6TriggerE);
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

  public void thread7446(int [] tdone, int [] ends){
        S3800=1;
    if(deHumOnZone2_3.getprestatus()){//sysj\ECS_plant.sysj line: 174, column: 24
      deHumOnZone2_3TriggerE.setPresent();//sysj\ECS_plant.sysj line: 174, column: 40
      currsigs.addElement(deHumOnZone2_3TriggerE);
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

  public void thread7445(int [] tdone, int [] ends){
        S3792=1;
    if(deHumOnZone1_7.getprestatus()){//sysj\ECS_plant.sysj line: 172, column: 24
      deHumOnZone1_7TriggerE.setPresent();//sysj\ECS_plant.sysj line: 172, column: 40
      currsigs.addElement(deHumOnZone1_7TriggerE);
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

  public void thread7444(int [] tdone, int [] ends){
        S3784=1;
    if(humOnZone4_5_6.getprestatus()){//sysj\ECS_plant.sysj line: 170, column: 24
      humOnZone4_5_6TriggerE.setPresent();//sysj\ECS_plant.sysj line: 170, column: 40
      currsigs.addElement(humOnZone4_5_6TriggerE);
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

  public void thread7443(int [] tdone, int [] ends){
        S3776=1;
    if(humOnZone2_3.getprestatus()){//sysj\ECS_plant.sysj line: 168, column: 24
      humOnZone2_3TriggerE.setPresent();//sysj\ECS_plant.sysj line: 168, column: 38
      currsigs.addElement(humOnZone2_3TriggerE);
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

  public void thread7442(int [] tdone, int [] ends){
        S3768=1;
    if(humOnZone1_7.getprestatus()){//sysj\ECS_plant.sysj line: 166, column: 24
      humOnZone1_7TriggerE.setPresent();//sysj\ECS_plant.sysj line: 166, column: 38
      currsigs.addElement(humOnZone1_7TriggerE);
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

  public void thread7441(int [] tdone, int [] ends){
        S3760=1;
    if(heatOnZone4_5_6.getprestatus()){//sysj\ECS_plant.sysj line: 164, column: 24
      heatOnZone4_5_6TriggerE.setPresent();//sysj\ECS_plant.sysj line: 164, column: 41
      currsigs.addElement(heatOnZone4_5_6TriggerE);
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

  public void thread7440(int [] tdone, int [] ends){
        S3752=1;
    if(heatOnZone2_3.getprestatus()){//sysj\ECS_plant.sysj line: 162, column: 24
      heatOnZone2_3TriggerE.setPresent();//sysj\ECS_plant.sysj line: 162, column: 39
      currsigs.addElement(heatOnZone2_3TriggerE);
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

  public void thread7439(int [] tdone, int [] ends){
        S3744=1;
    if(airOnZone4_5_6.getprestatus()){//sysj\ECS_plant.sysj line: 160, column: 24
      airOnZone4_5_6TriggerE.setPresent();//sysj\ECS_plant.sysj line: 160, column: 40
      currsigs.addElement(airOnZone4_5_6TriggerE);
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

  public void thread7438(int [] tdone, int [] ends){
        S3736=1;
    if(airOnZone2_3.getprestatus()){//sysj\ECS_plant.sysj line: 158, column: 24
      airOnZone2_3TriggerE.setPresent();//sysj\ECS_plant.sysj line: 158, column: 38
      currsigs.addElement(airOnZone2_3TriggerE);
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

  public void thread7437(int [] tdone, int [] ends){
        S3728=1;
    if(heatOnZone1_7.getprestatus()){//sysj\ECS_plant.sysj line: 156, column: 24
      heatOnZone1_7TriggerE.setPresent();//sysj\ECS_plant.sysj line: 156, column: 39
      currsigs.addElement(heatOnZone1_7TriggerE);
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

  public void thread7436(int [] tdone, int [] ends){
        S3720=1;
    if(fanOnZone1_7.getprestatus()){//sysj\ECS_plant.sysj line: 154, column: 24
      fanOnZone1_7TriggerE.setPresent();//sysj\ECS_plant.sysj line: 154, column: 38
      currsigs.addElement(fanOnZone1_7TriggerE);
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

  public void thread7435(int [] tdone, int [] ends){
        S3712=1;
    if(cleanZone7.getprestatus()){//sysj\ECS_plant.sysj line: 152, column: 24
      cleanZone7TriggerE.setPresent();//sysj\ECS_plant.sysj line: 152, column: 36
      currsigs.addElement(cleanZone7TriggerE);
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

  public void thread7434(int [] tdone, int [] ends){
        S3704=1;
    if(cleanZone6.getprestatus()){//sysj\ECS_plant.sysj line: 150, column: 24
      cleanZone6TriggerE.setPresent();//sysj\ECS_plant.sysj line: 150, column: 36
      currsigs.addElement(cleanZone6TriggerE);
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

  public void thread7433(int [] tdone, int [] ends){
        S3696=1;
    if(cleanZone5.getprestatus()){//sysj\ECS_plant.sysj line: 148, column: 24
      cleanZone5TriggerE.setPresent();//sysj\ECS_plant.sysj line: 148, column: 36
      currsigs.addElement(cleanZone5TriggerE);
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

  public void thread7432(int [] tdone, int [] ends){
        S3688=1;
    if(cleanZone4.getprestatus()){//sysj\ECS_plant.sysj line: 146, column: 24
      cleanZone4TriggerE.setPresent();//sysj\ECS_plant.sysj line: 146, column: 36
      currsigs.addElement(cleanZone4TriggerE);
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

  public void thread7431(int [] tdone, int [] ends){
        S3680=1;
    if(cleanZone3.getprestatus()){//sysj\ECS_plant.sysj line: 144, column: 24
      cleanZone3TriggerE.setPresent();//sysj\ECS_plant.sysj line: 144, column: 36
      currsigs.addElement(cleanZone3TriggerE);
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

  public void thread7430(int [] tdone, int [] ends){
        S3672=1;
    if(cleanZone2.getprestatus()){//sysj\ECS_plant.sysj line: 142, column: 24
      cleanZone2TriggerE.setPresent();//sysj\ECS_plant.sysj line: 142, column: 36
      currsigs.addElement(cleanZone2TriggerE);
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

  public void thread7429(int [] tdone, int [] ends){
        S3664=1;
    if(cleanZone1.getprestatus()){//sysj\ECS_plant.sysj line: 140, column: 24
      cleanZone1TriggerE.setPresent();//sysj\ECS_plant.sysj line: 140, column: 36
      currsigs.addElement(cleanZone1TriggerE);
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

  public void thread7428(int [] tdone, int [] ends){
        S3656=1;
    if(fireExt.getprestatus()){//sysj\ECS_plant.sysj line: 138, column: 24
      fireExtE.setPresent();//sysj\ECS_plant.sysj line: 138, column: 33
      currsigs.addElement(fireExtE);
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

  public void thread7427(int [] tdone, int [] ends){
        S3648=1;
    if(fireZone1.getprestatus()){//sysj\ECS_plant.sysj line: 136, column: 24
      alarmZone1TriggerE.setPresent();//sysj\ECS_plant.sysj line: 136, column: 35
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

  public void thread7426(int [] tdone, int [] ends){
        S3818=1;
    thread7427(tdone,ends);
    thread7428(tdone,ends);
    thread7429(tdone,ends);
    thread7430(tdone,ends);
    thread7431(tdone,ends);
    thread7432(tdone,ends);
    thread7433(tdone,ends);
    thread7434(tdone,ends);
    thread7435(tdone,ends);
    thread7436(tdone,ends);
    thread7437(tdone,ends);
    thread7438(tdone,ends);
    thread7439(tdone,ends);
    thread7440(tdone,ends);
    thread7441(tdone,ends);
    thread7442(tdone,ends);
    thread7443(tdone,ends);
    thread7444(tdone,ends);
    thread7445(tdone,ends);
    thread7446(tdone,ends);
    thread7447(tdone,ends);
    thread7448(tdone,ends);
    int biggest7449 = 0;
    if(ends[4]>=biggest7449){
      biggest7449=ends[4];
    }
    if(ends[5]>=biggest7449){
      biggest7449=ends[5];
    }
    if(ends[6]>=biggest7449){
      biggest7449=ends[6];
    }
    if(ends[7]>=biggest7449){
      biggest7449=ends[7];
    }
    if(ends[8]>=biggest7449){
      biggest7449=ends[8];
    }
    if(ends[9]>=biggest7449){
      biggest7449=ends[9];
    }
    if(ends[10]>=biggest7449){
      biggest7449=ends[10];
    }
    if(ends[11]>=biggest7449){
      biggest7449=ends[11];
    }
    if(ends[12]>=biggest7449){
      biggest7449=ends[12];
    }
    if(ends[13]>=biggest7449){
      biggest7449=ends[13];
    }
    if(ends[14]>=biggest7449){
      biggest7449=ends[14];
    }
    if(ends[15]>=biggest7449){
      biggest7449=ends[15];
    }
    if(ends[16]>=biggest7449){
      biggest7449=ends[16];
    }
    if(ends[17]>=biggest7449){
      biggest7449=ends[17];
    }
    if(ends[18]>=biggest7449){
      biggest7449=ends[18];
    }
    if(ends[19]>=biggest7449){
      biggest7449=ends[19];
    }
    if(ends[20]>=biggest7449){
      biggest7449=ends[20];
    }
    if(ends[21]>=biggest7449){
      biggest7449=ends[21];
    }
    if(ends[22]>=biggest7449){
      biggest7449=ends[22];
    }
    if(ends[23]>=biggest7449){
      biggest7449=ends[23];
    }
    if(ends[24]>=biggest7449){
      biggest7449=ends[24];
    }
    if(ends[25]>=biggest7449){
      biggest7449=ends[25];
    }
    if(biggest7449 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread7425(int [] tdone, int [] ends){
        S3640=1;
    S1356=0;
    if(run.getprestatus()){//sysj\ECS_plant.sysj line: 40, column: 12
      zone_thread_2 = 0;//sysj\ECS_plant.sysj line: 43, column: 5
      zone_thread_2 = (selectedZone.getpreval() == null ? null : ((Integer)selectedZone.getpreval()));//sysj\ECS_plant.sysj line: 44, column: 5
      System.out.println("");//sysj\ECS_plant.sysj line: 46, column: 5
      System.out.println("Plant knows zone selected is: " + zone_thread_2);//sysj\ECS_plant.sysj line: 47, column: 5
      firePresent_thread_2 = 0;//sysj\ECS_plant.sysj line: 50, column: 5
      firePresent_thread_2 = (fire.getpreval() == null ? null : ((Integer)fire.getpreval()));//sysj\ECS_plant.sysj line: 51, column: 5
      lightIntensity_thread_2 = 0;//sysj\ECS_plant.sysj line: 54, column: 5
      lightIntensity_thread_2 = (lightInt.getpreval() == null ? null : ((Integer)lightInt.getpreval()));//sysj\ECS_plant.sysj line: 55, column: 5
      clock_thread_2 = "";//sysj\ECS_plant.sysj line: 58, column: 5
      clock_thread_2 = (time.getpreval() == null ? null : ((String)time.getpreval()));//sysj\ECS_plant.sysj line: 59, column: 5
      if(firePresent_thread_2 == 1){//sysj\ECS_plant.sysj line: 63, column: 8
        System.out.println("THERE IS A FIRE IN ZONE " + zone_thread_2 + " SEND EVACUATION SIGNAL TO ACS");//sysj\ECS_plant.sysj line: 64, column: 6
        cutPow.setPresent();//sysj\ECS_plant.sysj line: 65, column: 6
        currsigs.addElement(cutPow);
        S217=0;
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
      }
      else {
        if(zone_thread_2 == 1 || zone_thread_2 == 7){//sysj\ECS_plant.sysj line: 79, column: 8
          temp17_thread_2 = 0;//sysj\ECS_plant.sysj line: 80, column: 6
          temp17_thread_2 = (tempZone1_7.getpreval() == null ? null : ((Integer)tempZone1_7.getpreval()));//sysj\ECS_plant.sysj line: 81, column: 6
          if(temp17_thread_2 > 22){//sysj\ECS_plant.sysj line: 82, column: 9
            System.out.println("");//sysj\ECS_plant.sysj line: 83, column: 8
            System.out.println("Room temperature is too high at " + temp17_thread_2);//sysj\ECS_plant.sysj line: 84, column: 8
            fanOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 85, column: 8
            currsigs.addElement(fanOnZone1_7);
            if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 96, column: 8
              temp23_thread_2 = 0;//sysj\ECS_plant.sysj line: 97, column: 6
              temp23_thread_2 = (tempZone2_3.getpreval() == null ? null : ((Integer)tempZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 98, column: 6
              if(temp23_thread_2 > 22){//sysj\ECS_plant.sysj line: 99, column: 9
                System.out.println("");//sysj\ECS_plant.sysj line: 100, column: 8
                System.out.println("Room temperature is too high at " + temp23_thread_2);//sysj\ECS_plant.sysj line: 101, column: 8
                airOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 102, column: 8
                currsigs.addElement(airOnZone2_3);
                if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 113, column: 8
                  temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 114, column: 6
                  temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 115, column: 6
                  if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 116, column: 9
                    System.out.println("");//sysj\ECS_plant.sysj line: 117, column: 8
                    System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 118, column: 8
                    airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 119, column: 8
                    currsigs.addElement(airOnZone4_5_6);
                    S1356=1;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 120, column: 16
                      System.out.println("");//sysj\ECS_plant.sysj line: 121, column: 8
                      System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 122, column: 8
                      heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 123, column: 8
                      currsigs.addElement(heatOnZone4_5_6);
                      S1356=1;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      System.out.println("");//sysj\ECS_plant.sysj line: 125, column: 7
                      System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 126, column: 7
                      S1356=1;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                }
                else {
                  S1356=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
              else {
                if(temp23_thread_2 < 21){//sysj\ECS_plant.sysj line: 103, column: 16
                  heatOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 104, column: 8
                  currsigs.addElement(heatOnZone2_3);
                  if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 113, column: 8
                    temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 114, column: 6
                    temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 115, column: 6
                    if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 116, column: 9
                      System.out.println("");//sysj\ECS_plant.sysj line: 117, column: 8
                      System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 118, column: 8
                      airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 119, column: 8
                      currsigs.addElement(airOnZone4_5_6);
                      S1356=1;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 120, column: 16
                        System.out.println("");//sysj\ECS_plant.sysj line: 121, column: 8
                        System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 122, column: 8
                        heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 123, column: 8
                        currsigs.addElement(heatOnZone4_5_6);
                        S1356=1;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
                        System.out.println("");//sysj\ECS_plant.sysj line: 125, column: 7
                        System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 126, column: 7
                        S1356=1;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                    }
                  }
                  else {
                    S1356=1;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                else {
                  System.out.println("");//sysj\ECS_plant.sysj line: 106, column: 7
                  System.out.println("Room temperature is safe at" + temp23_thread_2);//sysj\ECS_plant.sysj line: 107, column: 7
                  if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 113, column: 8
                    temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 114, column: 6
                    temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 115, column: 6
                    if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 116, column: 9
                      System.out.println("");//sysj\ECS_plant.sysj line: 117, column: 8
                      System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 118, column: 8
                      airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 119, column: 8
                      currsigs.addElement(airOnZone4_5_6);
                      S1356=1;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 120, column: 16
                        System.out.println("");//sysj\ECS_plant.sysj line: 121, column: 8
                        System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 122, column: 8
                        heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 123, column: 8
                        currsigs.addElement(heatOnZone4_5_6);
                        S1356=1;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
                        System.out.println("");//sysj\ECS_plant.sysj line: 125, column: 7
                        System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 126, column: 7
                        S1356=1;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                    }
                  }
                  else {
                    S1356=1;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
              }
            }
            else {
              if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 113, column: 8
                temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 114, column: 6
                temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 115, column: 6
                if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 116, column: 9
                  System.out.println("");//sysj\ECS_plant.sysj line: 117, column: 8
                  System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 118, column: 8
                  airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 119, column: 8
                  currsigs.addElement(airOnZone4_5_6);
                  S1356=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 120, column: 16
                    System.out.println("");//sysj\ECS_plant.sysj line: 121, column: 8
                    System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 122, column: 8
                    heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 123, column: 8
                    currsigs.addElement(heatOnZone4_5_6);
                    S1356=1;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    System.out.println("");//sysj\ECS_plant.sysj line: 125, column: 7
                    System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 126, column: 7
                    S1356=1;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
              }
              else {
                S1356=1;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
          }
          else {
            if(temp17_thread_2 < 21){//sysj\ECS_plant.sysj line: 86, column: 16
              System.out.println("Room temperature is too low at " + temp17_thread_2);//sysj\ECS_plant.sysj line: 87, column: 8
              heatOnZone1_7.setPresent();//sysj\ECS_plant.sysj line: 88, column: 8
              currsigs.addElement(heatOnZone1_7);
              if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 96, column: 8
                temp23_thread_2 = 0;//sysj\ECS_plant.sysj line: 97, column: 6
                temp23_thread_2 = (tempZone2_3.getpreval() == null ? null : ((Integer)tempZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 98, column: 6
                if(temp23_thread_2 > 22){//sysj\ECS_plant.sysj line: 99, column: 9
                  System.out.println("");//sysj\ECS_plant.sysj line: 100, column: 8
                  System.out.println("Room temperature is too high at " + temp23_thread_2);//sysj\ECS_plant.sysj line: 101, column: 8
                  airOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 102, column: 8
                  currsigs.addElement(airOnZone2_3);
                  if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 113, column: 8
                    temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 114, column: 6
                    temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 115, column: 6
                    if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 116, column: 9
                      System.out.println("");//sysj\ECS_plant.sysj line: 117, column: 8
                      System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 118, column: 8
                      airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 119, column: 8
                      currsigs.addElement(airOnZone4_5_6);
                      S1356=1;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 120, column: 16
                        System.out.println("");//sysj\ECS_plant.sysj line: 121, column: 8
                        System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 122, column: 8
                        heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 123, column: 8
                        currsigs.addElement(heatOnZone4_5_6);
                        S1356=1;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
                        System.out.println("");//sysj\ECS_plant.sysj line: 125, column: 7
                        System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 126, column: 7
                        S1356=1;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                    }
                  }
                  else {
                    S1356=1;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                else {
                  if(temp23_thread_2 < 21){//sysj\ECS_plant.sysj line: 103, column: 16
                    heatOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 104, column: 8
                    currsigs.addElement(heatOnZone2_3);
                    if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 113, column: 8
                      temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 114, column: 6
                      temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 115, column: 6
                      if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 116, column: 9
                        System.out.println("");//sysj\ECS_plant.sysj line: 117, column: 8
                        System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 118, column: 8
                        airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 119, column: 8
                        currsigs.addElement(airOnZone4_5_6);
                        S1356=1;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
                        if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 120, column: 16
                          System.out.println("");//sysj\ECS_plant.sysj line: 121, column: 8
                          System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 122, column: 8
                          heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 123, column: 8
                          currsigs.addElement(heatOnZone4_5_6);
                          S1356=1;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          System.out.println("");//sysj\ECS_plant.sysj line: 125, column: 7
                          System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 126, column: 7
                          S1356=1;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                      }
                    }
                    else {
                      S1356=1;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                  else {
                    System.out.println("");//sysj\ECS_plant.sysj line: 106, column: 7
                    System.out.println("Room temperature is safe at" + temp23_thread_2);//sysj\ECS_plant.sysj line: 107, column: 7
                    if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 113, column: 8
                      temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 114, column: 6
                      temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 115, column: 6
                      if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 116, column: 9
                        System.out.println("");//sysj\ECS_plant.sysj line: 117, column: 8
                        System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 118, column: 8
                        airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 119, column: 8
                        currsigs.addElement(airOnZone4_5_6);
                        S1356=1;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
                        if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 120, column: 16
                          System.out.println("");//sysj\ECS_plant.sysj line: 121, column: 8
                          System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 122, column: 8
                          heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 123, column: 8
                          currsigs.addElement(heatOnZone4_5_6);
                          S1356=1;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          System.out.println("");//sysj\ECS_plant.sysj line: 125, column: 7
                          System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 126, column: 7
                          S1356=1;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                      }
                    }
                    else {
                      S1356=1;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                }
              }
              else {
                if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 113, column: 8
                  temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 114, column: 6
                  temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 115, column: 6
                  if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 116, column: 9
                    System.out.println("");//sysj\ECS_plant.sysj line: 117, column: 8
                    System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 118, column: 8
                    airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 119, column: 8
                    currsigs.addElement(airOnZone4_5_6);
                    S1356=1;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 120, column: 16
                      System.out.println("");//sysj\ECS_plant.sysj line: 121, column: 8
                      System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 122, column: 8
                      heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 123, column: 8
                      currsigs.addElement(heatOnZone4_5_6);
                      S1356=1;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      System.out.println("");//sysj\ECS_plant.sysj line: 125, column: 7
                      System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 126, column: 7
                      S1356=1;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                }
                else {
                  S1356=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
            }
            else {
              System.out.println("");//sysj\ECS_plant.sysj line: 90, column: 7
              System.out.println("Room temperature is safe at" + temp17_thread_2);//sysj\ECS_plant.sysj line: 91, column: 7
              if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 96, column: 8
                temp23_thread_2 = 0;//sysj\ECS_plant.sysj line: 97, column: 6
                temp23_thread_2 = (tempZone2_3.getpreval() == null ? null : ((Integer)tempZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 98, column: 6
                if(temp23_thread_2 > 22){//sysj\ECS_plant.sysj line: 99, column: 9
                  System.out.println("");//sysj\ECS_plant.sysj line: 100, column: 8
                  System.out.println("Room temperature is too high at " + temp23_thread_2);//sysj\ECS_plant.sysj line: 101, column: 8
                  airOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 102, column: 8
                  currsigs.addElement(airOnZone2_3);
                  if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 113, column: 8
                    temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 114, column: 6
                    temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 115, column: 6
                    if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 116, column: 9
                      System.out.println("");//sysj\ECS_plant.sysj line: 117, column: 8
                      System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 118, column: 8
                      airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 119, column: 8
                      currsigs.addElement(airOnZone4_5_6);
                      S1356=1;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 120, column: 16
                        System.out.println("");//sysj\ECS_plant.sysj line: 121, column: 8
                        System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 122, column: 8
                        heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 123, column: 8
                        currsigs.addElement(heatOnZone4_5_6);
                        S1356=1;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
                        System.out.println("");//sysj\ECS_plant.sysj line: 125, column: 7
                        System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 126, column: 7
                        S1356=1;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                    }
                  }
                  else {
                    S1356=1;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                else {
                  if(temp23_thread_2 < 21){//sysj\ECS_plant.sysj line: 103, column: 16
                    heatOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 104, column: 8
                    currsigs.addElement(heatOnZone2_3);
                    if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 113, column: 8
                      temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 114, column: 6
                      temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 115, column: 6
                      if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 116, column: 9
                        System.out.println("");//sysj\ECS_plant.sysj line: 117, column: 8
                        System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 118, column: 8
                        airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 119, column: 8
                        currsigs.addElement(airOnZone4_5_6);
                        S1356=1;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
                        if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 120, column: 16
                          System.out.println("");//sysj\ECS_plant.sysj line: 121, column: 8
                          System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 122, column: 8
                          heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 123, column: 8
                          currsigs.addElement(heatOnZone4_5_6);
                          S1356=1;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          System.out.println("");//sysj\ECS_plant.sysj line: 125, column: 7
                          System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 126, column: 7
                          S1356=1;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                      }
                    }
                    else {
                      S1356=1;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                  else {
                    System.out.println("");//sysj\ECS_plant.sysj line: 106, column: 7
                    System.out.println("Room temperature is safe at" + temp23_thread_2);//sysj\ECS_plant.sysj line: 107, column: 7
                    if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 113, column: 8
                      temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 114, column: 6
                      temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 115, column: 6
                      if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 116, column: 9
                        System.out.println("");//sysj\ECS_plant.sysj line: 117, column: 8
                        System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 118, column: 8
                        airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 119, column: 8
                        currsigs.addElement(airOnZone4_5_6);
                        S1356=1;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
                        if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 120, column: 16
                          System.out.println("");//sysj\ECS_plant.sysj line: 121, column: 8
                          System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 122, column: 8
                          heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 123, column: 8
                          currsigs.addElement(heatOnZone4_5_6);
                          S1356=1;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          System.out.println("");//sysj\ECS_plant.sysj line: 125, column: 7
                          System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 126, column: 7
                          S1356=1;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                      }
                    }
                    else {
                      S1356=1;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                }
              }
              else {
                if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 113, column: 8
                  temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 114, column: 6
                  temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 115, column: 6
                  if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 116, column: 9
                    System.out.println("");//sysj\ECS_plant.sysj line: 117, column: 8
                    System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 118, column: 8
                    airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 119, column: 8
                    currsigs.addElement(airOnZone4_5_6);
                    S1356=1;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 120, column: 16
                      System.out.println("");//sysj\ECS_plant.sysj line: 121, column: 8
                      System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 122, column: 8
                      heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 123, column: 8
                      currsigs.addElement(heatOnZone4_5_6);
                      S1356=1;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      System.out.println("");//sysj\ECS_plant.sysj line: 125, column: 7
                      System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 126, column: 7
                      S1356=1;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                }
                else {
                  S1356=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
            }
          }
        }
        else {
          if(zone_thread_2 == 2 || zone_thread_2 == 3){//sysj\ECS_plant.sysj line: 96, column: 8
            temp23_thread_2 = 0;//sysj\ECS_plant.sysj line: 97, column: 6
            temp23_thread_2 = (tempZone2_3.getpreval() == null ? null : ((Integer)tempZone2_3.getpreval()));//sysj\ECS_plant.sysj line: 98, column: 6
            if(temp23_thread_2 > 22){//sysj\ECS_plant.sysj line: 99, column: 9
              System.out.println("");//sysj\ECS_plant.sysj line: 100, column: 8
              System.out.println("Room temperature is too high at " + temp23_thread_2);//sysj\ECS_plant.sysj line: 101, column: 8
              airOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 102, column: 8
              currsigs.addElement(airOnZone2_3);
              if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 113, column: 8
                temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 114, column: 6
                temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 115, column: 6
                if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 116, column: 9
                  System.out.println("");//sysj\ECS_plant.sysj line: 117, column: 8
                  System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 118, column: 8
                  airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 119, column: 8
                  currsigs.addElement(airOnZone4_5_6);
                  S1356=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 120, column: 16
                    System.out.println("");//sysj\ECS_plant.sysj line: 121, column: 8
                    System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 122, column: 8
                    heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 123, column: 8
                    currsigs.addElement(heatOnZone4_5_6);
                    S1356=1;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    System.out.println("");//sysj\ECS_plant.sysj line: 125, column: 7
                    System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 126, column: 7
                    S1356=1;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
              }
              else {
                S1356=1;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              if(temp23_thread_2 < 21){//sysj\ECS_plant.sysj line: 103, column: 16
                heatOnZone2_3.setPresent();//sysj\ECS_plant.sysj line: 104, column: 8
                currsigs.addElement(heatOnZone2_3);
                if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 113, column: 8
                  temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 114, column: 6
                  temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 115, column: 6
                  if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 116, column: 9
                    System.out.println("");//sysj\ECS_plant.sysj line: 117, column: 8
                    System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 118, column: 8
                    airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 119, column: 8
                    currsigs.addElement(airOnZone4_5_6);
                    S1356=1;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 120, column: 16
                      System.out.println("");//sysj\ECS_plant.sysj line: 121, column: 8
                      System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 122, column: 8
                      heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 123, column: 8
                      currsigs.addElement(heatOnZone4_5_6);
                      S1356=1;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      System.out.println("");//sysj\ECS_plant.sysj line: 125, column: 7
                      System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 126, column: 7
                      S1356=1;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                }
                else {
                  S1356=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
              else {
                System.out.println("");//sysj\ECS_plant.sysj line: 106, column: 7
                System.out.println("Room temperature is safe at" + temp23_thread_2);//sysj\ECS_plant.sysj line: 107, column: 7
                if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 113, column: 8
                  temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 114, column: 6
                  temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 115, column: 6
                  if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 116, column: 9
                    System.out.println("");//sysj\ECS_plant.sysj line: 117, column: 8
                    System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 118, column: 8
                    airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 119, column: 8
                    currsigs.addElement(airOnZone4_5_6);
                    S1356=1;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 120, column: 16
                      System.out.println("");//sysj\ECS_plant.sysj line: 121, column: 8
                      System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 122, column: 8
                      heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 123, column: 8
                      currsigs.addElement(heatOnZone4_5_6);
                      S1356=1;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      System.out.println("");//sysj\ECS_plant.sysj line: 125, column: 7
                      System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 126, column: 7
                      S1356=1;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                }
                else {
                  S1356=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
            }
          }
          else {
            if(zone_thread_2 == 4 || zone_thread_2 == 5 || zone_thread_2 == 6){//sysj\ECS_plant.sysj line: 113, column: 8
              temp456_thread_2 = 0;//sysj\ECS_plant.sysj line: 114, column: 6
              temp456_thread_2 = (tempZone4_5_6.getpreval() == null ? null : ((Integer)tempZone4_5_6.getpreval()));//sysj\ECS_plant.sysj line: 115, column: 6
              if(temp456_thread_2 > 22){//sysj\ECS_plant.sysj line: 116, column: 9
                System.out.println("");//sysj\ECS_plant.sysj line: 117, column: 8
                System.out.println("Room temperature is too high at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 118, column: 8
                airOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 119, column: 8
                currsigs.addElement(airOnZone4_5_6);
                S1356=1;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                if(temp456_thread_2 < 21){//sysj\ECS_plant.sysj line: 120, column: 16
                  System.out.println("");//sysj\ECS_plant.sysj line: 121, column: 8
                  System.out.println("Room temperature is too low at " + temp456_thread_2);//sysj\ECS_plant.sysj line: 122, column: 8
                  heatOnZone4_5_6.setPresent();//sysj\ECS_plant.sysj line: 123, column: 8
                  currsigs.addElement(heatOnZone4_5_6);
                  S1356=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  System.out.println("");//sysj\ECS_plant.sysj line: 125, column: 7
                  System.out.println("Room temperature is safe at" + temp456_thread_2);//sysj\ECS_plant.sysj line: 126, column: 7
                  S1356=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
            }
            else {
              S1356=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
          }
        }
      }
    }
    else {
      S1356=1;
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S7423){
        case 0 : 
          S7423=0;
          break RUN;
        
        case 1 : 
          S7423=2;
          S7423=2;
          new Thread(new ECS_GUI()).start();//sysj\ECS_plant.sysj line: 33, column: 2
          thread7425(tdone,ends);
          thread7426(tdone,ends);
          int biggest7450 = 0;
          if(ends[2]>=biggest7450){
            biggest7450=ends[2];
          }
          if(ends[3]>=biggest7450){
            biggest7450=ends[3];
          }
          if(biggest7450 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread7451(tdone,ends);
          thread7452(tdone,ends);
          int biggest7476 = 0;
          if(ends[2]>=biggest7476){
            biggest7476=ends[2];
          }
          if(ends[3]>=biggest7476){
            biggest7476=ends[3];
          }
          if(biggest7476 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest7476 == 0){
            S7423=0;
            active[1]=0;
            ends[1]=0;
            S7423=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
