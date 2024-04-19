package edu.miu.cs489.tsogt.lab_11.service;


import edu.miu.cs489.tsogt.lab_11.dto.address.AddressResponse;
import edu.miu.cs489.tsogt.lab_11.model.Address;

import java.util.List;

public interface AddressService {
    Address addAddress(Address address);

    List<AddressResponse> getAllAddressesWithPatients();
}
