package org.nqh.asm2.pojo;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Objects;

@Entity
public class Cv {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idcv")
    private int idcv;
    @Basic
    @Column(name = "file_name")
    private String fileName;
    @Basic
    @Column(name = "user_id")
    private Integer userId;
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "iduser")
    private User userByUserId;
    @OneToMany(mappedBy = "cvByCvId")
    private Collection<User> usersByIdcv;

    public int getIdcv() {
        return idcv;
    }

    public void setIdcv(int idcv) {
        this.idcv = idcv;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
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
        Cv cv = (Cv) o;
        return idcv == cv.idcv && Objects.equals(fileName, cv.fileName) && Objects.equals(userId, cv.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idcv, fileName, userId);
    }

    public User getUserByUserId() {
        return userByUserId;
    }

    public void setUserByUserId(User userByUserId) {
        this.userByUserId = userByUserId;
    }

    public Collection<User> getUsersByIdcv() {
        return usersByIdcv;
    }

    public void setUsersByIdcv(Collection<User> usersByIdcv) {
        this.usersByIdcv = usersByIdcv;
    }
}
