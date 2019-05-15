package fr.unilim.iut.spaceinvaders;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import fr.unilim.iut.spaceinvaders.moteurjeu.DessinJeu;

public class DessinSpaceInvaders implements DessinJeu {
    private SpaceInvaders jeu;

    public DessinSpaceInvaders(SpaceInvaders spaceInvaders) {
        this.jeu = spaceInvaders;
    }

    public void dessiner(BufferedImage image) {
        if (this.jeu.aUnVaisseau() && this.jeu.aUnMissile()){
            Vaisseau vaisseau = this.jeu.recupererVaisseau();
            this.dessinerVaisseau(vaisseau, image);
            Missile missile = this.jeu.recupererMissile();
            this.dessinerMissile(missile, image);
         
        }
    }

    private void dessinerVaisseau(Vaisseau vaisseau, BufferedImage image) {
        Graphics2D crayon = (Graphics2D) image.getGraphics();
        crayon.setColor(Color.blue);
        crayon.fillRect(vaisseau.abscisseLaPlusAGauche(), vaisseau.ordonneeLaPlusBasse(), vaisseau.longueur(), vaisseau.hauteur());
    }
    private void dessinerMissile(Missile missile, BufferedImage image) {
        Graphics2D crayon = (Graphics2D) image.getGraphics();
        crayon.setColor(Color.red);
        crayon.fillRect(missile.abscisseLaPlusAGauche(), missile.ordonneeLaPlusBasse(), missile.longueur(), missile.hauteur());
    }
  
}