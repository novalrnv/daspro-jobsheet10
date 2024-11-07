import java.util.Scanner;

public class Array2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int survey[][] = new int[6][10];
        int i, j;
        double reratares[] = new double[10];
        double rerataper[] = new double[6], reratatotal;

        for (i = 0; i < survey.length; i++) {
            System.out.println();
            System.out.println("PERTANYAAN NO."+(i+1));
            for (j = 0; j < survey[0].length; j++) {
                System.out.print("Input respon ke-"+(j+1)+" : ");
                survey[i][j] = sc.nextInt();
            }
        }

        for (i = 0; i < survey[0].length; i++) {
            int totalres = 0;
            for (j = 0; j < survey.length; j++) {
                totalres += survey[j][i];
            }
            reratares[i] = totalres/6;
        }

        for (i = 0; i < survey.length; i++) {
            int totalper = 0;
            for (j = 0; j < survey[0].length; j++) {
                totalper += survey[i][j];
            }
            rerataper[i] = totalper/10;
        }

        int totall = 0;
        for (i = 0; i < survey.length; i++) {
            for (j = 0; j < survey[0].length; j++) {
                totall += survey[i][j];
            }
        }
        reratatotal = totall/60;

        System.out.println();

        for (i = 0; i < rerataper.length; i++) {
            System.out.println("Rata-rata pertanyaan-"+(i+1)+" = "+rerataper[i]);
        }

        System.out.println();

        for (i = 0; i < reratares.length; i++) {
            System.out.println("Rata-rata respon-"+(i+1)+" = " +reratares[i]);
        }

        System.out.println();
        System.out.println("Rata-rata keseluruhan = "+reratatotal);
    }
}
