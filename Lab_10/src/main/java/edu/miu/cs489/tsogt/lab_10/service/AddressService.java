package edu.miu.cs489.tsogt.lab_10.service;


import edu.miu.cs489.tsogt.lab_10.dto.address.AddressResponse;
import edu.miu.cs489.tsogt.lab_10.model.Address;

import java.util.List;

public interface AddressService {
    Address addAddress(Address address);

    List<AddressResponse> getAllAddressesWithPatients();
}
