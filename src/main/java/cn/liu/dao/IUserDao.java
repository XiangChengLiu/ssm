package cn.liu.dao;

import cn.liu.bean.User;

public interface IUserDao {
    User selectUser(long id);
}
