import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("hola peton");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese algo");

        String linea = scanner.nextLine();

        System.out.println("Dijiste: " + linea);

        scanner.close();


    }
}
