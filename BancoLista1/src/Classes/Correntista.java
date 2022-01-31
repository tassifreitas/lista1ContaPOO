package Classes;

//classe Correntista
public class Correntista {
	//declaração de variáveis
	private String nome;
	private int idade;
	private long numeroCPF;
	private long numeroRG;
	private long numeroTelefone;
	
	//instância de conta
	private Conta conta = new Conta();
	
	//construtor da classe correntista
	public Correntista(Double saldo, Double limite) {
		this.conta.setSaldo(saldo);
		this.conta.setLimite(limite);
	}
	
	//métodos getters
	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	public long getNumeroCPF() {
		return numeroCPF;
	}
	public long getNumeroRG() {
		return numeroRG;
	}
	public long getNumeroTelefone() {
		return numeroTelefone;
	}
	
	//métodos setters
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void setNumeroCPF(long numeroCPF) {
		this.numeroCPF = numeroCPF;
	}
	public void setNumeroRG(long numeroRG) {
		this.numeroRG = numeroRG;
	}

	public void setNumeroTelefone(long numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}
	
	//método get e set para infomações de conta
	public Conta getConta() {
		return conta;
	}
	public void setConta(Conta conta) {
		this.conta = conta;
	}

	//retorno das informações do correntista
	@Override
	public String toString() {
		return "Correntista [nome=" + nome + ", numeroCPF=" + numeroCPF + ", numeroRG=" + numeroRG + ", idade=" + idade
				+ ", numeroTelefone=" + numeroTelefone + ", conta=" + conta + "]";
	}
	
}
