Agenda de contactos versión 22/01/21
========================================================

NOTAS GENERALES
---------------

Aplicación web en Java que simule una agenda de contactos.

· Al cargar la url base del proyecto se mostrará un formulario con los campos correspondientes para almacenar un contacto. 

· Se crea la clase POJO Contacto, con los atributos necesarios para almacenar los datos con sus correspondientes métodos para poder operar con ellos posteriormente.

· Los datos recogidos del formulario se mapean con la clase Contacto y se almacenan en una lista en memoria, por ejemplo un ArrayList de elementos Contacto.

· Se crea una función para comprobar que el email del contacto introducido a través del formulario no existe ya en el listado de contactos. 
De ser así, el contacto se almacenará en el listado, en caso contrario, no se almacenará, informando al usuario con un mensaje en la vista. 

· Una vez almacenados los datos del nuevo contacto, mostrar en una vista, el listado de contactos almacenados en la lista en memoria.

· Se modifica el programa para que el listado de contactos aparezca en la misma vista dónde se encuentra el formulario (index.jsp).

· Usar CSS para mostrar al usuario un mensaje en rojo informando en la vista si se ha podido almacenar o no el contacto.

·Se implementa funcionalidad adicional a la solicitada y/o se usan librerías de terceros de forma correcta y conveniente, 
siguiendo la documentación de la misma y siendo su uso coherente en el contexto de la aplicación (detallar en el fichero README.txt que debe acompañar a la aplicación).

NOTAS ESPECIFICAS
-----------------

La agenda comienza completamente en blanco, para ver contactos solo hay que añadir nuevos.

OTRAS CONSIDERACIONES
---------------------

No se consideran.