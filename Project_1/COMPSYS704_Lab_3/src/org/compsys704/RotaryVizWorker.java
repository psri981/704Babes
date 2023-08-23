package org.compsys704;

import java.util.Arrays;
import java.util.List;

public class RotaryVizWorker extends Worker{

	@Override
	public void setSignal(boolean status) {
//		System.out.println(signame+"  "+status);
		switch(signame){

		case "conBeltTriggerE":
			States.EMPTY_BOT_POS_1 = status;
			break;
		case "fillerTriggerE":
			States.FILLED_BOT_POS_2 = status;
			break;
		case "lidloaderTriggerE":
			States.LID_LOADED_POS_3 = status;
			break;
		case "capScrewTriggerE":
			States.CAP_SCREWED_POS_4 = status;
			break;
		case "labelTriggerE":
			States.DONE_BOT_POS_6 = status;
			break;
		default: 
			System.err.println("Wrong sig name : "+signame);
			System.exit(1);
		}
	}
	
	
	static final List<String> signames = Arrays.asList("capOnBottleAtPos1E, conBeltTriggerE","fillerTriggerE","lidloaderTriggerE","capScrewTriggerE","labelTriggerE");
	
	@Override
	public boolean hasSignal(String sn) {
		return signames.contains(sn);
	}

}
