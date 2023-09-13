package org.compsys704;

import java.util.Arrays;
import java.util.List;

public class LoaderVizWorker extends Worker{

	@Override
	public void setSignal(boolean status) {
//		System.out.println(signame+"  "+status);
		switch(signame){
		case "unlock1GUI":
			System.out.println("asdksa");
			States.DOOR1_UNLOCK = status;
			break;
			
		case "lock1GUI":
			System.out.println("boo");
			States.DOOR1_LOCK = status;
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