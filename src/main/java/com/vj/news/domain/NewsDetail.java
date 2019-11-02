package com.vj.news.domain;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "t_news_details")
public class NewsDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer newsId;
	private String title;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "category")
	private NewsCategory category;
	
	private String content;
	private String city;
	
	@Enumerated(EnumType.STRING)
	private NewsStatus status;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "created_by")
	private UserDetail createdBy;

	@Column(name = "ts_created")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
	private Date createdAt;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "published_by")
	private UserDetail publishedBy;
	
	@Column(name = "ts_published")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
	private Date publishedAt;
	
	public Integer getNewsId() {
		return newsId;
	}
	public NewsCategory getCategory() {
		return category;
	}

	public String getTitle() {
		return title;
	}
	public String getContent() {
		return content;
	}
	public String getCity() {
		return city;
	}
	public NewsStatus getStatus() {
		return status;
	}
	public UserDetail getCreatedBy() {
		return createdBy;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public UserDetail getPublishedBy() {
		return publishedBy;
	}
	public Date getPublishedAt() {
		return publishedAt;
	}
	
}
