import ecommerce.Pedido;
import ecommerce.Pessoa;
import ecommerce.Produto;
import ecommerce.Smartphone;
import ecommerce.SuperGiftCards;

public class Principal {
		
	public static void main(String[] args) {
		
		Produto produtos = new Produto();
		
		Produto googleGift = new Produto("GoogleGift", 10, 50.0f);
		produtos.addProduto(googleGift);
		
		SuperGiftCards supergift = new SuperGiftCards("SuperGift", "Ecommerce", produtos.getProduto(0));
		Smartphone samsung = new Smartphone("J2 Prime");
		Pessoa chris = new Pessoa("Chris", 20, samsung);
		samsung.setUser(chris);
		samsung.addApp(supergift);
		Pedido ordem = supergift.fazerPedido(googleGift);
		ordem.irParaPPF();
		ordem.irParaPA();
		ordem.irParaPC();

	}

}
