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

        boolean correcte = false;

        ValidarSuperusuari(correcte);
    }

    public static boolean ValidarSuperusuari(boolean correcte) {
        Scanner scan = new Scanner(System.in);

        final int numIntentos = 3;
        int numError = 0;
        String contraCorrecte = "DAM-M03";
        String contrasenya = null;

        do {
            for (int i = 0; i < numIntentos; i++) {
                System.out.println("Introdueix la contrasenya: ");
                contrasenya = scan.nextLine();
                if (contrasenya.equals(contraCorrecte)) {
                    correcte = true;
                    System.out.println("Contrasenya correcte. " + numError + " intents.");
                } else {
                    correcte = false;
                    numError++;
                    System.out.println("Incorrecte. Prova de nou.");
                }
            }
        } while (correcte = false);

        scan.close();

        return correcte;
    }
}
