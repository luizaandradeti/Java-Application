package com.luiza.arch.dataprovider.client;

import com.luiza.arch.dataprovider.client.response.RegiaoResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        name = "FindRegiaoByCepCliente",
        url = "${andrade.client.regiao.url}"
)
public interface FindRegiaobyCepCliente {

    @GetMapping("/{cep}")
    RegiaoResponse find(@PathVariable("cep") String cep);
}