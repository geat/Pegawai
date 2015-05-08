/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implement;

import entity.DaftarGolongan;
import entity.Pegawai;
import interfce.PegawaiInterface;
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

public class PegawaiImplement implements PegawaiInterface{
DateUtility du = new DateUtility();    
    
    @Override
    public List<Pegawai> getAll() throws SQLException {
        Statement st = koneksi.getConnection().createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM pegawai");
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

    @Override
    public Pegawai insert(Pegawai o) throws SQLException {
        PreparedStatement
        st = koneksi.getConnection().prepareStatement("INSERT INTO pegawai (NIP,nama,tempat_lahir,tanggal_lahir,jenis_kelamin,agama,jabatan,alamat,no_telpon,tanggal_masuk,status_kawin,status_pekerjaan) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)");
        st.setString(1, o.getNip());
        st.setString(2,o.getNamaPegawai());
        st.setString(3,o.getTempatLahir());
        st.setDate(4, (Date) o.getTanggalLahir());
        st.setString(5,o.getJenisKelamin());
        st.setString(6,o.getAgama()); 
        st.setString(7,o.getJabatan());
        st.setString(8,o.getAlamat());
        st.setString(9,o.getNoTelpon());
        st.setDate(10, (Date) o.getTanggalBergabung());
        st.setString(11,o.getStatusKawin());
        st.setString(12,o.getStatusPekerjaan());
        st.executeUpdate();
        return o;
    }

    @Override
    public void update(Pegawai o) throws SQLException {
       PreparedStatement
        st = koneksi.getConnection().prepareStatement ("UPDATE pegawai SET NIP=?,nama=?,tempat_lahir=?,tanggal_lahir=?,jenis_kelamin=?,agama=?,jabatan=?,alamat=?,no_telpon=?,tanggal_masuk=?,status_kawin=?,status_pekerjaan=?  WHERE id_pegawai=?");
        st.setString(1, o.getNip());
        st.setString(2,o.getNamaPegawai());
        st.setString(3,o.getTempatLahir());
        st.setDate(4, (Date) o.getTanggalLahir());
        st.setString(5,o.getJenisKelamin());
        st.setString(6,o.getAgama()); 
        st.setString(7,o.getJabatan());
        st.setString(8,o.getAlamat());
        st.setString(9,o.getNoTelpon());
        st.setDate(10, (Date) o.getTanggalBergabung());
        st.setString(11,o.getStatusKawin());
        st.setString(12,o.getStatusPekerjaan());
        st.setString(13, o.getIdPegawai());
        st.executeUpdate();
        
        st.executeUpdate();
    }

    @Override
    public void delete(String id) throws SQLException {
        PreparedStatement
        st = koneksi.getConnection().prepareStatement("DELETE FROM pegawai WHERE id_pegawai=?");
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
