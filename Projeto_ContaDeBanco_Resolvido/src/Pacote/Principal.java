package Pacote;

public class Principal {
	public static void main(String[] args) {
		Conta p1 = new Conta();
		p1.setNumConta(111);
		p1.setDono("Jubileu");
		p1.abrirConta("cc");
		
		Conta p2 = new Conta();
		p2.setNumConta(2222);
		p2.setDono("Creuza");
		p2.abrirConta("CP");
		
	
		
		p1.depositar(100);
		p2.depositar(500);
		p2.sacar(1000);
		p1.estadoAtual();
		System.out.println();
		p2.estadoAtual();
}
}
