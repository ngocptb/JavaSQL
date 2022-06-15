package tutorial.blog.entity;

import java.sql.Timestamp;

//ê²Œì‹œê¸€ 
public class BlogPost {

	// ê²Œì‹œê¸€ ì•„ì�´ë””
	private Integer id;

	// ê²Œì‹œê¸€ ì œëª©
	private String title;

	// ê²Œì‹œê¸€ ë‚´ìš©
	private String article;

	// ìˆ˜ì •ë�œ ê²Œì‹œê¸€ ì œëª©
	private String titleClean;

	// ì²¨ë¶€ íŒŒì�¼
	private String file;

	// ì €ìž� ì•„ì�´ë”” ì €ìž� ë¯¸ìƒ� í�¬ìŠ¤íŠ¸ ê°€ëŠ¥
	private Integer authorId;

	// ê³µê°œ ì�¼ìž�
	private Timestamp datePublished;

	// ê´‘ê³  ì�´ë¯¸ì§€
	private String bannerImage;

	// íŠ¹ì§•
	private Boolean featured;

	// í™œì„±í™” ì—¬ë¶€
	private Boolean enabled;

	// ëŒ“ê¸€ ê°€ëŠ¥ ì—¬ë¶€
	private Boolean commentsEnabled;

	// ì�½ì�€ íšŸìˆ˜
	private Integer views;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
	
			return title;
		
	}

	public void setTitle(String title) {
		if (title == null) {
			this.title = "";
		} else {
			this.title = title;
		}
	}

	public String getArticle() {
		return article;
	}

	public void setArticle(String article) {
		this.article = article;
	}

	public String getTitleClean() {
		return titleClean;
	}

	public void setTitleClean(String titleClean) {
		this.titleClean = titleClean;
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public Integer getAuthorId() {
		return authorId;
	}

	public void setAuthorId(Integer authorId) {
		this.authorId = authorId;
	}

	public Timestamp getDatePublished() {
		return datePublished;
	}

	public void setDatePublished(Timestamp datePublished) {
		this.datePublished = datePublished;
	}

	public String getBannerImage() {
		return bannerImage;
	}

	public void setBannerImage(String bannerImage) {
		this.bannerImage = bannerImage;
	}

	public Boolean getFeatured() {
		return featured;
	}

	public void setFeatured(Boolean featured) {
		this.featured = featured;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public Boolean getCommentsEnabled() {
		return commentsEnabled;
	}

	public void setCommentsEnabled(Boolean commentsEnabled) {
		this.commentsEnabled = commentsEnabled;
	}

	public Integer getViews() {
		return views;
	}

	public void setViews(Integer views) {
		this.views = views;
	}
	public void CopyData(BlogPost param) {
		this.id = param.getId();
		this.title = param.getTitle();
		this.article = param.getArticle();
		this.titleClean = param.getTitleClean();
		this.file = param.getFile();
		this.authorId = param.getAuthorId();
		this.datePublished = param.getDatePublished();
		this.bannerImage = param.getBannerImage();
		this.featured = param.getFeatured();
		this.enabled = param.getEnabled();
		this.commentsEnabled = param.getCommentsEnabled();
		this.views = param.getViews();
	}

	// BlogPost Copy model
	@Override
	public String toString() {
		return "BlogPost {id:" + id + ", title=" + title + ", article=" + article + "}";
	}
}