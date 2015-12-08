//package ru.pflb.idp.dao;
//
//import org.hibernate.Criteria;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.Sort;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.PagingAndSortingRepository;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//import ru.pflb.idp.model.User;
//
//import java.util.List;
//
///**
// * Created by Leporidae on 03.12.2015.
// */
//@Repository("userDao")
//public class UserDaoImpl implements UserDao {
//
//
//    public Page<User> findAllUsers(Pageable pageable) {
//        return pageable;
//    }
//
//    public List<User> findList() {
//        return null;
//    }
//}
//}