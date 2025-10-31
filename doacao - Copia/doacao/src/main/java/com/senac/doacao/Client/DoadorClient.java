package com.senac.doacao.Client;

import com.senac.doacao.DTO.doador.DoadorRequestDTO;
import com.senac.doacao.DTO.doador.DoadorResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "André",
        url = "10.136.64.200:8080",
        path = "api/Doador")
public interface DoadorClient {

    @PostMapping("/api/doador/cadastrardoador")
    DoadorResponseDTO cadastrarDoador(@RequestBody DoadorRequestDTO doadorRequest);
}