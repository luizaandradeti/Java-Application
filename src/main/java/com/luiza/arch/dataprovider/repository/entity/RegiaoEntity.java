package com.luiza.arch.dataprovider.repository.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
public class RegiaoEntity {

    private String rua;

    private String cidade;

    private String estado;
}
