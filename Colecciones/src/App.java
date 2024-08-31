import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenidos a la fiesta de los superhéroes");

        List<String> superHeoes = new ArrayList<>(); 
        // ArrayList permite elementos repetidos, estan ordenados y se puede ingresa por indice

        superHeoes.add("Iron Man");
        superHeoes.add("Spiderman");
        superHeoes.add("Capitan America");
        superHeoes.add("Hulk");
        superHeoes.add("Thor");
        superHeoes.add("Black Widow");

        if (superHeoes.contains("Iron Man")) {
            System.out.println("Iron Man esta en la fiesta");           
        }

        // Se fue de la fiesta Black Widow
        superHeoes.remove(5);

        if (!superHeoes.contains("Black Widow")) {
            System.out.println("Black Widow se fue de la fiesta");
        }

        System.out.println("Hay un superhéroe en la fiesta que está ebrio, el superhéroe es: " + superHeoes.get(0));

        superHeoes.set(0, "Tony Stark");

        System.out.println("El superhéroe se saco el traje de Iron Man y ahora es: " + superHeoes.get(0));
        
        // Thor se fue de la fiesta y volvio
        superHeoes.add("Thor");

        if (superHeoes.isEmpty()) {
            System.out.println("No hay superhéroes en la fiesta");
        } else {
            System.out.println("Hay " + superHeoes.size() + " superhéroes en la fiesta");
        }

        System.out.println("Los superhéroes en la fiesta son: " );
        for (String superHeroe : superHeoes) {
            System.out.println(superHeroe);
        }

    }
}



// // SET

// import java.util.Set;
// // import java.util.HashSet;
// // import java.util.TreeSet;
// import java.util.LinkedHashSet;

// public class App {
//     public static void main(String[] args) throws Exception {
//         System.out.println("Bienvenidos a la fiesta de los superhéroes");

//         // Set<String> superHeoes = new HashSet<>(); // HashSet no permite elementos
//         // repetidos

//         // Set<String> superHeoes = new TreeSet<>(); // TreeSet ordena los elementos de
//         // forma ascendente

//         Set<String> superHeoes = new LinkedHashSet<>(); // LinkedHashSet los ordena de la forma en que fueron agregados

//         superHeoes.add("Iron Man");
//         superHeoes.add("Spiderman");
//         superHeoes.add("Capitan America");
//         superHeoes.add("Hulk");
//         superHeoes.add("Thor");
//         superHeoes.add("Black Widow");

//         if (superHeoes.contains("Iron Man")) {
//             System.out.println("Iron Man esta en la fiesta");
//         }

//         // Se fue de la fiesta Black Widow
//         superHeoes.remove("Black Widow");

//         if (!superHeoes.contains("Black Widow")) {
//             System.out.println("Black Widow se fue de la fiesta");
//         }

//         // Thor se fue de la fiesta y volvio
//         superHeoes.add("Thor");

//         if (superHeoes.isEmpty()) {
//             System.out.println("No hay superhéroes en la fiesta");
//         } else {
//             System.out.println("Hay " + superHeoes.size() + " superhéroes en la fiesta");
//         }

//         System.out.println("Los superhéroes en la fiesta son: ");
//         for (String superHeroe : superHeoes) {
//             System.out.println(superHeroe);
//         }

//     }
// }
