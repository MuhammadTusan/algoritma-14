import java.util.Scanner;

public class exponen {
    static int expo(int base, int pangkat){

        if (pangkat == 0){
            return 1;
        }
        return base * expo (base, pangkat-1);

    }
public static void main (String[] args){
Scanner scanner = new Scanner (System.in);
System.out.print("Masukan Angka : ");
int angka = scanner.nextInt();

System.out.print("Pangkat berapa ? : ");
int pangkat = scanner.nextInt();

System.out.print(expo (angka, pangkat));

} 

    
}

