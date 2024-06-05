package model.dao;

import java.util.List;

public interface Operation {
    List<String> readAll();

    void saveAll(List<String> var1);
}