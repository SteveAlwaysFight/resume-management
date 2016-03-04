package com.baanyan.user_resume.service;

import com.baanyan.common.service.IBaseGenericService;
import com.baanyan.user_resume.dto.CreateUserResumeRequest;
import com.baanyan.user_resume.model.UserResume;
/**
 * Create by Bowen Yao at 3/1/2016
 */
public interface UserResumeService extends IBaseGenericService<UserResume, String>{
	UserResume createUserResume(String user_id,CreateUserResumeRequest request);
}
