package com.lab2.sistema.aluguel.carros.Repository;

import com.lab2.sistema.aluguel.carros.model.Automovel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutomovelRepository extends MongoRepository<Automovel, String> {
}