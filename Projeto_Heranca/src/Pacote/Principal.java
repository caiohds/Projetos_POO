package Pacote;

public class Principal{
public static void main(String[] args)  {
	Pessoa p1 = new Pessoa();
	Aluno p2 = new Aluno();
	Professor p3 = new Professor();
	Funcionario p4 = new Funcionario();
	
	p2.setNome("Caio");
	p2.setCurso("Informática");
	p2.setIdade(19);
	p2.setMatr(p2.getMatr()+1);
	p2.setSexo('M');
	System.out.println(p2.toString());
	
	System.out.println();
	p3.setEspecialidade("Português");
	p3.setIdade(53);
	p3.setNome("Cássia");
	p3.setSexo('F');
	p3.setSalario(1400);

	System.out.println(p3.toString());
	
	System.out.println();
	p4.setIdade(40);
	p4.setTrabalhando(true);
	p4.setNome("Celso");
	p4.setSetor("Administrador");
	p4.setSexo('m');
	p4.fazerAniv();
	p4.mudarTrabalho("Gerente");
	System.out.println(p4.toString());
}

}
