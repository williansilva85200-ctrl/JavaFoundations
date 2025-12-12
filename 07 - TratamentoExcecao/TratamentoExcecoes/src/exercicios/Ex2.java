package exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex2 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite um valor numérico");
            int valor = sc.nextInt();

            System.out.println("Digite um valor numérico");
            int valor2 = sc.nextInt();
            ;
            double divisao =  valor / valor2;
            System.out.println("Resultado: " + divisao);
        } catch (InputMismatchException e ) {
            System.out.println("Informe um valor númerico");
        } catch (ArithmeticException  | ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro informe um valor diferente do zero");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
