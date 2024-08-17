package Excepciones;

public class CalculadoraException extends Exception
{
    // Atributos:
    String decripcion;
    
    // Contructor:
    public CalculadoraException(String decripcion)
    {
        this.decripcion = decripcion;
    }
    
    // Getters y Setters:
    public String getDecripcion()
    {
        return decripcion;
    }
    public void setDecripcion(String decripcion)
    {
        this.decripcion = decripcion;
    }
    
    @Override
    public String getMessage()
    {
        return getDecripcion();
    }
}
