package dao.impl;

import dao.IUserDao;
import entity.User;

public class UserDaoOracleImpl implements IUserDao {
    @Override
    public User getUser() {
        User user = new User();
        user.setId(1);
        user.setUsername("John");
        return user;
    }
}
