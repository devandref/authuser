package io.github.devandref.authUser.service;

import io.github.devandref.authUser.model.UserModel;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserService {

    List<UserModel> findAll();
    Optional<UserModel> findById(UUID userId);
    void delete(UserModel userModel);
}
