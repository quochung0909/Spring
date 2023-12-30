package com.asm3.bookingcare.entity;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
public class Departments {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "name", nullable = true, length = 255)
    private String name;
    @OneToMany(mappedBy = "departmentsByDepartmentId")
    private Collection<Doctors> doctorsById;

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

    public Collection<Doctors> getDoctorsById() {
        return doctorsById;
    }

    public void setDoctorsById(Collection<Doctors> doctorsById) {
        this.doctorsById = doctorsById;
    }
}
