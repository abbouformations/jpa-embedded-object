package ma.formations.jpa.dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * La classe SessionBuilder implémente le Design Patter : Singleton.
 * ==> On a une seule instance de EntityManagerFactory.
 */

/**
 * Pour effecturer une opération JPA, il faut suivre les 7 étapes sivantes :
 * ETAP 1 : Créer une Session Factory.
 * ETAPE 2 : Utiliser la Sesson Factory crée dans l'étape 1 pour ouvrir une session.
 * ETAPE 3 : Ouvrir une transaction.
 * ETAPE 4 : Lancer la requête.
 * ETAPE 5 : Valider la transaction.
 * ETAPE 6 : Fermer la session.
 * ETAPE 7 : Fermer la session Factory.
 * <p>
 * Les étapes 6 et 7 sont obligatoires uniquement dans un environnement Java SE.
 * dans un environnement Java EE, c'est le serveur d'application qui s'en occupe.
 */

public class SessionBuilder {
    private static EntityManagerFactory sessionfactory;

    private SessionBuilder() {

    }

    public static EntityManagerFactory getSessionfactory() {
        if (sessionfactory == null) {
            sessionfactory = Persistence.createEntityManagerFactory("UNITE1");
        }
        return sessionfactory;
    }

}
