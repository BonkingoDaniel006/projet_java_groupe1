//fait par l'ia pour tester si mes classes sont correcte.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== TEST DE CRÉATION DE PERSONNAGE ===");
        
        System.out.print("Entrez le nom de votre héros : ");
        String nomJoueur = scanner.nextLine();
        
        System.out.println("\nChoisissez votre classe\n 1: Guerrier\n 2: Mage\n 3: Voleur ");
        System.out.print("saisissez votre choix ici: ");
        int choix = scanner.nextInt();
        
        Personnage joueur = null;

        if (choix == 1) {
            joueur = new Guerrier(nomJoueur);
        } else {
            System.out.println("Choix invalide, Guerrier par défaut.");
            joueur = new Guerrier(nomJoueur);
        }

        // --- AFFICHAGE DES STATISTIQUES (L'équivalent du self) ---
        if (joueur != null) {
            System.out.println("\n--- Fiche de personnage ---");
            System.out.println("Nom      : " + joueur.getNom());
            System.out.println("Points de Vie : " + joueur.getPv());
            
            // Pour afficher attaque et défense, assure-toi d'avoir 
            // ajouté des getters dans Personnage.java, sinon tu peux 
            // tester directement si tu es dans le même package :
            // System.out.println("Attaque  : " + joueur.attaque);
        }

        scanner.close();
    }
}