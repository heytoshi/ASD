package edu.miu.cs489.tsogt.lab_6;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import edu.miu.cs489.tsogt.lab_6.model.Appointment;
import edu.miu.cs489.tsogt.lab_6.model.Dentist;
import edu.miu.cs489.tsogt.lab_6.model.Patient;
import edu.miu.cs489.tsogt.lab_6.service.AppointmentService;
import edu.miu.cs489.tsogt.lab_6.service.DentistService;
import edu.miu.cs489.tsogt.lab_6.service.PatientService;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootApplication
public class Lab6Application implements CommandLineRunner {

    private final PatientService patientService;
    private final DentistService dentistService;
    private final AppointmentService appointmentService;

    public Lab6Application(PatientService patientService, DentistService dentistService, AppointmentService appointmentService) {
        this.patientService = patientService;
        this.dentistService = dentistService;
        this.appointmentService = appointmentService;
    }

    public static void main(String[] args) {

        SpringApplication.run(Lab6Application.class, args);
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        List<Patient> patient = patientService.getPatients();
        System.out.println("Hello");
        System.out.println(patient);
    }
}
