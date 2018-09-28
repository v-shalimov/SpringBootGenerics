package ua.org.vshalimov.springboot.generics.controller.common;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.org.vshalimov.springboot.generics.domain.common.AbstractEntity;

import java.util.List;

public interface CommonController<E extends AbstractEntity> {

    @PostMapping
    ResponseEntity<E> save(@RequestBody E entity);

    @PostMapping("/all")
    ResponseEntity<List<E>> saveAll(@RequestBody List<E> entities);

    @PutMapping
    ResponseEntity<E> update(@RequestBody E entity);

    @GetMapping("/{id}")
    ResponseEntity<E> get(@PathVariable Long id);

    @GetMapping
    ResponseEntity<List<E>> getAll();

    @DeleteMapping("/{id}")
    Boolean delete(@PathVariable Long id);

    @DeleteMapping
    Boolean deleteAll();

}
