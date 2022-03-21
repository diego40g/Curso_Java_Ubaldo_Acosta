/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variables;

/**
 *
 * @author User-PC
 */
public class Variables {

    public static void main(String[] args) {
        //Definimos la varaible
        int miVariableEntera=10;
        System.out.println(miVariableEntera);
        //Modifcando el valor de la varaible
        miVariableEntera = 5;
        System.out.println(miVariableEntera);
        
        String miVaraibleCadena="Saludos";
        System.out.println(miVaraibleCadena);
        miVaraibleCadena="Adios";
        System.out.println(miVaraibleCadena);
        
        //var-Inferencia de tipos en Java
        var miVariableEntera2=10;
        System.out.println(miVariable2);
    }
    
}
