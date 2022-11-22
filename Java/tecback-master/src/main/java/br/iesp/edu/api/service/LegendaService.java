package br.iesp.edu.api.service;

import br.iesp.edu.api.entity.Categoria;
import br.iesp.edu.api.entity.Legenda;
import br.iesp.edu.api.repository.CategoriaRepository;
import br.iesp.edu.api.repository.LegendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LegendaService {
    @Autowired
    private LegendaRepository repository;

    public Legenda salvar(Legenda legenda){
        legenda = repository.save(legenda);
        return legenda;
    }

    public Legenda atualizar(Legenda legenda){
        if(legenda.getId()==null){
            throw new RuntimeException("ID Nulo");
        }
        legenda = repository.save(legenda);
        return legenda;
    }

    public void excluir(Legenda legenda){
        if(legenda.getId()==null){
            throw new RuntimeException("ID Nulo");
        }
        repository.delete(legenda);
    }


    public void excluirPorID(Integer id){
        repository.deleteById(id);
    }

    public List<Legenda> listarLegenda(){
        return repository.findAll();
    }
}
