package com.example.demo.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Command {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;

    private String ref ;
    private double total ;
    private double totalpaye ;

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getTotalpaye() {
        return totalpaye;
    }

    public void setTotalpaye(double totalpaye) {
        this.totalpaye = totalpaye;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
