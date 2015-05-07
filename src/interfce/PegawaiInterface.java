/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfce;


import entity.Pegawai;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author aa
 */
public interface PegawaiInterface {
    List getAll() throws SQLException;
    Pegawai insert(Pegawai o) throws SQLException;
    void update(Pegawai o) throws SQLException;
    void delete(String id) throws SQLException;
}
