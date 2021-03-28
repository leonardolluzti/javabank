
public abstract class Conta {
	private int numero;
	private int agencia;
	private Pessoa pessoa;
	private double saldo;
	private double limite;
	private boolean contaAtiva = false;
		
	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", agencia=" + agencia + ", pessoa=" + pessoa + ", saldo=" + saldo
				+ ", limite=" + limite + "]";
	}
	
	void abrirConta() {
		if(this.getContaAtiva()==false) {
			this.setContaAtiva(true);
			System.out.println("Conta aberta com sucesso!");
			}
		else {
			System.out.println("Conta já está ativa!");
		}
	}
void fecharConta() { //só podera fechar uma conta se o saldo for 0
		if(this.getContaAtiva()==true) { 
			this.setContaAtiva(false);
			System.out.println("Conta fechada com sucesso!");
			}
		else {
			System.out.println("Conta já está inativa!");
		}
	}
	public boolean getContaAtiva() {
		return contaAtiva;
	}

	public void setContaAtiva(boolean contaAtiva) {
		this.contaAtiva = contaAtiva;
	}

	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	void depositar(double valor) {
		if (valor > 0) {
		this.saldo = saldo + valor;
		}
		else {
			System.out.println("Impossível depositar!");
		}
	}
	
	boolean sacar(double valor) {
		if (valor > 0 && saldo >= valor) {
		this.saldo = saldo - valor;	
		return true;
		}
		else if(valor <= 0) {
			System.out.println("Valor inválido!");
			return false;
		}
		else {
			System.out.println("Saldo insuficiente!");
			return false;
			
		}
	}
	
	void transferir(Conta contaDestino, double valor) {
		if (this.sacar(valor)==true) {
			contaDestino.depositar(valor);
		}
		
	}
	
	void exibirDados() {
		System.out.println("Nome: " + this.pessoa.getNome() + " CPF: " + this.pessoa.getCpf());
		System.out.println("Agência: " + this.agencia + " Conta: " + this.numero);		
	}
	
	void exibirSaldo() {
		System.out.println("Saldo atual R$ " + this.saldo);
	}
	


	
}
