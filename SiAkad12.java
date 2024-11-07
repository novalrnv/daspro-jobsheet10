import java.util.Scanner;

public class SiAkad12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah Mahasiswa : ");
        int mahasiswa = sc.nextInt();
        System.out.print("Masukkan jumlah matkul : ");
        int matkul = sc.nextInt();
        sc.nextLine();

        int[][] nilai = new int[mahasiswa][matkul];

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i+1));
            double totalpersiswa = 0;

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah " + (j+1) + ": ");
                nilai[i][j] = sc.nextInt();

                totalpersiswa += nilai[i][j];
            }
            System.out.println("Nilai rata-rata : " + totalpersiswa/matkul);
        }

        System.out.println("\n====================================");
        System.out.println("Rata-rata Nilai setiap Mata Kuliah : ");

        for (int j = 0; j < matkul; j++) {
            double totalpermatkul = 0;

            for (int i = 0; i < mahasiswa; i++) {
                totalpermatkul += nilai[i][j];
            }

            System.out.println("Mata Kuliah " + (j+1) + ": " + totalpermatkul/mahasiswa);
        }
    }
}