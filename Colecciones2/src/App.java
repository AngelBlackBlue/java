import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenido a nuestra de verdulerías");

        Map<String, Double> invetario = new HashMap<>();

        invetario.put("Banana", 1.6);
        invetario.put("Manzana", 1.5);
        invetario.put("Pera", 1.7);
        invetario.put("Naranja", 1.4);
        invetario.put("Uva", 1.1);
        invetario.put("Melón", 1.3);

        System.out.println("El inventario de verduras es: ");

        for (String fruta : invetario.keySet()) {
            System.out.println(fruta + ": $" + invetario.get(fruta));
        }

        String frutaBuscada = "Pito";


        if (invetario.containsKey(frutaBuscada)) {
            System.out.println("La fruta " + frutaBuscada + " está en el inventario");
        } else {
            System.out.println("La fruta " + frutaBuscada + " no está en el inventario");
        } 


    }
}
