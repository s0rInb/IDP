package ru.pflb.idp.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import ru.pflb.idp.model.User;

import java.util.List;
@Repository("UserDao")
public interface UserDao extends PagingAndSortingRepository<User, Integer> {


    @Query("select new map(u.id as id, u.firstName as firstName, u.lastName as lastName) from User u")
    Page<User> findAllUsers(Pageable pageable);

    @Query("select new map(u.id as id) from User u")
    List<User> findList();

}
