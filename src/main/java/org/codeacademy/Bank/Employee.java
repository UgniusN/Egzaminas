package org.codeacademy.Bank;

import java.util.Date;

public class Employee {
    public Employee(String personalCode, String name, String lastname, Date worksFrom, Date birthDate, String occupation, String department, Integer projectId) {
        this.personalCode = personalCode;
        this.name = name;
        this.lastname = lastname;
        this.worksFrom = worksFrom;
        this.birthDate = birthDate;
        this.occupation = occupation;
        this.department = department;
        this.projectId = projectId;
    }

    public String getPersonalCode() {
        return personalCode;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public Date getWorksFrom() {
        return worksFrom;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getOccupation() {
        return occupation;
    }

    public String getDepartment() {
        return department;
    }

    public Integer getProjectId() {
        return projectId;
    }

    private String personalCode;
    private String name;
    private String lastname;
    private Date worksFrom;
    private Date birthDate;
    private String occupation;
    private String department;
    private Integer projectId;
}
