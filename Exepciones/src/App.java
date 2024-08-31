public class App {
    public static void main(String[] args) throws Exception {
        // Exepciones: eventes que interumpen el flujo normal de la aplicacion

        int numero1 = 10;
        int numero2 = 2;
        int resultado;

        try {
            resultado = numero1 / numero2;
            System.out.println(resultado);

        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("No se puede dividir por cero");

        }
    }
}
