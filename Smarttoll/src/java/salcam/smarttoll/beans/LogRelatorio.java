/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salcam.smarttoll.beans;

import java.util.Date;

/**
 *
 * @author Administrador
 */
public class LogRelatorio {
    
    private int logCod;
    private int funcionarioCod;
    private byte tipoRelatorioCod;
    private Date data;
    private String ipAdministrativo;
    private String instrucaoSql;

    public LogRelatorio() {
    }

    public int getLogCod() {
        return logCod;
    }

    public void setLogCod(int logCod) {
        this.logCod = logCod;
    }

    public int getFuncionarioCod() {
        return funcionarioCod;
    }

    public void setFuncionarioCod(int funcionarioCod) {
        this.funcionarioCod = funcionarioCod;
    }

    public byte getTipoRelatorioCod() {
        return tipoRelatorioCod;
    }

    public void setTipoRelatorioCod(byte tipoRelatorioCod) {
        this.tipoRelatorioCod = tipoRelatorioCod;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getIpAdministrativo() {
        return ipAdministrativo;
    }

    public void setIpAdministrativo(String ipAdministrativo) {
        this.ipAdministrativo = ipAdministrativo;
    }

    public String getInstrucaoSql() {
        return instrucaoSql;
    }

    public void setInstrucaoSql(String instrucaoSql) {
        this.instrucaoSql = instrucaoSql;
    }
            
}
