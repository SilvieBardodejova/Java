import java.util.Scanner;

public class delkaSlova {
    public static void main(String[]args){
        System.out.println("Zadejte delší slovo: ");
        Scanner sc = new Scanner(System.in);
        String delsiSlovo = sc.nextLine();
        System.out.println("Zadejte kratší slovo: ");
        String kratsiSlovo = sc.nextLine();
        int delsi = delsiSlovo.trim().length();
        int kratsi = kratsiSlovo.trim().length();
        int rozdil = delsi - kratsi;
        if ((rozdil >= 5 ) || (rozdil < -4 )){
            System.out.println("Slovo se liší o " + rozdil + " znaků.");
        }
            else if (rozdil == 0){
            System.out.println("Zadali jste stejně dlouhá slova a tedy se liší o " + rozdil + " znaků.");
        }
            else{
            System.out.println("Slovo se liší o " + rozdil + " znaky.");
        }
    }
}
