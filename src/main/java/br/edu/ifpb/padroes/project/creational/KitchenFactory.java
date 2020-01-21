package br.edu.ifpb.padroes.project.creational;

public class KitchenFactory implements RoomFactory{
	
	private String name = "Kitchen";
	
	@Override
	public Device createDevice() {
		return new SimpleLight();
	}

	@Override
	public void attachDevice() {
		// TODO Auto-generated method stub
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
