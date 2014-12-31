/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salcam.smarttoll.utils;

import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfPageEventHelper;
import com.itextpdf.text.pdf.PdfWriter;

/**
 *
 * @author Administrador
 */
public class PageEventListener extends PdfPageEventHelper{

    private int pageNumumber = 0;

    @Override
    public void onStartPage(PdfWriter writer, Document document) {
        pageNumumber++;
    }
    
    
    @Override
    public void onEndPage (PdfWriter writer, Document document) {            
            ColumnText.showTextAligned(writer.getDirectContent(),
                    Element.ALIGN_CENTER, new Phrase(String.format("Página %d", writer.getPageNumber())),
                    500, 785, 0);
        }

    public int getPageNumumber() {
        return pageNumumber;
    }  
    
}
