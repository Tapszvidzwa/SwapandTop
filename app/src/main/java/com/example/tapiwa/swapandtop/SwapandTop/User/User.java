package com.example.tapiwa.swapandtop.SwapandTop.User;

/**
 * Created by tapiwa on 1/10/18.
 */

public class User {

    String firstName;
    String lastName;
    String phoneNumber;
    String uid;
    String emailAddress;
    String homeAddress;

    public User() {
    }

    public User(String firstName, String lastName, String phoneNumber, String uid) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.uid = uid;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getUid() {
        return uid;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

}
