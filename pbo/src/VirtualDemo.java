public class VirtualDemo {
    public static void main(String[] args) 
    {
        //polimorphsme
        Gaji s = new Gaji("Wahyu", "KUBAR", 3,5000.00);
        Pegawai e = new Gaji("Nurul", "Sawahlunto", 2,2500.00);
        System.out.println("Memanggil mailCheck berdasarkan referensi Gaji---");
        s.mailCheck();
        System.out.println("\nMemanggil mailCheck berdasarkan referensi pegawai--");
        e.mailCheck();

        //Nama : Nurul Afani
        //NIM : 2211521015
        //Kelas : PBO-A

    
    }
}