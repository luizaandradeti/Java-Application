package com.luiza.arch.core.dataprovider;

import com.luiza.arch.core.domain.Cliente;

import java.util.Optional;

public interface FindClienteById {

    Optional<Cliente> find(final String id);
}
