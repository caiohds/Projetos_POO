package Pacote;

public class Principal {

	public static void main(String[] args) {
		Gafanhoto g = new Gafanhoto("Caio",10,'m',"Caiohds");
		Video v = new Video("Exemplo");
		
		Visualizacao vis = new Visualizacao(g,v);
		
		
		
		
		
		g.viuMainUm();
		System.out.println(g.toString());
		System.out.println();
		
		System.out.println();
		System.out.println(v.toString());
		v.like();
		
		v.play();
		
		vis.avaliar(10);
		vis.avaliar(50.0f);
		System.out.println(v.reproduzindoEstado());	
		System.out.println("-------Visualização----------");
		System.out.println(vis.toString());
		System.out.println("--------Vídeo-------");
		System.out.println(v.toString());
		}

}
