package br.edu.ifpb.padroes.project.structural;

public abstract class RoomDecorator extends SpecialScenario{
	
	SpecialScenario scenario;
	
	public RoomDecorator(SpecialScenario scenario) {
		this.scenario = scenario;
	}
	
    public String getNome() {
        return scenario.getNome()  + " + " + nome;
    }
}
