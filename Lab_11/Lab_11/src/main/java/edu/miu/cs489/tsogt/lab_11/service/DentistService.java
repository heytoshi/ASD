package edu.miu.cs489.tsogt.lab_11.service;


import edu.miu.cs489.tsogt.lab_11.model.Dentist;

import java.util.List;

public interface DentistService {
    List<Dentist> getDentists();

    Dentist getDentistById(int id);

    Dentist createDentist(Dentist dentist);

    Dentist updateDentist(Dentist dentist);

    void deleteDentist(Dentist dentist);
}

