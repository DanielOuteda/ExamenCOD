/*
 * Examen Refactorizacion
 * 
 */
package lovivido;

import javax.swing.JOptionPane;

public class LoVivido {

    public static void main(String[] args) {
        String nombre;
        String edad;

        int mes;
        int dia;
        int horas;
        int cuenta;

        nombre = JOptionPane.showInputDialog("Escriba su nombre: ");
        edad = JOptionPane.showInputDialog("Escriba su edad: ");

        cuenta = Integer.parseInt(edad);

        mes = (cuenta * 12);
        dia = (cuenta * 365);
        horas = (dia * 24);

        JOptionPane.showMessageDialog(null, "Meses: " + mes, "Numero de meses vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Días: " + dia, "Numero de días vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Horas: " + horas, "Numero de horas vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);

    }

}
