package com.inforcap.desafiomirandoelpasado;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Marca {

    public static void main(String[] args) {

// 1. Instanciar un ArrayList<>() del tipo String llamado “marcas” para generar un listado
// de marcas.
        List<String> marcas = new ArrayList<>();
// 2.-  Agregar 10 marcas que usted haya conocido e imprimirlas en consola mediante
// System.out.println.
        marcas.add("1a");
        marcas.add("2a");
        marcas.add("3a");
        marcas.add("4a");
        marcas.add("5a");
        marcas.add("6a");
        marcas.add("7a");
        marcas.add("8a");
        marcas.add("9a");
        marcas.add("10a");

        System.out.println(marcas);

        //  3. Su amiga le dice que recordó 3 marcas y le pregunta si puede agregarlas al listado.
        // Los elementos a agregar son “Blokbaster”, “Carrefour” y “Jetix”. Imprimir el nuevo
        // listado en consola.
        marcas.addAll(Arrays.asList("Blokbaster", "Carrefour", "Jetix"));
        marcas.forEach(marca -> System.out.println(marca));

        // 4. Se dan cuenta que “Blokbaster” en realidad se escribe “Blockbuster” y deciden cambiar
        // la palabra en el listado.
        // Set<String> orden = new TreeSet<>(marcas);
        marcas.remove("Blokbaster");
        marcas.forEach(marca -> System.out.println(marca));
        marcas.add("Blockbuster");
        marcas.forEach(marca -> System.out.println(marca));

        // 5. Lamentablemente, usted se da cuenta que “Carrefour” aún existe y decide borrarlo del
        // listado. Para ello, usted debe remover el elemento número 11 e imprimir el nuevo
        // listado en pantalla. Puede usar la función .remove("Carrefour") para ver si el
        // elemento se borró correctamente, ya que arrojará true si se eliminó de manera
        //correcta
        marcas.remove("Carrefour");
        marcas.forEach(marca -> System.out.println(marca));

        // 6.- Usted se inspira y decide hacer una colección aparte de marcas que podrían estar
        // fuera del mercado. Para ello, usted debe agregar marcas (las que quiera) en una nueva
        // ArrayList<>() llamada “posiblesMarcas” e incorporarlas a la lista de ”marcas”.
        List<String> posiblesMarcas = new ArrayList<>(marcas);
        posiblesMarcas.addAll(Arrays.asList("Marca 1", "Marca 2", "Marca 3"));
        posiblesMarcas.forEach(marca -> System.out.println(marca));

        // 7. A eso de las 11 de la noche, deciden ver cuántos elementos tiene este listado. Es por
        // eso que usted utiliza sus conocimientos y cuenta la cantidad de elementos que
        // contiene la lista para imprimir en pantalla.
        System.out.println(posiblesMarcas.size());

        // Dado que la fiesta no terminó ahí, y luego de un montón de risas, se acuerdan de algunos ex
        // compañeros/as del colegio y deciden anotarlos en un listado con la idea de contactarlos e
        // invitarlos a una fiesta post-pandemia. Aburrido de usar ArrayList<>(), decide usar Set<>().
        // Para ello, usted hace lo siguiente:
        // 1. Instanciar un Set<>() del tipo String llamado “invitados” para generar un listado de
        // compañeros/as. Usted le comenta a su amiga que pueden usar algo llamado
        // TreeSet<>() para listarlos ordenadamente. 
        Set<String> invitados = new TreeSet<>();

//         2. Luego de muchos recuerdos, deciden agregar los siguientes nombres: “Daniel”,
// “Paola”, “Facundo”, “Pedro”, ”Jacinta”, “Florencia” y “Juan Pablo”. 
        invitados.addAll(Arrays.asList("Daniel", "Paola", "Facundo", "Pedro", "Jacinta", "Florencia", "Juan Pablo"));
        invitados.forEach(invitado -> System.out.println(invitado));

//         3. Su amiga le dice que se acaba de acordar de 3 ex compañeros adicionales y le
// pregunta si puede agregarlos en un listado aparte de “posibles invitados”, ya que no
// les caía muy bien. Los “posibles invitados” son “Jorge”, “Francisco” y “Marcos”. Genere
// este nuevo listado, únalo con el otro e imprima en pantalla.
        Set<String> posiblesInvitados = new TreeSet<>(invitados);

        posiblesInvitados.addAll(Arrays.asList("Jorge", "Francisco", "Marcos"));
        System.out.println("-----   posiblesInvitados ------");

        posiblesInvitados.forEach(cada -> System.out.println(cada));

// 4. Lamentablemente, usted se da cuenta que es mejor no invitar a “Jorge” y decide
// eliminarlo del listado. Imprima el listado final de invitados para que comiencen a
// contactarlos lo antes posible. 
        posiblesInvitados.remove("Jorge");
        posiblesInvitados.forEach(cada -> System.out.println(cada));

        

//         1. Instanciar un Map<>() del tipo <String, Integer> llamado “golosinas” para generar un
// listado de estas. Usted le comenta a su amiga que le gustaría probar algo llamado
// TreeMap() para listarlos por claves.
        Map<String, Integer> golosinas = new TreeMap();

// 2. Deciden agregar las siguientes golosinas:
// ● Chocman a 100 pesos
// ● Trululú a 100 pesos
// ● Centella a 100 pesos
// ● Kilate a 50 pesos
// ● Miti-miti a 30 pesos
// ● Traga Traga a 150 pesos
// ● Tabletón a 5 pesos
        golosinas.put("Chocman", 100);
        golosinas.put("Trululú", 100);
        golosinas.put("Centella", 100);
        golosinas.put("Kilate", 50);
        golosinas.put("Miti-miti", 30);
        golosinas.put("Traga Traga", 150);
        golosinas.put("Tabletón", 5);
        // System.out.println(golosinas);

        System.out.println("--------- entrySet --------");
        for (Map.Entry<String, Integer> entry : golosinas.entrySet()) {
            System.out.println("Golosina: " + entry.getKey() + ", Cantidad: " + entry.getValue());
        }

        System.out.println("--------- keySet() --------");

        for (String key : golosinas.keySet()) {
            System.out.println("Golosina: " + key + ", Cantidad: " + golosinas.get(key));
        }

        System.out.println("--------- (key, value) --------");

        golosinas.forEach((key, value)
                -> System.out.println("Golosina: " + key + ", Cantidad: " + value)
        );

//        3 . Su amiga le dice que si es posible filtrar aquellas golosinas que costaban menos de
// 100 pesos para mostrar en sus redes sociales el valor del dinero en el tiempo.
        // Filtrar las golosinas con valor mayor a 100
        Map<String, Integer> filteredGolosinas = golosinas.entrySet().stream()
                .filter(entry -> entry.getValue() < 100)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        //System.out.println(filteredGolosinas);
        System.out.println("--------- (key, value) --------");
        filteredGolosinas.forEach((key, value)
                -> System.out.println("Golosina: " + key + ", Cantidad: " + value)
        );
//         Por último, y no menos importante, se acordaron de aquellos juegos de infancia junto a su
// amiga. Usted, mientras conversaba, se da cuenta que podría listarlos con un Queue. Es por
// esto que decide hacer lo siguiente:
// 1. Instanciar un Queue<>() llamado “juegos” con algo llamado LinkedList() para
// encolar.
        Queue juegos = new LinkedList<>();

// 2. Deciden agregar los siguientes juegos: Tombo, Congelado, Quemaditas, Cachipún,
// Pillarse.
        juegos.addAll(Arrays.asList("Tombo", "Congelado", "Quemaditas", "Cachipún", "Pillarse"));

// 3. Dada la hora y lo tarde de la videollamada, deciden solamente contar la cantidad de
// juegos e imprimirlos en pantalla para algún día volver a jugarlos.
        System.out.println(juegos.size());

        juegos.forEach(juego -> System.out.println(juego));

    }

}
