package ad.example.webSite.users;

import ad.example.webSite.generic.BaseDto;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class UserDto extends BaseDto {
    private String pseudo;
    private String email;
    private String password;
    private Role role;
}
