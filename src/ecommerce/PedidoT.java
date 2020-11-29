package ecommerce;

public class PedidoT implements PedidosState {

	private Produto produto;
	
	public PedidoT(Produto produto) {this.produto = produto;}

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
		System.out.println("Ação indisponível!");
		return null;
	}

	public PedidosState irParaPE() {
		System.out.println("O pedido foi entregue!");
		return new PedidoE(this.produto);
	}

	public PedidosState irParaPF() {
		System.out.println("Ação indisponível!");
		return null;
	}

	public PedidosState irParaPC() {
		System.out.println("Seu pedido foi cancelado");
		return new PedidoC(this.produto);
	}

	public PedidosState irParaPR() {
		System.out.println("Ação indisponível!");
		return null;
	}

}
