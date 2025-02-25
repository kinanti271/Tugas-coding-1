public class StatistikArray {
    //public class StatistikArray {
    public static void main(String[] args) {
        // Program menghitung statistik nilai siswa
        int[] nilai = {75, 80, 65, 90, 85, 70, 95, 88};
        //Array yang menyimpan nilai siswa

        // Mencari nilai tertinggi dan terendah
        int tertinggi = nilai[0];
        //Menginisialisasi variabel tertinggi dengan nilai pertama dalam array.
        int terendah = nilai[0];
        //Menginisialisasi variabel terendah dengan nilai pertama dalam array.
        int total = nilai[0];
        //Menginisialisasi variabel total dengan nilai pertama dalam array.

        for (int i = 1; i < nilai.length; i++) {
            //Loop dimulai dari indeks 1 karena indeks 0 sudah digunakan sebagai nilai awal.
            if (nilai[i] > tertinggi) tertinggi = nilai[i];
            //Jika nilai saat ini lebih besar dari nilai tertinggi sebelumnya, maka nilai tersebut menjadi nilai tertinggi yang baru.
            if (nilai[i] < terendah) terendah = nilai[i];
            //Jika nilai saat ini lebih kecil dari nilai terendah sebelumnya, maka nilai tersebut menjadi nilai terendah yang baru.
            total += nilai[i];
            //Menambahkan nilai saat ini ke dalam total untuk digunakan dalam perhitungan rata-rata.

        }

        double rataRata = (double) total / nilai.length;
        //Melakukan konversi total ke tipe data double agar hasil pembagian menjadi bilangan desimal.menunjukkan jumlah total elemen dalam array.

        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Rata-rata: " + rataRata);
    }
}
    public static void main(String[] args) {
        // Program menghitung statistik nilai siswa
        int[] nilai = {75, 80, 65, 90, 85, 70, 95, 88};

        // Mencari nilai tertinggi dan terendah
        int tertinggi = nilai[0];
        int terendah = nilai[0];
        int total = nilai[0];

        for (int i = 1; i < nilai.length; i++) {
            if (nilai[i] > tertinggi) tertinggi = nilai[i];
            if (nilai[i] < terendah) terendah = nilai[i];
            total += nilai[i];
        }

        double rataRata = (double) total / nilai.length;

        System.out.println("Nilai tertinggi: " + tertinggi);
        //Menampilkan nilai tertinggi yang ditemukan dalam array.
        System.out.println("Nilai terendah: " + terendah);
        //Menampilkan nilai terendah yang ditemukan dalam array.

        System.out.println("Rata-rata: " + rataRata);
        //Menampilkan nilai rata-rata dari semua angka dalam array.

    }
}