package br.edu.ifpb.padroes.project.structural;

import br.edu.ifpb.padroes.project.creational.Device;

public class Party extends SpecialScenario{
	Device device;
	
	public Party() {
		super();
		nome = "Party Mode";
	}
	
	public void turnOff() {
		if(device != null) {
			device.toggle();
		}
		
		if(super.device != null) {
			super.device.toggle(); 
		}
	}
	
	public String getNome() {
        return nome;
    }
	
}
