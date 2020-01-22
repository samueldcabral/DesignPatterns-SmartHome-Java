package br.edu.ifpb.padroes.project.creational;

public class SimpleLight implements Device {

	public String name = "Simple Light";
	public boolean isTurnedOn = false;
	
	@Override
	public String createDevice() {
		// TODO Auto-generated method stub
		System.out.println("Create Device for SimpleLight");
		return name;

	}

	@Override
	public void toggle() {
		// TODO Auto-generated method stub 
		this.isTurnedOn = !this.isTurnedOn;
		System.out.println("Toggle for SimpleLight status is " + this.isTurnedOn);
		
	}

	@Override
	public void turnOn() {
		this.isTurnedOn = true;
		System.out.println("SimpleLight is ON - " + this.isTurnedOn);
	}
	

}
