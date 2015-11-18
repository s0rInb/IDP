package entity;

import com.sun.istack.internal.NotNull;
import org.hibernate.annotations.*;
import javax.persistence.Cacheable;
import javax.persistence.Column;

/**
 * Created by Leporidae on 18.11.2015.
 */
@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@Table(appliesTo = "plan")
public class Plan {
    @NotNull
    @Column(name="id")
    private Integer id;
    @NotNull
    @Column(name="name")
    private String name;
    @NotNull
    @Column(name="user_id")
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
