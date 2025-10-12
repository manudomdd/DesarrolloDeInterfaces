/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionClientes2.dto;

import java.util.Date;

/**
 *
 * @author manu
 */
public class Cliente {
    
    protected String name; 
    protected String surname; 
    protected Date date; 
    protected String city; 

    public Cliente(String name, String surname, Date date, String city) {
        this.name = name;
        this.surname = surname;
        this.date = date;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Date getDate() {
        return date;
    }

    public String getCity() {
        return city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Cliente{" + "name=" + name + ", surname=" + surname + ", date=" + date + ", city=" + city + '}';
    }  
}
