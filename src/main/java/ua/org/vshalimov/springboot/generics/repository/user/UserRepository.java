package ua.org.vshalimov.springboot.generics.repository.user;

import org.springframework.stereotype.Repository;
import ua.org.vshalimov.springboot.generics.domain.user.User;
import ua.org.vshalimov.springboot.generics.repository.common.CommonRepository;

@Repository
public interface UserRepository extends CommonRepository<User> {
}
