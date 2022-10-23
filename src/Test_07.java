import java.util.Scanner;

public class Test_07 {
    public static void main(String[] args) {

        /*
        Kullanicidan ismini ve soyismini alip bas harflerini asagidaki gibi yazdirin.

        Java Can -> J.C.


         */
       Scanner scan=new Scanner(System.in);
        System.out.println("isim giriniz");
       String str1= scan.next();
        System.out.println("Soyad giriniz");
        String str2 = scan.next();

        System.out.println(str1.charAt(0)+"."+str2.charAt(0));

    }
}
