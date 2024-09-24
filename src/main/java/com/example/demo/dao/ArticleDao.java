package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.vo.Article;

@Component
public class ArticleDao {
	private int lastArticleId;
	private List<Article> articles;
	
	public ArticleDao() {
		this.lastArticleId = 0;
		this.articles = new ArrayList<>();
		
		makeTestData();
	}
	
	private void makeTestData() {
		for (int i = 1; i <= 10; i++) {
			String title = "제목" + i;
			String body = "내용" + i;
			
			writeArticle(title, body);
		}
	}

	public Article writeArticle(String title, String body) {
		Article article = new Article(++lastArticleId, title, body);
		this.articles.add(article);
		return article;
	}

	public void modifyArticle(Article foundArticle, String title, String body) {
		foundArticle.setTitle(title);
		foundArticle.setBody(body);
	}

	public void deleteArticle(Article foundArticle) {
		this.articles.remove(foundArticle);
	}

	public Article getArticleById(int id) {
		for (Article article : this.articles) {
			if (article.getId() == id) {
				return article;
			}
		}
		return null;
	}

	public List<Article> getArticles() {
		return this.articles;
	}
}