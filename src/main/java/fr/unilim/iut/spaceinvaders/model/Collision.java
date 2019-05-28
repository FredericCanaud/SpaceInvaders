package fr.unilim.iut.spaceinvaders.model;

public class Collision {

    public boolean detecterCollision(Sprite character, Sprite missile) {
        return this.PersonnageToucheParMissile(character, missile);
    }
    public boolean PersonnageToucheParMissile(Sprite character, Sprite missile) {
    	return ( (this.PersonnageToucheEnBasParMissile(character, missile) && personnageToucheHorizontalementParMissile(character, missile))
    		   || (this.PersonnageToucheEnHautParMissile(character, missile) && personnageToucheHorizontalementParMissile(character, missile)) );
    }
    private boolean personnageToucheHorizontalementParMissile(Sprite character, Sprite missile) {
		return this.PersonnageToucheAGaucheParMissile(character, missile) || this.PersonnageToucheADroiteParMissile(character, missile);
	}
    public boolean PersonnageToucheAGaucheParMissile(Sprite character, Sprite missile) {
        return character.abscisseLaPlusAGauche() <= missile.abscisseLaPlusADroite() && missile.abscisseLaPlusAGauche() <= character.abscisseLaPlusADroite();
    }
    public boolean PersonnageToucheADroiteParMissile(Sprite character, Sprite missile) {
        return character.abscisseLaPlusADroite() >= missile.abscisseLaPlusAGauche() && missile.abscisseLaPlusADroite() >= character.abscisseLaPlusAGauche();
    }
    public boolean PersonnageToucheEnHautParMissile(Sprite character, Sprite missile) {
        return character.ordonneeLaPlusBasse() <= missile.ordonneeLaPlusHaute() && missile.ordonneeLaPlusBasse() <= character.ordonneeLaPlusHaute();
    }
    public boolean PersonnageToucheEnBasParMissile(Sprite character, Sprite missile) {
        return character.ordonneeLaPlusHaute() >= missile.ordonneeLaPlusBasse() && missile.ordonneeLaPlusHaute() >= character.ordonneeLaPlusBasse();
    }
}
