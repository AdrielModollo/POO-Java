package aula07;

public class UltraEmojiCombat {
	public static void main(String[] args) {
		 Lutador l [] = new Lutador [6];
		 
		 l[0] = new Lutador("Adriel", "Brasil", 25, 1.71f, 72.0f, 11, 0, 0);
		 l[1] = new Lutador("Java", "Green Project", 30, 4.0f, 800.0f, 999999, 0, 0);
		 
		 
		 l[0].apresentar();
		 l[0].status();
		 
		 l[1].apresentar();
		 l[1].status();
	}
}
