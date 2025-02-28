package ad.example.webSite.contact;

import ad.example.webSite.generic.GenericController;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("Contacts")
public class ContactController extends GenericController<ContactDto,ContactService> {
    public ContactController(ContactService service) {
        super(service);
    }

    
}
