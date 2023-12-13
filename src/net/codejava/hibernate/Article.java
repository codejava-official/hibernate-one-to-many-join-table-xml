package net.codejava.hibernate;

public class Article {
	private long id;
	private String title;
	private String description;
	private String keywords;
	private String content;

	private Category category;
	
	public Article() {
	}

	public Article(String title, String description, String keywords,
			String content, Category category) {
		this.title = title;
		this.description = description;
		this.keywords = keywords;
		this.content = content;
		this.category = category;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

}
