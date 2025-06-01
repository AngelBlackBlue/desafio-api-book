package com.apibook.desafio.api.book.principal;

import com.apibook.desafio.api.book.model.Datos;
import com.apibook.desafio.api.book.model.DatosLibros;
import com.apibook.desafio.api.book.service.ConsumoAPI;
import com.apibook.desafio.api.book.service.ConvierteDatos;

import java.util.Comparator;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Stream;

public class Principal {

    private static final String URL_BASE = "https://gutendex.com/books/";

    private ConsumoAPI consumoAPI = new ConsumoAPI();

    private ConvierteDatos convierteDatos = new ConvierteDatos();

    private Scanner teclado = new Scanner(System.in);

    public void muestraElMenu(){

        var json = consumoAPI.obtenerDatos(URL_BASE);
        System.out.println(json);
        var datos = convierteDatos.obtenerDatos(json, Datos.class);
        System.out.println(datos);

        //Top 10 libros más de desargados
        System.out.println("Top 10 libros más de desargados");
        datos.resultados().stream()
                .sorted(Comparator.comparing(DatosLibros::numeroDeDescargas).reversed())
                .limit(10)
                .map(l -> l.titulo().toUpperCase())
                .forEach(System.out::println);

        //Busqueda de libros por nombre
        System.out.println("Ingrese el nombre del libro que desea buscar");
        var tituloLibro = teclado.nextLine();
        json = consumoAPI.obtenerDatos(URL_BASE + "?search=" + tituloLibro.replace(" ", "+" ));
        var datosBuscados = convierteDatos.obtenerDatos(json, Datos.class);
        Optional<DatosLibros> libroBuscado = datosBuscados.resultados().stream()
                .filter(l -> l.titulo().toUpperCase().contains(tituloLibro.toUpperCase()))
                .findFirst();

        if(libroBuscado.isPresent()){
            System.out.println("Libro Encontrado: ");
            System.out.println(libroBuscado.get());
        }else {
            System.out.println("Libro no encontrado");
        }




    }
}
