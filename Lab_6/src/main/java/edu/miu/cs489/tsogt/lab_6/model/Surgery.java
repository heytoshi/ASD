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
    private String id;
    private String name;
    private String telephoneNumber;

    @OneToMany
    private List<Appointment> appointments;

    @OneToOne
    private Address address;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Surgery{");
        sb.append("id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", telephoneNumber=").append(telephoneNumber);
        sb.append(", address=").append(address);
        return sb.toString();
    }
}
