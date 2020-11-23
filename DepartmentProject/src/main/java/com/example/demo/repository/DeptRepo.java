package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

 

import com.example.demo.model.Department;
@Repository
public interface DeptRepo extends CrudRepository<Department, Integer>{

 

}
 