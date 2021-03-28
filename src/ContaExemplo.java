
public class ContaExemplo {

	public static void main(String[] args) {
		// criação de conta corrente!
		ContaCorrente cc = new ContaCorrente();
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Leonardo");
		pessoa.setCpf("123.456.789-10");
		
		cc.abrirConta();
		cc.setPessoa(pessoa);
		cc.setNumero(9876);
		cc.setAgencia(1304);
		cc.setSaldo(1000.00);
		cc.setLimite(2000.00);
//		cc.exibirDados();
//		cc.exibirSaldo();
		//System.out.println("Limite Atual R$ " + cc.getLimite());
		System.out.println("=======================================================");
		// criação de conta poupança
		ContaPoupanca cp = new ContaPoupanca();
		Pessoa p2 = new Pessoa();
		p2.setNome("Arthur");
		p2.setCpf("321.456.789-10");
		cp.abrirConta();
		cp.setPessoa(p2);
		cp.setNumero(3210);
		cp.setAgencia(1304);
		cp.setSaldo(100.00);
		cp.setLimite(cp.getSaldo());
		cp.exibirDados();
		cp.exibirSaldo();
		System.out.println("=======================================================");
		// operações em conta corrente
		cc.exibirDados();
		cc.sacar(10);
		cc.exibirSaldo();
		System.out.println("=======================================================");
		cc.exibirDados();
		cc.exibirSaldo();
		cc.depositar(10);
		cc.exibirSaldo();
		System.out.println("=======================================================");
		cc.exibirSaldo();
		cc.transferir(cp, 10);
		cc.exibirSaldo();
		cp.exibirSaldo();
		// operações em conta poupança
		cp.exibirDados();
		cp.exibirSaldo();
		cp.sacar(12);
		cp.exibirSaldo();
		System.out.println("=======================================================");
		cp.exibirDados();
		cp.exibirSaldo();
		cp.depositar(10);
		cp.exibirSaldo();
	}

}
