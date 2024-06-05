package model.repository;

import model.Library;

import java.util.List;
import java.util.Optional;

public interface GBRepository {
    List<Library> findAll();

    Library create(Library var1);

    Optional<Library> findById(Long var1, List<Library> var2);

    Optional<Library> update(Long var1, Library var2);

    boolean delete(Long var1);
}