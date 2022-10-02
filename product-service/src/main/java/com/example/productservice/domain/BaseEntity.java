package com.example.productservice.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

/*
    @author uurdev
    @date 2.10.2022
*/
@MappedSuperclass
@Data
public class BaseEntity {
    @Column(name = "ID", length = 36)
    @Id
    private String id = UUID.randomUUID().toString();

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CRE_DATE")
    private Date creDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "UPD_DATE")
    private Date updDate;

    @Column(
            name = "CRE_USER",
            length = 36
    )
    private String creUser;

    @PrePersist
    public void onPrePersist() {
        this.setCreDate(new Date(System.currentTimeMillis()));
        //this.setCreUser(SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString());
    }

    @PreUpdate
    public void onPreUpdate() {
        this.setUpdDate(new Date(System.currentTimeMillis()));
    }
}
