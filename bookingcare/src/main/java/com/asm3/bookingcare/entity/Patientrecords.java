package com.asm3.bookingcare.entity;

import jakarta.persistence.*;

@Entity
public class Patientrecords {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "appointment_id", nullable = true)
    private Integer appointmentId;
    @Basic
    @Column(name = "record_file", nullable = true, length = 255)
    private String recordFile;
    @ManyToOne
    @JoinColumn(name = "appointment_id", referencedColumnName = "id")
    private Appointments appointmentsByAppointmentId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(Integer appointmentId) {
        this.appointmentId = appointmentId;
    }

    public String getRecordFile() {
        return recordFile;
    }

    public void setRecordFile(String recordFile) {
        this.recordFile = recordFile;
    }

    public Appointments getAppointmentsByAppointmentId() {
        return appointmentsByAppointmentId;
    }

    public void setAppointmentsByAppointmentId(Appointments appointmentsByAppointmentId) {
        this.appointmentsByAppointmentId = appointmentsByAppointmentId;
    }
}
