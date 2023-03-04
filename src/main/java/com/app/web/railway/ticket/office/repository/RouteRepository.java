package com.app.web.railway.ticket.office.repository;

import com.app.web.railway.ticket.office.entity.Route;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface RouteRepository  extends JpaRepository<Route, Integer>, PagingAndSortingRepository<Route, Integer> {
}
