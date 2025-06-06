# Desafio Api Book

![Java](https://img.shields.io/badge/Java-21-blue?logo=java)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5.0-brightgreen?logo=spring-boot)
![Maven](https://img.shields.io/badge/Maven-3.9.9-orange?logo=apache-maven)
![Jackson Databind](https://img.shields.io/badge/Jackson%20Databind-2.19.0-yellow?logo=jackson)

Este proyecto es una aplicación Java basada en Spring Boot que consume la API pública de [Gutendex](https://gutendex.com/) para mostrar información sobre libros, incluyendo los más descargados y estadísticas de descargas.

## Características

- Muestra el top 10 de libros más descargados.
- Permite buscar libros por nombre.
- Muestra estadísticas de descargas (media, máximo, mínimo, suma total y cantidad de registros).

## Estructura del Proyecto

- `src/main/java/com/apibook/desafio/api/book/`  
  Código fuente principal de la aplicación.

## Requisitos

- Java 21
- Maven 3.9.9+

## Instalación y Ejecución

1. Clona el repositorio.
2. Compila el proyecto:
   ```sh
   ./mvnw clean install
   ```
3. Ejecuta la aplicación:
   ```sh
   ./mvnw spring-boot:run
   ```

## Uso

Al iniciar la aplicación, se mostrará en consola el top 10 de libros más descargados. Luego podrás buscar un libro por nombre y ver estadísticas de descargas.
