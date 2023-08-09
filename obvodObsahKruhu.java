import java.util.Scanner;

public class obvodObsahKruhu {
    public static void main(String[]args){
        System.out.println("Zadejte poloměr kruhu: ");
        Scanner sc = new Scanner(System.in);
        String polomer = sc.nextLine();
        double r = Double.parseDouble(polomer);
        double o = 2 * 3.1415 * r;
        double S = 3.1415 * r * r;
        System.out.println("Obvod kruhu s poloměrem " + polomer + " je: " + o );
        System.out.println("Obsah kruhu s poloměrem " + polomer + " je: " + S );
    }
}
