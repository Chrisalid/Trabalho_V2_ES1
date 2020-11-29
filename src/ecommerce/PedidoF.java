package ecommerce;

public class PedidoF implements PedidosState {
	
	@SuppressWarnings("unused")
	private Produto produto;
	
	public PedidoF(Produto produto) {
		this.produto = produto;
	}
	
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
		System.out.println("Ação indisponível!");
		return null;
	}

	public PedidosState irParaPC() {
		System.out.println("Ação indisponível!");
		return null;
	}

	public PedidosState irParaPR() {
		System.out.println("Ação indisponível!");
		return null;
	}

}
