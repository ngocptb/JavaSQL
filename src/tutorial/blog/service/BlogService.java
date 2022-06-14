package tutorial.blog.service;

import tutorial.blog.dao.BlogMemoryDao;


public class BlogService {
	    private BlogMemoryDao dao;
	    public BlogService() {}
        public BlogService(BlogMemoryDao blogMemoryDao) {
        	super();
        	this.dao = blogMemoryDao;
        }
     
}
