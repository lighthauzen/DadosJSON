package com.example.DadosJSON.repository;

import com.example.DadosJSON.domain.Dados;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DadosRepository extends JpaRepository<Dados, Integer> {
}
