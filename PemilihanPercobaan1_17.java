import java.util.Scanner;
 
public class PemilihanPercobaan1_17{
    public static void main(String[] args) {
        Scanner input17 = new Scanner(System.in);
         
        System.out.println("Masukan angka: ");
        int angka = input17.nextInt();

        String operation = (angka%2 == 0) ? "genap": "ganjil";
        System.out.println("Angka " +angka+ " adalah bilangan "+ operation);

       // if (angka % 2 == 0)
           //System.out.println("Angka "+angka+" bilangan genap");
       // else
          //System.out.println("Angka "+angka+" bilangan ganjil");

          }
}