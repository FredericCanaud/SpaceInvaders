package fr.unilim.iut.spaceinvaders.model;

public class Envahisseur extends Character {
    
    Direction sensDeplacement;

    public Envahisseur(Dimension dimension, Position positionOrigine, int vitesse) {
        super(dimension, positionOrigine, vitesse);
        this.sensDeplacement = Direction.DROITE;
    }

    public Direction getSensDeplacement() {
        return sensDeplacement;
    }

    public void setSensDeplacement(Direction sensDeplacement) {
        this.sensDeplacement = sensDeplacement;
    }
    
}
