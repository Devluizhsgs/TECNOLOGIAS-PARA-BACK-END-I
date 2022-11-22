package br.iesp.edu.api.resource;

import br.iesp.edu.api.entity.Legenda;
import br.iesp.edu.api.service.LegendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/legenda")
public class LegendaResource {
    @Autowired
    private LegendaService service;

    @PostMapping
    public Legenda salvar(@RequestBody Legenda legenda){
        return service.salvar(legenda);
    }

    @PutMapping
    public Legenda atualizar(@RequestBody  Legenda legenda){
        return service.atualizar(legenda);
    }

    @DeleteMapping
    public void excluir(@RequestBody Legenda legenda){
        service.excluir(legenda);
    }
    @DeleteMapping("/{id}")
    public void excluirPorId(@PathVariable Integer id){
        service.excluirPorID(id);
    }

    @GetMapping
    public List<Legenda> listarLegenda(){
        return service.listarLegenda();
    }
}
