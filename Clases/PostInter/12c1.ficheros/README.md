# Ejemplo de escritura/lectura de ficheros de Objetos

## Prueba de lectura de objetos sin el bytecode para la deserialización (encapsulación en el objeto)

Probamos solo a leer del fichero de objetos:

```java
	public static void main(String args[]) 
	{
		//AppPersonaje.crearPersonajes();
		AppPersonaje.leerPersonajes();
	}
```

Y borramos el bytecode de la clase Personaje: Personaje.class.

```bash
>dir *.class
20/04/2022  11:24               940 AppPersonaje.class
20/04/2022  11:17             1.900 IOPersonaje.class
               2 archivos          2.840 bytes
```

En tiempo de ejecución lanzará la excepción **ClassNotFoundException**

```bash
>java AppPersonaje
Clase Personaje no existe
[]
```