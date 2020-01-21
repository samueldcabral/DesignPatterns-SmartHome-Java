package br.edu.ifpb.padroes.project.creational;

public class LivingRoomFactory implements RoomFactory{

	@Override
	public Device createDevice() {
		return  new SimpleLight();
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attachDevice() {
		// TODO Auto-generated method stub
		
	}

}
