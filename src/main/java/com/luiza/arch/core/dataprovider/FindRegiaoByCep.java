package com.luiza.arch.core.dataprovider;


import com.luiza.arch.core.domain.Regiao;

public interface FindRegiaoByCep {
    Regiao find(final String cep);
}
