public class Guerrer extends ClasseBaseEntitat {
    private int resistencia;

    public Guerrer(String nom, int nivell, int puntsVida, int resistencia) {
        super(nom, nivell, puntsVida);
        this.resistencia = resistencia;
    }

    public int getResistencia() { return resistencia; }
    public void setResistencia(int r) { this.resistencia = r; }

    public void atacar() {
        System.out.println(getNom() + " fot un cop d'espasa!");
    }

    public void rebreDany(int quantitat) {
        // Restem la resistencia al dany
        int danyReal = quantitat - resistencia;
        if (danyReal < 0) danyReal = 0;
        super.rebreDany(danyReal);
    }
}