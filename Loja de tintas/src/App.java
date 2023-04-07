import java.util.Scanner;
import java.lang.Math;

public class App {

    public static void main(String[] args) {
        // Variaveis e Scanner.
        int m2;
        double litro;
        double lataDT;
        double valor;
        Scanner teclado = new Scanner(System.in);

        // Ação 1.
        System.out.println("Qual o tamanho da Area Pintada em M²");
        m2 = teclado.nextInt();
        teclado.close();
        litro = (m2 / 3);
        lataDT = Math.ceil(litro / 18);
        valor = (80.00 * lataDT);
        System.out.println("Para sua obra precisamos de" + " " + litro
                + " " + "Litros de tinta. Assim sendo nescessario o numero de:" + " " + lataDT
                + " " + "latas de tinta. Totalizando o valor de R$" + valor);

    }
}
