package com.app.web.railway.ticket.office.service;

import com.app.web.railway.ticket.office.entity.Station;

import java.util.List;

public interface StationService {
    boolean isExists(Station station);

    void save(Station station);

    Station update(Station station);

    Station findById(int id);

    List<Station> findAll();

    void deleteById(int id);
}
