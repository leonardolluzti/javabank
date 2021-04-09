import java.util.Scanner;

public class ContaExemplo {

	public static void main(String[] args) {
		
		// criação de conta corrente!	
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Leonardo");
		pessoa.setCpf("123.456.789-10");
		ContaCorrente cc = new ContaCorrente();
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
// Menu
		Scanner menu = new Scanner(System.in);
		System.out.println("=======================================================");
		System.out.println("Bem Vindo ao JavaBank, o que você gostaria de fazer?");
		System.out.println("1 - Verificar dados da conta");
		System.out.println("2 - Ver saldo");
		System.out.println("3 - Fazer Depósito");
		System.out.println("4 - Fazer Saque");
		System.out.println("5 - Fazer Transferência");
		System.out.println("6 - Sair");
		System.out.println("=======================================================");
		System.out.print("Opção: ");
		int op = menu.nextInt();
		
		switch (op) {
			//Verificar dados da conta
			case 1: 
				System.out.println("=======================================================");
				System.out.println("Qual seu tipo de conta? ");
				System.out.println("1 - Conta Corrente");
				System.out.println("2 - Conta Poupança");
				System.out.print("Opção: ");
				int tpconta = menu.nextInt();
				if (tpconta==1){
					System.out.println("=======================================================");
					cc.exibirDados();
					System.out.println("=======================================================");
				}
				else if (tpconta==2){
					System.out.println("=======================================================");
					cp.exibirDados();
					System.out.println("=======================================================");
				}
				else{
					System.out.println("Opção inválida!");
				}				
				break;
			//Ver saldo
			case 2: 
				System.out.println("=======================================================");
				System.out.println("Qual seu tipo de conta? ");
				System.out.println("1 - Conta Corrente");
				System.out.println("2 - Conta Poupança");
				System.out.print("Opção: ");
				int tpconta2 = menu.nextInt();
				if (tpconta2==1){
					System.out.println("=======================================================");
					cc.exibirSaldo();
					System.out.println("=======================================================");
				}
				else if (tpconta2==2){
					System.out.println("=======================================================");
					cp.exibirSaldo();
					System.out.println("=======================================================");
				}
				else{
					System.out.println("Opção inválida!");
				}
				break;
			//Fazer Depósito
			case 3: 
				System.out.println("=======================================================");
				System.out.println("Qual seu tipo de conta? ");
				System.out.println("1 - Conta Corrente");
				System.out.println("2 - Conta Poupança");
				System.out.print("Opção: ");
				int tpconta3 = menu.nextInt();
				if (tpconta3==1){
					System.out.println("=======================================================");
					System.out.print("Digite o Valor que Deseja depositar: R$");
					double valor1 = menu.nextDouble();
					System.out.println("=======================================================");
					cc.exibirDados();
					cc.exibirSaldo();
					cc.depositar(valor1);
					cc.exibirSaldo();
					System.out.println("=======================================================");
				}
				else if (tpconta3==2){
					System.out.println("=======================================================");
					System.out.print("Digite o Valor que Deseja depositar: R$");
					double valor2 = menu.nextDouble();
					System.out.println("=======================================================");
					cp.exibirDados();
					cp.exibirSaldo();
					cp.depositar(valor2);
					cp.exibirSaldo();
					System.out.println("=======================================================");
					
				}
				else{
					System.out.println("Opção inválida!");
				}
				break;
			//Fazer Saque
			case 4: 
				System.out.println("=======================================================");
				System.out.println("Qual seu tipo de conta? ");
				System.out.println("1 - Conta Corrente");
				System.out.println("2 - Conta Poupança");
				System.out.print("Opção: ");
				int tpconta4 = menu.nextInt();
				if (tpconta4==1){
					System.out.print("Digite o Valor que Deseja sacar: R$");
					double valor3 = menu.nextDouble();
					System.out.println("=======================================================");
					cc.exibirDados();
					cc.exibirSaldo();
					cc.sacar(valor3);
					cc.exibirSaldo();
					System.out.println("=======================================================");
				}
				else if (tpconta4==2){
					System.out.print("Digite o Valor que Deseja sacar: R$");
					double valor4 = menu.nextDouble();
					System.out.println("=======================================================");
					cp.exibirDados();
					cp.exibirSaldo();
					cp.sacar(valor4);
					cp.exibirSaldo();
					System.out.println("=======================================================");
					
				}
				else{
					System.out.println("Opção inválida!");
				}
				break;
			//Fazer Transferência
			case 5: 
				System.out.println("=======================================================");
				System.out.println("Qual seu tipo de conta? ");
				System.out.println("1 - Conta Corrente");
				System.out.println("2 - Conta Poupança");
				System.out.print("Opção: ");
				int tpconta5 = menu.nextInt();
				if (tpconta5==1){
					System.out.print("Digite o Valor que Deseja Transferir: R$");
					double valor5 = menu.nextDouble();
					System.out.println("=======================================================");
					cc.exibirSaldo();
					cc.transferir(cp, valor5);
					cc.exibirSaldo();
					cp.exibirSaldo();
					System.out.println("=======================================================");
				}
				else if (tpconta5==2){
					System.out.print("Digite o Valor que Deseja Transferir: R$");
					double valor6 = menu.nextDouble();
					System.out.println("=======================================================");
					cp.exibirSaldo();
					cp.transferir(cc, valor6);
					cp.exibirSaldo();
					cc.exibirSaldo();
					System.out.println("=======================================================");
					
				}
				else{
					System.out.println("Opção inválida!");
				}				
				break;
			//Sair do Sistema
			case 6: 
				System.out.println("Até mais!");
				break;
			}
		menu.close();		
		System.out.println("Fim do Programa!");
	}

}
