package main;

import moves.*;

public class Player {
	private Actions action;
	
	public void setAction(Actions action) {
		this.action = action;
	}
	
	public void realizarAcao() {
		this.action.action();
	}
}
