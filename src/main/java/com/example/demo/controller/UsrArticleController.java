package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.vo.Article;


@Controller
public class UsrArticleController {
	private int lastArticleId;
	private List<Article> articles;
	
	public UsrArticleController() {
		this.lastArticleId = 0;
		this.articles = new ArrayList<>();
	}
	
	@GetMapping("/usr/article/doWrite")
	@ResponseBody
	public Article doWrite(String title, String body) {
		Article article = new Article(++lastArticleId, title, body);
		this.articles.add(article);
		
		return article;
	}
	
	@GetMapping("/usr/article/showList")
	@ResponseBody
	public List<Article> list() {
		
		return this.articles;
	}
	
}

//http://localhost:8080/usr/article/showList