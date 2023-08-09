import java.util.Scanner;
public class mocnina {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Zadejte číslo k mocnění: ");
        String mocnina = sc.nextLine();
        int mocnenec = Integer.parseInt(mocnina);
        mocnenec = mocnenec * mocnenec;
        System.out.println("Druhá mocnina čísla "+ mocnina + " je: " + mocnenec);
    }
}
