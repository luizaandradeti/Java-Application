package com.luiza.arch.core.usecase.impl;

import com.luiza.arch.core.dataprovider.FindClienteById;
import com.luiza.arch.core.domain.Cliente;
import com.luiza.arch.core.usecase.FindClienteByIdUseCase;

public class FindClienteByIdUseCaseImpl implements FindClienteByIdUseCase {

    private final FindClienteById findClienteById;

    public FindClienteByIdUseCaseImpl(FindClienteById findClienteById){
        this.findClienteById = findClienteById;
    }

    @Override
    public Cliente find(String id) {
        return findClienteById.find(id)
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));
    }
}
