public class MètodeAtacar {
    // Simulació de cartes especials (Fase 4)
    public void cartaTrenMalalt(ClasseBaseEntitat objectiu) {
        System.out.println("S'activa la carta: Atac del tren malalt!");
        objectiu.rebreDany(5); // Resta -5 de vida
    }
}