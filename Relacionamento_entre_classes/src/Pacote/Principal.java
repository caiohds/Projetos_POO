package Pacote;

public class Principal {
public static void main(String[] args) {
	Lutador l[] = new Lutador[4];
	
	l[0] = new Lutador("Pretty Boy","Fran�a",31,1.75f,68.9f,11,3,1);
	l[1] = new Lutador("Putscript","Brasil",29,1.68f,57.8f,14,2,3);
    l[2] = new Lutador("Snapshadow","EUA",35,1.65f,80.9f,12,2,1);
	l[3] = new Lutador("Dead Code","Austr�lia",28,1.93f,81.6f,13,0,2);
	
	//l[0].ganharLuta();
	//l[0].aprensentar();
	Luta luta = new Luta();
	luta.marcarLuta(l[0], l[1]);
	luta.lutar();
	
}
}
