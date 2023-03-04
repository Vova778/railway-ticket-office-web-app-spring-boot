package com.app.web.railway.ticket.office.service.impl;

import com.app.web.railway.ticket.office.entity.User;
import com.app.web.railway.ticket.office.repository.UserRepository;
import com.app.web.railway.ticket.office.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public boolean isExistsByLogin(String login) {
        return false;
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public User findById(int id) {
        return userRepository.findById(id).orElseThrow(IllegalAccessError::new);
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public void deleteById(int id) {
        userRepository.deleteById(id);
    }
}
