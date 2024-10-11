# Catchup-Platform

Este proyecto es una plataforma para gestionar fuentes favoritas (**FavoriteSource**) utilizando **Java**, **Spring Boot** y el patrón **CQRS** (Separación de Comandos y Consultas). El proyecto sigue los principios de **Clean Architecture** para asegurar una separación clara de las responsabilidades y facilitar el mantenimiento.

## Tabla de Contenidos

- [Descripción](#descripción)
- [Arquitectura](#arquitectura)
- [Instalación](#instalación)
- [Uso](#uso)
- [API Endpoints](#api-endpoints)
- [Tecnologías](#tecnologías)
- [Contribución](#contribución)
- [Licencia](#licencia)

## Descripción

La plataforma permite a los usuarios gestionar sus fuentes favoritas con las operaciones CRUD (Crear, Leer, Actualizar, Eliminar) mediante una API REST. Implementa el patrón **CQRS** para separar las responsabilidades entre comandos y consultas, mejorando la escalabilidad y la organización del código.

## Arquitectura

El proyecto sigue la estructura de **Clean Architecture**. Está dividido en las siguientes capas:

- **Domain (Dominio)**: Contiene las entidades centrales, como `FavoriteSource`, que representan el estado del dominio.
- **Application (Aplicación)**: Contiene la lógica de negocio, como los servicios de comandos y consultas.
- **Infrastructure (Infraestructura)**: Contiene los repositorios y la lógica relacionada con la persistencia de datos.
- **Web**: Contiene los controladores que manejan las solicitudes HTTP y exponen la API REST.

## Instalación

### Prerrequisitos

- **Java 17** o superior
- **Maven** o **Gradle**
- **Git**

### Pasos de instalación

1. Clona este repositorio:
    ```bash
    git clone <URL-del-repositorio>
    ```

2. Navega al directorio del proyecto:
    ```bash
    cd catchup-platform
    ```

3. Construye el proyecto con **Maven**:
    ```bash
    mvn clean install
    ```

4. Ejecuta la aplicación:
    ```bash
    mvn spring-boot:run
    ```

## Uso

La aplicación expone una API REST para realizar operaciones CRUD sobre las fuentes favoritas (**FavoriteSource**). Por defecto, utiliza una base de datos H2 en memoria, accesible a través de la consola de H2.

### Acceder a la consola de H2:
- URL: `http://localhost:8080/h2-console`
- JDBC URL: `jdbc:h2:mem:testdb`
- Usuario: `sa`
- Contraseña: *(vacío)*

## API Endpoints

| Método | Endpoint            | Descripción                        |
|--------|---------------------|------------------------------------|
| GET    | `/api/favorites`     | Listar todas las fuentes favoritas |
| GET    | `/api/favorites/{id}`| Obtener una fuente por su ID       |
| POST   | `/api/favorites`     | Crear una nueva fuente             |
| PUT    | `/api/favorites/{id}`| Actualizar una fuente existente    |
| DELETE | `/api/favorites/{id}`| Eliminar una fuente existente      |

### Ejemplo de solicitud para crear una fuente:

**POST** `/api/favorites`
```json
{
  "name": "Fuente de Noticias",
  "url": "https://example.com",
  "description": "Una fuente de noticias confiable."
}

