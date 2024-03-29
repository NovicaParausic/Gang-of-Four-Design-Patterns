package com.behavioral.command.example1;

public class CommandDemo1 {

	public static void main(String[] args) {
		Light light = new Light();
		Switch lightSwitch = new Switch();
		
		Command toggleCommand = new ToggleCommand(light);
		lightSwitch.storeAndExecute(toggleCommand);
		lightSwitch.storeAndExecute(toggleCommand);
		lightSwitch.storeAndExecute(toggleCommand);
	}
}
