package pattern;

import java.util.ArrayList;
import java.util.List;

public class Carrinho implements Produto {
		private List<Produto> produtos = new ArrayList<Produto>();
		
		@Override
		public void buy() {
			for(Produto p: produtos)
			{
				p.buy();
			}
			System.out.println("Compra realizada!");
			produtos.clear();
		}

		public void add(Produto p){
			this.produtos.add(p);
		}
		
		public void remove(Produto p){
			produtos.remove(p);
		}
		

}
