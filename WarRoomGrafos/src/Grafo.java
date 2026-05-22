import java.util.ArrayList;
import java.util.List;

public class Grafo {

    private int vertices;
    private List<Aresta> arestas;

    public Grafo(int vertices) {
        this.vertices = vertices;
        this.arestas = new ArrayList<>();
    }

    public void adicionarAresta(int origem, int destino) {
        arestas.add(new Aresta(origem, destino));
    }

    public int getVertices() {
        return vertices;
    }

    public List<Aresta> getArestas() {
        return arestas;
    }

    public void mostrarGrafo() {

        System.out.println("\nArestas do grafo:");

        for (Aresta a : arestas) {
            System.out.println(a.origem + " -- " + a.destino);
        }
    }
}