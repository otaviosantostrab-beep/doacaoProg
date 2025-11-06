package com.senac.doacao.client;

import com.senac.doacao.dto.doador.DoadorRequestDTO;
import com.senac.doacao.dto.doador.DoadorResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "Andre", url = "10.136.64.200:8080", path = "api/doador")
public interface DoadorClient {

    @PostMapping("/cadastrardoador")
    DoadorResponseDTO cadastrarDoador(@RequestBody DoadorRequestDTO doadorRequest);
}