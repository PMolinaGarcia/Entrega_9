import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class CompararEnteros
{
    public static void main(String[] args)
    {
        List<Integer> lista = Arrays.asList(23, -2, 14, 3, 12, 8); //Creamos una lista de objetos Integer
        Collections.sort(lista);                                   //La ordenamos mediante un método que compara objetos, NO TIPOS PRIMITIVOS; por lo tanto, de acuerdo con el anterior ejercicio, se está utilizando Timsort
        System.out.println(lista);                                 //Imprimimos por pantalla la lista ordenada

        Persona juan = new Persona("Juan García Rodríguez", 13,
                2, 1980);
        Persona pepe = new Persona("José López Pérez", 4, 10,
                1950);
        Persona maria = new Persona("María Sánchez Martínez",
                5, 7, 2004);
        List<Persona> lista1 = Arrays.asList(juan, pepe, maria);
        Collections.sort(lista);
        System.out.println("Ordenación por nombres: " + lista1);
        Collections.sort(lista1, new ComparadorEdades());
        System.out.println("Ordenación por edades: " + lista1);

    }

}
