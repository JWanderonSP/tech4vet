package br.com.techforme.tech4vet.service;

import java.util.List;

import br.com.techforme.tech4vet.model.Animais;

public interface AnimalService {
    List <Animais> obterTodos();
Animais cadastrar(Animais animal);

Animais atualizar(String id, Animais animal); 
void excluir(String id);
Animais obterPorId(String id);  
}
