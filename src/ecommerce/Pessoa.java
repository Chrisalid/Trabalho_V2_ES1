package ecommerce;


public class Pessoa {
	
	private String nome;
	private int idade;
	private Smartphone smartphone;
	
	
	public Pessoa(String nome, int idade, Smartphone smartphone){
		this.nome = nome;
		this.idade = idade;
		this.smartphone = smartphone;
	}
	
	
	public String getNome() {return nome;}
	
	public int getIdade() {return idade;}
	
	public Smartphone getSmartphone() {return smartphone;}
	public void setSmartphone(Smartphone smartphone) {this.smartphone = smartphone;}	

}
