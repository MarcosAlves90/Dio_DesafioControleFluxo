import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Insira o primeiro parâmetro: ");
            int parametro1 = input.nextInt();
            System.out.print("Insira o segundo parâmetro: ");
            int parametro2 = input.nextInt();
            System.out.println();
            contar(parametro1, parametro2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("Erro: " + e);
        } catch (InputMismatchException e) {
            System.out.println("Erro: Os parâmetros inseridos devem ser números inteiros!");
        }

    }

    static void contar(int param1, int param2) throws ParametrosInvalidosException {
        if (param2 <= param1) throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro!");
        int fim = param2 - param1;
        for (int i = 0; i <= fim; i++) {
            System.out.println("Número " + i);
        }
    }

}
