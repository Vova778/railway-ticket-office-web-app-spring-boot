package com.app.web.railway.ticket.office.service;

import com.app.web.railway.ticket.office.entity.Route;

import java.util.List;

public interface RouteService {
    boolean isExists(Route route);

    void save(Route route);

    Route update(Route route);

    Route findById(int id);

    List<Route> findAll();

    void deleteById(int id);

}
