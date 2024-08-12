package com.example.demo.service;

import com.example.demo.bean.Command;
import com.example.demo.dao.CommandDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommandService {


    public Command findByRef(String ref) {
        return commandDao.findByRef(ref);
    }

    public List<Command> findAll() {
        return commandDao.findAll();
    }

    public List<Command> findByRefLikeAndTotalGreaterThan(String ref, Double total) {
        return commandDao.findByRefLikeAndTotalGreaterThan(ref, total);
    }


    public int save(Command command) {
        if (findByRef(command.getRef()) != null) {
            return -1;
        } else if (command.getTotal() < command.getTotalpaye()) {
            return -2;
        } else {
            commandDao.save(command);
            return 1;

        }

    }

    public int payer(String ref, Double montant) {
        Command command = findByRef(ref);
        if (command == null) {
            return -1;
        } else if (command.getTotalpaye() + montant > command.getTotal()) {
            return -2;
        } else {
            double nvTotalpayercommand = command.getTotalpaye() + montant;
            command.setTotalpaye(nvTotalpayercommand);
            commandDao.save(command);
            return 1;

        }


    }


    @Autowired
    private CommandDao commandDao;


}


