package com.model.mapper.Model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Getter
@Setter
@Entity
@Table(name = "EMPTEST")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="emp_id")
    private int id;

    @Column(name="emp_name")
    private String empname;

    @CreationTimestamp
    @Column(name="created_at")
    public Timestamp createdAt;

    @UpdateTimestamp
    @Column(name="updated_at")
    public Timestamp updatedAt ;

    @Column(name="Is_Active",columnDefinition = "integer default 0")
    public int isActive ;

    @Column(name="Is_Deleted",columnDefinition = "integer default 0")
    public int isDeleted;
}
