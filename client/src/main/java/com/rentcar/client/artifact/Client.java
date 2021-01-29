package com.rentcar.client.artifact;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "CLIENT")
public class Client {
    @Id
    @GeneratedValue
    private int id;
    private int age;
    private Date birthdate;
    private int phone;
    private int licenseNumber;
    private String name;
    private String lastname;
    private String adress;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(int licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Client() {

    }

    public Client(int id, int age, Date birthdate, int phone, int licenseNumber, String name, String lastname, String adress) {
        this.id = id;
        this.age = age;
        this.birthdate = birthdate;
        this.phone = phone;
        this.licenseNumber = licenseNumber;
        this.name = name;
        this.lastname = lastname;
        this.adress = adress;
    }
}
