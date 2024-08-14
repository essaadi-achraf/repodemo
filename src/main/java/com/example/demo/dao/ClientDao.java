package com.example.demo.dao;

import com.example.demo.bean.Client;
import com.example.demo.bean.Command;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ClientDao extends JpaRepository<Client, Long> {
     Client findByCin(String cin);
     List<Client> findByNom(String nom);
}
