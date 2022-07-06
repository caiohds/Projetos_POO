package Pacote;

public class Principal {
public static void main(String[] args) {
	Pessoa[] p = new Pessoa[2];
	Livro l[] = new Livro[2];
	
	p[0] = new Pessoa("Caio",19,"M");
	p[1] = new Pessoa("Claudia",23,"F");
	
	l[0] = new Livro("A Cabana","William P. Young",100, p[0]);
	l[1] = new Livro("Ultimate Spider-Man","Stan Lee",130, p[1]);
	
	
	
	System.out.println(l[0].detalhes());
}
}
