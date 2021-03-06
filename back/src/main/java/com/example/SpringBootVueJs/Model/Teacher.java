package com.example.SpringBootVueJs.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "teachers")

public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "name")
    String name;
    @Column(name = "designation")
    String designation;
    @Column(name = "age")
    Integer age;
    @Column(name = "presence")
    Boolean presence;
}
