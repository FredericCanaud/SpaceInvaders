package fr.unilim.iut.spaceinvaders;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import fr.unilim.iut.spaceinvaders.model.*;

public class CollisionTest {

    Collision collision;

    @Before
    public void initialisation() {
        collision = new Collision();
    }

    @Test
    public void test_EnvahisseurToucheParMissile_DetecterCollision() {

       Envahisseur envahisseur = new Envahisseur(new Dimension(7,2),new Position(5,2),3);
       Missile missile = new Missile(new Dimension(3,2),new Position(10,3),3);
       
       assertEquals(collision.detecterCollision(envahisseur, missile), true);

    }

    @Test
    public void test_PersonnagePasTouche_DetecterCollision() {

       Envahisseur envahisseur = new Envahisseur(new Dimension(1,1),new Position(5,2),3);
       Missile missile = new Missile(new Dimension(1,1),new Position(11,9),3);

       assertEquals(collision.detecterCollision(envahisseur, missile), false);

    }

    @Test
    public void test_PersonnageToucheParMissileAGauche_DetecterCollision() {

       Envahisseur envahisseur = new Envahisseur(new Dimension(2,2),new Position(5,2),3);
       Missile missile = new Missile(new Dimension(1,2),new Position(5,1),3);

       assertEquals(collision.PersonnageToucheAGaucheParMissile(envahisseur, missile),true);

    }
    
    @Test
    public void test_PersonnageToucheParMissileADroite_DetecterCollision() {

       Envahisseur envahisseur = new Envahisseur(new Dimension(2,2),new Position(5,2),3);
       Missile missile = new Missile(new Dimension(1,2),new Position(6,3),3);

       assertEquals(collision.PersonnageToucheAGaucheParMissile(envahisseur, missile),true);

    }
    @Test
    public void test_PersonnageToucheParMissileEnHaut_DetecterCollision() {

       Envahisseur envahisseur = new Envahisseur(new Dimension(2,2),new Position(5,2),3);
       Missile missile = new Missile(new Dimension(1,2),new Position(5,1),3);

       assertEquals(collision.PersonnageToucheAGaucheParMissile(envahisseur, missile),true);

    }
    @Test
    public void test_PersonnageToucheParMissileEnBas_DetecterCollision() {

       Envahisseur envahisseur = new Envahisseur(new Dimension(2,2),new Position(5,2),3);
       Missile missile = new Missile(new Dimension(1,2),new Position(6,3),3);

       assertEquals(collision.PersonnageToucheAGaucheParMissile(envahisseur, missile),true);

    }
}