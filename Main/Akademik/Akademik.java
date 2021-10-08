public class Akademik {
    public static void main(String[] args) {
    Mahasiswa agus = new Mahasiswa(1245,"Agus");
	Mahasiswa nizan = new Mahasiswa(1321,"Nizan");
    System.out.println(agus.sayHI());
	System.out.println(nizan.sayHI());
	agus.setNama("Agus sudibyo");
	System.out.println(agus.sayHI());
    }
}
