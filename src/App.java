import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quanto voce ganha por hora:");
        double salario =  entrada.nextDouble();
        System.out.println("Quantas horas voce trabalha por mes:");
        double horas = entrada.nextDouble();
        double total = salario*horas;
        System.out.println("Salario igual a: " + total + " por mes");
    }
}
