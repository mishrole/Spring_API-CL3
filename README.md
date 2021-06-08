# Ejercicio 4 | API CL3

## Local
La base de datos se encuentra en la raíz del repositorio con el nombre de [DB_CL3.sql](https://github.com/mishrole/Spring_API-CL3/blob/main/DB_CL3.sql)

La API utiliza el puerto **9393**, y puede ser consultada a través de [http://localhost:9393/](http://localhost:9393/)

Por defecto será redireccionado a la [documentación de la API con Swagger](http://localhost:9393/swagger-ui.html)

- Producto
  - Listar todos los Productos: [http://localhost:9393/rest/producto](http://localhost:9393/rest/producto)
  - Buscar un Producto [http://localhost:9393/rest/producto/{id}](http://localhost:9393/rest/producto/1)
  - Listar Productos por Categoría: [http://localhost:9393/rest/producto/filtro/{id}](http://localhost:9393/rest/producto/filtro/1)
- Categoría
  - Listar todas las Categorías: [http://localhost:9393/rest/categoria](http://localhost:9393/rest/categoria)
  - Buscar una Categoría: [http://localhost:9393/rest/categoria/{id}](http://localhost:9393/rest/categoria/1)
  
> Nota:
> 
> La cadena de conexión en el [application.properties](https://github.com/mishrole/Spring_API-CL3/blob/main/src/main/resources/application.properties) utiliza el puerto **3306** y el usuario y contraseña por defecto
> ```
> spring.datasource.url = jdbc:mysql://localhost:3306/db_cl3?serverTimezone=UTC
>spring.datasource.username = root
>spring.datasource.password = mysql
> ```

## Heroku
La API se encuentra deployada en Heroku, y puede ser consultada a través de [https://rodriguez-leon-mitchell.herokuapp.com/](https://rodriguez-leon-mitchell.herokuapp.com/)

Por defecto será redireccionado a la [documentación de la API con Swagger](https://rodriguez-leon-mitchell.herokuapp.com/swagger-ui.html)

- Producto
  - Listar todos los Productos: [https://rodriguez-leon-mitchell.herokuapp.com/rest/producto](https://rodriguez-leon-mitchell.herokuapp.com/rest/producto)
  - Buscar un Producto: [https://rodriguez-leon-mitchell.herokuapp.com/rest/producto/{id}](https://rodriguez-leon-mitchell.herokuapp.com/rest/producto/1)
  - Listar Productos por Categoría: [https://rodriguez-leon-mitchell.herokuapp.com/rest/producto/filtro/{id}](https://rodriguez-leon-mitchell.herokuapp.com/rest/producto/filtro/1)
- Categoría
  - Listar todas las Categorías: [https://rodriguez-leon-mitchell.herokuapp.com/rest/categoria](https://rodriguez-leon-mitchell.herokuapp.com/rest/categoria)
  - Buscar una Categoría: [https://rodriguez-leon-mitchell.herokuapp.com/rest/categoria/{id}](https://rodriguez-leon-mitchell.herokuapp.com/rest/categoria/1)
  
> Nota:
>
> Los datos de conexión en el [application.properties](https://github.com/mishrole/Spring_API-CL3/blob/heroku/src/main/resources/application.properties) apuntan a ClearDB MySQL, una DBaaS de Heroku.
> 
> Por seguridad, estos datos son manejados con variables de entorno (*Heroku -> App -> Settings -> Config Vars*)
> ```
> spring.datasource.url = ${SPRING_DATASOURCE_URL}
>spring.datasource.username = ${SPRING_DATASOURCE_USERNAME}
>spring.datasource.password = ${SPRING_DATASOURCE_PASSWORD}
> ```