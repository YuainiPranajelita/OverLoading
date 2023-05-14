package overloading;

import java.util.Scanner;

public class OverloadingMain {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        int pilihan, bil1, bil2, bil3, skalar;
        
        System.out.println("===============================");
        System.out.println("| Nama \t: Yuaini Pranajelita \t|");
        System.out.println("| NPM \t: 21081010204 \t\t|");
        System.out.println("| Kelas : PBO D081 \t\t|");
        System.out.println("===============================");
        
        System.out.println("\n\n");
        
        System.out.println("Pilihan Menu : ");
        System.out.println("1. Perkalian Vektor Dengan Skalar");
        System.out.println("2. Perkalian Vektor Dengan Vektor");
     
        System.out.print("Masukkan Pilihan Anda : ");
        pilihan = input.nextInt();
        
        System.out.println("\n\n");
        
        switch (pilihan) {
            case 1 :
                System.out.print("Masukkan Bilangan Vector 1 : ");
                bil1 = input.nextInt();
                System.out.print("Masukkan Bilangan Vector 2 : ");
                bil2 = input.nextInt();
                System.out.print("Masukkan Bilangan Vector 3 : ");
                bil3 = input.nextInt();
                Vector3 vectorS = new Vector3(bil1, bil2, bil3);
                System.out.print("Vector Yang Sudah di Input : ");
                vectorS.display();

                System.out.print("Masukkan Nilai Skalar : ");
                skalar = input.nextInt();
                
                System.out.print("Hasil Perkalian Vektor dengan Skalar = ");
                vectorS.increase(skalar).display();
                break;
            
            case 2 :
                System.out.print("Masukkan Bilangan Vector 1 : ");
                bil1 = input.nextInt();
                System.out.print("Masukkan Bilangan Vector 2 : ");
                bil2 = input.nextInt();
                System.out.print("Masukkan Bilangan Vector 3 : ");
                bil3 = input.nextInt();
                Vector3 vectorVector = new Vector3(bil1, bil2, bil3);
                System.out.print("Vector Yang Sudah di Input : ");
                vectorVector.display();

                System.out.print ("Hasil Perkalian Vector dengan Vector = ");
                System.out.println ("\nHasil = "+vectorVector.increase(vectorVector));
                break;
            
            default :
                System.out.println("Pilihan Tidak Tersedia !!!!");
        }
        input.close();
    }
}
    

