package br.edu.ifpb.padroes.project.structural;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifpb.padroes.project.creational.Device;
import br.edu.ifpb.padroes.project.creational.RoomFactory;

public abstract class SpecialScenario {
	String nome;
	Device device;

    public Device getDevice() {
		return device;
	}

	public void setDevice(Device device) {
		this.device = device;
	}

	public String getNome() {
        return nome;
    }

	public void turnOff() {}	
}
