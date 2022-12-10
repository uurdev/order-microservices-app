package com.example.authserver.domain;

import com.example.authserver.util.RandomUUIDGenerator;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

/*
    @author uurdev
    @date 10.12.2022
*/
@Entity
@Table(name = "SEC_USER")
@Getter
@Setter
public class ApplicationUser {
    @Column(name = "ID", length = 36)
    @Id
    private String id = RandomUUIDGenerator.generateToken();
    private String userName;
    private String lastName;
    private String password;
    private Boolean enabled;
}
