import java.util.Hashtable;
import java.util.LinkedList;

public class ListaInvertida {
    private Hashtable<String, LinkedList<String>> tabela;

    public ListaInvertida() {
        tabela = new Hashtable<>();
    }

    public boolean insere(String palavra, String documento) {
        LinkedList<String> lista = tabela.get(palavra);
        
        if (lista != null) {
            if (lista.contains(documento)) {
                return false;
            }
            lista.add(documento);
            return true;
        }

        lista = new LinkedList<>();
        lista.add(documento);
        tabela.put(palavra, lista);
        return true;
    }

    public LinkedList<String> busca(String palavra) {
        return tabela.get(palavra);
    }

    public String toString() {
        return tabela.toString();
    }
}
