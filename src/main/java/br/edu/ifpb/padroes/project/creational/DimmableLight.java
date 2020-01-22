package br.edu.ifpb.padroes.project.creational;

public class DimmableLight implements Device {

	public String name = "Dimmable Light";
	public boolean isTurnedOn = false;
	
	@Override
	public String createDevice() {
		// TODO Auto-generated method stub
		System.out.println("Create Device for DimmableLight");
		return name;
	}

	@Override
	public void toggle() {
		this.isTurnedOn = !this.isTurnedOn;
		System.out.println("Toggle for DimmableLight status is " + this.isTurnedOn);

	}

	@Override
	public void turnOn() {
		this.isTurnedOn = true;
		
		System.out.println("DimmableLight is ON - " + this.isTurnedOn);
		
		
	}

}
