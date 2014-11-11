/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salcam.smarttoll.aleatorios;

import salcam.smarttoll.beans.Sensor;
import salcam.smarttoll.beans.Tag;
import salcam.smarttoll.beans.TipoEndereco;
import salcam.smarttoll.dao.SensorDAO;
import salcam.smarttoll.dao.TipoEnderecoDAO;
import salcam.smarttoll.daoImp.SensorDAOImp;
import salcam.smarttoll.daoImp.TagDAOImp;
import salcam.smarttoll.daoImp.TipoEnderecoDAOImp;

/**
 *
 * @author Samuel
 */
public class teste {
    public static void main(String[] args) {
        Sensor s = new Sensor();
        s.setSensor("s");
        s.setAtivado("a");
        s.setDescricao("huehue");
        s.setSituacao("s");
        s.setMicrocontrolador("hue");
        s.setBit("0");
        SensorDAO sdao = new SensorDAOImp();
        System.out.println(sdao.cadastroSensor(s)?"cadastrou":"nem foi");
    }
}
