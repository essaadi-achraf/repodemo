package com.example.demo.dao;

import com.example.demo.bean.Command;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CommandDao extends JpaRepository<Command, Long> {
    Command findByRef(String ref);
    List<Command> findByRefLikeAndTotalGreaterThan(String ref, Double total);

}
