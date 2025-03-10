package com.helloworld;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;

public class Main {

    public static Persona jsonToPersona(String json){
        Gson gson = new Gson();
        return gson.fromJson(json, Persona.class);
    }

    public static List<Persona> jsonToPersonas(String json){
        Gson gson = new Gson();
        Type listType = new TypeToken<List<Persona>>(){}.getType();
        return gson.fromJson(json, listType);
    }

    public static void main(String[] args) {
        String json = "{ \"nombre\": \"Alberto\", \"edad\": 21 }";
        Persona persona = jsonToPersona(json);
        System.out.println(persona);

        String json2 = "[ { \"nombre\": \"Alberto\", \"edad\": 21 }, { \"nombre\": \"Pepe\", \"edad\": 21 }, { \"nombre\": \"Joe\", \"edad\": 21 } ]";
        List<Persona> personas = jsonToPersonas(json2);
        for (Persona p : personas) {
            System.out.println(p);
        }
    }
}