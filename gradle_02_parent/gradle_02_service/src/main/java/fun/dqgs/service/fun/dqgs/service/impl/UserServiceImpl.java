package fun.dqgs.service.fun.dqgs.service.impl;

import fun.dqgs.dao.UserDao;
import fun.dqgs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    @Override
    public String save() {
        return userDao.save();
    }
}
