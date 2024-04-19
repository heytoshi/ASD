package edu.miu.cs489.tsogt.lab_11;

import edu.miu.cs489.tsogt.lab_11.controller.PatientController;
import edu.miu.cs489.tsogt.lab_11.dto.patient.PatientResponse;
import edu.miu.cs489.tsogt.lab_11.exception.PatientNotFoundException;
import edu.miu.cs489.tsogt.lab_11.model.Address;
import edu.miu.cs489.tsogt.lab_11.model.Patient;
import edu.miu.cs489.tsogt.lab_11.repository.PatientRepository;
import edu.miu.cs489.tsogt.lab_11.service.impl.PatientServiceImpl;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

@SpringBootTest
@RunWith(value= MockitoJUnitRunner.class)
class Lab11ApplicationTests {

    @Mock
    private PatientRepository patientRepository;

    @Mock
    private PatientController patientController;

    @InjectMocks
    private PatientServiceImpl patientService;

    @Test
    public void testFindPatientById() throws PatientNotFoundException {
        int patientId = 99;

        Patient patient = new Patient();
        patient.setId(patientId);

        when(patientRepository.findById(patientId)).thenReturn(Optional.of(patient));
        PatientResponse foundPatient = patientService.getPatient(patientId);

        assertNotNull(foundPatient);
        Assert.assertEquals(patientId, foundPatient.id());
    }

    @Test
    public void testFindAllPatientsBy() {
        Address address1 = new Address("123 Main St", "New York", "NY", "10001");
        Address address2 = new Address("456 Park Ave", "Los Angeles", "CA", "90001");
        Address address3 = new Address("789 Broadway", "Chicago", "IL", "60601");

        List<PatientResponse> expectedPatients = Arrays.asList(
                new PatientResponse(1, "Gillian", "White", "987-654-3210", "gillian.white@gmail.com", "01-Sep-1999", address1),
                new PatientResponse(2, "Jill", "Bell", "431-231-5412", "jill.bell@gmail.com", "01-Oct-1999", address2),
                new PatientResponse(3, "Ian", "MacKay", "902-231-5412", "ian.bmackey@gmail.com", "01-Oct-1999", address3)
        );

        when(patientService.getPatients()).thenReturn(expectedPatients);

        ResponseEntity<List<PatientResponse>> mockResponseEntity = ResponseEntity.ok(expectedPatients);
        when(patientController.listPatients()).thenReturn(mockResponseEntity);

        ResponseEntity<List<PatientResponse>> responseEntity = patientController.listPatients();
        Assert.assertEquals(expectedPatients, responseEntity.getBody());
    }
}
