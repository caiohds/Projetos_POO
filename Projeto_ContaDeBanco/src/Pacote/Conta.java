package Pacote;

public class Conta {
public int numConta;
protected String tipo;
private String dono;
private boolean status;
private double saldo;


public Conta() {
	//sempre que uma nova conta for criada, o status recebe falso e o saldo é definido como 0
	this.status = false;
	this.saldo = 0;
}
public int getNumConta() {
	return numConta;
}
public void setNumConta(int numConta) {
	this.numConta = numConta;
}
public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}
public String getDono() {
	return dono;
}
public void setDono(String dono) {
	this.dono = dono;
}
public boolean isStatus() {
	return status;
}
public void setStatus(boolean status) {
	this.status = status;
}
public double getSaldo() {
	return saldo;
}
public void setSaldo(double saldo) {
	this.saldo = saldo;
}
public void abrirConta(int numConta, String tipo, String dono, boolean status, double saldo){
//Quando abrir a conta, o status fica verdadeiro. Dizer o tipo de conta. Se for conta corrente ele ganha 50 reais na conta, se for conta poupança ele ganha 150 reais.	
	this.setNumConta(numConta);
	this.setDono(dono);
	this.setTipo(tipo);
	this.setStatus(status);
	this.setSaldo(saldo);
}
public void fecharConta(){
//Não pode ter dinheiro na conta e não pode dever.	
}
public void depositar(){
// O status tem que ser true.	
}
public void sacar(){
	// O status tem que ser true e eu tenho que ter saldo na conta.	
}
public void pagarMensal(){
//Quando o pagarMensal for ativado, o cliente com conta corrente paga 12 reais, o cliente com conta poupança paga 20 reais.	
}
public void status() {
	System.out.println("Numero da conta:" + this.getNumConta());
	System.out.println("Tipo de conta:" + this.getTipo());
	System.out.println("Nome:" + this.getDono());
	System.out.println("Saldo:" + this.getSaldo());
}
}
