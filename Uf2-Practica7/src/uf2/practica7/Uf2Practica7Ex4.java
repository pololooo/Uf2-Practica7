/*
4. Escriu una funció anomenada “ValidarSuperusuari” que demani un password
i que el comprovi amb un text emmagatzemat en una constant interna. Si no
coincideix l’ha de tornar a demanar un màxim de 3 vegades. La funció ha de
tornar si l’usuari ha encertat o no el password.
 */
package uf2.practica7;

import java.util.*;

public class Uf2Practica7Ex4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
    }

    public static void ValidarSuperusuari() {
        Scanner scan = new Scanner(System.in);
        
        final int numIntents = 3;
        String contrasenya;
        
        for (int i = 0; i < numIntents; i++) {
            System.out.println("Introdueix la contrasenya: ");
            contrasenya = scan.nextLine();
        }
    }
}
