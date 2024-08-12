package com.example.demo.ws;

import com.example.demo.bean.Command;
import com.example.demo.service.CommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/command")
public class CommandeWs {

    @GetMapping("/ref/{ref}")
    public Command findByRef(@PathVariable String ref) {
        return commandService.findByRef(ref);
    }

    @GetMapping("/ref/{ref}/total/{total}")
    public List<Command> findByRefLikeAndTotalGreaterThan(@PathVariable String ref, @PathVariable Double total) {
        return commandService.findByRefLikeAndTotalGreaterThan(ref, total);
    }

    @PostMapping("/")
    public int save(@RequestBody Command command) {
        return commandService.save(command);
    }

    @PutMapping("/payer/ref/{ref}/montant/{montant}")
    public int payer(@PathVariable String ref, @PathVariable Double montant) {
        return commandService.payer(ref, montant);
    }

    @GetMapping("/")
    public List<Command> findAll() {
        return commandService.findAll();
    }

    @Autowired
    private CommandService commandService;


}
