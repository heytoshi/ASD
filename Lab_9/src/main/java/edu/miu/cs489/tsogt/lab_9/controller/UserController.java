package edu.miu.cs489.tsogt.lab_9.controller;

import edu.miu.cs489.tsogt.lab_9.dto.user.UserAuthRequest;
import edu.miu.cs489.tsogt.lab_9.utils.service.JWTManagementUtilityService;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class UserController {

    private JWTManagementUtilityService jwtService;
    private AuthenticationManager authManager;

    public UserController(JWTManagementUtilityService jwtService, AuthenticationManager authManager) {
        this.jwtService = jwtService;
        this.authManager = authManager;
    }

    @PostMapping(value = "/adsweb/api/v1/service/public/authenticate")
    public String authenticateUser(@Valid @RequestBody UserAuthRequest request) throws Exception {
        authManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
        return jwtService.generateToken(request.getUsername());
    }
}
