package Pacote;

public class Video implements AcoesVideo{
	private String titulo;
	private int avaliacao;
	private int views;
	private int curtidas;
	private boolean reproduzindo;
	private int totAvalicao = 0;
	
	
	public Video(String titulo) {
		this.setTitulo(titulo);
		
		this.setCurtidas(0);
		this.setReproduzindo(false);
		this.setViews(0);
	}

	@Override
	public void play() {
		if(this.isReproduzindo()) {
			this.setReproduzindo(false);
		}else {
			this.setReproduzindo(true);
		}
		
	}

	@Override
	public void pause() {
		this.setReproduzindo(false);
		
	}

	@Override
	public void like() {
		
		this.setCurtidas(this.getCurtidas()+1);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(int avaliacao) {
		int nova;
		this.totAvalicao++;
		nova = ((this.avaliacao + avaliacao)/this.totAvalicao);
		this.avaliacao = nova;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public int getCurtidas() {
		return curtidas;
	}

	public void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}

	public boolean isReproduzindo() {
		return reproduzindo;
	}

	public void setReproduzindo(boolean reproduzindo) {
		this.reproduzindo = reproduzindo;
	}
	

	
	@Override
	public String toString() {
		return "Video [titulo=" + titulo + ", avaliacao=" + avaliacao + ", views=" + views + ", curtidas=" + curtidas
				+ ", reproduzindo=" + this.reproduzindoEstado() + "]";
	}

	public String reproduzindoEstado() {
		if(this.isReproduzindo() == true) {
			return "Está reproduzindo";
		}else {
			return "Não está reproduzindo";
		}
	}
}
