package com.example.SpringDataPostgre.dto;

import lombok.Data;

import java.util.List;

@Data
public class kisiDto {
    private Long id;
    private String adi;
    private String soyadi;
    private List<String> adresleri;
}


