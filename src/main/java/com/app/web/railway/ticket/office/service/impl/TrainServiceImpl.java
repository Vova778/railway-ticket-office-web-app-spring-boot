package com.app.web.railway.ticket.office.service.impl;

import com.app.web.railway.ticket.office.entity.Train;
import com.app.web.railway.ticket.office.repository.TrainRepository;
import com.app.web.railway.ticket.office.service.TrainService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class TrainServiceImpl implements TrainService {
    private final TrainRepository trainRepository;

    @Override
    public boolean isExists(Train train) {
        return trainRepository.exists(Example.of(train));
    }

    @Override
    public void save(Train train) {
        trainRepository.save(train);
    }


    @Override
    public Train update(Train train) {
        return null;
    }

    @Override
    public Train findById(int id) {
        return trainRepository.findById(id).orElseThrow(IllegalAccessError::new);
    }

    @Override
    public List<Train> findAll() {
        return trainRepository.findAll();
    }

    @Override
    public void deleteById(int id) {
        trainRepository.deleteById(id);
    }
}
