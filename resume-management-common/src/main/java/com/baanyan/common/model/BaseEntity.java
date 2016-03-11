package com.baanyan.common.model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

import javax.persistence.*;

/**
 * Created by steve on 2/29/16.
 */
@Entity
@Table(name = "element")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class BaseEntity {
    @Id
    @GeneratedValue(generator = "idGenerator")
    @GenericGenerator(name = "idGenerator", strategy = "uuid")
    @Column(name = "id", nullable = false)
    private String id;
    
    @Temporal(TemporalType.TIMESTAMP)
//	@Generated(GenerationTime.ALWAYS) 
	@Column(updatable=false)
    @CreationTimestamp
    private Date createTime;

    @Temporal(TemporalType.TIMESTAMP)
//	@Generated(GenerationTime.INSERT) 
//	@Column()
    @UpdateTimestamp
    private Date updateTime;
    
    @PrePersist
    protected void onCreate() {
      createTime =new Date();
    }

    @PreUpdate
    protected void onUpdate() {
      updateTime = new Date();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

}
