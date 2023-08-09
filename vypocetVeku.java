import java.util.Scanner;
public class vypocetVeku {
    public static void main(String[]args){
        System.out.println("Zadej jméno: ");
        Scanner sc = new Scanner(System.in);
        String jmeno = sc.nextLine();
        System.out.println("Zadej příjmení: ");
        String prijmeni = sc.nextLine();
        System.out.println("Zadej svůj věk: ");
        String textVek = sc.nextLine();
        int vek = Integer.parseInt(textVek);
        vek = vek + 1;
        System.out.println(jmeno + " " + prijmeni);
        System.out.println("Za rok ti bude " + vek + " let.");

    }
}
