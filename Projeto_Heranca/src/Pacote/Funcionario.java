package Pacote;

public class Funcionario extends Pessoa {
private String setor;
private boolean trabalhando;

public void mudarTrabalho(String novo_setor) {
	this.setSetor(novo_setor);
}

public String getSetor() {
	return setor;
}

public void setSetor(String setor) {
	this.setor = setor;
}

public boolean isTrabalhando() {
	return trabalhando;
}

public void setTrabalhando(boolean trabalhando) {
	this.trabalhando = trabalhando;
}
public String toString() {
	return "Setor: " + setor + "\nTrabalhando?: " + this.trabalhando + "\nNome: " + getNome() + "\nIdade: " + getIdade()
			+ "\nSexo: " + getSexo()  ;
}
}
