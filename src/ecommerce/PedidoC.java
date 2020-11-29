package ecommerce;

public class PedidoC implements PedidosState {
	
	private Produto produto;
	
	public PedidoC(Produto produto) {this.produto = produto;}

	public PedidosState irParaPN() {
		System.out.println("Pedido Refeito!");
		return new PedidoNovo(produto);
	}

	public PedidosState irParaPPF() {
		System.out.println("Ação indisponível, seu pedido foi cancelado!");
		return null;
	}

	public PedidosState irParaPA() {
		System.out.println("Ação indisponível, seu pedido foi cancelado!");
		return null;
	}

	public PedidosState irParaPT() {
		System.out.println("Ação indisponível, seu pedido foi cancelado!");
		return null;
	}

	public PedidosState irParaPE() {
		System.out.println("Ação indisponível, seu pedido foi cancelado!");
		return null;
	}

	public PedidosState irParaPF() {
		System.out.println("Ação indisponível, seu pedido foi cancelado!");
		return null;
	}

	public PedidosState irParaPC() {
		System.out.println("Ação indisponível, seu pedido foi cancelado!");
		return null;
	}

	public PedidosState irParaPR() {
		System.out.println("Ação indisponível, seu pedido foi cancelado!");
		return null;
	}

}
