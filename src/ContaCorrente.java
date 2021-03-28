
public class ContaCorrente extends Conta{
	private double desconto = 10;
	
	@Override
	boolean sacar(double valor) {
		if (valor > 0 && valor+desconto<=this.getSaldo()){
		System.out.println("Saque Solicitado R$ " + valor);
		System.out.println("Taxa de Serviço R$ " + desconto);
		valor = valor + desconto;
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
	void depositar(double valor) {
		if (valor>0){
		System.out.println("Depósito Solicitado R$ " + valor);
		super.depositar(valor);
		System.out.println("Valor depositado em conta R$ " + valor);
		}
		else{
			System.out.println("Valor inválido!");
			System.out.println("Depósito não realizado!");
		}
	}
	
	@Override
	void exibirDados() {
		System.out.println("Tipo de Conta: Corrente");
		super.exibirDados();
	}
	
	
}
