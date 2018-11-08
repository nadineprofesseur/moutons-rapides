package vue;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import modele.Mouton;

public class VueListeMouton extends Scene {

	protected GridPane grilleMoutons = null;
	
	public VueListeMouton() {
		super(new GridPane(), 400, 400);
		grilleMoutons = (GridPane) this.getRoot();
	}
	
	public void afficherListeMouton(List<Mouton> listeMoutons)
	{
		//grilleMoutons.getChildren().clear();
		
		grilleMoutons.add(new Label("Nom"), 0, 0);
		grilleMoutons.add(new Label("Naissance"), 1, 0);
		
		int numero = 1;
		for(Mouton mouton : listeMoutons)
		{
			Button actionVoirMouton = new Button("Voir");
			actionVoirMouton.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent a) {
					//controleur.notifierNaviguerVoirMouton(mouton.getId()); // TODO ameliorer ceci pour respecter architecture cible = pas de parametre dans les notifications au controleur
				}});
			grilleMoutons.add(new Label(mouton.getNom()), 0, numero);
			grilleMoutons.add(new Label(mouton.getNaissance()), 1, numero);
			grilleMoutons.add(actionVoirMouton, 2, numero);
			numero++;
		}
	}
	
	

}
