package aula06;

public class ControleRemoto {
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	//M�todo Especiais
	public ControleRemoto() {
		this.volume = 50;
		this.ligado = false;
		this.tocando = false;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public boolean getTocando() {
		return tocando;
	}

	public void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
	
	
}
