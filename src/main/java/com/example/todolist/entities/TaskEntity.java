package com.example.todolist.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "task")

public class TaskEntity {
    @Id
    String id;
    @Column(name = "name")
    private String name;
    @Column(name = "user_id")
    private String user_id;
    @Column(name = "serial")
    private int serial;
}