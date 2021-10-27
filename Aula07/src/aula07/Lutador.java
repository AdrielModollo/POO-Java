package aula07;

public class Lutador {
	//Atributos
	private String nome;
	private String nacionalidade;
	private int idade;
	private float peso;
	private String categoria;
	private int vitorias, derrotas, empates; 
	
	//Métodos públicos
	
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

	//Métodos especiais
	public Lutador(String nome, String nacionalidade, int idade, float peso, int vitorias, int derrotas, int empates) {
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.peso = peso;
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}
	
	
}
