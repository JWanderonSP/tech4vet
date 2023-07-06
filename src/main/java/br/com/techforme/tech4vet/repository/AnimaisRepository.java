package br.com.techforme.tech4vet.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.techforme.tech4vet.model.Animais;

public interface  AnimaisRepository extends MongoRepository <Animais, String>{
    

    
}
