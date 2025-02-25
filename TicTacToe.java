public class TicTacToe {
    //Mendeklarasikan kelas dengan nama TicTacToe.
    public static void main(String[] args) {
        // Method utama yang akan dieksekusi pertama kali saat program dijalankan.
        char[][] papan = new char[3][3];
        //Membuat array 2 dimensi berukuran 3x3 untuk mewakili papan permainan Tic-Tac-Toe.

        // Inisialisasi papan kosong
        for (int i = 0; i < 3; i++) {
            //Mengakses setiap baris pada array papan.
            for (int j = 0; j < 3; j++) {
                //Mengakses setiap kolom dalam baris i.
                papan[i][j] = '-';
                //Mengisi seluruh papan dengan karakter '-' yang melambangkan posisi kosong.
            }
        }

        // Simulasi beberapa langkah
        papan[0][0] = 'X';
        //Pemain X menandai kotak di baris ke-0, kolom ke-0.
        papan[1][1] = 'O';
        //Pemain O menandai kotak di baris ke-1, kolom ke-1.

        papan[2][2] = 'X';
        //Pemain X menandai kotak di baris ke-2, kolom ke-2.

        // Tampilkan papan
        System.out.println("Status Papan:");
        //Menampilkan teks sebelum mencetak tampilan papan permainan.
        tampilkanPapan(papan);
        //Memanggil method tampilkanPapan untuk mencetak papan permainan ke layar.

    }

    public static void tampilkanPapan(char[][] papan) {
        //Method ini menerima array 2D papan sebagai parameter dan mencetak isinya ke layar.

        for (int i = 0; i < 3; i++) {
            //Iterasi melalui setiap baris dalam papan.
            for (int j = 0; j < 3; j++) {
                //Iterasi melalui setiap kolom dalam baris i.

                System.out.print(papan[i][j] + " ");
                //Mencetak isi papan tanpa pindah ke baris baru.

            }
            System.out.println();
            //Berpindah ke baris baru setelah mencetak satu baris papan.

        }
    }
}