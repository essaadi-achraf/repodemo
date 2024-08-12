package com.example.demo.service;

import com.example.demo.bean.Command;
import com.example.demo.bean.Facture;
import com.example.demo.dao.FactureDao;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FactureService {
    @Transactional
    public void deleteById(Integer integer) {
        factureDao.deleteById(integer);
    }

    public Optional<Facture> findById(Integer integer) {
        return factureDao.findById(integer);
    }

    public List<Facture> findAll() {
        return factureDao.findAll();
    }

    public int save(Facture facture)  {
        if (findByCode(facture.getCode()) != null) {
            return -1;
        } else if (facture.getPrix() < facture.getPrixtotal()) {
            return -2;
        } else {
            factureDao.save(facture);
            return 1;

        }


    }

    public Facture getReferenceById(Integer integer) {
        return factureDao.getReferenceById(integer);
    }

    public Facture findByCode(String code) {
        return factureDao.findByCode(code);
    }

    public List<Facture> findByCodeLikeAndPrixGreaterThan(String code, Double prix) {
        return factureDao.findByCodeLikeAndPrixGreaterThan(code, prix);
    }

    @Autowired
    private FactureDao factureDao;

}
