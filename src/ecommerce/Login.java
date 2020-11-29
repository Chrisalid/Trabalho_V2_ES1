package ecommerce;

public class Login {
	
	@SuppressWarnings("unused")
	private Pessoa pessoa;
	@SuppressWarnings("unused")
	private Cadastro cadastro;
	private String usuario;
	private String senha;
	
	public Login() {}
	
	public Login(Pessoa pessoa,String usuario, String senha) {
		
	}

	public String getSenha() {return senha;}
	public String getUsuario() {return usuario;}
	
	public void alterarDadosLogin(String usuario, String senha)	{
		this.usuario = usuario;
		this.senha = senha;
	}
	
	public void verificaCadastro() {}
	
	public void informacoesdoUsuario() {}
	
	//Metodo para fazer login
	public void fazerLogin() {}
	

}
