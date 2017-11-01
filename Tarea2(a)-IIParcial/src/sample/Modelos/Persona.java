package sample.Modelos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Persona {
    public String nombre;
    public String apellido;
    public int edad;


    private static Persona[] listaPersonas = {
            new Persona("David", "Delcid", 21),
            new Persona("David", "Martinez", 22),
            new Persona("Tulio", "Garcia", 23),
            new Persona("Marco", "Funez", 35),
            new Persona("Carlos", "Becerra", 40),
            new Persona("Marco", "Lanza", 24),
            new Persona("Julio", "Lopez", 27),
    };

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public static Persona buscarPorPosicion(int posicion) {
        try {
            return listaPersonas[posicion];
        } catch (IndexOutOfBoundsException e) {
            return null;
        }
    }

    public static Persona buscarPorNombre(String nombre) {
        for (int i = 0; i < listaPersonas.length; i++) {
            if (listaPersonas[i].nombre.equals(nombre)) {
                return listaPersonas[i];
            }
        }
        return null;
    }

    public static void busquedaGlobal(String texto) {
        for (int i = 0; i < listaPersonas.length; i++) {
            Pattern patron = Pattern.compile(texto);
            Matcher emparejador = patron.matcher(listaPersonas[i].nombre + " " + listaPersonas[i].apellido);
            Boolean esCoincidencia = emparejador.find();
            if (esCoincidencia) {
                System.out.println(listaPersonas[i].nombre + " " + listaPersonas[i].apellido + " " + listaPersonas[i].edad);
            }
        }


    }

    public static void busquedaInicial(String busca){
        for (int i = 0;i<listaPersonas.length;i++){
            if (listaPersonas[i].nombre.startsWith(busca)){
                System.out.println(listaPersonas[i].nombre + " " + listaPersonas[i].apellido + " " + listaPersonas[i].edad);
            }
        }
    }

}

