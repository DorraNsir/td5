package td5;

public class Vetement extends Article implements Promotion{
public String couleur;
public String taille;

    public Vetement(long ref, String lib, float p, int q,String c,String t) {
        super(ref, lib, p, q);
        this.couleur=c;
        this.taille=t;
    }

    @Override
    void decrire() {
        System.out.println(this.getClass().getSimpleName()+" : ");
        super.decrire();
        System.out.print("Couleur : "+couleur+" taille : "+taille);
    }

    @Override
    public float calculPrixTTC() {
        return prixHT*TVA;
    }

    @Override
    public float prixDeVente(String dateStr) {
        if(estPeriodePromo(dateStr)){
            return calculPrixTTC()*(30/100) ;
        }
        else{
            return calculPrixTTC();
        }}
}
