import java.util.Scanner;
public class contains {
    public static void main(String[]args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte větu: ");
        String veta = sc.nextLine();
        veta = veta.toLowerCase();
        System.out.println("Obsahuje vaše věta text -ITnetwork- ?");
        System.out.println(veta.contains("itnetwork"));

    }
}
