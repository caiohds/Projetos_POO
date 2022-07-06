package Pacote;

public class Livro implements Publicacao {

private String titulo;
private String autor;
private int totPaginas;
private int pagAtual;
private boolean aberto;
private Pessoa leitor;
private String aberto2;


public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {

	this.titulo = titulo;
	this.autor = autor;
	this.totPaginas = totPaginas;
	this.pagAtual = 0;
	this.aberto = false;
	this.leitor = leitor;
	this.aberto2 = "Não";
}



public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public String getAutor() {
	return autor;
}
public void setAutor(String autor) {
	this.autor = autor;
}
public int getTotPaginas() {
	return totPaginas;
}
public void setTotPaginas(int totPaginas) {
	this.totPaginas = totPaginas;
}

public Pessoa getLeitor() {
	return leitor;
}
public void setLeitor(Pessoa leitor) {
	this.leitor = leitor;
	
}

	

	
	public String detalhes() {
		return "Titulo do livro: " + titulo + "\nautor: " + autor + "\ntotPaginas: " + totPaginas + "\npagAtual: " + pagAtual
				+ "\naberto: " + aberto2 + "\nNome do Leitor:" + leitor.getNome() + "\nIdade do leitor:" + leitor.getIdade() + "\nSexo do leitor:" + leitor.getSexo()  ;
		
	}
	public void abrir() {
	this.aberto = true;
	this.aberto2 = "sim";
	}

	
	public void fechar() {
	this.aberto = false;
	this.aberto2 = "Não";	
	}


	public void folhear(int p) {
		this.pagAtual = p;
		
	}


	public void avancarPagina() {
		this.pagAtual++;
		
	}
	
	public void voltarPagina() {
		this.pagAtual--;
		
	}

	
}
