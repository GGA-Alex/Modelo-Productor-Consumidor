# Modelo-Productor-Consumidor

**Productor Consumidor** es un modelo de comunicación entre hilos donde un hilo produce valores y otro hilo donde consume esos valores. Todo esto de manera sincronizada.

Ambos hilos tratan de manejar valores de una zona común que se le suele llamar Monitor (también se le suele llamar Buffer) que se encarga de sincronizar la entrada y salida de valores.

## Funcionamiento del programa.

Realizar un programa que controle la entrada y salida de un estacionamiento 
- El programa consiste en un estacionamiento (lista de objetos) con un tamaño de 12. 
- El programa añade un nuevo auto (objeto) al estacionamiento (lista) con una frecuencia 0.5, 1 o 2 segundos elegida aleatoriamente por el programa.
    - El usuario puede modificar la frecuencia para añadir nuevos autos mientras el programa se encuentra corriendo.
- El programa retira un auto (objeto) del estacionamiento (lista) cada 0.5, 1 o 2 

segundos elegida aleatoriamente por el programa.
    - El usuario puede modificar la frecuencia para retirar autos mientras el programa se encuentra corriendo.

Consideraciones:
- No se pueden retirar autos si el estacionamiento está vacío.
- No se pueden añadir autos si el estacionamiento está lleno.
