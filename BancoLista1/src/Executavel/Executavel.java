package Executavel;
import javax.swing.JOptionPane;
import Classes.Correntista;

public class Executavel {
public static void main(String[] args) {
		
	//instancia de correntista com saldo inicial de 1000 e limite de 500
		Correntista correntista = new Correntista(1000.00,500.00);
		
		//informações informadas pelo usuário
		String nome = JOptionPane.showInputDialog("Informe o nome: ");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade: "));
		long cpf = Long.parseLong(JOptionPane.showInputDialog("Informe o CPF: "));
		long rg = Long.parseLong(JOptionPane.showInputDialog("Informe o RG: "));
		long telefone = Long.parseLong(JOptionPane.showInputDialog("Informe o n° Telefone: "));
		
		
		correntista.setNome(nome);
		correntista.setNumeroCPF(cpf);
		correntista.setNumeroRG(rg);
		correntista.setIdade(idade);
		correntista.setNumeroTelefone(telefone);
		correntista.getConta().setNumeroConta(12345);
		correntista.getConta().setTipoConta(0);
		
		//impressão das informações informadas
		System.out.println("----Informações correntista----");
		System.out.println(correntista.toString());
		System.out.println("Saldo = "+correntista.getConta().getSaldo());
		System.out.println("Limite = "+correntista.getConta().getLimite());
		System.out.println("----------------------------------------------------------");
		
		//depósito
		int realizarDeposito = 0;
		do {
			realizarDeposito = JOptionPane.showConfirmDialog(null, "Deseja realizar Depósito?");
			if(realizarDeposito == 0) {
				String valorDeposito = JOptionPane.showInputDialog("Informe o valor: ");
				System.out.println(correntista.getConta().Deposito(Double.parseDouble(valorDeposito)));
			}
			else {
				System.out.println(correntista.getConta().Deposito(Double.parseDouble("0")));
			}
		}while(realizarDeposito == 0);
		
		System.out.println("\n");
		//saque
		int realizarSaque = 0;
		do {
			realizarSaque = JOptionPane.showConfirmDialog(null, "Deseja realizar Saque?");
			if(realizarSaque == 0) {
				String valorSaque = JOptionPane.showInputDialog("Informe o valor: ");
				
				System.out.println(correntista.getConta().Sacar(Double.parseDouble(valorSaque)));
			}
			else {
				System.out.println(correntista.getConta().Sacar(Double.parseDouble("0")));
			}
		}while(realizarSaque == 0);
		System.out.println("\n");
		//extrato
		System.out.println(correntista.getConta().Extrato());
		
		

	}

}
