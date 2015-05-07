
package entity;

import java.util.Objects;

public class KeluargaPegawai {
    private long id;
    private Pegawai pegawai;
    private String namaKeluarga;
    private String statusKeluarga;
    
    public KeluargaPegawai(){}

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

    public String getNamaKeluarga() {
        return namaKeluarga;
    }

    public void setNamaKeluarga(String namaKeluarga) {
        this.namaKeluarga = namaKeluarga;
    }

    public String getStatusKeluarga() {
        return statusKeluarga;
    }

    public void setStatusKeluarga(String statusKeluarga) {
        this.statusKeluarga = statusKeluarga;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 97 * hash + Objects.hashCode(this.pegawai);
        hash = 97 * hash + Objects.hashCode(this.namaKeluarga);
        hash = 97 * hash + Objects.hashCode(this.statusKeluarga);
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
        final KeluargaPegawai other = (KeluargaPegawai) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.pegawai, other.pegawai)) {
            return false;
        }
        if (!Objects.equals(this.namaKeluarga, other.namaKeluarga)) {
            return false;
        }
        if (!Objects.equals(this.statusKeluarga, other.statusKeluarga)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "KeluargaPegawai{" + "id=" + id + ", pegawai=" + pegawai + ", namaKeluarga=" + namaKeluarga + ", statusKeluarga=" + statusKeluarga + '}';
    }
    
    

}
