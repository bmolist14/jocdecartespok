import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Llista única per a totes les entitats
        ArrayList<ClasseBaseEntitat> entitats = new ArrayList<>();

        entitats.add(new Guerrer("Ragnar", 1, 100, 5));
        entitats.add(new Mag("Gandalf", 1, 80, 50));
        entitats.add(new Monstre("Llop", 1, 40));

        System.out.println("--- RONDA DE COMBAT ---");
        for (ClasseBaseEntitat e : entitats) {
            e.atacar(); // Cada entitat fa el seu atac específic
        }

      // (Fase 3)
        System.out.println("\n--- PROVA DE SEGURETAT (HACKER) ---");
        Guerrer g = (Guerrer) entitats.get(0);

        g.setNivell(0); // Hauria de fallar o bloquejar-se
        g.setPuntsVida(-500); // El setter ho posarà a 0

        System.out.println("Estat final de " + g.getNom() + ": Vida=" + g.getPuntsVida());
    }
}
