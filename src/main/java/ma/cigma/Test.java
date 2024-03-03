package ma.cigma;

import ma.cigma.dao.DaoImpl;
import ma.cigma.dao.IDao;
import ma.cigma.service.model.Adresse;
import ma.cigma.service.model.Personne;

public class Test {
	static IDao dao = new DaoImpl();


	static void savePersonne(String nom, String prenom,String rue,String ville,String codePostal) {
		dao.save(new Personne(nom, prenom,new Adresse(rue, ville, codePostal)));
	}

	public static void main(String[] args) {
		savePersonne("nom_petrsonne_1", "prenom_personne_1","rue1","casa","12333");
		savePersonne("nom_petrsonne_2", "prenom_personne_2","rue2","rabat","123654");
	}

}
