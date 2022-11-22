package br.iesp.edu.api.resource;

import br.iesp.edu.api.entity.EnderecoTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;

@RestController
@RequestMapping("/consulta")
public class ViaCepCtrl implements Serializable {
    private static final long serialVersionUID = 6046704732666502085L;

    @GetMapping(value="/getCep/{cep}")
    public ResponseEntity<EnderecoTO> doObterCep(@PathVariable(name = "cep") String cep) {
        return null;
    }
}
