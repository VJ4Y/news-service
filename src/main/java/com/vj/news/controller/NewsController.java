package com.vj.news.controller;

import java.util.Date;
import java.util.List;

import javax.print.attribute.standard.DateTimeAtCompleted;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vj.news.domain.NewsDetail;
import com.vj.news.service.impl.NewsServiceImpl;

@RestController
public class NewsController {
	@Autowired
	NewsServiceImpl NewsService;

	Logger logger = LoggerFactory.getLogger(NewsController.class);

	@GetMapping("/hello")
	String hello() {
		logger.trace("A TRACE Message");
		logger.debug("A DEBUG Message");
		logger.info("An INFO Message");
		logger.warn("A WARN Message");
		logger.error("An ERROR Message");
//        if (true)return NewsService.getAll().toString();
		return "Vijay";
	}

	@GetMapping("/getAllNews")
	List<NewsDetail> getAllNews() {
		return NewsService.getAll();

	}

	@GetMapping("/getNewsByFilters")
	List<NewsDetail> getNewsByFilters(
			@RequestParam(required = false) @DateTimeFormat(pattern="dd-MM-yyyy") Date publishedFromDate,
			@RequestParam(required = false) @DateTimeFormat(pattern="dd-MM-yyyy") Date publishedToDate, 
			@RequestParam(defaultValue = "GENE") String category,
			@RequestParam(required = false) String city) {
		return NewsService.getNewsByFilters(publishedFromDate, publishedToDate, category, city);
	}
}
