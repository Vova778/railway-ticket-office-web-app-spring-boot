package com.app.web.railway.ticket.office.entity;

import com.app.web.railway.ticket.office.entity.enums.TicketStatus;
import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private double fare;
    private String startingStationName;
    private String finalStationName;
    private Timestamp departureTime;
    private Timestamp arrivalTime;
    private String trainNumber;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private User user;
    @Enumerated(EnumType.STRING)
    private TicketStatus status;
    @Transient
    private Set<Route> routes;


}
