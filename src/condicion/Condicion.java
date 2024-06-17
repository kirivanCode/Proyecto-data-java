/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicion;

/**
 *
 * @author Usuario
 */
import javax.swing.JOptionPane;
public class Condicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // programa para calcular e imprimir la devision de dos numeros
        //declaracíón de variables (tipo de dato y nombre de la variable)
        float num1,num2,result;
        
        num1 = Float.parseFloat(JOptionPane.showInputDialog("Digite el dividendo"));
        num2 = Float.parseFloat(JOptionPane.showInputDialog("Digite el divisor"));
        
        if(num2 != 0){
            result = num1/num2;
            
            JOptionPane.showMessageDialog(null, "el resultado es "+result);
        
        }
        else{
            JOptionPane.showMessageDialog(null, "no se puede dividir en cero");
        }
    }
    
}
