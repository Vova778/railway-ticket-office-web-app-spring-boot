package com.app.web.railway.ticket.office.service;

import com.app.web.railway.ticket.office.entity.User;

import java.util.List;

public interface UserService {
    boolean isExistsByLogin(String login);

    void save(User user);

    User update(User user);

    User findById(int id);

    List<User> findAll();

    void deleteById(int id);
}
