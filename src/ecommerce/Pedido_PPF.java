package ecommerce;

public class Pedido_PPF implements PedidosState {
	
	private Produto produto;

	public Pedido_PPF(Produto produto) {this.produto = produto;}

	public PedidosState irParaPN() {
		System.out.println("Ação Rejeitada!");
		return null;
	}

	public PedidosState irParaPPF() {
		System.out.println("Ação Rejeitada!");
		return null;
	}

	public PedidosState irParaPA() {
		System.out.println("Seu pedido foi aceito!");
		return new PedidoA(produto);
	}

	public PedidosState irParaPT() {
		System.out.println("Ação Rejeitada!");
		return null;
	}

	public PedidosState irParaPE() {
		System.out.println("Ação Rejeitada!");
		return null;
	}

	public PedidosState irParaPF() {
		System.out.println("Ação Rejeitada!");
		return null;
	}

	public PedidosState irParaPC() {
		System.out.println("Seu pedido foi cancelado!");
		produto.cancelado();
		return new PedidoC(produto);
	}

	public PedidosState irParaPR() {
		System.out.println("Ação Rejeitada!");
		return null;
	}

}
