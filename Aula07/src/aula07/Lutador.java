package aula07;

public class Lutador {
	//Atributos
	private String nome;
	private String nacionalidade;
	private int idade;
	private float peso;
	private String categoria;
	private int vitorias, derrotas, empates; 
	
	//M�todos p�blicos
	
	public void apresentar() {
		
	}
	
	public void status() {
		
	}
	
	public void ganharLuta() {
		
	}
	
	public void perderLuta() {
		
	}
	
	public void empatarLuta() {
		
	}

	//M�todos especiais
	public Lutador(String nome, String nacionalidade, int idade, float peso, int vitorias, int derrotas, int empates) {
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.peso = peso;
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}

	//M�todo interno
	public String getCategoria() {
		return categoria;
	}


	private void setCategoria() {
		if (this.peso < 52.2) {
			this.categoria = "Inv�lido";
		} else if (this.peso <= 70.3) {
			this.categoria = "Leve";
		} else if (this.peso <= 83.9) {
			this.categoria = "M�dio";
		} else if (this.peso <= 120.2) {
			this.categoria = "Pesado";
		} else {
			this.categoria = "Inv�lido";
		}
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}
	
	
	
	
}
