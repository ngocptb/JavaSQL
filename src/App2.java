import java.util.Scanner;

import tutorial.blog.dao.BlogMemoryDao;
import tutorial.blog.service.BlogService;

/**
 * @suthor Jadepham
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
		}while( !"exist".equals(cmd));
		System.out.println("Terminated !");
		sc.close();
	}

}
