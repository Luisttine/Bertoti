package pattern;

public class Teste {
	public static void main(String[] args) {
		Produto caneta1 = new Caneta();
		Produto caneta2 = new Caneta();
		Produto caderno = new Caderno();
		
		Carrinho carrinho = new Carrinho();
		carrinho.add(caneta1);
		carrinho.add(caneta2);
		carrinho.add(caderno);
		
		carrinho.buy();
		
		carrinho.add(caneta1);
		carrinho.add(caderno);
		
		carrinho.buy();
	}
}
