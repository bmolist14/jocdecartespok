public class Mag extends ClasseBaseEntitat {
    private int mana;

    public Mag(String nom, int nivell, int puntsVida, int mana) {
        super(nom, nivell, puntsVida);
        this.mana = mana;
    }

    @Override
    public void atacar() {
        System.out.println(getNom() + " llança un encanteri màgic!");
    }
}