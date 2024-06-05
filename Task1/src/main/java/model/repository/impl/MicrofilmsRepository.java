package model.repository.impl;

import model.Library;
import model.repository.GBRepository;

import java.util.List;
import java.util.Optional;

public class MicrofilmsRepository implements GBRepository {

    @Override
    public List<Library> findAll() {
        return null;
    }

    @Override
    public Library create(Library var1) {
        return null;
    }

    @Override
    public Optional<Library> findById(Long var1, List<Library> var2) {
        return Optional.empty();
    }

    @Override
    public Optional<Library> update(Long var1, Library var2) {
        return Optional.empty();
    }

    @Override
    public boolean delete(Long var1) {
        return false;
    }
}
