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
@Table(appliesTo = "users")
public class User {
    @NotNull
    @Column(name="id")
    private Integer id;
    @NotNull
    @Column(name="first_name")
    private String firstName;
    @NotNull
    @Column(name="last_name")
    private String lastName;





    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
