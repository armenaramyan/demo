package com.test.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "demo_users")
public class DemoUsers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "demo_address_id")
    private DemoAddress demoAddress;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public DemoAddress getDemoAddress() {
        return demoAddress;
    }

    public void setDemoAddress(DemoAddress demoAddress) {
        this.demoAddress = demoAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DemoUsers demoUsers = (DemoUsers) o;
        return id == demoUsers.id && Objects.equals(name, demoUsers.name) && Objects.equals(email, demoUsers.email) && Objects.equals(demoAddress, demoUsers.demoAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, demoAddress);
    }

    @Override
    public String toString() {
        return "DemoUsers{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", demoAddress=" + demoAddress +
                '}';
    }
}
