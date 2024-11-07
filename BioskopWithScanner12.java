import java.util.Scanner;

public class BioskopWithScanner12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] penonton = new String[4][2];
        String nama, next, ulangmenu;
        int baris, kolom, menu;

        System.out.print("Apakah anda ingin mengakses menu? (y/n) : ");
        ulangmenu = sc.nextLine();

        System.out.println("------------------------------");
        System.out.println("             MENU             ");
        System.out.println(" 1. Inputkan data penonton    ");
        System.out.println(" 2. Tampilkan daftar penonton ");
        System.out.println(" 3. Exit                      ");
        System.out.println("------------------------------");
     
        while (ulangmenu.equalsIgnoreCase("y")) {
        System.out.print("Masukkan menu (1, 2, 3) : ");
        menu = sc.nextInt();
        sc.nextLine();
        
        switch (menu) {
            case 1 :
            while (true) {
                System.out.println("INPUTKAN DATA PENONTON : ");
                System.out.println();
                System.out.print("Masukkan Nama : ");
                nama = sc.nextLine();
                System.out.print("Masukkan Baris : ");
                baris = sc.nextInt();
                System.out.print("Masukkan Kolom : ");
                kolom = sc.nextInt();
                
                while (baris < 1 || baris > (penonton.length) || kolom < 1 || kolom > (penonton[0].length) || penonton[baris-1][kolom-1] != null) {
                    System.out.println("BARIS / KOLOM TIDAK TERSEDIA");
                    System.out.println();
                    System.out.print("Masukkan Baris : ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan Kolom : ");
                    kolom = sc.nextInt();
                }

                sc.nextLine();
                penonton[baris-1][kolom-1] = nama;
                
                System.out.print("Input penonton lainnya? (y/n) : ");
                next = sc.nextLine();

    
                if (next.equalsIgnoreCase("n")) {
                    break;
                }
            }
            break;

            case 2 :
            for (int i = 0; i < penonton.length; i++) {
                for (int j = 0; j < penonton[i].length; j++) {
                    if (penonton[i][j] == null){
                        penonton[i][j] = "***";
                        System.out.println(penonton[i][j]);
                    } else {
                        System.out.println(penonton[i][j]);
                    }
                }
            }
                break;

            case 3 :
                return;

            default :
                System.out.println("Angka yang dimasukkan tidak valid!");
                break;
        }
        }
    }
}