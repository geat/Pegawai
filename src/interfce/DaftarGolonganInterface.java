/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfce;
import entity.DaftarGolongan;
import java.sql.SQLException;
import java.util.List;

/**
 * 985
 * @author irfan
 */
public interface DaftarGolonganInterface {
   
    List getAll() throws SQLException;
    DaftarGolongan insert(DaftarGolongan o) throws SQLException;
    void update(DaftarGolongan o) throws SQLException;
    void delete(String id) throws SQLException;
}
