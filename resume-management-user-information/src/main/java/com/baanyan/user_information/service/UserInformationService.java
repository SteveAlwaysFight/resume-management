package com.baanyan.user_information.service;

import com.baanyan.user_information.dto.CreateUserInformationRequest;
import com.baanyan.user_information.model.UserInformation;

/**
 * Created by steve on 3/1/16.
 */
public interface UserInformationService extends com.baanyan.common.service.IBaseGenericService<UserInformation,String> {
    UserInformation createUserInformation(String user_id,CreateUserInformationRequest request);
}
