# Proyecto final

### Integrantes
* Jaime Eduardo Cardona
* Juan Esteban López
* Leonardo Franco Calpa

## Enunciado
### Cifrador/descifrador de archivos
El programa debe tener dos opciones: 
1. **Cifrar archivo:** Debe recibir como entrada un archivo cualquiera, y una contraseña. A partir de la contraseña, debe generarse una clave de 128 bits, empleando el algoritmo PBKDF2. Por último, el archivo debe cifrarse con el algoritmo AES, usando la clave obtenida; el resultado debe escribirse a otro archivo, que debe contener también el hash SHA-1 del archivo sin cifrar. 
2. **Descifrado:** Debe recibir como entrada un archivo cifrado y la contraseña. El programa deberá descifrar el archivo y escribir el resultado en un archivo nuevo. Luego, debe computar el hash SHA-1 del archivo descifrado y compararlo con el hash almacenado con el archivo cifrado.

## Proyecto
El programa se compone de e vistas que son el menú principal, la vista de cifrado y la vista de descrifrado. Para estas vistas se utilizó JavaFX.
* La vista del menú principal tiene las opciones para acceder a las otras dos vistas.

* La vista de Cifrado tiene los campos para ingresar el archivo de entrada (original), el archivo de salida (cifrado) y la contraseña, además, cuando se inicia el proceso de cifrado, se debe especificar el nombre del archivo que contendrá el hash SHA-1 del archivo original (archivo de entrada).
    * Luego del proceso de cifrado, se genera el hash SHA-1 del archivo original y se almaena en un nuevo archivo con el nombre previamente ingresado.

* La vista de Descifrado tiene los campos para ingresar el archivo de entrada (cifrado), el archivo de salida (descifrado), la contraseña y el archivo con el hash SHA-1 del archivo original.
    * Luego del proceso de descifrado, se genera el hash SHA-1 del archivo descifrado y se compara con el hash del archivo original (almacenado en el la ruta especificada para \"archivo SHA-1\"), y muestra un mensaje indicando si estos coinciden.



## Dificultades encontradas
Durante el proycto podriamos decir que se nos presentaron pocas dificultades. Una de las dificultades del proyecto fue como manejar el hash del archivo cifrado, lo que hicimos fue poner el hash en un archivo y cuando lo necesitaramos para verificar la comparación entre el hash del archivo original y el archivo descifrado pasar ese archivo de texto a string, se podria decir que esa fue la mayor dificultad. Otra dificultad fue que java ofrece varios estilos de cifrados AES, pero esta dificulta se resolvia leyendo la documentación que se encontraba en internet.
De igual forma, otra dificultad que se presentó es el cifrado de archivos con un tamaño superior a los 1.5 Gb, esto debido a que la memoria heap de la JVM se queda sin espacio para almacenar el nuevo objeto que es usado para cifrar el archivo y por eso el programa arroja la excepción 
``` shell
java.lang.OutOfMemoryError : java heap space
```
En últimas el tamaño minimo permitido para cifrar los archivos depende del tamaño de lamemoria heap de la JVM donde se ejecute el programa, lo cual limita el cifrado a archivos de un tamaño pequeño.


## Conclusiones
Al hacer este proyecto descubrimos que Java posee muy buenas librerias en temas de seguridad, ya que las librerias contienen muchos metodos que nos facilitaron mucho la tarea. Esto quiere decir que para futuros proyectos podemos agregar seguridad si necesidad de hacer un gran esfuerzo.

