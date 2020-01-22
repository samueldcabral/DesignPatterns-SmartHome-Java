package br.edu.ifpb.padroes.project.creational;

public class LivingRoomFactory implements RoomFactory{

	private String name = "Living Room";

	@Override
	public Device createDevice() {
		return  new SimpleLight();
		// TODO Auto-generated method stub
		
	}

	//@Override
	//public void attachDevice() {
	//	// TODO Auto-generated method stub
	//	
	//}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
