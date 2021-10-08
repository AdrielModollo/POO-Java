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
		System.out.println(" está tampada? " + this.tampada);
	}
	
	public void rabiscar() {
		if (this.tampada == true) {
			System.out.println("Erro! Não posso rabiscar");
		} else {
			System.out.println("Pode rabiscar");
		}
	}
	
	public void tampar() {
		/*Note que defini o atributo "tampada" como privado, e dentro do metódo "tampar" é definido seu valor, por isso é possível 
		 acessar a este dados
		 
		  *Exemplo: Caso eu quiser acessar o atributo "ponta" que defini como privado é necessário criar uma método e acessar estes dados.
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
