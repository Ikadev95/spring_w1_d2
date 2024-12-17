package com.epicode.spring_w1_d2.entity;

import com.epicode.spring_w1_d2.enums.StatoOrdineEnum;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalTime;

@Entity
@Data
@Table(name = "ordini")
public class Ordine {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column (name = "stato_ordine")
    private StatoOrdineEnum statoOrdineEnum;

    @Column (name = "coperti_effettivi")
    private int copertiEffettivi;

    @Column (name = "ora_acquisizione")
    private LocalTime oraAcquisizione;

    @Column (name = "importo_totale")
    private Double importoTot;

    @OneToOne
    private Tavolo tavolo;



}