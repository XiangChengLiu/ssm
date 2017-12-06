package cn.liu.service.Impl;

import cn.liu.bean.User;
import cn.liu.dao.IUserDao;
import cn.liu.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.xml.ws.ServiceMode;

@Service("userService")
public class UserServiceImpl implements IUserService{
    @Autowired
    IUserDao userDao;
    public User selectUser(long userId) {
        User user=this.userDao.selectUser(userId);
        return user;
    }
}
