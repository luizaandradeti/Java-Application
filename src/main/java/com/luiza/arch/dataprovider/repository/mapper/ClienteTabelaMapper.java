package com.luiza.arch.dataprovider.repository.mapper;

import com.luiza.arch.core.domain.Cliente;
import com.luiza.arch.dataprovider.repository.tabelas.ClienteTabela;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClienteTabelaMapper {

    ClienteTabela toClienteTabela(Cliente cliente);

}
