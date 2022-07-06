package Pacote;
public class Caneta {
public String cor;
public String modelo;
private float ponta;
protected int carga;
protected boolean tampada;
public void Status() {
	System.out.println("Cor da caneta: " + this.cor);
	System.out.println("A caneta está tampada? " + this.tampada);
	System.out.println("Ponta da caneta: " + this.ponta);
	System.out.println("Modelo da caneta: " + this.modelo);
	System.out.println("Carga da caneta: " + this.carga + "%");
}
public void rabiscar(){
	if(this.tampada == true){
		System.out.println("Você não pode rabiscar pois a caneta está tampada.");
	}else {
		
		System.out.println("Estou Rabiscando");
	}
	
}
protected void tampar(){
	this.tampada = true;
	
}
protected void destampar(){
	this.tampada = false;
	
}
}
