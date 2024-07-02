package com.smith.pp_3_1_2.dao;


import com.smith.pp_3_1_2.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    User getUserById(int id);

    void saveUser(User user);

    User updateUser(User user);

    void deleteUser(int id);
}