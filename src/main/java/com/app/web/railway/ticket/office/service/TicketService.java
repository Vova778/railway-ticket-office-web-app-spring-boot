package com.app.web.railway.ticket.office.service;

import com.app.web.railway.ticket.office.entity.Ticket;

import java.util.List;

public interface TicketService {
    boolean isExists(Ticket ticket);

    void save(Ticket ticket);

    Ticket update(Ticket ticket);

    Ticket findById(int id);

    List<Ticket> findAll();

    void deleteById(int id);
}
