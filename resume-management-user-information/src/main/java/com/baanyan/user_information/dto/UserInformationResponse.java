package com.baanyan.user_information.dto;

import com.baanyan.user_information.model.UserInformation;

/**
 * Created by steve on 3/1/16.
 */
public class UserInformationResponse {
    private String firstName;
    private String lastName;

    public UserInformationResponse(UserInformation userInformation) {
        this.firstName = userInformation.getFirstName();
        this.lastName = userInformation.getLastName();

    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
