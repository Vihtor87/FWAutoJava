package util.mapper;

import model.Library;

public interface Mapper {
    String toInput(Library var1);

    Library toOutput(String var1);
}