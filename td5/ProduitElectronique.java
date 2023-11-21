package td5;

public class ProduitElectronique  extends Article implements Promotion{
    private String categorie ;

    public ProduitElectronique(long ref, String lib, float p, int q, String categorie) {
        super(ref, lib, p, q);
        if(categorie.equalsIgnoreCase("électroménager") || categorie.equalsIgnoreCase("TV")
                || categorie.equalsIgnoreCase("téléphones")
                || categorie.equalsIgnoreCase("ordinateurs")){
            this.categorie = categorie;
        }
    }

    @Override
    void decrire() {
        System.out.println(this.getClass().getSimpleName()+" : ");
        super.decrire();
        System.out.print("Categorie : "+categorie);
    }

    @Override
    public float calculPrixTTC() {
        return prixHT*(1.08f+TVA);
    }

    @Override
    public float prixDeVente(String dateStr) {
        if(estPeriodePromo(dateStr)){
            return calculPrixTTC()*(30/100);
        }
        else{
            return calculPrixTTC() ;
        }
    }

}
