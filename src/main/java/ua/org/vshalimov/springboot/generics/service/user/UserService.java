package ua.org.vshalimov.springboot.generics.service.user;

import org.springframework.stereotype.Service;
import ua.org.vshalimov.springboot.generics.domain.user.User;
import ua.org.vshalimov.springboot.generics.repository.user.UserRepository;
import ua.org.vshalimov.springboot.generics.service.common.AbstractService;

@Service
public class UserService extends AbstractService<User, UserRepository> {

    public UserService(UserRepository repository) {
        super(repository);
    }

}
