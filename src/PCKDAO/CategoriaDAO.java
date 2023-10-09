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
public class CategoriaDAO {

    ConexionDB conexion = new ConexionDB();

    public List<Categoria> getnombres(String nombreTipo) {
        String sql = "{call ADM_VERCATEGORIA(?)}";
        try {
            CallableStatement cs1 = conexion.conectarbd().prepareCall(sql);
            cs1.setString(1, nombreTipo);


            ResultSet rs = cs1.executeQuery();
            List<Categoria> categorias = new ArrayList<Categoria>();
            while (rs.next()) {

                Categoria oCategoria = new Categoria();
                oCategoria.setNombre_cat(rs.getString(1));
                categorias.add(oCategoria);

            }
            return categorias;
        } catch (Exception e) {
            return null;
        }
    }
}
