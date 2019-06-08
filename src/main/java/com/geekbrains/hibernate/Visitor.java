package com.geekbrains.hibernate;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "visitors")
public class Visitor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;

    @ManyToOne
    @JoinColumn(name = "std_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "crs_id")
    private Course course;

    public Visitor() {
    }
}
