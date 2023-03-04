package com.app.web.railway.ticket.office.repository;

import com.app.web.railway.ticket.office.entity.Station;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface StationRepository extends JpaRepository<Station, Integer>, PagingAndSortingRepository<Station, Integer> {
}
