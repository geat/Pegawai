/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author aa
 */
public class viewTunjangan {
    private long idTunjangan;
    private int idPegawai;
    private String namaPegawai;
    private String periodeBulan;
    private String periodeTahun;
    private String namaTunjangan;
    private long nilaiTunjangan;
    private Date tanggal;
    
    public viewTunjangan(){}

    public long getIdTunjangan() {
        return idTunjangan;
    }

    public void setIdTunjangan(long idTunjangan) {
        this.idTunjangan = idTunjangan;
    }

    public int getidPegawai() {
        return idPegawai;
    }

    public void setIdPegawai(int idPegawai) {
        this.idPegawai = idPegawai;
    }

    public String getPeriodeBulan() {
        return periodeBulan;
    }

    public void setPeriodeBulan(String periodeBulan) {
        this.periodeBulan = periodeBulan;
    }

    public String getPeriodeTahun() {
        return periodeTahun;
    }

    public void setPeriodeTahun(String periodeTahun) {
        this.periodeTahun = periodeTahun;
    }
    

    public String getNamaTunjangan() {
        return namaTunjangan;
    }

    public void setNamaTunjangan(String namaTunjangan) {
        this.namaTunjangan = namaTunjangan;
    }

    public long getNilaiTunjangan() {
        return nilaiTunjangan;
    }

    public void setNilaiTunjangan(long nilaiTunjangan) {
        this.nilaiTunjangan = nilaiTunjangan;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }



    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final viewTunjangan other = (viewTunjangan) obj;
        if (this.idTunjangan != other.idTunjangan) {
            return false;
        }
        if (!Objects.equals(this.idPegawai, other.idPegawai)) {
            return false;
        }
        if (!Objects.equals(this.periodeBulan, other.periodeBulan)) {
            return false;
        }
        if (!Objects.equals(this.periodeTahun, other.periodeTahun)) {
            return false;
        }
        if (!Objects.equals(this.namaTunjangan, other.namaTunjangan)) {
            return false;
        }
        if (this.nilaiTunjangan != other.nilaiTunjangan) {
            return false;
        }
        if (!Objects.equals(this.tanggal, other.tanggal)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "viewTunjangan{" + "id=" + idTunjangan + ", pegawai=" + idPegawai + ", periodeBulan=" + periodeBulan + ", periodeTahun=" + periodeTahun + ", namaTunjangan=" + namaTunjangan + ", nilaiTunjangan=" + nilaiTunjangan + ", tanggal=" + tanggal + '}';
    }

    /**
     * @return the namaPegawai
     */
    public String getNamaPegawai() {
        return namaPegawai;
    }

    /**
     * @param namaPegawai the namaPegawai to set
     */
    public void setNamaPegawai(String namaPegawai) {
        this.namaPegawai = namaPegawai;
    }

}
