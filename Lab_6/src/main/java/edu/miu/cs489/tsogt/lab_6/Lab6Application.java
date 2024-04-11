package edu.miu.cs489.tsogt.lab_6;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import edu.miu.cs489.tsogt.lab_6.model.*;
import edu.miu.cs489.tsogt.lab_6.service.*;
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
    private final SurgeryService surgeryService;

    public Lab6Application(PatientService patientService, DentistService dentistService, AppointmentService appointmentService, AddressService addressService, SurgeryService surgeryService) {
        this.patientService = patientService;
        this.dentistService = dentistService;
        this.appointmentService = appointmentService;
        this.addressService = addressService;
        this.surgeryService = surgeryService;
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
        for (Patient p : list) {
            System.out.println(p);
        }

        List<Surgery> surgeryList = surgeryService.findAll();
        for (Surgery s : surgeryList) {
            System.out.println(s);
        }

        List<Dentist> dentistList = dentistService.getDentists();
        for (Dentist s : dentistList) {
            System.out.println(s);
        }

        List<Appointment> appointmentList = appointmentService.getAppointments();
        for (Appointment s : appointmentList) {
            System.out.println(s);
        }

    }
}
