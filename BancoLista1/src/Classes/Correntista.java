package Classes;

//classe Correntista
public class Correntista {
	//declara��o de vari�veis
	private String nome;
	private int idade;
	private long numeroCPF;
	private long numeroRG;
	private long numeroTelefone;
	
	//inst�ncia de conta
	private Conta conta = new Conta();
	
	//construtor da classe correntista
	public Correntista(Double saldo, Double limite) {
		this.conta.setSaldo(saldo);
		this.conta.setLimite(limite);
	}
	
	//m�todos getters
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
	
	//m�todos setters
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
	
	//m�todo get e set para infoma��es de conta
	public Conta getConta() {
		return conta;
	}
	public void setConta(Conta conta) {
		this.conta = conta;
	}

	//retorno das informa��es do correntista
	@Override
	public String toString() {
		return "Correntista [nome=" + nome + ", numeroCPF=" + numeroCPF + ", numeroRG=" + numeroRG + ", idade=" + idade
				+ ", numeroTelefone=" + numeroTelefone + ", conta=" + conta + "]";
	}
	
}
