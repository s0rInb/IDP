package ru.pflb.idp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.pflb.idp.dao.UserDao;
import ru.pflb.idp.model.User;

import java.util.List;

/**
 * Created by Leporidae on 03.12.2015.
 */

@Service("userService")
//@Repository
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    public Page<User> findAllByPage(Pageable pageable) {
        return userDao.findAll(pageable);
    }

    public List<User> findList() {
        return userDao.findList();
    }

    //    @Autowired
//    private UserDao dao;

//    public Page<User> findAllUsers(PageRequest pageRequest) {
//        return dao.findAllUsers(pageRequest);
//    }
}
