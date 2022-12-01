package JeuDeLOie;

import java.util.ArrayList;

public class JeuOie {

	private ArrayList<Oie> oies = new ArrayList<>(); 
	private int nbOie = 0;
	private Plateau plateau = new Plateau();
	private De de = new De();

	public JeuOie(int nbOieMax) {   
		oies = new Oie[nbOieMax];
	}

	public void ajouterOie(String couleur) { 
		oies.add(new Oie(couleur, plateau, des));
		nbOie++;

	}

	public void jouer() {
		// TODO ...
	}

	
}
