public class SessaoJediMain {
    public static void main(String[] args) {
        TreinadorJedi mestre = new TreinadorJedi("Grão-Mestre", "Fae Coven");
        SessaoJedi sessao = new SessaoJedi("Instruções de Uso da Força", mestre);

        sessao.addIniciado(new IniciadoJedi("Katooni", "Tholothian", -23));
        sessao.addIniciado(new IniciadoJedi("Byph", "Ithorian", -21));
        System.out.println(sessao.getDescricao());
        System.out.println("Média de nascimento: " + sessao.getMediaAnoNascimento());
    }
}
