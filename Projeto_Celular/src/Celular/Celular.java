package Celular;

public class Celular {
String cor = "preto";
String modelo = "lg k10";
String marca = "lg";
int bateria = 50;
boolean camera = true;

void ligar() {
	if(bateria>0) {
		System.out.println("Iniciando o celular");
		
	}else {
		System.out.println("O celular est� sem bateria");
	}
}
void descricao() {
	System.out.println("Cor do celular: " + this.cor);
	System.out.println("Marca do celular: " + this.marca);
	System.out.println("Modelo do celular: " + this.modelo);
}
void tirar_foto(){
	if(bateria == 0) {
		System.out.println("O celular est� descarregado");
	}else {
	if(camera == false) {
		System.out.println("Ligue a c�mera para tirar uma foto.");	
	}else {
		System.out.println("Voc� tirou uma foto.");
	}
	}
	
}

}
