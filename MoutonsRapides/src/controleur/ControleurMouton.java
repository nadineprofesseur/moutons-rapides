package controleur;

import java.util.ArrayList;
import java.util.List;

import modele.Mouton;
import vue.NavigateurDesVues;
import vue.VueListeMouton;
import vue.VueMouton;

public class ControleurMouton {
	
	private VueMouton vueMouton = null;
	private VueListeMouton vueListeMouton = null;
		
	private NavigateurDesVues navigateur = null;
	private ControleurMouton()
	{
		
	}
	
	private static ControleurMouton instance = null; // null est important
	public static ControleurMouton getInstance()
	{
		if(null == instance)
		{
			instance = new ControleurMouton();
		}
		return instance;
	}
	
	
	public void activerVues(NavigateurDesVues navigateur)
	{
		this.navigateur = navigateur;
		this.vueMouton = this.navigateur.getVueMouton();
		this.vueListeMouton = this.navigateur.getVueListeMouton();
		
		//// TEST ////
		Mouton mouton = new Mouton("Dolly", "Grise", "20 kg", "5 juin 2015");
		this.vueMouton.afficherMouton(mouton); // Appel de ma fonction avant de la programmer (pour tester à mesure)
		
		/// TEST ///
		List<Mouton> listeMoutonsTest = new ArrayList<Mouton>();
		listeMoutonsTest.add(new Mouton("Dolly", "Grise", "20 kg", "5 juin 2015"));
		listeMoutonsTest.add(new Mouton("Molly", "Rousse", "20 kg", "5 mai 2016"));
		listeMoutonsTest.add(new Mouton("Arthurus", "Noire", "20 kg", "5 mars 2017"));
		listeMoutonsTest.add(new Mouton("Cheese", "Jaune", "20 kg", "5 septembre 2015"));
		this.vueListeMouton.afficherListeMouton(listeMoutonsTest);
		
		/// TEST navigation /// 
		//this.navigateur.naviguerVersVueMouton();
		this.navigateur.naviguerVersVueListeMouton();
	}

}
