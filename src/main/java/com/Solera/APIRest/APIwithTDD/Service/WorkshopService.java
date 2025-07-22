package com.Solera.APIRest.APIwithTDD.Service;

import com.Solera.APIRest.APIwithTDD.Contracts.IServiceWorkshop;
import com.Solera.APIRest.APIwithTDD.Models.WorkshopClass;
import com.Solera.APIRest.APIwithTDD.Repository.WorkshopRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkshopService implements IServiceWorkshop {
    private final WorkshopRepository workshopRepository;
    public WorkshopService (WorkshopRepository workshopRepository) {this.workshopRepository = workshopRepository;}


    @Override
    public List<WorkshopClass> getAllWorkshops() {
        List<WorkshopClass> workshops = (List<WorkshopClass>) workshopRepository.findAll();
        return workshops;
    }

    @Override
    public WorkshopClass getWorkshopById(int id) {
        if(workshopRepository.findById((long) id).isPresent()) {
            return workshopRepository.findById((long) id).get();
        }
        return null;
    }

    @Override
    public WorkshopClass createWorkshop(WorkshopClass workshop) {
        return workshopRepository.save(workshop);
    }

    @Override
    public boolean deleteWorkshop(int id) {
        try {
            workshopRepository.deleteById((long) id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
