package org.nqh.asm2.pojo;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Objects;

@Entity
public class Company {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idcompany")
    private int idcompany;
    @Basic
    @Column(name = "address")
    private String address;
    @Basic
    @Column(name = "description")
    private String description;
    @Basic
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "logo")
    private String logo;
    @Basic
    @Column(name = "name_company")
    private String nameCompany;
    @Basic
    @Column(name = "phone_company")
    private String phoneCompany;
    @Basic
    @Column(name = "status")
    private Integer status;
    @Basic
    @Column(name = "user_id")
    private Integer userId;
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "iduser")
    private User userByUserId;
    @OneToMany(mappedBy = "companyByCompanyId")
    private Collection<FollowCompany> followCompaniesByIdcompany;
    @OneToMany(mappedBy = "companyByCompanyId")
    private Collection<Recruitment> recruitmentsByIdcompany;

    public int getIdcompany() {
        return idcompany;
    }

    public void setIdcompany(int idcompany) {
        this.idcompany = idcompany;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public String getPhoneCompany() {
        return phoneCompany;
    }

    public void setPhoneCompany(String phoneCompany) {
        this.phoneCompany = phoneCompany;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
        Company company = (Company) o;
        return idcompany == company.idcompany && Objects.equals(address, company.address) && Objects.equals(description, company.description) && Objects.equals(email, company.email) && Objects.equals(logo, company.logo) && Objects.equals(nameCompany, company.nameCompany) && Objects.equals(phoneCompany, company.phoneCompany) && Objects.equals(status, company.status) && Objects.equals(userId, company.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idcompany, address, description, email, logo, nameCompany, phoneCompany, status, userId);
    }

    public User getUserByUserId() {
        return userByUserId;
    }

    public void setUserByUserId(User userByUserId) {
        this.userByUserId = userByUserId;
    }

    public Collection<FollowCompany> getFollowCompaniesByIdcompany() {
        return followCompaniesByIdcompany;
    }

    public void setFollowCompaniesByIdcompany(Collection<FollowCompany> followCompaniesByIdcompany) {
        this.followCompaniesByIdcompany = followCompaniesByIdcompany;
    }

    public Collection<Recruitment> getRecruitmentsByIdcompany() {
        return recruitmentsByIdcompany;
    }

    public void setRecruitmentsByIdcompany(Collection<Recruitment> recruitmentsByIdcompany) {
        this.recruitmentsByIdcompany = recruitmentsByIdcompany;
    }
}
