import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== WAR ROOM - VERTEX COVER =====");

        System.out.print("Digite a quantidade de vértices: ");
        int vertices = scanner.nextInt();

        Grafo grafo = new Grafo(vertices);

        System.out.print("Digite a quantidade de arestas: ");
        int arestas = scanner.nextInt();

        for (int i = 0; i < arestas; i++) {

            System.out.println("\nAresta " + (i + 1));

            System.out.print("Origem: ");
            int origem = scanner.nextInt();

            System.out.print("Destino: ");
            int destino = scanner.nextInt();

            grafo.adicionarAresta(origem, destino);
        }

        grafo.mostrarGrafo();

        Set<Integer> cobertura = VertexCover.encontrarVertexCover(grafo);

        System.out.println("\n===== RESULTADO =====");

        System.out.println("Vértices escolhidos:");
        System.out.println(cobertura);

        System.out.println("Tamanho da cobertura: " + cobertura.size());

        System.out.println("\n===== COMPLEXIDADE =====");
        System.out.println("Complexidade aproximada: O(E)");
        System.out.println("Onde E é o número de arestas.");

        scanner.close();
    }
}