public class Gerente extends Funcionario {
	private String	usuario;
	private String	senha;
	
	public double calculaBonificacao() {
		return this.getSalario() * 0.6 + 100;
	}
	
	public void mostraDados() {
		super.mostraDados();
		System.out.println("Usuário: " + this.getUsuario());
		System.out.println("Senha: " + this.getSenha());
	}
	
	public String getUsuario() {
		return usuario;
	}
	
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
}
