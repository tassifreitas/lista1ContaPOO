package Classes;

//Classe Conta
public class Conta {
	//declara��o de vari�ves
	private int numeroConta;
	//0 Conta Corrente - 1 Conta Poupan�a
	private int tipoConta; 
	private double limite, saldo;
	
	//m�todos getters
	public int getNumeroConta() {
		return numeroConta;
	}	
	public int getTipoConta() {
		return tipoConta;
	}
	public double getLimite() {
		return limite;
	}
	public double getSaldo() {
		return saldo;
	}
		
	//m�todos setters
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public void setTipoConta(int tipoConta) {
		this.tipoConta = tipoConta;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	//retorno para os dados da conta
	@Override
	public String toString() {
		return "Conta [numeroConta=" + numeroConta + ", tipoConta=" + tipoConta + ", limite=" + limite + ", saldo="
				+ saldo + "]";
	}
	
	//m�todo para dep�sito
	public String Deposito(Double valor) {
		this.saldo += valor;
		return "Dep�sito realizado no valor de " + valor +", saldo atual: R$ "+this.saldo;
	}
	
	//m�todo para saque
	public String Sacar(Double valor) {
		if(this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return "Saque realizado no valor de " + valor +", saldo atual: R$ "+this.saldo;
		}else {
			return "Saque n�o possivel, seu saldo atual � de: R$ "+this.saldo;
		}
	}
	
	//m�todo para extrato
	public String Extrato() {
		return "Extrato | Saldo R$ "+this.saldo+" | Limite R$ "+this.limite+" | Limite Dispon�vel R$ "+(this.saldo+this.limite);
	}
	
	
}
