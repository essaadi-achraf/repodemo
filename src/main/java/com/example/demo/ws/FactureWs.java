package com.example.demo.ws;

import com.example.demo.bean.Facture;
import com.example.demo.service.CommandService;
import com.example.demo.service.FactureService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/facture")
public class FactureWs {
    @Autowired
    private FactureService factureService;

    @Transactional
    public void deleteById(Integer integer) {
        factureService.deleteById(integer);
    }
    @GetMapping("/id/{id}")
    public Optional<Facture> findById(@PathVariable Integer integer) {
        return factureService.findById(integer);
    }
    @GetMapping("/")
    public List<Facture> findAll() {
        return factureService.findAll();
    }
    @PostMapping("/")
    public int save(@RequestBody Facture facture) {
        return factureService.save(facture);
    }

    @GetMapping("/code/{code}")
    public Facture findByCode(@PathVariable String code) {
        return factureService.findByCode(code);
    }
    @GetMapping("/code/{code}/prixtotal/{prixtotal}")
    public List<Facture> findByCodeLikeAndPrixGreaterThan(@PathVariable String code,@PathVariable Double prixtotal) {
        return factureService.findByCodeLikeAndPrixGreaterThan(code, prixtotal);
    }
}
