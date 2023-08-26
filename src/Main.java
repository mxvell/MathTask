import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть рівняння: ");
        String inputEquation = scanner.nextLine();

        if (EquationValidator.isValidEquation(inputEquation)) {
            Equation equation = new Equation(inputEquation);
            System.out.println("Рівняння коректне: " + equation.getEquation());
        } else {
            System.out.println("Некоректне рівняння.");
        }
    }
}
