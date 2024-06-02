import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a largura do terreno (em metros): ");
        double largura = scanner.nextDouble();

        System.out.print("Insira o comprimento do terreno (em metros): ");
        double comprimento = scanner.nextDouble();

        double area = largura * comprimento;

        System.out.println("O terreno possui " + area + " m² de área.");

        scanner.close();
    }
}
