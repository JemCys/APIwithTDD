package com.Solera.APIRest.APIwithTDD.Contracts;
import com.Solera.APIRest.APIwithTDD.Models.WorkshopClass;

import java.util.List;

public interface IServiceWorkshop {
    List<WorkshopClass> getAllWorkshops();
    WorkshopClass getWorkshopById(int id);
    WorkshopClass createWorkshop(WorkshopClass workshop);
    boolean deleteWorkshop(int id);
}
