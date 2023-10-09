/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package PCKDAO;

import java.util.List;
import PCKENTIDADES.*;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author Administrador
 */
public class CargoDAO {
ConexionDB conexion = new ConexionDB();
public List<Cargo> getnombres() {
      String sql = "{call ADM_VERNOMCARGOS}";
        try {
             CallableStatement cs1 = conexion.conectarbd().prepareCall(sql);
           ResultSet rs = cs1.executeQuery();
            List<Cargo> nomcargos = new ArrayList<Cargo>();
            while (rs.next()) {
                Cargo oCargo=new Cargo();
                oCargo.setNombre(rs.getString(1));
               nomcargos.add(oCargo);

            }
            return nomcargos;
        } catch (Exception e) {
            return null;
        }
    }
}
