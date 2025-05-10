package com.luiza.arch.core.usecase;


import com.luiza.arch.core.domain.Cliente;

public interface FindClienteByIdUseCase {

    Cliente find(final String id);
}
