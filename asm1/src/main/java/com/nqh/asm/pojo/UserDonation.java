package com.nqh.asm.pojo;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "user_donation", schema = "asm1", catalog = "")
public class UserDonation {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;
    @Basic
    @Column(name = "created")
    private String created;
    @Basic
    @Column(name = "money")
    private Integer money;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "status")
    private Integer status;
    @Basic
    @Column(name = "text")
    private String text;
    @Basic
    @Column(name = "donation_id")
    private Integer donationId;
    @Basic
    @Column(name = "user_id")
    private Integer userId;
    @ManyToOne
    @JoinColumn(name = "donation_id", referencedColumnName = "id", nullable = false)
    private Donation donationByDonationId;
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    private User userByUserId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getDonationId() {
        return donationId;
    }

    public void setDonationId(Integer donationId) {
        this.donationId = donationId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDonation that = (UserDonation) o;
        return Objects.equals(id, that.id) && Objects.equals(created, that.created) && Objects.equals(money, that.money) && Objects.equals(name, that.name) && Objects.equals(status, that.status) && Objects.equals(text, that.text) && Objects.equals(donationId, that.donationId) && Objects.equals(userId, that.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, created, money, name, status, text, donationId, userId);
    }

    public Donation getDonationByDonationId() {
        return donationByDonationId;
    }

    public void setDonationByDonationId(Donation donationByDonationId) {
        this.donationByDonationId = donationByDonationId;
    }

    public User getUserByUserId() {
        return userByUserId;
    }

    public void setUserByUserId(User userByUserId) {
        this.userByUserId = userByUserId;
    }
}
