package ecommerce;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class SuperGiftCards extends Apps{
	
	private Login login;
	private Produto produto;
	private Pedido pedido = null;
	private int i = 0;
	
	public SuperGiftCards(String nome, String tipo) {
		super(nome, tipo);
	}
	
	public SuperGiftCards(Login login, String nome, String tipo) {
		super(nome, tipo);
		this.login = login;
		this.login.fazerLogin();
	}
	
	public SuperGiftCards(String nome, String tipo, Produto produto) {
		super(nome, tipo);
		this.produto = produto;
	}
	
	public void verificarProduto(Produto prod) {
		for(int i = 0; i < prod.size(); i++) {
			if(this.produto.getEstoque() > 0 && this.produto == prod.getProduto(i)) {
				produto.getProduto(i).informacoesProduto();
			}
			else {
				System.out.println("Produto Inexistente");
			}
		}
	}

	public Pedido fazerPedido(Produto produto) {
		Produto prod = new Produto();
		for(int i = 0; i < produto.size(); i++) {
			if(this.produto.getEstoque() > 0 && this.produto == produto.getProduto(i)) {
				prod = this.produto;
			}
			else {
				System.out.println("Produto Inexistente");
			}
		}
		return new Pedido(prod);
	}
}
