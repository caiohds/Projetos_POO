package Pacote;

public class Visualizacao{
private Gafanhoto espectador;
private Video video;

	
	public Visualizacao(Gafanhoto espectador, Video video) {
	
	this.espectador = espectador;
	this.video = video;
	this.espectador.viuMainUm();
	this.video.setViews(this.video.getViews()+1);
	}
	
	public void avaliar() {
		this.video.setAvaliacao(5);
	}
	
	public void avaliar(int nota) {
		this.video.setAvaliacao(nota);
	}
	public void avaliar(float porc) {
		int nota;
		if(porc <20) {
			nota = 3;
		}else if(porc <=50) {
			nota = 5;
		}else if(porc <=90) {
			nota = 8;
		}else {
			nota = 10;
		}
		this.video.setAvaliacao(nota);
	}

	public Gafanhoto getEspectador() {
		return espectador;
	}

	public void setEspectador(Gafanhoto espectador) {
		this.espectador = espectador;
	}

	public Video getVideo() {
		return video;
	}

	public void setVideo(Video video) {
		this.video = video;
	}

	@Override
	public String toString() {
		return "Visualizacao [espectador=" + espectador + ", video=" + video + "]";
	}
	
}
