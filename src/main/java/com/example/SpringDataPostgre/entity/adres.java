package com.example.SpringDataPostgre.entity;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "adres")
public class adres {
    @Id
    @SequenceGenerator(name = "seq_adres", allocationSize = 1)
    @GeneratedValue(generator = "seq_adres", strategy = GenerationType.SEQUENCE)
    private Long id;
    private String adres;
    @ManyToOne
    @JoinColumn(name = "kisi_adres_id")
    private kisi Kisi;

}
