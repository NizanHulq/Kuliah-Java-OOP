public class LatihanBuku {
	public static void main(String[] args) {
		BukuNovel novel = new BukuNovel("Aku", 124, "Dian", "Komsi");
		BukuTulis tulis = new BukuTulis(40, "Sinar Harapan");
		novel.setNamaPemilik("saya");
		tulis.setNamaPemilik("bukan saya");
		System.out.println(novel.getJudul());
		System.out.println(novel.getJumlahHalaman());
		System.out.println(novel.getNamaPemilik());
		System.out.println(novel.getNamaPenerbit());
		System.out.println(novel.getNamaPenulis());
		System.out.println(novel);
		System.out.println(tulis.getJumlahHalaman());
		System.out.println(tulis.getMerk());
		System.out.println(tulis.getNamaPemilik());
		System.out.println(tulis);
	}
}