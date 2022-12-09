package test;

import service.IUserService;
import service.impl.UserServiceImpl;

public class NoSpringFrameworkTest {


    public static void main(String[] args) {
        IUserService userService = new UserServiceImpl();
        userService.getUser();
    }
}
