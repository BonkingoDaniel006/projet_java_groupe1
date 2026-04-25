public class Guerrier extends Personnage {
    public Guerrier(String nom){
        //super sert a appeler tout ce qu'il y'a dans personnage (nom, pv, attaque, defense)
        super(nom, 150, 15, 10);
    }
    @Override
    public void attaquer(Personnage cible) {
        System.out.println(this.nom + " assène un coup d'épée puissant sur " + cible.getNom() + " !");
        cible.recevoirDegats(this.attaque);
    }
}
