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
public class UsuarioDAO {

    ConexionDB conexion = new ConexionDB();

    public List<Usuario> getAll() {
        String sql = "{call ADM_VERUSU}";
        try {
            CallableStatement cs1 = conexion.conectarbd().prepareCall(sql);
            ResultSet rs = cs1.executeQuery();
            List<Usuario> oUsuarios = new ArrayList<Usuario>();
            while (rs.next()) {
                Usuario oUsuario = new Usuario();
                Cargo oCargo = new Cargo();
                oUsuario.setIdusu(rs.getInt(1));
                oUsuario.setNomusuario(rs.getString(2));
                oUsuario.setPass(rs.getString(3));
                /////
                oCargo.setNombre(rs.getString(4));
                oUsuario.setoCargo(oCargo);
                /////

                oUsuario.setNombre(rs.getString(5));
                oUsuario.setApellido(rs.getString(6));
                oUsuario.setDni(rs.getString(7));
                oUsuario.setE_mail(rs.getString(8));
                oUsuario.setHra_entrada(rs.getString(9));
                oUsuario.setHra_salida(rs.getString(10));
                oUsuario.setTelefono(rs.getString(11));
                oUsuario.setEstado(rs.getString(12));
                oUsuarios.add(oUsuario);
            }
            return oUsuarios;
        } catch (Exception e) {
            return null;
        }
    }

    public Boolean ins_usuario(Usuario oUsuario) {
        String sql = "{call ADM_INSUSUARIO(?,?,?,?,?,?,?,?,?,?,?)}";
        try {
            CallableStatement cs1 = conexion.conectarbd().prepareCall(sql);
            cs1.setString(1, oUsuario.getNomusuario());
            cs1.setString(2, oUsuario.getPass());
            cs1.setString(3, oUsuario.getoCargo().getNombre());
            cs1.setString(4, oUsuario.getNombre());
            cs1.setString(5, oUsuario.getApellido());
            cs1.setString(6, oUsuario.getDni());
            cs1.setString(7, oUsuario.getE_mail());
            cs1.setString(8, oUsuario.getHra_entrada());
            cs1.setString(9, oUsuario.getHra_salida());
            cs1.setString(10, oUsuario.getTelefono());
            cs1.setString(11, oUsuario.getEstado());
            cs1.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.print("Error de Insercion" + ex.getMessage());
            return null;

        }
    }

    public Usuario login(String usuario, String clave) {
        Usuario oUsuario = new Usuario();
        Cargo oCargo = new Cargo();
        String sql = "{call PA_LOGIN_USUARIO(?,?)}";
        try {
           //conexion.conectarbd();
            CallableStatement cs1 = conexion.conectarbd().prepareCall(sql);
            cs1.setString(1, usuario);
            cs1.setString(2, clave);
            ResultSet rs = cs1.executeQuery();
            while (rs.next()) {

                oUsuario.setIdusu(rs.getInt(1));
                oUsuario.setNomusuario(rs.getString(2));
                oUsuario.setNombre(rs.getString(3));
                oUsuario.setApellido(rs.getString(4));
                /////
                oCargo.setNombre(rs.getString(5));
                oUsuario.setoCargo(oCargo);
                /////

                return oUsuario;
            }
            return null;

        } catch (SQLException ex) {
            System.out.print("Error de Logeo" + ex.getMessage());
            return null;

        }

    }
}
