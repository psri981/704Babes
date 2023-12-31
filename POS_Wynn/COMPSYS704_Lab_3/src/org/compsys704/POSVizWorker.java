package org.compsys704;

import java.util.Arrays;
import java.util.List;

public class POSVizWorker extends POS_Worker{

	@Override
	public void setSignal(boolean status) {
//		System.out.println(signame+"  "+status);
		switch(signame){

		case "orderDoneGUIFlag":
			POS_States.ORDER_DONE = status;
			break;
		default: 
			System.err.println("Wrong sig name : "+signame);
			System.exit(1);
		}
	}
	
	
	static final List<String> signames = Arrays.asList("orderDoneGUIFlag");
	
	@Override
	public boolean hasSignal(String sn) {
		return signames.contains(sn);
	}

}
