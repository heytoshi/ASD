package edu.miu.cs489.tsogt.lab_6.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Surgery")
public class Surgery {
    @Id
    @Expose
    private String id;
    @Expose
    private String name;
    @Expose
    private String telephoneNumber;

    @OneToMany
    private List<Appointment> appointments;

    @Expose
    @OneToOne
    private Address address;

    @Override
    public String toString() {
        Gson gson = new GsonBuilder()
                .excludeFieldsWithoutExposeAnnotation()
                .create();
        return gson.toJson(this);
    }
}
