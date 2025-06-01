package com.apibook.desafio.api.book.principal;

import com.apibook.desafio.api.book.model.Datos;
import com.apibook.desafio.api.book.service.ConsumoAPI;
import com.apibook.desafio.api.book.service.ConvierteDatos;

public class Principal {

    private static final String URL_BASE = "https://gutendex.com/books/";

    private ConsumoAPI consumoAPI = new ConsumoAPI();

    private ConvierteDatos convierteDatos = new ConvierteDatos();

    public void muestraElMenu(){

        var json = consumoAPI.obtenerDatos(URL_BASE);
        System.out.println(json);
        var datos = convierteDatos.obtenerDatos(json, Datos.class);
        System.out.println(datos);


    }
}
