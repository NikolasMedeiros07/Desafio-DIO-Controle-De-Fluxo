import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o primeiro parâmetro: ");
        int primeiro_parametro = scanner.nextInt();

        System.out.println("Por favor, digite o segundo parâmetro: ");
        int segundo_parametro = scanner.nextInt();

        try {
            Contar(primeiro_parametro, segundo_parametro);

        } catch (ParametrosInvalidosException e) {
            e.printStackTrace();
        }
        scanner.close();
    }

    static void Contar(int primeiro_parametro, int segundo_parametro) throws ParametrosInvalidosException {

        if (primeiro_parametro < segundo_parametro) {
            throw new ParametrosInvalidosException("Digite o primeiro parâmetro maior que o segundo!!");
        } else {
            for (int i = 1; i <= (primeiro_parametro - segundo_parametro); i++) {
                System.out.println("Número: " + i);
            }
        }
    }
}
