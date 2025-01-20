package ma.formations.jpa.service.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Personne {
    @Id
    @GeneratedValue
    private Long id;
    private String nom;
    private String prenom;
    @Embedded
    @AttributeOverride(name = "ville", column = @Column(name = "city"))
    private Adresse adresse;
}
