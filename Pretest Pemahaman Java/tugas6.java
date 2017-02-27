import java.util.Scanner;

public class tugas6{

     public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan nilai : ");
        int nilai = scanner.nextInt();
        
        String hasil = HitungNilai(nilai);
        System.out.println("nilai kamu adalah " + nilai + " jadi anda " + hasil);
     }
     
     public static String HitungNilai(int aa) {
      int nilai = aa;
      
      String hasil;
      if (nilai < 60 ){
        hasil = "tidak lulus";
      }else{
        hasil = "lulus ";  
      }
      
      return hasil; 
     }
}