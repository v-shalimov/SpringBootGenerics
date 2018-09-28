package ua.org.vshalimov.springboot.generics.controller.common;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import ua.org.vshalimov.springboot.generics.base.ErrorType;
import ua.org.vshalimov.springboot.generics.domain.common.AbstractEntity;
import ua.org.vshalimov.springboot.generics.exception.SampleException;
import ua.org.vshalimov.springboot.generics.service.common.CommonService;

import java.util.List;

public abstract class AbstractController<E extends AbstractEntity, S extends CommonService<E>> implements CommonController<E> {

    private final S service;

    protected AbstractController(S service) {
        this.service = service;
    }

    @Override
    public ResponseEntity<E> save(@RequestBody E entity) {

        return service.save(entity)
                .map(ResponseEntity::ok)
                .orElseThrow(() -> new SampleException(
                        String.format(ErrorType.ENTITY_NOT_SAVED.getDescription(), entity.toString())
                ));
    }

    @Override
    public ResponseEntity<List<E>> saveAll(@RequestBody List<E> entities) {
        return ResponseEntity.ok(service.saveAll(entities));
    }

    @Override
    public ResponseEntity<E> update(@RequestBody E entity) {
        return service.update(entity)
                .map(ResponseEntity::ok)
                .orElseThrow(() -> new SampleException(
                        String.format(ErrorType.ENTITY_NOT_UPDATED.getDescription(), entity.toString())
                ));
    }

    @Override
    public ResponseEntity<E> get(@PathVariable Long id) {
        return service.get(id).map(ResponseEntity::ok)
                .orElseThrow(() -> new SampleException(
                        String.format(ErrorType.ENTITY_NOT_FOUND.getDescription(), id)
                ));
    }

    @Override
    public ResponseEntity<List<E>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @Override
    public Boolean delete(@PathVariable Long id) {
        return service.deleteById(id);
    }

    @Override
    public Boolean deleteAll() {
        return service.deleteAll();
    }
}
