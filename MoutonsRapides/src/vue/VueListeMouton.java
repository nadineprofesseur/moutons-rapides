package vue;
import java.util.List;

import javafx.scene.Scene;
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
		
		int position = 1;
		for(Mouton mouton : listeMoutons)
		{
			grilleMoutons.add(new Label(mouton.getNom()), 0, position);
			grilleMoutons.add(new Label(mouton.getNaissance()), 1, position);
			position++;
		}
	}
	
	

}
