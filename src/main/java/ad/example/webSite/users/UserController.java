package ad.example.webSite.users;

import ad.example.webSite.generic.GenericController;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class UserController extends GenericController<UserDto,UserService> {
    public UserController(UserService service) {
        super(service);
    }
}
