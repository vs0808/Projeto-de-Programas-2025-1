public class GoogleMain {
    public static void main(String[] args) {
        // Instancia a lista invertida
        ListaInvertida lista = new ListaInvertida();

        // Insere palavras associadas a documentos
        lista.insere("force",    "document1.txt");
        lista.insere("force",    "document2.txt");
        lista.insere("force",    "document3.txt");
        lista.insere("always",   "document1.txt");
        lista.insere("one",      "document3.txt");
        lista.insere("is",       "document2.txt");
        lista.insere("is",       "document3.txt");
        lista.insere("be",       "document1.txt");
        lista.insere("will",     "document1.txt");
        lista.insere("you",      "document1.txt");
        lista.insere("you",      "document2.txt");
        lista.insere("the",      "document1.txt");
        lista.insere("the",      "document2.txt");
        lista.insere("the",      "document3.txt");
        lista.insere("remember", "document1.txt");
        lista.insere("this",     "document3.txt");
        lista.insere("strong",   "document2.txt");

        // Realiza buscas e imprime os resultados
        System.out.println(lista.busca("force"));
        System.out.println(lista.busca("the"));
        System.out.println(lista.busca("foo"));  // deve retornar null

        // Imprime a tabela completa
        System.out.println(lista.toString());
    }
}
