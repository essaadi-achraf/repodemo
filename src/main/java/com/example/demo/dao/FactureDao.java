package com.example.demo.dao;

import com.example.demo.bean.Command;
import com.example.demo.bean.Facture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FactureDao extends JpaRepository<Facture, Integer> {

    Facture findByCode(String code);

      List<Facture> findByCodeLikeAndPrixGreaterThan(String code, Double prix);
}
