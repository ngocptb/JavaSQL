import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import tutorial.blog.dao.BlogMemoryDao;
import tutorial.blog.service.BlogService;

/**
 * @author Jade
 */
import tutorial.blog.service.BlogService;

public class App2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BlogService();
		// dependency injection
		App2.run(new BlogService(new BlogMemoryDao()));

	}
	public static void run(BlogService service) {
		Scanner sc = new Scanner(System.in);
		String cmd;
		do {
			System.out.println("cmd >");
			cmd = sc.nextLine();
			Map<String, String> map= service.process(cmd);
			
			Set<String> keys = map.keySet();
			// enhanced for
			for(String key: keys) {
				System.out.println(key +":" + map.get(key));
			}
			
			
			}while( !"exist".equals(cmd));
		System.out.println("Terminated !");
		sc.close();
	}

}
