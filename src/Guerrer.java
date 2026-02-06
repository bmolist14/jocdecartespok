public class Guerrer extends ClasseBaseEntitat {
    private int resistencia;

    public Guerrer(String nom, int nivell, int puntsVida, int resistencia) {
        super(nom, nivell, puntsVida);
        this.resistencia = resistencia;
    }

    @Override
    public void atacar() {
        System.out.println(getNom() + " fot un cop d'espasa amb força física!");
    }

    @Override
    public void rebreDany(int quantitat) {
        // Apliquem la resistència abans de treure vida
        int danyReal = quantitat - resistencia;
        if (danyReal < 0) danyReal = 0;
        super.rebreDany(danyReal);
    }
}