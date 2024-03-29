package com.vj.news.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
		return "Vijay";
	}
	
	@GetMapping("/hello1")
	String hello1() {
		return "Vijay1";
		
	}
}
