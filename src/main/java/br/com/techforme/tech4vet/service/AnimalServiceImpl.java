package br.com.techforme.tech4vet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.techforme.tech4vet.model.Animais;
import br.com.techforme.tech4vet.repository.AnimaisRepository;

@Service
public class AnimalServiceImpl implements AnimalService {
    @Autowired
    private AnimaisRepository repositorio;
    @Override
    public List <Animais> obterTodos() {
       return repositorio.findAll();
    }
    @Override
    public Animais cadastrar(Animais animal) {
        return repositorio.save(animal);
        
    }
    @Override
    public Animais atualizar(String id, Animais animal) {
    Animais animalatualizado=repositorio.findById(id).orElse(null);
    if(animalatualizado!=null){
        animal.setId(id);
       return repositorio.save(animal);
    }
    else{
        return null;
    }
    }
    @Override
    public void excluir(String id) {
        repositorio.deleteById(id);
    }
    @Override
    public Animais obterPorId(String id) {
       return repositorio.findById(id).orElse(null);
    }
    

    
}
