package Pacote;

public class Principal {
public static void main(String[] args) {
	ControleRemoto c = new ControleRemoto();
	c.ligar();
	c.play();
	
	c.abrirMenu();
}
}