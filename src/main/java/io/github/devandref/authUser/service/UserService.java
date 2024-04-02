package io.github.devandref.authUser.service;

import io.github.devandref.authUser.model.UserModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserService {

    List<UserModel> findAll();
    Optional<UserModel> findById(UUID userId);
    void delete(UserModel userModel);
    void save(UserModel userModel);
    boolean existsByUsername(String username);
    boolean existsByEmail(String email);
    Page<UserModel> findAll(Pageable pageable);
}
