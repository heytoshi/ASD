package edu.miu.cs489.tsogt.lab_6;

import edu.miu.cs489.tsogt.lab_6.model.Appointment;
import edu.miu.cs489.tsogt.lab_6.model.Dentist;
import edu.miu.cs489.tsogt.lab_6.model.Patient;
import edu.miu.cs489.tsogt.lab_6.model.Surgery;
import edu.miu.cs489.tsogt.lab_6.repository.AppointmentRepository;
import edu.miu.cs489.tsogt.lab_6.repository.DentistRepository;
import edu.miu.cs489.tsogt.lab_6.repository.PatientRepository;
import edu.miu.cs489.tsogt.lab_6.repository.SurgeryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final DentistRepository dentistRepository;
    private final PatientRepository patientRepository;
    private final AppointmentRepository appointmentRepository;
    private final SurgeryRepository surgeryRepository;

    @Autowired
    public DataLoader(DentistRepository dentistRepository,
                      PatientRepository patientRepository,
                      AppointmentRepository appointmentRepository,
                      SurgeryRepository surgeryRepository) {
        this.dentistRepository = dentistRepository;
        this.patientRepository = patientRepository;
        this.appointmentRepository = appointmentRepository;
        this.surgeryRepository = surgeryRepository;
    }
    @Override
    public void run(String... args) throws Exception {
        Dentist dentist1 = new Dentist();
        dentist1.setFirstName("Tony");
        dentist1.setLastName("Smith");
        dentistRepository.save(dentist1);

        Dentist dentist2 = new Dentist();
        dentist2.setFirstName("Helen");
        dentist2.setLastName("Pearson");
        dentistRepository.save(dentist2);

        Dentist dentist3 = new Dentist();
        dentist3.setFirstName("Robin");
        dentist3.setLastName("Plevin");
        dentistRepository.save(dentist3);


        Patient patient1 = new Patient();
        patient1.setId("P100");
        patient1.setFirstName("Gillian");
        patient1.setLastName("White");
        patientRepository.save(patient1);

        Patient patient2 = new Patient();
        patient2.setId("P105");
        patient2.setFirstName("Jill");
        patient2.setLastName("Bell");
        patientRepository.save(patient2);

        Patient patient3 = new Patient();
        patient3.setId("P108");
        patient3.setFirstName("Ian");
        patient3.setLastName("MacKay");
        patientRepository.save(patient3);

        Patient patient4 = new Patient();
        patient4.setId("P110");
        patient4.setFirstName("John");
        patient4.setLastName("Walker");
        patientRepository.save(patient4);

        Surgery surgery1 = new Surgery();
        surgery1.setId("S15");
        surgeryRepository.save(surgery1);

        Surgery surgery2 = new Surgery();
        surgery2.setId("S10");
        surgeryRepository.save(surgery2);

        Surgery surgery3 = new Surgery();
        surgery3.setId("S13");
        surgeryRepository.save(surgery3);

        Appointment appointment1 = new Appointment();
        appointment1.setDentist(dentist1);
        appointment1.setPatient(patient1);
        appointment1.setSurgery(surgery1);
        appointment1.setAppointmentDate("12-Sep-13");
        appointment1.setAppointmentTime(10.00);
        appointmentRepository.save(appointment1);


        Appointment appointment2 = new Appointment();
        appointment2.setDentist(dentist1);
        appointment2.setPatient(patient2);
        appointment2.setSurgery(surgery1);
        appointment2.setAppointmentDate("12-Sep-13");
        appointment2.setAppointmentTime(12.00);
        appointmentRepository.save(appointment2);

        Appointment appointment3 = new Appointment();
        appointment3.setDentist(dentist2);
        appointment3.setPatient(patient3);
        appointment3.setSurgery(surgery2);
        appointment3.setAppointmentDate("12-Sep-13");
        appointment3.setAppointmentTime(10.00);
        appointmentRepository.save(appointment3);

        Appointment appointment4 = new Appointment();
        appointment4.setDentist(dentist2);
        appointment4.setPatient(patient3);
        appointment4.setSurgery(surgery2);
        appointment4.setAppointmentDate("14-Sep-13");
        appointment4.setAppointmentTime(14.00);
        appointmentRepository.save(appointment4);

        Appointment appointment5 = new Appointment();
        appointment5.setDentist(dentist3);
        appointment5.setPatient(patient2);
        appointment5.setSurgery(surgery1);
        appointment5.setAppointmentDate("14-Sep-13");
        appointment5.setAppointmentTime(16.30);
        appointmentRepository.save(appointment5);

        Appointment appointment6 = new Appointment();
        appointment6.setDentist(dentist3);
        appointment6.setPatient(patient4);
        appointment6.setSurgery(surgery3);
        appointment6.setAppointmentDate("15-Sep-13");
        appointment6.setAppointmentTime(18.00);
        appointmentRepository.save(appointment6);

    }
}



