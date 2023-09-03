package org.ecs;

import java.util.Arrays;
import java.util.List;

public class ECSVizWorker extends ECS_Worker{

	@Override
	public void setSignal(boolean status) {
//		System.out.println(signame+"  "+status);
		switch(signame){

		case "conBeltTriggerE":
			ECS_States.EMPTY_BOT_POS_0 = status;
			break;
		case "fillerTriggerE":
			ECS_States.FILLED_BOT_POS_2 = status;
			break;
		case "lidloaderTriggerE":
			ECS_States.LID_LOADED_POS_3 = status;
			break;
		case "capScrewTriggerE":
			ECS_States.CAP_SCREWED_POS_4 = status;
			break;
		case "labelTriggerE":
			ECS_States.DONE_BOT_POS_6 = status;
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
