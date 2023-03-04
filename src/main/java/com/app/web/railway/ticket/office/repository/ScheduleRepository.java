package com.app.web.railway.ticket.office.repository;

import com.app.web.railway.ticket.office.entity.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ScheduleRepository extends JpaRepository<Schedule, Integer>, PagingAndSortingRepository<Schedule, Integer> {
}
