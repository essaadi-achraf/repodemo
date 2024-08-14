package com.example.demo.ws.facade;

import com.example.demo.bean.Client;
import com.example.demo.service.ClientService;
import com.example.demo.ws.converter.ClientConverter;
import com.example.demo.ws.dto.ClientDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/client/")
public class ClientWs {
    @Autowired
    private ClientService service;
    @Autowired
    private ClientConverter converter;

    @PostMapping
    public int save(@RequestBody ClientDto dto) {
        Client client = converter.toEntity(dto);
        return service.save(client);
    }

    @GetMapping("cin/{cin}")
    public ClientDto findByCin(@PathVariable String cin) {
        Client byCin = service.findByCin(cin);
        return converter.toDto(byCin);
    }

    @GetMapping("nom/{nom}")
    public List<ClientDto> findByNom(@PathVariable String nom) {
        List<Client> clients = service.findByNom(nom);
        List<ClientDto> dtos = converter.toDto(clients);
        return dtos;
    }

    @GetMapping()
    public List<ClientDto> findAll() {
        List<Client> clients = service.findAll();
        List<ClientDto> dtos = converter.toDto(clients);
        return dtos;
    }
}
