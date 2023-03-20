import java.util.Scanner;

/**
 * @author: Fazlı Berk ÖRDEK - 20 Mart 2023
 */
/*TODO:
   -Kullanıcıdan alınan para int
   -KDV1 : 0.18 Double
   -KDV2 : 0.10 Double
   -Tutar : input + (input x kdv)
   -Koşul1 : input 0 -- 1000TL ---> KDV1 : 0.18
    -Koşul2: input >1000 -----> 0.8
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double tutar, kdv1 = 0.18, kdv2 = 0.10;

        System.out.print("Tutar giriniz:");
        tutar = input.nextDouble();

        System.out.println(tutar<=1000 ? (tutar + (tutar * kdv1)): (tutar + (tutar * kdv2)));

        //if-else çözümü:
/*
        if (tutar >= 0 && tutar <= 1000) {
            System.out.println("Tutar = " +tutar+ ",KDV = 0.18 "+ "KDV\'li Tutar = "+ (tutar + (tutar * kdv1)));
        } else if (tutar > 1000) {
            System.out.println("Tutar = " +tutar+ ",KDV = 0.10 "+ "KDV\'li Tutar = "+ (tutar + (tutar * kdv2)));
        }
*/

    }
}