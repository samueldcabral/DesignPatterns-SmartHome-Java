package br.edu.ifpb.padroes.project.creational;

public class SimpleLight implements Device {

	public String name = "Simple Light";
	public boolean isTurnedOn = false;
	
	@Override
	public void createDevice() {
		// TODO Auto-generated method stub
		System.out.println("Create Device for SimpleLight");
	}

	@Override
	public void toggle() {
		// TODO Auto-generated method stub 
		this.isTurnedOn = !this.isTurnedOn;
		System.out.println("Toggle for SimpleLight is " + this.isTurnedOn);
	}
	

}
