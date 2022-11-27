package antipattern;

public class Teste {
	public static void main(String[] args) {
		Caneta caneta1 = new Caneta();
		Caneta caneta2 = new Caneta();
		Caderno caderno = new Caderno();
		
		Carrinho carrinho = new Carrinho();
		carrinho.addCaneta(caneta1);
		carrinho.addCaneta(caneta2);
		carrinho.addCaderno(caderno);
		
		carrinho.buy();
		
		carrinho.addCaneta(caneta1);
		carrinho.addCaderno(caderno);
		
		carrinho.buy();
	}
}
