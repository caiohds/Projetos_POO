package Pacote;

public class Principal {

	public static void main(String[] args) {
		Mamifero m = new Mamifero();
		Ave a = new Ave();
		Peixe p = new Peixe();
		Reptil r = new Reptil();
		Canguru c = new Canguru();
		m.setCorPelo("Azul");
		m.setIdade(2);
		m.setMembros(4);
		m.setPeso(10.75f);
		m.alimentar();
		m.emitirSom();
		m.locomover();
		
		System.out.println(m.toString());
	}

}
