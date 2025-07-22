package com.Solera.APIRest.APIwithTDD.Service;

import com.Solera.APIRest.APIwithTDD.Contracts.IServiceParts;
import com.Solera.APIRest.APIwithTDD.Models.PartsClass;
import com.Solera.APIRest.APIwithTDD.Repository.PartsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartsService implements IServiceParts {
    private final PartsRepository partsRepository;
    public PartsService (PartsRepository partsRepository) {this.partsRepository = partsRepository;}


    @Override
    public List<PartsClass> getAllParts() {
        List<PartsClass> parts = (List<PartsClass>) partsRepository.findAll();
        return parts;
    }

    @Override
    public PartsClass getPartById(int id) {
        if(partsRepository.findById((long) id).isPresent()) {
            return partsRepository.findById((long) id).get();
        }
        return null;
    }

    @Override
    public PartsClass createPart(PartsClass part) {
        return partsRepository.save(part);
    }

    @Override
    public boolean deletePart(int id) {
        try {
            partsRepository.deleteById((long) id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
