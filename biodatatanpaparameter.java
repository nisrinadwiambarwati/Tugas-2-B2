public class biodatatanpaparameter{
    public String nama;
    public String nim;
    public String jurusan;
    public String fakultas;

    biodatatanpaparameter(){
         nama = "Nisrina";
         nim = "13020180097";
	     jurusan = "TI";
	     fakultas = "Fikom";
    }

    public static void main(String[] args) {
        biodatatanpaparameter Mahasiswa = new biodatatanpaparameter();
        System.out.println(Mahasiswa .nama);
        System.out.println(Mahasiswa .nim);
	    System.out.println(Mahasiswa .jurusan);
	    System.out.println(Mahasiswa .fakultas);
    }
}
