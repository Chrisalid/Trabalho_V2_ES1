package ecommerce;

public class Pedido {
	
	protected PedidosState state;
	
	private Produto produto;

	public Pedido(Produto produto) {
		System.out.println("Pedido Feito!");
		this.produto = produto;
		state = new PedidoNovo(this.produto);
		
	}
	
	public void irParaPN() {this.state = state.irParaPN();}
	public void irParaPPF() {this.state = state.irParaPPF();}
	public void irParaPA() {this.state = state.irParaPA();}
	public void irParaPT() {this.state = state.irParaPT();}
	public void irParaPE() {this.state = state.irParaPE();}
	public void irParaPC() {this.state = state.irParaPC();}
	public void irParaPR() {this.state = state.irParaPR();}
	public void irParaPF() {this.state = state.irParaPF();}

}
