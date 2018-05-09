package ec.edu.ister.modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author Cristian David Calle Muñoz 
            Instituto Tecnoligico Rumuñahui 
            Cuarto Sistemas
 */
public class LE {
   public static char leerChar1(String mensaje) {
        //do{
        char c = ' ';

        try {

            if (mensaje.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Error... no se ha ingresado valor");

            }
            if (mensaje.length() > 1) {
                

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        // }while (mensaje.isEmpty() || mensaje.length() > 1) ;

        c = mensaje.charAt(0);
        return c;

    }

}
