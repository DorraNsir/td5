package td5;

import java.util.Scanner;

public class Achat {
    static Article[] supermarche = new Article[4];
    public static void main(String[] args) {
        supermarche[0] = new Vetement(123, "Jupe", 39.000f, 2, "bleu", "S");
        supermarche[1] = new ProduitElectronique(145, "Led 80cm", 1450.000f, 0, "TV");
        supermarche[2] = new Vetement(178, "Pantallon", 42.000f, 5, "noir", "M");
        supermarche[3] = new ProduitGC(191, "Pâtes", 0.410f, 18);
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.println("donner le stock a acheté : ");
            int a = s.nextInt();
            if (supermarche[i].estDispo(a)) {
                System.out.println("Stock disponible");
            } else {
                System.out.println("Stock non disponible");
                supermarche[i].approvisionner(10);
            }
        }
        System.out.println("***********************************************");
        float somme = 0;
        for (int i = 0; i < 4; i++) {


            if (supermarche[i] instanceof ProduitGC) {
                supermarche[i].decrire();
                System.out.println("\n le prix de " + supermarche[i].getLibelle() + " = " + supermarche[i].calculPrixTTC());
                System.out.println("\n ***********************************************");
                somme += supermarche[i].calculPrixTTC();
            } else if (supermarche[i] instanceof Vetement) {
                supermarche[i].decrire();
                System.out.println("\n le prix de " + supermarche[i].getLibelle() + " = " + ((Vetement) supermarche[i]).prixDeVente("21/03/2023"));
                System.out.println("\n ***********************************************");
                somme += ((Vetement) supermarche[i]).prixDeVente("21/03/2023");
            } else {
                supermarche[i].decrire();
                System.out.println("\n le prix de " + supermarche[i].getLibelle() + " = " + ((ProduitElectronique) supermarche[i]).prixDeVente("21/03/2023"));
                System.out.println("\n ***********************************************");
                somme += ((ProduitElectronique) supermarche[i]).prixDeVente("21/03/2023");

            }
        }
        System.out.println("montant total à payer = " + somme );
    }

    }

