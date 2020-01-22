package br.edu.ifpb.padroes.project.creational;

public class PartyFactory implements RoomFactory{
	private String name = "PartyMode";

	@Override
	public Device createDevice() {
		//System.out.println("Creating a new device (Strobe light) using Factory");
		return  new StrobeLight();
	}
}
