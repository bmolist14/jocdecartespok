import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<ClasseBaseEntitat> entitats = new ArrayList<>();

        entitats.add(new Guerrer("Ares", 1, 100, 10, Raresa.EPIC));
        entitats.add(new Mag("Merlí", 1, 80, 50));
        entitats.add(new Monstre("Gòlem", 1, 150));

        for (ClasseBaseEntitat e : entitats) {
            e.atacar();
        }
    }
}