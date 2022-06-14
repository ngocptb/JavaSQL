package tutorial.blog.entity;


	// 게시글 카테고리 
public class BlogPostTocategory {

	    // 카테고리 아이디 
	    private Integer categoryId;

	    // 게시글 아이디 
	    private Integer postId;

	    public Integer getCategoryId() {
	        return categoryId;
	    }

	    public void setCategoryId(Integer categoryId) {
	        this.categoryId = categoryId;
	    }

	    public Integer getPostId() {
	        return postId;
	    }

	    public void setPostId(Integer postId) {
	        this.postId = postId;
	    }

	    // BlogPostToCategory Copy model
	    public void CopyData(BlogPostTocategory param)
	    {
	        this.categoryId = param.getCategoryId();
	        this.postId = param.getPostId();
	    }
	}
