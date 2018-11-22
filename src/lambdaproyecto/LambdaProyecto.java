/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdaproyecto;

import java.util.*;

/**
 *
 * @author Administrador
 */
public class LambdaProyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> colores = new ArrayList();
        
        colores.add("Morado");        
        colores.add("Rojo");
        colores.add("Rosa");
        
        
        boolean hasrojo = false;
        for(String color: colores){
            if (color.equals("Rojo")) {
                hasrojo= true;
                break;
            }
        }

        System.out.println("Tiene el color " + hasrojo);
        System.out.println("Tiene el color " + colores.contains("Rojo") );

        
        
        List<Integer> lista = Arrays.asList(1,2,3,4);
        for(int num: lista ) System.out.print(num);
        
        
    }
    
}
