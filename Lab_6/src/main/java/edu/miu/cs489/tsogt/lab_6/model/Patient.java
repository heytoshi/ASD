package edu.miu.cs489.tsogt.lab_6.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Patient")
public class Patient {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String contactPhoneNumber;
    private String email;
    private String dateOfBirth;

    @OneToMany(mappedBy = "patient")
    private List<Appointment> appointmentList;
    @OneToOne
    private Address address;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{\n");
        sb.append("  \"id\": ").append(id).append(",\n");
        sb.append("  \"firstName\": \"").append(firstName).append("\",\n");
        sb.append("  \"lastName\": \"").append(lastName).append("\",\n");
        sb.append("  \"contactPhoneNumber\": \"").append(contactPhoneNumber).append("\",\n");
        sb.append("  \"email\": \"").append(email).append("\",\n");
        sb.append("  \"dateOfBirth\": \"").append(dateOfBirth).append("\",\n");
        sb.append("  \"address\": ").append(address).append(",\n");
        sb.append("  \"appointmentList\": [");
        if (appointmentList != null && !appointmentList.isEmpty()) {
            for (Appointment appointment : appointmentList) {
                sb.append("\n    ").append(appointment).append(",");
            }
            sb.deleteCharAt(sb.length() - 1);
            sb.append("\n  ");
        }
        sb.append("]\n");
        sb.append("}");
        return sb.toString();
    }
}
