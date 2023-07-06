package br.com.techforme.tech4vet.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document
public class Animais {
    @Id
    private String id;
    private String nome;
    private Especies especie ;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Especies getEspecie() {
        return especie;
    }
    public void setEspecie(Especies especie) {
        this.especie = especie;
    }
    
}
