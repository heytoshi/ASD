package edu.miu.cs489.tsogt.lab_6;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import edu.miu.cs489.tsogt.lab_6.model.Address;
import edu.miu.cs489.tsogt.lab_6.model.Appointment;
import edu.miu.cs489.tsogt.lab_6.model.Dentist;
import edu.miu.cs489.tsogt.lab_6.model.Patient;
import edu.miu.cs489.tsogt.lab_6.service.AddressService;
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
    private final AddressService addressService;

    public Lab6Application(PatientService patientService, DentistService dentistService, AppointmentService appointmentService, AddressService addressService) {
        this.patientService = patientService;
        this.dentistService = dentistService;
        this.appointmentService = appointmentService;
        this.addressService = addressService;
    }

    public static void main(String[] args) {

        SpringApplication.run(Lab6Application.class, args);
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        Address address8 = new Address(8, "404 Willow Ave", "San Antonio", "TX", "78201");
        Patient patient = new Patient("P111", "John2", "Walker2", "202-431-5412", "john.walker@gmail.com", "01-Oct-1989", null, address8);
        addressService.addAddress(address8);
        patientService.addPatient(patient);
        patientService.deletePatient(patient);

        List<Patient> list = patientService.getPatients();
        for(Patient p: list) {
            System.out.println(p);
        }
    }
}
