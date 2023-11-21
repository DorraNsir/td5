package td5;


public class ProduitGC extends Article {

    public ProduitGC(long ref,String lib, float p, int q) {
        super(ref, lib, p, q);
    }


    @Override
    void decrire() {
        System.out.println(this.getClass().getSimpleName()+" : ");
        super.decrire();
    }
    @Override
    public float calculPrixTTC() {
        return getPrixHT()*(1+TVA);
    }
}
