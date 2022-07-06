package Pacote;

public class Professor extends Pessoa{
private String especialidade;
private float salario;
public void receberAum(float aumento) {
	this.setSalario(this.getSalario()+aumento);
}
public String getEspecialidade() {
	return especialidade;
}
public void setEspecialidade(String especialidade) {
	this.especialidade = especialidade;
}
public float getSalario() {
	return salario;
}
public void setSalario(float salario) {
	this.salario = salario;
}
public String toString() {
	return "Especialidade: " + this.especialidade + "\nSalário: " + this.salario + "\nNome: " + getNome() + "\nIdade: " + getIdade()
			+ "\nSexo: " + getSexo()  ;
}
}
