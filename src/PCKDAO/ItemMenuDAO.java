/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PCKDAO;

import PCKENTIDADES.*;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrador
 */
public class ItemMenuDAO {

    ConexionDB conexion = new ConexionDB();

    public ItemMenu Buscar_id(Integer id) {
        String sql = "{call  ADM_VERITEM_id(?)}";
        try {
            CallableStatement cs1 = conexion.conectarbd().prepareCall(sql);
            cs1.setInt(1, id);
            ResultSet rs = cs1.executeQuery();
            if (rs.next()) {
                ItemMenu oItemMenu = new ItemMenu();
                oItemMenu.setIdItem(rs.getInt(1));
                oItemMenu.setNombre_item(rs.getString(2));

                System.out.println(oItemMenu.getNombre_item());

                Categoria oCategoria = new Categoria();
                oCategoria.setNombre_cat(rs.getString(3));
                oItemMenu.setoCategoria(oCategoria);

                SubCategoria oSubCategoria = new SubCategoria();
                oSubCategoria.setNombre_sub(rs.getString(4));
                oItemMenu.setOsuCategoria(oSubCategoria);

                oItemMenu.setDescripcion(rs.getString(5));
                oItemMenu.setPrecio(rs.getDouble(6));
                return oItemMenu;
            }

            return null;

        } catch (Exception e) {
            return null;
        }
    }

    public Boolean updateItem(ItemMenu oItemMenu) {
        String sql = "{call ADM_UPDITEM(?,?,?,?,?,?)}";
        try {
            CallableStatement cs1 = conexion.conectarbd().prepareCall(sql);
            cs1.setString(1, oItemMenu.getoCategoria().getNombre_cat());
            cs1.setString(2, oItemMenu.getOsuCategoria().getNombre_sub());
            cs1.setString(3, oItemMenu.getNombre_item());
            cs1.setString(4, oItemMenu.getDescripcion());
            cs1.setDouble(5, oItemMenu.getPrecio());
            cs1.setInt(6, oItemMenu.getIdItem());
            cs1.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Boolean insertItem(ItemMenu oItemMenu) {
        String sql = "{call ADM_INSITEM(?,?,?,?,?)}";
        try {
            CallableStatement cs1 = conexion.conectarbd().prepareCall(sql);
            cs1.setString(1, oItemMenu.getoCategoria().getNombre_cat());
            cs1.setString(2, oItemMenu.getOsuCategoria().getNombre_sub());
            cs1.setString(3, oItemMenu.getNombre_item());
            cs1.setString(4, oItemMenu.getDescripcion());
            cs1.setDouble(5, oItemMenu.getPrecio());

            cs1.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.print("Error de Insercion" + ex.getMessage());
            return null;

        }
    }

    public List<ItemMenu> getAll() {
        String sql = "{call ADM_VERITEMS}";
        try {
            CallableStatement cs1 = conexion.conectarbd().prepareCall(sql);
            ResultSet rs = cs1.executeQuery();
            List<ItemMenu> oItemMenus = new ArrayList<ItemMenu>();
            while (rs.next()) {
                ItemMenu oItemMenu = new ItemMenu();
                oItemMenu.setIdItem(rs.getInt(1));

                oItemMenu.setNombre_item(rs.getString(2));

                Categoria oCategoria = new Categoria();
                oCategoria.setNombre_cat(rs.getString(3));
                oItemMenu.setoCategoria(oCategoria);


                SubCategoria oSubCategoria = new SubCategoria();
                oSubCategoria.setNombre_sub(rs.getString(4));
                oItemMenu.setOsuCategoria(oSubCategoria);

                oItemMenu.setDescripcion(rs.getString(5));
                oItemMenu.setPrecio(rs.getDouble(6));

                oItemMenus.add(oItemMenu);
            }
            return oItemMenus;
        } catch (SQLException e) {
            return null;
        }
    }
}
