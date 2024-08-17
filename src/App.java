import Excepciones.CalculadoraException;

public class App
{
    public static void main(String[] args) throws Exception
    {
        int numero1 = 10, numero2 = 0, resultado;
        Calculadora calculadora = new Calculadora();

        try {
            resultado = calculadora.dividir(numero1, numero2);
            System.out.println(resultado);
        }catch (CalculadoraException e){  //Reemplazamos por nuestra Clase creada
            e.printStackTrace();  //Muestra Mensaje de ERROR que tipeamos en "CalculadoraException"
        }finally{
            System.out.println("Hemos Finalizado el Cálculo, ya sea exitoso o NO.");
        }
    }
}
