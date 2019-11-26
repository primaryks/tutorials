package org.ko.oauth.service.Impl;

import org.ko.oauth.dao.UserEntityDao;
import org.ko.oauth.domain.UserEntity;
import org.ko.oauth.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserEntityDao userDao;

    @Override
    public UserEntity findByname(String username) {
        return userDao.findByUsername(username) ;
    }
}
