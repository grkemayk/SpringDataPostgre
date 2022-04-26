package com.example.SpringDataPostgre.service;

import com.example.SpringDataPostgre.dto.kisiDto;
import com.example.SpringDataPostgre.entity.adres;
import com.example.SpringDataPostgre.entity.kisi;
import com.example.SpringDataPostgre.repository.adresRepository;
import com.example.SpringDataPostgre.repository.kisiRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service(value = "kisiService")
public class kisiService {
    @Resource(name = "kisiRepository")
    private kisiRepository KisiRepository;
    @Resource(name = "adresRepository")
    private adresRepository AdresRepository;

    public kisiDto save(kisiDto KisiDto){

        kisi yeniKisi = new kisi();
        yeniKisi.setAdi(KisiDto.getAdi());
        yeniKisi.setSoyadi(KisiDto.getSoyadi());

        final kisi kisiDB = KisiRepository.save(yeniKisi);
        List<adres> adresler = new ArrayList<>();
        KisiDto.getAdresleri().forEach(item ->
        {
            adres yeniAdres = new adres();
            yeniAdres.setAdres(item);
            yeniAdres.setKisi(kisiDB);
            adresler.add(yeniAdres);
        });

        KisiDto.setId(kisiDB.getId());
        AdresRepository.saveAll(adresler);
        return KisiDto;
    }

    public kisiDto get(Long id)
    {
        kisi Kisi = new kisi();
        Kisi = KisiRepository.getById(id);

        kisiDto KisiDto = new kisiDto();
        KisiDto.setAdi(Kisi.getAdi());
        KisiDto.setSoyadi(Kisi.getSoyadi());
        KisiDto.setId(Kisi.getId());
        List<String> adresler = new ArrayList<>();
        Kisi.getAdresleri().forEach(item ->
        {
            adresler.add(item.getAdres());
        });
        KisiDto.setAdresleri(adresler);
        return KisiDto;
    }

}
