package td5;

public abstract class Article {
    protected long reference;
    protected String libelle;
    protected float prixHT;
    protected  int qteStock=0;
    protected final int TVA =10;
    public Article(long ref, String lib, float p, int q){
        this.reference=ref;
        this.libelle=lib;
        this.prixHT=p;
        this.qteStock=q;
    }

    public String getLibelle() {
        return libelle;
    }

    public float getPrixHT() {
        return prixHT;
    }

    public int getQteStock() {
        return qteStock;
    }

    public int getTVA() {
        return TVA;
    }

    public void approvisionner(int nb){
        this.qteStock+=nb;
    }
    void decrire(){
        System.out.println("refernce : "+reference+" libelle : "+libelle);
    }
    public abstract float calculPrixTTC();
    public boolean appartientPromo() {
        return false;
    }
    public boolean estDispo(int qteAchat){
        return(qteStock>=qteAchat);
    }



}
