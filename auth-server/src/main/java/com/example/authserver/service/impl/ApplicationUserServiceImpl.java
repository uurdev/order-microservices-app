package com.example.authserver.service.impl;

/*
    @author uurdev
    @date 10.12.2022
*/
import com.example.authserver.dto.ApplicationUserDTO;
import com.example.authserver.repository.ApplicationUserRepository;
import com.example.authserver.service.ApplicationUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ApplicationUserServiceImpl implements ApplicationUserService {

    private final ApplicationUserRepository applicationUserRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return new ApplicationUserDTO(applicationUserRepository.findById(username).orElseThrow(()->
                new UsernameNotFoundException(username + " not found !")));
    }
}
