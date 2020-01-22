package br.edu.ifpb.padroes.project.creational;

public class KitchenFactory implements RoomFactory{
	
	private String name = "Kitchen";
	
	@Override
	public Device createDevice() {
		System.out.println("Creating a new device (Dimmable light) for Kitchen using Factory");
		return new DimmableLight();
	}

	//@Override
	//public void attachDevice() {
	//	// TODO Auto-generated method stub
		
	//}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
