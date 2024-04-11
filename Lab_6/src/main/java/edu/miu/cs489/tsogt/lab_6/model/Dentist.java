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
    private int id;
    private String firstName;
    private String lastName;
    private String contactPhoneNumber;
    private String email;
    private String specialization;

    @OneToMany(mappedBy = "dentist")
    private List<Appointment> appointments;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Dentist{");
        sb.append("id=").append(id);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", contactPhoneNumber='").append(contactPhoneNumber).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", specialization='").append(specialization).append('\'');
        return sb.toString();
    }
}
