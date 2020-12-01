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


## Conclusiones