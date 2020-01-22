package br.edu.ifpb.padroes.project.behavioral;

public class PanicMode {
	protected PanicModeState panicState;
	
	public PanicMode() {
		panicState = new PanicModeOff();	
	}
	
	public void activatePanicMode() {
		panicState = panicState.activatePanicMode();
	}
	
	public void deactivatePanicMode() {
		panicState = panicState.deactivatePanicMode();
	}
}
