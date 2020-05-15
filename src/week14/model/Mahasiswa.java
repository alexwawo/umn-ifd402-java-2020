package week14.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Mahasiswa {
    private final IntegerProperty id;
    private final StringProperty nim;
    private final StringProperty nama;
    private final StringProperty prodi;

    // Default Constructor
    public Mahasiswa(Integer id, String nim, String nama, String prodi){
        this.id = new SimpleIntegerProperty(id);
        this.nim = new SimpleStringProperty(nim);
        this.nama = new SimpleStringProperty(nama);
        this.prodi = new SimpleStringProperty(prodi);
    }

    // Getters
    public Integer getId() { return id.get(); }
    public String getNim() { return nim.get(); }
    public String getNama() { return nama.get(); }
    public String getProdi() { return prodi.get(); }

    // Setters
//    public void setId(Integer value) { id.set(value); }
//    public void setNim(String value) { nim.set(value); }
//    public void setNama(String value) { nama.set(value); }
//    public void setProdi(String value) { prodi.set(value); }

    // Property values
    public IntegerProperty idProperty() { return id; }
    public StringProperty nimProperty() { return nim; }
    public StringProperty namaProperty() { return nama; }
    public StringProperty prodiProperty() { return prodi; }
}