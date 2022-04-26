package com.example.SpringDataPostgre.controller;

import com.example.SpringDataPostgre.dto.kisiDto;
import com.example.SpringDataPostgre.service.kisiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/myApi")
public class api {

    @Resource(name = "kisiService")
    kisiService KisiService;

    @PostMapping
    private ResponseEntity<kisiDto> save(@RequestBody kisiDto KisiDto)
    {
        return ResponseEntity.ok(KisiService.save(KisiDto));
    }

    @GetMapping("/{id}")
    private ResponseEntity<kisiDto> get(@PathVariable(value = "id") Long id)
    {
        return ResponseEntity.ok(KisiService.get(id));
    }

}
