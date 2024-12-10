package com.example.salon.model_client.model;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "client")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_id")
    private Long id;


    @Column(name = "give_name", nullable = false)
    private String giveName;


    @Column(name = "surname", nullable = false)
    private String  surname;

    @Column(name = "patronymic", nullable = false)
    private String patronymic;

    @Column(name = "phone")
    private String phone;


    @Column(name = "email")
    private String email;



    @Column(name = "registration_date")
    @CreationTimestamp
    private LocalDateTime registration_date;

}
