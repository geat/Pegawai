/*
 * *********************************************
 *      BY WURIYANTO
 * EMAIL/FACEBOOK : wuriyanto48@yahoo.co.id  OR  Prince Wuriyanto
 * WEBSITE : wuriyantoinformatika.blogspot.com
 * STATE BANJARNEGARA CENTRAL JAVA INDONESIA
 * INFORMATIC ENGINEERING
 * MUHAMMADIYAH UNIVERSITY OF PURWOKERTO
 * NB:BEBAS DIDISTRIBUSIKAN UNTUK TUJUAN BELAJAR
 */

package entity;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author WURY
 */
public class Tunjangan {
    private long id;
    private Pegawai pegawai;
    private String periodeBulan;
    private String periodeTahun;
    private String namaTunjangan;
    private long nilaiTunjangan;
    private Date tanggal;
    
    public Tunjangan(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Pegawai getPegawai() {
        return pegawai;
    }

    public void setPegawai(Pegawai pegawai) {
        this.pegawai = pegawai;
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
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 23 * hash + Objects.hashCode(this.pegawai);
        hash = 23 * hash + Objects.hashCode(this.periodeBulan);
        hash = 23 * hash + Objects.hashCode(this.periodeTahun);
        hash = 23 * hash + Objects.hashCode(this.namaTunjangan);
        hash = 23 * hash + (int) (this.nilaiTunjangan ^ (this.nilaiTunjangan >>> 32));
        hash = 23 * hash + Objects.hashCode(this.tanggal);
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
        final Tunjangan other = (Tunjangan) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.pegawai, other.pegawai)) {
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
        return "Tunjangan{" + "id=" + id + ", pegawai=" + pegawai + ", periodeBulan=" + periodeBulan + ", periodeTahun=" + periodeTahun + ", namaTunjangan=" + namaTunjangan + ", nilaiTunjangan=" + nilaiTunjangan + ", tanggal=" + tanggal + '}';
    }

    

}
