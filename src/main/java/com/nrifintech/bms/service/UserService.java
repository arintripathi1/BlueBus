package com.nrifintech.bms.service;

import com.nrifintech.bms.entity.User;
import com.nrifintech.bms.request.UserLoginRequest;

/**
 * @author	Debopam
 * @email	debpal07@gmail.com
 * @created	Nov 9, 2021
 */
public interface UserService extends AbstractBaseService<User, Long> {
	public boolean isValidUser(UserLoginRequest userLoginRequest);
}
