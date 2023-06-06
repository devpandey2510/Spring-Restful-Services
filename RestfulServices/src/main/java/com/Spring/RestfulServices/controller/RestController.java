package com.Spring.RestfulServices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;

import com.Spring.RestfulServices.entity.Facebookuser;
import com.Spring.RestfulServices.exception.UserNotFoundException;
import com.Spring.RestfulServices.service.FacebookServiceInterface;

import oracle.net.aso.f;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@Autowired
	private FacebookServiceInterface fs;

	@GetMapping("viewprofile/{id}")
	public Facebookuser view(@PathVariable("id") String em) throws UserNotFoundException {
		try {
			return fs.viewprofileService(em);
			
		}
		catch (UserNotFoundException e) {
			throw e;
		}
	}
	
	@GetMapping("viewallprofile")
	public List<Facebookuser> viewall() {
		return fs.viewallService();
	}
	
	@PostMapping("CreateProfile")
	public String Create(@RequestBody Facebookuser fb) {
		fs.createprofile(fb);
		 return "created your profile";
	}
	
	@DeleteMapping("DeleteProfile/{em}")
	public String Delete(@PathVariable("em") String email) {
		fs.deletprofile(email);
		return "deleted your profile";
	}
	
	@PutMapping("Editprofile/{em}")
	public String Edit(@PathVariable("em") String email,@RequestBody Facebookuser fb) {
		fb.setEmail(email);
		fs.eidtprofile(fb);
		 return "Edit your profile";
	}
}
