import java.io.FileNotFoundException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.UserService;

public class UserTest {
	public static void main(String[] aa) throws FileNotFoundException {
		ApplicationContext cxt = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		 UserService us = cxt.getBean(UserService.class);
		us.saveUser(1, "zhangsan");
	}
}