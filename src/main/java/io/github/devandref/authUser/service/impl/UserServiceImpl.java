package io.github.devandref.authUser.service.impl;

import io.github.devandref.authUser.repositories.UserRepository;
import io.github.devandref.authUser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;



}
