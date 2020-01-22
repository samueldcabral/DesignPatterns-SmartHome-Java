package br.edu.ifpb.padroes.project.creational;

public class StrobeLight implements Device {
	public String name = "Strobe Light";
	public boolean isTurnedOn = false;
	@Override
	public String createDevice() {
		// TODO Auto-generated method stub
		System.out.println("Create Device for StrobeLight");
		return name;
	}

	@Override
	public void toggle() {
		this.isTurnedOn = !this.isTurnedOn;
		System.out.println("Toggle for StrobeLight status is " + this.isTurnedOn);

	}

	@Override
	public void turnOn() {
		this.isTurnedOn = true;
		System.out.println("StrobeLight is ON - " + this.isTurnedOn);
	}

}
