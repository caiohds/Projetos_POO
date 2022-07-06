package pacote;

public class Tecnico extends Aluno{
private int registroProfissional;
public void praticar() {
	System.out.println("O aluno "+ this.getNome() + "está praticando!");
}
public int getRegistroProfissional() {
	return registroProfissional;
}
public void setRegistroProfissional(int registroProfissional) {
	this.registroProfissional = registroProfissional;
}
@Override
public String toString() {
	return "Nome: " + this.getNome() + "\nIdade: " + this.getIdade() + "\nSexo: " + this.getSexo() + "\nCurso: " + this.getCurso() + "\nRegistro Profissional: " + this.getRegistroProfissional();
}
}
