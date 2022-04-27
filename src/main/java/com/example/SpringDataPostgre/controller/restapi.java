package com.example.SpringDataPostgre.controller;

import com.example.SpringDataPostgre.dto.kisiDto;
import com.example.SpringDataPostgre.service.kisiService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/myApi")
@Api(value = "kisiDto Api documentation")
public class restapi {

    @Resource(name = "kisiService")
    kisiService KisiService;

    @PostMapping
    @ApiOperation(value = "New kisiDto adding method")
    private ResponseEntity<kisiDto> save(@RequestBody kisiDto KisiDto)
    {
        return ResponseEntity.ok(KisiService.save(KisiDto));
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "Get kisiDto method")
    private ResponseEntity<kisiDto> get(@PathVariable(value = "id") Long id)
    {
        return ResponseEntity.ok(KisiService.get(id));
    }

}
