package com.vj.news.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.vj.news.domain.UserDetail;

@CrossOrigin
@RepositoryRestResource
public interface UserDetailRepository extends JpaRepository<UserDetail, Integer>{

}
