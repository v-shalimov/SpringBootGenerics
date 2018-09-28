package ua.org.vshalimov.springboot.generics.domain.user;

import lombok.Getter;
import lombok.Setter;
import ua.org.vshalimov.springboot.generics.domain.common.AbstractEntity;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class User extends AbstractEntity {

    private String name;
    private String phone;

}
