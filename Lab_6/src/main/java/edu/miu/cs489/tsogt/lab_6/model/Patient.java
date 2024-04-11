package edu.miu.cs489.tsogt.lab_6.model;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.google.gson.Gson;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Patient")
public class Patient {
    @Id
    @Expose
    private String id;
    @Expose
    private String firstName;
    @Expose
    private String lastName;
    @Expose
    private String contactPhoneNumber;
    @Expose
    private String email;
    @Expose
    private String dateOfBirth;

    @Expose
    @OneToMany(mappedBy = "patient")
    private List<Appointment> appointmentList;

    @Expose
    @OneToOne
    private Address address;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Patient{");
        sb.append("id: " + id + "\n");
        sb.append("firstName: " + firstName + "\n");
        sb.append("lastName: " + lastName + "\n");
        sb.append("contactPhoneNumber: " + contactPhoneNumber + "\n");
        sb.append("email: " + email + "\n");
        sb.append("dateOfBirth: " + dateOfBirth + "\n");
        sb.append("address: " + address + "\n");
        sb.append("appointmentList: " + appointmentList + "\n");
        return sb.toString();
    }
}
