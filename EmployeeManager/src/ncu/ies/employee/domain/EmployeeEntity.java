package ncu.ies.employee.domain;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "employee", schema = "employeemanager", catalog = "")
public class EmployeeEntity {
    private int eid;
    private String ename;
    private Date birth;
    private String address;
    private Date participationDate;
    private String tele;
    private int technicalLevel;
    private int monthlySalary;
    private String username;
    private String password;

    @Id
    @Column(name = "eid")
    //@GeneratedValue(strategy=GenerationType.IDENTITY)
    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    @Basic
    @Column(name = "ename")
    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    @Basic
    @Column(name = "birth")
    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "participation_date")
    public Date getParticipationDate() {
        return participationDate;
    }

    public void setParticipationDate(Date participationDate) {
        this.participationDate = participationDate;
    }

    @Basic
    @Column(name = "tele")
    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }

    @Basic
    @Column(name = "technical_level")
    public int getTechnicalLevel() {
        return technicalLevel;
    }

    public void setTechnicalLevel(int technicalLevel) {
        this.technicalLevel = technicalLevel;
    }

    @Basic
    @Column(name = "monthly_salary")
    public int getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeEntity that = (EmployeeEntity) o;
        return eid == that.eid &&
                technicalLevel == that.technicalLevel &&
                monthlySalary == that.monthlySalary &&
                Objects.equals(ename, that.ename) &&
                Objects.equals(birth, that.birth) &&
                Objects.equals(address, that.address) &&
                Objects.equals(participationDate, that.participationDate) &&
                Objects.equals(tele, that.tele) &&
                Objects.equals(username, that.username) &&
                Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eid, ename, birth, address, participationDate, tele, technicalLevel, monthlySalary, username, password);
    }
}
