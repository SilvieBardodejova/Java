import java.util.Scanner;
public class zacatky {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ahoj, jak se jmenuje??");
        String jmeno = sc.nextLine();
        System.out.println("Jaký jsi?");
        String vlastnost = sc.nextLine();
        System.out.println(jmeno + " je " + vlastnost);
    }
}
