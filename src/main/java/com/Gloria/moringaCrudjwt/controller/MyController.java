package com.Gloria.moringaCrudjwt.controller;

import com.Gloria.moringaCrudjwt.datalayer.Entity.Department;
import com.Gloria.moringaCrudjwt.datalayer.model.AuthenticationRequest;
import com.Gloria.moringaCrudjwt.datalayer.model.AuthenticationResponse;
import com.Gloria.moringaCrudjwt.service.ServiceImp;
import com.Gloria.moringaCrudjwt.utils.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController
public class MyController {
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private ServiceImp serviceImp;
    @Autowired
    private JwtUtil jwtUtil;



    @RequestMapping({"/hello" })
    public String helloWorld() {
        return "Hello there";
    }

    // Save operation
    @PostMapping("/department")
    public Department saveDepartment(
            @Valid @RequestBody Department department)
    {
        return serviceImp.saveDepartment(department);
    }

    // Read operation
    @GetMapping("/departments")
    public List<Department> fetchDepartmentList()
    {
        return serviceImp.fetchDepartmentList();
    }

    // Update operation
    @PutMapping("/departments/{id}")
    public Department
    updateDepartment(@RequestBody Department department,
                     @PathVariable("id") Long departmentId)
    {
        return serviceImp.updateDepartment(
                department, departmentId);
    }

    // Delete operation
    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id")
                                               Long departmentId)
    {
        serviceImp.deleteDepartmentById(
                departmentId);
        return "Deleted Successfully";
    }

    // Generate token to authenticate endpoints

    @RequestMapping(value = "/authenticate", method = RequestMethod.POST)
    public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception {

        try {

            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(), authenticationRequest.getPassword())
            );
        } catch (BadCredentialsException e) {
            throw new Exception("Incorrect userName or password", e);
        }

        final UserDetails userDetails = serviceImp.loadUserByUsername(authenticationRequest.getUsername());
        final String jwt = jwtUtil.generateToken(userDetails);

        return ResponseEntity.ok(new AuthenticationResponse(jwt));
    }
}