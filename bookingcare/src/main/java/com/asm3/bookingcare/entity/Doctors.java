package com.asm3.bookingcare.entity;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
public class Doctors {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "full_name", nullable = true, length = 255)
    private String fullName;
    @Basic
    @Column(name = "introduction", nullable = true, length = 255)
    private String introduction;
    @Basic
    @Column(name = "training", nullable = true, length = 255)
    private String training;
    @Basic
    @Column(name = "achievements", nullable = true, length = 255)
    private String achievements;
    @Basic
    @Column(name = "department_id", nullable = true)
    private Integer departmentId;
    @OneToMany(mappedBy = "doctorsByDoctorId")
    private Collection<Appointments> appointmentsById;
    @ManyToOne
    @JoinColumn(name = "department_id", referencedColumnName = "id")
    private Departments departmentsByDepartmentId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getTraining() {
        return training;
    }

    public void setTraining(String training) {
        this.training = training;
    }

    public String getAchievements() {
        return achievements;
    }

    public void setAchievements(String achievements) {
        this.achievements = achievements;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Collection<Appointments> getAppointmentsById() {
        return appointmentsById;
    }

    public void setAppointmentsById(Collection<Appointments> appointmentsById) {
        this.appointmentsById = appointmentsById;
    }

    public Departments getDepartmentsByDepartmentId() {
        return departmentsByDepartmentId;
    }

    public void setDepartmentsByDepartmentId(Departments departmentsByDepartmentId) {
        this.departmentsByDepartmentId = departmentsByDepartmentId;
    }
}
