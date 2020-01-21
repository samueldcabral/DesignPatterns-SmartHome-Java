package br.edu.ifpb.padroes.project.structural;

public class LivingRoomDecorator extends RoomDecorator{

	public LivingRoomDecorator(SpecialScenario scenario) {
		super(scenario);
		nome = "Living Room"; 
	}

}
