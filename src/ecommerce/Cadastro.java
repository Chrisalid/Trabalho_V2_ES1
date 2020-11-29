package ecommerce;

import java.util.ArrayList;

public class Cadastro extends Login{
	
	@SuppressWarnings("unused")
	private ArrayList<Pessoa> lista = new ArrayList<Pessoa>();
	@SuppressWarnings("unused")
	private boolean x = false;
	
	public Cadastro(Pessoa pessoa, String usuario, String senha) {}
	 //metodo para verificar se o usuario já existe
	@Override
	public void verificaCadastro() {}
	
	@Override
	public void informacoesdoUsuario() {}

}
