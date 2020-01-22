package br.edu.ifpb.padroes.project.behavioral;

public class PanicModeOn implements PanicModeState{

	public PanicModeOn() {
		System.out.println("Panic mode is ON");
	}
	
	@Override
	public PanicModeState activatePanicMode() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PanicModeState deactivatePanicMode() {
		System.out.println("Panic mode switched OFF");
		return new PanicModeOff();
	}

}
