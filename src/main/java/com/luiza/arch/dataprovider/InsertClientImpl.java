package com.luiza.arch.dataprovider;

import com.luiza.arch.core.dataprovider.InsertCliente;
import com.luiza.arch.core.domain.Cliente;
import com.luiza.arch.dataprovider.repository.ClienteRepository;
import com.luiza.arch.dataprovider.repository.mapper.ClienteTabelaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsertClientImpl implements InsertCliente {


    @Autowired
    ClienteRepository clienteRepository;

    @Autowired
    private ClienteTabelaMapper clienteTabelaMapper;

    @Override
    public void insert(Cliente cliente){
        var clienteTabela = clienteTabelaMapper.toClienteTabela(cliente);
        clienteRepository.save(clienteTabela);
    }
}
