package br.com.joaquina.m3s01projetorevisao.entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jdk.jfr.Enabled;
import lombok.Data;

@Data
@Enabled
public class PaymentMethod {

    @Id
    @Column(name = "payment_method_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20, nullable = false)
    private String name;

    @Column(nullable = false)
    private Boolean isCard;

}
