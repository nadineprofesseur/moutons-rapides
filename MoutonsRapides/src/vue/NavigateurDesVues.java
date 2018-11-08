package vue;

import controleur.ControleurMouton;
import javafx.application.Application;
import javafx.stage.Stage;

public class NavigateurDesVues extends Application {

	private VueMouton vueMouton = new VueMouton();
	private VueListeMouton vueListeMouton = new VueListeMouton();
	
	private Stage stade = null;
	
	@Override
	public void start(Stage stade) throws Exception {
		
		this.stade = stade;
		
		stade.setScene(null);
		stade.show();
		
		ControleurMouton controleur = ControleurMouton.getInstance();
		controleur.activerVues(this);
	}
	
	public void naviguerVersVueMouton()
	{
		stade.setScene(this.vueMouton);
		stade.show();		
	}

	public void naviguerVersVueListeMouton()
	{
		stade.setScene(this.vueListeMouton);
		stade.show();		
	}
	
	public VueMouton getVueMouton() {
		return vueMouton;
	}

	public VueListeMouton getVueListeMouton() {
		return vueListeMouton;
	}
	
}
