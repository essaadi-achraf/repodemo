package com.example.demo.ws.converter;

import com.example.demo.bean.Command;
import com.example.demo.ws.dto.CommandeDto;
import org.springframework.stereotype.Component;

import javax.xml.stream.events.Comment;
import java.util.ArrayList;
import java.util.List;

@Component
public class CommandeConverter {
    public Command toEntity(CommandeDto dto) {
        Command command = new Command();
        command.setRef(dto.getRef());
        command.setTotal(dto.getTotal());
        command.setTotalpaye(dto.getTotalpaye());
        return command;
    }

    public CommandeDto toDto(Command command) {
        CommandeDto dto = new CommandeDto();
        dto.setRef(command.getRef());
        dto.setTotal(command.getTotal());
        dto.setTotalpaye(command.getTotalpaye());
        return dto;
    }
 /*   public List<Command> toEntity(List<CommandeDto> dtos){
        List<Command> entities = new ArrayList<>();
        for(CommandeDto
    }*/
}

