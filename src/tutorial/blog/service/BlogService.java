package tutorial.blog.service;

import java.util.HashMap;
import java.util.Map;

import tutorial.blog.dao.BlogMemoryDao;


public class BlogService {
	    private BlogMemoryDao dao;
	    public BlogService() {}
        public BlogService(BlogMemoryDao blogMemoryDao) {
        	super();
        	this.dao = blogMemoryDao;
        }
		public Map<String, String> process(String cmd) {
			// TODO Auto-generated method stub
			Map<String, String> model = new HashMap<String, String>();
			model.put("key1", null);
			model.put("key2", null);
			model.put("key3", null);
			//registPost(model);
			return model;
		}
     
}
