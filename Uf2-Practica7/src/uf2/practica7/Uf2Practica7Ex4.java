/*
4. Escriu una funció anomenada “ValidarSuperusuari” que demani un password
i que el comprovi amb un text emmagatzemat en una constant interna. Si no
coincideix l’ha de tornar a demanar un màxim de 3 vegades. La funció ha de
tornar si l’usuari ha encertat o no el password.
 */
package uf2.practica7;

import java.util.*;

public class Uf2Practica7Ex4 {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        boolean correcte = false;

        ValidarSuperusuari(correcte);
    }

    public static boolean ValidarSuperusuari(boolean correcte) {
        final int numIntentos = 3;
        String contraCorrecte = "DAM-M03";
        String contrasenya = null;

        for (int i = 0; i < numIntentos && !correcte; i++) {
            System.out.println("Introdueix la contrasenya: ");
            contrasenya = scan.nextLine();
            if (contrasenya.equals(contraCorrecte)) {
                correcte = true;
                System.out.println("Contrasenya correcte. " + (i + 1) + " intents.");
            } else {
                correcte = false;
                System.out.println("Incorrecte. Prova de nou.");
            }
        }

        return correcte;
    }
}
