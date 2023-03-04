package com.app.web.railway.ticket.office.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Time;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int stoppageNumber;
    @ManyToOne
    private Station startingStation;
    @ManyToOne
    private Station finalStation;
    private Time departureTime;
    private Time arrivalTime;
    private int availableSeats;
    private Time travelTime;
    private int day;
    @ManyToOne
    private Schedule schedule;
    @ManyToOne
    private Train train;
    private double price;

}
