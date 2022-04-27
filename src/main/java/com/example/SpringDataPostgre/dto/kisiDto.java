package com.example.SpringDataPostgre.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
@ApiModel(value = "User Api model documentation", description = "Model")
public class kisiDto {
    @ApiModelProperty(value = "Unique id field of kisiDto object")
    private Long id;
    @ApiModelProperty(value = "Name field of kisiDto object")
    private String adi;
    @ApiModelProperty(value = "Surname field of kisiDto object")
    private String soyadi;
    @ApiModelProperty(value = "Adresses field of kisiDto object")
    private List<String> adresleri;
}


