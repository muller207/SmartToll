/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salcam.smarttoll.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import salcam.smarttoll.beans.Caixa;
import salcam.smarttoll.dao.CaixaDAO;
import salcam.smarttoll.daoImp.CaixaDAOImp;

/**
 *
 * @author Administrador
 */
public class Connect {


    public static void main(String[] args) throws SQLException {
        Caixa c = new Caixa();
        c.setCaixaCod(1011);
        c.setSerial("TESTE");
        c.setSituacao(true);
        c.setSemPararPraca(545);
        c.setSequencialArquivoNela(5565);
        c.setSequencialArquivoTag(1145);
        c.setIp("1.0.0.1");
        c.setTipo(123);
        CaixaDAO cdao = new CaixaDAOImp();
        if (cdao.cadastroCaixa(c)) {
            System.out.println("Cadastrou");
        } else {
            System.out.println("Nem Cadastrou");
        }
    }
}
