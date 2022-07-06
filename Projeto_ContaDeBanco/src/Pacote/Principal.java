package Pacote;
import java.util.Scanner;
public class Principal {
public static void main(String[] args) {
	Conta novaConta= new Conta();
	String tipo;
	int numero =1;
	String nome;
	
	int resp;
	boolean status = false;
	Scanner leia = new Scanner(System.in);

		System.out.println("Qual é o seu nome?");
		nome = leia.nextLine();
	
	do {
		System.out.println("Deseja criar uma conta corrente ou uma conta poupança?(digite cc ou cp)");
		tipo = leia.nextLine();
		tipo = tipo.toLowerCase();
}while(tipo == "cc" && tipo == "cp" );
	if(tipo == "cc") {
		novaConta.setSaldo(novaConta.getSaldo() + 50); 
	}else {
		novaConta.setSaldo(novaConta.getSaldo() + 150); 
		
	}
status = true;
 novaConta.abrirConta(numero, tipo, nome, status, novaConta.getSaldo());
	do {
		System.out.println("2-Fechar uma conta 3-Depositar algum valor 4-sacar 5- Pagar a mensalidade ");
		resp = leia.nextInt();
		
		
		 if(resp == 3) {
			if(status == false) {
				System.out.println("Você não tem uma conta");
				
			}else {
				System.out.println("Digite quanto você deseja depositar: ");
				double deposito = leia.nextDouble();
				novaConta.setSaldo(novaConta.getSaldo() + deposito);
			}
			
		}else if(resp == 4){
			if(status == false) {
				System.out.println("Você não tem uma conta");
			}else {
				if(novaConta.getSaldo() == 0 ) {
					System.out.println("Você não possui dinheiro na conta");
					break;
				}
					System.out.println("Digte o valor do saque: ");
					double saque = leia.nextDouble();
					novaConta.setSaldo(novaConta.getSaldo() - saque);
				
			}
			
		}else if(resp == 5) {
			if(status == false) {
				System.out.println("Você não possui uma conta");
				break;
			}
			if(tipo == "cc") {
				novaConta.setSaldo(novaConta.getSaldo() -12);
			}else{
				novaConta.setSaldo(novaConta.getSaldo() -20);
			
			}
		}
		 //novaConta.setSaldo(novaConta.getSaldo());
		novaConta.status();
		
	}while(resp!= 2 || novaConta.getSaldo() != 0);
	
	
	
	
		
		
	
	
	}
}
