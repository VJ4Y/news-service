package com.vj.news.domain;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_news_category")
@Embeddable
public class NewsCategory {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String categoryCode;
	private String CategoryName;

	public String getCategoryCode() {
		return categoryCode;
	}

	public String getCategoryName() {
		return CategoryName;
	}

}
