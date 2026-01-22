package dto;

import repository.ConexionDB; 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonaDAO {
    

    public void listaPersonas() {
        String sql = "SELECT * FROM persona"; 
        try (Connection con = ConexionDB.conectar();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            
            System.out.println("--- Listado de Personas ---");
            
            while (rs.next()) {

                int id = rs.getInt("id"); 
                String nombre = rs.getString("nombre");
                
                System.out.println("ID: " + id + " | Nombre: " + nombre);
            }
            
        } catch (SQLException e) {
            System.err.println("Error al listar personas: " + e.getMessage());
        }
    }
}