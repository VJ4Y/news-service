package com.vj.news.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vj.news.domain.NewsCategory;
import com.vj.news.domain.NewsDetail;
import com.vj.news.repository.NewsCategoryRepository;
import com.vj.news.repository.NewsRepository;

@Service
public class NewsServiceImpl {
	@Autowired
	private NewsRepository newsRepository;
	
	@Autowired
	private NewsCategoryRepository newsCategoryRepository;
	
	public List<NewsDetail> getAll(){
		return (List<NewsDetail>) newsRepository.findAll();
	}
	
	public List<NewsDetail> getNewsByFilters(Date publishedFromDate, Date publishedToDate, String category, String city){
		NewsCategory newsCategory=newsCategoryRepository.findById(category).get();
		if (publishedFromDate!=null) return newsRepository.findAllByCategoryAndPublishedAtAfter(newsCategory,publishedFromDate);
		return newsRepository.findAllByCategory(newsCategory);
	}
}
