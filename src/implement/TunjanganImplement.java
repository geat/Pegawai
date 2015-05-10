/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implement;

import view.FormTunjangan;
import entity.DaftarGolongan;
import entity.Pegawai;
import entity.Tunjangan;
import entity.viewTunjangan;
import interfce.PegawaiInterface;
import interfce.TunjanganInterface;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import utility.DateUtility;
import utility.koneksi;

/**
 *
 * @author aa
 */

public class TunjanganImplement implements TunjanganInterface{
DateUtility du = new DateUtility();    
   
    @Override
    public List<viewTunjangan> getAll() throws SQLException {
        Statement st = koneksi.getConnection().createStatement();
        ResultSet rs = st.executeQuery("select id_tunjangan,pegawai.id_pegawai,nama,tanggal,nama_tunjangan,periode_bulan,periode_tahun,nilai_tunjangan from pegawai inner join tunjangan on pegawai.id_pegawai=tunjangan.id_pegawai");
        List<viewTunjangan>list = new ArrayList<>();
        while(rs.next()){
            viewTunjangan vT = new viewTunjangan();
            
            vT.setIdTunjangan(rs.getInt("id_tunjangan"));
            vT.setIdPegawai(rs.getInt("id_pegawai"));
            vT.setNamaPegawai(rs.getString("nama"));
            vT.setTanggal(rs.getDate("tanggal"));
            vT.setNamaTunjangan(rs.getString("nama_tunjangan"));
            vT.setPeriodeBulan(rs.getString("periode_bulan"));
            vT.setPeriodeTahun(rs.getString("periode_tahun"));
            vT.setNilaiTunjangan(rs.getInt("nilai_tunjangan"));
            list.add(vT);
        }
        return list;
    }

    @Override
    public Tunjangan insert(Tunjangan o) throws SQLException {
        PreparedStatement
        st = koneksi.getConnection().prepareStatement("INSERT INTO tunjangan (id_pegawai,periode_bulan,periode_tahun,nama_tunjangan,nilai_tunjangan,tanggal) VALUES(?,?,?,?,?,?)");
        st.setInt(1,o.getIdPegawai());
        st.setString(2,o.getPeriodeBulan());
        st.setString(3,o.getPeriodeTahun());
        st.setString(4,o.getNamaTunjangan());
        st.setLong(5,o.getNilaiTunjangan());
        st.setDate(6, (Date) o.getTanggal()); 
        st.executeUpdate();
        return o;
    }

    @Override
    public void update(Tunjangan o) throws SQLException {
       PreparedStatement
        st = koneksi.getConnection().prepareStatement ("UPDATE tunjangan SET periode_bulan=?,periode_tahun=?,nama_tunjangan=?,nilai_tunjangan=?,tanggal=? WHERE id_tunjangan=? and id_pegawai=?");
        st.setString(1,o.getPeriodeBulan());
        st.setString(2,o.getPeriodeTahun());
        st.setString(3,o.getNamaTunjangan());
        st.setLong(4,o.getNilaiTunjangan());
        st.setDate(5, (Date) o.getTanggal()); 
        st.setLong(6,o.getId());
        st.setInt(7,o.getIdPegawai());
        st.executeUpdate();
//        st.executeUpdate();
//        
//        st.executeUpdate();
    }

    @Override
    public void delete(String id) throws SQLException {
        PreparedStatement
        st = koneksi.getConnection().prepareStatement("DELETE FROM tunjangan WHERE id_tunjangan=?");
        st.setString(1, id);
        st.executeUpdate();
    }

    @Override
    public List cariPegawai(String namaPegawai) throws SQLException {
       String sql="select * from pegawai where nama=?";
       PreparedStatement pst = koneksi.getConnection().prepareStatement(sql);
       pst.setString(1,namaPegawai);
       ResultSet rs=pst.executeQuery();
        
        List<Pegawai>list = new ArrayList<>();
        
      while(rs.next()){
            Pegawai p = new Pegawai();
            p.setIdPegawai(rs.getString("id_pegawai"));
            p.setNipPegawai(rs.getString("NIP"));
            p.setNamaPegawai(rs.getString("nama"));
            p.setTempatLahir(rs.getString("tempat_lahir"));
            p.setTanggalLahirPegawai(rs.getString("tanggal_lahir"));
            p.setJenisKelamin(rs.getString("Jenis_kelamin"));
            p.setAgama(rs.getString("agama"));
            p.setJabatan(rs.getString("jabatan"));
            p.setAlamat(rs.getString("alamat"));
            p.setNoTelpon(rs.getString("no_telpon"));
            p.setTanggalBergabungpegawai(rs.getString("tanggal_masuk"));
            p.setStatusKawin(rs.getString("status_kawin"));
            p.setStatusPekerjaan(rs.getString("status_pekerjaan"));
            list.add(p);
        }
    return list;
    
    
    }

 
}
