package com.Spring.RestfulServices.service;

import java.util.List;

import com.Spring.RestfulServices.entity.Facebookuser;
import com.Spring.RestfulServices.exception.UserNotFoundException;

public interface FacebookServiceInterface {

	void createprofile(Facebookuser fb);

	List<Facebookuser> viewallService();

	Facebookuser viewprofileService(String em) throws UserNotFoundException;

	void eidtprofile(Facebookuser fb);

	void deletprofile(String email);

}
