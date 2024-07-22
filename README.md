# Backend: Customer Service API

Este proyecto es un servicio backend para gestionar información de clientes. Está construido con Spring Boot y proporciona una API REST para consultar datos de clientes.

## Tecnologías Utilizadas

- Java 21
- Spring Boot 3.3.2
- Maven
- Lombok
- SLF4J (para logging)
- AWS (para despliegue)

## Configuración del Entorno de Desarrollo

1. **Clonar el Repositorio**
    ```bash
    git clone https://github.com/tu-usuario/customer-service-api.git
    cd customer-service-api
    ```

2. **Configurar el Archivo `application.properties`**
    Configura las propiedades necesarias en `src/main/resources/application.properties`. Ejemplo:
    ```properties
    server.port=8090
    spring.datasource.url=jdbc:mysql://localhost:3306/tu_basededatos
    spring.datasource.username=tu_usuario
    spring.datasource.password=tu_contraseña
    ```

3. **Compilar y Ejecutar la Aplicación**
    ```bash
    mvn clean install
    mvn spring-boot:run
    ```

## Endpoints

- **POST /api/customers/find**: Consulta la información básica de un cliente.
    - Parámetros de entrada (JSON): `documentType`, `documentNumber`
    - Respuesta: Información del cliente en formato JSON.
    - Códigos de estado HTTP:
        - **200 OK**: Consulta exitosa.
        - **400 Bad Request**: Solicitud incorrecta (p. ej., tipo de documento no válido).
        - **404 Not Found**: Cliente no encontrado.
        - **500 Internal Server Error**: Error interno del servidor.

## Datos Mockeados

Los datos de respuesta son mockeados, es decir, solo se retornará información para el cliente identificado con Cedula de ciudadanía 10121314.

## Manejo de Errores

- **400 Bad Request**: Solicitud incorrecta.
- **404 Not Found**: Cliente no encontrado.
- **500 Internal Server Error**: Error interno del servidor.

## Despliegue en AWS Elastic Beanstalk

1. **Instalar AWS CLI y Elastic Beanstalk CLI**
    ```bash
    pip install awscli awsebcli
    ```

2. **Configurar AWS CLI**
    ```bash
    aws configure
    ```

3. **Inicializar el Entorno de Elastic Beanstalk**
    ```bash
    eb init
    ```

4. **Crear y Desplegar la Aplicación**
    ```bash
    eb create customer-service-env
    eb deploy
    ```

## Logging

Los logs se guardan en el archivo `logs/app.log` por defecto. Puedes cambiar esta configuración en el archivo `logback.xml`.

## Contacto

- **Nombre**: Alejandro Segura
- **Correo**: miguielsegura618@gmail.com
- **Teléfono**: +57-3504856459
