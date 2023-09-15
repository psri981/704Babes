package org.compsys704;

import java.util.Arrays;
import java.util.List;

public class ACS_LoaderVizWorker extends Worker{

	@Override
	public void setSignal(boolean status) {
//		System.out.println(signame+"  "+status);
		switch(signame){
		case "modeAutomaticGUI":
			ACS_States.MODEAUTOMATIC = status;
			break;
		case "modeManualGUI":
			ACS_States.MODEMANUAL = status;
			break;
		case "unlock1GUI":
			ACS_States.DOOR1_UNLOCK = status;
			break;

		case "unlock2GUI":
			ACS_States.DOOR2_UNLOCK = status;
			break;

		case "unlock3GUI":
			ACS_States.DOOR3_UNLOCK = status;
			break;
		
			
		case "lock1GUI":
			System.out.println("boo");
			ACS_States.DOOR1_LOCK = status;
			break;
			
		case "accessOfficeGUI":
			ACS_States.ACCESS_OFFICE = status;
			break;
			
		case "accessManuGUI":
			ACS_States.ACCESS_MANU= status;
			break;
			
		case "zoneOcc0GUI":
			ACS_States.ROOM0_PRECENSE= status;
			break;

		case "zoneOcc1GUI":
			ACS_States.ROOM1_PRECENSE= status;
			break;
			
		case "zoneOcc2GUI":
			ACS_States.ROOM2_PRECENSE= status;
			break;
			
		case "zoneOcc3GUI":
			ACS_States.ROOM3_PRECENSE= status;
			break;
			
		case "zoneOcc4GUI":
			ACS_States.ROOM4_PRECENSE= status;
			break;
			
		case "zoneOcc5GUI":
			ACS_States.ROOM5_PRECENSE= status;
			break;
			
		case "zoneOcc6GUI":
			ACS_States.ROOM6_PRECENSE= status;
			break;
			
		case "zoneOcc7GUI":
			ACS_States.ROOM7_PRECENSE= status;
			break;
			
		case "proxLaserGUI":
			ACS_States.LASERPROX_SENSE= status;
			break;
			
		case "absStopGUI":
			ACS_States.ABS_OFF= status;
			break;
			
		default: 
			System.err.println("Wrong sig name : "+signame);
			System.exit(1);
		}
	}
	
	
	static final List<String> signames = Arrays.asList("unlock1GUI");
	
	@Override
	public boolean hasSignal(String sn) {
		return signames.contains(sn);
	}

}
