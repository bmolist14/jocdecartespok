public class Monstre extends ClasseBaseEntitat {
    public Monstre(String nom, int nivell, int puntsVida) {
        super(nom, nivell, puntsVida);
    }

    @Override
    public void atacar() {
        System.out.println(getNom() + " ataca salvatgement!");
    }
}