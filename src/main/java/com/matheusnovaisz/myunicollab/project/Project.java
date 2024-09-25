package com.matheusnovaisz.myunicollab.project;

import com.matheusnovaisz.myunicollab.user.User;
import jakarta.persistence.*;
import org.hibernate.annotations.UuidGenerator;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "projects")
public class Project {

    @Id
    @UuidGenerator
    private UUID id;

    @Column(nullable = false)
    private String name;

    @Column
    private String description;

    @Column
    private String status;

    @ManyToOne
    @JoinColumn()
    private User owner;

    @ManyToMany
    private List<User> participants;
}
