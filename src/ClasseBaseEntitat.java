public abstract class ClasseBaseEntitat {
    private String nom;
    private int nivell;
    private int puntsVida;

    public ClasseBaseEntitat(String nom, int nivell, int puntsVida) {
        this.nom = nom;
        this.nivell = nivell;
        this.puntsVida = puntsVida;
    }

    public String getNom() { return nom; }
    public int getNivell() { return nivell; }
    public int getPuntsVida() { return puntsVida; }

    public void setNivell(int n) {
        if (n == this.nivell + 1) {
            this.nivell = n;
        }
    }

    public void setPuntsVida(int v) {
        this.puntsVida = Math.max(0, v);
    }
//atacar
    public abstract void atacar();

    public void rebreDany(int quantitat) {
        setPuntsVida(this.puntsVida - quantitat);
    }
}