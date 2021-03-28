
public class Pessoa {
	private String nome;
	private String cpf;
	
	
	@Override
	public String toString() {
		return "Pessoa [Nome=" + nome + ", CPF=" + cpf +  "]";
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	

}
