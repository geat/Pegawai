/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author WURY
 */
public class Pegawai {
    private int id;
    private String nip;
    private String namaPegawai;
    private String tempatLahir;
    private Date tanggalLahir;
    private String jenisKelamin;
    private String agama;
    private String jabatan;
    private String alamat;
    private String noTelpon;
    private Date tanggalBergabung;
    private String statusKawin;
    private String statusPekerjaan;
    private List<KeluargaPegawai> listKeluarga;
    private List<Tunjangan> listTunjangan;
    private List<Potongan> listPotongan;
    //convert
     private String idPegawai=String.valueOf(id);
     private String nipPegawai = String.valueOf(nip);
     private String tanggalLahirPegawai = String.valueOf(tanggalLahir);
     private String tanggalBergabungpegawai = String.valueOf(tanggalBergabung);
     
    public Pegawai(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNamaPegawai() {
        return namaPegawai;
    }

    public void setNamaPegawai(String namaPegawai) {
        this.namaPegawai = namaPegawai;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNoTelpon() {
        return noTelpon;
    }

    public void setNoTelpon(String noTelpon) {
        this.noTelpon = noTelpon;
    }

    public Date getTanggalBergabung() {
        return tanggalBergabung;
    }

    public void setTanggalBergabung(Date tanggalBergabung) {
        this.tanggalBergabung = tanggalBergabung;
    }

    public String getStatusKawin() {
        return statusKawin;
    }

    public void setStatusKawin(String statusKawin) {
        this.statusKawin = statusKawin;
    }

    public String getStatusPekerjaan() {
        return statusPekerjaan;
    }

    public void setStatusPekerjaan(String statusPekerjaan) {
        this.statusPekerjaan = statusPekerjaan;
    }

    public List<KeluargaPegawai> getListKeluarga() {
        return listKeluarga;
    }

    public void setListKeluarga(List<KeluargaPegawai> listKeluarga) {
        this.listKeluarga = listKeluarga;
    }

    public List<Tunjangan> getListTunjangan() {
        return listTunjangan;
    }

    public void setListTunjangan(List<Tunjangan> listTunjangan) {
        this.listTunjangan = listTunjangan;
    }

    public List<Potongan> getListPotongan() {
        return listPotongan;
    }

    public void setListPotongan(List<Potongan> listPotongan) {
        this.listPotongan = listPotongan;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (int) (this.id ^ (this.id >>> 32));
        
        hash = 37 * hash + Objects.hashCode(this.namaPegawai);
        hash = 37 * hash + Objects.hashCode(this.tempatLahir);
        hash = 37 * hash + Objects.hashCode(this.tanggalLahir);
        hash = 37 * hash + Objects.hashCode(this.jenisKelamin);
        hash = 37 * hash + Objects.hashCode(this.agama);
        hash = 37 * hash + Objects.hashCode(this.jabatan);
        hash = 37 * hash + Objects.hashCode(this.alamat);
        hash = 37 * hash + Objects.hashCode(this.noTelpon);
        hash = 37 * hash + Objects.hashCode(this.tanggalBergabung);
        hash = 37 * hash + Objects.hashCode(this.statusKawin);
        hash = 37 * hash + Objects.hashCode(this.statusPekerjaan);
        hash = 37 * hash + Objects.hashCode(this.listKeluarga);
        hash = 37 * hash + Objects.hashCode(this.listTunjangan);
        hash = 37 * hash + Objects.hashCode(this.listPotongan);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pegawai other = (Pegawai) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.nip != other.nip) {
            return false;
        }
        if (!Objects.equals(this.namaPegawai, other.namaPegawai)) {
            return false;
        }
        if (!Objects.equals(this.tempatLahir, other.tempatLahir)) {
            return false;
        }
        if (!Objects.equals(this.tanggalLahir, other.tanggalLahir)) {
            return false;
        }
        if (!Objects.equals(this.jenisKelamin, other.jenisKelamin)) {
            return false;
        }
        if (!Objects.equals(this.agama, other.agama)) {
            return false;
        }
        if (!Objects.equals(this.jabatan, other.jabatan)) {
            return false;
        }
        if (!Objects.equals(this.alamat, other.alamat)) {
            return false;
        }
        if (!Objects.equals(this.noTelpon, other.noTelpon)) {
            return false;
        }
        if (!Objects.equals(this.tanggalBergabung, other.tanggalBergabung)) {
            return false;
        }
        if (!Objects.equals(this.statusKawin, other.statusKawin)) {
            return false;
        }
        if (!Objects.equals(this.statusPekerjaan, other.statusPekerjaan)) {
            return false;
        }
        if (!Objects.equals(this.listKeluarga, other.listKeluarga)) {
            return false;
        }
        if (!Objects.equals(this.listTunjangan, other.listTunjangan)) {
            return false;
        }
        if (!Objects.equals(this.listPotongan, other.listPotongan)) {
            return false;
        }
        return true;
    }

    /**
     * @return the nipPegawai
     */
    public String getNipPegawai() {
        return nipPegawai;
    }

    /**
     * @param nipPegawai the nipPegawai to set
     */
    public void setNipPegawai(String nipPegawai) {
        this.nipPegawai = nipPegawai;
    }

    /**
     * @return the idPegawai
     */
    public String getIdPegawai() {
        return idPegawai;
    }

    /**
     * @param idPegawai the idPegawai to set
     */
    public void setIdPegawai(String idPegawai) {
        this.idPegawai = idPegawai;
    }

    /**
     * @return the tanggalLahirPegawai
     */
    public String getTanggalLahirPegawai() {
        return tanggalLahirPegawai;
    }

    /**
     * @param tanggalLahirPegawai the tanggalLahirPegawai to set
     */
    public void setTanggalLahirPegawai(String tanggalLahirPegawai) {
        this.tanggalLahirPegawai = tanggalLahirPegawai;
    }

    /**
     * @return the tanggalBergabungpegawai
     */
    public String getTanggalBergabungpegawai() {
        return tanggalBergabungpegawai;
    }

    /**
     * @param tanggalBergabungpegawai the tanggalBergabungpegawai to set
     */
    public void setTanggalBergabungpegawai(String tanggalBergabungpegawai) {
        this.tanggalBergabungpegawai = tanggalBergabungpegawai;
    }

    public void get(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

}