package ru.pflb.idp.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import ru.pflb.idp.model.User;

import java.util.List;

/**
 * Created by Leporidae on 03.12.2015.
 */
public interface UserService {

    Page<User> findAllByPage(Pageable pageable);
    List<User> findList();
}
