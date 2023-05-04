package br.com.joaquina.m3s01projetorevisao.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
public class DemandItem {

    @Id
    @Column(name="demand_item_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Demand demand;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Product product;

    @Column(precision = 19, scale = 2, nullable = false)
    private BigDecimal price;

    @Column(precision = 19, scale = 4, nullable = false)
    private BigDecimal qty;

    @Column(precision = 19, scale = 2, nullable = false)
    private BigDecimal total;




}
