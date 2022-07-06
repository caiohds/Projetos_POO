package Pacote;

public abstract class Pessoa {
protected String nome;
protected int idade;
protected char sexo;
protected float experiencia;

protected abstract void ganharExp();
	public Pessoa(String nome, int idade, char sexo) {
		this.setNome(nome);
		this.setExperiencia(0);
		this.setSexo(sexo);
		this.setIdade(idade);
	}
public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public int getIdade() {
	return idade;
}

public void setIdade(int idade) {
	this.idade = idade;
}

public char getSexo() {
	return sexo;
}

public void setSexo(char sexo) {
	this.sexo = sexo;
}

public float getExperiencia() {
	return experiencia;
}

public void setExperiencia(float experiencia) {
	this.experiencia = experiencia;
}





}
