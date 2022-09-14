package com.sam.core;

import javax.persistence.*;

@MappedSuperclass
public abstract class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Version
    private Long version;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    protected BaseEntity() {
        id = null;
    }

}
