package ad.example.webSite.users;

import ad.example.webSite.generic.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;

@Mapper(nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface UserMapper extends GenericMapper<UserDto,User> {

}
