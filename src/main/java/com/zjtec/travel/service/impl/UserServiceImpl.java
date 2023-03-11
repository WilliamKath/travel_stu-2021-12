package com.zjtec.travel.service.impl;

import com.zjtec.travel.dao.UserDao;
import com.zjtec.travel.domain.User;
import com.zjtec.travel.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zjtec.travel.util.*;

@Service
public class UserServiceImpl implements UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserDao userDao;

    @Override
    public boolean validUserPwd(String username,String password) {
        User user = userDao.findByUserName(username);
        /*
        password 前端用户输入的密码
        Md5Password 输入的密码经过同样（盐相同）的加密
        */
        String Md5Password = MsgDigestUtils.pwdEncrypt(password, user.getSalt());
        //user.getPassword()  数据库内经过加密的密码
        user.getPassword().equals(Md5Password);
        return false;
    }

    @Override
    public User getUserByUsername(String username) {
        return userDao.findByUserName(username);
    }

    @Override
    public boolean save(User ue) {
        return userDao.save(ue)>0;
    }

    @Override
    public boolean existUserNameOrEmail(String username,String email){
        return userDao.existUserNameOrEmail(username,email);
    }

    @Override
    public boolean activeUser(String username, String code) {
        return userDao.activeUser(username,code);
    }

    @Override
    public User findActiveUserByUserName(String username) {
        return userDao.findActiveUserByUserName(username);
    }
}
