import java.util.Scanner;

public class Test_12 {
    public static void main(String[] args) {

        // Kullanicidan gun ismini alip haftaici veya hafta sonu yazdiralim

        Scanner scan= new Scanner(System.in);
        System.out.print("Gun ismi giriniz: ");
        String gun= scan.next().toLowerCase();

        switch (gun){
            case "pazartesi":
            case "sali":
            case "carsamba":
            case "persembe":
            case "cuma":
                System.out.println("Girdiginiz gun Haftaici");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println("Girdiginiz gun Haftasonu");
                break;
            default:
                System.out.println("Gecerli bir gun ismi giriniz");

        }


    }
}
