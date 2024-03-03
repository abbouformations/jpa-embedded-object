package ma.cigma.service.model;

import java.io.Serializable;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Personne implements Serializable {
	@Id
	@GeneratedValue
	private Long id;
	private String nom;
	private String prenom;
	@Embedded
	private Adresse adresse;

	public Personne(String nom, String prenom,Adresse adresse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse=adresse;
	}
}
