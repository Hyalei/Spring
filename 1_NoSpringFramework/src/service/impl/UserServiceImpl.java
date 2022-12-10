package service.impl;

import dao.IUserDao;
import dao.impl.UserDaoMysqlImpl;
import dao.impl.UserDaoOracleImpl;
import service.IUserService;

public class UserServiceImpl implements IUserService {

    IUserDao dao = new UserDaoOracleImpl();

//    IUserDao dao = new UserDaoMysqlImpl();

    @Override
    public void getUser() {
        System.out.println(dao.getUser());
    }
}
