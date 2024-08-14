package com.example.demo.service;

import com.example.demo.bean.Client;
import com.example.demo.dao.ClientDao;
import com.example.demo.dao.CommandDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import com.example.demo.dao.ClientDao;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    private ClientDao dao;

    public int save(Client client) {
        if (findByCin(client.getCin()) != null) {
            return -1;
        }else {
            dao.save(client);
            return 1;
        }
    }
    public Client findByCin(String cin) {
        return dao.findByCin(cin);
    }

    public List<Client> findByNom(String nom) {
        return dao.findByNom(nom);
    }

    public List<Client> findAll() {
        return dao.findAll();
    }
}
