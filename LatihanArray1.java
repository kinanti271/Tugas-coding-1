public class LatihanArray1 {
    //untuk membuat nama file 
    public static void main(String[] args) {
        //untuk menjalankan / dimulainya sebuah pemograman


        int[] bilanganGenap = new int[10];
        //untuk memuat array bilangan genap dengan 10 kapasitas elemen 
        int jumlah = 0;
        //untuk menyimpan semua elemen dalam array 

      
        for (int i = 0; i < bilanganGenap.length; i++) {
            bilanganGenap[i] = (i + 1) * 2;
        }
        //untuk mengisi bilangan genap bernilai 10 sehingga perulangan berjalan dari 0-9 (10 kali literasi)

       
        System.out.println("Isi array:");
        //mencetak teks array di layar 
        for (int bilangan : bilanganGenap) {
            //digumakan untuk mengambil setiap elemen di array 
            System.out.print(bilangan + " ");
            //menampilakan elemen dalam satu baris
            jumlah += bilangan;
        }
        //menambahkan setiap elemen ke dalam variabel jumlah

        System.out.println("\\nJumlah semua elemen: " + jumlah);
        //untuk menampilkan hasil penujumlahan
    }
}

