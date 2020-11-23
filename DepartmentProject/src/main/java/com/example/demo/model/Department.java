package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

 

@Entity
@Table(name="Department")
public class Department {
   @Id
   @Column(name="dept_id")
    private int id;
   
   @Column(name="dept_name")
   @Size(min=4, max=20,message="department name must be 4-20 characters")
   private String name;

 

public int getId() {
    return id;
}

 

public void setId(int id) {
    this.id = id;
}

 

public String getName() {
    return name;
}

 

public void setName(String name) {
    this.name = name;
}

 

@Override
public String toString() {
    return "Department [id=" + id + ", name=" + name + "]";
}
   
}
 