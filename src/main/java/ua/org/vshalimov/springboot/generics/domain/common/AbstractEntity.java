package ua.org.vshalimov.springboot.generics.domain.common;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@MappedSuperclass
@Getter
@Setter
public abstract class AbstractEntity implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

}
