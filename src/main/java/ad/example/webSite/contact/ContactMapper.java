package ad.example.webSite.contact;

import ad.example.webSite.generic.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;

@Mapper(nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface ContactMapper extends GenericMapper<ContactDto,Contact> {

}
