package com.app.web.railway.ticket.office.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private Date date;
    @ManyToOne
    private Train train;
    @ToString.Exclude
    @Transient
    private Set<Route> routes;

}
