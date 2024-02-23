package com.example.FirstMicroserviceJPA.Model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "contact")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;
    private int age;

}
