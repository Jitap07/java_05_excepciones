import Excepciones.CalculadoraException;

public class Calculadora
{
    public int dividir (int dividendo, int divisor) throws CalculadoraException
    {
        if (divisor == 0)
        {
            throw new CalculadoraException("NO SE PUEDE DIVIDIR POR CERO.");
        }
        
        return dividendo / divisor;
    }
}
