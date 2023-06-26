package com.genpact.copilot.userregistration.model;

// Create class for User with all the fields and a default constructor.
// Create the default getters and setters for all the fields.
// Create a toString() method.
// Create equals method
// Create hashCode method
// Create a method to return the user object as a JSON string.

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "user_id")
    public long userId;
    @Column(name = "user_name")
    public String userName;
    @Column(name = "user_password")
    public String userPassword;
    @Column(name = "user_email")
    public String userEmail;
    @Column(name = "user_phone")
    public String userPhone;
    @Column(name = "user_address")
    public String userAddress;
    @Column(name = "user_dob")
    public String userDOB;
    @Column(name="user_gender")
    public String userGender;
    @Column(name="user_role")
    public String userRole;

    public User() {
    }

    public User(long userId, String userName, String userPassword, String userEmail,
                String userPhone, String userAddress, String userDOB, String userGender, String userRole) {
        super();
        this.userId = userId;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userEmail = userEmail;
        this.userPhone = userPhone;
        this.userAddress = userAddress;
        this.userDOB = userDOB;
        this.userGender = userGender;
        this.userRole = userRole;
    }

    @Override
    public String toString() {
        return "User [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword
                + ", userEmail=" + userEmail + ", userPhone=" + userPhone + ", userAddress=" + userAddress
                + ", userDOB=" + userDOB + ", userGender=" + userGender + ", userRole=" + userRole + "]";
    }

    @Override
    public boolean equals(Object obj) {
        User user = (User) obj;
        return this.userId == user.userId && this.userName == user.userName
                && this.userPassword == user.userPassword
                && this.userEmail == user.userEmail && this.userPhone == user.userPhone && this.userAddress == user.userAddress && this.userDOB == user.userDOB && this.userGender == user.userGender && this.userRole == user.userRole;

    }
}