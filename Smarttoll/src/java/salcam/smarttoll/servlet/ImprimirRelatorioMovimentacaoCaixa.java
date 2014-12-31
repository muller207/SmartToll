/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salcam.smarttoll.servlet;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import salcam.smarttoll.dao.CaixaMovimentoDAO;
import salcam.smarttoll.dao.CaixaMovimentoDetalheDAO;
import salcam.smarttoll.daoImp.CaixaMovimentoDAOImp;
import salcam.smarttoll.daoImp.CaixaMovimentoDetalheDAOImp;
import salcam.smarttoll.utils.PageEventListener;
import sun.misc.BASE64Decoder;

/**
 *
 * @author Administrador
 */
public class ImprimirRelatorioMovimentacaoCaixa extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
        HttpSession session = request.getSession(false);
        CaixaMovimentoDAO cdao = new CaixaMovimentoDAOImp();
        String s = (String) session.getAttribute("condicao");
        String tipo = (String) request.getParameter("tipo");
        ResultSet rs = cdao.consultaCaixaMovimento(s);
        
        Document doc = new Document(PageSize.A4);
            
        try {
            PdfWriter writer = PdfWriter.getInstance(doc, new FileOutputStream("C:\\Users\\administrador.SALCAM\\Desktop\\asd.pdf"));
            PageEventListener event = new PageEventListener();
            writer.setPageEvent(event);
            
            doc.open();
            
            PdfPTable table = new PdfPTable(6);
            table.setWidthPercentage(100);
            table.setSpacingBefore(10);          
            float[] larguras = {1,2.7f,2,2,2,2};
            table.setWidths(larguras);
            table.setHeaderRows(4);
            table.setFooterRows(1);
            
            Font normal = new Font(Font.FontFamily.HELVETICA, 9);
            Font negrito = new Font(Font.FontFamily.HELVETICA, 9, Font.BOLD);            
            Font tit = new Font(Font.FontFamily.HELVETICA, 16, Font.BOLD);
            
            
            PdfPCell titulo = new PdfPCell(new Paragraph("Movimentações de Caixa",tit));
            titulo.setColspan(6);            
            titulo.setFixedHeight(30);
            titulo.setHorizontalAlignment(Element.ALIGN_CENTER);
            titulo.setBorderWidthBottom(0);
//            titulo.setBorderWidthRight(0);
            
//            PdfPCell pagina = new PdfPCell(new Paragraph("Pagina: "+event.getPageNumumber()));
//            pagina.setVerticalAlignment(Element.ALIGN_MIDDLE);
//            pagina.setBorderWidthBottom(0);
//            pagina.setBorderWidthLeft(0);
            
            PdfPCell periodo = new PdfPCell(new Paragraph("Periodo: "+session.getAttribute("inicio")+ " à "+session.getAttribute("fim"),new Font(Font.FontFamily.HELVETICA, 11)));
            periodo.setColspan(4);
            periodo.setFixedHeight(20);
            periodo.setBorder(PdfPCell.LEFT);
            
            Date today = new Date();
            SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy    HH:mm");
            PdfPCell emissao = new PdfPCell(new Paragraph("Emissão: "+sd.format(today),new Font(Font.FontFamily.HELVETICA, 11)));
            emissao.setColspan(2);
            emissao.setBorder(PdfPCell.RIGHT);
            emissao.setHorizontalAlignment(Element.ALIGN_RIGHT);
            
            PdfPCell rodape = new PdfPCell(new Paragraph("SmartToll - Salcam", normal));
            rodape.setColspan(6);
            rodape.setHorizontalAlignment(Element.ALIGN_CENTER);                        
            
            PdfPCell caixa = new PdfPCell(new Paragraph("Caixa",negrito));
            caixa.setBorderWidthRight(0);
            caixa.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            PdfPCell cod = new PdfPCell(new Paragraph("Cód. Movimentação",negrito));
            cod.setBorderWidthLeft(0);
            cod.setBorderWidthRight(0);
            cod.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            PdfPCell abertura = new PdfPCell(new Paragraph("Abertura",negrito));
            abertura.setBorderWidthLeft(0);
            abertura.setBorderWidthRight(0);
            abertura.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            PdfPCell fechamento = new PdfPCell(new Paragraph("Fechamento",negrito));
            fechamento.setBorderWidthLeft(0);
            fechamento.setBorderWidthRight(0);
            fechamento.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            PdfPCell funcionario = new PdfPCell(new Paragraph("Funcionário",negrito));
            funcionario.setBorderWidthLeft(0);
            funcionario.setBorderWidthRight(0);
            funcionario.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            PdfPCell movimentacao = new PdfPCell(new Paragraph("Movimentação",negrito));
            movimentacao.setBorderWidthLeft(0);
            movimentacao.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            table.addCell(titulo);
//            table.addCell(pagina);
            table.addCell(periodo);
            table.addCell(emissao);            
            table.addCell(caixa);
            table.addCell(cod);
            table.addCell(abertura);
            table.addCell(fechamento);
            table.addCell(funcionario);
            table.addCell(movimentacao);
            table.addCell(rodape);            
            
            boolean gray = true;
            while(rs.next()){                
                int codMov = rs.getInt("CAIXAS_MOVIMENTOS_CODIGO");
                caixa = new PdfPCell(new Paragraph(String.valueOf(rs.getInt("CAIXA_CODIGO")),normal));
                cod = new PdfPCell(new Paragraph(String.valueOf(codMov),normal));                                
                abertura = new PdfPCell(new Paragraph(rs.getDate("DATA_ABERTURA").toString(),normal));                                
                fechamento = new PdfPCell(new Paragraph(rs.getDate("DATA_FECHAMENTO").toString(),normal));                                
                funcionario = new PdfPCell(new Paragraph(rs.getString("FUNCIONARIO"),normal));                                
                movimentacao = new PdfPCell(new Paragraph("000",normal));
                                
                caixa.setHorizontalAlignment(Element.ALIGN_CENTER);
                cod.setHorizontalAlignment(Element.ALIGN_CENTER);
                abertura.setHorizontalAlignment(Element.ALIGN_CENTER);
                fechamento.setHorizontalAlignment(Element.ALIGN_CENTER);
                funcionario.setHorizontalAlignment(Element.ALIGN_CENTER);
                movimentacao.setHorizontalAlignment(Element.ALIGN_CENTER);
            
                if(tipo.equals("res")){
                    caixa.setBorder(PdfPCell.LEFT);
                    cod.setBorder(PdfPCell.NO_BORDER);
                    abertura.setBorder(PdfPCell.NO_BORDER);
                    fechamento.setBorder(PdfPCell.NO_BORDER);
                    funcionario.setBorder(PdfPCell.NO_BORDER);
                    movimentacao.setBorder(PdfPCell.RIGHT);
                }else{
                    caixa.setBorderWidthRight(0);
                    caixa.setBorderWidthLeft(1.2f);
                    caixa.setBorderWidthTop(1.2f);                    
                    caixa.setBorderWidthBottom(1.2f);
                    cod.setBorder(PdfPCell.BOTTOM);
                    caixa.setBorderWidthTop(1.2f);                    
                    caixa.setBorderWidthBottom(1.2f);
                    caixa.setBorderWidthTop(1.2f);                    
                    caixa.setBorderWidthBottom(1.2f);
                    abertura.setBorder(PdfPCell.BOTTOM);
                    caixa.setBorderWidthTop(1.2f);                    
                    caixa.setBorderWidthBottom(1.2f);
                    caixa.setBorderWidthTop(1.2f);                    
                    caixa.setBorderWidthBottom(1.2f);
                    fechamento.setBorder(PdfPCell.BOTTOM);
                    caixa.setBorderWidthTop(1.2f);                    
                    caixa.setBorderWidthBottom(1.2f);
                    caixa.setBorderWidthTop(1.2f);                    
                    caixa.setBorderWidthBottom(1.2f);
                    funcionario.setBorder(PdfPCell.BOTTOM);
                    caixa.setBorderWidthTop(1.2f);                    
                    caixa.setBorderWidthBottom(1.2f);
                    caixa.setBorderWidthTop(1.2f);                    
                    caixa.setBorderWidthBottom(1.2f);
                    movimentacao.setBorderWidthLeft(0);
                    movimentacao.setBorderWidthTop(0);
                    movimentacao.setBorderWidthLeft(0);
                    movimentacao.setBorderWidthTop(0);
                }
                
                if(!tipo.equals("det") && gray){
                    caixa.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    cod.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    abertura.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    fechamento.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    funcionario.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    movimentacao.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    gray=false;
                }else{
                    if(tipo.equals("det")){
                        caixa.setBackgroundColor(BaseColor.GRAY);
                        cod.setBackgroundColor(BaseColor.GRAY);
                        abertura.setBackgroundColor(BaseColor.GRAY);
                        fechamento.setBackgroundColor(BaseColor.GRAY);
                        funcionario.setBackgroundColor(BaseColor.GRAY);
                        movimentacao.setBackgroundColor(BaseColor.GRAY);
                    }
                    gray=true;
                }
                               
                table.addCell(caixa);
                table.addCell(cod);
                table.addCell(abertura);
                table.addCell(fechamento);
                table.addCell(funcionario);
                table.addCell(movimentacao);
                
                if(tipo.equals("det")){
                    CaixaMovimentoDetalheDAO cmdao = new CaixaMovimentoDetalheDAOImp();
                    ResultSet detalhes = cmdao.consultaCaixaMovimentoDetalhe(" WHERE CAIXAS_MOVIMENTOS_CODIGO = "+codMov);
                   
                    PdfPTable nestled = new PdfPTable(9);
                    nestled.setWidthPercentage(100);
                    float[] largurasNestled = {1.1f,.8f,.47f,.4f,.5f,1f,.7f,.65f,.65f};
                    nestled.setWidths(largurasNestled);
                    
                    PdfPCell clear = new PdfPCell();
                    clear.setColspan(6);
                    
                    boolean cabecalho = true;
                    
                    while(detalhes.next()){
                        PdfPCell lancamento;
                        PdfPCell tipoPag;
                        PdfPCell tarifa;
                        PdfPCell recebido;
                        PdfPCell classificacao;
                        PdfPCell descricao;
                        PdfPCell placa;
                        PdfPCell eixosSimples;
                        PdfPCell eixosComerciais;

                        if(cabecalho){
                            cabecalho = false;                        
                            lancamento = new PdfPCell(new Paragraph("Lançamento",negrito));
                            lancamento.setBorder(PdfPCell.NO_BORDER);
                            lancamento.setHorizontalAlignment(Element.ALIGN_CENTER);

                            tipoPag = new PdfPCell(new Paragraph("Tipo de Pgto.",negrito));
                            tipoPag.setBorder(PdfPCell.NO_BORDER);	
                            tipoPag.setHorizontalAlignment(Element.ALIGN_CENTER);

                            tarifa = new PdfPCell(new Paragraph("Tarifa",negrito));
                            tarifa.setBorder(PdfPCell.NO_BORDER);
                            tarifa.setHorizontalAlignment(Element.ALIGN_CENTER);

                            recebido = new PdfPCell(new Paragraph("Pago",negrito));
                            recebido.setBorder(PdfPCell.NO_BORDER);
                            recebido.setHorizontalAlignment(Element.ALIGN_CENTER);

                            classificacao = new PdfPCell(new Paragraph("Class.",negrito));
                            classificacao.setBorder(PdfPCell.NO_BORDER);
                            classificacao.setHorizontalAlignment(Element.ALIGN_CENTER);

                            descricao = new PdfPCell(new Paragraph("Descrição",negrito));
                            descricao.setBorder(PdfPCell.NO_BORDER);
                            descricao.setHorizontalAlignment(Element.ALIGN_CENTER);

                            placa = new PdfPCell(new Paragraph("Placa",negrito));
                            placa.setBorder(PdfPCell.NO_BORDER);
                            placa.setHorizontalAlignment(Element.ALIGN_CENTER);

                            eixosSimples = new PdfPCell(new Paragraph("Eixos Sim.",negrito));
                            eixosSimples.setBorder(PdfPCell.NO_BORDER);
                            eixosSimples.setHorizontalAlignment(Element.ALIGN_CENTER);

                            eixosComerciais = new PdfPCell(new Paragraph("Eixos Com.",negrito));
                            eixosComerciais.setBorder(PdfPCell.NO_BORDER);
                            eixosComerciais.setHorizontalAlignment(Element.ALIGN_CENTER);

                            nestled.addCell(lancamento);
                            nestled.addCell(tipoPag);
                            nestled.addCell(tarifa);
                            nestled.addCell(recebido);            
                            nestled.addCell(classificacao);
                            nestled.addCell(descricao);
                            nestled.addCell(placa);
                            nestled.addCell(eixosSimples);
                            nestled.addCell(eixosComerciais);
                            clear.addElement(nestled);
                            table.addCell(clear);
                            
                            nestled.deleteBodyRows();
                            clear = new PdfPCell();
                            clear.setColspan(6);
                        }
                       
                        lancamento = new PdfPCell(new Paragraph(detalhes.getDate("LANCAMENTO").toString(), normal));
                        tipoPag = new PdfPCell(new Paragraph("PAGAMENTO", normal));//detalhes.getDate("LANCAMENTO"), normal));
                        tarifa = new PdfPCell(new Paragraph(String.valueOf(detalhes.getFloat("TARIFA")), normal));
                        recebido = new PdfPCell(new Paragraph(String.valueOf(detalhes.getFloat("VALOR_PAGO")), normal));
                        classificacao = new PdfPCell(new Paragraph(detalhes.getString("CLASSIFICACAO"), normal));
                        descricao = new PdfPCell(new Paragraph(detalhes.getString("DESCRICAO"), normal));
                        placa = new PdfPCell(new Paragraph(detalhes.getString("PLACA"), normal));
                        eixosSimples = new PdfPCell(new Paragraph(detalhes.getString("EIXOS_CLASSIFICACAO")+"/"+detalhes.getString("EIXOS_SENSOR"), normal));
                        eixosComerciais = new PdfPCell(new Paragraph(detalhes.getString("EIXOS_COMERCIAL_CLASSIFICACAO")+"/"+detalhes.getString("EIXOS_COMERCIAL_SENSOR"), normal));
                        
                        if(gray){
                            lancamento.setBackgroundColor(BaseColor.LIGHT_GRAY);
                            tipoPag.setBackgroundColor(BaseColor.LIGHT_GRAY);
                            tarifa.setBackgroundColor(BaseColor.LIGHT_GRAY);
                            recebido.setBackgroundColor(BaseColor.LIGHT_GRAY);
                            classificacao.setBackgroundColor(BaseColor.LIGHT_GRAY);
                            descricao.setBackgroundColor(BaseColor.LIGHT_GRAY);
                            placa.setBackgroundColor(BaseColor.LIGHT_GRAY);
                            eixosSimples.setBackgroundColor(BaseColor.LIGHT_GRAY);
                            eixosComerciais.setBackgroundColor(BaseColor.LIGHT_GRAY);
                            gray=false;
                        }else{
                            gray=true;
                        }
                        
                        /*lancamento.setBorderWidthRight(0);
                        lancamento.setBorderWidthTop(0);
                        tipoPag.setBorder(PdfPCell.BOTTOM);
                        tarifa.setBorder(PdfPCell.BOTTOM);
                        recebido.setBorder(PdfPCell.BOTTOM);
                        classificacao.setBorder(PdfPCell.BOTTOM);
                        descricao.setBorder(PdfPCell.BOTTOM);
                        placa.setBorder(PdfPCell.BOTTOM);
                        eixosSimples.setBorder(PdfPCell.BOTTOM);
                        eixosComerciais.setBorderWidthLeft(0);
                        eixosComerciais.setBorderWidthTop(0);*/
                        
                        lancamento.setBorder(PdfPCell.NO_BORDER);
                        tipoPag.setBorder(PdfPCell.NO_BORDER);
                        tarifa.setBorder(PdfPCell.NO_BORDER);
                        recebido.setBorder(PdfPCell.NO_BORDER);
                        classificacao.setBorder(PdfPCell.NO_BORDER);
                        descricao.setBorder(PdfPCell.NO_BORDER);
                        placa.setBorder(PdfPCell.NO_BORDER);
                        eixosSimples.setBorder(PdfPCell.NO_BORDER);
                        eixosComerciais.setBorder(PdfPCell.NO_BORDER);
                        
                        nestled.addCell(lancamento);
                        nestled.addCell(tipoPag);
                        nestled.addCell(tarifa);
                        nestled.addCell(recebido);            
                        nestled.addCell(classificacao);
                        nestled.addCell(descricao);
                        nestled.addCell(placa);
                        nestled.addCell(eixosSimples);
                        nestled.addCell(eixosComerciais);
                        clear.addElement(nestled);                    
                        table.addCell(clear);
                        
                        nestled.deleteBodyRows();
                        clear = new PdfPCell();
                        clear.setColspan(6);
                    }
//                    clear.addElement(nestled);
//                    table.addCell(clear);
                }
            }            
            doc.add(table);
        } catch (Exception e) {
            System.out.println("Erro");
        }
        doc.close();
        
        response.setHeader("application/pdf", "Content-Type");
        response.setContentType("application/pdf");
        File f = new File("C:\\Users\\administrador.SALCAM\\Desktop\\asd.pdf");
        FileInputStream fis = new FileInputStream(f);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buf = new byte[1000000];
        int br;
        while((br = fis.read(buf, 0, buf.length)) != -1){
            baos.write(buf, 0, br);
        }
        response.getOutputStream().write(baos.toByteArray(), 0, baos.toByteArray().length);        
        baos.close();
        fis.close();
        f.delete();
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>    

}
