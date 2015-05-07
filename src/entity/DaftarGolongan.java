/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author aa
 */
public class DaftarGolongan {
    
    private int id;
    private String namaGolongan;
    
    //convert
    private String id_golongan = String.valueOf(id);
    
    Object object;
    
    public Object getObject(int index) {
        switch(index){
            case 0: return id;
            case 1: return namaGolongan;
            
            default: return null;
        }
    }
    
    public DaftarGolongan(int id,String namaGolongan){
      this.id=id;
      this.namaGolongan=namaGolongan;
    }
    
    
    public DaftarGolongan(){
    //construnctor    
    }

    
    public int getId() {
        return id;
    }

    
    public void setId(int id) {
        this.id = id;
    }

    
    public String getNamaGolongan() {
        return namaGolongan;
    }

    
    public void setNamaGolongan(String namaGolongan) {
        this.namaGolongan = namaGolongan;
    }

    /**
     * @return the id_golongan
     */
    public String getId_golongan() {
        return id_golongan;
    }

    /**
     * @param id_golongan the id_golongan to set
     */
    public void setId_golongan(String id_golongan) {
        this.id_golongan = id_golongan;
    }
    
    
    
    
          
}
