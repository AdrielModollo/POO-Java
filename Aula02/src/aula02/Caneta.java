package aula02;

public class Caneta {
	
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;
	void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Uma caneta " + this.cor);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga);
		System.out.println(" est? tampada? " + this.tampada);
	}
	
	void rabiscar() {
		if (this.tampada == true) {
			System.out.println("Erro! N?o posso rabiscar");
		} else {
			System.out.println("Pode rabiscar");
		}
	}
	
	void tampar() {
		this.tampada = true;
	}
	
	void destampar() {
		this.tampada = false;
	}
	

}
