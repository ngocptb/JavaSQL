package tutorial.blog.dao;
import tutorial.blog.entity.BlogPost;

import java.util.ArrayList;
import java.util.List;

import tutorial.blog.entity.BlogCategory;
/**
 * data store in memory
 * DAO has method
 * Create : new data store
 * Read(Retrieve): get data, view, search
 * Update: change data value
 * Delete: remove data
 * @author Jade
 *
 */

public class BlogMemoryDao {
	private List<BlogPost> postRepo;
	private List<BlogCategory> cateRepo;
	
	public BlogMemoryDao() {
		super();
		postRepo = new ArrayList<BlogPost>();
		cateRepo = new ArrayList<BlogCategory>();
	}
	public void save(BlogPost post) {
		// auto-increment: id have to be unique
		post.setId(postRepo.size() + 1);
		postRepo.add(post);
	}
	public BlogPost findLastPost() {
		// TODO 1 List can have same data, 2. need to override equal
		
		return postRepo.get(postRepo.size()-1);
	}
 
}
