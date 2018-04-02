package com.epam.rd.data.access.domain;

import javax.persistence.*;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "users")
public class User implements Serializable {

    public User() {
    }

    public User(String email, String password, Boolean enabled, UserRole userRole, String firstName, String lastName, Date birthday, String city, Boolean gender, String mobilePhone) {
        this.email = email;
        this.password = password;
        this.enabled = enabled;
        this.userRole = userRole;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.city = city;
        this.gender = gender;
        this.mobilePhone = mobilePhone;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private String email;

    @Column
    private String password;

    @Column
    private Boolean enabled;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id")
    private UserRole userRole;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column
    private Date birthday;

    @Column
    private String city;

    @Column
    private Boolean gender;

    @Column(name = "mobile_phone")
    private String mobilePhone;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", enabled=" + enabled +
                ", userRole=" + userRole +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthday=" + birthday +
                ", city='" + city + '\'' +
                ", gender=" + gender +
                ", mobilePhone='" + mobilePhone + '\'' +
                '}';
    }
}


