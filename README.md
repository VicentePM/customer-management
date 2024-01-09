# API REST para Gestión de Clientes

Este proyecto Spring Boot proporciona una API REST para realizar operaciones con los clientes de una empresa que vende equipos informáticos. La base de datos utilizada es "[nombre_de_tu_BBDD]" y la tabla es "[nombre_de_tu_tabla]".

## Configuración del Proyecto

### Requisitos

- JDK 11 o superior
- Maven

### Cómo Iniciar

1. Clona este repositorio:
   ```bash
   git clone https://github.com/TuUsuario/spring-boot-clientes-api.git
   ```

2. Abre el proyecto en tu IDE de preferencia.

3. Ejecuta la aplicación.

4. Accede a los endpoints a través de tu navegador o herramienta de API testing.

## Endpoints

### Guardar Cliente (POST)

- Guarda un nuevo cliente en la base de datos.

   **Endpoint:**
   ```
   POST /api/cliente/save
   ```

   **Ejemplo de Payload:**
   ```json
   {
     "username": "cliente123",
     "password": "contrasena123",
     "email": "cliente123@example.com",
     "direccion": "Calle Ejemplo, 123",
     "telefono": 123456789,
     "comunidad_autonoma": "Ejemplo",
     "provincia": "Ejemplo",
     "ciudad": "Ejemplo"
   }
   ```

### Lista de Clientes (GET)

- Obtiene la lista completa de clientes.

   **Endpoint:**
   ```
   GET /api/clientes
   ```

### Cliente por ID (GET)

- Obtiene un cliente específico por su ID.

   **Endpoint:**
   ```
   GET /api/cliente/{id}
   ```

### Cliente por Username (GET)

- Obtiene un cliente específico por su nombre de usuario.

   **Endpoint:**
   ```
   GET /api/cliente/user/{username}
   ```

### Cliente por Email (GET)

- Obtiene un cliente específico por su dirección de correo electrónico.

   **Endpoint:**
   ```
   GET /api/cliente/email/{email}
   ```

### Clientes por Provincia (GET)

- Obtiene la lista de clientes en una provincia específica.

   **Endpoint:**
   ```
   GET /api/cliente/provincia/{provincia}
   ```

### Clientes por Comunidad Autónoma (GET)

- Obtiene la lista de clientes en una comunidad autónoma específica.

   **Endpoint:**
   ```
   GET /api/cliente/comunidad/{comunidad}
   ```

### Eliminar Cliente (DELETE)

- Elimina un cliente específico por su ID.

   **Endpoint:**
   ```
   DELETE /api/cliente/{id}
   ```

### Modificar Cliente (PUT)

- Modifica la información de un cliente específico por su ID.

   **Endpoint:**
   ```
   PUT /api/cliente/{id}
   ```

   **Ejemplo de Payload:**
   ```json
   {
     "username": "clienteModificado",
     "password": "nuevaContrasena",
     "email": "clienteModificado@example.com",
     "direccion": "Calle Modificada, 456",
     "telefono": 987654321,
     "comunidad_autonoma": "Modificada",
     "provincia": "Modificada",
     "ciudad": "Modificada"
   }
   ```

Este proyecto Spring Boot proporciona una API robusta para gestionar clientes de una empresa de equipos informáticos. ¡Explora los endpoints y realiza operaciones de CRUD con facilidad!
