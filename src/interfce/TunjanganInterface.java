/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfce;



import entity.Tunjangan;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author aa
 */
public interface TunjanganInterface {
    List getAll() throws SQLException;
    Tunjangan insert(Tunjangan o) throws SQLException;
    void update(Tunjangan o) throws SQLException;
    void delete(String id) throws SQLException;
    List cariPegawai(String namTunjangan) throws SQLException;
}
