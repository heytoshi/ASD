package edu.miu.cs489.tsogt.lab_6.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "Dentist")
public class Dentist {
    @Id
    @Expose
    private int id;
    @Expose
    private String firstName;
    @Expose
    private String lastName;
    @Expose
    private String contactPhoneNumber;
    @Expose
    private String email;
    @Expose
    private String specialization;

    @OneToMany
    private List<Appointment> appointments;

    @Override
    public String toString() {
        Gson gson = new GsonBuilder()
                .excludeFieldsWithoutExposeAnnotation()
                .create();
        return gson.toJson(this);
    }
}
