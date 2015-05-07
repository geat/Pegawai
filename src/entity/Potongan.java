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
public class Potongan {
    private long id;
    private Pegawai pegawai;
    private String periodeBulan;
    private String periodeTahun;
    private String namaPotongan;
    private long nilaiPotongan;
    private Date tanggal;
    
    public Potongan(){}

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
    
    

    public String getNamaPotongan() {
        return namaPotongan;
    }

    public void setNamaPotongan(String namaPotongan) {
        this.namaPotongan = namaPotongan;
    }

    public long getNilaiPotongan() {
        return nilaiPotongan;
    }

    public void setNilaiPotongan(long nilaiPotongan) {
        this.nilaiPotongan = nilaiPotongan;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 83 * hash + Objects.hashCode(this.pegawai);
        hash = 83 * hash + Objects.hashCode(this.periodeBulan);
        hash = 83 * hash + Objects.hashCode(this.periodeTahun);
        hash = 83 * hash + Objects.hashCode(this.namaPotongan);
        hash = 83 * hash + (int) (this.nilaiPotongan ^ (this.nilaiPotongan >>> 32));
        hash = 83 * hash + Objects.hashCode(this.tanggal);
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
        final Potongan other = (Potongan) obj;
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
        if (!Objects.equals(this.namaPotongan, other.namaPotongan)) {
            return false;
        }
        if (this.nilaiPotongan != other.nilaiPotongan) {
            return false;
        }
        if (!Objects.equals(this.tanggal, other.tanggal)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Potongan{" + "id=" + id + ", pegawai=" + pegawai + ", periodeBulan=" + periodeBulan + ", periodeTahun=" + periodeTahun + ", namaPotongan=" + namaPotongan + ", nilaiPotongan=" + nilaiPotongan + ", tanggal=" + tanggal + '}';
    }

    

}
