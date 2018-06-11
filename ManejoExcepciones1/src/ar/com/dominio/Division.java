package ar.com.dominio;

/**
 * Clase Division, para efectuar la operacion division
 *
 * @author Martin
 */

public class Division {

    //Atributo de la clase
    private int numerador;
    //Atributo de la clase
    private int denominador;

    /**
     * Construye el objeto Division
     *
     * @param numerador int
     * @param denominador int
     */
    public Division(int numerador, int denominador) throws OperationException {

        if (denominador == 0) {
            //throw new IllegalArgumentException("Denominador igual a cero");
            throw new OperationException("Denominador igual a cero");
        }
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public void visualizarOperacion() {
        System.out.println("El resultado de la division es: " + numerador / denominador);
    }
}