import java.util.Scanner;

public class NumerosIncremento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar los dos primeros números al usuario
        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();

        // Validar que los números sean distintos
        while (num1 == num2) {
            System.out.println("Los números deben ser distintos. Inténtalo de nuevo.");
            System.out.print("Introduce el primer número: ");
            num1 = scanner.nextInt();
            System.out.print("Introduce el segundo número: ");
            num2 = scanner.nextInt();
        }

        // Solicitar el tercer número al usuario
        System.out.print("Introduce el tercer número: ");
        int num3 = scanner.nextInt();

        // Determinar el menor y el mayor de los dos primeros números
        int menor = Math.min(num1, num2);
        int mayor = Math.max(num1, num2);

        // Mostrar los números comprendidos entre menor y mayor, incrementando de 7 en 7
        System.out.println("Números comprendidos entre " + menor + " y " + mayor + " incrementando de 7 en 7:");
        for (int i = menor; i <= mayor; i += 7) {
            System.out.println(i);
        }

        // Mostrar el tercer número si se encuentra entre el primer y el segundo número
        if (num