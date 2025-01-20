package ma.formations.jpa.service.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
@Builder
public class Adresse {
    private String rue;
    private String ville;
    private String codePostal;
}
