package Aula05;

public class Aula05 {
	public static void main(String[] args) {
		ContaBanco p1 = new ContaBanco();
		p1.setNumConta(1111);
		p1.setDono("Adriel");
		p1.abrirConta("CC");
		
		ContaBanco p2 = new ContaBanco();
		p2.setNumConta(4123);
		p2.setDono("Marina");
		p2.abrirConta("CP");
		
		p1.depositar(100);
		p2.depositar(500);
		p2.sacar(100);
		
		p1.estadoAtual();
		p2.estadoAtual();
	}

		
		
}
