package com.matheusnovaisz.myunicollab.user;

import com.matheusnovaisz.myunicollab.project.Project;
import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "users")
public class User {

    @Id
    private UUID id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @OneToMany(mappedBy = "owner")
    private List<Project> projects_created;

    @ManyToMany(mappedBy = "participants")
    private List<Project> projects_participating;
}
