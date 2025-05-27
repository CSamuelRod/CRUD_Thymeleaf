🌟 CRUD Thymeleaf con Spring Boot, Hibernate y MySQL
Proyecto básico para gestionar usuarios con operaciones CRUD (Crear, Leer, Actualizar, Eliminar) utilizando Spring Boot, Thymeleaf y Hibernate con MySQL como base de datos.
Presentación elegante con Thymeleaf y estilos CSS para una interfaz amigable y funcional.

🔍 Descripción
Este proyecto demuestra cómo construir una aplicación web sencilla y funcional para administrar usuarios. Utiliza:

Spring Boot para la configuración y el backend.

Hibernate (vía Spring Data JPA) para el manejo de la persistencia de datos.

MySQL como base de datos relacional.

Thymeleaf para renderizar vistas HTML dinámicas.

CSS para mejorar la apariencia visual y la experiencia del usuario.

🚀 Tecnologías usadas
Tecnología	Descripción
Java 17+	Lenguaje principal
Spring Boot	Framework backend
Hibernate	ORM para gestión de base de datos
MySQL	Base de datos relacional
Thymeleaf	Motor de plantillas para vistas
CSS	Estilos visuales para la interfaz

🛠 Funcionalidades principales
✅ Crear nuevos usuarios

✅ Listar todos los usuarios existentes

✅ Editar datos de usuarios

✅ Eliminar usuarios

✅ Visualizar detalles individuales


src/
 ├─ main/
 │   ├─ java/
 │   │    └─ com.example.crudthymeleaf/
 │   │         ├─ controller/    # Controladores web
 │   │         ├─ model/         # Entidad User
 │   │         ├─ repository/    # Interfaces JPA
 │   │         └─ service/       # Lógica de negocio
 │   ├─ resources/
 │       ├─ static/css/          # Archivos CSS
 │       ├─ templates/           # Vistas Thymeleaf (.html)
 │       └─ application.properties # Configuración de Spring y MySQL

