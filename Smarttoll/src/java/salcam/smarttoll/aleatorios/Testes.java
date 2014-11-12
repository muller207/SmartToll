/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salcam.smarttoll.aleatorios;
import salcam.smarttoll.beans.RelacionamentoEmail;
import salcam.smarttoll.dao.RelacionamentoEmailDAO;
import salcam.smarttoll.daoImp.RelacionamentoEmailDAOImp;

/**
 *
 * @author Samuel
 */
public class Testes {

    public static boolean teste() {
        RelacionamentoEmail re = new RelacionamentoEmail();
        re.setSequencia(2);
        re.setEmail("teste");
        re.setSituacao((byte) 4);
        re.setMailing(true);
        re.setNfe(false);
        RelacionamentoEmailDAO redao = new RelacionamentoEmailDAOImp();
        return((redao.cadastroRelacionamentoEmail(re))?true:false);
    }
}
