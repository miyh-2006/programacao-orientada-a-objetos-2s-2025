public class SistemaOperacional {
    private Computador computador;

    public SistemaOperacional(Computador computador) {
        this.computador = computador;
    }

    public boolean executarPrograma(Programa p) {
        if (p.getSSDOcupado() > computador.getSSD()) {
            System.out.println("Erro na instalação do programa: SSD insuficiente.");
            return false;
        }
        if (p.getMemoriaRAMAlocada() > computador.getMemoriaRAM()) {
            System.out.println("Erro na execução do programa: memória RAM insuficiente.");
            return false;
        }

        float tempoExecucao = (float) p.getQuantidadeOperacoes() /
                             (computador.getOperacoesPorSegundo() * computador.getNucleos());

        System.out.println("Programa executado com sucesso!");
        System.out.println("Tempo de execução: " + tempoExecucao + " segundos.");
        return true;
    }
}
