package ecommerce;

import java.util.ArrayList;
import java.util.List;

public class Smartphone {
	
	private String modelo;
	private List<Apps> app = new ArrayList<Apps>();
	private Pessoa pessoa;
	
	public Smartphone(String modelo) {
		this.modelo = modelo;
	}
	
	public void setUser(Pessoa pessoa) {this.pessoa = pessoa;}
	
	public void setModelo(String modelo) {this.modelo = modelo;}
	public String getModelo() {return modelo;}
	
	public void addApp(Apps app) {this.app.add(app);}
	public void appList(){
		for(Apps ap: app) {
			System.out.println(ap.getNome()+ ", ");
		}
	}
	
	public Apps getApp(Apps app) {return app;}
	
	public Pessoa getUser() {return this.pessoa;}
}
