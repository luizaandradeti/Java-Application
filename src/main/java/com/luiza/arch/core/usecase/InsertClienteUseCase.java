package com.luiza.arch.core.usecase;

import com.luiza.arch.core.domain.Cliente;

public interface InsertClienteUseCase {

    void insert(Cliente cliente, String cep );
}
