package com.app.web.railway.ticket.office.service.impl;

import com.app.web.railway.ticket.office.entity.Route;
import com.app.web.railway.ticket.office.repository.RouteRepository;
import com.app.web.railway.ticket.office.service.RouteService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class RouteServiceImpl implements RouteService {
    private final RouteRepository routeRepository;

    @Override
    public boolean isExists(Route route) {
        return routeRepository.exists(Example.of(route));
    }

    @Override
    public void save(Route route) {
        routeRepository.save(route);
    }

    @Override
    public Route update(Route route) {
        return null;
    }

    @Override
    public Route findById(int id) {
        return routeRepository.findById(id).orElseThrow(IllegalArgumentException::new);
    }

    @Override
    public List<Route> findAll() {
        return routeRepository.findAll();
    }

    @Override
    public void deleteById(int id) {
        routeRepository.deleteById(id);
    }
}
