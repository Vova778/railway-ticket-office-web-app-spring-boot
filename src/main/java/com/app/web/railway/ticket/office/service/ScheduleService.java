package com.app.web.railway.ticket.office.service;

import com.app.web.railway.ticket.office.entity.Schedule;

import java.util.List;

public interface ScheduleService {
    boolean isExists(Schedule schedule);

    void save(Schedule schedule);

    Schedule update(Schedule schedule);

    Schedule findById(int id);

    List<Schedule> findAll();

    void deleteById(int id);
}
