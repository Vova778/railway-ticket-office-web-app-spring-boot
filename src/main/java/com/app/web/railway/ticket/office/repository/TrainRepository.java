package com.app.web.railway.ticket.office.repository;

import com.app.web.railway.ticket.office.entity.Train;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TrainRepository extends JpaRepository<Train, Integer>, PagingAndSortingRepository<Train, Integer> {
}
