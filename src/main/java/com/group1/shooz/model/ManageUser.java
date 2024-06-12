package com.group1.shooz.model;

import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class ManageUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    @Column(name = "user_email")
    private String userEmail;
    @Column(name = "user_password")
    private String userPassword;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "user_phone")
    private String userPhone;
    @Column(name = "user_address")
    private String userAddress;
    @ManyToOne
    @JoinColumn(name = "fk_admin_id", referencedColumnName = "adminId")
    private ManageAdmin admin;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public ManageAdmin getAdmin() {
        return admin;
    }

    public void setAdmin(ManageAdmin admin) {
        this.admin = admin;
    }
}
