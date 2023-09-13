package org.ecs;

import java.util.Arrays;
import java.util.List;

public class ECSVizWorker extends ECS_Worker{

	@Override
	public void setSignal(boolean status) {
		switch(signame){
		// -------------- FIRE CASES -------------- //
		case "alarmZone1TriggerE":
			ECS_States.FIRE_ZONE_1 = status;
			break;
		case "alarmZone2TriggerE":
			ECS_States.FIRE_ZONE_2 = status;
			break;
		case "alarmZone3TriggerE":
			ECS_States.FIRE_ZONE_3 = status;
			break;
		case "alarmZone4TriggerE":
			ECS_States.FIRE_ZONE_4 = status;
			break;
		case "alarmZone5TriggerE":
			ECS_States.FIRE_ZONE_5 = status;
			break;
		case "alarmZone6TriggerE":
			ECS_States.FIRE_ZONE_6 = status;
			break;
		case "alarmZone7TriggerE":
			ECS_States.FIRE_ZONE_7 = status;
			break;
			// -------------- FIRE CASES END -------------- //

			// -------------- CLEANING CASES -------------- //
		case "cleanZone1TriggerE":
			ECS_States.CLEAN_ZONE_1 = status;
			break;
		case "cleanZone2TriggerE":
			ECS_States.CLEAN_ZONE_2 = status;
			break;
		case "cleanZone3TriggerE":
			ECS_States.CLEAN_ZONE_3 = status;
			break;
		case "cleanZone4TriggerE":
			ECS_States.CLEAN_ZONE_4 = status;
			break;
		case "cleanZone5TriggerE":
			ECS_States.CLEAN_ZONE_5 = status;
			break;
		case "cleanZone6TriggerE":
			ECS_States.CLEAN_ZONE_6 = status;
			break;
		case "cleanZone7TriggerE":
			ECS_States.CLEAN_ZONE_7 = status;
			break;
			// -------------- CLEANING CASES END -------------- //

			// ----------- APPLIANCES CASES END ----------- //
		case "fanOnZone1_7TriggerE":
			ECS_States.FAN_ZONE_1_7 = status;
			break;
		case "heatOnZone1_7TriggerE":
			ECS_States.HEAT_ZONE_1_7 = status;
			break;
		case "airOnZone2_3TriggerE":
			ECS_States.AC_COOL_ZONE_2_3 = status;
			break;
		case "airOnZone4_5_6TriggerE":
			ECS_States.AC_COOL_ZONE_4_5_6 = status;
			break;
		case "heatOnZone2_3TriggerE":
			ECS_States.AC_HEAT_ZONE_2_3 = status;
			break;
		case "heatOnZone4_5_6TriggerE":
			ECS_States.AC_HEAT_ZONE_4_5_6 = status;
			break;
		case "humOnZone1_7TriggerE":
			ECS_States.HUM_ZONE_1_7 = status;
			break;
		case "humOnZone2_3TriggerE":
			ECS_States.HUM_ZONE_2_3 = status;
			break;
		case "humOnZone4_5_6TriggerE":
			ECS_States.HUM_ZONE_4_5_6 = status;
			break;
		case "deHumOnZone1_7TriggerE":
			ECS_States.DEHUM_ZONE_1_7 = status;
			break;
		case "deHumOnZone2_3TriggerE":
			ECS_States.DEHUM_ZONE_2_3 = status;
			break;
		case "deHumOnZone4_5_6TriggerE":
			ECS_States.DEHUM_ZONE_4_5_6 = status;
			break;
			// ----------- APPLIANCES CASES END ----------- //

			// -------------- POWER CASES -------------- //
		case "cutPowZ1_TriggerE":
			ECS_States.POW_OFF_ZONE_1 = status;
			break;
		case "cutPowZ2_TriggerE":
			ECS_States.POW_OFF_ZONE_2 = status;
			break;
		case "cutPowZ3_TriggerE":
			ECS_States.POW_OFF_ZONE_3 = status;
			break;
		case "cutPowZ4_TriggerE":
			ECS_States.POW_OFF_ZONE_4 = status;
			break;
		case "cutPowZ5_TriggerE":
			ECS_States.POW_OFF_ZONE_5 = status;
			break;
		case "cutPowZ6_TriggerE":
			ECS_States.POW_OFF_ZONE_6 = status;
			break;
		case "cutPowZ7_TriggerE":
			ECS_States.POW_OFF_ZONE_7 = status;
			break;
			// -------------- POWER CASES END -------------- //

		default: 
			System.err.println("Wrong sig name : "+signame);
			System.exit(1);
		}
	}

	static final List<String> signames = Arrays.asList("alarmZone1TriggerE, alarmZone2TriggerE","alarmZone3TriggerE","alarmZone4TriggerE","alarmZone5TriggerE","alarmZone6TriggerE","alarmZone7TriggerE",
			"cleanZone1TriggerE","cleanZone2TriggerE","cleanZone3TriggerE","cleanZone4TriggerE","cleanZone5TriggerE","cleanZone6TriggerE","cleanZone7TriggerE",
			"fanOnZone1_7TriggerE","heatOnZone1_7TriggerE","airOnZone2_3TriggerE","airOnZone4_5_6TriggerE","airOnZone4_5_6TriggerE",
			"humOnZone1_7TriggerE","humOnZone2_3TriggerE","humOnZone4_5_6TriggerE","deHumOnZone1_7TriggerE","deHumOnZone2_3TriggerE","deHumOnZone4_5_6TriggerE");

	@Override
	public boolean hasSignal(String sn) {
		return signames.contains(sn);
	}

}
