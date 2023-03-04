package com.app.web.railway.ticket.office.repository;

import com.app.web.railway.ticket.office.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepository extends JpaRepository<User, Integer>, PagingAndSortingRepository<User, Integer> {
}
