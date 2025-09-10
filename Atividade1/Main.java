public class Main {
    public static void main(String[] args) {
    
        Computador pc = new Computador(16, 512, 4, 2.5f);

        
        SistemaOperacional so = new SistemaOperacional(pc);

        
        Programa prog1 = new Programa(8, 100, 2, 1000);   
        Programa prog2 = new Programa(20, 100, 2, 1000);
        Programa prog3 = new Programa(8, 600, 2, 1000);  

        
        so.executarPrograma(prog1);
        so.executarPrograma(prog2);
        so.executarPrograma(prog3);
    }
}
