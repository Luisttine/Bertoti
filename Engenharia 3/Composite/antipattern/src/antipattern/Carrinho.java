package antipattern;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
	private List<Caneta> canetas = new ArrayList<Caneta>();
	private List<Caderno> cadernos = new ArrayList<Caderno>();
	
	public void buy() {
		for(Caneta can: canetas)
		{
			can.buy();
		}
		for(Caderno cad: cadernos)
		{
			cad.buy();
		}
		System.out.println("Compra realizada!");
		canetas.clear();
		cadernos.clear();
	}

	public void addCaneta(Caneta c){
		this.canetas.add(c);
	}
	
	public void addCaderno(Caderno c){
		this.cadernos.add(c);
	}
	
	public void removeCaneta(Caneta c){
		canetas.remove(c);
	}
	
	public void removeCaderno(Caderno c){
		cadernos.remove(c);
	}
	
}
