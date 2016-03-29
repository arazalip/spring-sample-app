package com.gsk.gi.model;


import javax.persistence.*;
import java.util.List;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@Table(name = "users")
public class User {

    @Id
    @Column(name = "username")
    protected String username;

    @Column(name = "first_name")
    protected String firstName;

    @Column(name = "last_name")
    protected String lastName;

    @Column(name = "password")
    protected String password;

    @Column(name = "email")
    protected String email;

    @Column(name = "phone")
    protected String phone;

    @Column(name = "enabled")
    protected Boolean enabled;

    @ElementCollection
    @CollectionTable(name = "authorities", joinColumns = @JoinColumn(name="username"))
    @Column(name = "authority")
    protected List<String> authorities;

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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public List<String> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(List<String> authorities) {
        this.authorities = authorities;
    }
}
