package ecommerce;

public abstract class Apps {
	
	private String nome;
	private String tipo;
	
	public Apps(String nome, String tipo) {
		this.nome = nome;
		this.tipo = tipo;
	}
	
	public void setNome(String nome) {this.nome = nome;}
	public String getNome() {return nome;}
	
	public String getTipo() {return tipo;}

}
