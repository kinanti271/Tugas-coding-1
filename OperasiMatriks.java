public class OperasiMatriks {
    public static void main(String[] args) {
        // Program operasi matriks
        int[][] matriksA = {
            {1, 2, 3},
            //mendefinisikan baris pertama dari matriksA
            {4, 5, 6}
            //mendefinisikan baris keuda dari matriksA 
        };

        int[][] matriksB = {
            //mendeklarasikan menginisialisasi sebuah array 2 dimensi bilangan bulat bernama matriks 
            {7, 8, 9},
             //mendefinisikan baris pertama dari matriksB
            {10, 11, 12}
             //mendefinisikan baris pertama dari matriksB
        };

        // Penjumlahan matriks
        int[][] hasil = new int[2][3];
        //Mendeklarasi dan menginisialisasi sebuah array dua dimensi bilangan bulat

        for (int i = 0; i < matriksA.length; i++) {
            //Iterasi melalui setiap baris matriks.
            for (int j = 0; j < matriksA[0].length; j++) {
                //Iterasi melalui setiap kolom dalam baris tersebut.
                hasil[i][j] = matriksA[i][j] + matriksB[i][j];
                //Menjumlahkan elemen matriksA dan matriksB pada posisi yang sama, lalu menyimpannya ke dalam matriks hasil.

            }
        }

        // Menampilkan hasil
        System.out.println("Hasil penjumlahan matriks:");
        //Menampilkan teks sebelum hasil matriks.
        for (int[] baris : hasil) {
            //Mengambil setiap baris dari matriks hasil.
            for (int nilai : baris) {
                //Mengambil setiap elemen dari baris tersebut.
                System.out.print(nilai + " ");
                //Mencetak elemen matriks dalam satu baris dengan spasi antar elemen.
            }
            System.out.println();
        }
    } 
}
