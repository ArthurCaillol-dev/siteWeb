package ad.example.webSite.contact;

import ad.example.webSite.generic.BaseDto;
import lombok.Data;
import lombok.experimental.Accessors;

import ad.example.webSite.conf.Adresse;


@Data
@Accessors(chain = true)
public class ContactDto extends BaseDto {
    private String nom;
    private String numero;
    private Adresse adresse;
}
