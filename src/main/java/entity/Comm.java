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
@Table(appliesTo = "comm")
public class Comm {
    @NotNull
    @Column(name="plan_id")
    private Integer planId;
    @NotNull
    @Column(name="stage_id")
    private Integer stageId;

    public Integer getStageId() {
        return stageId;
    }

    public void setStageId(Integer stageId) {
        this.stageId = stageId;
    }

    public Integer getPlanId() {
        return planId;
    }

    public void setPlanId(Integer planId) {
        this.planId = planId;
    }
}
