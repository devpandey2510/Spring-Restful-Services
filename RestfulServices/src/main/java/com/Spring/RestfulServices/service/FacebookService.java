package com.Spring.RestfulServices.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.RestfulServices.Dao.FacebookDaoInterface;
import com.Spring.RestfulServices.entity.Facebookuser;
import com.Spring.RestfulServices.exception.UserNotFoundException;

@Service
@Transactional
public class FacebookService implements FacebookServiceInterface{

	@Autowired
	private FacebookDaoInterface fd;

	
	public void createprofile(Facebookuser fb) {
		fd.save(fb);
		
	}

	public List<Facebookuser> viewallService() {
		// TODO Auto-generated method stub
		return fd.findAll();
	}

	
	public Facebookuser viewprofileService(String em)throws UserNotFoundException {
	
		Optional<Facebookuser> ff = fd.findById(em);
		if (ff.isPresent()) {
			Facebookuser d = ff.get();
			return d;	
		}
		else {
			throw new UserNotFoundException("user is not valid exception");
		}
		
	}

	
	public void eidtprofile(Facebookuser fb) {
		fd.saveAndFlush(fb);
		
	}

	public void deletprofile(String email) {
		// TODO Auto-generated method stub
        fd.deleteById(email);		
	}
	
}
