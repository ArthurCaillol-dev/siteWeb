package ad.example.webSite.contact;

import ad.example.webSite.conf.Adresse;
import ad.example.webSite.generic.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Entity
@Getter
@Setter
@Accessors(chain = true)
public class Contact extends BaseEntity  {

    @Column(nullable = false)
    private String nom;

    @Column(unique = true, nullable = false)
    private String numero;
    @Column(nullable = false)
    private Adresse adresse;
}
