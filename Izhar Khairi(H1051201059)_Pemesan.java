public class Pemesan {
	String nama;
	String Kelas;
	String Jadwal;
	String Keberangkatan;
	String Harga ;
	public Pemesan(String nama, String kelas, String jadwal, String keberangkatan, String harga) {
		this.nama = nama;
		Kelas = kelas;
		Jadwal = jadwal;
		Keberangkatan = keberangkatan;
		Harga = harga;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getKelas() {
		return Kelas;
	}
	public void setKelas(String kelas) {
		Kelas = kelas;
	}
	public String getJadwal() {
		return Jadwal;
	}
	public void setJadwal(String jadwal) {
		Jadwal = jadwal;
	}
	public String getKeberangkatan() {
		return Keberangkatan;
	}
	public void setKeberangkatan(String keberangkatan) {
		Keberangkatan = keberangkatan;
	}
	public String getHarga() {
		return Harga;
	}
	public void setHarga(String harga) {
		Harga = harga;
	}
	
	

}
