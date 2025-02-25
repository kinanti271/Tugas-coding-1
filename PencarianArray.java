public class PencarianArray {
    //Mendefinisikan kelas dengan nama PencarianArray.
    public static void main(String[] args) {
        // Program mencari nilai dalam array
        int[] nilai = {75, 80, 65, 90, 85, 70, 95, 88};
        //Membuat array nilai berisi sejumlah angka.

        int cari = 90;
        //Menentukan nilai yang ingin dicari dalam array (90).
        boolean ketemu = false;
        //Menandai apakah nilai ditemukan atau tidak (default: false).
        int indeks = -1;
        //Menyimpan indeks lokasi nilai jika ditemukan (default: -1, berarti belum ditemukan).

        // Mencari nilai
        for (int i = 0; i < nilai.length; i++) {
            //Perulangan untuk menelusuri setiap elemen dalam array.
            if (nilai[i] == cari) {
                //Mengecek apakah elemen saat ini sama dengan nilai yang dicari (90).
                ketemu = true;
                //Jika ditemukan, ubah variabel ketemu menjadi true
                indeks = i;
                //Simpan posisi indeks tempat nilai ditemukan.

                break;
                //Hentikan perulangan setelah menemukan nilai.
            }
        }

        // Menampilkan hasil
        if (ketemu) {
            //Jika ketemu bernilai true, cetak lokasi indeks.
            System.out.println("Nilai " + cari + " ditemukan pada indeks " + indeks);
            //Menampilkan pesan bahwa nilai ditemukan beserta indeksnya.
        } else {
            //Jika ketemu == false, cetak bahwa nilai tidak ditemukan.
            System.out.println("Nilai " + cari + " tidak ditemukan");
            //Menampilkan pesan bahwa nilai tidak ditemukan dalam array.

        }
    }
}
