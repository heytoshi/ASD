package edu.miu.cs489.tsogt.lab_6.model;

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

    @OneToMany(mappedBy = "surgery")
    private List<Appointment> appointments;

    @OneToOne
    private Address address;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{\n");
        sb.append("  \"id\": ").append(id).append(",\n");
        sb.append("  \"name\": \"").append(name).append("\",\n");
        sb.append("  \"telephoneNumber\": \"").append(telephoneNumber).append("\",\n");
        sb.append("  \"address\": ").append(address).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
