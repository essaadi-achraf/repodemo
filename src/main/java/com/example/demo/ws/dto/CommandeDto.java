package com.example.demo.ws.dto;

public class CommandeDto {
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
}
