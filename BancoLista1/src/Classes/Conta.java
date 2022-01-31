package Classes;

//Classe Conta
public class Conta {
	//declaração de variáves
	private int numeroConta;
	//0 Conta Corrente - 1 Conta Poupança
	private int tipoConta; 
	private double limite, saldo;
	
	//métodos getters
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
		
	//métodos setters
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
	
	//método para depósito
	public String Deposito(Double valor) {
		this.saldo += valor;
		return "Depósito realizado no valor de " + valor +", saldo atual: R$ "+this.saldo;
	}
	
	//método para saque
	public String Sacar(Double valor) {
		if(this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return "Saque realizado no valor de " + valor +", saldo atual: R$ "+this.saldo;
		}else {
			return "Saque não possivel, seu saldo atual é de: R$ "+this.saldo;
		}
	}
	
	//método para extrato
	public String Extrato() {
		return "Extrato | Saldo R$ "+this.saldo+" | Limite R$ "+this.limite+" | Limite Disponível R$ "+(this.saldo+this.limite);
	}
	
	
}
