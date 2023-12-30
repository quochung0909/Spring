package org.nqh.asm2.pojo;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "save_job", schema = "asm2", catalog = "")
public class SaveJob {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idsave_job")
    private int idsaveJob;
    @Basic
    @Column(name = "recruitment_id")
    private Integer recruitmentId;
    @Basic
    @Column(name = "user_id")
    private Integer userId;
    @ManyToOne
    @JoinColumn(name = "recruitment_id", referencedColumnName = "idrecruitment")
    private Recruitment recruitmentByRecruitmentId;
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "iduser")
    private User userByUserId;

    public int getIdsaveJob() {
        return idsaveJob;
    }

    public void setIdsaveJob(int idsaveJob) {
        this.idsaveJob = idsaveJob;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SaveJob saveJob = (SaveJob) o;
        return idsaveJob == saveJob.idsaveJob && Objects.equals(recruitmentId, saveJob.recruitmentId) && Objects.equals(userId, saveJob.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idsaveJob, recruitmentId, userId);
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
