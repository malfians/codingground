import java.util.Scanner;

public class tugas7{

     public static void main(String []args){
         
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan Angka : ");
        
        int nilai = scanner.nextInt();
        String hasil = Konversi(nilai);
        System.out.println(nilai + " = " + hasil);
     }
     
     public static String Konversi(int aa) {
      int nilai = aa;
      
      String romawi;
        switch (nilai) {
            case 1:  romawi = "I";
                     break;
            case 2:  romawi = "II";
                     break;
            case 3:  romawi = "III";
                     break;
            case 4:  romawi = "IV";
                     break;
            case 5:  romawi = "V";
                     break;
            case 6:  romawi = "VI";
                     break;
            case 7:  romawi = "VII";
                     break;
            case 8:  romawi = "VIII";
                     break;
            case 9:  romawi = "IX";
                     break;
            case 10: romawi = "X";
                     break;
            default: romawi = "Invalid romawi";
                     break;
        }
      return romawi; 
     }
}