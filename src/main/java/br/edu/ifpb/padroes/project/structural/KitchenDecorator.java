package br.edu.ifpb.padroes.project.structural;

import br.edu.ifpb.padroes.project.creational.Device;
import br.edu.ifpb.padroes.project.creational.KitchenFactory;
import br.edu.ifpb.padroes.project.creational.PartyFactory;
import br.edu.ifpb.padroes.project.creational.RoomFactory;

public class KitchenDecorator extends RoomDecorator{
	Device device;
	public KitchenDecorator(SpecialScenario scenario) {
		super(scenario);
		nome = "Kitchen";
		RoomFactory party =  new PartyFactory();
		device = party.createDevice();
		System.out.println("Kitchen created device party");
		device.turnOn();
	}
	
	public void turnOff() {
		if(device != null) {
			device.toggle();
		}
		
		if(super.device != null) {
			super.device.toggle(); 
		}
		
		if(scenario.device != null) {
			scenario.device.toggle(); 
		}
	}
}
