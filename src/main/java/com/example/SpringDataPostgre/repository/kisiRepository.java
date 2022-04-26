package com.example.SpringDataPostgre.repository;

import com.example.SpringDataPostgre.entity.kisi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(value = "kisiRepository")
public interface kisiRepository extends JpaRepository<kisi,Long> {
}
