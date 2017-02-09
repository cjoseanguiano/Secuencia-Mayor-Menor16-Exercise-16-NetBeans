/*
16. Leer una secuencia se números y mostrar cuales de ellos es el mayor y el menor, el proceso
finalizará cuando se introduzca un número impar.
 */
package secuenciamayormenor;

import javax.swing.JOptionPane;

/**
 *
 * @author carlosjoseanguiano
 */
public class SecuenciaMayorMenor {

    public static void main(String[] args) {
        int mayor = 0;
        int menor = 0;
        int valorTomar;
        valorTomar = Integer.parseInt(JOptionPane.showInputDialog("Valor de numero"));
        mayor = valorTomar;
        menor = valorTomar;
        do {

            valorTomar = Integer.parseInt(JOptionPane.showInputDialog("Valor de numero"));

            if (valorTomar > mayor) {
                mayor = valorTomar;
            }
            if (valorTomar < menor) {
                menor = valorTomar;
            }
        } while ((valorTomar % 2) == 0);
        System.out.println("El mayor es : " + mayor);
        System.out.println("El menor es : " + menor);

    }

}
