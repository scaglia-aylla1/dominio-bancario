package com.studo.service;

import com.studo.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create (User userToCreate);
}
