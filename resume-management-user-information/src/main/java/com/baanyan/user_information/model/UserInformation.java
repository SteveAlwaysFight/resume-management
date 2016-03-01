package com.baanyan.user_information.model;

import com.baanyan.common.model.User;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Created by steve on 2/29/16.
 */
@Entity
@Table(name = "user_information")
public class UserInformation extends com.baanyan.common.model.BaseEntity {
    @OneToOne
    private User user;

    private String firstName;
    private String lastName;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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
}
