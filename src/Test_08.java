import java.util.Scanner;

public class Test_08 {
    public static void main(String[] args) {


        // Kullanicidan haftanin kacinci gunu oldugunu sorun ve gun ismini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Haftanın kaçıncı günü olduğunu girniz");
        int gün=scan.nextInt();

        switch(gün){
            case 1:
                System.out.println("Pazartesi");
            case 2:
                System.out.println("Salı");
            case 3:
                System.out.println("Çarsamba");
            case 4:
                System.out.println("Persembe");
            case 5:
                System.out.println("Cuma");
            case 6:
                System.out.println("Cumartesi");
            case 7:
                System.out.println("Pazar");
        }

    }
}
