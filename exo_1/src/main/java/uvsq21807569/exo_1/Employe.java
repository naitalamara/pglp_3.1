package uvsq21807569.exo_1;

public class Employe {
	private  String nom ;
	private String adresse;
	protected int nbreheure ;     //nbre d heure travailler par mois ;
	protected float prixheure ;
	
	
	
	public Employe(String nom, String adresse, int nbreheure, float prixheure) {
		super();
		this.nom = nom;
		this.adresse = adresse;
		this.nbreheure = nbreheure;
		this.prixheure = prixheure;
	}



	public void affichage() {
		System.out.println( "le nom est "+"et adresse "+adresse );
	}
	


}
