package Pacote;

public class ControleRemoto implements Controlador{
private int volume;
private boolean ligado;
private boolean tocando;
public ControleRemoto() {
	
	this.volume = 50;
	this.ligado = false;
	this.tocando = false;
}
public void ligar(){
	this.setLigado(true);
}
public void desligar(){
	this.setLigado(false);
}
public void abrirMenu(){
	System.out.println("MENU: ");
	System.out.println("Está ligado? " +this.getLigado());
	System.out.println("Está tocando? " +this.getTocando());
	System.out.println("Volume: " +this.getVolume());
	for(int i = 0;i<=this.getVolume();i+=10) {
		System.out.print("|");
	}
	System.out.println();
}
public void fecharMenu() {
	System.out.println("Fechando menu...");
}
public void maisVolume() {
	if(this.getLigado() == true) {
		this.setVolume(this.getVolume()+1);
	}
}
public void menosVolume() {
	if(this.getLigado() == true) {
		this.setVolume(this.getVolume()-1);
	}
}
public void ligarMudo() {
	if(this.getLigado() == true && this.getVolume() >0) {
		this.setVolume(0);
	}
}
public void desligarMudo() {
	if(this.getLigado() == true && this.getVolume() ==0) {
		this.setVolume(50);
	}
}
public void play() {
	if(this.getLigado() == true && this.getTocando() == false) {
		this.setTocando(true);
	}
}
public void pause() {
	if(this.getLigado() == true && this.getTocando() == true) {
		this.setTocando(false);
	}
}
public int getVolume(){
	return volume;
}
public boolean getLigado(){
	return ligado;
}
public boolean getTocando(){
	return tocando;
}
public void setVolume(int v) {
	volume = v;
}
public void setLigado(boolean l) {
	ligado = l;
}
public void setTocando(boolean t) {
	tocando = t;
}

}
