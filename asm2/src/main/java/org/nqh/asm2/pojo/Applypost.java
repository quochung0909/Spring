package org.nqh.asm2.pojo;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Applypost {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idapplypost")
    private int idapplypost;
    @Basic
    @Column(name = "created_at")
    private String createdAt;
    @Basic
    @Column(name = "recruitment_id")
    private Integer recruitmentId;
    @Basic
    @Column(name = "user_id")
    private Integer userId;
    @Basic
    @Column(name = "name_cv")
    private String nameCv;
    @Basic
    @Column(name = "status")
    private Integer status;
    @Basic
    @Column(name = "text")
    private String text;
    @ManyToOne
    @JoinColumn(name = "recruitment_id", referencedColumnName = "idrecruitment")
    private Recruitment recruitmentByRecruitmentId;
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "iduser")
    private User userByUserId;

    public int getIdapplypost() {
        return idapplypost;
    }

    public void setIdapplypost(int idapplypost) {
        this.idapplypost = idapplypost;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getRecruitmentId() {
        return recruitmentId;
    }

    public void setRecruitmentId(Integer recruitmentId) {
        this.recruitmentId = recruitmentId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getNameCv() {
        return nameCv;
    }

    public void setNameCv(String nameCv) {
        this.nameCv = nameCv;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Applypost applypost = (Applypost) o;
        return idapplypost == applypost.idapplypost && Objects.equals(createdAt, applypost.createdAt) && Objects.equals(recruitmentId, applypost.recruitmentId) && Objects.equals(userId, applypost.userId) && Objects.equals(nameCv, applypost.nameCv) && Objects.equals(status, applypost.status) && Objects.equals(text, applypost.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idapplypost, createdAt, recruitmentId, userId, nameCv, status, text);
    }

    public Recruitment getRecruitmentByRecruitmentId() {
        return recruitmentByRecruitmentId;
    }

    public void setRecruitmentByRecruitmentId(Recruitment recruitmentByRecruitmentId) {
        this.recruitmentByRecruitmentId = recruitmentByRecruitmentId;
    }

    public User getUserByUserId() {
        return userByUserId;
    }

    public void setUserByUserId(User userByUserId) {
        this.userByUserId = userByUserId;
    }
}
