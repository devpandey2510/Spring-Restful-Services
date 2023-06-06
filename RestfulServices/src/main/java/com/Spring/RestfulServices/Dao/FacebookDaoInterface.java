package com.Spring.RestfulServices.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Spring.RestfulServices.entity.Facebookuser;

@Repository
public interface FacebookDaoInterface extends JpaRepository<Facebookuser, String>{

}
