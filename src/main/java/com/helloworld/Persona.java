package com.helloworld;

public class Persona {
    private String nombre;
    private Integer edad;

    public Persona() {}

    public Persona(String nombre, Integer edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public String toString(){
        return "Persona{nombre='" + nombre + "', edad=" + edad + "}";
    }
}
