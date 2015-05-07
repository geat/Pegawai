

package entity;

import java.util.Objects;

/**
 *
 * @author WURY
 */
public class Pendidikan {
    private long id;
    private Pegawai pegawai;
    private String pendidikanTerakhir;
    private String jurusan;
    private String tahunLulus;
    
    public Pendidikan(){}

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

    public String getPendidikanTerakhir() {
        return pendidikanTerakhir;
    }

    public void setPendidikanTerakhir(String pendidikanTerakhir) {
        this.pendidikanTerakhir = pendidikanTerakhir;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getTahunLulus() {
        return tahunLulus;
    }

    public void setTahunLulus(String tahunLulus) {
        this.tahunLulus = tahunLulus;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 79 * hash + Objects.hashCode(this.pegawai);
        hash = 79 * hash + Objects.hashCode(this.pendidikanTerakhir);
        hash = 79 * hash + Objects.hashCode(this.jurusan);
        hash = 79 * hash + Objects.hashCode(this.tahunLulus);
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
        final Pendidikan other = (Pendidikan) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.pegawai, other.pegawai)) {
            return false;
        }
        if (!Objects.equals(this.pendidikanTerakhir, other.pendidikanTerakhir)) {
            return false;
        }
        if (!Objects.equals(this.jurusan, other.jurusan)) {
            return false;
        }
        if (!Objects.equals(this.tahunLulus, other.tahunLulus)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pendidikan{" + "id=" + id + ", pegawai=" + pegawai + ", pendidikanTerakhir=" + pendidikanTerakhir + ", jurusan=" + jurusan + ", tahunLulus=" + tahunLulus + '}';
    }

    

}
