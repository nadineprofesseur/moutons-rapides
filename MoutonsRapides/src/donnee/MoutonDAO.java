package donnee;

import java.util.ArrayList;
import java.util.List;

import modele.Mouton;

public class MoutonDAO {
	
	public static String URL_LISTE_MOUTONS = "http://localhost/service.bergerie/mouton/liste/";
	public static String URL_RAPPORTER_MOUTON = "http://localhost/bergerie.service/mouton/?mouton=";
	
	public Mouton rapporterMouton(int numero)
	{		
		
		// Récupérer le xml
		String xml = ServiceWeb.consommerService(URL_RAPPORTER_MOUTON + numero);
		
		// Interprétation du xml - construire les modeles
		if(xml != null)
		{
			/*
			Mouton mouton = new Mouton(nom,description);
			Document document = ServiceWeb.parserXML(xml);
			if(document == null) return null;
			Element element = document.getDocumentElement();
			String id = ServiceWeb.lireBalise(element, "id");
			String nom = ServiceWeb.lireBalise(element,"nom");
			String description = element.getElementsByTagName("description").item(0).getTextContent();
			
			System.out.println("Variables trouvees " + id + " " + nom + " " + description);
			
			mouton.setId(Integer.parseInt(id)); // TODO Ajouter robustesse
			return mouton;
			*/
		}		
		return null;
	}	
	
	public List<Mouton> listerMoutons()
	{
	
		String xml = ServiceWeb.consommerService(URL_LISTE_MOUTONS);
	
		// Interprétation du xml - construire les modeles
		if(xml != null)
		{
			ArrayList<Mouton> listeMoutons = new ArrayList<Mouton>();
/*			Document document = ServiceWeb.parserXML(xml);
			if(document == null) return null;		

			NodeList listeNoeudsMoutons = document.getElementsByTagName("mouton");
			for(int position = 0; position < listeNoeudsMoutons.getLength(); position++)
			{
				Element elementMouton = (Element)listeNoeudsMoutons.item(position);
				//System.out.println("Tagname=" + elementMouton.getTagName());
				String id = ServiceWeb.lireBalise(elementMouton, "id");
				String nom = ServiceWeb.lireBalise(elementMouton,"nom");
				String description = elementMouton.getElementsByTagName("description").item(0).getTextContent();
				
				Mouton mouton = new Mouton(nom,description);
				mouton.setId(Integer.parseInt(id)); // TODO : robustesse 
				listeMoutons.add(mouton);
			}*/
			return listeMoutons;
		}		
		
		return null;
	}	
	
}
