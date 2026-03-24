package br.uniesp.si.techback.controller;

import br.uniesp.si.techback.model.Genero;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.service.annotation.DeleteExchange;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/generos")

public class GeneroControler {

    private static List<Genero> Lista = new ArrayList<>();

    @PostMapping
    public String criar (Genero genero){
            Lista.add(genero);
        return "Post Criacao de Genero exec";
    }

    @GetMapping

    public String listar (){
        return  "Listar";
    }

    @PutMapping
    public String Atualizar(){
        return  "atualizar";
    }
    @DeleteMapping

    public String Delete (){
        return "delete";

    }

}
