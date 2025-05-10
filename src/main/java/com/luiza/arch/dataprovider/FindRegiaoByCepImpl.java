package com.luiza.arch.dataprovider;


import com.luiza.arch.core.dataprovider.FindRegiaoByCep;
import com.luiza.arch.core.domain.Regiao;
import com.luiza.arch.dataprovider.client.FindRegiaobyCepCliente;
import com.luiza.arch.dataprovider.client.mapper.RegiaoResponseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindRegiaoByCepImpl implements FindRegiaoByCep {

    @Autowired
    private FindRegiaobyCepCliente client;

    @Autowired
    private RegiaoResponseMapper regiaoResponseMapper;

    @Override
    public Regiao find(String cep) {
        var regiaoResponse = client.find(cep);
        return regiaoResponseMapper.toAddress(regiaoResponse);
    }

}
