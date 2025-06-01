package com.apibook.desafio.api.book.service;

public interface IConvierteDatos {
    <T> T obtenerDatos(String json, Class<T> clase);
}
