package edu.miu.cs489.tsogt.lab_6.model;

import com.google.gson.GsonBuilder;
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

    @OneToMany(mappedBy = "patient")
    private List<Appointment> appointmentList;

    @OneToOne
    @Expose
    private Address address;


    @Override
    public String toString() {
        Gson gson = new GsonBuilder()
                .excludeFieldsWithoutExposeAnnotation()
                .setPrettyPrinting()
                .create();
        return gson.toJson(this);
    }
}
