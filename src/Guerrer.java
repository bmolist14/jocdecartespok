public class Guerrer extends ClasseBaseEntitat implements Atac {
    private int resistencia;
    private Raresa raresa;

    public Guerrer(String nom, int nivell, int puntsVida, int resistencia, Raresa raresa) {
        super(nom, nivell, puntsVida);
        this.resistencia = resistencia;
        this.raresa = raresa;
    }

    @Override
    public void atacar() {
        executarAtac();
    }

    @Override
    public void executarAtac() {
        System.out.println(getNom() + " (" + raresa + ") fa un atac físic!");
    }

    @Override
    public void rebreDany(int quantitat) {
        int danyFinal = Math.max(0, quantitat - resistencia);
        super.rebreDany(danyFinal);
    }
}