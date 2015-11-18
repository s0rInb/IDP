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
@Table(appliesTo = "stage")
public class Stage {
    @NotNull
    @Column(name="id")
    private Integer id;
    @NotNull
    @Column(name="content")
    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
