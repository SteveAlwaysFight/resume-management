package com.baanyan.user_information.controller;

import com.baanyan.common.log.ControllerLog;
import com.baanyan.user_information.dto.CreateUserInformationRequest;
import com.baanyan.user_information.dto.UserInformationResponse;
import com.baanyan.user_information.model.UserInformation;
import com.baanyan.user_information.service.UserInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by steve on 3/1/16.
 */
@Controller
public class UserInformationController {

    @Autowired
    UserInformationService userInformationService;


    @RequestMapping(value = "/user_infos/{user_id}",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserInformationResponse> getUserInformation(@PathVariable("user_id") String user_id){
        return new ResponseEntity<UserInformationResponse>(new UserInformationResponse(userInformationService.get(user_id)), HttpStatus.OK);
    }


    @ControllerLog(description = "create user information")
    @RequestMapping(value = "/user_infos/{user_id}",method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserInformationResponse> createUserInformation(@PathVariable("user_id") String user_id,@RequestBody CreateUserInformationRequest request){
        System.out.println("zhe ge fang fa zheng zai jinxing");
        UserInformation userInformation =userInformationService.createUserInformation(user_id, request);
        return new ResponseEntity<UserInformationResponse>(new UserInformationResponse(userInformation), HttpStatus.OK);
    }
}
