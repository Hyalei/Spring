package service.impl;

import dao.IUserDao;
import service.IUserService;

public class UserServiceImpl implements IUserService {

    IUserDao userMapper;

    public IUserDao getUserMapper() {
        return userMapper;
    }

    public void setUserMapper(IUserDao userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public void getUser() {
        System.out.println(userMapper.getUser());
    }
}
