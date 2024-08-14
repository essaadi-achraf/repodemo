package com.example.demo.ws.converter;

import com.example.demo.bean.Client;
import com.example.demo.dao.ClientDao;
import com.example.demo.ws.dto.ClientDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClientConverter {

    public Client toEntity(ClientDto dto) {
        Client entity = new Client();
        entity.setCin(dto.getCin());
        entity.setNom(dto.getNom());
        return entity;
    }

    public ClientDto toDto(Client entity) {
        ClientDto dto = new ClientDto();
        dto.setCin(entity.getCin());
        dto.setNom(entity.getNom());
        return dto;
    }

    public List<Client> toEntity(List<ClientDto> dtos) {
        List<Client> items = new ArrayList<Client>();
        dtos.forEach(dto -> items.add(toEntity(dto)));
        return items;
    }

    public List<ClientDto> toDto(List<Client> entities) {
        List<ClientDto> dtos = new ArrayList<ClientDto>();
        entities.forEach(dto -> dtos.add(toDto(dto)));
        return dtos;
    }


}
