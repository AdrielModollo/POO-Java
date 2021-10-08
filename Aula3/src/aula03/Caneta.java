package aula03;

public class Caneta {
	
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	private boolean tampada;
	public void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Uma caneta " + this.cor);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga);
		System.out.println(" est� tampada? " + this.tampada);
	}
	
	public void rabiscar() {
		if (this.tampada == true) {
			System.out.println("Erro! N�o posso rabiscar");
		} else {
			System.out.println("Pode rabiscar");
		}
	}
	
	public void tampar() {
		/*Note que defini o atributo "tampada" como privado, e dentro do met�do "tampar" � definido seu valor, por isso � poss�vel 
		 acessar a este dados
		 
		  *Exemplo: Caso eu quiser acessar o atributo "ponta" que defini como privado � necess�rio criar uma m�todo e acessar estes dados.
		  *public void ponta(){
		  	this.ponta = 0.5f;
		  }
		  */
		
		this.tampada = true;
	}
	
	
	public void destampar() {
		this.tampada = false;
	}
	

}
