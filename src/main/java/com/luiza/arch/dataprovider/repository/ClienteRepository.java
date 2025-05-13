package com.luiza.arch.dataprovider.repository;

import com.luiza.arch.dataprovider.repository.tabelas.ClienteTabela;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClienteRepository extends MongoRepository<ClienteTabela, String>{



}


