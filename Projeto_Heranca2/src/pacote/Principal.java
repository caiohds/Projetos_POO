package pacote;

public class Principal {

	public static void main(String[] args) {
		
		Visitante v1 = new Visitante();
		Aluno a1 = new Aluno();
		Bolsista b1 = new Bolsista();
		Professor p1 = new Professor();
		Tecnico t1 = new Tecnico();
		
		System.out.println("----------Visitante----------");
		v1.setIdade(10);
		v1.setNome("Claudio");
		v1.setSexo('m');
		System.out.println(v1.toString());
		
		System.out.println("----------Aluno----------");
		a1.setCurso("Análise e Desenvolvimento de Sistemas");
		a1.setIdade(19);
		a1.setMatricula(1);
		a1.setNome("Wallace");
		a1.setSexo('m');
		System.out.println(a1.toString());
		a1.pagarMensalidade();
		
		System.out.println("----------Bolsista----------");
		b1.setCurso("Administração");
		b1.setBolsa(10);
		b1.setIdade(15);
		b1.setMatricula(2);
		b1.setNome("Vitor");
		b1.setSexo('m');
		System.out.println(b1.toString());
		b1.pagarMensalidade();
		
		System.out.println("----------Professor----------");
		p1.setEspecialidade("Informática");
		p1.setIdade(30);
		p1.setNome("Haroldo");
		p1.setSalario(2300.050f);
		p1.setSexo('m');
		System.out.println(p1.toString());
		p1.receberAumento(100.05f);
		
		System.out.println("----------Técnico----------");
		t1.setCurso("Informática");
		t1.setIdade(19);
		t1.setMatricula(3);
		t1.setNome("Paulo");
		t1.setSexo('M');
		t1.setRegistroProfissional(1234567899);
		System.out.println(t1.toString());
	}

}
