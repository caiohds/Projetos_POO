package Pacote;
public class Caneta {
String cor;
String modelo;
float ponta;
int carga;
boolean tampada;
void Status() {
	System.out.println("Cor da caneta " + this.cor);
	System.out.println("A caneta est� tampada? " + this.tampada);
	System.out.println("Ponta da caneta " + this.ponta);
	System.out.println("Modelo da caneta " + this.modelo);
	System.out.println("Carga da caneta " + this.carga + "%");
}
void rabiscar(){
	if(this.tampada == true){
		System.out.println("Voc� n�o pode rabiscar pois a caneta est� tampada.");
	}else {
		
		System.out.println("Estou Rabiscando");
	}
	
}
void tampar(){
	this.tampada = true;
	
}
void destampar(){
	this.tampada = false;
	
}
}
