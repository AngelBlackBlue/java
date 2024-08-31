import Exceptions.CalculadoraException;
// import Exceptions.DividirPorCeroException;

public class Calculadora {

    // public int dividir (int dividendo, int divisor) throws DividirPorCeroException{
    //     if (divisor == 0) throw new DividirPorCeroException();        
    //     return dividendo / divisor;
    // }

    public int dividir (int dividendo, int divisor) throws CalculadoraException{
        if (divisor == 0) throw new CalculadoraException("No se puede dividir por cero");        
        return dividendo / divisor;
    }


}
