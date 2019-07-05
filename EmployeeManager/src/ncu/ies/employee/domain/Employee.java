package ncu.ies.employee.domain;

import java.util.Date;

public class Employee {
    private int eid;//员工编号
    private String ename;//员工姓名
    private Date birth;//出生日期
    private String address;//住址
    private Date participation_date;//参加工作时间
    private String tele;//电话
    private int technical_level;//技术等级
    private int monthly_salary;//月薪
    private String username;//用户名
    private String password;//密码

    public int getEid() {
        return eid;
    }

    public String getEname() {
        return ename;
    }

    public Date getBirth() {
        return birth;
    }

    public String getAddress() {
        return address;
    }

    public Date getParticipation_date() {
        return participation_date;
    }

    public String getTele() {
        return tele;
    }

    public int getTechnical_level() {
        return technical_level;
    }

    public int getMonthly_salary() {
        return monthly_salary;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setParticipation_date(Date participation_date) {
        this.participation_date = participation_date;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }

    public void setTechnical_level(int technical_level) {
        this.technical_level = technical_level;
    }

    public void setMonthly_salary(int monthly_salary) {
        this.monthly_salary = monthly_salary;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
