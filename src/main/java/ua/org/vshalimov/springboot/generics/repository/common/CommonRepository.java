package ua.org.vshalimov.springboot.generics.repository.common;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import ua.org.vshalimov.springboot.generics.domain.common.AbstractEntity;

@NoRepositoryBean
public interface CommonRepository<E extends AbstractEntity> extends CrudRepository<E, Long> {
}
