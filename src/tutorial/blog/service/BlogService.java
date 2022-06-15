package tutorial.blog.service;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

import tutorial.blog.dao.BlogMemoryDao;
import tutorial.blog.entity.BlogPost;

public class BlogService {
	private BlogMemoryDao dao;

	public BlogService() {
	}

	public BlogService(BlogMemoryDao blogMemoryDao) {
		super();
		this.dao = blogMemoryDao;
	}

	public Map<String, String> process(String cmd) {
		// TODO Auto-generated method stub
		Map<String, String> model = new HashMap<String, String>();
		model.put("service", this.getClass().getName());
	
		if(!cmd.contains("?")) {
			if( cmd.equals("post/") ) {
				recentPostOne(model);
			}else if( cmd.equals("post/list") ) {
				getPostAll(model);
			}else if( cmd.equals("category/list") ) {
				getCategoryAll(model);
			}else {
				model.put("404","Not Found");
			}
		}else {
			//has query string
			//delimeter is a specified letter to split
		
			String[] req = cmd.split("\\?");
			if( req.length == 2 ) {
				// string -> map<string,string>
				String[] parameters = req[1].split("&");
				for(String elm : parameters) {
					String[] pair = elm.split("=");
					model.put(pair[0], pair[1]);
				}
				// dispatch method
				if( req[0].equals("post/add") ) {
					registPost(model);
				}
				if( req[0].equals("post/search") ) {
					getPostByString(model);
					getPostWithCategory(model);
				}
				if( req[0].equals("post/view") ) {
					getPostById(model);
				}
				if( req[0].equals("post/update") ) {
					updatePost(model);
				}
				if( req[0].equals("post/delete") ) {
					deletePost(model);
				}
				if( req[0].equals("category/add") ) {
					registCategory(model);
				}
				if( req[0].equals("category/search") ) {
					getCategoryByString(model);
					getCategoryWithCategory(model);
				}
				if( req[0].equals("category/view") ) {
					getCategoryById(model);
				}
				if( req[0].equals("category/update") ) {
					updateCategory(model);
				}
				if( req[0].equals("category/delete") ) {
					deleteCategory(model);
				}
			}else {
				model.put("400","Bad Request : need paramter");
			}
		}// end else
		
	   return model;
	}

	private void recentPostOne(Map<String, String> model) {
		// TODO Auto-generated method stub
		// get from DAO
		BlogPost post = dao.findLastPost();
		if(post == null) {
			model.put("data", " have no post");
		}else {
			model.put("data", post.toString());
		}
		model.put("msg", new Object() {}.getClass().getEnclosingClass().getName());
	}

	private void deleteCategory(Map<String, String> model) {
		// TODO Auto-generated method stub
		model.put("msg", new Object() {}.getClass().getEnclosingMethod().getName());

	}

	private void updateCategory(Map<String, String> model) {
		// TODO Auto-generated method stub
		model.put("msg", new Object() {}.getClass().getEnclosingMethod().getName());

	}

	private void getCategoryByString(Map<String, String> model) {
		// TODO Auto-generated method stub
		model.put("msg", new Object() {}.getClass().getEnclosingMethod().getName());

	}

	private void getCategoryWithCategory(Map<String, String> model) {
		// TODO Auto-generated method stub

	}

	private void getCategoryById(Map<String, String> model) {
		// TODO Auto-generated method stub

	}

	private void getCategoryAll(Map<String, String> model) {
		// TODO Auto-generated method stub

	}

	private void registCategory(Map<String, String> model) {
		// TODO Auto-generated method stub

	}

	private void deletePost(Map<String, String> model) {
		// TODO Auto-generated method stub

	}

	private void updatePost(Map<String, String> model) {
		// TODO Auto-generated method stub

	}

	private void getPostByString(Map<String, String> model) {
		// TODO Auto-generated method stub

	}

	private void getPostWithCategory(Map<String, String> model) {
		// TODO Auto-generated method stub

	}

	private void getPostById(Map<String, String> model) {
		// TODO Auto-generated method stub
		model.put("msg", new Object() {}.getClass().getEnclosingClass().getName());

	}

	private void getPostAll(Map<String, String> model) {
		// TODO Auto-generated method stub
		model.put("msg", new Object() {}.getClass().getEnclosingClass().getName());

	}

	private void registPost(Map<String, String> model) {
		// TODO Auto-generated method stub
		BlogPost post = new BlogPost();
		if( model.get("title") != null && model.get("article") != null ) {
			post.setTitle(model.get("title"));
			post.setArticle(model.get("article"));
			dao.save(post);
		}
		model.put("msg", new Object() {}.getClass().getEnclosingClass().getName());
        //dao.save(post);
	}

}
