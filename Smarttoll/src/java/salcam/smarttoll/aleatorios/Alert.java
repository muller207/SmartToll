/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salcam.smarttoll.aleatorios;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Samuel
 */
public class Alert {
    public Alert(HttpServletResponse response, String mensagem){
        try {
            PrintWriter out = response.getWriter();
            out.print("<hmtl><script>alert('"+mensagem+"')</script></html>");
        } catch (IOException ex) {
            Logger.getLogger(Alert.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
