public abstract class Personnage {


    protected String nom;
    protected int pv;
    protected int pvMax;
    protected int attaque;
    protected int defense;
    protected int niveau;

    public Personnage(String nom, int pv, int attaque, int defense) {
        this.nom = nom;
        this.pv = pv;
        this.pvMax = pv;
        this.attaque = attaque;
        this.defense = defense;
        this.niveau = 1; 
    }
    //chaque personnage à sa façon d'attaquer
    public abstract void attaquer(Personnage cible);

    //tous les personnages reçoivent les attaque de la meme façcon(ça retire les memes pv)
    public void recevoirDegats(int degats){
        int degatsReels = degats -this.defense;
        if(degatsReels < 0) degatsReels = 0;

        this.pv -= degatsReels;
        System.out.println(this.nom + " perd " + degatsReels + " PV. (Restant: " + this.pv + ")");
    
    }

    //getters
    public String getNom() { return nom; }
    public int getPv() { return pv; }
    public boolean estVivant() { return pv > 0; }
}