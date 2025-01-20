package ma.formations.jpa;

import ma.formations.jpa.dao.DaoImpl;
import ma.formations.jpa.dao.IDao;
import ma.formations.jpa.service.model.Adresse;
import ma.formations.jpa.service.model.Personne;

public class Test {
    public static void main(String[] args) {
        IDao dao = new DaoImpl();
        dao.save(Personne.builder().
                nom("Alami").
                prenom("Mohamed").
                adresse(Adresse.builder().rue("Al farah").ville("Rabat").codePostal("10000").build()).
                build());

        dao.save(Personne.builder().
                nom("Ahmadi").
                prenom("Samir").
                adresse(Adresse.builder().rue("Tetouan").ville("Casa").codePostal("130000").build()).
                build());
    }
}
