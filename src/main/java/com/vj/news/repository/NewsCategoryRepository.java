package com.vj.news.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vj.news.domain.NewsCategory;

public interface NewsCategoryRepository extends JpaRepository<NewsCategory, String>{

}
