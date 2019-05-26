package fr.unilim.iut.spaceinvaders.model;

import fr.unilim.iut.spaceinvaders.utils.MissileException;

public abstract class Character extends Sprite {

    public Character(Dimension dimension, Position origine, int vitesse) {
        super(dimension, origine, vitesse);
    }

    public Missile tirerUnMissile(Dimension dimensionMissile, int vitesseMissile, Direction direction) {
        if (dimensionMissile.longueur() > this.dimension.longueur()) {
            throw new MissileException("La longueur du missile est supérieure à celle du personnage");
        }
        Position positionOrigineMissile = calculerLaPositionDeTirDuMissile(dimensionMissile, direction);
        return new Missile(dimensionMissile, positionOrigineMissile, vitesseMissile);
    }

    private Position calculerLaPositionDeTirDuMissile(Dimension dimensionMissile, Direction direction) {
        int abscisseMilieuPersonnage = this.abscisseLaPlusAGauche() + (this.longueur() / 2);
        int abscisseOriginePersonnage = abscisseMilieuPersonnage - (dimensionMissile.longueur() / 2);

        int ordonneeOrigineMissile = this.ordonneeLaPlusBasse() - 1;
        return new Position(abscisseOriginePersonnage, ordonneeOrigineMissile);
    }

} 