
public class ContaPoupanca extends Conta{
	private double bonus = 10;
	
	
	@Override
	void depositar(double valor) {
		if (valor>0){
		System.out.println("Depósito Solicitado R$ " + valor);
		System.out.println("Bônus R$ " + bonus);
		valor = valor + bonus;
		super.depositar(valor);
		System.out.println("Valor depositado em conta R$ " + valor);
		}
		else{
			System.out.println("Valor inválido!");
			System.out.println("Depósito não realizado!");
		}
	}
	
	@Override
	boolean sacar(double valor) {
		if (valor > 0 && valor<=this.getSaldo()){
		System.out.println("Saque Solicitado R$ " + valor);
		super.sacar(valor);
		System.out.println("Valor debitado em conta R$ " + valor);
		return true;
		}
		else{
			System.out.println("Valor inválido!");
			System.out.println("Saque não realizado!");
			return false;
		}
	}
	@Override
	void exibirDados() {
		System.out.println("Tipo de Conta: Poupança!");
		super.exibirDados();
	}
	
}