package com.app.web.railway.ticket.office.repository;

import com.app.web.railway.ticket.office.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TicketRepository extends JpaRepository<Ticket, Integer>, PagingAndSortingRepository<Ticket, Integer> {
}
