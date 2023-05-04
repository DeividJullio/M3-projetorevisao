package br.com.joaquina.m3s01projetorevisao.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="customer-id")
    private Long id;
    @Column( nullable = false)
    private String name;

    @Column( length = 30, nullable = false)
    private String taxId;

    @Column( nullable = false)
    private String email;

    @Column(length = 20,nullable = false)
    private String phone;

    @Column( nullable = false)
    private String address;

    @Column(length = 20)
    private String complement;








}