package com.example.SpringDataPostgre.repository;

import com.example.SpringDataPostgre.entity.adres;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(value = "adresRepository")
public interface adresRepository extends JpaRepository<adres,Long> {

}
