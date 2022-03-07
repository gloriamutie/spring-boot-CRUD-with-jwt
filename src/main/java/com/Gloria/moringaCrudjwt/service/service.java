package com.Gloria.moringaCrudjwt.service;

import com.Gloria.moringaCrudjwt.datalayer.Entity.Department;

import java.util.List;

public interface Service {

    Department saveDepartment(Department department);

    List<Department> fetchDepartmentList();

    Department updateDepartment(Department department,
                                Long departmentId);

    void deleteDepartmentById(Long departmentId);
}