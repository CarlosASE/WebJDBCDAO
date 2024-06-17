/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package mrysi.beans;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author carlos
 */
public interface EntidadDAO {
    void insert(Persona entidad) throws SQLException;
    void update(Persona entidad) throws SQLException;
    void delete(int id) throws SQLException;
    Persona read(int id) throws SQLException;
    List<Persona> readAll() throws SQLException;
}