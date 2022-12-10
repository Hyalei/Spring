package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.IUserService;

public class UsingSpringFrameworkTest {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        IUserService iUserService = context.getBean(IUserService.class);
        iUserService.getUser();
    }
}
