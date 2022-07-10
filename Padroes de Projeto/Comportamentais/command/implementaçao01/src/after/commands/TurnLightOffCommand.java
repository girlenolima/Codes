package after.commands;


import after.lights.GenericLight;

public class TurnLightOffCommand implements Command {
	private GenericLight light;
	
	
	public TurnLightOffCommand(GenericLight light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.turnOff();
	}
}
