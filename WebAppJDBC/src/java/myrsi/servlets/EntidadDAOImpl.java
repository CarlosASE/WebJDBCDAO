/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package myrsi.servlets;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author carlos
 */
public class EntidadDAOImpl implements EntidadDAO {
    private Connection connection;

    public EntidadDAOImpl() {
        try {
            this.connection = ConexionMySQL.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void insert(Persona entidad) throws SQLException {
        String insertQuery = "INSERT INTO Entidades (id, nombre) VALUES (?, ?)";
        PreparedStatement ps = connection.prepareStatement(insertQuery);
        ps.setInt(1, entidad.getId());
        ps.setString(2, entidad.getNombre());
        ps.executeUpdate();
    }

    @Override
    public void update(Persona entidad) throws SQLException {
        String updateQuery = "UPDATE Entidades SET nombre = ? WHERE id = ?";
        PreparedStatement ps = connection.prepareStatement(updateQuery);
        ps.setString(1, entidad.getNombre());
        ps.setInt(2, entidad.getId());
        ps.executeUpdate();
    }

    @Override
    public void delete(int id) throws SQLException {
        String deleteQuery = "DELETE FROM Entidades WHERE id = ?";
        PreparedStatement ps = connection.prepareStatement(deleteQuery);
        ps.setInt(1, id);
        ps.executeUpdate();
    }

    @Override
    public Persona read(int id) throws SQLException {
        String readQuery = "SELECT * FROM Entidades WHERE id = ?";
        PreparedStatement ps = connection.prepareStatement(readQuery);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            return new Persona(rs.getInt("id"), rs.getString("nombre"));
        }
        return null;
    }

    @Override
    public List<Persona> readAll() throws SQLException {
        String readAllQuery = "SELECT * FROM Entidades";
        PreparedStatement ps = connection.prepareStatement(readAllQuery);
        ResultSet rs = ps.executeQuery();
        List<Persona> entidades = new ArrayList<>();
        while (rs.next()) {
            entidades.add(new Persona(rs.getInt("id"), rs.getString("nombre")));
        }
        return entidades;
    }
}