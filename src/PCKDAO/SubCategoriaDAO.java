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
public class SubCategoriaDAO {

    ConexionDB conexion = new ConexionDB();

    public List<SubCategoria> getnombres(String nombreCat) {
        String sql = "{call ADM_VERSUBCAT(?)}";
        try {
            CallableStatement cs1 = conexion.conectarbd().prepareCall(sql);
            cs1.setString(1, nombreCat);
            ResultSet rs = cs1.executeQuery();
            List<SubCategoria> subCategorias = new ArrayList<SubCategoria>();
            while (rs.next()) {
                SubCategoria oSubCategoria = new SubCategoria();
                oSubCategoria.setNombre_sub(rs.getString(1));
                subCategorias.add(oSubCategoria);
            }
            return subCategorias;
        } catch (Exception e) {
            return null;
        }
    }
}
