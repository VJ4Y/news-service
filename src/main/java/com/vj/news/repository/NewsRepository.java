package com.vj.news.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.vj.news.domain.NewsCategory;
import com.vj.news.domain.NewsDetail;

@CrossOrigin
@RepositoryRestResource
public interface NewsRepository extends JpaRepository<NewsDetail, Integer>{
	List<NewsDetail> findAllByCategory(NewsCategory category);
	List<NewsDetail> findAllByCategoryAndPublishedAtAfter(NewsCategory newsCategory, Date publishedFromDate);
}
