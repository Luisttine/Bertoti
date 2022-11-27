package main;

import moves.*;

public class Dama {
	public static void main(String[] args) {
		Player gustavo = new Player();
		
		gustavo.setAction(new Left_Bottom_Move());
		gustavo.realizarAcao();
		
		System.out.println("--------------------------------------");
		
		gustavo.setAction(new Left_Up_Move());
		gustavo.realizarAcao();
		
		System.out.println("--------------------------------------");
		
		gustavo.setAction(new Capture());
		gustavo.realizarAcao();
	}
}
	