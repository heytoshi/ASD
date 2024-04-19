package edu.miu.cs489.tsogt.lab_11.controller;

import edu.miu.cs489.tsogt.lab_11.service.AddressService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import edu.miu.cs489.tsogt.lab_11.dto.address.AddressResponse;

import java.util.List;

@RestController
public class AddressController {
    private AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping(value = "adsweb/api/v1/address/list")
    public ResponseEntity<List<AddressResponse>> getAllAddressesWithPatients() {
        List<AddressResponse> addresses = addressService.getAllAddressesWithPatients();
        return ResponseEntity.ok(addresses);
    }
}
