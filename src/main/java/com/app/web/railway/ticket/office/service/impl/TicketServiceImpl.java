package com.app.web.railway.ticket.office.service.impl;

import com.app.web.railway.ticket.office.entity.Ticket;
import com.app.web.railway.ticket.office.repository.TicketRepository;
import com.app.web.railway.ticket.office.service.TicketService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class TicketServiceImpl implements TicketService {
    private final TicketRepository ticketRepository;

    @Override
    public boolean isExists(Ticket ticket) {
        return ticketRepository.exists(Example.of(ticket));
    }

    @Override
    public void save(Ticket ticket) {
        ticketRepository.save(ticket);
    }

    @Override
    public Ticket update(Ticket ticket) {
        return null;
    }

    @Override
    public Ticket findById(int id) {
        return ticketRepository.findById(id).orElseThrow(IllegalAccessError::new);
    }

    @Override
    public List<Ticket> findAll() {
        return ticketRepository.findAll();
    }

    @Override
    public void deleteById(int id) {
        ticketRepository.deleteById(id);
    }
}
