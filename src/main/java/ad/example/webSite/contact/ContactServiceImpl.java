package ad.example.webSite.contact;

import ad.example.webSite.generic.GenericServiceImpl;
import lombok.ToString;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
@ToString
public class ContactServiceImpl
        extends GenericServiceImpl<
        Contact,
        ContactDto,
        ContactRepository,
        ContactMapper
        >
        implements ContactService, UserDetailsService {
    public ContactServiceImpl(ContactRepository repository, ContactMapper mapper) {
        super(repository, mapper);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'loadUserByUsername'");
    }
}
