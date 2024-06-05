package model.dao.impl;

import model.dao.Operation;

import java.util.List;

public class FileOperation implements Operation {
    public String fileName;
    public FileOperation(String fileName){
        this.fileName = fileName;

    }
    @Override
    public List<String> readAll() {
        return null;
    }

    @Override
    public void saveAll(List<String> var1) {

    }
}
