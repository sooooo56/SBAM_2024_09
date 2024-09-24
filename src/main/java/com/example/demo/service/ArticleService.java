package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dao.ArticleDao;
import com.example.demo.vo.Article;

@Service
public class ArticleService {

	private ArticleDao articleDao;
	
	public ArticleService(ArticleDao articleDao) {
		this.articleDao = articleDao;
	}
	
	public Article writeArticle(String title, String body) {
		return this.articleDao.writeArticle(title, body);
	}
	
	public void modifyArticle(Article foundArticle, String title, String body) {
		this.articleDao.modifyArticle(foundArticle, title, body);
	}
	
	public void deleteArticle(Article foundArticle) {
		this.articleDao.deleteArticle(foundArticle);
	}
	
	public Article getArticleById(int id) {
		return this.articleDao.getArticleById(id);
	}

	public List<Article> getArticles() {
		return this.articleDao.getArticles();
	}
}