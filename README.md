# Implementación de un Árbol Binario en Java

Este proyecto es una implementación básica de un Árbol Binario de Búsqueda (BST) en Java, diseñado para interactuar mediante la consola.

¿Qué es un árbol binario?
Un árbol binario es una estructura de datos no lineal en la que cada elemento (llamado "nodo") tiene como máximo dos "hijos" (uno izquierdo y uno derecho). 

En este caso, implementamos un **Árbol Binario de Búsqueda**, que tiene una regla especial para mantener los datos organizados:
* Los números menores que el nodo raíz se colocan a su izquierda.
* Los números mayores que el nodo raíz se colocan a su derecha.
Esta estructura permite buscar, insertar y ordenar datos de una manera muy rápida y eficiente.

¿Cómo se implementó?
El proyecto está construido en Java y se divide en tres partes principales:
1. **Clase Nodo:** Representa la estructura básica, almacenando un número entero y los enlaces hacia sus posibles hijos (izquierdo y derecho).
2. **Clase ArbolBinario:** Contiene la lógica del programa usando métodos para:
   * **Insertar:** Acomodar un nuevo número respetando la regla de menores a la izquierda y mayores a la derecha.
   * **Mostrar inorden:** Recorrer el árbol visitando primero el lado izquierdo, luego la raíz y luego el lado derecho. Esto da como resultado los números ordenados de menor a mayor.
   * **Buscar:** Navegar por las ramas preguntando si el número buscado es mayor o menor que el nodo actual para encontrarlo rápidamente.
3. **Clase Main:** Utiliza la clase `Scanner` para mostrar un menú interactivo en la consola, permitiendo al usuario ejecutar las operaciones anteriores.
4.  Tarea realizada por el estudiante juan pablo rojas arboleda.

## Ejemplo de ejecución en consola


<img width="1919" height="1029" alt="Captura de pantalla 2026-03-23 215509" src="https://github.com/user-attachments/assets/d10d0c15-91b5-450e-abe7-1a6ff6498e26" />
<img width="1919" height="1030" alt="Captura de pantalla 2026-03-23 215516" src="https://github.com/user-attachments/assets/156a3249-bd5c-4c3a-afec-f6813a33666e" />
