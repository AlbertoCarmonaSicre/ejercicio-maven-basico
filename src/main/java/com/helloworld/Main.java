package com.helloworld;

import com.google.gson.Gson;

public class Main {

    public static Persona jsonToPersona(String json){
        Gson gson = new Gson();
        return gson.fromJson(json, Persona.class);
    }

    public static void main(String[] args) {
        String json = "{ \"nombre\": \"Alberto\", \"edad\": 21 }";
        Persona persona = jsonToPersona(json);
        System.out.println(persona);
    }
}