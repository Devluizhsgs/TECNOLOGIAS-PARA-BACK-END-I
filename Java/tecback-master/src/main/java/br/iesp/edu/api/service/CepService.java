package br.iesp.edu.api.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CepService {
    RestTemplate restTemplate = new RestTemplate();


    String uri = "http://viacep.com.br/ws/{cep}/json/";
}
