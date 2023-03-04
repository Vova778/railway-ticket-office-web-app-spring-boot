package com.app.web.railway.ticket.office.service;

import com.app.web.railway.ticket.office.entity.Train;

import java.util.List;

public interface TrainService {
    boolean isExists(Train train);

    void save(Train train);

    Train update(Train train);

    Train findById(int id);

    List<Train> findAll();

    void deleteById(int id);
}
