package com.nqh.asm.pojo;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Objects;

@Entity
public class Donation {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;
    @Basic
    @Column(name = "code")
    private String code;
    @Basic
    @Column(name = "created")
    private String created;
    @Basic
    @Column(name = "description")
    private String description;
    @Basic
    @Column(name = "end_date")
    private String endDate;
    @Basic
    @Column(name = "money")
    private Integer money;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "organization_name")
    private String organizationName;
    @Basic
    @Column(name = "phone_number")
    private String phoneNumber;
    @Basic
    @Column(name = "start_date")
    private String startDate;
    @Basic
    @Column(name = "status")
    private Integer status;
    @OneToMany(mappedBy = "donationByDonationId")
    private Collection<UserDonation> userDonationsById;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Donation donation = (Donation) o;
        return Objects.equals(id, donation.id) && Objects.equals(code, donation.code) && Objects.equals(created, donation.created) && Objects.equals(description, donation.description) && Objects.equals(endDate, donation.endDate) && Objects.equals(money, donation.money) && Objects.equals(name, donation.name) && Objects.equals(organizationName, donation.organizationName) && Objects.equals(phoneNumber, donation.phoneNumber) && Objects.equals(startDate, donation.startDate) && Objects.equals(status, donation.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, code, created, description, endDate, money, name, organizationName, phoneNumber, startDate, status);
    }

    public Collection<UserDonation> getUserDonationsById() {
        return userDonationsById;
    }

    public void setUserDonationsById(Collection<UserDonation> userDonationsById) {
        this.userDonationsById = userDonationsById;
    }
}
