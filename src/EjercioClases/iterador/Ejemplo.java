package EjercioClases.iterador;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;


/**
 * InnerEjemplo
 */


public class Ejemplo {
    public static void main(String[] args) {

        ArrayList<String> random = new ArrayList<String>();
        random.add("Primero");
        random.add("Segundo");
        random.add("Tercero");
        random.add("Cuarto");
        random.add("Quinto");

        for (Iterator iterator = random.iterator(); iterator.hasNext();) {
            String elemento = (String) iterator.next();
            System.err.println(elemento);

        }
        int n = 3;
        int matrizEjemplo[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        for (int i = 0; i < matrizEjemplo.length; i++) {
            for (int j = 0; j < matrizEjemplo.length; j++) {
                System.out.println(matrizEjemplo[i][j] + "\t");
            }
        }
        System.out.println("------------------");

        List<Integer> numeros = Arrays.asList(1, 4, 8, 5, 5, 10, 2);
        numeros.stream().forEach(System.out::println);
        System.out.println("------------------");

        numeros.stream().map(t -> t * 3).forEach(System.out::println);

        System.out.println("------------------");

        List<Integer> numerosAumentados = new ArrayList<>();
        numeros.stream().map(t -> t * 3).forEach(numerosAumentados::add);
        System.out.println(numeros);
        System.out.println(numerosAumentados);
        System.out.println("------------------");

        List<Integer> numerosAumentados2 = numeros.stream().map(t -> t * t).collect(Collectors.toList());
        System.out.println(numerosAumentados2);
        System.out.println("------------------");

        List<Integer> numFiltrados = numeros.stream()
                .filter(x -> x >= 4)
                .map(x -> x * x)
                .collect(Collectors.toList());
        System.out.println(numFiltrados);

        System.out.println("------------------");

        int multiplicacion = numeros.stream().reduce(1, (a, b) -> a * b);
        System.out.println(multiplicacion);
        System.out.println("------------------");

        int max = numeros.stream().reduce(1, Integer::max);
        int min = numeros.stream().reduce(1000, Integer::min);
        System.out.println("min: " + min + "\nmax: " + max);

        List<Integer> numerosx = Arrays.asList(1,9,2,10,2,4,7,4,7,1,4);
        int sumatodo = numerosx.stream().reduce(0, (a, b) -> a + b);
        int sumatodonorep = numerosx.stream().distinct().reduce(0, (a, b) -> a + b);

        System.out.println(sumatodo);
        System.out.println("------------------");



        List<Person> people = Arrays.asList(
            new Person("John", 30),
            new Person("Jane", 25),
            new Person("Bob", 35),
            new Person("Alice", 28)
        );
        Map<Integer, List<Person>> peopleByAge = people.stream()
        .collect(Collectors.groupingBy(Person::getAge));
       
        for (Map.Entry<Integer, List<Person>> entry : peopleByAge.entrySet()) {
            System.out.println("Edad: " + entry.getKey());
            for (Person person : entry.getValue()) {
                System.out.println("- " + person.getName());
            }
            System.out.println();
        }                                

    }

}


