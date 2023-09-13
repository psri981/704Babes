package org.compsys704;

import java.util.Arrays;
import java.util.List;

public class LoaderVizWorker extends Worker{

	@Override
	public void setSignal(boolean status) {
//		System.out.println(signame+"  "+status);
		switch(signame){
		case "unlock1GUI":
			States.DOOR1_UNLOCK = status;
			break;
			
		case "lock1GUI":
			System.out.println("boo");
			States.DOOR1_LOCK = status;
			break;
			
		case "accessOfficeGUI":
			States.ACCESS_OFFICE = status;
			break;
			
		case "accessManuGUI":
			States.ACCESS_MANU= status;
			break;
			
		case "zoneOcc0GUI":
			States.ROOM0_PRECENSE= status;
			break;

		case "zoneOcc1GUI":
			States.ROOM1_PRECENSE= status;
			break;
			
		case "zoneOcc2GUI":
			States.ROOM2_PRECENSE= status;
			break;
			
		case "zoneOcc3GUI":
			States.ROOM3_PRECENSE= status;
			break;
			
		case "zoneOcc4GUI":
			States.ROOM4_PRECENSE= status;
			break;
			
		case "zoneOcc5GUI":
			States.ROOM5_PRECENSE= status;
			break;
			
		case "zoneOcc6GUI":
			States.ROOM6_PRECENSE= status;
			break;
			
		case "zoneOcc7GUI":
			States.ROOM7_PRECENSE= status;
			break;
			
		case "proxLaserGUI":
			States.LASERPROX_SENSE= status;
			break;
			
		case "absStopGUI":
			States.ABS_OFF= status;
			break;
			
//		case "pusherRetractedE":
//			States.PUSHER_RETRACTED = status;
//			break;
//		case "pusherExtendedE":
//			if(!States.MAG_EMPTY && !States.PUSHER_EXTENDED)
//				States.CAP_READY = true;
//			States.PUSHER_EXTENDED = status;
//			break;
//		case "WPgrippedE":
//			if(States.GRIPPED && States.ARM_AT_SOURCE){
//				if(!status)
//					States.CAP_READY = true;
//			}
//			States.GRIPPED = status;
//			if(States.GRIPPED && States.ARM_AT_SOURCE){
//				States.CAP_READY = false;
//			}
//			break;
//		case "armAtSourceE":
//			States.ARM_AT_SOURCE = status;
//			break;
//		case "armAtDestE":
//			States.ARM_AT_DEST = status;
//			break;
//		case "emptyE":
//			States.MAG_EMPTY = status;
//			break;
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
