package com.Solera.APIRest.APIwithTDD.Contracts;

import com.Solera.APIRest.APIwithTDD.Models.PartsClass;

import java.util.List;

public interface IServiceParts {
    List<PartsClass> getAllParts();
    PartsClass getPartById(int id);
    PartsClass createPart(PartsClass part);
    boolean deletePart(int id);
}

