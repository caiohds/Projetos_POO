package Pacote;

public class Gafanhoto extends Pessoa{
private String login;
private int totAssistido;

	

public Gafanhoto(String nome, int idade, char sexo,String login) {
	super(nome, idade, sexo);
	this.setLogin(login);
	this.setTotAssistido(0);
}

public void viuMainUm() {
	this.totAssistido++;
}

@Override
protected void ganharExp() {
	System.out.println("Ganhando experiência!");
	
}

public String getLogin() {
	return login;
}

public void setLogin(String login) {
	this.login = login;
}

public int getTotAssistido() {
	return totAssistido;
}

public void setTotAssistido(int totAssistido) {
	this.totAssistido = totAssistido;
}

public String toString() {
	return "Nome: " + nome + "\nIdade: " + idade + "\nSexo: " + sexo + "\nExperiencia: " + experiencia + "\nTotal Assistido: "+ this.totAssistido + "\nLogin: "+ this.login;
}

}
