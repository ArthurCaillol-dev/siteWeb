package ad.example.webSite.auth;

import ad.example.webSite.users.User;
import ad.example.webSite.users.UserMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(/*uses = {UserMapper.class}*/)
public interface AuthMapper {

    @Mapping(source = ".", target = "user")
    @Mapping(target = "token", expression = "java(ad.example.webSite.tools.JwtUtils.generateToken(user))")
    AuthResponse toResponse(User user);

    User toUser(RegisterDto dto);
}
