package com.app.web.railway.ticket.office.service.impl;

import com.app.web.railway.ticket.office.entity.Station;
import com.app.web.railway.ticket.office.repository.StationRepository;
import com.app.web.railway.ticket.office.service.StationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class StationServiceImpl implements StationService {
    private StationRepository stationRepository;

    @Override
    public boolean isExists(Station station) {
        return stationRepository.exists(Example.of(station));
    }

    @Override
    public void save(Station station) {
        stationRepository.save(station);
    }

    @Override
    public Station update(Station station) {
        return null;
    }

    @Override
    public Station findById(int id) {
        return stationRepository.findById(id).orElseThrow(IllegalAccessError::new);
    }

    @Override
    public List<Station> findAll() {
        return stationRepository.findAll();
    }

    @Override
    public void deleteById(int id) {
        stationRepository.deleteById(id);
    }
}
