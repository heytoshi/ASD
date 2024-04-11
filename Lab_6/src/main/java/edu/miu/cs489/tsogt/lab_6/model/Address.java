package edu.miu.cs489.tsogt.lab_6.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Address")
public class Address {
    @Id
    private int id;

    private String streetAddress;
    private String city;
    private String state;
    private String postalCode;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{\n");
        sb.append("  \"id\": ").append(id).append(",\n");
        sb.append("  \"streetAddress\": \"").append(streetAddress).append("\",\n");
        sb.append("  \"city\": \"").append(city).append("\",\n");
        sb.append("  \"state\": \"").append(state).append("\",\n");
        sb.append("  \"postalCode\": \"").append(postalCode).append("\"\n");
        sb.append("}");
        return sb.toString();
    }
}

