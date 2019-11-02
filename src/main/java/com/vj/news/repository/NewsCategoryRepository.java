package com.vj.news.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.vj.news.domain.NewsCategory;

@CrossOrigin
@RepositoryRestResource
public interface NewsCategoryRepository extends JpaRepository<NewsCategory, String>{

}
