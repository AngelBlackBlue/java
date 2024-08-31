import Exceptions.CalculadoraException;

public class App {
    public static void main(String[] args) throws Exception {
        // Exepciones: eventes que interumpen el flujo normal de la aplicacion

        int numero1 = 10;
        int numero2 = 0;
        int resultado;

        Calculadora calculadora = new Calculadora();

        try {
            resultado = calculadora.dividir(numero1, numero2);
            System.out.println(resultado);

        // } catch (ArithmeticException e) {
        } catch (CalculadoraException e) {
            e.printStackTrace();
            // System.out.println("No se puede dividir por cero");

        } finally {
            System.out.println("El programa termino correctamente");
        }
    }
}
