package ecommerce;


public class PedidoNovo implements PedidosState {
	private Produto produto;

	public PedidoNovo(Produto produto) {this.produto = produto;}

	public PedidosState irParaPPF() {
		System.out.println("O seu foi pago! ");
		return new Pedido_PPF(this.produto);
	}
	public PedidosState irParaPC() {
		System.out.println("Seu pedido foi cancelado!");
		return new PedidoC(this.produto);
	}
	public PedidosState irParaPN() {
		System.out.println("Seu pedido ja foi feito!");
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
		System.out.println("Ação indisponível!");
		return null;
	}
	public PedidosState irParaPF() {
		System.out.println("Ação indisponível!");
		return null;
	}
	public PedidosState irParaPR() {
		System.out.println("Ação indisponível!");
		return null;
	}

}
