package com.harman.restImage.dal;

import com.harman.restImage.model.User;

import java.util.List;

public interface UserDAL {

    User getUserById(String userId);

    User addNewUser(User user);
}
