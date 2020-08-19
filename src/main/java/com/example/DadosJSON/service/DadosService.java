package com.example.DadosJSON.service;

import com.example.DadosJSON.domain.Base;
import com.example.DadosJSON.domain.Dados;
import com.example.DadosJSON.repository.DadosRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class DadosService {

    @Autowired
    DadosRepository dadosRepository;

    public List<Dados> getAllPersons() {
        List<Dados> dados = new ArrayList<Dados>();
        dadosRepository.findAll().forEach(dados1 -> dados.add(dados1));
        return dados;
    }

    public Dados getPersonById(int id) {
        return dadosRepository.findById(id).get();
    }

    public void saveOrUpdate(Dados dados) {
        dadosRepository.save(dados);
    }

    public void delete(int id) {
        dadosRepository.deleteById(id);
    }

    public void Salvar1Dado()  {

        ObjectMapper objectMapper = new ObjectMapper();

        File arquivo = new File("src/main/resources/json/data_teste.json");

        Base base = null;
        try {
            base = objectMapper.readValue(arquivo, Base.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Dados atual = new Dados(base.getData()[0]);
        dadosRepository.save(atual);
    }
}
