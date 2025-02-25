public class SistemNilai {
    //Mendeklarasikan kelas bernama SistemNilai.
    public static void main(String[] args) {
        // Data siswa
        String[] namaSiswa = {"Ani", "Budi", "Cici", "Dodi", "Edi"};
        // Array yang menyimpan nama-nama siswa.
        int[][] nilai = {
            // Array 2 dimensi yang menyimpan nilai setiap siswa dalam 3 mata pelajaran.
            {80, 85, 90}, // Nilai Ani
            {75, 70, 85}, // Nilai Budi
            {85, 80, 88}, // Nilai Cici
            {90, 85, 95}, // Nilai Dodi
            {70, 75, 80}  // Nilai Edi
        };
        String[] mapel = {"Matematika", "Bahasa Inggris", "IPA"};

        // Menghitung rata-rata per siswa
        System.out.println("Rata-rata nilai per siswa:");
        //Menampilkan teks sebelum hasil rata-rata per siswa.
        for (int i = 0; i < nilai.length; i++) {
            //Looping melalui setiap baris dalam array nilai (setiap siswa).
            double total = 0;
            //Variabel untuk menyimpan jumlah total nilai siswa.
            for (int n : nilai[i]) {
                //Looping melalui nilai-nilai yang dimiliki siswa ke-i.
                total += n;
                //Menambahkan nilai saat ini ke variabel total.
            }
            double rataSiswa = total / nilai[i].length;
            //Menghitung rata-rata dengan membagi total nilai dengan jumlah mata pelajaran.
            System.out.printf("%s: %.2f\\n", namaSiswa[i], rataSiswa);
            //Menampilkan hasil rata-rata siswa dengan format dua angka desimal.
        }

        // Menghitung rata-rata per mata pelajaran
        System.out.println("\\nRata-rata nilai per mata pelajaran:");
        //Menampilkan teks sebelum hasil rata-rata per mata pelajaran.
        for (int j = 0; j < nilai[0].length; j++) {
            //Looping melalui setiap kolom dalam array nilai (setiap mata pelajaran).
            double total = 0;
            //Variabel untuk menyimpan jumlah total nilai dalam satu mata pelajaran.
            for (int i = 0; i < nilai.length; i++) {
                //Looping melalui setiap siswa untuk mengambil nilai mereka pada mata pelajaran ke-j
                total += nilai[i][j];
                //Menambahkan nilai siswa i pada mata pelajaran j ke dalam total.
            }
            double rataMapel = total / nilai.length;
            //Menghitung rata-rata nilai mata pelajaran dengan membagi total nilai dengan jumlah siswa.
            System.out.printf("%s: %.2f\\n", mapel[j], rataMapel);
            //Menampilkan hasil rata-rata mata pelajaran dengan format dua angka desimal.
        }
    }
}
