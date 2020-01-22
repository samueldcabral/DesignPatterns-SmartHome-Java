package br.edu.ifpb.padroes.project.behavioral;

public class PanicModeOff implements PanicModeState{
	
	public PanicModeOff() {
		System.out.println("Panic mode is OFF");
	}

	@Override
	public PanicModeState activatePanicMode() {
		System.out.println("Panic mode switched ON");
		return new PanicModeOn();
	}

	@Override
	public PanicModeState deactivatePanicMode() {
		
		return null;
	}

}
