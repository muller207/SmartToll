/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salcam.smarttoll.utils;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Samuel
 */
public class Alert {

    public static void Message(HttpServletResponse response, String message, String url) throws IOException {
        PrintWriter out = response.getWriter();
        out.print("<script>"
                + "alert('" + message + "');"
                + "window.location.href='" + url + "'"
                + "</script>"
        );
    }

    public static void Message(HttpServletResponse response, String message) throws IOException {
        PrintWriter out = response.getWriter();
        out.println("<script>"
                + "alert('" + message + "')"
                + "</script>");
    }
}
