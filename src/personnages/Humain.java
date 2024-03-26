package personnages;

public class Humain {
private String nom;
private String boisonFav;
private int argent;




public static void parler(String texte){
	System.out.println(texte);
}
public  void direBonjour() {
	
	
	String message = "Bonjour ! Je m’appelle"+ nom + " et j’aime boire du " + boisonFav;
	parler(message);
			
}


public  void boire() {
	
	String message1 = ("Mmmm, un bon verre de"+boisonFav+ "! GLOUPS !");
	parler(message1);
}

public void  acheter(String bien, int prix) {
	
}

public void gagnerArgent(int gain) {
	argent = argent +gain;
	

}

public void perdreArgent(int perte) {
	argent = argent -perte;
	
	
}

public Humain(String nom, String boisonFav, int argent) {
	super();
	this.nom = nom;
	this.boisonFav = boisonFav;
	this.argent = argent;
}


}

