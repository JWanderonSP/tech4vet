package br.com.techforme.tech4vet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.techforme.tech4vet.model.Animais;
import br.com.techforme.tech4vet.service.AnimalService;

@RestController
@RequestMapping("/animais")

public class AnimalController {
    @Autowired
    private AnimalService servico;
    @GetMapping
    public List <Animais> obterTodos(){
        return servico.obterTodos();
    }

    @PostMapping
    public Animais cadastrar(@RequestBody Animais animal){
        return servico.cadastrar(animal);
    }
    @PutMapping("/{id}")
    public Animais atualizar(@PathVariable String id, @RequestBody Animais animal){
    return servico.atualizar(id, animal);
    }
    @DeleteMapping("/{id}")
    public void excluir(@PathVariable String id){
        servico.excluir(id);
    }
    @GetMapping("/{id}")
    public Animais obterPorId (@PathVariable String id){
        return servico.obterPorId(id);
    }
}


