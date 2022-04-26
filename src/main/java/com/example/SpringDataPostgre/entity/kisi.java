package com.example.SpringDataPostgre.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "kisi")
public class kisi {
    @Id
    @SequenceGenerator(name = "seq_kisi", allocationSize = 1)
    @GeneratedValue(generator = "seq_kisi", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(length = 100, name = "adi")
    private String adi;

    @Column(length = 100, name = "soyadi")
    private String soyadi;

    @OneToMany
    @JoinColumn(name = "kisi_adres_id")
    private List<adres> adresleri;
}
