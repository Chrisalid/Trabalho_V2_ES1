package ecommerce;

public class PedidoR implements PedidosState {
	
	@SuppressWarnings("unused")
	private Produto produto;
	
	public PedidoR(Produto produto) {
		this.produto = produto;
	}
	

	public PedidosState irParaPN() {
		System.out.println("A��o indispon�vel!");
		return null;
	}

	public PedidosState irParaPPF() {
		System.out.println("A��o indispon�vel!");
		return null;
	}

	public PedidosState irParaPA() {
		System.out.println("A��o indispon�vel!");
		return null;
	}

	public PedidosState irParaPT() {
		System.out.println("A��o indispon�vel!");
		return null;
	}

	public PedidosState irParaPE() {
		System.out.println("A��o indispon�vel!");
		return null;
	}

	public PedidosState irParaPF() {
		System.out.println("A��o indispon�vel!");
		return null;
	}

	public PedidosState irParaPC() {
		System.out.println("A��o indispon�vel!");
		return null;
	}

	public PedidosState irParaPR() {
		System.out.println("A��o indispon�vel!");
		return null;
	}

}
