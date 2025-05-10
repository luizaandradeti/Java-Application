package com.luiza.arch.core.usecase.impl;
import com.luiza.arch.core.dataprovider.InsertCliente;
import com.luiza.arch.core.domain.Cliente;
import com.luiza.arch.core.usecase.InsertClienteUseCase;

import com.luiza.arch.core.dataprovider.FindRegiaoByCep;
import com.luiza.arch.core.dataprovider.SendCpfValidacao;
import com.luiza.arch.core.usecase.InsertClienteUseCase;

public class InsertClienteUseCaseImpl implements InsertClienteUseCase {

    private final FindRegiaoByCep findRegiaoByCep;

    private final InsertCliente insertCliente;

    private final SendCpfValidacao sendCpfValidacao;

    public InsertClienteUseCaseImpl(FindRegiaoByCep findRegiaoByCep, InsertCliente insertCliente, SendCpfValidacao sendCpfValidacao) {
        this.findRegiaoByCep = findRegiaoByCep;
        this.insertCliente = insertCliente;
        this.sendCpfValidacao = sendCpfValidacao;
    }

    @Override
    public void insert(Cliente cliente, String cep) {
        var regiao = findRegiaoByCep.find(cep);
        cliente.setRegiao(regiao);
        insertCliente.insert(cliente);
        sendCpfValidacao.send(cliente.getCpf());
    }
}
