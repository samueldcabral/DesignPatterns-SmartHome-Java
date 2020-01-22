package br.edu.ifpb.padroes.project.structural;

public abstract class SpecialScenario {
	String nome;
	List<RoomFactory> factories = new ArrayList<>();

    public String getNome() {
        return nome;
    }

	public void attachFactory(RoomFactory factory) {
		this.factories.add(factory);
	}

	public void turnOnAllDevices() {
		for(factory : factories) {
			if(!factory.status) {
				factory.toggle();
			}
		}
	}	
}
