package ecommerce;


public class PedidoE implements PedidosState {
	
	private Produto produto;
	
	public PedidoE(Produto produto) {this.produto = produto;}

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
		System.out.println("Ação indisponível!");
		return null;
	}

	public PedidosState irParaPF() {
		System.out.println("Seu pedido foi finalizado aproveite o "+produto.getNomeProduto());
		return new PedidoF(this.produto);
	}
	
	public PedidosState irParaPC() {
		System.out.println("Ação indisponível!");
		return null;
	}

	public PedidosState irParaPR() {
		System.out.println("Seu pedido foi reembolsado!");
		return new PedidoR(this.produto);
	}

}
