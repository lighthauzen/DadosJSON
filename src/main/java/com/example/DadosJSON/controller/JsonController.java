package com.example.DadosJSON.controller;

import com.example.DadosJSON.domain.Dados;
import com.example.DadosJSON.service.DadosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/data")
public class JsonController {

    @Autowired
    DadosService dadosService;

    @PostMapping("/salvar")
    private void salvar1() {

            dadosService.Salvar1Dado();

    }

    @GetMapping("/persons")
    private List<Dados> getAllDados() {
        return dadosService.getAllPersons();
    }

    @GetMapping("/persons/{id}")
    private Dados getDado(@PathVariable("id") int id) {
        return dadosService.getPersonById(id);
    }

    @DeleteMapping("/persons/{id}")
    private void deleteDado(@PathVariable("id") int id) {
        dadosService.delete(id);
    }

    @PostMapping("/persons")
    private int savePerson(@RequestBody Dados dados) {
        dadosService.saveOrUpdate(dados);
        return dados.getId();
    }

}
