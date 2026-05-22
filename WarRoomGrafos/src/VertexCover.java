import java.util.HashSet;
import java.util.Set;

public class VertexCover {

    public static Set<Integer> encontrarVertexCover(Grafo grafo) {

        Set<Integer> cobertura = new HashSet<>();

        boolean[] visitado = new boolean[grafo.getVertices() + 1];

        for (Aresta aresta : grafo.getArestas()) {

            int u = aresta.origem;
            int v = aresta.destino;

            if (!visitado[u] && !visitado[v]) {

                visitado[u] = true;
                visitado[v] = true;

                cobertura.add(u);
                cobertura.add(v);
            }
        }

        return cobertura;
    }
}