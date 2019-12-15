package com.behavioral.mediator.example1;

public class TurnOffAllLightsCommand implements Command {

	private Mediator med;
		
	public TurnOffAllLightsCommand(Mediator med) {
		this.med = med;
	}
	
	@Override
	public void execute() {
		med.turnOfAllLights();
	}

}
