package Celular;

public class Projeto_celular {
public static void main(String[] args) {
		Celular celular1 = new Celular();
		celular1.descricao();
		celular1.ligar();
		celular1.tirar_foto();
		System.out.println("");
		Celular celular2 = new Celular();
		celular2.bateria = 0;
		celular2.cor = "cinza";
		celular2.marca = "apple";
		celular2.modelo = "Iphone X";
		celular2.descricao();
		celular2.ligar();
		celular2.tirar_foto();
	}

}
