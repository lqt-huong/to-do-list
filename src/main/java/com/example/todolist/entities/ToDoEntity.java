
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
@Table(name = "todo")

public class ToDoEntity {
    @Id
    String id;
    @Column(name = "todo_name")
    private String todo_name;
    @Column(name = "task_id")
    private String task_id;
}
