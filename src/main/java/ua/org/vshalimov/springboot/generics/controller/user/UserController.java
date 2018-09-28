package ua.org.vshalimov.springboot.generics.controller.user;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.org.vshalimov.springboot.generics.controller.common.AbstractController;
import ua.org.vshalimov.springboot.generics.domain.user.User;
import ua.org.vshalimov.springboot.generics.service.user.UserService;

@RestController
@RequestMapping("/users")
public class UserController extends AbstractController<User, UserService> {

    public UserController(UserService service) {
        super(service);
    }

}
