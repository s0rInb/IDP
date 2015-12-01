package repository;

import entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by Leporidae on 30.11.2015.
 */
public interface UserRepository extends PagingAndSortingRepository{

    @Query("select new map (u.id as id, u.firstName as firstName, u.lastName as lastName) FROM User u")
    public List<User> findAll();

}
