/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salcam.smarttoll.aleatorios;

/**
 *
 * @author Administrador
 */
public class Codifica {
    
    public static String codifica(String pass) {
        String mascara = "#$%$^%*@" + (char) 13 + (char) 12;
        int aux = 13;
        String cAux = "";
        int ponM = 0;
        pass = pass.replace("''", "'");
        for (int ponS = 0; ponS < pass.length(); ponS++) {
            if(ponM<=7)
                cAux += (char) ((int) pass.charAt(ponS) ^ ((int) mascara.charAt(ponM)));
            else{
                cAux += (char) ((int) pass.charAt(ponS) ^ (aux));
                aux--;
            }
            ponM++;
            if (ponM > mascara.length()-1) {
                ponM = 0;
                aux = 13;
            }
        }
        cAux = cAux.replace("'", "''");
        return cAux;
    }
    
}
