package com.app.web.railway.ticket.office.service.impl;

import com.app.web.railway.ticket.office.entity.Schedule;
import com.app.web.railway.ticket.office.repository.ScheduleRepository;
import com.app.web.railway.ticket.office.service.ScheduleService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class ScheduleServiceImpl implements ScheduleService {
    private final ScheduleRepository scheduleRepository;

    @Override
    public boolean isExists(Schedule schedule) {
        return scheduleRepository.exists(Example.of(schedule));
    }

    @Override
    public void save(Schedule schedule) {
        scheduleRepository.save(schedule);
    }

    @Override
    public Schedule update(Schedule schedule) {
        return null;
    }

    @Override
    public Schedule findById(int id) {
        return scheduleRepository.findById(id).orElseThrow(IllegalAccessError::new);
    }

    @Override
    public List<Schedule> findAll() {
        return scheduleRepository.findAll();
    }

    @Override
    public void deleteById(int id) {
        scheduleRepository.deleteById(id);
    }
}
