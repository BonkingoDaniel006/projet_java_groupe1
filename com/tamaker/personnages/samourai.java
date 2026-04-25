package projet_java_groupe1.com.tamaker.personnages;

public class Samourai extends Personnage {

    public Samourai(String nom) {
        // Stats de base : moins que le tank (Guerrier) mais plus equilibrer
        super(nom, 100, 20, 4);
    }

    @Override
    public void attaquer(Personnage cible) {
        // Seppuku 
        int sacrifice = this.pvMax / 4; 
        this.pv -= sacrifice;
        
        // Sécurité pour ne pas mourir tout seul
        if (this.pv < 1) this.pv = 1; 

        System.out.println("⛩️ " + this.nom + " utilise SEPPUKU !");
        System.out.println("Il sacrifie " + sacrifice + " PV pour doubler sa force.");

        // tappe 2* plus fort
        int degatsDevastateurs = this.attaque * 2;
        
        System.out.println(this.nom + " lance une frappe déchaînée sur " + cible.getNom() + " !");
        
        cible.recevoirDegats(degatsDevastateurs);
    }
}