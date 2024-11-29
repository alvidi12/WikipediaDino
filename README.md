Proyecto LoginApp para una búsqueda de información sobre dinosarios establecidos.

* El archivo contiene packetes de datos con las clases necesarias para interactuar con la interfaz de dinosaurios, ejecutandose en Apache NetBeans para cargar además los archivos de conexión a la base de datos en la librería, como el mysql-connector-j-9.1.0 y JDK 22 (default).
* Una vez entrado al programa con las librerias y el archivo LoginApp, cargar el archivo a la base de datos XAMPP Control Panel para acceder al usuario de la aplicacion (logindb.sql).

  Este archivo está estructurado con Package para cada clase específica:
  -Por defecto : Se encuentra la clase MAIN, encargado de juntar las clases.
  -Controlador: Package que incluye la clase LoginController, ésta se encargará dedar paso al funcionamiento de la interfaz llamada Login, haciendo llamados con sus metodos correspondientes para interactuar con botones de inicio sesión y llamado de datos de usuario en la base de datos.
  -Modelo: Package que contiene las clases: Conexion: Encargada de establecer la conexión con nuestra base de datos desde la interfaz.
                                            Usuario: Contenido de la información de usuario y credenciales para acceder posteriormente a la BD establecida desde la clase Conexion.  
                                            UsuarioDAO: Clase encargada de intereactuar con la base de datos y realizar las operaciones dadas por el usuario.
  -Vista: Package con los paneles Jframe, en el se encuentra la interfaz que interactuaran con el usuario, para acceder a la informacion de dinosaurios siempre y cuando se ejecute el inicio sesión del usuario. 
  -FondoPanel: Package con imagenes de dinosaurios para trabajarlo en la interfaz para el fondo y botones.
  -Libraries: Contiene o debe tener los archivos mysql-connector-j-9.1.0 y JDK 22 (default) para que logre ejecutar el programa y acceder a la base de datos.


* Ejecutando el Login Dinosaurio.
- Ejecutar el XAMPP Control Panel y comenzar la conexión de Apache y MySQL antes de iniciar el programa para no tener problemas con el acceso.
- Se inicia ejecutando el MAIN, que corresponde al llamado de las clases creadas con las funcionalidad para acceder tanto a la base de datos como para interactuar con la interfaz.
- Se abrirá una ventana de bienvenida en donde se solicitará ingresar el nombre de usuario y su contraseña (admin , admin), una vez asertado la información se mostrará el panel de dinosarios, arrojara un error si los datos ingresados no son correctos.
- La pantalla mostrará una cantidad de dinosaurios que podrá escoger para obtener más información sobre ellos, haciendo clic en un botón de dinosaurio.
- Mosrtará la información del dinosaurio elegido junto a una imagen representativo, y en la parte inferior de la ventana se encontrará un botón para regresar a la ventana principal para seleccionar otro dinosario.
- Para salir solo basta con hacer clic en el botón salir de la esquina superior.



Elaborado por: Camila González Zúñiga
               Andy Villarroel Díaz
