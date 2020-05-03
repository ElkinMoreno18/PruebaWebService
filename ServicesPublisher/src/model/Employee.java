package model;

import java.math.BigDecimal;
import java.util.Date;

public class Employee {

    private String name;
    private String lastName;
    private long document;
    private String address;
    private BigDecimal phone;
    private Date birthday;
    private String email;

    public Employee() {

    }

    public Employee(String name, String lastName, long document, String address, BigDecimal phone, Date birthday, String email) {
        this.name = name;
        this.lastName = lastName;
        this.document = document;
        this.address = address;
        this.phone = phone;
        this.birthday = birthday;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getDocument() {
        return document;
    }

    public void setDocument(long document) {
        this.document = document;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BigDecimal getPhone() {
        return phone;
    }

    public void setPhone(BigDecimal phone) {
        this.phone = phone;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
