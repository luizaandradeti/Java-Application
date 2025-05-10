package com.luiza.arch.dataprovider.client.mapper;

import com.luiza.arch.core.domain.Regiao;
import com.luiza.arch.dataprovider.client.response.RegiaoResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RegiaoResponseMapper {

    Regiao toAddress(RegiaoResponse regiaoResponse);

}
