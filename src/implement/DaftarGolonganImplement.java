/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implement;
import entity.DaftarGolongan;
import interfce.DaftarGolonganInterface;
import utility.koneksi;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/**
 * 985
 * @author irfan
 */
public class DaftarGolonganImplement implements DaftarGolonganInterface {

    //Untuk melakukan select / view dari tabel barang pada database ke form
    
   
    
    
    @Override
    public List<DaftarGolongan> getAll() throws SQLException {
        Statement st = koneksi.getConnection().createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM daftar_golongan");
        List<DaftarGolongan>list = new ArrayList<>();
        while(rs.next()){
            DaftarGolongan dG = new DaftarGolongan();
            dG.setId(rs.getInt("id"));
            dG.setNamaGolongan(rs.getString("nama_golongan"));
            
            list.add(dG);
        }
        return list;
    }
    
    @Override
    public DaftarGolongan insert(DaftarGolongan o) throws SQLException {
        PreparedStatement
                st = koneksi.getConnection().prepareStatement("INSERT INTO daftar_golongan VALUES(?,?)");
        st.setInt(1, o.getId());
        st.setString(2, o.getNamaGolongan());
        st.executeUpdate();
        return o;
    }

    @Override
    public void update(DaftarGolongan o) throws SQLException {
        PreparedStatement
                st = koneksi.getConnection().prepareStatement("UPDATE daftar_golongan SET nama_golongan=? WHERE id=?");
        st.setString(1, o.getNamaGolongan());
        st.setString(2, o.getId_golongan());
        
        st.executeUpdate();
    }
    
    @Override
    public void delete(String id) throws SQLException {
        PreparedStatement
                st = koneksi.getConnection().prepareStatement("DELETE FROM daftar_golongan WHERE id=?");
        st.setString(1, id);
        st.executeUpdate();
    }
}