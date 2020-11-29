package ecommerce;

public class PedidoA implements PedidosState {
	
	private Produto produto;

	public PedidoA(Produto produto) {this.produto = produto;}

	public PedidosState irParaPN() {
		System.out.println("Ação indisponível!");
		return null;
	}

	public PedidosState irParaPPF() {
		System.out.println("Ação indisponível!");
		return null;
	}

	public PedidosState irParaPA() {
		System.out.println("Ação indisponível!");
		return null;
	}

	public PedidosState irParaPT() {
		System.out.println("Seu pedido foi enviado para transporte");
		return new PedidoT(this.produto);
	}

	public PedidosState irParaPE() {
		System.out.println("Ação indisponível!");
		return null;
	}

	public PedidosState irParaPF() {
		System.out.println("Ação indisponível!");
		return null;
	}

	public PedidosState irParaPC() {
		System.out.println("Seu pedido foi cancelado!");
		this.produto.cancelado();
		return new PedidoC(this.produto);
	}

	public PedidosState irParaPR() {
		System.out.println("Ação indisponível!");
		return null;
	}

}
