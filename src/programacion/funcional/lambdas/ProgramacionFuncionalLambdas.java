package programacion.funcional.lambdas;

import java.util.*;

public class ProgramacionFuncionalLambdas {

    public static void main(String[] args) {
        
        // -------------- FORMA IMPERATIVA --------------------------
        
        /*for(Integer e : Arrays.asList(2,3, 9, 3, 5)){
            System.out.println("Numero en turno: " + e);
        }*/
        
        // ---------------- FORMA DECLARATIVA 1 ------------------------
        
        /*Arrays.asList(1,2,3,4,5,6,7).forEach(
                n -> System.out.println("Numero: " + n ));
        */
     
        // ---------------- FORMA DECLARATIVA 2 ------------------------
        
        Arrays.asList(9,8,7,6,5,4,3,2).forEach(System.out::println);
    }
    
}
