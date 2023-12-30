package org.nqh.asm2.pojo;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Objects;

@Entity
public class Recruitment {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idrecruitment")
    private int idrecruitment;
    @Basic
    @Column(name = "address")
    private String address;
    @Basic
    @Column(name = "created_at")
    private String createdAt;
    @Basic
    @Column(name = "description")
    private String description;
    @Basic
    @Column(name = "experience")
    private String experience;
    @Basic
    @Column(name = "quantity")
    private Integer quantity;
    @Basic
    @Column(name = "rank")
    private String rank;
    @Basic
    @Column(name = "salary")
    private String salary;
    @Basic
    @Column(name = "status")
    private Integer status;
    @Basic
    @Column(name = "title")
    private String title;
    @Basic
    @Column(name = "type")
    private String type;
    @Basic
    @Column(name = "view")
    private String view;
    @Basic
    @Column(name = "category_id")
    private Integer categoryId;
    @Basic
    @Column(name = "company_id")
    private Integer companyId;
    @Basic
    @Column(name = "deadline")
    private String deadline;
    @OneToMany(mappedBy = "recruitmentByRecruitmentId")
    private Collection<Applypost> applypostsByIdrecruitment;
    @ManyToOne
    @JoinColumn(name = "company_id", referencedColumnName = "idcategory")
    private Category categoryByCompanyId;
    @ManyToOne
    @JoinColumn(name = "company_id", referencedColumnName = "idcompany")
    private Company companyByCompanyId;
    @OneToMany(mappedBy = "recruitmentByRecruitmentId")
    private Collection<SaveJob> saveJobsByIdrecruitment;

    public int getIdrecruitment() {
        return idrecruitment;
    }

    public void setIdrecruitment(int idrecruitment) {
        this.idrecruitment = idrecruitment;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recruitment that = (Recruitment) o;
        return idrecruitment == that.idrecruitment && Objects.equals(address, that.address) && Objects.equals(createdAt, that.createdAt) && Objects.equals(description, that.description) && Objects.equals(experience, that.experience) && Objects.equals(quantity, that.quantity) && Objects.equals(rank, that.rank) && Objects.equals(salary, that.salary) && Objects.equals(status, that.status) && Objects.equals(title, that.title) && Objects.equals(type, that.type) && Objects.equals(view, that.view) && Objects.equals(categoryId, that.categoryId) && Objects.equals(companyId, that.companyId) && Objects.equals(deadline, that.deadline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idrecruitment, address, createdAt, description, experience, quantity, rank, salary, status, title, type, view, categoryId, companyId, deadline);
    }

    public Collection<Applypost> getApplypostsByIdrecruitment() {
        return applypostsByIdrecruitment;
    }

    public void setApplypostsByIdrecruitment(Collection<Applypost> applypostsByIdrecruitment) {
        this.applypostsByIdrecruitment = applypostsByIdrecruitment;
    }

    public Category getCategoryByCompanyId() {
        return categoryByCompanyId;
    }

    public void setCategoryByCompanyId(Category categoryByCompanyId) {
        this.categoryByCompanyId = categoryByCompanyId;
    }

    public Company getCompanyByCompanyId() {
        return companyByCompanyId;
    }

    public void setCompanyByCompanyId(Company companyByCompanyId) {
        this.companyByCompanyId = companyByCompanyId;
    }

    public Collection<SaveJob> getSaveJobsByIdrecruitment() {
        return saveJobsByIdrecruitment;
    }

    public void setSaveJobsByIdrecruitment(Collection<SaveJob> saveJobsByIdrecruitment) {
        this.saveJobsByIdrecruitment = saveJobsByIdrecruitment;
    }
}
