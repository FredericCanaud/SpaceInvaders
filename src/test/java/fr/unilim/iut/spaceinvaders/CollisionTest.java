package fr.unilim.iut.spaceinvaders;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import fr.unilim.iut.spaceinvaders.model.*;
import fr.unilim.iut.spaceinvaders.utils.MissileException;

public class CollisionTest {

    Collision collision;

    @Before
    public void initialisation() {
        collision = new Collision();
    }

    @Test
    public void test_EnvahisseurToucheParMissile_DetecterCollision() {

       Envahisseur envahisseur = new Envahisseur(new Dimension(2,2),new Position(5,2),3);
       Missile missile = new Missile(new Dimension(1,2),new Position(5,2),3);
       
       assertTrue(collision.detecterCollision(envahisseur, missile));

    }

    @Test
    public void test_PersonnagePasTouche_DetecterCollision() {

       Envahisseur envahisseur = new Envahisseur(new Dimension(1,1),new Position(5,2),3);
       Missile missile = new Missile(new Dimension(1,1),new Position(11,9),3);

       assertFalse(collision.detecterCollision(envahisseur, missile));

    }

    @Test
    public void test_PersonnageToucheParMissileAGauche_DetecterCollision() {

       Envahisseur envahisseur = new Envahisseur(new Dimension(2,2),new Position(5,2),3);
       Missile missile = new Missile(new Dimension(1,2),new Position(5,1),3);

       assertTrue(collision.PersonnageToucheAGaucheParMissile(envahisseur, missile));

    }
    @Test
    public void test_PersonnageToucheParMissileADroite_DetecterCollision() {

       Envahisseur envahisseur = new Envahisseur(new Dimension(2,2),new Position(5,2),3);
       Missile missile = new Missile(new Dimension(1,2),new Position(5,2),3);

       assertTrue(collision.PersonnageToucheADroiteParMissile(envahisseur, missile));

    }
    @Test
    public void test_PersonnageToucheParMissileEnHaut_DetecterCollision() {

       Envahisseur envahisseur = new Envahisseur(new Dimension(2,2),new Position(5,2),3);
       Missile missile = new Missile(new Dimension(1,2),new Position(5,1),3);

       assertTrue(collision.PersonnageToucheEnHautParMissile(envahisseur, missile));

    }
    @Test
    public void test_PersonnageToucheParMissileEnBas_DetecterCollision() {

       Envahisseur envahisseur = new Envahisseur(new Dimension(2,2),new Position(5,2),3);
       Missile missile = new Missile(new Dimension(1,2),new Position(5,2),3);

       assertTrue(collision.PersonnageToucheEnBasParMissile(envahisseur, missile));

    }
    @Test(expected = MissileException.class)
	public void test_LongueurMissileSuperieureALongueurEnvahisseur_UneExceptionEstLevee() throws Exception {
    	Envahisseur envahisseur = new Envahisseur(new Dimension(2,2),new Position(5,2),3);
        Missile missile = new Missile(new Dimension(3,3),new Position(5,1),3);
        (new Collision()).detecterCollision(envahisseur,missile);
	}
}