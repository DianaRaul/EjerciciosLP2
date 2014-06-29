/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio3;
import javax.swing.JOptionPane;

/**
 *
 * @author Diana
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        
        int x,y,r,proceso;
        x=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del entero X"));
        y=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del entero Y"));
        if (x<=0 || x>255)
        {
            r=-1;
            JOptionPane.showMessageDialog(null,"Resultado "+r);
        }
    
    
}
