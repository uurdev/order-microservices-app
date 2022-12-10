package com.example.authserver.repository;

/*
    @author uurdev
    @date 10.12.2022
*/

import com.example.authserver.domain.ApplicationUser;
import org.springframework.data.repository.CrudRepository;

public interface ApplicationUserRepository extends CrudRepository<ApplicationUser, String> {
}
