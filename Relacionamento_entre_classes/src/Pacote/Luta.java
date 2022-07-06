package Pacote;
import java.util.Random;
public class Luta {
private Lutador desafiado;
private Lutador desafiante;
private int rounds;
private int vencedor;
private boolean aprovado;
Random random = new Random();
public void setDesafiado(Lutador dd) {
	desafiado = dd;
}
public Lutador getDesafiado() {
	return desafiado;
}
public void setDesafiante(Lutador dd) {
	desafiante = dd;
}
public Lutador getDesafiante() {
	return desafiante;
}

public int getRounds() {
	return rounds;
}
public void setRounds(int rounds) {
	this.rounds = rounds;
}
public boolean isAprovado() {
	return aprovado;
}
public void setAprovado(boolean aprovado) {
	this.aprovado = aprovado;
}
public void marcarLuta(Lutador l1, Lutador l2) {
	if((l1.getCategoria()== l2.getCategoria()) && (l1.getNome() != l2.getNome())) {
		this.setAprovado(true); 
		this.setDesafiado(l1);
		this.setDesafiante(l2);
		
	}else {
		System.out.println(" Não foi possível marcar a luta!");
		this.setAprovado(false);
		this.setDesafiado(null);
		this.setDesafiado(null);
	}
}
public void lutar() {
	if(this.isAprovado()) {
		System.out.println("Desafiado: ");
		desafiado.aprensentar();
		System.out.println("Desafiante: ");
		desafiante.aprensentar();
		 vencedor = random.nextInt(3);
		if(vencedor == 0 ) {
			System.out.println("Empate!!!");
			desafiado.setEmpates(desafiado.getEmpates()+1);
			desafiante.setEmpates(desafiante.getEmpates()+1);
		}else if(vencedor == 1) {
			System.out.println("O lutador " + desafiado.getNome() + " é o vencedor !!!");
			desafiado.setVitorias(desafiado.getVitorias()+1);
			desafiante.setDerrotas(desafiante.getDerrotas()+1);
		}else if(vencedor == 2){
			System.out.println("O lutador " + desafiante.getNome() + " é o vencedor !!!");
			desafiado.setDerrotas(desafiado.getDerrotas()+1);
			desafiante.setVitorias(desafiante.getVitorias()+1);
		}
		
	}
}
}
