/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package PCKDAO;
import PCKENTIDADES.*;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Administrador
 */
public class TipoItemDAO {
ConexionDB conexion = new ConexionDB();
public List<TipoItemMenu> getnombres() {
      String sql = "{call ADM_VERTIPOITEM}";
        try {
             CallableStatement cs1 = conexion.conectarbd().prepareCall(sql);
           ResultSet rs = cs1.executeQuery();
            List<TipoItemMenu> tipoItemMenus = new ArrayList<TipoItemMenu>();
            while (rs.next()) {

               TipoItemMenu oTipoItemMenu=new TipoItemMenu();
               oTipoItemMenu.setNombreTipo(rs.getString(1));
               tipoItemMenus.add(oTipoItemMenu);
                           }
            return  tipoItemMenus;
        } catch (Exception e) {
            return null;
        }
    }
}
