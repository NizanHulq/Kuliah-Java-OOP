package Tugas;

public class Mahasiswa extends Manusia{
    public Mahasiswa(String nama) {
        super(nama);
    }
    @Override
    public void setNama(String nama) {
        super.setNama(nama+nama);
    }
    @Override
    public String toString() {
        return "Manusia{" + "nama=" + super.getNama() + '}';
    }
}
