package org.nqh.asm2.pojo;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "follow_company", schema = "asm2", catalog = "")
public class FollowCompany {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idfollow_company")
    private int idfollowCompany;
    @Basic
    @Column(name = "company_id")
    private Integer companyId;
    @Basic
    @Column(name = "user_id")
    private Integer userId;
    @ManyToOne
    @JoinColumn(name = "company_id", referencedColumnName = "idcompany")
    private Company companyByCompanyId;
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "iduser")
    private User userByUserId;

    public int getIdfollowCompany() {
        return idfollowCompany;
    }

    public void setIdfollowCompany(int idfollowCompany) {
        this.idfollowCompany = idfollowCompany;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
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
        FollowCompany that = (FollowCompany) o;
        return idfollowCompany == that.idfollowCompany && Objects.equals(companyId, that.companyId) && Objects.equals(userId, that.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idfollowCompany, companyId, userId);
    }

    public Company getCompanyByCompanyId() {
        return companyByCompanyId;
    }

    public void setCompanyByCompanyId(Company companyByCompanyId) {
        this.companyByCompanyId = companyByCompanyId;
    }

    public User getUserByUserId() {
        return userByUserId;
    }

    public void setUserByUserId(User userByUserId) {
        this.userByUserId = userByUserId;
    }
}
