public class TestaFuncionarios {
	
	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setNome("Eduardo Bernstein");
		g.setSalario(1000.0);
		g.setUsuario("eduardo.bernstein");
		g.setSenha("1234");
		Telefonista t = new Telefonista();
		t.setNome("Telefonista 1");
		t.setSalario(100.0);
		t.setEstacaoDeTrabalho(1);
		Secretaria s = new Secretaria();
		s.setNome("Secretaria 1");
		s.setSalario(500.0);
		s.setRamal(1313);
		System.out.println("GERENTE");
		System.out.println("Nome: " + g.getNome());
		System.out.println("Salário: " + g.getSalario());
		System.out.println("Usuário: " + g.getUsuario());
		System.out.println("Senha: " + g.getSenha());
		System.out.println("Bonificação: " + g.calculaBonificacao());
		System.out.println("TELEFONISTA");
		System.out.println("Nome: " + t.getNome());
		System.out.println("Salário: " + t.getSalario());
		System.out.println("Estacao de trabalho: " + t.getEstacaoDeTrabalho());
		System.out.println("Bonificação: " + t.calculaBonificacao());
		System.out.println("SECRETARIA");
		System.out.println("Nome: " + s.getNome());
		System.out.println("Salário: " + s.getSalario());
		System.out.println("Ramal: " + s.getRamal());
		System.out.println("Bonificação: " + s.calculaBonificacao());
		System.out.println("GERENTE - usando mostraDados");
		g.mostraDados();
		System.out.println("TELEFONISTA - usando mostraDados");
		t.mostraDados();
		System.out.println("SECRETARIA - usando mostraDados");
		s.mostraDados();
	}
	
}
