package com.baanyan.user_information.dao;

import com.baanyan.common.dao.IBaseGenericDAO;
import com.baanyan.user_information.model.UserInformation;

/**
 * Created by steve on 3/1/16.
 */
public interface UserInformationDao extends IBaseGenericDAO<UserInformation,String> {
    UserInformation getUserInformationByUserId(String user_id);
}
