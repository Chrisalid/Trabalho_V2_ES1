package ecommerce;

import java.util.ArrayList;

public class Produto {
	
	private String nome;
	private ArrayList<Produto> produto = new ArrayList<Produto>();
	private int estoque;
	private float valor;
	private int i = 0;
	
	public Produto() {}
	
	public Produto(String nome, int estoque, float valor) {
		this.nome = nome;
		this.estoque = estoque;
		this.valor = valor;
	}
	
	public void addProduto(Produto produto) {
		this.produto.add(produto);
		this.i++;
	}
	
	public int size() {
		return this.i;
	}
	
	public Produto getProduto(int ind) {
		return this.produto.get(ind);
	}
	
	public int getEstoque() {return estoque;}
	public float getValorProd() {return this.valor;}
	
	public void retirada() {this.estoque = this.estoque - 1;}
	public void cancelado() {this.estoque++;}
	
	public String getNomeProduto() {return nome;}
	
	public void informacoesProduto() {System.out.println("Existem "+estoque+"de "+nome);}
	
}
