package org.compsys704;

import java.util.Arrays;
import java.util.List;

public class LiquidFillerViz extends Worker{

	@Override
	public void setSignal(boolean status) {
//		System.out.println(signame+"  "+status);
		switch(signame){

		case "valveInjectorGUI":
			LiquidFillerStates.VALVE_INJECTOR_ON_OFF = status;
			break;
		case "valveInletOnOffGUI":
			LiquidFillerStates.VALVE_INLET_ON_OFF = status;
			break;
		case "dosUnitValveRetractGUI":
			LiquidFillerStates.DOS_UNIT_VALVE_RETRACT = status;
			break;
		case "dosUnitValveExtendGUI":
			LiquidFillerStates.DOS_UNIT_VALVE_EXTEND = status;
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
